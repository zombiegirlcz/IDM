package pf4;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tx0.i0;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f235450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f235451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TagViewData f235452c;
    public final Clause d;
    public final i0 e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f235453g;

    public p(ResourceImage navigationImage, TextLocalisedClause title, TagViewData tagViewData, TextLocalisedClause textLocalisedClause, i0 i0Var, CompositeClause compositeClause, List menuItems) {
        Intrinsics.checkNotNullParameter(navigationImage, "navigationImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f235450a = navigationImage;
        this.f235451b = title;
        this.f235452c = tagViewData;
        this.d = textLocalisedClause;
        this.e = i0Var;
        this.f = compositeClause;
        this.f235453g = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f235450a.equals(pVar.f235450a) && this.f235451b.equals(pVar.f235451b) && Intrinsics.f(this.f235452c, pVar.f235452c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f235453g, pVar.f235453g);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f235450a.hashCode() * 31, 31, this.f235451b);
        TagViewData tagViewData = this.f235452c;
        int iHashCode = (iA + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31;
        Clause clause = this.d;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        i0 i0Var = this.e;
        int iHashCode3 = (iHashCode2 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        Clause clause2 = this.f;
        return this.f235453g.hashCode() + ((iHashCode3 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
