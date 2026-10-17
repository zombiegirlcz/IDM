package od3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h0 implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f224271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f224272b;

    public h0(List items, o navBarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f224271a = items;
        this.f224272b = navBarState;
    }

    @Override // jki.n
    public final List c() {
        return this.f224271a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f224271a, h0Var.f224271a) && Intrinsics.f(this.f224272b, h0Var.f224272b);
    }

    public final int hashCode() {
        return this.f224272b.hashCode() + (this.f224271a.hashCode() * 31);
    }
}
