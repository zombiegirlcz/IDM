package dmj;

import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarMenuItem f116142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f116143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f116144c;

    public c0(NavBarMenuItem navBarMenuItem, List items, z actionButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionButtonState, "actionButtonState");
        this.f116142a = navBarMenuItem;
        this.f116143b = items;
        this.f116144c = actionButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f116143b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f116142a, c0Var.f116142a) && Intrinsics.f(this.f116143b, c0Var.f116143b) && Intrinsics.f(this.f116144c, c0Var.f116144c);
    }

    public final int hashCode() {
        NavBarMenuItem navBarMenuItem = this.f116142a;
        return this.f116144c.hashCode() + p.a.d((navBarMenuItem == null ? 0 : navBarMenuItem.hashCode()) * 31, 31, this.f116143b);
    }
}
