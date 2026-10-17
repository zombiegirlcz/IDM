package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318540b;

    public n0(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318539a = links;
        this.f318540b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f318539a, n0Var.f318539a) && this.f318540b == n0Var.f318540b;
    }

    public final int hashCode() {
        return this.f318540b.hashCode() + (this.f318539a.hashCode() * 31);
    }
}
