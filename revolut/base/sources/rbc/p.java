package rbc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f253019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f253020b;

    public p(h navBarUIState, aim.e items) {
        Intrinsics.checkNotNullParameter(navBarUIState, "navBarUIState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f253019a = navBarUIState;
        this.f253020b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f253020b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f253019a.equals(pVar.f253019a) && Intrinsics.f(this.f253020b, pVar.f253020b);
    }

    public final int hashCode() {
        return this.f253020b.hashCode() + (this.f253019a.hashCode() * 31);
    }
}
