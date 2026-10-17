package i5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f158823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f158824b;

    public b(hel.b bVar, xi0.b cashHoldingCurrency) {
        Intrinsics.checkNotNullParameter(cashHoldingCurrency, "cashHoldingCurrency");
        this.f158823a = bVar;
        this.f158824b = cashHoldingCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f158823a == bVar.f158823a && Intrinsics.f(this.f158824b, bVar.f158824b);
    }

    public final int hashCode() {
        hel.b bVar = this.f158823a;
        return this.f158824b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }
}
