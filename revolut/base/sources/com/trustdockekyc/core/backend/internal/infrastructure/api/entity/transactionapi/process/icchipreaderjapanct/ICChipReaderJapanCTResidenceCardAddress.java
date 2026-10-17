package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;", "", "", "address", "code", "date", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTResidenceCardAddress {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107481c;

    public ICChipReaderJapanCTResidenceCardAddress(@i(name = "address") String str, @i(name = "code") String str2, @i(name = "date") String str3) {
        this.f107479a = str;
        this.f107480b = str2;
        this.f107481c = str3;
    }

    @NotNull
    public final ICChipReaderJapanCTResidenceCardAddress copy(@i(name = "address") String address, @i(name = "code") String code, @i(name = "date") String date) {
        return new ICChipReaderJapanCTResidenceCardAddress(address, code, date);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTResidenceCardAddress)) {
            return false;
        }
        ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress = (ICChipReaderJapanCTResidenceCardAddress) obj2;
        return Intrinsics.f(this.f107479a, iCChipReaderJapanCTResidenceCardAddress.f107479a) && Intrinsics.f(this.f107480b, iCChipReaderJapanCTResidenceCardAddress.f107480b) && Intrinsics.f(this.f107481c, iCChipReaderJapanCTResidenceCardAddress.f107481c);
    }

    public final int hashCode() {
        String str = this.f107479a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f107480b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f107481c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTResidenceCardAddress(address=");
        sb6.append(this.f107479a);
        sb6.append(", code=");
        sb6.append(this.f107480b);
        sb6.append(", date=");
        return a.u(sb6, this.f107481c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ ICChipReaderJapanCTResidenceCardAddress(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
