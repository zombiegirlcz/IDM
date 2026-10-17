package f1k;

import kotlin.jvm.internal.Intrinsics;
import qta.d;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rzj.b f131287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f131288b;

    public b(rzj.b symbol, d midRatesPlot) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(midRatesPlot, "midRatesPlot");
        this.f131287a = symbol;
        this.f131288b = midRatesPlot;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f131287a, bVar.f131287a) && Intrinsics.f(this.f131288b, bVar.f131288b);
    }

    public final int hashCode() {
        return this.f131288b.hashCode() + (this.f131287a.hashCode() * 31);
    }
}
