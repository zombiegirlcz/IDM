package kyh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.e f190906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f190907b;

    public h(wd6.e exchangeMode, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        this.f190906a = exchangeMode;
        this.f190907b = targetCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f190906a == hVar.f190906a && Intrinsics.f(this.f190907b, hVar.f190907b);
    }

    public final int hashCode() {
        return this.f190907b.hashCode() + (this.f190906a.hashCode() * 31);
    }
}
