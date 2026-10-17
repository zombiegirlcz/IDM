package hw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f156013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f156014b;

    public n(xi0.b currency, xi0.b referencedCurrency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(referencedCurrency, "referencedCurrency");
        this.f156013a = currency;
        this.f156014b = referencedCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f156013a, nVar.f156013a) && Intrinsics.f(this.f156014b, nVar.f156014b);
    }

    public final int hashCode() {
        return this.f156014b.hashCode() + (this.f156013a.hashCode() * 31);
    }
}
