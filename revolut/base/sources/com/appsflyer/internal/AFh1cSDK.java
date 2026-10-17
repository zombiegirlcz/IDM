package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public enum AFh1cSDK {
    SUCCESS,
    FAILURE,
    NA,
    INTERNAL_ERROR;

    @Override // java.lang.Enum
    @NonNull
    public final String toString() {
        return super.toString().toLowerCase(Locale.getDefault());
    }
}
