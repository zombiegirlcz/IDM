package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318483b;

    public b1(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318482a = links;
        this.f318483b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f318482a, b1Var.f318482a) && this.f318483b == b1Var.f318483b;
    }

    public final int hashCode() {
        return this.f318483b.hashCode() + (this.f318482a.hashCode() * 31);
    }
}
