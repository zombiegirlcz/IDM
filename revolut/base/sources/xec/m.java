package xec;

import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f304598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarMenuItem f304599c;
    public final k d;

    public m(List items, l toolbar, PlusActionNavBarMenuItem plusActionNavBarMenuItem, k button) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f304597a = items;
        this.f304598b = toolbar;
        this.f304599c = plusActionNavBarMenuItem;
        this.d = button;
    }

    @Override // cli.p
    public final List c() {
        return this.f304597a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f304597a, mVar.f304597a) && Intrinsics.f(this.f304598b, mVar.f304598b) && Intrinsics.f(this.f304599c, mVar.f304599c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f304598b.hashCode() + (this.f304597a.hashCode() * 31)) * 31;
        NavBarMenuItem navBarMenuItem = this.f304599c;
        return this.d.hashCode() + ((iHashCode + (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode())) * 31);
    }
}
