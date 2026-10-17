package otk;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f229728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f229729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f229730c;
    public final Clause d;
    public final yy0.j e;
    public final TagViewData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f229731g;

    public g(TagViewData tagViewData, Clause clause, CompositeClause description, TextClause title, TextClause textClause, List menuItems, yy0.j endImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f229728a = title;
        this.f229729b = clause;
        this.f229730c = description;
        this.d = textClause;
        this.e = endImage;
        this.f = tagViewData;
        this.f229731g = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f229728a.equals(gVar.f229728a) && Intrinsics.f(this.f229729b, gVar.f229729b) && this.f229730c.equals(gVar.f229730c) && Intrinsics.f(this.d, gVar.d) && this.e.equals(gVar.e) && Intrinsics.f(this.f, gVar.f) && this.f229731g.equals(gVar.f229731g);
    }

    public final int hashCode() {
        int iHashCode = this.f229728a.hashCode() * 31;
        Clause clause = this.f229729b;
        int iC = h30.l.c(this.f229730c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        Clause clause2 = this.d;
        int iC2 = a10.b.c(this.e.f317755a, (iC + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
        TagViewData tagViewData = this.f;
        return this.f229731g.hashCode() + ((iC2 + (tagViewData != null ? tagViewData.hashCode() : 0)) * 31);
    }
}
