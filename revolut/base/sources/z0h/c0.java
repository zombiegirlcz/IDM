package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318487b;

    public c0(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318486a = links;
        this.f318487b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f318486a, c0Var.f318486a) && this.f318487b == c0Var.f318487b;
    }

    public final int hashCode() {
        return this.f318487b.hashCode() + (this.f318486a.hashCode() * 31);
    }
}
