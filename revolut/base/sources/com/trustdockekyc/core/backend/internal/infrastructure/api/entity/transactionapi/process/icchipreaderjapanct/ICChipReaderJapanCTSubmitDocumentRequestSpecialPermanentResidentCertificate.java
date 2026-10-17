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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate;", "", "", "version", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;", "address", "photo", "front", "<init>", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;Ljava/lang/String;Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICChipReaderJapanCTResidenceCardAddress f107495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107496c;
    public final String d;

    public ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate(@i(name = "version") @NotNull String version, @i(name = "address") ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress, @i(name = "photo") @NotNull String photo, @i(name = "front") @NotNull String front) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(front, "front");
        this.f107494a = version;
        this.f107495b = iCChipReaderJapanCTResidenceCardAddress;
        this.f107496c = photo;
        this.d = front;
    }

    @NotNull
    public final ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate copy(@i(name = "version") @NotNull String version, @i(name = "address") ICChipReaderJapanCTResidenceCardAddress address, @i(name = "photo") @NotNull String photo, @i(name = "front") @NotNull String front) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(front, "front");
        return new ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate(version, address, photo, front);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate)) {
            return false;
        }
        ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate = (ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate) obj2;
        return Intrinsics.f(this.f107494a, iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate.f107494a) && Intrinsics.f(this.f107495b, iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate.f107495b) && Intrinsics.f(this.f107496c, iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate.f107496c) && Intrinsics.f(this.d, iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate.d);
    }

    public final int hashCode() {
        int iHashCode = this.f107494a.hashCode() * 31;
        ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress = this.f107495b;
        return this.d.hashCode() + w0.a(this.f107496c, (iHashCode + (iCChipReaderJapanCTResidenceCardAddress == null ? 0 : iCChipReaderJapanCTResidenceCardAddress.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate(version=");
        sb6.append(this.f107494a);
        sb6.append(", address=");
        sb6.append(this.f107495b);
        sb6.append(", photo=");
        sb6.append(this.f107496c);
        sb6.append(", front=");
        return a.u(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate(String str, ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : iCChipReaderJapanCTResidenceCardAddress, str2, str3);
    }
}
