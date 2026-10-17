package f23;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131406c;
    public final Clause d;
    public final Clause e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f131407g;

    public r(Clause title, Clause clause, String str, List pagerItems, List menuItems, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f131404a = pagerItems;
        this.f131405b = str;
        this.f131406c = z;
        this.d = title;
        this.e = clause;
        this.f = menuItems;
        this.f131407g = z3;
    }

    public static r a(r rVar, List list, String str, TextLocalisedClause textLocalisedClause, Clause clause, List list2, boolean z, int i) {
        if ((i & 1) != 0) {
            list = rVar.f131404a;
        }
        List pagerItems = list;
        if ((i & 2) != 0) {
            str = rVar.f131405b;
        }
        String str2 = str;
        boolean z3 = (i & 4) != 0 ? rVar.f131406c : false;
        Clause clause2 = textLocalisedClause;
        if ((i & 8) != 0) {
            clause2 = rVar.d;
        }
        Clause title = clause2;
        if ((i & 16) != 0) {
            clause = rVar.e;
        }
        Clause clause3 = clause;
        if ((i & 32) != 0) {
            list2 = rVar.f;
        }
        List menuItems = list2;
        if ((i & 64) != 0) {
            z = rVar.f131407g;
        }
        rVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        return new r(title, clause3, str2, pagerItems, menuItems, z3, z);
    }

    @Override // oki.a
    public final List W() {
        return this.f131404a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f131404a, rVar.f131404a) && Intrinsics.f(this.f131405b, rVar.f131405b) && this.f131406c == rVar.f131406c && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && this.f131407g == rVar.f131407g;
    }

    public final int hashCode() {
        int iHashCode = this.f131404a.hashCode() * 31;
        String str = this.f131405b;
        int iA = p.a.a(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f131406c), 31, this.d);
        Clause clause = this.e;
        return Boolean.hashCode(this.f131407g) + p.a.d((iA + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // oki.a
    public final String z() {
        return this.f131405b;
    }
}
