package lk7;

import android.os.Parcelable;
import aw0.j8;
import aw0.n6;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.aj;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuote;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuotes;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.joint.impl.ui.withdraw.AmountData;
import com.revolut.feature.joint.impl.ui.withdraw.AmountInputVerificationData;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreen;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.FundPerformanceScreenContract$ActionParcel;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.MarketOrderActivity;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import hxi.a;
import ip0.ek0;
import ip0.eo0;
import ip0.go0;
import ip0.i0;
import ip0.l0;
import ip0.xk;
import ip0.y10;
import ip0.zj;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jel.b0;
import jel.j0;
import jel.n0;
import jel.o0;
import k4l.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import m3g.c0;
import mx0.f3;
import mx0.h3;
import svi.k1;
import svi.l1;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;
import zw7.a1;
import zw7.r0;
import zw7.s0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f196289b;

    public /* synthetic */ n(int i, cli.j jVar, cli.n nVar) {
        this.f196288a = i;
        this.f196289b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.MoneyClause$Format] */
    private final Object a(Object obj2, Object obj3, Object obj4) {
        ?? r102;
        TextLocalisedClause textLocalisedClause;
        ls4.q qVar = (ls4.q) this.f196289b;
        ls4.e content = (ls4.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = zhm.u.b();
        int i = content.f199611a;
        CreditCardInstalmentAnticipationQuotes creditCardInstalmentAnticipationQuotes = content.f199612b;
        List list = creditCardInstalmentAnticipationQuotes.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(Integer.valueOf(((CreditCardInstalmentAnticipationQuote) it8.next()).f68783b));
        }
        eVarB.addAll(cm4.l.a(qVar.f199626a, new TextLocalisedClause(R$string.credit_card_anticipation_select_instalment_repay_early, null, null, 14), new TextLocalisedQuantityClause(R$plurals.credit_card_instalment_repay_choose_future_instalments_instalments, Integer.valueOf(i), zhm.u.c(Integer.valueOf(i)), (Style) null, 24), i, arrayList, zhm.v.k(1, 2, 3, d0.m0(arrayList)), 32));
        ql4.v vVar = content.f199613c;
        dj0.d dVar = content.a().f;
        dj0.d dVar2 = content.a().f68786h;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("id_credit_card_instalment_anticipation_instalment_amount", new TextLocalisedClause(R$string.credit_card_anticipation_select_instalment_instalment_amount, null, null, 14), sx4.f.b(3, null, null, dVar), 0, null, null, null, null, null, false, 0, 0, 32760);
        int i2 = ls4.p.f199625a[vVar.ordinal()];
        if (i2 == 1) {
            r102 = 0;
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_anticipation_select_instalment_interest_saved, null, null, 14);
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            r102 = 0;
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_anticipation_select_instalment_discount_applied, null, null, 14);
        }
        List listK = zhm.v.k(model, new CellDetailsDelegate.Model("id_credit_card_instalment_anticipation_discount_applied", textLocalisedClause, sx4.f.b(3, r102, r102, dVar2), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("id_credit_card_instalment_anticipation_total_amount", new TextLocalisedClause(R$string.credit_card_anticipation_select_instalment_total_amount, null, null, 14), sx4.f.b(3, null, null, content.a().f68785g), 0, null, null, j2.H3, null, null, false, 0, 0, 32696);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        eVarB.add(new TextDelegate.Model("id_credit_card_instalment_anticipation_disclaimer", new TextLocalisedClause(R$string.credit_card_anticipation_select_instalment_disclaimer, zhm.u.c(creditCardInstalmentAnticipationQuotes.f68788a), null, 12), false, new ek0(0), null, null, R$attr.uikit_dp8, 0, 0, 0, 1908));
        return new ls4.l(zhm.u.a(eVarB), new ls4.k(new TextLocalisedClause(R$string.credit_card_anticipation_select_instalment_action, null, null, 14), true));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk7.n.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x062d  */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [com.revolut.core.ui_kit.internal.views.ProgressStyle, com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage, com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage, com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable$Shimmering$Companion, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations, java.lang.String, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r60, java.lang.Object r61, java.lang.Object r62) {
        /*
            Method dump skipped, instruction units count: 2012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk7.n.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object d(Object obj2, Object obj3, Object obj4) {
        lxi.a aVar = (lxi.a) this.f196289b;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((svi.k) obj2, "<unused var>");
        return yp0.b.g(zhm.u.c(new RowDelegate.Model("ID_HELP_ITEM", new RowDelegate.Model.MainImage.Image40((LayeredImage) aVar.f200577a.getValue(), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_home_support_get_help_short, null, null, 14), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856)), new ListSubheaderDelegate.Model("getHelpSubheader", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_home_something_wrong_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Object e(Object obj2, Object obj3, Object obj4) {
        List listA;
        lxi.d dVar = (lxi.d) this.f196289b;
        ?? r2 = dVar.f200583b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        k1 k1Var = (k1) pair.f186386b;
        if (k1Var instanceof k1.b) {
            listA = zhm.u.c(new RowDelegate.Model("ID_ENABLE_LOCATION_SERVICES_ITEM", new RowDelegate.Model.MainImage.Image40((LayeredImage) r2.getValue(), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_home_nearby_airports_enable_location_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_home_nearby_airports_enable_location_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        } else if (k1Var instanceof k1.a) {
            listA = zhm.u.c(new RowDelegate.Model("ID_GRANT_LOCATION_PERMISSION_ITEM", new RowDelegate.Model.MainImage.Image40((LayeredImage) r2.getValue(), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_home_nearby_airports_enable_location_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_home_nearby_airports_enable_location_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        } else if (k1Var instanceof k1.c) {
            listA = zhm.u.c(new RowDelegate.Model("noNearbyAirportsItemId", new RowDelegate.Model.MainImage.Image40((LayeredImage) r2.getValue(), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_home_nearby_airports_no_airports_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        } else {
            if (!(k1Var instanceof l1)) {
                throw new NoWhenBranchMatchedException();
            }
            hxi.a aVar = dVar.f200582a;
            List list = ((l1) k1Var).f265943a;
            a.C0897a c0897a = hxi.a.Companion;
            m70.a.c(t0.f186434a);
            listA = aVar.a("ID_NEARBY_AIRPORT_ITEM_", "", list);
        }
        return yp0.b.g(listA, new ListSubheaderDelegate.Model("nearbyAirportsSubheaderId", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_home_nearby_airports_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        ly5.m mVar = (ly5.m) this.f196289b;
        ly5.d collectionsPerformances = (ly5.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
        List list = collectionsPerformances.f200697a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((xzg.k) it8.next()).a());
        }
        List<xzg.d> listP0 = d0.P0(w.u(arrayList), new ly5.l());
        ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
        for (xzg.d dVar : listP0) {
            LinkedHashMap linkedHashMap = collectionsPerformances.f200699c;
            String str = dVar.f309976a;
            String str2 = dVar.f309976a;
            xzg.g gVar = (xzg.g) linkedHashMap.get(str);
            String strQ = j6.a.q("COLLECTION_CARD_ID_", str2);
            TextClause textClause = new TextClause(dVar.f309978c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            BigDecimal bigDecimal = gVar != null ? gVar.f309991c.f310002a : BigDecimal.ZERO;
            Intrinsics.h(bigDecimal);
            com.revolut.core.ui_kit.delegates.f fVar = new com.revolut.core.ui_kit.delegates.f(xqi.a.c(bigDecimal, false, false, false, false, false, 123), com.revolut.core.ui_kit.delegates.e.CAPTION);
            f01.c cVar = mVar.f200704a;
            String str3 = dVar.f309979g;
            if (str3 == null) {
                str3 = "";
            }
            int iA = cVar.a(str3);
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            Integer numValueOf = Integer.valueOf(iA);
            if (iA == 0) {
                numValueOf = null;
            }
            ActionCardDelegate.Model model = new ActionCardDelegate.Model(strQ, textClause, companion.i(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_apps, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), com.revolut.core.ui_kit.delegates.d.HORIZONTAL_RECT, fVar, new uw5.a(str2), null, false, 16080);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
        }
        return new ly5.g(zhm.u.c(new xk("GRID_BOX_LIST_ID", arrayList2, 2, null, null, 56)));
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        m08.l lVar = (m08.l) this.f196289b;
        s0 policy = (s0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(policy, "policy");
        g08.e eVar = lVar.o;
        r0 policy2 = a1.a(policy);
        eVar.getClass();
        Intrinsics.checkNotNullParameter(policy2, "policy");
        kotlin.jvm.internal.s0 s0Var = new kotlin.jvm.internal.s0(2);
        CounterTextDelegate.Model model = new CounterTextDelegate.Model("GET_HELP_POLICY_NUMBER_LIST_ID", new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_get_help_sections_policy_details_policy_number, null, null, 14), new t4(new TextClause(policy2.f325840b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, false, null, null, 0, 0, 0, 0, 2040);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        s0Var.a(model);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        List listK = zhm.v.k(new RowDelegate.Model("GET_HELP_CLAIM_SUPPORT_LIST_ID", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_med_cross, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 10.0f, null, null, 48), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_get_help_sections_actions_contact_claim_support_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_get_help_sections_actions_contact_claim_support_description, null, null, 14), null, null, 0, null, true, false, null, null, null, null, null, policy2, null, 0, 0, 0, 0, 1056960364), new RowDelegate.Model("GET_HELP_FAQ_LIST_ID", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_mail, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 10.0f, null, null, 48), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_get_help_sections_actions_faq_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_get_help_sections_actions_faq_description, null, null, 14), null, null, 0, null, true, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580), new RowDelegate.Model("GET_HELP_POLICY_CANCEL_LIST_ID", LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_heart_broken, Integer.valueOf(R$attr.uikit_colorRed), R$attr.uikit_colorRed_10, 10.0f, null, null, 48), null, null, new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_get_help_cancel_policy_button, null, null, 14), null, null, null, 0, null, true, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737708));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        s0Var.b((koi.j[]) listK.toArray(new koi.j[0]));
        ArrayList arrayList = s0Var.f186433a;
        return zhm.v.k(arrayList.toArray(new koi.j[arrayList.size()]));
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        i0 i0Var;
        xi0.b bVar;
        MarketOrderActivity marketOrderActivity = (MarketOrderActivity) this.f196289b;
        com.revolut.core.ui_kit.delegates.v model = (com.revolut.core.ui_kit.delegates.v) obj2;
        l0 fieldPosition = (l0) obj3;
        nx0.a field = (nx0.a) obj4;
        MarketOrderActivity.Companion companion = MarketOrderActivity.INSTANCE;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(fieldPosition, "fieldPosition");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(fieldPosition, "fieldPosition");
        Intrinsics.checkNotNullParameter(field, "field");
        int[] iArr = m1i.c.f201515a;
        int i = iArr[fieldPosition.ordinal()];
        if (i == 1) {
            i0Var = model.f54837b;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i0Var = model.f54838c;
        }
        int i2 = iArr[fieldPosition.ordinal()];
        if (i2 == 1) {
            bVar = model.f;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = model.f54839g;
        }
        xi0.b bVar2 = bVar;
        MaskedTextInputEditText editText = field.getEditText();
        j1i.b bVar3 = marketOrderActivity.f96868s0;
        if (bVar3 == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        qd0.b bVarN = bVar3.f170493c.f170473j.n();
        vc.s.j(bVarN);
        return new zp0.d(editText, bVar2, new u80.d(((s80.b) bVarN).b()), null, new k18.c(i0Var, 5, fieldPosition, marketOrderActivity), false, false, 0, false, null, 1928);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    private final Object j(Object obj2, Object obj3, Object obj4) {
        xi0.b bVar;
        TradeRevPointsTransferScreen tradeRevPointsTransferScreen = (TradeRevPointsTransferScreen) this.f196289b;
        com.revolut.core.ui_kit.delegates.v model = (com.revolut.core.ui_kit.delegates.v) obj2;
        l0 fieldPosition = (l0) obj3;
        nx0.a field = (nx0.a) obj4;
        KProperty[] kPropertyArr = TradeRevPointsTransferScreen.U;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(fieldPosition, "fieldPosition");
        Intrinsics.checkNotNullParameter(field, "field");
        int i = m2f.e.f201971a[fieldPosition.ordinal()];
        if (i == 1) {
            bVar = model.f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = model.f54839g;
        }
        xi0.b bVar2 = bVar;
        MaskedTextInputEditText editText = field.getEditText();
        qd0.b bVarN = ((t1f.l) tradeRevPointsTransferScreen.S.getValue()).f267323b.f267306p.n();
        vc.s.j(bVarN);
        return new zp0.d(editText, bVar2, new u80.d(((s80.b) bVarN).b()), null, new k7i.i(fieldPosition, tradeRevPointsTransferScreen, 7), false, false, 0, false, null, 1928);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x037d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r61, java.lang.Object r62, java.lang.Object r63) {
        /*
            Method dump skipped, instruction units count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk7.n.k(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        c0 c0Var = (c0) this.f196289b;
        m3g.p loyaltyInfo = (m3g.p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(loyaltyInfo, "loyaltyInfo");
        if (!(loyaltyInfo instanceof m3g.o)) {
            throw new NoWhenBranchMatchedException();
        }
        lxf.k kVar = c0Var.f202534b;
        int i = com.revolut.feature.travel.experiences.api.R$string.experiences_search_points_earn_rate_banner_title;
        RevPointsEarningRate revPointsEarningRate = ((m3g.o) loyaltyInfo).f202548a;
        RevPoints revPoints = revPointsEarningRate.f83976b;
        o9 o9Var = o9.NON_SENSITIVE;
        TextLocalisedClause title = new TextLocalisedClause(i, zhm.v.k(nub.a.q(revPoints, null, null, o9Var, 3), new MoneyClause(revPointsEarningRate.f83977c, new MoneyClause.Format.Shorts(false, 63), null, o9Var, 4)), null, 12);
        Intrinsics.checkNotNullParameter(title, "title");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.travel.common.api.R$string.travel_common_rev_points_banner_redeem_subtitle, null, null, 14);
        List listK = zhm.v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_gradient_background, (Integer) null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 126), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_revpoints, Integer.valueOf(R$attr.uikit_colorWhite), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, com.revolut.core.ui_kit_core.displayers.image.models.c.CENTER_INSIDE, 60));
        Float fValueOf = Float.valueOf(40.0f);
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("REV_POINTS_RATE_BANNER_ID", title, textLocalisedClause, new LayeredImage(listK, fValueOf, fValueOf, 8), null, ActionWidgetDelegate.Model.a.C0393a.f51604a, null, null, null, 1616);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listC = ((nyb.b) ((dyf.j) kVar).f121105a.f11177a).f() ? zhm.u.c(model) : null;
        return listC == null ? f0.f322471a : listC;
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        m40.g gVar = (m40.g) this.f196289b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List<w30.f> list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (w30.f fVar : list) {
            arrayList.add(new RowDelegate.Model(j6.a.q("CATEGORY_", fVar.f294081a), new RowDelegate.Model.MainImage.Image24(new ResourceImage(gVar.f202618a.a(fVar.f294083c), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextClause(fVar.f294082b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), of.SMALL, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, fVar, null, 0, 0, 0, 0, 532676592));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        m4b.f fVar = (m4b.f) this.f196289b;
        rdh.a disclaimer = (rdh.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        f0 f0Var = f0.f322471a;
        m4b.e eVar = fVar.f202688a;
        Clause textLocalisedClause = eVar.f202686a;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.retail.cfd.impl.R$string.wealth_cfd_risk_warning_title, null, null, 14);
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, new HtmlClause(0, 30, (Integer) null, (Object) null, disclaimer.f253458b), null, null, false, 28);
        Clause textLocalisedClause2 = eVar.f202687b;
        if (textLocalisedClause2 == null) {
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.retail.cfd.impl.R$string.wealth_cfd_risk_warning_button, null, null, 14);
        }
        return new cii.b(new aw0.e(false, null, null, new n6(textLocalisedClause2, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), f0Var, aVar);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        m58.p pVar = (m58.p) this.f196289b;
        yhm.r rVar = (yhm.r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        io3.d dVar = (io3.d) rVar.f314201a;
        AmountData amountData = (AmountData) rVar.f314202b;
        AmountInputVerificationData amountInputVerificationData = (AmountInputVerificationData) rVar.f314203c;
        dj0.d dVarJ = z92.f.j(dVar);
        xi0.b bVar = dVarJ.f115083b;
        boolean z = amountInputVerificationData.f76602b;
        boolean z3 = z && amountInputVerificationData.f76601a;
        m58.d dVar2 = new m58.d(bVar);
        String str = bVar.f306286a;
        return new m58.c(zhm.u.c(new CenteredAmountDelegate.Model("CENTERED_AMOUNT_ITEM_AMOUNT_ID", null, new bw0.h(amountData.f76599b, u80.o.b(new u80.g(new dj0.d(0L, bVar), u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), null, true, zhm.u.c(pVar.f202870a), Boolean.TRUE, false, false, null, null, null, null, 32708), new f3(new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14), new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_withdraw_common_title_to_main, zhm.u.c(new MoneyClause(amountData.f76598a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, false, h3.ACTIVE, false), null, null, null, true, false, dVar2, null, 1394)), z3, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_withdraw_button_title, zhm.u.c(str), null, 12), new j8(new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_home_action_withdraw, null, null, 14), new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_withdraw_common_title_balance, zhm.u.c(new MoneyClause(dVarJ, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), z ? null : new Custom(new Custom.Color.Solid(R$attr.uikit_colorRed), false, false, 254), 8), null, null, 24));
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        m8c.s sVar = (m8c.s) this.f196289b;
        m8c.j deferredPaymentData = (m8c.j) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(deferredPaymentData, "deferredPaymentData");
        r7c.a aVar = deferredPaymentData.f203471a;
        MoneyClause moneyClause = new MoneyClause(aVar.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        TextClause textClause = new TextClause(aVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_deferred_payment_second_description, null, null, 14);
        c6c.a aVar2 = sVar.f203488a;
        d6c.c receiverInfo = aVar.f252084h;
        ((q7c.b) aVar2).getClass();
        Intrinsics.checkNotNullParameter(receiverInfo, "receiverInfo");
        Image imageA = q7c.b.a(receiverInfo.f111484c, q7c.b.b(receiverInfo.f111483b));
        mx0.d dVar = mx0.d.SEMIACCENT;
        ActionsView.Item item = new ActionsView.Item("BLOCK_PAYMENT_LIST_ID", dVar, false, null, null, new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_deferred_payment_block_payments_button, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668);
        if (aVar.f252082c != r7c.b.ACTIVE) {
            item = null;
        }
        m8c.l lVar = new m8c.l(moneyClause, textClause, textLocalisedClause, imageA, zhm.v.l(item));
        sa saVar = new sa("DEBIT_NOTE_LIST_ID", (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_deferred_payment_insufficient_funds_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_deferred_payment_insufficient_funds_description, null, null, 14), zhm.u.c(new ActionsView.Item("DEBIT_NOTE_ADD_MONEY_BUTTON_LIST_ID", dVar, false, null, null, new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_deferred_payment_insufficient_funds_button, null, null, 14), null, null, null, null, false, null, null, null, null, 32668)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_legacy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4048);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        if (deferredPaymentData.f203472b) {
            saVar = null;
        }
        r7c.a deferredPayment = deferredPaymentData.f203471a;
        Intrinsics.checkNotNullParameter(deferredPayment, "deferredPayment");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_deferred_payment_next_payment, null, null, 14);
        long jP = ebm.a.P(deferredPayment.f);
        TimeClause.Format.INSTANCE.getClass();
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("DEFERRED_PAYMENT_NEXT_LIST_ID", textLocalisedClause2, new TimeClause(jP, TimeClause.Format.f57959a, null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        CellDetailsActionDelegate.Model model2 = new CellDetailsActionDelegate.Model("PAYMENT_METHOD_LIST_ID", new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_deferred_payment_payment_method, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_revolut, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.revolutpay.impl.R$string.revolut_pay_deferred_payment_payment_method_revolut_pay, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, false, null, null, 0, 0, 32736);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        qv0.i[] elements = {saVar, model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new m8c.m(lVar, kotlin.collections.d.L(elements));
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        m9l.f fVar = (m9l.f) this.f196289b;
        Set params = (Set) obj3;
        List domain = (List) obj4;
        Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(domain, "domain");
        w4l.f fVar2 = fVar.d;
        List<n9l.a> list = domain;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (n9l.a aVar : list) {
            double d = aVar.f213663c;
            Double dValueOf = Double.valueOf(d);
            if (d == -1.0d) {
                dValueOf = null;
            }
            arrayList.add(new m9l.g(aVar, dValueOf));
        }
        fVar2.j(params, arrayList);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0112  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk7.n.r(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        String str;
        mcg.m mVar = (mcg.m) this.f196289b;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("FAVORITE_EMPTY_STATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_section_favourites_results_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_stays_section_favourites_results_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D090", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.feature.travel.core.api.R$string.travel_tab_bookings_empty_state_action_title, null, null, 14), false, null, null, false, 0, 0, 32704);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model);
        }
        mVar.f204358a.getClass();
        go0 go0Var = go0.PROGRESSIVE_BLUR;
        List list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj5 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            HotelsProperty hotelsProperty = (HotelsProperty) obj5;
            String str2 = hotelsProperty.f97981a;
            com.revolut.feature_travel_hotels_models.property.Image image = (com.revolut.feature_travel_hotels_models.property.Image) d0.d0(hotelsProperty.e);
            if (image == null || (str = image.f98056c) == null) {
                IllegalStateException illegalStateException = new IllegalStateException(a0.d.r(hotelsProperty.f97982b, " hotel doesn't have images"));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                m70.a.c(t0.f186434a);
                str = "";
            }
            VoucherSmallTileDelegate.Model model2 = new VoucherSmallTileDelegate.Model(str2, new zi(new UrlImage(str, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, true, false, (Clause) null, 458746), go0Var), new TextClause(hotelsProperty.f97982b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, null, null, null, new VoucherSmallTileDelegate.d.a(new aj()), false, new eo0(mcg.m.f204357b), null, hotelsProperty, 241656);
            int i3 = R$attr.uikit_dp0;
            yp0.b.l(model2, i3, i3, i3, i3, null, false, 48);
            arrayList.add(model2);
            i = i2;
        }
        return arrayList;
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) this.f196289b;
        zzg.g content = (zzg.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        String str = content.f326737c;
        return str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : textLocalisedClause;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r30, java.lang.Object r31, java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk7.n.u(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        CellDetailsDelegate.Model modelA;
        o0 o0Var;
        o0 o0Var2;
        mgh.c cVar = (mgh.c) this.f196289b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        b0 b0Var = (b0) pair.f186385a;
        k4l.c cVar2 = ((e0) pair.f186386b).f180960m;
        BigDecimal bigDecimal = cVar2 != null ? cVar2.f180952c : null;
        n0 n0Var = b0Var.f;
        BigDecimal bigDecimal2 = n0Var != null ? n0Var.d : null;
        BigDecimal bigDecimal3 = n0Var != null ? n0Var.e : null;
        j0 j0Var = b0Var.f173415h;
        BigDecimal bigDecimal4 = (j0Var == null || (o0Var2 = j0Var.f173482a) == null) ? null : o0Var2.f173525a;
        Boolean bool = (j0Var == null || (o0Var = j0Var.f173482a) == null) ? null : o0Var.f173526b;
        CellDetailsDelegate.Model modelA2 = mgh.c.a(cVar, "FUND_PERFORMANCE_FEES_CUSTODY_FEE", com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_performance_details_fees_custody_fee, bigDecimal, null, 8);
        CellDetailsDelegate.Model modelA3 = mgh.c.a(cVar, "FUND_PERFORMANCE_FEES_MANAGEMENT_FEE", com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_performance_details_fees_management_fee, bigDecimal2, null, 8);
        CellDetailsDelegate.Model modelA4 = mgh.c.a(cVar, "FUND_PERFORMANCE_FEES_PERFORMANCE_FEE", com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_performance_details_fees_performance_fee, bigDecimal3, null, 8);
        CellDetailsDelegate.Model modelA5 = mgh.c.a(cVar, "FUND_PERFORMANCE_FEES_HURDLE_RATE", com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_performance_details_fees_hurdle_rate, bigDecimal4, null, 8);
        if (bool != null) {
            modelA = mgh.c.a(cVar, "FUND_PERFORMANCE_FEES_HIGH_WATER_MARK", com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_performance_details_fees_high_water_mark, null, Integer.valueOf(bool.booleanValue() ? com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_key_details_high_water_mark_positive : com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_key_details_high_water_mark_negative), 4);
        } else {
            modelA = null;
        }
        CellDetailsDelegate.Model[] elements = {modelA2, modelA3, modelA4, modelA5, modelA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.e0 e0Var = yp0.e0.OUTSIDE_BOX;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        return !listL.isEmpty() ? yp0.b.d(listL, new ListSubheaderDelegate.Model("FUND_PERFORMANCE_FEES_GROUP_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.wealth.private_equity.impl.R$string.wealth_private_equity_fund_details_performance_details_fees, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) FundPerformanceScreenContract$ActionParcel.ShowFeesInfo.f95829a, (Parcelable) null, 0, 0, 0, 0, 64434), e0Var, i, i, i2, i2) : listL;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0451  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r71, java.lang.Object r72, java.lang.Object r73) {
        /*
            Method dump skipped, instruction units count: 3586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk7.n.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ n(Object obj2, int i) {
        this.f196288a = i;
        this.f196289b = obj2;
    }

    public /* synthetic */ n(g gVar, q qVar) {
        this.f196288a = 0;
        this.f196289b = gVar;
    }
}
