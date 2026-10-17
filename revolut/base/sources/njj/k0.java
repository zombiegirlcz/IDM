package njj;

import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f216568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarMenuItem f216569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f216570c;
    public final a0 d;

    public k0(c0 c0Var, NavBarMenuItem navBarMenuItem, List items, a0 actionButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionButtonState, "actionButtonState");
        this.f216568a = c0Var;
        this.f216569b = navBarMenuItem;
        this.f216570c = items;
        this.d = actionButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f216570c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f216568a, k0Var.f216568a) && Intrinsics.f(this.f216569b, k0Var.f216569b) && Intrinsics.f(this.f216570c, k0Var.f216570c) && Intrinsics.f(this.d, k0Var.d);
    }

    public final int hashCode() {
        c0 c0Var = this.f216568a;
        int iHashCode = (c0Var == null ? 0 : c0Var.f216548a.hashCode()) * 31;
        NavBarMenuItem navBarMenuItem = this.f216569b;
        return this.d.hashCode() + p.a.d((iHashCode + (navBarMenuItem != null ? navBarMenuItem.hashCode() : 0)) * 31, 31, this.f216570c);
    }
}
