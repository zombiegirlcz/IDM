package m8d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f203526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f203527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f203528c;
    public final List d;

    public y(x navBarState, l lVar, List menuItems, List items) {
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f203526a = navBarState;
        this.f203527b = lVar;
        this.f203528c = menuItems;
        this.d = items;
    }

    @Override // jki.n
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f203526a, yVar.f203526a) && Intrinsics.f(this.f203527b, yVar.f203527b) && Intrinsics.f(this.f203528c, yVar.f203528c) && Intrinsics.f(this.d, yVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f203526a.hashCode() * 31;
        l lVar = this.f203527b;
        return this.d.hashCode() + p.a.d((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f203528c);
    }
}
