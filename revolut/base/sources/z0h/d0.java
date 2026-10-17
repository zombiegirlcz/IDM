package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318492b;

    public d0(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318491a = links;
        this.f318492b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f318491a, d0Var.f318491a) && this.f318492b == d0Var.f318492b;
    }

    public final int hashCode() {
        return this.f318492b.hashCode() + (this.f318491a.hashCode() * 31);
    }
}
