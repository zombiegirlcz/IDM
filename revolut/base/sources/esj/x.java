package esj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f128989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f128990c;
    public final boolean d;
    public final Clause e;
    public final TextLocalisedClause f;

    public x(List items, List menuItems, boolean z, boolean z3, TextLocalisedClause textLocalisedClause, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f128988a = items;
        this.f128989b = menuItems;
        this.f128990c = z;
        this.d = z3;
        this.e = textLocalisedClause;
        this.f = title;
    }

    @Override // jki.n
    public final List c() {
        return this.f128988a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f128988a, xVar.f128988a) && Intrinsics.f(this.f128989b, xVar.f128989b) && this.f128990c == xVar.f128990c && this.d == xVar.d && Intrinsics.f(this.e, xVar.e) && this.f.equals(xVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.d(this.f128988a.hashCode() * 31, 31, this.f128989b), 31, this.f128990c), 31, this.d);
        Clause clause = this.e;
        return this.f.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
