package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318481b;

    public b0(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318480a = links;
        this.f318481b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f318480a, b0Var.f318480a) && this.f318481b == b0Var.f318481b;
    }

    public final int hashCode() {
        return this.f318481b.hashCode() + (this.f318480a.hashCode() * 31);
    }
}
