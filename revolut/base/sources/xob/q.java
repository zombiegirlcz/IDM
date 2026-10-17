package xob;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f307779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f307780b;

    public q(List items, h navBarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f307779a = items;
        this.f307780b = navBarState;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return new p(!((q) oldState).f307780b.equals(this.f307780b));
    }

    @Override // cli.p
    public final List c() {
        return this.f307779a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f307779a, qVar.f307779a) && Intrinsics.f(this.f307780b, qVar.f307780b);
    }

    public final int hashCode() {
        return this.f307780b.hashCode() + (this.f307779a.hashCode() * 31);
    }
}
