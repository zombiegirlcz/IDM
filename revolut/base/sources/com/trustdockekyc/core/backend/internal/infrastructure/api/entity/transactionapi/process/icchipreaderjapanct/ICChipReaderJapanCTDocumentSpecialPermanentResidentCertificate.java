package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate;", "", "", "version", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;", "address", "<init>", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;)V", "copy", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICChipReaderJapanCTResidenceCardAddress f107453b;

    public ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate(@i(name = "version") @NotNull String version, @i(name = "address") ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.f107452a = version;
        this.f107453b = iCChipReaderJapanCTResidenceCardAddress;
    }

    @NotNull
    public final ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate copy(@i(name = "version") @NotNull String version, @i(name = "address") ICChipReaderJapanCTResidenceCardAddress address) {
        Intrinsics.checkNotNullParameter(version, "version");
        return new ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate(version, address);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate)) {
            return false;
        }
        ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate = (ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate) obj2;
        return Intrinsics.f(this.f107452a, iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate.f107452a) && Intrinsics.f(this.f107453b, iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate.f107453b);
    }

    public final int hashCode() {
        int iHashCode = this.f107452a.hashCode() * 31;
        ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress = this.f107453b;
        return iHashCode + (iCChipReaderJapanCTResidenceCardAddress == null ? 0 : iCChipReaderJapanCTResidenceCardAddress.hashCode());
    }

    public final String toString() {
        return "ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate(version=" + this.f107452a + ", address=" + this.f107453b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate(String str, ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : iCChipReaderJapanCTResidenceCardAddress);
    }
}
