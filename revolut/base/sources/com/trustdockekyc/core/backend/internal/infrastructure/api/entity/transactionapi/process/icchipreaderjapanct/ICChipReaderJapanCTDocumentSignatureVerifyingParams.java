package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSignatureVerifyingParams;", "", "", "signature", "verifyingParams", "hash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSignatureVerifyingParams;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTDocumentSignatureVerifyingParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107451c;

    public ICChipReaderJapanCTDocumentSignatureVerifyingParams(@i(name = "signature") @NotNull String signature, @i(name = "verifying_params") @NotNull String verifyingParams, @i(name = "hash") String str) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(verifyingParams, "verifyingParams");
        this.f107449a = signature;
        this.f107450b = verifyingParams;
        this.f107451c = str;
    }

    @NotNull
    public final ICChipReaderJapanCTDocumentSignatureVerifyingParams copy(@i(name = "signature") @NotNull String signature, @i(name = "verifying_params") @NotNull String verifyingParams, @i(name = "hash") String hash) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(verifyingParams, "verifyingParams");
        return new ICChipReaderJapanCTDocumentSignatureVerifyingParams(signature, verifyingParams, hash);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTDocumentSignatureVerifyingParams)) {
            return false;
        }
        ICChipReaderJapanCTDocumentSignatureVerifyingParams iCChipReaderJapanCTDocumentSignatureVerifyingParams = (ICChipReaderJapanCTDocumentSignatureVerifyingParams) obj2;
        return Intrinsics.f(this.f107449a, iCChipReaderJapanCTDocumentSignatureVerifyingParams.f107449a) && Intrinsics.f(this.f107450b, iCChipReaderJapanCTDocumentSignatureVerifyingParams.f107450b) && Intrinsics.f(this.f107451c, iCChipReaderJapanCTDocumentSignatureVerifyingParams.f107451c);
    }

    public final int hashCode() {
        int iA = w0.a(this.f107450b, this.f107449a.hashCode() * 31);
        String str = this.f107451c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTDocumentSignatureVerifyingParams(signature=");
        sb6.append(this.f107449a);
        sb6.append(", verifyingParams=");
        sb6.append(this.f107450b);
        sb6.append(", hash=");
        return a.u(sb6, this.f107451c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ ICChipReaderJapanCTDocumentSignatureVerifyingParams(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
