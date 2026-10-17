package y4d;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithContainerBackground f310888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f310889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f310890c;

    public k(NavBarWithContainerBackground background, xi0.b selectedCurrency, List availableCurrencies) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
        this.f310888a = background;
        this.f310889b = selectedCurrency;
        this.f310890c = availableCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f310888a, kVar.f310888a) && Intrinsics.f(this.f310889b, kVar.f310889b) && Intrinsics.f(this.f310890c, kVar.f310890c);
    }

    public final int hashCode() {
        return this.f310890c.hashCode() + h30.l.j(this.f310889b, this.f310888a.hashCode() * 31, 31);
    }
}
