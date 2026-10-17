package ieg;

import ahe.z0;
import android.os.Parcelable;
import aw0.c7;
import aw0.k7;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeSliderDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.mi;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.MerchantImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.transactions.DeclineReason;
import com.revolut.domain.models.transactions.InsufficientFunds;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceCustomerDetails;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceStatusDetails;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTax;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerRecurringSchedule;
import com.revolut.feature.freelancer.impl.R$plurals;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.mappers.InvoiceCustomerIdPayload;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardChallenge;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardSection;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardSectionInfo;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewards;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateOverride;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.common.ui.api.Toggles;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.ak0;
import ip0.ck0;
import ip0.cz;
import ip0.dz;
import ip0.en0;
import ip0.es;
import ip0.fn0;
import ip0.gn0;
import ip0.gs;
import ip0.iq;
import ip0.n8;
import ip0.qn0;
import ip0.t6;
import ip0.ut;
import ip0.v6;
import ip0.y10;
import ip0.yj0;
import ip0.yt;
import ip0.zj;
import ise.j0;
import ise.n0;
import ise.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jck.i0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import mx0.f3;
import mx0.h3;
import mx0.pc;
import org.joda.time.LocalDate;
import rlk.a;
import tx0.r2;
import yp0.e0;
import zh9.b1;
import zh9.q1;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f160744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f160745c;

    public /* synthetic */ z(Object obj2, cli.j jVar, Object obj3, int i) {
        this.f160743a = i;
        this.f160744b = jVar;
        this.f160745c = obj3;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        List list;
        List listC;
        ihd.b bVar = (ihd.b) this.f160744b;
        ihd.o oVar = (ihd.o) this.f160745c;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list2 = oVar.f161385b;
        boolean z = oVar.e;
        String str = oVar.d;
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        int i = oVar.f161386c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : content) {
            if (list2.contains(((WatchlistItem) obj5).getId())) {
                arrayList.add(obj5);
            } else {
                arrayList2.add(obj5);
            }
        }
        boolean z3 = list2.size() == i;
        zhm.q qVarK1 = zhm.d0.k1(list2);
        int iB = q0.b(zhm.w.t(qVarK1, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it8 = qVarK1.iterator();
        while (true) {
            kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it8;
            if (!((Iterator) dVar.f186416c).hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) dVar.next();
            linkedHashMap.put((String) indexedValue.f186392b, Integer.valueOf(indexedValue.f186391a));
        }
        ListSubheaderDelegate.Model modelB = ihd.b.b();
        List listJ = nkm.y.J(nkm.y.x(nkm.y.n(zhm.d0.Q(arrayList2), new ho6.n(str, 26)), new gae.a(bVar, z3, 15)));
        yp0.b.k(listJ, 0, 0, 0, 0, 31);
        if (z) {
            list = f0.f322471a;
        } else {
            List listP0 = zhm.d0.P0(arrayList, new z0(linkedHashMap, 1));
            ArrayList arrayList3 = new ArrayList(zhm.w.t(listP0, 10));
            Iterator it9 = listP0.iterator();
            while (it9.hasNext()) {
                arrayList3.add(bVar.c((WatchlistItem) it9.next(), true, false));
            }
            yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
            boolean zIsEmpty = arrayList3.isEmpty();
            List list3 = arrayList3;
            if (zIsEmpty) {
                if (listJ.isEmpty()) {
                    listC = f0.f322471a;
                } else {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.shared_watchlist_widget_customisation_no_items, null, null, 14);
                    ck0 ck0Var = new ck0(yj0.CENTER_HORIZONTAL);
                    int i2 = R$attr.uikit_dp32;
                    TextDelegate.Model model = new TextDelegate.Model("LIST_ID_SELECTED_EMPTY", textLocalisedClause, false, ck0Var, null, null, i2, i2, 0, 0, 1652);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    listC = zhm.u.c(model);
                }
                list3 = listC;
            }
            list = list3;
        }
        if (!listJ.isEmpty()) {
            listJ = i2b.a.q(modelB, listJ);
        }
        List listO = i2b.a.o(list, listJ);
        if (listO.isEmpty()) {
            if (str.length() > 0) {
                ListSubheaderDelegate.Model modelB2 = ihd.b.b();
                FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("LIST_ID_SEARCH_EMPTY", new TextLocalisedClause(R$string.shared_watchlist_assets_search_empty_state_title, null, null, 14), new TextLocalisedClause(R$string.shared_watchlist_assets_search_empty_state_description, zhm.u.c(str), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31712);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                listO = i2b.a.r(modelB2, model2);
            } else if (z) {
                listO = f0.f322471a;
            } else {
                FullScreenStateDelegate.Model model3 = new FullScreenStateDelegate.Model("LIST_ID_EMPTY", new TextLocalisedClause(R$string.shared_watchlist_rev10_watchlist_empty_title, null, null, 14), new TextLocalisedClause(R$string.shared_watchlist_rev10_watchlist_empty_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D241", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_empty_watchlist_add_new_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1856);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                listO = zhm.u.c(model3);
            }
        }
        return listO;
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        boolean z;
        anl.j jVar = (anl.j) this.f160744b;
        ilk.d dVar = (ilk.d) this.f160745c;
        List availableReasons = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(availableReasons, "content");
        onh.b bVar = (onh.b) jVar.f7820b;
        iha.a aVar = dVar.f162253b;
        Intrinsics.checkNotNullParameter(availableReasons, "availableReasons");
        ((rlk.a) ((rlk.b) bVar.f226950b)).getClass();
        a.C1408a c1408a = new a.C1408a();
        Iterator it8 = availableReasons.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            ArrayList arrayList = c1408a.f255091a;
            if (!zHasNext) {
                Object objO0 = zhm.d0.o0(arrayList);
                qv0.n nVar = objO0 instanceof qv0.n ? (qv0.n) objO0 : null;
                if (nVar != null) {
                    yp0.b.c(nVar, R$attr.uikit_dp96);
                }
                return arrayList;
            }
            iha.a aVar2 = (iha.a) it8.next();
            switch (rlk.c.f255092a[aVar2.ordinal()]) {
                case 1:
                    String id10 = aVar2.name();
                    z = aVar2 == aVar;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    arrayList.add(a.C1408a.a(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_downgrade_reason_benefits_not_useful, null, null, 14), id10, z));
                    break;
                case 2:
                    String id11 = aVar2.name();
                    z = aVar2 == aVar;
                    Intrinsics.checkNotNullParameter(id11, "id");
                    arrayList.add(a.C1408a.a(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_downgrade_reason_too_expensive, null, null, 14), id11, z));
                    break;
                case 3:
                    String id12 = aVar2.name();
                    z = aVar2 == aVar;
                    Intrinsics.checkNotNullParameter(id12, "id");
                    arrayList.add(a.C1408a.a(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_downgrade_reason_unhappy_with_support, null, null, 14), id12, z));
                    break;
                case 4:
                    String id13 = aVar2.name();
                    z = aVar2 == aVar;
                    Intrinsics.checkNotNullParameter(id13, "id");
                    arrayList.add(a.C1408a.a(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_downgrade_reason_unhappy_with_plan_changes, null, null, 14), id13, z));
                    break;
                case 5:
                    String id14 = aVar2.name();
                    z = aVar2 == aVar;
                    Intrinsics.checkNotNullParameter(id14, "id");
                    arrayList.add(a.C1408a.a(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_downgrade_reason_features_dont_work, null, null, 14), id14, z));
                    break;
                case 6:
                    String id15 = aVar2.name();
                    z = aVar2 == aVar;
                    Intrinsics.checkNotNullParameter(id15, "id");
                    arrayList.add(a.C1408a.a(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_downgrade_reason_benefits_not_available, null, null, 14), id15, z));
                    break;
                case 7:
                    String id16 = aVar2.name();
                    z = aVar2 == aVar;
                    Intrinsics.checkNotNullParameter(id16, "id");
                    arrayList.add(a.C1408a.a(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_downgrade_reason_upgraded_accidentally, null, null, 14), id16, z));
                    break;
                case 8:
                    String id17 = aVar2.name();
                    z = aVar2 == aVar;
                    Intrinsics.checkNotNullParameter(id17, "id");
                    arrayList.add(a.C1408a.a(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_downgrade_reason_dont_need_benefits_anymore, null, null, 14), id17, z));
                    break;
                case 9:
                    String id18 = aVar2.name();
                    z = aVar2 == aVar;
                    Intrinsics.checkNotNullParameter(id18, "id");
                    arrayList.add(a.C1408a.a(new TextLocalisedClause(com.revolut.retail.feature.pricing_plans.ui.impl.R$string.plan_cancellation_downgrade_reason_travel_insurance_removal, null, null, 14), id18, z));
                    break;
                case 10:
                    String id19 = aVar2.name();
                    z = aVar2 == aVar;
                    Intrinsics.checkNotNullParameter(id19, "id");
                    arrayList.add(a.C1408a.a(new TextLocalisedClause(R.string.common_action_other, null, null, 14), id19, z));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        ((LargeSliderDelegate) this.f160744b).f52627c.onNext(new gs((es) this.f160745c, new cy0.a(((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue())));
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ieg.z.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        en0 logoType;
        boolean z;
        Data data;
        Data data2;
        CompositeClause compositeClause;
        Clause textLocalisedClause;
        LocalDate localDate;
        List list;
        List listG;
        ResourceImage resourceImage;
        ResourceImage resourceImage2;
        com.revolut.feature.three_ds_verification.impl.ui.sceen.g gVar = (com.revolut.feature.three_ds_verification.impl.ui.sceen.g) this.f160744b;
        j0 j0Var = (j0) this.f160745c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        ThreeDSTransaction threeDSTransaction = (ThreeDSTransaction) pair.f186385a;
        n0 n0Var = (n0) pair.f186386b;
        Data data3 = j0Var.f;
        Data data4 = j0Var.f168204h;
        Data data5 = j0Var.f168203g;
        Data data6 = j0Var.i;
        boolean z3 = j0Var.k;
        TextLocalisedClause textLocalisedClauseB = gVar.b(threeDSTransaction, n0Var.d);
        InsufficientFunds insufficientFunds = threeDSTransaction.o;
        long j2 = n0Var.f168221c;
        int i = r0.f168234a[threeDSTransaction.e.ordinal()];
        if (i == 1) {
            logoType = en0.Mastercard;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            logoType = en0.Visa;
        }
        fn0 revolutLogoType = fn0.RETAIL;
        Intrinsics.checkNotNullParameter("HEADER_LIST_ID", "listId");
        Intrinsics.checkNotNullParameter(logoType, "logoType");
        Intrinsics.checkNotNullParameter(revolutLogoType, "revolutLogoType");
        gn0 gn0Var = new gn0("HEADER_LIST_ID", logoType, null, revolutLogoType);
        np0.b bVar = new np0.b("TIMER_LIST_ID", threeDSTransaction.d, j2, textLocalisedClauseB);
        TextClause textClause = new TextClause(threeDSTransaction.k, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TimeClause timeClause = new TimeClause(threeDSTransaction.f60535b, TimeClause.Format.TimeDefault.f57977b, null, null, 12);
        long j3 = threeDSTransaction.f;
        xi0.a aVar = xi0.b.Companion;
        String str = threeDSTransaction.f60537g;
        aVar.getClass();
        RowDelegate.Model model = new RowDelegate.Model("TRANSACTION_LIST_ID", new MerchantImage(null, ((wjf.e) gVar.f90441b).f(threeDSTransaction.f60539j), threeDSTransaction.f60538h), null, null, textClause, timeClause, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(j3, xi0.a.a(str)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073739628);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listK = zhm.v.k(gn0Var, bVar, model);
        aim.e eVarB = zhm.u.b();
        h93.f0 card = n0Var.f168219a;
        String str2 = n0Var.d;
        ia3.r rVar = gVar.f90440a;
        if (insufficientFunds != null) {
            z = z3;
            data = data4;
            data2 = data6;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_subtitle_available_balance, zhm.u.c(new MoneyClause(insufficientFunds.f60532b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 8);
        } else {
            z = z3;
            data = data4;
            data2 = data6;
            m93.e eVar = m93.f.Companion;
            Intrinsics.checkNotNullParameter(card, "card");
            String str3 = card.f150115j;
            if (str3 == null || (localDate = card.f150120q) == null) {
                compositeClause = null;
            } else {
                String string = localDate.toString("MM/YY");
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                compositeClause = new CompositeClause(zhm.v.k(new TextClause(p.a.p("··", str3, ", "), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
            }
            textLocalisedClause = compositeClause;
        }
        eVarB.add(new RowDelegate.Model("CARD_LIST_ID", new RowDelegate.Model.MainImage.Image40(((ia3.h) gVar.f90442c).b(card.f150114h, false), insufficientFunds != null ? new WarningCircleBadge(dw0.a.Suspicious) : null, null, false, null, false, 60), rVar.n(card, str2, Boolean.valueOf(z), false), null, 0, textLocalisedClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        eVarB.addAll(insufficientFunds == null ? f0.f322471a : (List) iii.c.f(data3, new isd.a(8), new qn0(25), new a0i.a(gVar, 24, insufficientFunds, data5)));
        aim.e eVarA = zhm.u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        Clause clause = (Clause) data2.getContent();
        TextDelegate.Model model2 = clause != null ? new TextDelegate.Model("MOVE_MONEY_FOOTER_LIST_ID", clause, false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036) : null;
        aim.e eVarB2 = zhm.u.b();
        if (!gVar.a()) {
            eVarB2.addAll(listK);
            eVarB2.add(new ListSubheaderDelegate.Model("SUBHEADER_LIST_ID", null, new TextLocalisedClause(R.string.transaction_threeds_payment_from, null, null, 14), null, null, null, aw0.j0.TRANSPARENT, null, null, false, false, null, null, 0, R$attr.uikit_dp8, 0, 0, 14679994));
        }
        eVarB2.addAll(eVarA);
        if (insufficientFunds == null || data3.getContent() != null || data3.getLoading()) {
            list = f0.f322471a;
        } else {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.cards_core.R$string.three_ds_insufficient_balance_title, null, null, 14);
            AccountWrapper accountWrapper = (AccountWrapper) data.getContent();
            List listC = zhm.u.c(new sa("INSUFFICIENT_FUNDS_WIDGET_LIST_ID", (Clause) textLocalisedClause2, (Clause) (accountWrapper != null ? new TextLocalisedClause(com.revolut.feature.cards_core.R$string.three_ds_verification_section_insufficient_balance_description_pocket_name, zhm.u.c(accountWrapper.f97225b), null, 12) : new TextLocalisedClause(com.revolut.feature.cards_core.R$string.three_ds_insufficient_balance_subtitle, null, null, 14)), (List) null, false, (Image) com.revolut.feature.three_ds_verification.impl.ui.sceen.g.d(), (y10) null, (Object) null, 4056));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            list = listC;
        }
        eVarB2.addAll(list);
        if (n0Var.e) {
            List list2 = threeDSTransaction.f60544q;
            if (list2.isEmpty()) {
                listG = f0.f322471a;
            } else if (list2.size() == 1) {
                DeclineReason declineReason = (DeclineReason) zhm.d0.b0(list2);
                TextClause textClause2 = new TextClause(declineReason.f60528a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause3 = new TextClause(declineReason.f60529b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                int i2 = r0.f168236c[declineReason.f60530c.ordinal()];
                if (i2 == 1) {
                    resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    resourceImage2 = com.revolut.feature.three_ds_verification.impl.ui.sceen.g.d();
                }
                List listC2 = zhm.u.c(new sa("SINGLE_DECLINE_REASON", textClause2, textClause3, null, resourceImage2, 8112));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                listG = listC2;
            } else {
                List list3 = list2;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                int i3 = 0;
                for (Object obj5 : list3) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    DeclineReason declineReason2 = (DeclineReason) obj5;
                    String strN = a0.d.n("MULTIPLE_DECLINE_REASONS_", i3);
                    TextClause textClause4 = new TextClause(declineReason2.f60528a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TextClause textClause5 = new TextClause(declineReason2.f60529b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    yt ytVar = yt.TOP;
                    int i6 = r0.f168236c[declineReason2.f60530c.ordinal()];
                    if (i6 == 1) {
                        resourceImage = new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        resourceImage = com.revolut.feature.three_ds_verification.impl.ui.sceen.g.d();
                    }
                    arrayList.add(new ListCellDelegate.Model(strN, new j8(resourceImage, ytVar), textClause4, textClause5, false, null, null, 0, 0, 0, 0, 4080));
                    i3 = i5;
                }
                String str4 = threeDSTransaction.f60546s;
                if (str4 != null) {
                    listG = yp0.b.g(arrayList, new ListSubheaderDelegate.Model("MULTIPLE_DECLINE_REASONS_HEADER", (Image) null, (Clause) new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124);
                } else {
                    yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                    listG = arrayList;
                }
            }
        } else {
            listG = f0.f322471a;
        }
        eVarB2.addAll(listG);
        if (model2 != null) {
            eVarB2.add(model2);
        }
        return zhm.u.a(eVarB2);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        List listA;
        List listB;
        List listK;
        List listE0;
        Clause textLocalisedClause;
        iug.n nVar = (iug.n) this.f160744b;
        iug.e eVar = (iug.e) this.f160745c;
        TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        TradingAccount tradingAccount = eVar.f168592b;
        hel.b tradingContext = tradingLegalEntityInformation.f105106a;
        fug.d dVar = nVar.f168602a;
        if (tradingContext == null) {
            listE0 = f0.f322471a;
        } else {
            int i = iug.m.f168601a[nVar.f168604c.f94927b.ordinal()];
            if (i == 1) {
                if (tradingAccount instanceof TradingAccount.GIA) {
                    TradingAccount.GIA account = (TradingAccount.GIA) tradingAccount;
                    Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                    Intrinsics.checkNotNullParameter(account, "account");
                    listB = com.revolut.shared.feature.wealth.models.trading_accounts.d.c(account) ? zhm.d0.E0(zhm.v.k(new ut("CLOSURE_CONSENT_FIRST_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_consent_first_point_joint_gia, null, null, 14), 1, false, null, null, 1016), new ut("CLOSURE_CONSENT_SECOND_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_consent_second_point_joint_gia, null, null, 14), 2, false, null, null, 1016), new ut("CLOSURE_CONSENT_THIRD_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_consent_third_point_joint_gia, null, null, 14), 3, false, null, null, 1016), new ut("CLOSURE_CONSENT_FOURTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_consent_fourth_point_joint_gia, null, null, 14), 4, false, null, null, 1016), new ut("CLOSURE_CONSENT_FIFTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_consent_fifth_point_joint_gia, null, null, 14), 5, false, null, null, 1016), new ut("CLOSURE_CONSENT_SIXTHS_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_consent_sixth_point_joint_gia, null, null, 14), 6, false, null, null, 1016)), zhm.u.c(new TextDelegate.Model("CLOSURE_CONSENT_TITLE_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_consent_title_joint_gia, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new ck0(0), null, null, 0, 0, 0, 0, 2036))) : fug.d.b(tradingContext, com.revolut.retail.wealth.resources.R$string.wealth_account_closure_consent_title);
                    yp0.b.k(listB, 0, 0, 0, 0, 31);
                } else if (tradingAccount instanceof TradingAccount.Margin) {
                    Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                    listB = fug.d.b(tradingContext, com.revolut.feature.wealth.account_closure.impl.R$string.wealth_margin_account_closure_consent_screen_consent_title);
                    yp0.b.k(listB, 0, 0, 0, 0, 31);
                } else if (tradingAccount instanceof TradingAccount.Robo) {
                    Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                    switch (fug.e.f138208a[tradingContext.ordinal()]) {
                        case 1:
                            listK = f0.f322471a;
                            break;
                        case 2:
                            listK = zhm.v.k(new TextDelegate.Model("CLOSURE_CONSENT_TITLE_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_consent_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new ck0(0), null, null, 0, 0, 0, 0, 2036), new ut("CLOSURE_CONSENT_FIRST_POINT", new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_1, (List) null, (Integer) null, (Object) null, 30), 1, false, null, null, 1016), new ut("CLOSURE_CONSENT_SECOND_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_2, null, null, 14), 2, false, null, null, 1016), new ut("CLOSURE_CONSENT_THIRD_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_3, null, null, 14), 3, false, null, null, 1016), new ut("CLOSURE_CONSENT_FOURTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_4, null, null, 14), 4, false, null, null, 1016), new ut("CLOSURE_CONSENT_FIFTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_5, null, null, 14), 5, false, null, null, 1016), new ut("CLOSURE_CONSENT_FIFTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_6, null, null, 14), 6, false, null, null, 1016), new ut("CLOSURE_CONSENT_FIFTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_7, null, null, 14), 7, false, null, null, 1016), new ut("CLOSURE_CONSENT_FIFTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_8, null, null, 14), 8, false, null, null, 1016));
                            break;
                        case 3:
                            listK = zhm.v.k(new TextDelegate.Model("CLOSURE_CONSENT_TITLE_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_consent_description_eea, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new ck0(0), null, null, 0, 0, 0, 0, 2036), new ut("CLOSURE_CONSENT_FIRST_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_1_eea, null, null, 14), 1, false, null, null, 1016), new ut("CLOSURE_CONSENT_SECOND_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_2_eea, null, null, 14), 2, false, null, null, 1016), new ut("CLOSURE_CONSENT_THIRD_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_3_eea, null, null, 14), 3, false, null, null, 1016), new ut("CLOSURE_CONSENT_FOURTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_4_eea, null, null, 14), 4, false, null, null, 1016), new ut("CLOSURE_CONSENT_FIFTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_5_eea, null, null, 14), 5, false, null, null, 1016));
                            break;
                        case 4:
                        case 5:
                        case 7:
                            listK = zhm.v.k(new TextDelegate.Model("CLOSURE_CONSENT_TITLE_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_consent_description_sg, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new ck0(0), null, null, 0, 0, 0, 0, 2036), new ut("CLOSURE_CONSENT_FIRST_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_1_sg, null, null, 14), 1, false, null, null, 1016), new ut("CLOSURE_CONSENT_SECOND_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_2_sg, null, null, 14), 2, false, null, null, 1016), new ut("CLOSURE_CONSENT_THIRD_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_3_sg, null, null, 14), 3, false, null, null, 1016), new ut("CLOSURE_CONSENT_FOURTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_4_sg, null, null, 14), 4, false, null, null, 1016), new ut("CLOSURE_CONSENT_FIFTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_5_sg, null, null, 14), 5, false, null, null, 1016), new ut("CLOSURE_CONSENT_SIXTHS_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_6_sg, null, null, 14), 6, false, null, null, 1016), new ut("CLOSURE_CONSENT_SIXTHS_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_7_sg, null, null, 14), 7, false, null, null, 1016), new ut("CLOSURE_CONSENT_SIXTHS_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_8_sg, null, null, 14), 8, false, null, null, 1016), new ut("CLOSURE_CONSENT_SIXTHS_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_9_sg, null, null, 14), 9, false, null, null, 1016), new ut("CLOSURE_CONSENT_SIXTHS_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_10_sg, null, null, 14), 10, false, null, null, 1016));
                            break;
                        case 6:
                            listK = zhm.v.k(new TextDelegate.Model("CLOSURE_CONSENT_TITLE_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_strategies_account_closure_consent_description_uk, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new ck0(0), null, null, 0, 0, 0, 0, 2036), new ut("CLOSURE_CONSENT_FIRST_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_strategies_account_closure_terms_1_uk, null, null, 14), 1, false, null, null, 1016), new ut("CLOSURE_CONSENT_SECOND_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_strategies_account_closure_terms_2_uk, null, null, 14), 2, false, null, null, 1016), new ut("CLOSURE_CONSENT_THIRD_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_strategies_account_closure_terms_3_uk, null, null, 14), 3, false, null, null, 1016), new ut("CLOSURE_CONSENT_FOURTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_strategies_account_closure_terms_4_uk, null, null, 14), 4, false, null, null, 1016), new ut("CLOSURE_CONSENT_FIFTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_strategies_account_closure_terms_5_uk, null, null, 14), 5, false, null, null, 1016));
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    listB = listK;
                    yp0.b.k(listB, 0, 0, 0, 0, 31);
                } else {
                    if (!(tradingAccount instanceof TradingAccount.TaxAdvantage)) {
                        if (!(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException((tradingAccount.getF105262a() + " Consent in account closure not supported").toString());
                    }
                    TradingAccount.TaxAdvantage taxAdvantageAccount = (TradingAccount.TaxAdvantage) tradingAccount;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                    Intrinsics.checkNotNullParameter(taxAdvantageAccount, "taxAdvantageAccount");
                    if (taxAdvantageAccount instanceof TradingAccount.TaxAdvantage.Isa) {
                        listA = fug.d.a(tradingContext);
                    } else if (taxAdvantageAccount instanceof TradingAccount.TaxAdvantage.Pea) {
                        switch (fug.e.f138208a[tradingContext.ordinal()]) {
                            case 1:
                            case 2:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                listA = f0.f322471a;
                                break;
                            case 3:
                                listA = zhm.v.k(new TextDelegate.Model("CLOSURE_CONSENT_TITLE_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_pea_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new ck0(0), null, null, 0, 0, 0, 0, 2036), new ut("CLOSURE_CONSENT_FIRST_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_pea_first_point, null, null, 14), 1, false, null, null, 1016), new ut("CLOSURE_CONSENT_SECOND_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_pea_second_point, null, null, 14), 2, false, null, null, 1016), new ut("CLOSURE_CONSENT_THIRD_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_pea_third_point, null, null, 14), 3, false, null, null, 1016), new ut("CLOSURE_CONSENT_FOURTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_pea_fourth_point, null, null, 14), 4, false, null, null, 1016), new ut("CLOSURE_CONSENT_FIFTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_pea_fifth_point, null, null, 14), 5, false, null, null, 1016));
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        if (!(taxAdvantageAccount instanceof TradingAccount.TaxAdvantage.JIsa)) {
                            if (taxAdvantageAccount instanceof TradingAccount.TaxAdvantage.Unknown) {
                                throw new IllegalStateException("Unknown TAA not supported");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        listA = fug.d.a(tradingContext);
                    }
                    listB = listA;
                    yp0.b.k(listB, 0, 0, 0, 0, 31);
                }
                listE0 = listB;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                sa saVar = new sa("CLOSURE_CONSENT_WARNING_ID", (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_private_markets_warning_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_private_markets_warning_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusWarning), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4056);
                yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
                List listC = zhm.u.c(saVar);
                switch (fug.e.f138208a[tradingContext.ordinal()]) {
                    case 1:
                    case 2:
                    case 4:
                    case 5:
                    case 7:
                        listE0 = f0.f322471a;
                        break;
                    case 3:
                        List listK2 = zhm.v.k(new TextDelegate.Model("CLOSURE_CONSENT_TITLE_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_private_markets_title_eea, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new ck0(0), null, null, 0, 0, 0, 0, 2036), new ut("CLOSURE_CONSENT_FIRST_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_private_markets_first_point_eea, null, null, 14), 1, false, null, null, 1016), new ut("CLOSURE_CONSENT_SECOND_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_private_markets_second_point_eea, null, null, 14), 2, false, null, null, 1016), new ut("CLOSURE_CONSENT_THIRD_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_private_markets_third_point_eea, null, null, 14), 3, false, null, null, 1016), new ut("CLOSURE_CONSENT_FOURTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_private_markets_fourth_point_eea, null, null, 14), 4, false, null, null, 1016));
                        yp0.b.k(listK2, 0, 0, 0, 0, 31);
                        listE0 = zhm.d0.E0(listK2, listC);
                        break;
                    case 6:
                        List listK3 = zhm.v.k(new TextDelegate.Model("CLOSURE_CONSENT_TITLE_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_private_markets_title_uk, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new ck0(0), null, null, 0, 0, 0, 0, 2036), new ut("CLOSURE_CONSENT_FIRST_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_private_markets_first_point_uk, null, null, 14), 1, false, null, null, 1016), new ut("CLOSURE_CONSENT_SECOND_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_private_markets_second_point_uk, null, null, 14), 2, false, null, null, 1016), new ut("CLOSURE_CONSENT_THIRD_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_private_markets_third_point_uk, null, null, 14), 3, false, null, null, 1016), new ut("CLOSURE_CONSENT_FOURTH_POINT", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_consent_private_markets_fourth_point_uk, null, null, 14), 4, false, null, null, 1016));
                        yp0.b.k(listK3, 0, 0, 0, 0, 31);
                        listE0 = zhm.d0.E0(listK3, listC);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }
        InputChecklistDelegate.Model model = new InputChecklistDelegate.Model("ACCOUNT_CLOSURE_CONSENT_CHECKBOX_ID", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_consent_checkbox_text, null, null, 14), eVar.f168593c, false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        TradingAccount tradingAccount2 = eVar.f168592b;
        if (tradingLegalEntityInformation.f105106a == null) {
            nVar.getClass();
            textLocalisedClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            int i2 = iug.m.f168601a[nVar.f168604c.f94927b.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_private_markets_account_closure_terms_title, null, null, 14);
            } else if (tradingAccount2 instanceof TradingAccount.GIA) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.shared.feature.wealth.models.trading_accounts.d.c(tradingAccount2) ? com.revolut.retail.wealth.resources.R$string.wealth_account_closure_title_joint_gia : com.revolut.retail.wealth.resources.R$string.wealth_account_closure_title, null, null, 14);
            } else if (tradingAccount2 instanceof TradingAccount.Margin) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.wealth_margin_account_closure_consent_screen_title, null, null, 14);
            } else if (tradingAccount2 instanceof TradingAccount.Robo) {
                textLocalisedClause = new TextLocalisedClause(((jte.d) nVar.f168603b).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? com.revolut.retail.wealth.resources.R$string.wealth_strategies_account_closure_terms_title : com.revolut.retail.wealth.resources.R$string.wealth_robo_account_closure_terms_title, null, null, 14);
            } else if ((tradingAccount2 instanceof TradingAccount.TaxAdvantage.Isa) || (tradingAccount2 instanceof TradingAccount.TaxAdvantage.JIsa)) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_isa_title, null, null, 14);
            } else {
                if (!(tradingAccount2 instanceof TradingAccount.TaxAdvantage.Pea)) {
                    if ((tradingAccount2 instanceof TradingAccount.MoneyMarketFunds) || (tradingAccount2 instanceof TradingAccount.TaxAdvantage.Unknown) || (tradingAccount2 instanceof TradingAccount.PaperTrading) || (tradingAccount2 instanceof TradingAccount.Unknown)) {
                        throw new IllegalStateException("Commodities account closure not supported");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_account_closure_terms_pea_title, null, null, 14);
            }
        }
        return new iug.i(textLocalisedClause, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), zhm.d0.F0(model, listE0), eVar.f168593c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj2, Object obj3, Object obj4) {
        boolean z;
        FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails;
        sa saVar;
        Map map;
        char c2;
        Collection collectionK;
        String strConcat;
        TextLocalisedClause textLocalisedClause;
        Clause textClause;
        TextLocalisedClause textLocalisedClause2;
        FreelancerInvoice freelancerInvoice;
        Clause clauseA;
        InputTextDelegate.Model model;
        Clause compositeClause;
        Object textClause2;
        int i;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.h hVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.h) this.f160744b;
        com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a aVar = (com.revolut.feature.freelancer.impl.ui.invoice.create.screen.a) this.f160745c;
        ix6.q qVar = (ix6.q) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(qVar, "<destruct>");
        FreelancerInvoice invoice = qVar.f169408a;
        InvoiceTemplate invoiceTemplate = qVar.f169409b;
        a.b bVar = aVar.f73838b;
        boolean z3 = aVar.f;
        lx6.d dVar = hVar.d;
        lr6.f0 f0Var = (lr6.f0) bVar.f73843a.getContent();
        lr6.c cVar = f0Var != null ? f0Var.f199402a : null;
        aim.e eVarB = zhm.u.b();
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        boolean zW = mif.e0.w(invoice);
        xi0.b bVar2 = invoice.i;
        FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails2 = invoice.f73385r;
        String str = invoice.d;
        FreelancerInvoiceCustomerDetails customerDetails = invoice.f73383p;
        if (zW) {
            z = z3;
            freelancerInvoiceStatusDetails = freelancerInvoiceStatusDetails2;
            saVar = new sa("ITEM_ID_BANNER_RECURRING_INVOICE_SENT", (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_recurring_note_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_recurring_note_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorStatusDanger), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4056);
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        } else {
            z = z3;
            freelancerInvoiceStatusDetails = freelancerInvoiceStatusDetails2;
            saVar = null;
        }
        eVarB.addAll(zhm.v.l(saVar));
        if (cVar == lr6.c.PENDING && !bVar.f73844b) {
            eVarB.add(hVar.f73856a.a());
        }
        Map map2 = aVar.d;
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        String customerId = invoice.f73381m;
        if (customerDetails == null || customerId == null) {
            map = map2;
            c2 = 1;
            ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("ITEM_ID_CUSTOMER_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_customer_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            RowDelegate.Model model3 = new RowDelegate.Model("ITEM_ID_CUSTOMER_PLACEHOLDER", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_person, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 8.0f, Float.valueOf(24.0f), null, 32), z ? new WarningCircleBadge(dw0.a.Info) : null, null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_customer_action_select_customer, null, null, 14), null, 0, z ? new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_item_error_required, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 10) : null, null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_customer_action_select, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            collectionK = zhm.v.k(model2, model3);
        } else {
            c2 = 1;
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_customer_title, null, null, 14);
            if (mif.e0.w(invoice)) {
                map = map2;
                textLocalisedClause4 = null;
            } else {
                map = map2;
                textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_action_change, null, null, 14);
            }
            ListSubheaderDelegate.Model model4 = new ListSubheaderDelegate.Model("ITEM_ID_CUSTOMER_SUBHEADER", (Image) null, (Clause) textLocalisedClause5, (ResourceImage) null, false, false, (Clause) textLocalisedClause4, true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
            Intrinsics.checkNotNullParameter(customerId, "customerId");
            Intrinsics.checkNotNullParameter(customerDetails, "customerDetails");
            String strConcat2 = "ITEM_ID_CUSTOMER_PREFIX_".concat(customerId);
            TextClause textClause3 = new TextClause(customerDetails.f73391a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = customerDetails.f73392b;
            RowDelegate.Model model5 = new RowDelegate.Model(strConcat2, new UserAvatarImage(new UserNamePlaceholder.Default(customerDetails.f73391a, 0), null, null, 6), null, null, textClause3, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, true, false, null, null, null, null, null, new InvoiceCustomerIdPayload(customerId), null, 0, 0, 0, 0, 1056960364);
            yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
            collectionK = zhm.v.k(model4, model5);
        }
        eVarB.addAll(collectionK);
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        aim.e eVarB2 = zhm.u.b();
        eVarB2.add(new ListSubheaderDelegate.Model("ITEM_ID_DETAILS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_details_title_v2, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_details_number_title, null, null, 14);
        kx6.b bVar3 = dVar.f200533c;
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        if (kotlin.text.d0.W(str)) {
            m70.a.c(t0.f186434a);
            strConcat = "";
        } else {
            strConcat = str.concat("-");
        }
        if (invoice.d()) {
            int i2 = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_details_number_recurring_caption;
            String str3 = invoice.f73375b;
            textLocalisedClause = textLocalisedClause6;
            StringBuilder sbT = p.a.t(strConcat, str3, "-0001, ", strConcat, str3);
            sbT.append("-0002");
            textClause = new TextLocalisedClause(i2, zhm.u.c(new TextClause(sbT.toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        } else {
            textLocalisedClause = textLocalisedClause6;
            textClause = new TextClause(invoice.f73376c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        CellDetailsActionDelegate.Model model6 = new CellDetailsActionDelegate.Model("ITEM_ID_DETAILS_INVOICE_NUMBER", textLocalisedClause, 0, null, textClause, false, false, null, null, 0, 0, 32736);
        TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_details_schedule_title_v2, null, null, 14);
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        if (invoice.d()) {
            FreelancerRecurringSchedule freelancerRecurringScheduleZ = invoice.z();
            java.time.LocalDate localDate = freelancerRecurringScheduleZ.f73439h;
            TextLocalisedQuantityClause textLocalisedQuantityClauseB = qy6.b.b(freelancerRecurringScheduleZ.f73436b);
            if (Intrinsics.f(localDate, ((l80.f) bVar3.f190438a).e())) {
                textLocalisedClause2 = textLocalisedClause7;
                textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_recurring_starting_today, null, null, 14);
                freelancerInvoice = invoice;
                i = 12;
            } else {
                textLocalisedClause2 = textLocalisedClause7;
                int i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_recurring_starting_on;
                if (localDate != null) {
                    oc.c.N(localDate);
                    long jN = oc.c.N(localDate);
                    TimeClause.Format.INSTANCE.getClass();
                    textClause2 = new TimeClause(jN, TimeClause.Format.f57959a, null, null, 12);
                } else {
                    m70.a.c(t0.f186434a);
                    textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                freelancerInvoice = invoice;
                i = 12;
                textLocalisedClause3 = new TextLocalisedClause(i3, zhm.u.c(textClause2), null, 12);
            }
            int i5 = com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_schedule_recurring_description_template;
            Clause[] clauseArr = new Clause[2];
            clauseArr[0] = textLocalisedQuantityClauseB;
            clauseArr[c2] = textLocalisedClause3;
            clauseA = new TextLocalisedClause(i5, zhm.v.k(clauseArr), null, i);
        } else {
            textLocalisedClause2 = textLocalisedClause7;
            freelancerInvoice = invoice;
            clauseA = com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.a.a(com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.a.b(freelancerInvoice).f73896b);
        }
        List listK = zhm.v.k(model6, new CellDetailsActionDelegate.Model("ITEM_ID_DETAILS_PAYMENT_SCHEDULE", textLocalisedClause2, 0, null, clauseA, (!z || com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.a.b(freelancerInvoice).W(((l80.f) dVar.f200532b).e())) ? 0 : c2, false, null, null, 0, 0, 32704), new CellDetailsActionDelegate.Model("ITEM_ID_DETAILS_CURRENCY", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_details_currency_title, null, null, 14), 0, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_details_currency_caption, zhm.v.k(new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, null, 4), new CurrencyClause(bVar2, CurrencyClause.Format.DisplayName.f57755a, null, 4)), null, 12), false, false, null, null, 0, 0, 32736));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        zhm.a0.x(listK, eVarB2);
        eVarB.addAll(zhm.u.a(eVarB2));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            if (!((a.c) entry.getValue()).f73845a) {
                str4 = null;
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
        }
        Set setI1 = zhm.d0.i1(arrayList);
        boolean z4 = aVar.f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            String str5 = ((a.c) entry2.getValue()).f73846b;
            if (str5 != null) {
                linkedHashMap.put(entry2.getKey(), str5);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry3 : map.entrySet()) {
            String str6 = ((a.c) entry3.getValue()).f73847c;
            if (str6 != null) {
                linkedHashMap2.put(entry3.getKey(), str6);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry4 : map.entrySet()) {
            String str7 = ((a.c) entry4.getValue()).d;
            if (str7 != null) {
                linkedHashMap3.put(entry4.getKey(), str7);
            }
        }
        FreelancerInvoice invoice2 = freelancerInvoice;
        boolean z6 = c2;
        eVarB.addAll(dVar.a(setI1, z4, invoice2, linkedHashMap, linkedHashMap2, linkedHashMap3));
        Intrinsics.checkNotNullParameter(invoice2, "invoice");
        aim.e eVarB3 = zhm.u.b();
        eVarB3.add(new CellDetailsDelegate.Model("ITEM_ID_PRICE_BREAKDOWN_SUBTOTAL", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_subtotal, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(invoice2.k, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        for (FreelancerInvoiceTax freelancerInvoiceTax : zhm.d0.P0(invoice2.f73386s, new lx6.c())) {
            eVarB3.add(new CellDetailsDelegate.Model(j6.a.q("ITEM_ID_PRICE_BREAKDOWN_VAT_", freelancerInvoiceTax.f73416a.f73418a), new aw0.t0((Clause) dVar.d.c(freelancerInvoiceTax.f73416a), (Image) null, 0, false, 30), new MoneyClause(freelancerInvoiceTax.f73417b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        }
        eVarB3.add(new n8(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_total, null, null, 14), new MoneyClause(invoice2.f73379j, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), "ITEM_ID_PRICE_BREAKDOWN_SUBTOTAL"));
        aim.e eVarA = zhm.u.a(eVarB3);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        a.C0490a additionalOptionSettings = aVar.f73837a;
        Intrinsics.checkNotNullParameter(additionalOptionSettings, "additionalOptionSettings");
        Intrinsics.checkNotNullParameter(invoice2, "invoice");
        List list = invoice2.f73382n;
        aim.e eVarB4 = zhm.u.b();
        eVarB4.add(new ListSubheaderDelegate.Model("ITEM_ID_ADDITION_OPTIONS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_details_additional_options, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_additional_options_template_title, null, null, 14);
        InvoiceTemplateOverride invoiceTemplateOverride = invoice2.z;
        CellDetailsActionDelegate.Model model7 = new CellDetailsActionDelegate.Model("ITEM_ID_ADDITIONAL_OPTIONS_TEMPLATE", textLocalisedClause8, 0, new ResourceImage(R$drawable.uikit_icn_24_pen, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), (invoiceTemplateOverride == null || (invoiceTemplateOverride.f86410a == null && invoiceTemplateOverride.f86411b == null && invoiceTemplateOverride.f86412c == null && invoiceTemplateOverride.d == null && invoiceTemplateOverride.e == null)) ? invoiceTemplate != null ? new TextClause(invoiceTemplate.f86399c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null : new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_additional_options_template_custom, null, null, 14), false, false, null, null, 0, 0, 32736);
        CellDetailsActionDelegate.Model model8 = new CellDetailsActionDelegate.Model("ITEM_ID_ADDITIONAL_OPTIONS_PAYMENT_METHODS", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_additional_options_payment_methods_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_pen, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedQuantityClause(R$plurals.freelancer_sale_invoice_setup_section_additional_options_payment_methods_count, Integer.valueOf(list.size()), (List) null, (Style) null, 28), false, false, null, null, 0, 0, 32736);
        RowDelegate.Model model9 = new RowDelegate.Model("ITEM_ID_ADDITIONAL_OPTIONS_EMAIL_MESSAGE_SWITCH", null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_section_additional_options_email_message_title, null, null, 14), null, 0, null, null, null, 0, new vf(additionalOptionSettings.f73842b, z6), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
        if (additionalOptionSettings.f73842b) {
            String str8 = additionalOptionSettings.f73841a;
            model = new InputTextDelegate.Model("ITEM_ID_ADDITIONAL_OPTIONS_EMAIL_MESSAGE_INPUT", new TextClause(str8 == null ? "" : str8, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_note_input_note_title, null, null, 14), null, null, null, null, false, null, false, false, 0, false, 1, false, false, true, null, false, false, 0, false, false, null, -1107296264, 131071);
        } else {
            model = null;
        }
        Object[] elements = {model7, model8, model9, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        zhm.a0.x(listL, eVarB4);
        eVarB.addAll(zhm.u.a(eVarB4));
        List listV = zjh.j.v(hVar.e, aVar.e);
        int i6 = R$attr.uikit_dp16;
        yp0.b.q(listV, i6, i6, 0, 0, 12);
        eVarB.addAll(listV);
        aim.e eVarA2 = zhm.u.a(eVarB);
        Object[] objArr = (invoice2.d() && Intrinsics.f(invoice2.z().f73439h, ((l80.f) hVar.f73857b).e())) ? z6 ? 1 : 0 : null;
        if (invoice2.d()) {
            compositeClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_header_title_recurring, zhm.u.c(new TextClause(invoice2.f73376c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        } else {
            List listK2 = zhm.v.k(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_kind_invoice_title, null, null, 14), new TextClause(invoice2.f73376c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            m70.a.t(t0.f186434a);
            compositeClause = new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        Clause clause = compositeClause;
        TextLocalisedClause textLocalisedClause9 = (hVar.f73858c.f73829a == null || freelancerInvoiceStatusDetails == null || mif.e0.w(invoice2)) ? null : new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_status_last_saved, zhm.u.c(new TimeClause(freelancerInvoiceStatusDetails.f73413b.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12)), null, 12);
        Intrinsics.checkNotNullParameter(invoice2, "invoice");
        ActionsView.Item[] elements2 = {invoice2.c() ? new ActionsView.Item("ITEM_ID_PREVIEW_INVOICE", null, false, null, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_action_preview, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_eye, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670) : null, mif.e0.r(invoice2) ? new ActionsView.Item("ITEM_ID_DELETE_INVOICE", null, false, null, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_action_delete, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670) : null};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new ix6.e0(new ix6.d0(clause, textLocalisedClause9, kotlin.collections.d.L(elements2)), eVarA2, new ix6.c0(new TextLocalisedClause((invoice2.c() || objArr != null) ? com.revolut.feature.freelancer.impl.R$string.freelancer_common_action_send_invoice : com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_setup_action_schedule, null, null, 14)));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028c A[EDGE_INSN: B:104:0x028c->B:77:0x028c BREAK  A[LOOP:0: B:22:0x00a4->B:106:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r31, java.lang.Object r32, java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ieg.z.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        j0i.o oVar = (j0i.o) this.f160744b;
        j0i.a aVar = (j0i.a) this.f160745c;
        cw5.a content = (cw5.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        return oVar.a(content, aVar);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        i1e.g gVar = (i1e.g) this.f160744b;
        j1e.c cVar = (j1e.c) this.f160745c;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Throwable th10 = (Throwable) obj4;
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.isEmpty()) {
            if (th10 != null) {
                cVar.getClass();
                return j1e.c.a();
            }
            cVar.getClass();
            List listC = zhm.u.c(new FullScreenStateDelegate.Model("ID_TRANSACTIONS_STATE_ID", new TextLocalisedClause(com.revolut.feature.stock_lending.impl.R$string.wealth_stock_lending_details_transactions_empty, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D006", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32740));
            j1e.c.b(listC);
            return listC;
        }
        if (!gVar.f157617b) {
            content = zhm.d0.V0(content, 3);
        }
        List<c1e.a> list = content;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (c1e.a aVar : list) {
            cVar.getClass();
            String str = aVar.f20459a;
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            arrayList.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorWhite, R$attr.uikit_colorLightGreen), companion.h(R$drawable.uikit_icn_16_plus, R$attr.uikit_colorWhite, R$attr.uikit_colorAccent), null, false, 28), new TextLocalisedClause(com.revolut.feature.stock_lending.impl.R$string.wealth_stock_lending_details_transactions_title, null, null, 14), null, 0, new TimeClause(aVar.f20461c.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(aVar.f20460b, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532675544));
        }
        cVar.getClass();
        j1e.c.b(arrayList);
        return arrayList;
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        j1k.g gVar = (j1k.g) this.f160744b;
        j1k.d dVar = (j1k.d) this.f160745c;
        List articles = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(articles, "articles");
        ArrayList arrayListA = gVar.f170633b.a(articles);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        List listO = i2b.a.o(arrayListA, zBooleanValue ? j1k.g.b() : null);
        n0h.b bVar = dVar.f170625c;
        return i2b.a.o(listO, bVar != null ? gVar.f170632a.a(bVar, new p0h.e(null, 3)) : null);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        String str = (String) this.f160744b;
        j27.n nVar = (j27.n) this.f160745c;
        List orders = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(orders, "orders");
        nkm.c cVarF = nkm.y.F(nkm.y.n(zhm.d0.Q(orders), new ik3.a(str, 18)), new j27.l());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : cVarF) {
            java.time.LocalDate localDate = ((nr6.b) obj5).f218538b.toLocalDate();
            Object objU = linkedHashMap.get(localDate);
            if (objU == null) {
                objU = h30.l.u(linkedHashMap, localDate);
            }
            ((List) objU).add(obj5);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.time.LocalDate localDate2 = (java.time.LocalDate) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList2.add(nVar.f170720a.d((nr6.b) it8.next(), true));
            }
            String strS = h30.l.s("GROUP_HEADER_ITEM_ID_", localDate2);
            Intrinsics.h(localDate2);
            zhm.a0.x(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model(strS, (Image) null, (Clause) new TimeClause(oc.c.F(localDate2), new TimeClause.Format.Pretty(com.revolut.core.ui_kit.models.q0.ONLY_DATE), null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList);
        }
        return arrayList;
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        int i;
        cz czVar;
        RowDelegate.Model model;
        RowDelegate.Model model2;
        Clause textLocalisedClause;
        boolean z;
        String str;
        j33.t tVar = (j33.t) this.f160744b;
        j33.i iVar = (j33.i) this.f160745c;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((e7l.f) obj2, "<unused var>");
        aim.e eVarB = zhm.u.b();
        boolean z3 = iVar.d;
        Boolean bool = iVar.f170942c;
        String str2 = iVar.f170943g;
        e93.d dVar = iVar.f170940a;
        e93.g gVar = dVar.f123829h.f123874b;
        Image imageA = tVar.a(gVar != null ? gVar.f123862a : null);
        Image imageA2 = tVar.a(gVar != null ? gVar.f123863b : null);
        Image imageA3 = (gVar == null || (str = gVar.f123864c) == null) ? null : tVar.a(str);
        Image image = iVar.f170941b;
        boolean z4 = iVar.e;
        e93.x xVar = dVar.f123830j;
        if (xVar != null) {
            Integer numA = c90.a.a(xVar.f123897b);
            Custom custom = new Custom(new Custom.Color.SolidInt(numA != null ? numA.intValue() : -1), false, false, 254);
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                textLocalisedClause = new TextClause(upperCase, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
                i = 10;
            } else {
                i = 10;
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_cardholder_name_placeholder, null, custom, 10);
            }
            Clause clause = textLocalisedClause;
            e93.a aVar = xVar.f123896a;
            int i2 = aVar.f123822a - 13;
            int i3 = aVar.f123823b - 13;
            int i5 = j33.s.f170956a[xVar.f123898c.ordinal()];
            if (i5 == 1) {
                z = true;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            czVar = new cz(i2, i3, clause, z);
        } else {
            i = 10;
            czVar = null;
        }
        cz czVar2 = czVar;
        int i6 = i;
        eVarB.add(new dz(z3, imageA, imageA2, czVar2, imageA3, image, z4, R$attr.uikit_dp48, R$attr.uikit_dp24));
        if (bool == null) {
            model = null;
        } else {
            RowDelegate.Model model3 = new RowDelegate.Model("NUMBERLESS_CARD_WIDGET_LIST_ID", null, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_extra_security_numberless_widget_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_extra_security_numberless_widget_description, null, null, 14), null, null, 0, new vf(bool.booleanValue(), true), false, null, false, null, zhm.u.c(new pc("EXTRA_SECURITY_TAG_LIST_ID", new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_tag_extra_secure, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), i6), new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorAccent_20)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, 0, null, 2024), null)), null, null, null, null, null, null, 0, 0, 0, 0, 536837082);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            model = model3;
        }
        if (model != null) {
            eVarB.add(model);
        }
        if (str2 != null && tVar.f170958a.d("revolut_card.custom_name_on_card", null) == bla.c.ENABLED) {
            RowDelegate.Model model4 = new RowDelegate.Model("CARD_HOLDER_NAME_LIST_ID", null, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_cardholder_name_selection_title, null, null, 14), null, 0, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_cardholder_widget_button_change, null, null, 14), null, null, false, null, "CHANGE_CARD_HOLDER_NAME_BUTTON_TAG", OnfidoActivity.RESULT_EXIT_TOKEN_EXPIRED), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            model2 = model4;
        } else {
            model2 = null;
        }
        if (model2 != null) {
            eVarB.add(model2);
        }
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [x35.b] */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5, types: [com.revolut.core.ui_kit.models.badge.CircleBadgeModel] */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r45v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    private final Object o(Object obj2, Object obj3, Object obj4) throws Throwable {
        j45.o oVar = (j45.o) this.f160744b;
        j45.e eVar = (j45.e) this.f160745c;
        List groups = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(groups, "groups");
        x35.e eVar2 = eVar.f171296b;
        Throwable th10 = null;
        x35.d dVar = eVar2 instanceof x35.d ? (x35.d) eVar2 : null;
        String str = dVar != null ? dVar.f302652c : null;
        o2j.l lVar = oVar.f171310b;
        Map mapG = zhm.r0.g();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = groups.iterator();
        while (it8.hasNext()) {
            zhm.a0.x(((k1j.b) it8.next()).f180284c, arrayList);
        }
        int i = 0;
        ArrayList arrayListE = lVar.e(mapG, arrayList, str, new j1j.b(true, null, false, CaptureActivity.RESULT_EXIT_USER_FLOW));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_sepa_direct_debit_account_selector_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_sepa_direct_debit_account_selector_action_done, null, null, 14);
        boolean z = eVar2 != null;
        aim.e eVarB = zhm.u.b();
        eVarB.addAll(arrayListE);
        x35.e eVar3 = oVar.f171309a.f70284a;
        if (eVar3 instanceof x35.b) {
            List listC = zhm.u.c(eVar3);
            c45.b bVar = oVar.f171311c;
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("loan_external_section_header", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_sepa_direct_debit_account_selector_section_external_accounts_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            List list = listC;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
            for (Object obj5 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    Throwable th11 = th10;
                    zhm.v.s();
                    throw th11;
                }
                x35.b bVar2 = (x35.b) obj5;
                ?? r122 = eVar2 instanceof x35.b ? (x35.b) eVar2 : th10;
                boolean zF = Intrinsics.f(r122 != 0 ? r122.f.b() : th10, bVar2.f.b());
                arrayList2.add(new RowDelegate.Model(a0.d.n("loan_external_account_item_", i), new RowDelegate.Model.MainImage.Image40(bVar.d(bVar2), zF ? new AccentCircleBadge(dw0.a.Checked) : th10, null, false, null, false, 60), bVar.g(bVar2), null, 0, bVar.b(bVar2, w35.a.LAST_FOUR), null, null, 0, new tf(new yy0.h(bVar.g(bVar2), new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, zF, null, null, null, null, null, null, bVar2, null, 0, 0, 0, 0, 532667352));
                th10 = th10;
                i = i2;
            }
            ?? r452 = th10;
            eVarB.addAll(ue0.e.J(model, yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("upl_external_accounts_subheader", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_sepa_direct_debit_account_selector_section_accounts_title, r452, r452, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124)));
        }
        eVarB.addAll(yp0.b.i(new RowDelegate.Model("UPL_LINK_EXTERNAL_ACCOUNT_LIST_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_plus, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_sepa_direct_debit_account_selector_action_link_another_account, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_sepa_direct_debit_account_selector_action_link_another_account_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new ListSubheaderDelegate.Model("upl_others_subheader", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_sepa_direct_debit_account_selector_section_others_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        Unit unit = Unit.f186387a;
        return new j45.g(textLocalisedClause, textLocalisedClause2, zhm.u.a(eVarB), z, true);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        j4h.e eVar = (j4h.e) this.f160744b;
        nel.a0 instrumentWithTicker = (nel.a0) this.f160745c;
        eel.k chartContent = (eel.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(chartContent, "chartContent");
        String widgetId = eVar.f171382a;
        TrendViewDelegate.a trendViewState = eVar.f;
        eel.i selectedChartValueType = eel.i.PRICE;
        List chartPeriods = eVar.d;
        eel.c selectedPeriod = eVar.e;
        gw0.i chatPosition = j4h.p.f171398a;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(instrumentWithTicker, "instrumentWithTicker");
        Intrinsics.checkNotNullParameter(chartContent, "chartContent");
        Intrinsics.checkNotNullParameter(trendViewState, "trendViewState");
        Intrinsics.checkNotNullParameter(selectedChartValueType, "selectedChartValueType");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        Intrinsics.checkNotNullParameter(chartPeriods, "chartPeriods");
        Intrinsics.checkNotNullParameter(chatPosition, "chatPosition");
        InstrumentTicker instrumentTicker = instrumentWithTicker.f214561b;
        return j4h.a.a(widgetId, l4h.h.c(chartContent, trendViewState, selectedPeriod, selectedChartValueType, instrumentTicker, l4h.h.e(instrumentTicker), instrumentWithTicker.f214560a, false), instrumentWithTicker.f214560a, true, l4h.i.c(chartContent, selectedPeriod, chartPeriods.indexOf(selectedPeriod), oi0.d.x(chartContent), !(trendViewState instanceof mi), instrumentWithTicker.f214560a), selectedPeriod, chartPeriods, chatPosition);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        Collection collectionC;
        List listD;
        j6a.n nVar = (j6a.n) this.f160744b;
        j6a.g gVar = (j6a.g) this.f160745c;
        dda.a accountDetails = (dda.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        String str = gVar.f171701b;
        xi0.b bVar = gVar.d;
        boolean z = gVar.f171703g;
        ArrayList arrayList = accountDetails.f113159a;
        dda.f fVarN = oc.c.n(str, arrayList);
        if (arrayList.size() <= 1) {
            collectionC = f0.f322471a;
        } else {
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                dda.f fVar = (dda.f) it8.next();
                arrayList2.add(new FixedTabs.Item(fVar.getType(), new TextClause(fVar.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (AnalyticsContext) null, 12));
            }
            collectionC = zhm.u.c(new FixedTabsDelegate.Model("LIST_ID_FIXED_TABS", arrayList2, fVarN != null ? fVarN.getType() : null, false, null, SyslogConstants.LOG_CLOCK));
        }
        Collection collection = collectionC;
        wda.b bVar2 = nVar.f171714b;
        if (fVarN instanceof dda.d) {
            cda.a aVar = cda.b.Companion;
            listD = bVar2.e((dda.d) fVarN, false, true, true);
        } else if (fVarN instanceof dda.e) {
            listD = bVar2.f(((dda.e) fVarN).e);
        } else {
            if (fVarN != null) {
                throw new NoWhenBranchMatchedException();
            }
            listD = bVar != null ? bVar2.d(bVar.f306286a, ((jte.d) nVar.f171715c).c(Toggles.AccountDetailsSurfacing.f98561c)) : f0.f322471a;
        }
        return zhm.d0.E0(l6a.a.c(com.revolut.feature.payments_migration.impl.R$string.payments_migration_move_payment_instructions_first_step_account_details_description, R$attr.uikit_dp24, z), zhm.d0.E0(listD, collection));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r54, java.lang.Object r55, java.lang.Object r56) {
        /*
            Method dump skipped, instruction units count: 1876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ieg.z.r(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    private final Object s(Object obj2, Object obj3, Object obj4) {
        i3g.k kVar = (i3g.k) this.f160744b;
        j7b.i iVar = (j7b.i) this.f160745c;
        CobrandedCardsPlanHubInfoRewards rewards = (CobrandedCardsPlanHubInfoRewards) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        l7b.b bVar = (l7b.b) kVar.f158221b;
        Set expandedSectionTitles = iVar.f171894b;
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Intrinsics.checkNotNullParameter(expandedSectionTitles, "expandedSectionTitles");
        ArrayList arrayList = rewards.f82405a;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj5 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            CobrandedCardsPlanHubInfoRewardSection cobrandedCardsPlanHubInfoRewardSection = (CobrandedCardsPlanHubInfoRewardSection) obj5;
            boolean zContains = expandedSectionTitles.contains(cobrandedCardsPlanHubInfoRewardSection.f82399a);
            boolean z = cobrandedCardsPlanHubInfoRewardSection.d;
            ?? V0 = cobrandedCardsPlanHubInfoRewardSection.f82400b;
            boolean z3 = z && V0.size() > 3;
            if (z3 && !zContains) {
                V0 = zhm.d0.V0(V0, 2);
            }
            aim.e eVarB = zhm.u.b();
            Iterable iterable = (Iterable) V0;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(iterable, 10));
            int i3 = 0;
            for (Object obj6 : iterable) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    zhm.v.s();
                    throw null;
                }
                arrayList3.add(bVar.f192549a.a((CobrandedCardsPlanHubInfoRewardChallenge) obj6, i3));
                i3 = i5;
            }
            eVarB.addAll(arrayList3);
            if (z3) {
                eVarB.add(new LargeActionButtonDelegate.Model(a0.d.n("list_id_rewards_section_show_more_", i), LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(zContains ? com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_hub_show_less : com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_plan_hub_show_more, null, null, 14), false, null, null, cobrandedCardsPlanHubInfoRewardSection.f82399a, null, 744));
            }
            aim.e eVarA = zhm.u.a(eVarB);
            String strN = a0.d.n("list_id_rewards_section_header_", i);
            TextClause textClause = new TextClause(cobrandedCardsPlanHubInfoRewardSection.f82399a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            ResourceImage resourceImage = cobrandedCardsPlanHubInfoRewardSection.f82401c != null ? new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null;
            CobrandedCardsPlanHubInfoRewardSectionInfo cobrandedCardsPlanHubInfoRewardSectionInfo = cobrandedCardsPlanHubInfoRewardSection.f82401c;
            zhm.a0.x(yp0.b.g(eVarA, new ListSubheaderDelegate.Model(strN, (Image) null, (Clause) textClause, (Image) resourceImage, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) (cobrandedCardsPlanHubInfoRewardSectionInfo != null ? new ListSubheaderDelegate.Model.a.b(true, false, false, 6) : null), false, false, (Object) cobrandedCardsPlanHubInfoRewardSectionInfo, (Parcelable) null, 0, 0, 0, 0, 64434), null, 0, 0, 126), arrayList2);
            i = i2;
        }
        return arrayList2;
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        jc6.t tVar = (jc6.t) this.f160744b;
        jc6.j jVar = (jc6.j) this.f160745c;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((xi0.b) obj2, "<unused var>");
        lc6.b bVar = tVar.f172737a;
        dj0.d currencyPocketBalance = jVar.e;
        nqi.c donateMoneyInputState = jVar.d;
        Data orderQuote = jVar.f;
        DonationSchedule donationSchedule = jVar.f172713a;
        lc6.c cVar = (lc6.c) bVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(currencyPocketBalance, "currencyPocketBalance");
        Intrinsics.checkNotNullParameter(donateMoneyInputState, "donateMoneyInputState");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(donationSchedule, "donationSchedule");
        dj0.d dVar = donateMoneyInputState.f218471a;
        dj0.d dVar2 = donateMoneyInputState.f218471a;
        long j2 = dVar.f115082a;
        long j3 = currencyPocketBalance.f115082a;
        xi0.b bVar2 = currencyPocketBalance.f115083b;
        boolean z = j2 <= j3;
        return zhm.u.c(new CenteredAmountDelegate.Model("AMOUNT_EDIT_ITEM_ID", null, new bw0.h(donateMoneyInputState.f218472b, u80.o.b(new u80.g(dVar2, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), z && donateMoneyInputState.f218472b.length() > 0 && !dVar2.k(), f0.f322471a, Boolean.TRUE, false, false, false, false, null, 6084), new f3(new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), new CurrencyClause(bVar2, null, null, 6), new MoneyClause(currencyPocketBalance, new MoneyClause.Format.Shorts(false, 63), null, null, 12), true, z ? h3.ACTIVE : h3.ERROR, true), (bw0.m) iii.c.f(orderQuote, new lbh.a(7), new kp0.m(cVar, donationSchedule, 6), new koe.y(cVar, donationSchedule, 11)), null, null, true, false, currencyPocketBalance.f115083b, null, 1378));
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        List listA;
        com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.b bVar = (com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.b) this.f160744b;
        jck.o oVar = (jck.o) this.f160745c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186385a;
        List list2 = (List) pair.f186386b;
        List list3 = (List) iii.c.f(oVar.f172862b, new jcj.n(12), new j7b.m(15), new jb8.b(bVar, 1));
        if (list.isEmpty()) {
            listA = (list2.isEmpty() || com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.b.g(oVar).length() != 0) ? com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.b.a(oVar) : bVar.e(list2);
        } else {
            List<jck.j0> list4 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
            for (jck.j0 j0Var : list4) {
                java.time.LocalDate localDate = j0Var.f172853a;
                String strG = a0.d.g(localDate.getYear(), localDate.getMonthValue(), "id_upcoming_birthday_", "_");
                com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                LocalDateClause$DateFormat.Month month = new LocalDateClause$DateFormat.Month(0);
                jVar.getClass();
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(strG, (Image) null, (Clause) com.revolut.core.ui_kit.models.j.a(localDate, month, null), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                List list5 = j0Var.f172854b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it8 = list5.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(bVar.f102515b.b((i0) it8.next(), jck.x.REVEALED));
                }
                arrayList.add(yp0.b.g(arrayList2, model, null, 0, 0, 126));
            }
            listA = zhm.w.u(arrayList);
        }
        return zhm.d0.E0(listA, list3);
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        jf4.d dVar = (jf4.d) this.f160744b;
        ff4.i iVar = (ff4.i) this.f160745c;
        bv3.b content = (bv3.b) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        bv3.c cVar = content.f18943a;
        String str = cVar.f18947b;
        TextLocalisedClause textLocalisedClause = str != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_offer_title, zhm.u.c(new TextClause(a0.d.v(new Object[0], 0, str, "format(...)"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
        String str2 = cVar.d;
        TextLocalisedClause textLocalisedClause2 = str2 != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_offer_description, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
        String str3 = cVar.f;
        UrlImage urlImage = new UrlImage(str3 == null ? "" : str3, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_time);
        int i = com.revolut.feature.credit.core.R$string.credit_application_offer_tag;
        String str4 = cVar.e;
        return new ff4.s(dVar.f173651a.a(cVar, iVar.f134719a), textLocalisedClause, textLocalisedClause2, urlImage, new r2(new TextLocalisedClause(i, zhm.u.c(new TextClause(str4 == null ? "" : str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), numValueOf), null, null, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_offer_action, zhm.u.c(new TextClause(cVar.k.f66298a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), zBooleanValue, true, null, null, 6144);
    }

    private final Object w(Object obj2, Object obj3, Object obj4) {
        jh3.d dVar = (jh3.d) this.f160744b;
        jh3.b bVar = (jh3.b) this.f160745c;
        jh3.a transactionsContent = (jh3.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        String str = bVar.f174140a.f322070a;
        if (transactionsContent.f174138a.isEmpty()) {
            return dVar.b(str);
        }
        return yp0.b.g(((anf.k) dVar.f174142a).q(transactionsContent.f174138a, transactionsContent.f174139b, new thf.f(false, 3)), dVar.c(str), null, 0, 0, 126);
    }

    private final Object x(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model modelA;
        InstrumentsTrendCollectionId instrumentsTrendCollectionId = (InstrumentsTrendCollectionId) this.f160744b;
        ji7.b bVar = (ji7.b) this.f160745c;
        List<qi7.h> collectionInstruments = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(collectionInstruments, "collectionInstruments");
        ArrayList arrayList = new ArrayList();
        for (qi7.h hVar : collectionInstruments) {
            if (instrumentsTrendCollectionId instanceof InstrumentsTrendCollectionId.CfdsPnlDrivers) {
                modelA = bVar.f174378a.a(hVar);
            } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.MostTraded.f74902a)) {
                modelA = bVar.d.a(hVar);
            } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.MostShortedCfds.f74901a)) {
                modelA = bVar.e.a(hVar);
            } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.PopularStarterCfds.f74903a) || (instrumentsTrendCollectionId instanceof InstrumentsTrendCollectionId.Bonds) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.IndexEtfs.f74900a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.TechnologyEtfs.f74906a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtnsCryptoExposure.f74897a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtcsCommodityExposure.f74896a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.PreciousMetalsEtcs.f74904a) || Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.EtpsLeveraged.f74898a)) {
                modelA = j1h.b.a(bVar.f, hVar.f246671a, new oh7.b(hVar), 4);
            } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.DividendLeaders.f74895a)) {
                modelA = bVar.f174379b.a(hVar);
            } else if (Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.RecommendedBuy.f74905a)) {
                modelA = bVar.f174380c.a(hVar, oh7.a.DETAILS);
            } else {
                if (!Intrinsics.f(instrumentsTrendCollectionId, InstrumentsTrendCollectionId.FreeStocks.f74899a)) {
                    throw new NoWhenBranchMatchedException();
                }
                modelA = null;
            }
            if (modelA != null) {
                arrayList.add(modelA);
            }
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object y(Object obj2, Object obj3, Object obj4) {
        ai9.c cVar;
        ux4.b bVar;
        jj9.n nVar;
        Collection collectionA;
        qv0.o oVarB;
        Collection collectionA2;
        int i;
        jj9.n nVar2 = (jj9.n) this.f160744b;
        jj9.c cVar2 = (jj9.c) this.f160745c;
        vf0.h hVar = (vf0.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(hVar, "<destruct>");
        zh9.i0 management = (zh9.i0) hVar.f288433a;
        ux4.b bVar2 = (ux4.b) hVar.f288434b;
        zh9.n feeSettings = (zh9.n) hVar.f288435c;
        do3.n user = (do3.n) hVar.d;
        ai9.c cVar3 = cVar2.f;
        aim.e eVarB = zhm.u.b();
        Intrinsics.checkNotNullParameter(management, "management");
        zh9.h hVar2 = management.f322286b.f;
        zh9.e eVar = hVar2 != null ? hVar2.o : null;
        zh9.e eVar2 = zh9.e.Active;
        if (eVar == eVar2) {
            aim.e eVarB2 = zhm.u.b();
            if (hVar2 == null) {
                cVar = cVar3;
                bVar = bVar2;
                nVar = nVar2;
            } else {
                eVarB2.add(new ListSubheaderDelegate.Model("limit-section-header", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_details_limits_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                aim.e eVarB3 = zhm.u.b();
                n14.e.b(eVarB3, new CellDetailsActionDelegate.Model("total-limit-item", new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_account_details_total_limit, null, null, 14), 0, null, pi9.b.a(hVar2.f322273l, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 1), null, false, false, null, null, null, 0, 0, 0, 0, 4194276));
                int iT = cp5.c.t(hVar2);
                if (iT >= 0 && iT < 90) {
                    i = R$attr.uikit_colorBlue;
                } else if (90 <= iT && iT < 100) {
                    i = R$attr.uikit_colorTerracotta;
                } else {
                    if (99 > iT || iT > Integer.MAX_VALUE) {
                        throw new IllegalStateException(a0.d.n("Pay later limit utilization progress cannot be less than 0, current value: ", iT));
                    }
                    i = R$attr.uikit_colorRed;
                }
                cVar = cVar3;
                bVar = bVar2;
                nVar = nVar2;
                n14.e.b(eVarB3, new t6("limit-utilisation-item", new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_details_limits_utilisation, null, null, 14), kotlin.ranges.f.g(iT, 1, 100), new PercentageClause(iT, (PercentageClause.Format) null, (Custom) null, 6), null, new v6(R$attr.uikit_colorGreyTone20_50, i), 496));
                aim.e eVarA = zhm.u.a(eVarB3);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                eVarB2.addAll(eVarA);
            }
            collectionA = zhm.u.a(eVarB2);
        } else {
            cVar = cVar3;
            bVar = bVar2;
            nVar = nVar2;
            collectionA = f0.f322471a;
        }
        eVarB.addAll(collectionA);
        Intrinsics.checkNotNullParameter(management, "management");
        Intrinsics.checkNotNullParameter(feeSettings, "feeSettings");
        Intrinsics.checkNotNullParameter(user, "user");
        if ((hVar2 != null ? hVar2.o : null) != eVar2) {
            collectionA2 = f0.f322471a;
        } else {
            aim.e eVarB4 = zhm.u.b();
            ArrayList<q1> arrayList = feeSettings.e;
            b1 b1Var = feeSettings.f322309a;
            wi0.b bVar3 = feeSettings.d;
            if (arrayList.size() == 1) {
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ID_FEE_SECTION_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_details_pricing_title, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, true, false, 4), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458);
                aim.e eVarB5 = zhm.u.b();
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_account_details_fee, null, null, 14);
                q1 q1Var = (q1) zhm.d0.K0(arrayList);
                if (!feeSettings.a(q1Var)) {
                    eVarB5.add(lj9.e.b(textLocalisedClause, q1Var, bVar3));
                } else {
                    if (b1Var == null) {
                        throw new IllegalArgumentException("If the term is on zero promo, currentPromotion can't be null");
                    }
                    eVarB5.add(lj9.e.a(textLocalisedClause, q1Var, bVar3, b1Var));
                }
                eVarB4.addAll(yp0.b.g(zhm.u.a(eVarB5), model, null, 0, 0, 126));
            } else {
                ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("ID_FEE_SECTION_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_account_details_fee, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, true, false, 4), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65458);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                for (q1 q1Var2 : arrayList) {
                    TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(com.revolut.feature.pay_later.api.R$plurals.pay_later_account_details_n_instalments, Integer.valueOf(q1Var2.f322323a), (List) null, (Style) null, 28);
                    if (!feeSettings.a(q1Var2)) {
                        oVarB = lj9.e.b(textLocalisedQuantityClause, q1Var2, bVar3);
                    } else {
                        if (b1Var == null) {
                            throw new IllegalArgumentException("If the term is on zero promo, currentPromotion can't be null");
                        }
                        oVarB = lj9.e.a(textLocalisedQuantityClause, q1Var2, bVar3, b1Var);
                    }
                    arrayList2.add(oVarB);
                }
                eVarB4.addAll(yp0.b.g(arrayList2, model2, null, 0, 0, 126));
            }
            collectionA2 = zhm.u.a(eVarB4);
        }
        eVarB.addAll(collectionA2);
        if (cVar != null) {
            eVarB.add(nVar.f174804b.a(cVar));
        }
        vi9.j jVar = nVar.f174803a;
        ux4.b documents = bVar;
        Intrinsics.checkNotNullParameter(documents, "documents");
        aim.e eVarB6 = zhm.u.b();
        eVarB6.add(new ListSubheaderDelegate.Model("documents-section-header", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_management_account_documents, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        eVarB6.addAll(jVar.a(documents));
        eVarB.addAll(zhm.u.a(eVarB6));
        CellDetailsChevronDelegate.Model model3 = new CellDetailsChevronDelegate.Model("GET_HELP_ID", new TextLocalisedClause(R.string.contact_us, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model3, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        eVarB.add(model3);
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0b6a A[LOOP:8: B:286:0x0b64->B:288:0x0b6a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0c31  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0c43  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0c46  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0c50  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0c53  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0c99  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0c9c  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0cb3  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0cb8  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0cbb  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0ccc  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0cd0  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0cfd  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0d02  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0d0b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0d14  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0d4a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0d57  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0d65  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0d6f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0d91  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0d99  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0d9f  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0dec  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0dfb  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0e05  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0e0c  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v48, types: [com.revolut.core.ui_kit.models.Style, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v50 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r73, java.lang.Object r74, java.lang.Object r75) {
        /*
            Method dump skipped, instruction units count: 3820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ieg.z.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ z(Object obj2, Object obj3, int i) {
        this.f160743a = i;
        this.f160744b = obj2;
        this.f160745c = obj3;
    }
}
