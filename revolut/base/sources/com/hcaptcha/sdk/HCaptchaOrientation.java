package com.hcaptcha.sdk;

import androidx.annotation.NonNull;
import d9.x0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public enum HCaptchaOrientation implements Serializable {
    PORTRAIT("portrait"),
    LANDSCAPE("landscape");

    private final String orientation;

    HCaptchaOrientation(String str) {
        this.orientation = str;
    }

    @Override // java.lang.Enum
    @NonNull
    @x0
    public String toString() {
        return this.orientation;
    }
}
