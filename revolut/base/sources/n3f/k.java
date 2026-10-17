package n3f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.b f212063c;

    public k(String symbol, String ref2, jo3.b fees) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f212061a = symbol;
        this.f212062b = ref2;
        this.f212063c = fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f212061a, kVar.f212061a) && Intrinsics.f(this.f212062b, kVar.f212062b) && Intrinsics.f(this.f212063c, kVar.f212063c);
    }

    public final int hashCode() {
        return this.f212063c.hashCode() + p.a.c(this.f212061a.hashCode() * 31, 31, this.f212062b);
    }
}
