package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public class UncheckedExecutionException extends RuntimeException {
    private static final long serialVersionUID = 0;

    @Deprecated
    public UncheckedExecutionException() {
    }

    @Deprecated
    public UncheckedExecutionException(String str) {
        super(str);
    }

    public UncheckedExecutionException(String str, Throwable th10) {
        super(str, th10);
    }

    public UncheckedExecutionException(Throwable th10) {
        super(th10);
    }
}
