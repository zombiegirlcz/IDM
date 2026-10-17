package r7b;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f252071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f252072b;

    public k(j navBarState, aim.e items) {
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f252071a = navBarState;
        this.f252072b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f252072b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f252071a, kVar.f252071a) && Intrinsics.f(this.f252072b, kVar.f252072b);
    }

    public final int hashCode() {
        return this.f252072b.hashCode() + (this.f252071a.hashCode() * 31);
    }
}
