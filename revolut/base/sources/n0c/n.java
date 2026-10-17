package n0c;

import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f210989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f210990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarMenuItem f210991c;
    public final List d;

    public n(m navBar, List actions, IconNavBarMenuItem iconNavBarMenuItem, List items) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f210989a = navBar;
        this.f210990b = actions;
        this.f210991c = iconNavBarMenuItem;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f210989a, nVar.f210989a) && Intrinsics.f(this.f210990b, nVar.f210990b) && Intrinsics.f(this.f210991c, nVar.f210991c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f210989a.hashCode() * 31, 31, this.f210990b);
        NavBarMenuItem navBarMenuItem = this.f210991c;
        return this.d.hashCode() + ((iD + (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode())) * 31);
    }
}
