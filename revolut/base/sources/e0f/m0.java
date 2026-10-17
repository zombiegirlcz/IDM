package e0f;

import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f121640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f121641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FeatureCommand f121642c;

    public m0(xi0.b currency, xi0.b baseCurrency, FeatureCommand fallbackNavigation) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(fallbackNavigation, "fallbackNavigation");
        this.f121640a = currency;
        this.f121641b = baseCurrency;
        this.f121642c = fallbackNavigation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f121640a, m0Var.f121640a) && Intrinsics.f(this.f121641b, m0Var.f121641b) && this.f121642c.equals(m0Var.f121642c);
    }

    public final int hashCode() {
        return this.f121642c.f98638a.hashCode() + h30.l.j(this.f121641b, this.f121640a.hashCode() * 31, 31);
    }
}
