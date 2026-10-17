package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318504b;

    public g0(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318503a = links;
        this.f318504b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f318503a, g0Var.f318503a) && this.f318504b == g0Var.f318504b;
    }

    public final int hashCode() {
        return this.f318504b.hashCode() + (this.f318503a.hashCode() * 31);
    }
}
