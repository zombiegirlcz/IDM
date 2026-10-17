package r95;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u0011\u0010\u001dR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010!\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0005\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004¨\u0006$"}, d2 = {"Lr95/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "facilityId", "", "b", "Z", "l", "()Z", "isUserSalaried", "i", "isLimitOverWarningThreshold", "d", "h", "isLimitExceeded", "e", "j", "isRestricted", "f", "k", "isTerminated", "Ljo3/a;", "g", "Ljo3/a;", "()Ljo3/a;", "spentAmount", "limitAmount", "apr", "accruedChargesAmount", "nextInterestChargeDate", "overdraftTimeLimitDueDate", "feature_credit_overdraft_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("facilityId")
    @NotNull
    private final String facilityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("isUserSalaried")
    private final boolean isUserSalaried;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("isLimitOverWarningThreshold")
    private final boolean isLimitOverWarningThreshold;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("isLimitExceeded")
    private final boolean isLimitExceeded;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("isRestricted")
    private final boolean isRestricted;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("isTerminated")
    private final boolean isTerminated;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("spentAmount")
    @NotNull
    private final jo3.a spentAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("limitAmount")
    @NotNull
    private final jo3.a limitAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("apr")
    @NotNull
    private final String apr;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("accruedChargesAmount")
    @NotNull
    private final jo3.a accruedChargesAmount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("nextInterestChargeDate")
    private final String nextInterestChargeDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("overdraftTimeLimitDueDate")
    private final String overdraftTimeLimitDueDate;

    public a(String facilityId, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, jo3.a spentAmount, jo3.a limitAmount, String apr, jo3.a accruedChargesAmount, String str, String str2) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(spentAmount, "spentAmount");
        Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
        Intrinsics.checkNotNullParameter(apr, "apr");
        Intrinsics.checkNotNullParameter(accruedChargesAmount, "accruedChargesAmount");
        this.facilityId = facilityId;
        this.isUserSalaried = z;
        this.isLimitOverWarningThreshold = z3;
        this.isLimitExceeded = z4;
        this.isRestricted = z6;
        this.isTerminated = z11;
        this.spentAmount = spentAmount;
        this.limitAmount = limitAmount;
        this.apr = apr;
        this.accruedChargesAmount = accruedChargesAmount;
        this.nextInterestChargeDate = str;
        this.overdraftTimeLimitDueDate = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAccruedChargesAmount() {
        return this.accruedChargesAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getLimitAmount() {
        return this.limitAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNextInterestChargeDate() {
        return this.nextInterestChargeDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.facilityId, aVar.facilityId) && this.isUserSalaried == aVar.isUserSalaried && this.isLimitOverWarningThreshold == aVar.isLimitOverWarningThreshold && this.isLimitExceeded == aVar.isLimitExceeded && this.isRestricted == aVar.isRestricted && this.isTerminated == aVar.isTerminated && Intrinsics.f(this.spentAmount, aVar.spentAmount) && Intrinsics.f(this.limitAmount, aVar.limitAmount) && Intrinsics.f(this.apr, aVar.apr) && Intrinsics.f(this.accruedChargesAmount, aVar.accruedChargesAmount) && Intrinsics.f(this.nextInterestChargeDate, aVar.nextInterestChargeDate) && Intrinsics.f(this.overdraftTimeLimitDueDate, aVar.overdraftTimeLimitDueDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOverdraftTimeLimitDueDate() {
        return this.overdraftTimeLimitDueDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getSpentAmount() {
        return this.spentAmount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsLimitExceeded() {
        return this.isLimitExceeded;
    }

    public final int hashCode() {
        int iJ = v7.j(this.accruedChargesAmount, p.a.c(v7.j(this.limitAmount, v7.j(this.spentAmount, j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(this.facilityId.hashCode() * 31, 31, this.isUserSalaried), 31, this.isLimitOverWarningThreshold), 31, this.isLimitExceeded), 31, this.isRestricted), 31, this.isTerminated), 31), 31), 31, this.apr), 31);
        String str = this.nextInterestChargeDate;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.overdraftTimeLimitDueDate;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsLimitOverWarningThreshold() {
        return this.isLimitOverWarningThreshold;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsRestricted() {
        return this.isRestricted;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsTerminated() {
        return this.isTerminated;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsUserSalaried() {
        return this.isUserSalaried;
    }
}
