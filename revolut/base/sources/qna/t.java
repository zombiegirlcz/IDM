package qna;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        RowDelegate.Model model;
        RowDelegate.Model model2;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Integer num = domainState.d;
        List listL = v.l(num != null ? new RowDelegate.Model("TRANSACTION_AMOUNT_ACTION_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_view_list, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.profileHome_settings_item_accounts_transactions_count_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.profileHome_settings_item_accounts_transactions_count_description, u.c(Integer.valueOf(num.intValue())), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872) : null);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        s0 s0Var = new s0(4);
        Boolean bool = domainState.f247905a;
        if (bool != null) {
            model = new RowDelegate.Model("ID_HIDE_BOTTOM_BAR_SWITCHER", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_bottom_tab, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.profileHome_interfaceSettings_item_hideableBottomBar_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.profileHome_interfaceSettings_item_hideableBottomBar_subtitle, null, null, 14), null, null, 0, new vf(bool.booleanValue(), true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        s0Var.a(model);
        Boolean bool2 = domainState.f247906b;
        if (bool2 != null) {
            model2 = new RowDelegate.Model("ID_HIDE_TAB_BAR_LABELS_SWITCHER", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_roboto_regular, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_hideable_tab_bar_labels_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_hideable_tab_bar_labels_subtitle, null, null, 14), null, null, 0, new vf(bool2.booleanValue(), true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        } else {
            model2 = null;
        }
        s0Var.a(model2);
        List<d> list = domainState.f247907c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (d dVar : list) {
            RowDelegate.Model model3 = new RowDelegate.Model(j6.a.q("ID_CUSTOMISABLE_TAB_VISIBILITY_", dVar.f247899a), new RowDelegate.Model.MainImage.Image24(dVar.d, false, false, 6), dVar.f247900b, null, 0, dVar.f247901c, null, null, 0, new vf(dVar.e, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model3);
        }
        s0Var.b(arrayList.toArray(new RowDelegate.Model[0]));
        s0Var.a(domainState.f247908g ? new RowDelegate.Model("ID_CHANGE_TABS_ORDER", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_carousel, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_customize_navigation_order_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.retail_tab_bar_tab_organiser_items_customize_navigation_order_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872) : null);
        ArrayList arrayList2 = s0Var.f186433a;
        List listM = v.m(arrayList2.toArray(new qv0.i[arrayList2.size()]));
        yp0.b.k(listM, 0, 0, 0, 0, 31);
        xi0.b bVar = domainState.e;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        RowDelegate.Model model4 = bVar != null ? new RowDelegate.Model("ID_INVEST_DISPLAY_CURRENCY", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_invest, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(R$string.profileHome_settings_item_invest_display_currency_title, null, null, 14), null, 0, new CurrencyClause(bVar, ticker, null, 4), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872) : null;
        e eVar = domainState.f;
        qv0.i[] elements = {model4, eVar != null ? new RowDelegate.Model("ID_CRYPTO_DISPLAY_CURRENCY", new RowDelegate.Model.MainImage.Image24(new ResourceImage(eVar.f247903b, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), eVar.f247902a, null, 0, new CurrencyClause(eVar.f247904c, ticker, null, 4), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL2 = kotlin.collections.d.L(elements);
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        return new g(d0.E0(listL2, d0.E0(listM, listL)));
    }
}
