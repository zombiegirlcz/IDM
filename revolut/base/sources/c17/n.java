package c17;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f20400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f20402c;
    public final l d;

    public n(m navBarState, List items, k buttonState, l footerState) {
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        this.f20400a = navBarState;
        this.f20401b = items;
        this.f20402c = buttonState;
        this.d = footerState;
    }

    @Override // cli.p
    public final List c() {
        return this.f20401b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f20400a, nVar.f20400a) && Intrinsics.f(this.f20401b, nVar.f20401b) && Intrinsics.f(this.f20402c, nVar.f20402c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f20402c.hashCode() + p.a.d(this.f20400a.hashCode() * 31, 31, this.f20401b)) * 31);
    }
}
