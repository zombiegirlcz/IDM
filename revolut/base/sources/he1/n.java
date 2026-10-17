package he1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f151525b = u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "NAV_BAR_ADD_ITEM_LIST_ID", new TextLocalisedClause(R$string.product_catalogue_common_action_new_item, null, null, 14), null, 60));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pd1.a f151526a;

    public n(pd1.a colorMapper) {
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
        this.f151526a = colorMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        domainState.getClass();
        return (k) iii.c.f(domainState.f151513a, new hb4.k(this, 28), new hb6.g(this, 13), new hb4.n(this, domainState, 5));
    }

    public final RowDelegate.Model b(CatalogueProduct catalogueProduct) {
        String strU0;
        String strQ = j6.a.q("CATALOGUE_ITEM_LIST_ID", catalogueProduct.f60683a);
        String strL = m70.a.l(catalogueProduct.f60684b);
        if (strL == null || (strU0 = f0.U0(2, strL)) == null) {
            strU0 = "- -";
        }
        return new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image24(new TextImage(strU0, -1, ((pd1.c) this.f151526a).c(catalogueProduct.d), 0, 10, 24, 200), false, false, 6), new TextClause(catalogueProduct.f60684b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(catalogueProduct.f, new MoneyClause.Format.Defaults(null, null, false, false, 7), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8), null, null, false, 126), false, null, false, null, null, null, null, null, null, catalogueProduct, null, 0, 0, 0, 0, 532675576);
    }
}
