package hui;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarMenuItem f155690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f155691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f155692c;

    public t(NavBarMenuItem navBarMenuItem, Clause clause, Clause clause2) {
        this.f155690a = navBarMenuItem;
        this.f155691b = clause;
        this.f155692c = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f155690a, tVar.f155690a) && Intrinsics.f(this.f155691b, tVar.f155691b) && Intrinsics.f(this.f155692c, tVar.f155692c);
    }

    public final int hashCode() {
        NavBarMenuItem navBarMenuItem = this.f155690a;
        int iHashCode = (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode()) * 31;
        Clause clause = this.f155691b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f155692c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
