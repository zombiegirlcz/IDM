package vge;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f288987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288989c;

    public r0(xi0.b baseCurrency, Map currencyPairs, Map rates) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f288987a = baseCurrency;
        this.f288988b = currencyPairs;
        this.f288989c = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f288987a, r0Var.f288987a) && this.f288988b.equals(r0Var.f288988b) && this.f288989c.equals(r0Var.f288989c);
    }

    public final int hashCode() {
        return this.f288989c.hashCode() + p.a.b(this.f288987a.hashCode() * 31, 31, this.f288988b);
    }
}
