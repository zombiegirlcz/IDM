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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseVehicleCategory;", "", "", "name", "issueDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseVehicleCategory;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTDriversLicenseVehicleCategory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107478b;

    public ICChipReaderJapanCTDriversLicenseVehicleCategory(@i(name = "name") @NotNull String name, @i(name = "issue_date") String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f107477a = name;
        this.f107478b = str;
    }

    @NotNull
    public final ICChipReaderJapanCTDriversLicenseVehicleCategory copy(@i(name = "name") @NotNull String name, @i(name = "issue_date") String issueDate) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ICChipReaderJapanCTDriversLicenseVehicleCategory(name, issueDate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTDriversLicenseVehicleCategory)) {
            return false;
        }
        ICChipReaderJapanCTDriversLicenseVehicleCategory iCChipReaderJapanCTDriversLicenseVehicleCategory = (ICChipReaderJapanCTDriversLicenseVehicleCategory) obj2;
        return Intrinsics.f(this.f107477a, iCChipReaderJapanCTDriversLicenseVehicleCategory.f107477a) && Intrinsics.f(this.f107478b, iCChipReaderJapanCTDriversLicenseVehicleCategory.f107478b);
    }

    public final int hashCode() {
        int iHashCode = this.f107477a.hashCode() * 31;
        String str = this.f107478b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTDriversLicenseVehicleCategory(name=");
        sb6.append(this.f107477a);
        sb6.append(", issueDate=");
        return a.u(sb6, this.f107478b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ ICChipReaderJapanCTDriversLicenseVehicleCategory(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
