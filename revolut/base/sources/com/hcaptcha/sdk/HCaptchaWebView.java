package com.hcaptcha.sdk;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes17.dex */
public class HCaptchaWebView extends WebView {
    public HCaptchaWebView(@NonNull Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onCheckIsTextEditor() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return super.onCheckIsTextEditor();
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        return false;
    }

    public HCaptchaWebView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HCaptchaWebView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
