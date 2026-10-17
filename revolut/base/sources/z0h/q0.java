package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f318548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Links f318549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f318550c;

    public q0(p0 type, Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318548a = type;
        this.f318549b = links;
        this.f318550c = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return this.f318548a == q0Var.f318548a && Intrinsics.f(this.f318549b, q0Var.f318549b) && this.f318550c == q0Var.f318550c;
    }

    public final int hashCode() {
        return this.f318550c.hashCode() + ((this.f318549b.hashCode() + (this.f318548a.hashCode() * 31)) * 31);
    }
}
