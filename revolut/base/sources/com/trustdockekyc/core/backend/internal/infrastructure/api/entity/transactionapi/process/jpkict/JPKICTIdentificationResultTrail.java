package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import ch.qos.logback.core.CoreConstants;
import ip0.v7;
import java.time.LocalDateTime;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultTrail;", "", "", "signatureId", "issuerDn", "Ljava/time/LocalDateTime;", "notBefore", "notAfter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultTrail;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class JPKICTIdentificationResultTrail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f107522c;
    public final LocalDateTime d;

    public JPKICTIdentificationResultTrail(@i(name = "signature_id") @NotNull String signatureId, @i(name = "issuer_dn") @NotNull String issuerDn, @i(name = "not_before") @NotNull LocalDateTime notBefore, @i(name = "not_after") @NotNull LocalDateTime notAfter) {
        Intrinsics.checkNotNullParameter(signatureId, "signatureId");
        Intrinsics.checkNotNullParameter(issuerDn, "issuerDn");
        Intrinsics.checkNotNullParameter(notBefore, "notBefore");
        Intrinsics.checkNotNullParameter(notAfter, "notAfter");
        this.f107520a = signatureId;
        this.f107521b = issuerDn;
        this.f107522c = notBefore;
        this.d = notAfter;
    }

    @NotNull
    public final JPKICTIdentificationResultTrail copy(@i(name = "signature_id") @NotNull String signatureId, @i(name = "issuer_dn") @NotNull String issuerDn, @i(name = "not_before") @NotNull LocalDateTime notBefore, @i(name = "not_after") @NotNull LocalDateTime notAfter) {
        Intrinsics.checkNotNullParameter(signatureId, "signatureId");
        Intrinsics.checkNotNullParameter(issuerDn, "issuerDn");
        Intrinsics.checkNotNullParameter(notBefore, "notBefore");
        Intrinsics.checkNotNullParameter(notAfter, "notAfter");
        return new JPKICTIdentificationResultTrail(signatureId, issuerDn, notBefore, notAfter);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JPKICTIdentificationResultTrail)) {
            return false;
        }
        JPKICTIdentificationResultTrail jPKICTIdentificationResultTrail = (JPKICTIdentificationResultTrail) obj2;
        return Intrinsics.f(this.f107520a, jPKICTIdentificationResultTrail.f107520a) && Intrinsics.f(this.f107521b, jPKICTIdentificationResultTrail.f107521b) && Intrinsics.f(this.f107522c, jPKICTIdentificationResultTrail.f107522c) && Intrinsics.f(this.d, jPKICTIdentificationResultTrail.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.i(this.f107522c, w0.a(this.f107521b, this.f107520a.hashCode() * 31), 31);
    }

    public final String toString() {
        return "JPKICTIdentificationResultTrail(signatureId=" + this.f107520a + ", issuerDn=" + this.f107521b + ", notBefore=" + this.f107522c + ", notAfter=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
