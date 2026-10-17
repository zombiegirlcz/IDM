package d1k;

import kotlin.jvm.internal.Intrinsics;
import qta.d;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rzj.b f110654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f110655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vel.a f110656c;

    public a(rzj.b symbol, d midRatesPlot, vel.a performance) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(midRatesPlot, "midRatesPlot");
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.f110654a = symbol;
        this.f110655b = midRatesPlot;
        this.f110656c = performance;
    }

    @Override // d1k.c
    public final d a() {
        return this.f110655b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f110654a, aVar.f110654a) && Intrinsics.f(this.f110655b, aVar.f110655b) && Intrinsics.f(this.f110656c, aVar.f110656c);
    }

    @Override // d1k.c
    public final rzj.b getSymbol() {
        return this.f110654a;
    }

    public final int hashCode() {
        return this.f110656c.hashCode() + ((this.f110655b.hashCode() + (this.f110654a.hashCode() * 31)) * 31);
    }
}
