package sui;

import cli.p;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f265782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarMenuItem f265783b;

    public k(List items, NavBarMenuItem navBarMenuItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f265782a = items;
        this.f265783b = navBarMenuItem;
    }

    @Override // cli.p
    public final List c() {
        return this.f265782a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f265782a, kVar.f265782a) && Intrinsics.f(this.f265783b, kVar.f265783b);
    }

    public final int hashCode() {
        int iHashCode = this.f265782a.hashCode() * 31;
        NavBarMenuItem navBarMenuItem = this.f265783b;
        return iHashCode + (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode());
    }
}
