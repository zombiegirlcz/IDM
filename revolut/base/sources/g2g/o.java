package g2g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f140060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f140061c;

    public o(List items, boolean z, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f140059a = items;
        this.f140060b = menuItems;
        this.f140061c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f140059a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f140059a, oVar.f140059a) && Intrinsics.f(this.f140060b, oVar.f140060b) && this.f140061c == oVar.f140061c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140061c) + p.a.d(this.f140059a.hashCode() * 31, 31, this.f140060b);
    }
}
