package com.revolut.core.security.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/security/exception/SecurityException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "core_security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class SecurityException extends RuntimeException {
    public SecurityException() {
        this(3);
    }

    public SecurityException(int i) {
        super((i & 1) != 0 ? null : "Biometric key is invalid", null);
    }
}
