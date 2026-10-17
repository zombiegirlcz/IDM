package uyh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f284373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f284374b;

    public k(xi0.b targetCurrency, xi0.b sourceCurrency) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        this.f284373a = targetCurrency;
        this.f284374b = sourceCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f284373a, kVar.f284373a) && Intrinsics.f(this.f284374b, kVar.f284374b);
    }

    public final int hashCode() {
        return this.f284374b.hashCode() + (this.f284373a.hashCode() * 31);
    }
}
