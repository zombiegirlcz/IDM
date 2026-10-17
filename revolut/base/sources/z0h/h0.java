package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318509b;

    public h0(Links links, hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f318508a = links;
        this.f318509b = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f318508a, h0Var.f318508a) && this.f318509b == h0Var.f318509b;
    }

    public final int hashCode() {
        return this.f318509b.hashCode() + (this.f318508a.hashCode() * 31);
    }
}
