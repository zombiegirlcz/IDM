package bzc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f19967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xyc.e f19968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19969c;

    public p(k navBarModel, xyc.e flowReviewState, List items) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(flowReviewState, "flowReviewState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f19967a = navBarModel;
        this.f19968b = flowReviewState;
        this.f19969c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f19969c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f19967a, pVar.f19967a) && this.f19968b == pVar.f19968b && Intrinsics.f(this.f19969c, pVar.f19969c);
    }

    public final int hashCode() {
        return this.f19969c.hashCode() + ((this.f19968b.hashCode() + (this.f19967a.hashCode() * 31)) * 31);
    }
}
