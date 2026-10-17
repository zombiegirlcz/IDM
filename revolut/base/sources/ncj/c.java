package ncj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f214224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qta.c f214225b;

    public c(b priceTargetsInfo, qta.c exchangeRate) {
        Intrinsics.checkNotNullParameter(priceTargetsInfo, "priceTargetsInfo");
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        this.f214224a = priceTargetsInfo;
        this.f214225b = exchangeRate;
    }

    public static c a(c cVar, b priceTargetsInfo) {
        qta.c exchangeRate = cVar.f214225b;
        Intrinsics.checkNotNullParameter(priceTargetsInfo, "priceTargetsInfo");
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        return new c(priceTargetsInfo, exchangeRate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f214224a, cVar.f214224a) && Intrinsics.f(this.f214225b, cVar.f214225b);
    }

    public final int hashCode() {
        return this.f214225b.hashCode() + (this.f214224a.hashCode() * 31);
    }
}
