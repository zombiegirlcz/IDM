package d6j;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyClause f111597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f111598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f111599c;
    public final CompositeClause d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CurrencyImage f111600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TagViewData f111601h;
    public final List i;

    public s(CurrencyClause toolbarTitleClause, MoneyClause moneyClause, MoneyClause moneyClause2, CompositeClause compositeClause, CompositeClause compositeClause2, Clause clause, CurrencyImage currencyImage, TagViewData tagViewData, List menuItems) {
        Intrinsics.checkNotNullParameter(toolbarTitleClause, "toolbarTitleClause");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f111597a = toolbarTitleClause;
        this.f111598b = moneyClause;
        this.f111599c = moneyClause2;
        this.d = compositeClause;
        this.e = compositeClause2;
        this.f = clause;
        this.f111600g = currencyImage;
        this.f111601h = tagViewData;
        this.i = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f111597a.equals(sVar.f111597a) && Intrinsics.f(this.f111598b, sVar.f111598b) && Intrinsics.f(this.f111599c, sVar.f111599c) && this.d.equals(sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f) && this.f111600g.equals(sVar.f111600g) && Intrinsics.f(this.f111601h, sVar.f111601h) && Intrinsics.f(this.i, sVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f111597a.hashCode() * 31;
        Clause clause = this.f111598b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f111599c;
        int iC = h30.l.c(this.d, (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31);
        Clause clause3 = this.e;
        int iHashCode3 = (iC + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.f;
        int iHashCode4 = (this.f111600g.hashCode() + ((iHashCode3 + (clause4 == null ? 0 : clause4.hashCode())) * 31)) * 31;
        TagViewData tagViewData = this.f111601h;
        return this.i.hashCode() + ((iHashCode4 + (tagViewData != null ? tagViewData.hashCode() : 0)) * 31);
    }
}
