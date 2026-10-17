package d27;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f110734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f110735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f110736c;

    public c0(a0 footerState, List items, b0 navBarState) {
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f110734a = footerState;
        this.f110735b = items;
        this.f110736c = navBarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f110735b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f110734a, c0Var.f110734a) && Intrinsics.f(this.f110735b, c0Var.f110735b) && Intrinsics.f(this.f110736c, c0Var.f110736c);
    }

    public final int hashCode() {
        return this.f110736c.hashCode() + p.a.d(this.f110734a.hashCode() * 31, 31, this.f110735b);
    }
}
