package w2a;

import afl.t0;
import android.os.Parcelable;
import aw0.c7;
import aw0.n6;
import aw0.o9;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.a9;
import com.revolut.core.ui_kit.delegates.c9;
import com.revolut.core.ui_kit.delegates.d9;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import ip0.b50;
import ip0.c50;
import ip0.d50;
import ip0.f50;
import ip0.g50;
import ip0.h50;
import ip0.i50;
import ip0.qd0;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294000a;

    public /* synthetic */ o(int i) {
        this.f294000a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        wmh.d state = (wmh.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        List<xmh.a> list = state.f298670a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (xmh.a aVar : list) {
            String str = aVar.f307261a;
            String str2 = aVar.f307261a;
            String strQ = j6.a.q("ipo-spotlight-widget-item-", str);
            vg vgVar = new vg(new InstrumentImage(str2, 30, null, null));
            TextClause textClause = new TextClause(aVar.f307262b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int i = R$string.invest_discover_section_ipo_spotlight_price_range_title;
            oel.l lVar = aVar.f307263c;
            t0 t0Var = lVar.f224647a;
            SmallStockCardDelegate.Model model = new SmallStockCardDelegate.Model(strQ, vgVar, textClause, new SmallStockCardDelegate.b.a(null, null, new SmallStockCardDelegate.Model.a(new TextLocalisedClause(i, v.k(new MoneyClause(t0Var.f4647a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(t0Var.f4648b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.invest_discover_section_ipo_spotlight_launch_title, u.c(com.revolut.core.ui_kit.models.j.b(c7.Companion, oi0.d.W(lVar.f224648b), new LocalDateClause$DateFormat.DayAndMonth(0))), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8)), null, 11), new wmh.c(str2), null, null, null, null, 8160);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        return !arrayList.isEmpty() ? v.k(new ListSubheaderDelegate.Model("ipo-spotlight-collections-widget-header", (Image) null, (Clause) new TextLocalisedClause(R$string.invest_discover_section_ipo_spotlight_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), new hg("ipo-spotlight-collections-widget-list", arrayList, 2, new y4(wmh.g.f298671a), null, null, false, false, null, null, 0, 0, 0, 0, 32752)) : f0.f322471a;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r29, java.lang.Object r30, java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2a.o.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v10, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    private final Object c(Object obj2, Object obj3, Object obj4) {
        Clause compositeClause;
        i50 f50Var;
        yo2.i content = (yo2.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        eVarB.add(kp2.a.c(content.f315547b, content.f315548c));
        ArrayList arrayList = content.e;
        ?? arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                yo2.d dVar = content.f;
                Object model = dVar != null ? new LabelButtonDelegate.Model("ID_CANCELLATION_BUTTON", new TextClause(dVar.f315540a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, 0, 0, 0, 2040) : null;
                if (model != null && (arrayList2 = d0.d1(d0.j1(arrayList2, u.c(model)))) == 0) {
                    arrayList2 = f0.f322471a;
                }
                ?? r4 = arrayList2;
                yp0.b.k(r4, 0, 0, 0, 0, 31);
                eVarB.addAll((Collection) r4);
                aim.e eVarB2 = u.b();
                if (!content.f315550h.isEmpty()) {
                    eVarB2.add(wo2.p.a(com.revolut.feature.bank_account_switching.api.R$string.account_switch_status_documents_title, R$drawable.uikit_icn_24_document, "ID_DOCUMENT_LINKS"));
                }
                if (!content.i.isEmpty()) {
                    eVarB2.add(wo2.p.a(com.revolut.feature.bank_account_switching.api.R$string.account_switch_status_faqs_title, R$drawable.uikit_icn_24_question, "ID_FAQ_LINKS"));
                }
                aim.e eVarA = u.a(eVarB2);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                eVarB.addAll(eVarA);
                return new wo2.i(u.a(eVarB));
            }
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            yo2.h hVar = (yo2.h) next;
            b50 b50Var = c50.Companion;
            int size = arrayList.size();
            b50Var.getClass();
            c50 c50VarA = b50.a(i, size);
            yo2.f fVar = hVar.f;
            String strN = a0.d.n("ID_STEP_", i);
            TextClause textClause = new TextClause(hVar.f315543a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            LocalDateTime localDateTime = hVar.f315545c;
            String str = hVar.f315544b;
            if (localDateTime == null && str == null) {
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                compositeClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                Object[] elements = {localDateTime != null ? new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(q0.DATETIME), null, null, 12) : null, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                m70.a.a(kotlin.jvm.internal.t0.f186434a);
                compositeClause = new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
            String str2 = hVar.e;
            if (str2 == null || str2.length() == 0 || hVar.f == yo2.f.NONE) {
                int i3 = wo2.o.f298876a[hVar.d.ordinal()];
                if (i3 == 1) {
                    c50 c50Var = c50.LAST;
                    f50Var = c50VarA == c50Var ? new f50(wo2.p.b(content), c50Var, false) : new h50(wo2.p.b(content), c50VarA);
                } else if (i3 == 2) {
                    f50Var = new f50(wo2.p.b(content), c50VarA, false);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f50Var = new g50(c50VarA);
                }
            } else {
                f50Var = new d50(new TextClause(hVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, wo2.p.b(content), c50VarA, 2);
            }
            arrayList2.add(new ProgressStepVerticalV2Delegate.Model(strN, textClause, compositeClause, f50Var, false, null, 0, 0, 0, fVar, false, false, 30704));
            i = i2;
        }
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        del.a instrumentBalance = (del.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrumentBalance, "instrumentBalance");
        kel.n nVar = instrumentBalance.e;
        BigDecimal bigDecimal = nVar.f183175c;
        BigDecimal bigDecimalSubtract = nVar.d.subtract(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        BigDecimal bigDecimalMax = bigDecimalSubtract.max(BigDecimal.ZERO);
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(R$string.trading_advanced_charts_sell_all_shares_available, null, null, 14), (Image) null, 0, false, 30);
        int i = R$plurals.wealth_common_portfolio_shares_parameterized;
        NumberClause.Format.AllDigitsAfterDot allDigitsAfterDot = new NumberClause.Format.AllDigitsAfterDot(null, null, 3);
        o9 o9Var = o9.SENSITIVE;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("AVAILABLE_CELL_DETAILS_ID", t0Var, new TextLocalisedQuantityClause(i, bigDecimal, u.c(new NumberClause(bigDecimal, allDigitsAfterDot, null, o9Var, 4)), (Style) null, 24), null, null, null, null, 0, null, false, false, null, null, 32760);
        aw0.t0 t0Var2 = new aw0.t0((Clause) new TextLocalisedClause(R$string.trading_advanced_charts_sell_all_shares_not_available, null, null, 14), (Image) null, 0, false, 30);
        int i2 = R$plurals.wealth_common_portfolio_shares_parameterized;
        Intrinsics.h(bigDecimalMax);
        return v.k(model, new CellDetailsDelegate.Model("NOT_AVAILABLE_CELL_DETAILS_ID", t0Var2, new TextLocalisedQuantityClause(i2, bigDecimalMax, u.c(new NumberClause(bigDecimalMax, new NumberClause.Format.AllDigitsAfterDot(null, null, 3), null, o9Var, 4)), (Style) null, 24), null, null, null, null, 0, null, false, false, null, null, 32760));
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        del.a instrumentBalance = (del.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrumentBalance, "instrumentBalance");
        return new aw0.g(new n6(new TextLocalisedClause(R$string.trading_advanced_charts_close_all_positions_action_no, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, wrb.d.f299537a, 508), new n6(new TextLocalisedClause(R$string.trading_advanced_charts_close_all_positions_action_yes, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "SELL_ALL_BUTTON_LOADING_TAG", false, null, new wrb.e(instrumentBalance), 492), (Clause) null, (aw0.f) null, 25);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        wt4.d content = (wt4.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        wt4.f fVar = new wt4.f(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_overdue_explainer_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_overdue_explainer_description, null, null, 14));
        aim.e eVarB = u.b();
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("credit-card-overdue-explainer-amount", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_overdue_explainer_overdue_amount, null, null, 14), (Image) null, 0, false, 30), sx4.f.b(3, null, null, content.f299771b), null, null, null, null, 0, null, false, false, null, null, 32760);
        yp0.b.l(model, R$attr.uikit_dp16, R$attr.uikit_dp8, 0, 0, null, false, 60);
        eVarB.add(model);
        eVarB.addAll(wt4.o.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_overdue_explainer_section_restrictions_title, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10), "credit-card-overdue-explainer-current-restrictions", u.c(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_overdue_explainer_section_restrictions_item_1, null, null, 14))));
        eVarB.addAll(wt4.o.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_overdue_explainer_section_outcome_title, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), 10), "credit-card-overdue-explainer-delayed-payment", v.k(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_overdue_explainer_section_outcome_item_1, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_overdue_explainer_section_outcome_item_2, null, null, 14), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_overdue_explainer_section_outcome_item_3, null, null, 14))));
        return new wt4.j(u.a(eVarB), fVar, new wt4.a(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_repay, null, null, 14)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    private final Object h(Object obj2, Object obj3, Object obj4) {
        sil.g content = (sil.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayList = content.f263662a;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        boolean z = false;
        int i2 = 0;
        for (Object obj5 : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            sil.f fVar = (sil.f) obj5;
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(a0.d.n("LIST_SUBHEADER_DELEGATE_", i2), (Image) null, (Clause) new TextClause(fVar.f263660a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            ArrayList arrayList3 = fVar.f263661b;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, i));
            ?? r102 = z;
            for (Object obj6 : arrayList3) {
                int i5 = r102 + 1;
                if (r102 < 0) {
                    v.s();
                    throw null;
                }
                sil.e eVar = (sil.e) obj6;
                arrayList4.add(new RowDelegate.Model(a0.d.g(i2, r102, "ROW_DELEGATE_", "_"), new RowDelegate.Model.MainImage.Image24(new ResourceImage(yxc.l.b(eVar.f263659c), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextClause(eVar.f263657a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(eVar.f263658b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new tf(new yy0.h(new TextClause(eVar.f263657a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, eVar.d, null, 0, 0, 0, 0, 532675544));
                r102 = i5;
                z = false;
            }
            yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
            arrayList2.add(ue0.e.J(model, arrayList4));
            i2 = i3;
            i = 10;
            z = false;
        }
        return w.u(arrayList2);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        pf pfVar;
        d9 d9Var;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Address address = (Address) pair.f186385a;
        LocationDomain locationDomain = (LocationDomain) ((od0.i) pair.f186386b).f224257a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_poa_confirm_address_home_address_title, null, null, 14);
        TextClause textClause = new TextClause(o51.a.b(address, null), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = ww8.n.f300632a[address.getFormat().ordinal()];
        if (i == 1) {
            pfVar = new pf(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_poa_confirm_address_home_address_edit, null, null, 14), null, null, false, null, null, 510);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pfVar = null;
        }
        RowDelegate.Model model = new RowDelegate.Model("ADDRESS_ROW_ITEM_ID", null, textLocalisedClause, null, 0, textClause, null, null, 0, pfVar, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867802);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        if (locationDomain != null) {
            double d = locationDomain.f78067b;
            double d5 = locationDomain.f78066a;
            d9 d9Var2 = new d9("MAP_ITEM_ID", new a9(d5, d), false, new c9(new ResourceImage(R$drawable.uikit_icn_24_location_pin, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed_90), (List) null, (ImageTransformations) null, (Clause) null, 246), u.c(new ah0.a(d5, d))), null, null, null, false, 4084);
            yp0.b.l(d9Var2, 0, 0, 0, 0, null, false, 63);
            d9Var = d9Var2;
        } else {
            d9Var = null;
        }
        Object[] elements = {model, d9Var};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        return new ww8.j(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_poa_confirm_address_new_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_poa_confirm_address_new_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.kyc_poa_confirm_address_button, null, null, 14), listL, true);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Optional optional = (Optional) pair.f186385a;
        PerformanceChart performanceChart = (PerformanceChart) pair.f186386b;
        vyg.h hVar = (vyg.h) gj7.b.m(optional);
        if (hVar == null) {
            return null;
        }
        qd0 qd0Var = hVar.f293319a ? qd0.SELECTED : qd0.UNSELECTED;
        int i = com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_performance_compare_to;
        List listK = v.k(new TextClause(hVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Float) null, (Float) null, 30));
        m70.a.t(kotlin.jvm.internal.t0.f186434a);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(28, (Integer) null, (Object) hVar, "BENCHMARK_CLICK_ID", false), null, 8)), null, 12);
        PercentageClause percentageClauseA = wyg.u.a(performanceChart, R$attr.uikit_colorGrey50);
        return new SelectableDelegate.Model("BENCHMARK_LIST_ID", new RowDelegate.Model("BENCHMARK_ROW_DELEGATE_LIST_ID", null, textLocalisedClause, null, 0, null, null, null, 0, percentageClauseA != null ? new RowDelegate.Model.c.b(percentageClauseA, null, null, false, 126) : null, false, null, false, null, null, null, null, null, null, hVar, null, 0, 0, 0, 0, 532673528), qd0Var, SelectableDelegate.b.c.f53320a, null, false, null, hVar, null, false, 32496);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0a04  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0b1f  */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r46, java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 3532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2a.o.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ o(Object obj2, int i) {
        this.f294000a = i;
    }
}
