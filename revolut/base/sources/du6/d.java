package du6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0011"}, d2 = {"Ldu6/d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "c", "()J", "collectedPlanAmount", "b", "Ljava/lang/String;", "d", "collectedPlanCurrency", "collectedBoosterAmount", "collectedBoosterCurrency", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("collectedPlanAmount")
    private final long collectedPlanAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("collectedPlanCurrency")
    @NotNull
    private final String collectedPlanCurrency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("collectedBoosterAmount")
    private final long collectedBoosterAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("collectedBoosterCurrency")
    @NotNull
    private final String collectedBoosterCurrency;

    public d(String collectedPlanCurrency, String collectedBoosterCurrency, long j2, long j3) {
        Intrinsics.checkNotNullParameter(collectedPlanCurrency, "collectedPlanCurrency");
        Intrinsics.checkNotNullParameter(collectedBoosterCurrency, "collectedBoosterCurrency");
        this.collectedPlanAmount = j2;
        this.collectedPlanCurrency = collectedPlanCurrency;
        this.collectedBoosterAmount = j3;
        this.collectedBoosterCurrency = collectedBoosterCurrency;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCollectedBoosterAmount() {
        return this.collectedBoosterAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCollectedBoosterCurrency() {
        return this.collectedBoosterCurrency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCollectedPlanAmount() {
        return this.collectedPlanAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCollectedPlanCurrency() {
        return this.collectedPlanCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.collectedPlanAmount == dVar.collectedPlanAmount && Intrinsics.f(this.collectedPlanCurrency, dVar.collectedPlanCurrency) && this.collectedBoosterAmount == dVar.collectedBoosterAmount && Intrinsics.f(this.collectedBoosterCurrency, dVar.collectedBoosterCurrency);
    }

    public final int hashCode() {
        return this.collectedBoosterCurrency.hashCode() + a0.d.c(p.a.c(Long.hashCode(this.collectedPlanAmount) * 31, 31, this.collectedPlanCurrency), 31, this.collectedBoosterAmount);
    }
}
