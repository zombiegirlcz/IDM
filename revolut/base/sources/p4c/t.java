package p4c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f232892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f232893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f232894c;
    public final Clause d;
    public final boolean e;
    public final aw0.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f232895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f232896h;

    public t(boolean z, TextClause textClause, CompositeClause compositeClause, TextClause textClause2, boolean z3, aw0.g actionFooterModel, List menuItems, List items) {
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f232892a = z;
        this.f232893b = textClause;
        this.f232894c = compositeClause;
        this.d = textClause2;
        this.e = z3;
        this.f = actionFooterModel;
        this.f232895g = menuItems;
        this.f232896h = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f232896h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f232892a == tVar.f232892a && Intrinsics.f(this.f232893b, tVar.f232893b) && Intrinsics.f(this.f232894c, tVar.f232894c) && Intrinsics.f(this.d, tVar.d) && this.e == tVar.e && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f232895g, tVar.f232895g) && Intrinsics.f(this.f232896h, tVar.f232896h);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f232892a) * 31;
        Clause clause = this.f232893b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f232894c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        return this.f232896h.hashCode() + p.a.d((this.f.hashCode() + j6.a.c((iHashCode3 + (clause3 != null ? clause3.hashCode() : 0)) * 31, 31, this.e)) * 31, 31, this.f232895g);
    }

    public t(boolean z, aw0.g gVar, List list, List list2, int i) {
        this(z, null, null, null, false, gVar, (i & 64) != 0 ? f0.f322471a : list, list2);
    }
}
