package qtc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f249078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f249079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f249080c;
    public final xi0.b d;
    public final boolean e;

    public g(dj0.d amount, xi0.b limitCurrency, xi0.b sourceCurrency, xi0.b destinationCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(limitCurrency, "limitCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(destinationCurrency, "destinationCurrency");
        this.f249078a = amount;
        this.f249079b = limitCurrency;
        this.f249080c = sourceCurrency;
        this.d = destinationCurrency;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f249078a, gVar.f249078a) && Intrinsics.f(this.f249079b, gVar.f249079b) && Intrinsics.f(this.f249080c, gVar.f249080c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + h30.l.j(this.d, h30.l.j(this.f249080c, h30.l.j(this.f249079b, this.f249078a.hashCode() * 31, 31), 31), 31);
    }
}
