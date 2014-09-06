package com.minhazulhaque.probhatkeyboard;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.inputmethodservice.Keyboard.Key;
import android.util.AttributeSet;

public class ProbhatKeyboardView extends KeyboardView {
	
  static final int KEYCODE_OPTIONS = -100;

  public ProbhatKeyboardView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public ProbhatKeyboardView(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  @Override
  protected boolean onLongPress(Key key) {
    if (key.codes[0] == Keyboard.KEYCODE_CANCEL) {
      getOnKeyboardActionListener().onKey(KEYCODE_OPTIONS, null);
      return true;
    } else {
      return super.onLongPress(key);
    }
  }
}
