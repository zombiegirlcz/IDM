package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class x implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318574b;

    public x(Links links, hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f318573a = links;
        this.f318574b = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f318573a, xVar.f318573a) && this.f318574b == xVar.f318574b;
    }

    public final int hashCode() {
        return this.f318574b.hashCode() + (this.f318573a.hashCode() * 31);
    }
}
