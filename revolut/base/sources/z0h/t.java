package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318559b;

    public t(Links links, hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f318558a = links;
        this.f318559b = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f318558a, tVar.f318558a) && this.f318559b == tVar.f318559b;
    }

    public final int hashCode() {
        return this.f318559b.hashCode() + (this.f318558a.hashCode() * 31);
    }
}
