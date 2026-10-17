package fmf;

import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f136390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cmf.g f136391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f136392c;
    public final NavBarMenuItem d;

    public g0(List items, cmf.g headerModel, List actions, IconNavBarMenuItem iconNavBarMenuItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f136390a = items;
        this.f136391b = headerModel;
        this.f136392c = actions;
        this.d = iconNavBarMenuItem;
    }

    @Override // cli.p
    public final List c() {
        return this.f136390a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f136390a, g0Var.f136390a) && Intrinsics.f(this.f136391b, g0Var.f136391b) && Intrinsics.f(this.f136392c, g0Var.f136392c) && Intrinsics.f(this.d, g0Var.d);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f136391b.hashCode() + (this.f136390a.hashCode() * 31)) * 31, 31, this.f136392c);
        NavBarMenuItem navBarMenuItem = this.d;
        return iD + (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode());
    }
}
