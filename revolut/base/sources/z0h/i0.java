package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318514b;

    public i0(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318513a = links;
        this.f318514b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f318513a, i0Var.f318513a) && this.f318514b == i0Var.f318514b;
    }

    public final int hashCode() {
        return this.f318514b.hashCode() + (this.f318513a.hashCode() * 31);
    }
}
