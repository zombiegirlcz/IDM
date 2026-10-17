package s7a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f260638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f260639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f260640c;
    public final tx0.j0 d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f260641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f260642h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f260643j;

    public t() {
        this(2047, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f260638a, tVar.f260638a) && this.f260639b == tVar.f260639b && this.f260640c == tVar.f260640c && this.d == tVar.d && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f260641g, tVar.f260641g) && Intrinsics.f(this.f260642h, tVar.f260642h) && Intrinsics.f(this.i, tVar.i) && this.f260643j == tVar.f260643j;
    }

    public final int hashCode() {
        Clause clause = this.f260638a;
        int iHashCode = (this.d.hashCode() + j6.a.c(j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f260639b), 31, this.f260640c)) * 31;
        Clause clause2 = this.e;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 961;
        Clause clause3 = this.f;
        int iD = p.a.d((iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 31, 31, this.f260641g);
        Clause clause4 = this.f260642h;
        int iHashCode3 = (iD + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Clause clause5 = this.i;
        return Boolean.hashCode(this.f260643j) + ((iHashCode3 + (clause5 != null ? clause5.hashCode() : 0)) * 31);
    }

    public t(Clause clause, boolean z, tx0.j0 headerTitleMode, Clause clause2, Clause clause3, List menuItems, Clause clause4, Clause clause5, boolean z3) {
        Intrinsics.checkNotNullParameter(headerTitleMode, "headerTitleMode");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f260638a = clause;
        this.f260639b = true;
        this.f260640c = z;
        this.d = headerTitleMode;
        this.e = clause2;
        this.f = clause3;
        this.f260641g = menuItems;
        this.f260642h = clause4;
        this.i = clause5;
        this.f260643j = z3;
    }

    public t(int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        this((i & 1) != 0 ? null : textLocalisedClause, true, tx0.j0.MULTILINE, null, null, zhm.f0.f322471a, (i & 256) != 0 ? null : textLocalisedClause2, null, (i & 1024) == 0);
    }
}
