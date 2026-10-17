package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f318581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Links f318582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f318583c;

    public z0(y0 type, Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318581a = type;
        this.f318582b = links;
        this.f318583c = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return this.f318581a == z0Var.f318581a && Intrinsics.f(this.f318582b, z0Var.f318582b) && this.f318583c == z0Var.f318583c;
    }

    public final int hashCode() {
        return this.f318583c.hashCode() + ((this.f318582b.hashCode() + (this.f318581a.hashCode() * 31)) * 31);
    }
}
