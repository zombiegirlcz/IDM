package io.reactivex.exceptions;

import v1.c;

/* JADX INFO: loaded from: classes22.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    public OnErrorNotImplementedException(Throwable th10) {
        super(c.u("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ", th10), th10 == null ? new NullPointerException() : th10);
    }
}
