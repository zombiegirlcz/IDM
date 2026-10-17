package io.reactivex.exceptions;

import v1.c;

/* JADX INFO: loaded from: classes22.dex */
public final class UndeliverableException extends IllegalStateException {
    public UndeliverableException(Throwable th10) {
        super(c.u("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ", th10), th10);
    }
}
