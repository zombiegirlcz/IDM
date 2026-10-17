package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318496b;

    public e0(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318495a = links;
        this.f318496b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f318495a, e0Var.f318495a) && this.f318496b == e0Var.f318496b;
    }

    public final int hashCode() {
        return this.f318496b.hashCode() + (this.f318495a.hashCode() * 31);
    }
}
