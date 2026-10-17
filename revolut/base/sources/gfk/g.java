package gfk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lgfk/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "currentBillingCycle", "Lgfk/h;", "b", "Lgfk/h;", "()Lgfk/h;", "minimumLimit", "Lgfk/i;", "c", "Lgfk/i;", "()Lgfk/i;", "upgrade", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentBillingCycle")
    private final String currentBillingCycle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumLimit")
    private final h minimumLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("upgrade")
    private final i upgrade;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrentBillingCycle() {
        return this.currentBillingCycle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getMinimumLimit() {
        return this.minimumLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i getUpgrade() {
        return this.upgrade;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.currentBillingCycle, gVar.currentBillingCycle) && Intrinsics.f(this.minimumLimit, gVar.minimumLimit) && Intrinsics.f(this.upgrade, gVar.upgrade);
    }

    public final int hashCode() {
        String str = this.currentBillingCycle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        h hVar = this.minimumLimit;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.upgrade;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
