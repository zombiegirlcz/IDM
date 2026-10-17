package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318517b;

    public j0(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318516a = links;
        this.f318517b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f318516a, j0Var.f318516a) && this.f318517b == j0Var.f318517b;
    }

    public final int hashCode() {
        return this.f318517b.hashCode() + (this.f318516a.hashCode() * 31);
    }
}
