package com.hcaptcha.sdk;

import androidx.annotation.NonNull;
import d9.x0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public enum HCaptchaTheme implements Serializable {
    DARK("dark"),
    LIGHT("light"),
    CONTRAST("contrast");

    private final String theme;

    HCaptchaTheme(String str) {
        this.theme = str;
    }

    @Override // java.lang.Enum
    @NonNull
    @x0
    public String toString() {
        return this.theme;
    }
}
