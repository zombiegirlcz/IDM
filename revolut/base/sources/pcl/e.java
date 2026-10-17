package pcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f234946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f234947c;
    public final d d;
    public final c e;

    public e(String ref2, a price, b primaryStats, d yieldStats, c riskStats) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(primaryStats, "primaryStats");
        Intrinsics.checkNotNullParameter(yieldStats, "yieldStats");
        Intrinsics.checkNotNullParameter(riskStats, "riskStats");
        this.f234945a = ref2;
        this.f234946b = price;
        this.f234947c = primaryStats;
        this.d = yieldStats;
        this.e = riskStats;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f234945a, eVar.f234945a) && Intrinsics.f(this.f234946b, eVar.f234946b) && Intrinsics.f(this.f234947c, eVar.f234947c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f234947c.hashCode() + ((this.f234946b.hashCode() + (this.f234945a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
