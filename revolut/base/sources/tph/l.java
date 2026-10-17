package tph;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f273387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f273388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f273389c;
    public final j d;

    public l(List items, k navBar, List menuItems, j buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f273387a = items;
        this.f273388b = navBar;
        this.f273389c = menuItems;
        this.d = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f273387a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f273387a, lVar.f273387a) && Intrinsics.f(this.f273388b, lVar.f273388b) && Intrinsics.f(this.f273389c, lVar.f273389c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d.f273383a) + p.a.d((this.f273388b.hashCode() + (this.f273387a.hashCode() * 31)) * 31, 31, this.f273389c);
    }
}
