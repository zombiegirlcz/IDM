package hcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2 f151232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f151233b;

    public y2(x2 recentlyViewedStock, k0 instrument) {
        Intrinsics.checkNotNullParameter(recentlyViewedStock, "recentlyViewedStock");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f151232a = recentlyViewedStock;
        this.f151233b = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj2;
        return Intrinsics.f(this.f151232a, y2Var.f151232a) && Intrinsics.f(this.f151233b, y2Var.f151233b);
    }

    public final int hashCode() {
        return this.f151233b.hashCode() + (this.f151232a.hashCode() * 31);
    }
}
