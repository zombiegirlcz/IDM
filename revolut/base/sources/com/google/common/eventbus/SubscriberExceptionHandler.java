package com.google.common.eventbus;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
public interface SubscriberExceptionHandler {
    void handleException(Throwable th10, SubscriberExceptionContext subscriberExceptionContext);
}
