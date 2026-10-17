package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f318528c;

    public l0(Links links, hel.b context, r1 parcelWrapStrategy) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parcelWrapStrategy, "parcelWrapStrategy");
        this.f318526a = links;
        this.f318527b = context;
        this.f318528c = parcelWrapStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f318526a, l0Var.f318526a) && this.f318527b == l0Var.f318527b && this.f318528c == l0Var.f318528c;
    }

    public final int hashCode() {
        return this.f318528c.hashCode() + ((this.f318527b.hashCode() + (this.f318526a.hashCode() * 31)) * 31);
    }
}
