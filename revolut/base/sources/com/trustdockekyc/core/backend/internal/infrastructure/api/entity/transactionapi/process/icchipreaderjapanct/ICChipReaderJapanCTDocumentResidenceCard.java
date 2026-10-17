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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentResidenceCard;", "", "", "version", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;", "address", "comprehensivePermission", "individualPermission", "", "updateStatus", "<init>", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;Ljava/lang/String;Ljava/lang/String;Z)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentResidenceCard;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTDocumentResidenceCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICChipReaderJapanCTResidenceCardAddress f107447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107448c;
    public final String d;
    public final boolean e;

    public ICChipReaderJapanCTDocumentResidenceCard(@i(name = "version") @NotNull String version, @i(name = "address") ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress, @i(name = "comprehensive_permission") @NotNull String comprehensivePermission, @i(name = "individual_permission") @NotNull String individualPermission, @i(name = "update_status") boolean z) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(comprehensivePermission, "comprehensivePermission");
        Intrinsics.checkNotNullParameter(individualPermission, "individualPermission");
        this.f107446a = version;
        this.f107447b = iCChipReaderJapanCTResidenceCardAddress;
        this.f107448c = comprehensivePermission;
        this.d = individualPermission;
        this.e = z;
    }

    @NotNull
    public final ICChipReaderJapanCTDocumentResidenceCard copy(@i(name = "version") @NotNull String version, @i(name = "address") ICChipReaderJapanCTResidenceCardAddress address, @i(name = "comprehensive_permission") @NotNull String comprehensivePermission, @i(name = "individual_permission") @NotNull String individualPermission, @i(name = "update_status") boolean updateStatus) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(comprehensivePermission, "comprehensivePermission");
        Intrinsics.checkNotNullParameter(individualPermission, "individualPermission");
        return new ICChipReaderJapanCTDocumentResidenceCard(version, address, comprehensivePermission, individualPermission, updateStatus);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTDocumentResidenceCard)) {
            return false;
        }
        ICChipReaderJapanCTDocumentResidenceCard iCChipReaderJapanCTDocumentResidenceCard = (ICChipReaderJapanCTDocumentResidenceCard) obj2;
        return Intrinsics.f(this.f107446a, iCChipReaderJapanCTDocumentResidenceCard.f107446a) && Intrinsics.f(this.f107447b, iCChipReaderJapanCTDocumentResidenceCard.f107447b) && Intrinsics.f(this.f107448c, iCChipReaderJapanCTDocumentResidenceCard.f107448c) && Intrinsics.f(this.d, iCChipReaderJapanCTDocumentResidenceCard.d) && this.e == iCChipReaderJapanCTDocumentResidenceCard.e;
    }

    public final int hashCode() {
        int iHashCode = this.f107446a.hashCode() * 31;
        ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress = this.f107447b;
        return Boolean.hashCode(this.e) + w0.a(this.d, w0.a(this.f107448c, (iHashCode + (iCChipReaderJapanCTResidenceCardAddress == null ? 0 : iCChipReaderJapanCTResidenceCardAddress.hashCode())) * 31));
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTDocumentResidenceCard(version=");
        sb6.append(this.f107446a);
        sb6.append(", address=");
        sb6.append(this.f107447b);
        sb6.append(", comprehensivePermission=");
        sb6.append(this.f107448c);
        sb6.append(", individualPermission=");
        sb6.append(this.d);
        sb6.append(", updateStatus=");
        return a.x(sb6, this.e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ ICChipReaderJapanCTDocumentResidenceCard(String str, ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : iCChipReaderJapanCTResidenceCardAddress, str2, str3, z);
    }
}
