package d1k;

import kotlin.jvm.internal.Intrinsics;
import qta.d;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rzj.b f110657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f110658b;

    public b(rzj.b symbol, d midRatesPlot) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(midRatesPlot, "midRatesPlot");
        this.f110657a = symbol;
        this.f110658b = midRatesPlot;
    }

    @Override // d1k.c
    public final d a() {
        return this.f110658b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f110657a, bVar.f110657a) && Intrinsics.f(this.f110658b, bVar.f110658b);
    }

    @Override // d1k.c
    public final rzj.b getSymbol() {
        return this.f110657a;
    }

    public final int hashCode() {
        return this.f110658b.hashCode() + (this.f110657a.hashCode() * 31);
    }
}
