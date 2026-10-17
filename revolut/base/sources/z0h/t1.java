package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318564b;

    public t1(Links links, hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f318563a = links;
        this.f318564b = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.f318563a, t1Var.f318563a) && this.f318564b == t1Var.f318564b;
    }

    public final int hashCode() {
        return this.f318564b.hashCode() + (this.f318563a.hashCode() * 31);
    }
}
