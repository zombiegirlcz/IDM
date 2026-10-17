package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318543b;

    public o0(Links links, hel.b context) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f318542a = links;
        this.f318543b = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f318542a, o0Var.f318542a) && this.f318543b == o0Var.f318543b;
    }

    public final int hashCode() {
        return this.f318543b.hashCode() + (this.f318542a.hashCode() * 31);
    }
}
