package c64;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f21637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f21638c;
    public final TagViewData d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21640h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f21641j;

    public p(int i, TextLocalisedClause textLocalisedClause, List list) {
        this(i, textLocalisedClause, null, null, null, false, false, false, list, f0.f322471a);
    }

    @Override // cli.p
    public final List c() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f21636a == pVar.f21636a && Intrinsics.f(this.f21637b, pVar.f21637b) && Intrinsics.f(this.f21638c, pVar.f21638c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && this.f == pVar.f && this.f21639g == pVar.f21639g && this.f21640h == pVar.f21640h && Intrinsics.f(this.i, pVar.i) && Intrinsics.f(this.f21641j, pVar.f21641j);
    }

    public final int hashCode() {
        int iA = t61.a.a(Integer.hashCode(this.f21636a) * 31, 31, this.f21637b);
        Clause clause = this.f21638c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        TagViewData tagViewData = this.d;
        int iHashCode2 = (iHashCode + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31;
        Clause clause2 = this.e;
        return this.f21641j.hashCode() + p.a.d(j6.a.c(j6.a.c(j6.a.c((iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.f), 31, this.f21639g), 31, this.f21640h), 31, this.i);
    }

    public p(int i, TextLocalisedClause title, TextClause textClause, TagViewData tagViewData, TextLocalisedClause textLocalisedClause, boolean z, boolean z3, boolean z4, List items, List bottomItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bottomItems, "bottomItems");
        this.f21636a = i;
        this.f21637b = title;
        this.f21638c = textClause;
        this.d = tagViewData;
        this.e = textLocalisedClause;
        this.f = z;
        this.f21639g = z3;
        this.f21640h = z4;
        this.i = items;
        this.f21641j = bottomItems;
    }
}
