package s7a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f260611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f260612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f260613c;
    public final boolean d;
    public final Integer e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NavBarMenuItem f260614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f260615h;
    public final boolean i;

    public k0(List items, boolean z, Clause clause, boolean z3, Integer num, String searchString, TextNavBarMenuItem textNavBarMenuItem, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        this.f260611a = items;
        this.f260612b = z;
        this.f260613c = clause;
        this.d = z3;
        this.e = num;
        this.f = searchString;
        this.f260614g = textNavBarMenuItem;
        this.f260615h = z4;
        this.i = z6;
    }

    @Override // cli.p
    public final List c() {
        return this.f260611a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f260611a, k0Var.f260611a) && this.f260612b == k0Var.f260612b && Intrinsics.f(this.f260613c, k0Var.f260613c) && this.d == k0Var.d && Intrinsics.f(this.e, k0Var.e) && Intrinsics.f(this.f, k0Var.f) && Intrinsics.f(this.f260614g, k0Var.f260614g) && this.f260615h == k0Var.f260615h && this.i == k0Var.i;
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f260611a.hashCode() * 31, 31, this.f260612b);
        Clause clause = this.f260613c;
        int iC2 = j6.a.c((iC + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        int iC3 = p.a.c((iC2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f);
        NavBarMenuItem navBarMenuItem = this.f260614g;
        return Boolean.hashCode(this.i) + j6.a.c((iC3 + (navBarMenuItem != null ? navBarMenuItem.hashCode() : 0)) * 31, 31, this.f260615h);
    }

    public /* synthetic */ k0(List list, boolean z, Clause clause, boolean z3, String str, boolean z4, boolean z6, int i) {
        this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : clause, z3, null, str, null, z4, z6);
    }
}
