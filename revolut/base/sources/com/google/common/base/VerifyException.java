package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes16.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public class VerifyException extends RuntimeException {
    public VerifyException() {
    }

    public VerifyException(String str) {
        super(str);
    }

    public VerifyException(Throwable th10) {
        super(th10);
    }

    public VerifyException(String str, Throwable th10) {
        super(str, th10);
    }
}
