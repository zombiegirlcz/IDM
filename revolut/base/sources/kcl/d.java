package kcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkcl/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "kycStatus", "b", "driveWealthAccountNumber", "d", "stockLendingState", "", "Z", "()Z", "extendedHoursOptInPassed", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("kycStatus")
    private final String kycStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("driveWealthAccountNumber")
    private final String driveWealthAccountNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("stockLendingState")
    private final String stockLendingState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("extendedHoursEnabled")
    private final boolean extendedHoursOptInPassed;

    public d(String str, String str2, String str3, boolean z) {
        this.kycStatus = str;
        this.driveWealthAccountNumber = str2;
        this.stockLendingState = str3;
        this.extendedHoursOptInPassed = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDriveWealthAccountNumber() {
        return this.driveWealthAccountNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getExtendedHoursOptInPassed() {
        return this.extendedHoursOptInPassed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getKycStatus() {
        return this.kycStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStockLendingState() {
        return this.stockLendingState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.kycStatus, dVar.kycStatus) && Intrinsics.f(this.driveWealthAccountNumber, dVar.driveWealthAccountNumber) && Intrinsics.f(this.stockLendingState, dVar.stockLendingState) && this.extendedHoursOptInPassed == dVar.extendedHoursOptInPassed;
    }

    public final int hashCode() {
        String str = this.kycStatus;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.driveWealthAccountNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stockLendingState;
        return Boolean.hashCode(this.extendedHoursOptInPassed) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
