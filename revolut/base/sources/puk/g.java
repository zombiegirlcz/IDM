package puk;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f239933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f239934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f239935c;
    public final Clause d;
    public final yy0.j e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TagViewData f239936g;

    public g(TagViewData tagViewData, Clause clause, CompositeClause description, TextClause title, TextClause textClause, List menuItems, yy0.j endImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f239933a = title;
        this.f239934b = clause;
        this.f239935c = description;
        this.d = textClause;
        this.e = endImage;
        this.f = menuItems;
        this.f239936g = tagViewData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f239933a.equals(gVar.f239933a) && Intrinsics.f(this.f239934b, gVar.f239934b) && this.f239935c.equals(gVar.f239935c) && Intrinsics.f(this.d, gVar.d) && this.e.equals(gVar.e) && this.f.equals(gVar.f) && Intrinsics.f(this.f239936g, gVar.f239936g);
    }

    public final int hashCode() {
        int iHashCode = this.f239933a.hashCode() * 31;
        Clause clause = this.f239934b;
        int iC = h30.l.c(this.f239935c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        Clause clause2 = this.d;
        int iD = p.a.d(a10.b.c(this.e.f317755a, (iC + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31), 31, this.f);
        TagViewData tagViewData = this.f239936g;
        return iD + (tagViewData != null ? tagViewData.hashCode() : 0);
    }
}
