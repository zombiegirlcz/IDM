package y7a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f311455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f311456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f311457c;
    public final boolean d;
    public final int e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NavBarMenuItem f311458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f311459h;

    public x(List items, boolean z, Clause clause, boolean z3, int i, String searchString, TextNavBarMenuItem textNavBarMenuItem, s sVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        this.f311455a = items;
        this.f311456b = z;
        this.f311457c = clause;
        this.d = z3;
        this.e = i;
        this.f = searchString;
        this.f311458g = textNavBarMenuItem;
        this.f311459h = sVar;
    }

    @Override // jki.n
    public final List c() {
        return this.f311455a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f311455a, xVar.f311455a) && this.f311456b == xVar.f311456b && Intrinsics.f(this.f311457c, xVar.f311457c) && this.d == xVar.d && this.e == xVar.e && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f311458g, xVar.f311458g) && this.f311459h == xVar.f311459h;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f311455a.hashCode() * 31, 31, this.f311456b);
        Clause clause = this.f311457c;
        int iC2 = p.a.c(j6.a.b(this.e, j6.a.c((iC + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31), 31, this.f);
        NavBarMenuItem navBarMenuItem = this.f311458g;
        int iHashCode = (iC2 + (navBarMenuItem == null ? 0 : navBarMenuItem.hashCode())) * 31;
        s sVar = this.f311459h;
        return iHashCode + (sVar != null ? sVar.hashCode() : 0);
    }

    public /* synthetic */ x(List list, boolean z, Clause clause, boolean z3, String str, s sVar, int i) {
        this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : clause, z3, 0, str, null, sVar);
    }
}
