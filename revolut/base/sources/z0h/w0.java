package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318572b;

    public w0(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318571a = links;
        this.f318572b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f318571a, w0Var.f318571a) && this.f318572b == w0Var.f318572b;
    }

    public final int hashCode() {
        return this.f318572b.hashCode() + (this.f318571a.hashCode() * 31);
    }
}
