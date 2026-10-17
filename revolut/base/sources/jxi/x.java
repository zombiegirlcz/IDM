package jxi;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarMenuItem f179232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f179233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f179234c;

    public x(NavBarMenuItem navBarMenuItem, Clause clause, Clause clause2) {
        this.f179232a = navBarMenuItem;
        this.f179233b = clause;
        this.f179234c = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f179232a, xVar.f179232a) && Intrinsics.f(this.f179233b, xVar.f179233b) && Intrinsics.f(this.f179234c, xVar.f179234c);
    }

    public final int hashCode() {
        NavBarMenuItem navBarMenuItem = this.f179232a;
        int iHashCode = (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode()) * 31;
        Clause clause = this.f179233b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f179234c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
