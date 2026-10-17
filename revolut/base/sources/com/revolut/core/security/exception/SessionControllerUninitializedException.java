package com.revolut.core.security.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/security/exception/SessionControllerUninitializedException;", "Lcom/revolut/core/security/exception/SecurityException;", "core_security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SessionControllerUninitializedException extends SecurityException {
    public SessionControllerUninitializedException() {
        this(0);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    public SessionControllerUninitializedException(int i) {
        super("SessionController is not initialised", null);
    }
}
