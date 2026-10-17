package com.revolut.core.security.exception;

import hn0.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v0.a;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/security/exception/CertificateException;", "Lcom/revolut/core/security/exception/SecurityException;", "CertificateAbsent", "CertificateFailure", "CertificateInvalidated", "Lcom/revolut/core/security/exception/CertificateException$CertificateAbsent;", "Lcom/revolut/core/security/exception/CertificateException$CertificateFailure;", "Lcom/revolut/core/security/exception/CertificateException$CertificateInvalidated;", "core_security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CertificateException extends SecurityException {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/security/exception/CertificateException$CertificateAbsent;", "Lcom/revolut/core/security/exception/CertificateException;", "core_security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CertificateAbsent extends CertificateException {
        /* JADX WARN: Illegal instructions before constructor call */
        public CertificateAbsent(k alias, List allAliases, boolean z) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(allAliases, "allAliases");
            StringBuilder sbM = a.m("Certificate ", alias.c(), " is absent for ", z ? "encryption" : "decryption", ". Available: ");
            sbM.append(allAliases);
            super(sbM.toString(), null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/security/exception/CertificateException$CertificateFailure;", "Lcom/revolut/core/security/exception/CertificateException;", "core_security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CertificateFailure extends CertificateException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CertificateFailure(k alias, Throwable cause) {
            super(j6.a.q("Unexpected error with ", alias.c()), cause);
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(cause, "cause");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/security/exception/CertificateException$CertificateInvalidated;", "Lcom/revolut/core/security/exception/CertificateException;", "core_security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CertificateInvalidated extends CertificateException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CertificateInvalidated(k alias) {
            super(p.a.p("Certificate ", alias.c(), " was invalidated"), null);
            Intrinsics.checkNotNullParameter(alias, "alias");
        }
    }
}
