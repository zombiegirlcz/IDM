package du6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0013"}, d2 = {"Ldu6/k;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "d", "()J", "nextPayoutPlanAmount", "b", "Ljava/lang/String;", "e", "nextPayoutPlanCurrency", "c", "nextPayoutBoosterAmount", "nextPayoutBoosterCurrency", "dueDate", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextPayoutPlanAmount")
    private final long nextPayoutPlanAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextPayoutPlanCurrency")
    @NotNull
    private final String nextPayoutPlanCurrency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextPayoutBoosterAmount")
    private final long nextPayoutBoosterAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("nextPayoutBoosterCurrency")
    @NotNull
    private final String nextPayoutBoosterCurrency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("dueDate")
    @NotNull
    private final String dueDate;

    public k(long j2, String nextPayoutPlanCurrency, String nextPayoutBoosterCurrency, long j3, String dueDate) {
        Intrinsics.checkNotNullParameter(nextPayoutPlanCurrency, "nextPayoutPlanCurrency");
        Intrinsics.checkNotNullParameter(nextPayoutBoosterCurrency, "nextPayoutBoosterCurrency");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        this.nextPayoutPlanAmount = j2;
        this.nextPayoutPlanCurrency = nextPayoutPlanCurrency;
        this.nextPayoutBoosterAmount = j3;
        this.nextPayoutBoosterCurrency = nextPayoutBoosterCurrency;
        this.dueDate = dueDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getNextPayoutBoosterAmount() {
        return this.nextPayoutBoosterAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNextPayoutBoosterCurrency() {
        return this.nextPayoutBoosterCurrency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getNextPayoutPlanAmount() {
        return this.nextPayoutPlanAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNextPayoutPlanCurrency() {
        return this.nextPayoutPlanCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.nextPayoutPlanAmount == kVar.nextPayoutPlanAmount && Intrinsics.f(this.nextPayoutPlanCurrency, kVar.nextPayoutPlanCurrency) && this.nextPayoutBoosterAmount == kVar.nextPayoutBoosterAmount && Intrinsics.f(this.nextPayoutBoosterCurrency, kVar.nextPayoutBoosterCurrency) && Intrinsics.f(this.dueDate, kVar.dueDate);
    }

    public final int hashCode() {
        return this.dueDate.hashCode() + p.a.c(a0.d.c(p.a.c(Long.hashCode(this.nextPayoutPlanAmount) * 31, 31, this.nextPayoutPlanCurrency), 31, this.nextPayoutBoosterAmount), 31, this.nextPayoutBoosterCurrency);
    }
}
