package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f318562c;

    public t0(Links links, hel.b context, s0 type) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f318560a = links;
        this.f318561b = context;
        this.f318562c = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f318560a, t0Var.f318560a) && this.f318561b == t0Var.f318561b && this.f318562c == t0Var.f318562c;
    }

    public final int hashCode() {
        return this.f318562c.hashCode() + ((this.f318561b.hashCode() + (this.f318560a.hashCode() * 31)) * 31);
    }
}
