package com.hcaptcha.sdk;

import androidx.annotation.NonNull;
import d9.x0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public enum HCaptchaSize implements Serializable {
    INVISIBLE("invisible"),
    NORMAL("normal"),
    COMPACT("compact");

    private final String size;

    HCaptchaSize(String str) {
        this.size = str;
    }

    @Override // java.lang.Enum
    @NonNull
    @x0
    public String toString() {
        return this.size;
    }
}
