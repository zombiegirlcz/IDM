package com.hcaptcha.sdk;

import a0.d;
import androidx.annotation.NonNull;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public enum HCaptchaError implements Serializable {
    NETWORK_ERROR(7, "No internet connection"),
    INVALID_DATA(8, "Invalid data is not accepted by endpoints"),
    CHALLENGE_ERROR(9, "Challenge encountered error on setup"),
    INTERNAL_ERROR(10, "hCaptcha client encountered an internal error"),
    SESSION_TIMEOUT(15, "Session Timeout"),
    TOKEN_TIMEOUT(16, "Token Timeout"),
    CHALLENGE_CLOSED(30, "Challenge Closed"),
    RATE_LIMITED(31, "Rate Limited"),
    INVALID_CUSTOM_THEME(32, "Invalid custom theme"),
    INSECURE_HTTP_REQUEST_ERROR(33, "Insecure resource requested"),
    ERROR(29, "Unknown error");

    private final int errorId;
    private final String message;

    HCaptchaError(int i, String str) {
        this.errorId = i;
        this.message = str;
    }

    @NonNull
    public static HCaptchaError fromId(int i) {
        for (HCaptchaError hCaptchaError : values()) {
            if (hCaptchaError.errorId == i) {
                return hCaptchaError;
            }
        }
        throw new RuntimeException(d.n("Unsupported error id: ", i));
    }

    public int getErrorId() {
        return this.errorId;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.message;
    }
}
