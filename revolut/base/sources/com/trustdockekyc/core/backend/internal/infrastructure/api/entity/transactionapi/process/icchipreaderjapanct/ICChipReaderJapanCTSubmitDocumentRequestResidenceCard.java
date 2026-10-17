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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJX\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestResidenceCard;", "", "", "version", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;", "address", "comprehensivePermission", "individualPermission", "", "updateStatus", "photo", "front", "<init>", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestResidenceCard;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTSubmitDocumentRequestResidenceCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICChipReaderJapanCTResidenceCardAddress f107491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107492c;
    public final String d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f107493g;

    public ICChipReaderJapanCTSubmitDocumentRequestResidenceCard(@i(name = "version") @NotNull String version, @i(name = "address") ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress, @i(name = "comprehensive_permission") @NotNull String comprehensivePermission, @i(name = "individual_permission") @NotNull String individualPermission, @i(name = "update_status") boolean z, @i(name = "photo") @NotNull String photo, @i(name = "front") @NotNull String front) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(comprehensivePermission, "comprehensivePermission");
        Intrinsics.checkNotNullParameter(individualPermission, "individualPermission");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(front, "front");
        this.f107490a = version;
        this.f107491b = iCChipReaderJapanCTResidenceCardAddress;
        this.f107492c = comprehensivePermission;
        this.d = individualPermission;
        this.e = z;
        this.f = photo;
        this.f107493g = front;
    }

    @NotNull
    public final ICChipReaderJapanCTSubmitDocumentRequestResidenceCard copy(@i(name = "version") @NotNull String version, @i(name = "address") ICChipReaderJapanCTResidenceCardAddress address, @i(name = "comprehensive_permission") @NotNull String comprehensivePermission, @i(name = "individual_permission") @NotNull String individualPermission, @i(name = "update_status") boolean updateStatus, @i(name = "photo") @NotNull String photo, @i(name = "front") @NotNull String front) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(comprehensivePermission, "comprehensivePermission");
        Intrinsics.checkNotNullParameter(individualPermission, "individualPermission");
        Intrinsics.checkNotNullParameter(photo, "photo");
        Intrinsics.checkNotNullParameter(front, "front");
        return new ICChipReaderJapanCTSubmitDocumentRequestResidenceCard(version, address, comprehensivePermission, individualPermission, updateStatus, photo, front);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTSubmitDocumentRequestResidenceCard)) {
            return false;
        }
        ICChipReaderJapanCTSubmitDocumentRequestResidenceCard iCChipReaderJapanCTSubmitDocumentRequestResidenceCard = (ICChipReaderJapanCTSubmitDocumentRequestResidenceCard) obj2;
        return Intrinsics.f(this.f107490a, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.f107490a) && Intrinsics.f(this.f107491b, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.f107491b) && Intrinsics.f(this.f107492c, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.f107492c) && Intrinsics.f(this.d, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.d) && this.e == iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.e && Intrinsics.f(this.f, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.f) && Intrinsics.f(this.f107493g, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.f107493g);
    }

    public final int hashCode() {
        int iHashCode = this.f107490a.hashCode() * 31;
        ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress = this.f107491b;
        return this.f107493g.hashCode() + w0.a(this.f, a.c(w0.a(this.d, w0.a(this.f107492c, (iHashCode + (iCChipReaderJapanCTResidenceCardAddress == null ? 0 : iCChipReaderJapanCTResidenceCardAddress.hashCode())) * 31)), 31, this.e));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTSubmitDocumentRequestResidenceCard(version=");
        sb6.append(this.f107490a);
        sb6.append(", address=");
        sb6.append(this.f107491b);
        sb6.append(", comprehensivePermission=");
        sb6.append(this.f107492c);
        sb6.append(", individualPermission=");
        sb6.append(this.d);
        sb6.append(", updateStatus=");
        sb6.append(this.e);
        sb6.append(", photo=");
        sb6.append(this.f);
        sb6.append(", front=");
        return a.u(sb6, this.f107493g, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ ICChipReaderJapanCTSubmitDocumentRequestResidenceCard(String str, ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress, String str2, String str3, boolean z, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : iCChipReaderJapanCTResidenceCardAddress, str2, str3, z, str4, str5);
    }
}
