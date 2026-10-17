package vel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f288352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9l.a f288353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f288354c;
    public final g d;

    public d(xi0.b currency, n9l.a exchangeRate, a performance, g entry) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f288352a = currency;
        this.f288353b = exchangeRate;
        this.f288354c = performance;
        this.d = entry;
    }

    @Override // vel.f
    public final g b() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f288352a, dVar.f288352a) && Intrinsics.f(this.f288353b, dVar.f288353b) && Intrinsics.f(this.f288354c, dVar.f288354c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f288354c.hashCode() + ((this.f288353b.hashCode() + (this.f288352a.hashCode() * 31)) * 31)) * 31);
    }
}
