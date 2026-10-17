package com.revolut.core.error.data.model;

import com.revolut.core.security.exception.CertificateException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/error/data/model/UnrecoverableStateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core_error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnrecoverableStateException extends Exception {
    public UnrecoverableStateException() {
        super(null, null);
    }

    public UnrecoverableStateException(CertificateException.CertificateAbsent certificateAbsent) {
        super(null, certificateAbsent);
    }
}
