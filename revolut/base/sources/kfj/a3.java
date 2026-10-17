package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001e"}, d2 = {"Lkfj/a3;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "mobilePlanType", "b", "coverageCountry", "c", "e", "primaryPhoneNumber", "", "Z", "g", "()Z", "scheduledForTerminationDueToMigration", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "directInstallIsStateIndependent", "f", "carrierPrivilegesMissing", "Lkfj/q0;", "Lkfj/q0;", "()Lkfj/q0;", "provider", "h", "simProfileIssuer", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mobilePlanType")
    @NotNull
    private final String mobilePlanType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("coverageCountry")
    private final String coverageCountry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryPhoneNumber")
    private final String primaryPhoneNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("scheduledForTerminationDueToMigration")
    private final boolean scheduledForTerminationDueToMigration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("directInstallIsStateIndependent")
    private final Boolean directInstallIsStateIndependent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("carrierPrivilegesMissing")
    private final Boolean carrierPrivilegesMissing;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("provider")
    private final q0 provider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("simProfileIssuer")
    private final String simProfileIssuer;

    public a3(String mobilePlanType, String str, String str2, boolean z, Boolean bool, Boolean bool2, q0 q0Var, String str3) {
        Intrinsics.checkNotNullParameter(mobilePlanType, "mobilePlanType");
        this.mobilePlanType = mobilePlanType;
        this.coverageCountry = str;
        this.primaryPhoneNumber = str2;
        this.scheduledForTerminationDueToMigration = z;
        this.directInstallIsStateIndependent = bool;
        this.carrierPrivilegesMissing = bool2;
        this.provider = q0Var;
        this.simProfileIssuer = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getCarrierPrivilegesMissing() {
        return this.carrierPrivilegesMissing;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCoverageCountry() {
        return this.coverageCountry;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getDirectInstallIsStateIndependent() {
        return this.directInstallIsStateIndependent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMobilePlanType() {
        return this.mobilePlanType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPrimaryPhoneNumber() {
        return this.primaryPhoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj2;
        return Intrinsics.f(this.mobilePlanType, a3Var.mobilePlanType) && Intrinsics.f(this.coverageCountry, a3Var.coverageCountry) && Intrinsics.f(this.primaryPhoneNumber, a3Var.primaryPhoneNumber) && this.scheduledForTerminationDueToMigration == a3Var.scheduledForTerminationDueToMigration && Intrinsics.f(this.directInstallIsStateIndependent, a3Var.directInstallIsStateIndependent) && Intrinsics.f(this.carrierPrivilegesMissing, a3Var.carrierPrivilegesMissing) && Intrinsics.f(this.provider, a3Var.provider) && Intrinsics.f(this.simProfileIssuer, a3Var.simProfileIssuer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final q0 getProvider() {
        return this.provider;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getScheduledForTerminationDueToMigration() {
        return this.scheduledForTerminationDueToMigration;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSimProfileIssuer() {
        return this.simProfileIssuer;
    }

    public final int hashCode() {
        int iHashCode = this.mobilePlanType.hashCode() * 31;
        String str = this.coverageCountry;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.primaryPhoneNumber;
        int iC = j6.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.scheduledForTerminationDueToMigration);
        Boolean bool = this.directInstallIsStateIndependent;
        int iHashCode3 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.carrierPrivilegesMissing;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        q0 q0Var = this.provider;
        int iHashCode5 = (iHashCode4 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        String str3 = this.simProfileIssuer;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }
}
