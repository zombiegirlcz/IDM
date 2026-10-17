package h74;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f149849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f149850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f149851c;
    public final Clause d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f149852g;

    public h(List items, TextLocalisedClause title, TextClause textClause, TextLocalisedClause textLocalisedClause, List menuItems, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f149849a = items;
        this.f149850b = title;
        this.f149851c = textClause;
        this.d = textLocalisedClause;
        this.e = menuItems;
        this.f = z;
        this.f149852g = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f149849a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f149849a, hVar.f149849a) && Intrinsics.f(this.f149850b, hVar.f149850b) && Intrinsics.f(this.f149851c, hVar.f149851c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f && this.f149852g == hVar.f149852g;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f149849a.hashCode() * 31, 31, this.f149850b);
        Clause clause = this.f149851c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return Boolean.hashCode(this.f149852g) + j6.a.c(p.a.d((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public h(TextLocalisedClause textLocalisedClause, List list) {
        this(list, textLocalisedClause, null, null, f0.f322471a, false, false);
    }
}
