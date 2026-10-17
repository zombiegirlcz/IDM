package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f318553c;

    public r(Links links, hel.b context, r1 parcelWrapStrategy) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parcelWrapStrategy, "parcelWrapStrategy");
        this.f318551a = links;
        this.f318552b = context;
        this.f318553c = parcelWrapStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f318551a, rVar.f318551a) && this.f318552b == rVar.f318552b && this.f318553c == rVar.f318553c;
    }

    public final int hashCode() {
        return this.f318553c.hashCode() + ((this.f318552b.hashCode() + (this.f318551a.hashCode() * 31)) * 31);
    }
}
