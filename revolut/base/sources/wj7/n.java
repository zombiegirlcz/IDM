package wj7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f297987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f297988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f297989c;

    public n(List items, boolean z, j navBarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f297987a = items;
        this.f297988b = z;
        this.f297989c = navBarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f297987a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f297987a, nVar.f297987a) && this.f297988b == nVar.f297988b && Intrinsics.f(this.f297989c, nVar.f297989c);
    }

    public final int hashCode() {
        return this.f297989c.hashCode() + j6.a.c(this.f297987a.hashCode() * 31, 31, this.f297988b);
    }
}
