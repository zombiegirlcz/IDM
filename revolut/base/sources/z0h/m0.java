package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318534b;

    public m0(Links links, hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f318533a = links;
        this.f318534b = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f318533a, m0Var.f318533a) && this.f318534b == m0Var.f318534b;
    }

    public final int hashCode() {
        return this.f318534b.hashCode() + (this.f318533a.hashCode() * 31);
    }
}
