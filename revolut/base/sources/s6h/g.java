package s6h;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f260348a;

    public g(List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f260348a = menuItems;
    }

    @Override // s6h.i
    public final List a() {
        return this.f260348a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f260348a, ((g) obj2).f260348a);
    }

    public final int hashCode() {
        return this.f260348a.hashCode();
    }
}
