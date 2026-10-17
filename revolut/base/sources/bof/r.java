package bof;

import android.os.Parcelable;
import aw0.e8;
import aw0.k9;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.p9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountContract$InputData;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.NoIncentiveSelectionException;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.a;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.payments.groups.api.R$plurals;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker.TravelMilesFlightLocationPickerScreenContract$InputData;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionControllerContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import com.youTransactor.uCube.rpc.Constants;
import fmc.z;
import h3b.a0;
import h87.s;
import ip0.pb0;
import ip0.qd0;
import ip0.vd0;
import ip0.xh0;
import ip0.zj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import koe.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t0;
import mh4.x;
import ms0.e4;
import tnb.g0;
import tof.i3;
import uqh.t;
import wp4.j0;
import z0h.q1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17428a = 25;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17430c;
    public final Object d;

    public r(og7.b contentStateMapper, og7.d errorStateMapper, og7.f loadingStateMapper) {
        Intrinsics.checkNotNullParameter(contentStateMapper, "contentStateMapper");
        Intrinsics.checkNotNullParameter(errorStateMapper, "errorStateMapper");
        Intrinsics.checkNotNullParameter(loadingStateMapper, "loadingStateMapper");
        this.f17429b = contentStateMapper;
        this.f17430c = errorStateMapper;
        this.d = loadingStateMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o a(cli.j r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bof.r.a(cli.j):cli.o");
    }

    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    private final cli.o b(cli.j jVar) {
        boolean z;
        List listG;
        ?? r132;
        TextLocalisedClause textLocalisedClause;
        aw0.e eVar;
        hq9.h domainState = (hq9.h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(((hq9.i) ((f61.a) this.f17430c).f132372b).d ? R$string.split_bill_itemize_edit_items_initial_title : R$string.split_bill_itemize_edit_items_title, null, null, 14);
        iq9.d dVar = (iq9.d) this.f17429b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f154642a;
        if (list.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("split_items_empty_state", new TextLocalisedClause(R$string.split_bill_itemize_edit_items_empty_title, null, null, 14), null, new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 104, 104, 31), (Clause) null, 190)), zj.AVATAR, new TextLocalisedClause(R$string.split_bill_itemize_edit_items_empty_action, null, null, 14), false, Integer.valueOf(R$drawable.uikit_icn_24_plus), null, false, 0, 0, 31556);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listG = u.c(model);
            z = false;
        } else {
            List<SplitBillItem> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (SplitBillItem splitBillItem : list2) {
                String str = splitBillItem.f79225a;
                arrayList.add(new wh(str, new RowDelegate.Model(str, null, new TextClause(splitBillItem.f79226b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new MoneyClause(new dj0.d(splitBillItem.f79227c, dVar.f167809a.f154643a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, 0, new tf(new yy0.h(new TextLocalisedClause(R$string.split_bill_itemize_edit_item_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))), false, null, false, null, null, null, null, null, null, splitBillItem, null, 0, 0, 0, 0, 532673498), u.c(new SwipeToActionDelegate.SwipeAction(splitBillItem.f79225a, new ResourceImage(R$drawable.uikit_icn_24_trash, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.split_bill_itemize_edit_item_delete, null, null, 14), xh0.NEGATIVE, null, splitBillItem, null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                dVar = dVar;
            }
            z = false;
            listG = yp0.b.g(arrayList, new ListSubheaderDelegate.Model("split_items_header", (Image) null, (Clause) new TextLocalisedQuantityClause(R$plurals.split_bill_summary_itemize_header_title, Integer.valueOf(list.size()), (List) null, (Style) null, 28), (Image) null, (Clause) new TextLocalisedClause(R$string.split_bill_itemize_edit_items_add_item, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450), null, 0, 0, 126);
        }
        iq9.b bVar = (iq9.b) this.d;
        hq9.i iVar = bVar.f167808b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (list.isEmpty()) {
            eVar = new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.split_bill_itemize_edit_items_empty_save, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, true, null, null, null, 988), null, null, 55);
        } else {
            Iterator it8 = list.iterator();
            long j2 = 0;
            while (it8.hasNext()) {
                j2 += ((SplitBillItem) it8.next()).f79227c;
            }
            hq9.i iVar2 = bVar.f167807a.f167806a;
            long j3 = iVar2.f154644b;
            xi0.b bVar2 = iVar2.f154643a;
            if (j2 == j3) {
                r132 = 0;
                textLocalisedClause = new TextLocalisedClause(R$string.split_bill_itemize_edit_items_caption_total, u.c(iq9.a.a(j3, bVar2)), null, 12);
            } else {
                r132 = 0;
                r132 = 0;
                textLocalisedClause = j2 < j3 ? new TextLocalisedClause(R$string.split_bill_itemize_edit_items_caption_left, v.k(iq9.a.a(j2, bVar2), iq9.a.a(j3, bVar2), iq9.a.a(j3 - j2, bVar2)), null, 12) : new TextLocalisedClause(R$string.split_bill_itemize_edit_items_caption_exceeding, v.k(iq9.a.a(j2, bVar2), iq9.a.a(j3, bVar2), iq9.a.a(Math.abs(j2 - j3), bVar2)), null, 12);
            }
            eVar = new aw0.e(true, textLocalisedClause, null, m6.c(n6.Companion, new TextLocalisedClause(iVar.d ? R$string.split_bill_itemize_edit_items_initial_save : R$string.split_bill_itemize_edit_items_save, r132, r132, 14), LargeActionButton.ButtonStyle.f58725a, null, null, j2 == iVar.f154644b ? true : z, null, null, null, 988), null, null, 52);
        }
        return new hq9.n(eVar, textLocalisedClause2, listG);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03fd A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0467  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o d(cli.j r57) {
        /*
            Method dump skipped, instruction units count: 1420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bof.r.d(cli.j):cli.o");
    }

    private final cli.o e(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        aw0.b bVar;
        List listC;
        int i;
        int i2;
        l5a.l domainState = (l5a.l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        l5a.d dVar = (l5a.d) this.f17430c;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(new IconNavBarMenuItem("ID_MENU_ITEM_SCHEDULED", new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_home_schedule_payment, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION), new IconNavBarMenuItem("ID_MENU_ITEM_NEW", new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.who_to_pay_header_action, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_global_search_bar_lite_app, null, null, 14);
        i5a.a aVar = domainState.f192202a;
        k9 k9Var = domainState.f192203b;
        l5a.k kVar = domainState.f192205g;
        int i3 = l5a.c.f192197a[kVar.ordinal()];
        if (i3 == 1) {
            textLocalisedClause = textLocalisedClause2;
            bVar = new aw0.b(new e8(true), new tx0.l(null, 7));
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            e8 e8Var = new e8(true);
            kpj.f fVar = dVar.f192198a;
            Intrinsics.checkNotNullParameter(domainState, "domainState");
            if (domainState.i || !((o8b.c) ((n8b.a) fVar.f188258b)).g()) {
                i = com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_welcome_header_intro_v2_title;
                i2 = com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_welcome_header_intro_v2_subtitle;
            } else {
                i = com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_welcome_header_intro_v2_title;
                i2 = com.revolut.feature.payments.who_to_transfer.impl.R$string.welcome_header_subtitle_in_tailored;
            }
            textLocalisedClause = textLocalisedClause2;
            TextLocalisedClause title = new TextLocalisedClause(i, null, null, 14);
            TextLocalisedClause subtitle = new TextLocalisedClause(i2, null, null, 14);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            NavBarCenterViewModel navBarCenterViewModel = new NavBarCenterViewModel((NavBarCenterViewModel.MainText) new NavBarCenterViewModel.MainText.Static(title, NavBarCenterViewModel.MainTextStyle.Marketing.f57863a), (Clause) null, (NavBarCenterViewModel.Subtitle) new NavBarCenterViewModel.Subtitle.Secondary(subtitle), (NavBarCenterViewModel.Button) null, false, false, false, false, (Image) null, (NavBarCenterViewModel.MainTextEndIcon) null, (AnalyticsContext) null, 4090);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.payments.who_to_transfer.impl.R$string.payments_welcome_header_action, null, null, 14);
            mx0.d dVar2 = mx0.d.SECONDARY_WHITE;
            String str = "PAYMENTS_INTRO_START_WITH_PAYMENT_ACTION_ID";
            boolean z = false;
            e4 e4Var = null;
            Clause clause = null;
            Image image = null;
            tx0.d dVar3 = new tx0.d(u.c(u.c(new ActionsView.Item(str, dVar2, z, e4Var, clause, textLocalisedClause3, image, null, null, null, false, null, null, null, null, 32668))));
            NavBarWithContainerBackground navBarWithContainerBackground = domainState.f192204c;
            if (navBarWithContainerBackground == null) {
                navBarWithContainerBackground = NavBarWithContainerBackground.TransparentBackground.f57882a;
            }
            bVar = new aw0.b(e8Var, new tx0.g("PAYMENTS_INTRO_NAV_BAR_CONTENT_ID", navBarCenterViewModel, dVar3, navBarWithContainerBackground, null, null, null, null, new tx0.i(ola.d.PAYMENTS, y0.b("PAYMENTS_INTRO_START_WITH_PAYMENT_ACTION_ID")), null, 3056));
        }
        l5a.m mVar = new l5a.m(aVar, listK, textLocalisedClause, k9Var, bVar, domainState.f, domainState.f192206h);
        k7i.i iVar = (k7i.i) this.f17429b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i5 = l5a.a.f192195a[kVar.ordinal()];
        if (i5 == 1) {
            listC = u.c(b5a.d.a());
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listC = (List) iii.c.f(domainState.d, new l2d.a(iVar, 28), new l2c.v(12), new y(iVar, domainState, 7));
        }
        List listV = zjh.j.v((zjh.j) this.d, domainState.f192207j);
        int i6 = R$attr.uikit_dp24;
        yp0.b.q(listV, i6, i6, 0, 0, 12);
        return new l5a.p(mVar, d0.E0(listV, listC));
    }

    private final cli.o f(cli.j jVar) {
        Iterable iterable;
        String str;
        int i;
        List list;
        lig.g domainState = (lig.g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        mig.f fVar = (mig.f) this.f17430c;
        Data suggestionsData = domainState.f195509b;
        Data recentSearchesData = domainState.d;
        lk0.g gVar = domainState.f195510c;
        Intrinsics.checkNotNullParameter(suggestionsData, "suggestionsData");
        Intrinsics.checkNotNullParameter(recentSearchesData, "recentSearchesData");
        TextLocalisedClause textLocalisedClause = null;
        lk0.e eVar = (gVar == null || (list = gVar.f196174a) == null) ? null : (lk0.e) d0.d0(list);
        Collection collection = (eVar == null || (eVar != null && !eVar.f196173c && ue0.e.n(eVar.f196171a) && eVar.e == null)) ? (List) iii.c.f(t1.t(suggestionsData, recentSearchesData), new x(fVar, 16), new mh1.e(6), new mig.a(fVar, 1)) : f0.f322471a;
        mig.b bVar = (mig.b) this.d;
        if (gVar == null || (iterable = (List) iii.c.g(gVar, new x(15), new mh1.e(5), new mig.a(bVar, 0))) == null) {
            iterable = f0.f322471a;
        }
        ArrayList arrayListE0 = d0.E0(iterable, collection);
        hfg.r rVar = (hfg.r) domainState.f195509b.getContent();
        if (rVar != null && (str = rVar.f151884a) != null) {
            int i2 = mig.e.f205844a[((TravelMilesFlightLocationPickerScreenContract$InputData) this.f17429b).f94381a.ordinal()];
            if (i2 == 1) {
                i = com.revolut.feature.travel.miles.api.R$string.miles_flight_origin_location_placeholder;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.feature.travel.miles.api.R$string.miles_flight_destination_location_placeholder;
            }
            textLocalisedClause = new TextLocalisedClause(i, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        return new lig.n(textLocalisedClause, domainState.f195508a, arrayListE0);
    }

    private final cli.o g(cli.j jVar) {
        String str;
        nqh.d domainState = (nqh.d) jVar;
        nqh.e eVar = (nqh.e) this.f17429b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        t tVar = domainState.f218452a.f282183a;
        boolean z = true;
        boolean z3 = false;
        boolean z4 = (tVar == null || (tVar.f282175a == eVar.f218455a && vph.b.a(tVar.f282176b, eVar.f218456b))) ? false : true;
        ScreenerSortingOptions screenerSortingOptions = domainState.f218452a.f;
        if (screenerSortingOptions != null) {
            ScreenerSelectedSorting other = domainState.f218453b;
            if (other != null) {
                Intrinsics.checkNotNullParameter(screenerSortingOptions, "<this>");
                Intrinsics.checkNotNullParameter(other, "other");
                if (screenerSortingOptions.f105173b == other.f105170a && screenerSortingOptions.f105174c == other.f105171b) {
                    z3 = true;
                }
                z = true ^ z3;
            }
            z3 = z;
        }
        List listC = ((t5d.d) this.d).c(domainState.f218454c, ryc.a.g((ryc.a) this.f17430c, domainState.f218452a, false, false, true, 14));
        aw0.e4 e4Var = aw0.e4.GONE;
        Clause textLocalisedClause = (z4 || z3 || (str = eVar.f218457c) == null) ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.screener_results_header_title, null, null, 14) : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        return new nqh.i(listC, e4Var, textLocalisedClause);
    }

    private final cli.o h(cli.j jVar) {
        o87.b domainState = (o87.b) jVar;
        s sVar = (s) this.f17429b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        j87.n nVar = (j87.n) this.d;
        j87.f widgetState = domainState.f222948a;
        Intrinsics.checkNotNullParameter(widgetState, "widgetState");
        j87.e eVar = widgetState.f172140b;
        return new o87.c(d0.E0(((aah.m) ((q1) this.f17430c)).b(domainState.e), d0.E0(sVar.b(domainState.f222950c), d0.E0(sVar.b(domainState.d), d0.E0(sVar.b(domainState.f222949b), eVar.e ? f0.f322471a : (List) iii.c.f(eVar.f172136a, new j87.m(nVar, eVar, 0), new j7b.m(5), new j75.i(nVar, eVar, 2)))))));
    }

    private final cli.o i(cli.j jVar) {
        mg7.j domainState = (mg7.j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f205172a;
        mg7.i content = (mg7.i) data.getContent();
        Throwable error = data.getError();
        z = false;
        boolean z = false;
        if (content == null || error != null) {
            a.C0498a c0498a = a.C0498a.f74871a;
            if (error != null && !data.getLoading()) {
                og7.d dVar = (og7.d) this.f17430c;
                Intrinsics.checkNotNullParameter(error, "error");
                mg7.o oVar = new mg7.o(dVar.f225050a.a(), dVar.f225051b.f(), null, null);
                List listC = u.c(new FullScreenStateDelegate.Model("ERROR_LIST_ID", new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.incentive_reward_common_error_something_went_wrong, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.SMALL, !(error instanceof NoIncentiveSelectionException) ? new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.incentive_reward_common_action_try_again, null, null, 14) : null, false, null, null, false, 0, 0, 32644));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return new mg7.r(listC, oVar, c0498a);
            }
            og7.f fVar = (og7.f) this.d;
            mg7.p pVar = new mg7.p(fVar.f225053b.f(), fVar.f225052a.a());
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(new pb0(a0.d.n("LOADING_LIST_ID_", i)));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            return new mg7.r(arrayList, pVar, c0498a);
        }
        og7.b bVar = (og7.b) this.f17429b;
        Intrinsics.checkNotNullParameter(content, "content");
        TextClause textClause = new TextClause(content.f205169a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        m70.a.t(t0.f186434a);
        mg7.o oVar2 = new mg7.o(bVar.f225048b.a(), bVar.f225049c.f(), textClause, new CompositeClause(v.k(new TextClause(content.f205170b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.incentive_reward_incentive_selection_terms_link, null, new Click(28, (Integer) null, (Object) content.f205171c, "TERMS_AND_CONDITIONS_CLICK_ID", false), 10)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
        List<mg7.g> list = content.d;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (mg7.g gVar : list) {
            String str = gVar.f205164a;
            vd0 vd0Var = vd0.RADIO;
            TextClause textClause2 = new TextClause(gVar.f205166c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            i3 i3Var = gVar.f205165b;
            arrayList2.add(new SelectableDelegate.Model(str, new RowDelegate.Model(str, i3Var != null ? new RowDelegate.Model.MainImage.Image40(((wjf.e) bVar.f225047a).i(i3Var, null, null), null, null, false, null, false, 62) : null, textClause2, null, 0, null, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), true), false, null, false, null, null, null, null, null, null, gVar, null, 0, 0, 0, 0, 532673528), gVar.f ? qd0.SELECTED : qd0.UNSELECTED, SelectableDelegate.b.C0424b.f53319a, vd0Var, false, null, null, null, true, 31712));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((mg7.g) it8.next()).f) {
                    z = true;
                    break;
                }
            }
        }
        return new mg7.r(arrayList2, oVar2, new mg7.n(z));
    }

    private final cli.o j(cli.j jVar) {
        Object next;
        qv0.l lVar;
        pjc.d domainState = (pjc.d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(mra.d.E(((RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData) ((qr0.i) this.f17429b).f248595b).f84985a, com.revolut.feature.rewards.impl.R$string.rent_and_bills_unlink_linked_payments_rent_title, com.revolut.feature.rewards.impl.R$string.rent_and_bills_unlink_linked_payments_bills_title), null, null, 14), new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_unlink_linked_payments_subtitle, null, null, 14), null, null, false, 28);
        rjc.c cVar = (rjc.c) this.f17430c;
        Set selectedLinkedPaymentIds = domainState.f236725a;
        Intrinsics.checkNotNullParameter(selectedLinkedPaymentIds, "selectedLinkedPaymentIds");
        RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData = cVar.f254653a;
        boolean z = false;
        boolean z3 = rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData.f84987c.size() == 1;
        ArrayList<RentAndBillsLinkedPayments.Category.LinkedPayment> arrayList = rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData.f84987c;
        ArrayList arrayList2 = new ArrayList();
        for (RentAndBillsLinkedPayments.Category.LinkedPayment linkedPayment : arrayList) {
            Iterator it8 = rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData.f84986b.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((qua.p) next).f249314a.f160150a, linkedPayment.f84792b.f84794a)) {
                    break;
                }
            }
            qua.p pVar = (qua.p) next;
            if (pVar == null) {
                lVar = null;
            } else {
                qv0.l lVarX = RowDelegate.Model.x(cVar.f254654b.a(pVar, z), null, null, null, new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_unlink_linked_payments_payment_subtitle, u.c(bkc.d.a(linkedPayment.d, p9.ALWAYS)), null, 12), null, 0, null, false, null, null, 0, 0, 0, 0, null, -1057, 15);
                if (!z3) {
                    String str = linkedPayment.f84791a;
                    lVarX = new SelectableDelegate.Model(str, lVarX, selectedLinkedPaymentIds.contains(str) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.CHECKBOX, false, null, linkedPayment.f84791a, null, false, 32488);
                }
                lVar = lVarX;
            }
            if (lVar != null) {
                arrayList2.add(lVar);
            }
            z = false;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        rjc.b bVar = (rjc.b) this.d;
        int size = domainState.f236725a.size();
        m6 m6Var = n6.Companion;
        RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData2 = bVar.f254652a;
        return new cii.b(new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(mra.d.E(rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData2.f84985a, com.revolut.feature.rewards.impl.R$string.rent_and_bills_unlink_linked_payments_footer_rent_keep_payments_linked, com.revolut.feature.rewards.impl.R$string.rent_and_bills_unlink_linked_payments_footer_bills_keep_payments_linked), null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedQuantityClause(mra.d.E(rentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData2.f84985a, com.revolut.feature.rewards.impl.R$plurals.rent_and_bills_unlink_linked_payments_footer_rent_unlink_payments, com.revolut.feature.rewards.impl.R$plurals.rent_and_bills_unlink_linked_payments_footer_bills_unlink_payments), Integer.valueOf(size), (List) null, (Style) null, 28), LargeActionButton.ButtonStyle.f58726b, null, "UNLINK_BUTTON_LOADING_TAG", size > 0, null, null, null, 972), null, null, null, 121), arrayList2, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o k(cli.j r24) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bof.r.k(cli.j):cli.o");
    }

    private final cli.o l(cli.j jVar) {
        rnj.c domainState = (rnj.c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (rnj.f) iii.c.f(domainState.f255703b, new tjf.e(this, 19), new ta8.a(this, 26), new si5.c(this, domainState, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o m(cli.j r13) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bof.r.m(cli.j):cli.o");
    }

    private final cli.o n(cli.j jVar) {
        w4i.m domainState = (w4i.m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (cii.b) iii.c.f(domainState.f294580a, new w3c.n(this, 3), new vvc.s(this, 15), new vjh.c(this, 12));
    }

    private final cli.o o(cli.j jVar) {
        Data data;
        Data data2;
        wtk.h domainState = (wtk.h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        wtk.r rVar = (wtk.r) this.f17429b;
        Data data3 = domainState.f300013a;
        Data data4 = domainState.f300014b;
        if (data3 != null) {
            try {
                Object content = data3.getContent();
                data = new Data(content != null ? ((mel.p) content).d : null, data3.getError(), data3.getLoading());
            } catch (Throwable th10) {
                data = new Data(null, th10, data3.getLoading());
            }
        } else {
            data = null;
        }
        fuk.h hVar = domainState.f300015c;
        List list = (data == null || data4 == null) ? null : (List) iii.c.f(t1.t(data, data4), new wsg.a(rVar, 22), new wsg.e(rVar, 27), new j0(rVar, 3));
        if (list == null) {
            list = f0.f322471a;
        }
        fuk.p pVar = (fuk.p) rVar.f300026c.f136369b;
        List listU = hVar != null ? w.u(v.k(pVar.a(hVar, fuk.b.EPS_GROWTH_CHART, new fuk.n(com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_expected_return_legend_eps, Integer.valueOf(com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_expected_return_legend_eps_forecast), Integer.valueOf(com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_expected_return_legend_yoy_growth)), com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_expected_return_eps_growth_contribution_title, new h0() { // from class: fuk.q
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((mel.g) obj2).f204749c;
            }
        }), pVar.a(hVar, fuk.b.PE_CHART, new fuk.n(com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_expected_return_legend_pe_multiple, Integer.valueOf(com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_expected_return_legend_pe_multiple_forecast), null), com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_expected_return_cell_price_earnings_title, new h0() { // from class: fuk.r
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((mel.g) obj2).d;
            }
        }), pVar.a(hVar, fuk.b.DIVIDEND_YIELD_CHART, new fuk.n(com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_expected_return_legend_dividend_per_share, Integer.valueOf(com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_expected_return_legend_dividend_per_share_forecast), null), com.revolut.retail.wealth.resources.R$string.instrument_fundamentals_expected_return_cell_dividends_title, new h0() { // from class: fuk.s
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((mel.g) obj2).e;
            }
        }))) : null;
        if (listU == null) {
            listU = f0.f322471a;
        }
        ArrayList arrayListG = yp0.b.g(w.u(v.k(list, listU)), new ListSubheaderDelegate.Model("header-expected-annual-return", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_insights_expected_annual_return_subtitle, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) wtk.k.f300017a, (Parcelable) null, 0, 0, 0, 0, 64434), null, 0, 0, 126);
        wtk.v vVar = (wtk.v) this.f17430c;
        Data data5 = domainState.f300013a;
        if (data5 != null) {
            try {
                Object content2 = data5.getContent();
                data2 = new Data(content2 != null ? ((mel.p) content2).e : null, data5.getError(), data5.getLoading());
            } catch (Throwable th11) {
                data2 = new Data(null, th11, data5.getLoading());
            }
        } else {
            data2 = null;
        }
        List list2 = (data2 == null || data4 == null) ? null : (List) iii.c.f(t1.t(data2, data4), new wsg.a(vVar, 23), new wsg.e(vVar, 28), new j0(vVar, 4));
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        ArrayList arrayListG2 = yp0.b.g(list2, new ListSubheaderDelegate.Model("header-sharpe-ratio", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.instrument_insights_sharpe_ratio_subtitle, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(true, false, false, 6), false, false, (Object) wtk.n.f300019a, (Parcelable) null, 0, 0, 0, 0, 64434), null, 0, 0, 126);
        Data data6 = domainState.d;
        List[] elements = {arrayListG, arrayListG2, data6 != null ? ((aah.m) ((q1) this.d)).b(data6) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new wtk.o(w.u(kotlin.collections.d.L(elements)));
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02e7  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o p(cli.j r38) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bof.r.p(cli.j):cli.o");
    }

    private final cli.o q(cli.j jVar) {
        ywg.b domainState = (ywg.b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_portfolio_insights_title, null, null, 14);
        aim.e eVarB = u.b();
        Data data = domainState.f317423a;
        List list = data != null ? (List) iii.c.f(data, new yuc.p(this, 11), new yw9.j(3), new ymk.y(this, 4)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        eVarB.addAll(list);
        eVarB.addAll(((pyg.i) this.f17429b).f(domainState.f317425c, domainState.f317424b, null, domainState.d));
        return new ywg.f(u.a(eVarB), textLocalisedClause);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final cli.o r(cli.j r57) {
        /*
            Method dump skipped, instruction units count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bof.r.r(cli.j):cli.o");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v54 c46.g, still in use, count: 3, list:
          (r2v54 c46.g) from 0x074e: MOVE (r16v3 c46.g) = (r2v54 c46.g)
          (r2v54 c46.g) from 0x056c: MOVE (r16v5 c46.g) = (r2v54 c46.g)
          (r2v54 c46.g) from 0x051a: MOVE (r16v7 c46.g) = (r2v54 c46.g)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r60) {
        /*
            Method dump skipped, instruction units count: 3830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bof.r.c(cli.j):cli.o");
    }

    public r(com.revolut.feature_crypto_order_flow.impl.exchange.mappers.a amountInputMapper, bzh.j navBarMapper, a46.e suggestionsMapper, a46.a assetImageTransformationsProvider, DeFiExchangeAmountContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(amountInputMapper, "amountInputMapper");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(suggestionsMapper, "suggestionsMapper");
        Intrinsics.checkNotNullParameter(assetImageTransformationsProvider, "assetImageTransformationsProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f17429b = amountInputMapper;
        this.f17430c = navBarMapper;
        this.d = new kyh.h(inputData.f71758c, inputData.f71756a);
    }

    public r(s collectionMapper, q1 wealthDisclaimersMapper, j87.n globeMapper) {
        Intrinsics.checkNotNullParameter(collectionMapper, "collectionMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        Intrinsics.checkNotNullParameter(globeMapper, "globeMapper");
        this.f17429b = collectionMapper;
        this.f17430c = wealthDisclaimersMapper;
        this.d = globeMapper;
    }

    public r(iq9.d viewSplitItemsItemsMapper, f61.a viewSplitItemsTitleMapper, iq9.b viewSplitItemsFooterMapper) {
        Intrinsics.checkNotNullParameter(viewSplitItemsItemsMapper, "viewSplitItemsItemsMapper");
        Intrinsics.checkNotNullParameter(viewSplitItemsTitleMapper, "viewSplitItemsTitleMapper");
        Intrinsics.checkNotNullParameter(viewSplitItemsFooterMapper, "viewSplitItemsFooterMapper");
        this.f17429b = viewSplitItemsItemsMapper;
        this.f17430c = viewSplitItemsTitleMapper;
        this.d = viewSplitItemsFooterMapper;
    }

    public r(k7i.i paymentsIntroItemsStateMapper, l5a.d paymentsIntroNavBarStateMapper, zjh.j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(paymentsIntroItemsStateMapper, "paymentsIntroItemsStateMapper");
        Intrinsics.checkNotNullParameter(paymentsIntroNavBarStateMapper, "paymentsIntroNavBarStateMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f17429b = paymentsIntroItemsStateMapper;
        this.f17430c = paymentsIntroNavBarStateMapper;
        this.d = legalEntityDisclaimerMapper;
    }

    public r(qr0.i rentAndBillsUnlinkPaymentsHeaderMapper, rjc.c rentAndBillsUnlinkPaymentsItemMapper, rjc.b rentAndBillsUnlinkPaymentsFooterMapper) {
        Intrinsics.checkNotNullParameter(rentAndBillsUnlinkPaymentsHeaderMapper, "rentAndBillsUnlinkPaymentsHeaderMapper");
        Intrinsics.checkNotNullParameter(rentAndBillsUnlinkPaymentsItemMapper, "rentAndBillsUnlinkPaymentsItemMapper");
        Intrinsics.checkNotNullParameter(rentAndBillsUnlinkPaymentsFooterMapper, "rentAndBillsUnlinkPaymentsFooterMapper");
        this.f17429b = rentAndBillsUnlinkPaymentsHeaderMapper;
        this.f17430c = rentAndBillsUnlinkPaymentsItemMapper;
        this.d = rentAndBillsUnlinkPaymentsFooterMapper;
    }

    public r(tnj.d suggestionsProvider, tnj.e progressItemProvider, tnj.c resetProfileItemBuilder) {
        Intrinsics.checkNotNullParameter(suggestionsProvider, "suggestionsProvider");
        Intrinsics.checkNotNullParameter(progressItemProvider, "progressItemProvider");
        Intrinsics.checkNotNullParameter(resetProfileItemBuilder, "resetProfileItemBuilder");
        this.f17429b = suggestionsProvider;
        this.f17430c = progressItemProvider;
        this.d = resetProfileItemBuilder;
    }

    public r(ji7.b collectionInstrumentsMapper, z disclaimersMapper, ii7.b filtersMapper, ki7.b navbarMapper, t5d.d swipeTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(collectionInstrumentsMapper, "collectionInstrumentsMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        Intrinsics.checkNotNullParameter(filtersMapper, "filtersMapper");
        Intrinsics.checkNotNullParameter(navbarMapper, "navbarMapper");
        Intrinsics.checkNotNullParameter(swipeTradeActionsMapper, "swipeTradeActionsMapper");
        this.f17429b = collectionInstrumentsMapper;
        this.f17430c = disclaimersMapper;
        this.d = swipeTradeActionsMapper;
    }

    public r(z4i.f loadingMapper, z4i.d errorMapper, z4i.b contentMapper) {
        Intrinsics.checkNotNullParameter(loadingMapper, "loadingMapper");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        this.f17429b = loadingMapper;
        this.f17430c = errorMapper;
        this.d = contentMapper;
    }

    public r(TravelMilesFlightLocationPickerScreenContract$InputData inputData, mig.f travelMilesFlightLocationSuggestionsMapper, mig.b travelMilesFlightLocationItemsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelMilesFlightLocationSuggestionsMapper, "travelMilesFlightLocationSuggestionsMapper");
        Intrinsics.checkNotNullParameter(travelMilesFlightLocationItemsMapper, "travelMilesFlightLocationItemsMapper");
        this.f17429b = inputData;
        this.f17430c = travelMilesFlightLocationSuggestionsMapper;
        this.d = travelMilesFlightLocationItemsMapper;
    }

    public r(d0i.j navBarMapper, h5i.g summaryMapper, c46.i summaryQuoteMapper, a46.a assetImageTransformationsProvider) {
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(summaryMapper, "summaryMapper");
        Intrinsics.checkNotNullParameter(summaryQuoteMapper, "summaryQuoteMapper");
        Intrinsics.checkNotNullParameter(assetImageTransformationsProvider, "assetImageTransformationsProvider");
        this.f17429b = navBarMapper;
        this.f17430c = summaryMapper;
        this.d = summaryQuoteMapper;
    }

    public r(nqh.e inputData, ryc.a extensionMapper, t5d.d swipeAssetTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extensionMapper, "extensionMapper");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsMapper, "swipeAssetTradeActionsMapper");
        this.f17429b = inputData;
        this.f17430c = extensionMapper;
        this.d = swipeAssetTradeActionsMapper;
    }

    public r(InstrumentsCollectionControllerContract$InputData inputData, mch.d navBarMapper, mch.c mainFiltersMapper, mch.b itemsMapper, q1 disclaimerMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(mainFiltersMapper, "mainFiltersMapper");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
        this.f17429b = inputData;
        this.f17430c = itemsMapper;
        this.d = disclaimerMapper;
    }

    public r(pyg.i analyticsDisclaimersMapper, o7.b summaryMapper, axg.a indicatorsMapper) {
        Intrinsics.checkNotNullParameter(analyticsDisclaimersMapper, "analyticsDisclaimersMapper");
        Intrinsics.checkNotNullParameter(summaryMapper, "summaryMapper");
        Intrinsics.checkNotNullParameter(indicatorsMapper, "indicatorsMapper");
        this.f17429b = analyticsDisclaimersMapper;
        this.f17430c = summaryMapper;
        this.d = indicatorsMapper;
    }

    public r(wnf.b commonTransactionContentMapper, hof.d cryptoOrCommodityExchangeItemsContentProvider, LinkedTransactionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(commonTransactionContentMapper, "commonTransactionContentMapper");
        Intrinsics.checkNotNullParameter(cryptoOrCommodityExchangeItemsContentProvider, "cryptoOrCommodityExchangeItemsContentProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f17429b = commonTransactionContentMapper;
        this.f17430c = cryptoOrCommodityExchangeItemsContentProvider;
        this.d = inputData;
    }

    public r(oaa.d pixAddTrustedAccountRecentMapper, oaa.a pixAddTrustedAccountActionsMapper, oaa.f pixAddTrustedAccountRecipientMapper, oaa.g pixAddTrustedAccountSelectedMapper) {
        Intrinsics.checkNotNullParameter(pixAddTrustedAccountRecentMapper, "pixAddTrustedAccountRecentMapper");
        Intrinsics.checkNotNullParameter(pixAddTrustedAccountActionsMapper, "pixAddTrustedAccountActionsMapper");
        Intrinsics.checkNotNullParameter(pixAddTrustedAccountRecipientMapper, "pixAddTrustedAccountRecipientMapper");
        Intrinsics.checkNotNullParameter(pixAddTrustedAccountSelectedMapper, "pixAddTrustedAccountSelectedMapper");
        this.f17429b = pixAddTrustedAccountRecentMapper;
        this.f17430c = pixAddTrustedAccountRecipientMapper;
        this.d = pixAddTrustedAccountSelectedMapper;
    }

    public r(g5a.v widgetsMapper, h5a.b newEmptyStateItemsProvider, r10.t chatTransferNavBarMapper, zjh.j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(widgetsMapper, "widgetsMapper");
        Intrinsics.checkNotNullParameter(newEmptyStateItemsProvider, "newEmptyStateItemsProvider");
        Intrinsics.checkNotNullParameter(chatTransferNavBarMapper, "chatTransferNavBarMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f17429b = newEmptyStateItemsProvider;
        this.f17430c = chatTransferNavBarMapper;
        this.d = legalEntityDisclaimerMapper;
    }

    public r(m3j.j beneficiaryAvatarMapper, b42.b detailsNewMapper, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(beneficiaryAvatarMapper, "beneficiaryAvatarMapper");
        Intrinsics.checkNotNullParameter(detailsNewMapper, "detailsNewMapper");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f17429b = beneficiaryAvatarMapper;
        this.f17430c = detailsNewMapper;
        this.d = phoneToolsProvider;
    }

    public r(b7k.e navBarMapper, b7k.b itemsMapper, m1a.q splitBillItemizationItemsMapper) {
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(splitBillItemizationItemsMapper, "splitBillItemizationItemsMapper");
        this.f17429b = navBarMapper;
        this.f17430c = itemsMapper;
        this.d = splitBillItemizationItemsMapper;
    }

    public r(EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData inputData, rlj.a phoneNumberItemMapper, rlj.f serviceProviderPickerItemMapper, rlj.b contractTypePickerItemMapper, rlj.c dateOfPortabilityItemMapper, rlj.d phoneNumberTypeMapper, ugc.a giftRecipientNameResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneNumberItemMapper, "phoneNumberItemMapper");
        Intrinsics.checkNotNullParameter(serviceProviderPickerItemMapper, "serviceProviderPickerItemMapper");
        Intrinsics.checkNotNullParameter(contractTypePickerItemMapper, "contractTypePickerItemMapper");
        Intrinsics.checkNotNullParameter(dateOfPortabilityItemMapper, "dateOfPortabilityItemMapper");
        Intrinsics.checkNotNullParameter(phoneNumberTypeMapper, "phoneNumberTypeMapper");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        this.f17429b = inputData;
        this.f17430c = phoneNumberItemMapper;
        this.d = giftRecipientNameResolver;
    }

    public r(dnk.m perksMapper, com.revolut.retail.feature.pricing_plans.ui.impl.footer.e footerMapper, dok.e backgroundMapper, dnk.a benefitCategoriesMapper) {
        Intrinsics.checkNotNullParameter(perksMapper, "perksMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        Intrinsics.checkNotNullParameter(benefitCategoriesMapper, "benefitCategoriesMapper");
        this.f17429b = perksMapper;
        this.f17430c = backgroundMapper;
        this.d = benefitCategoriesMapper;
    }

    public r(bic.h headerMapper, bic.b actionButtonsSectionMapper, bic.g descriptionMapper, bic.j sectionsMapper, a26.p footerButtonMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(actionButtonsSectionMapper, "actionButtonsSectionMapper");
        Intrinsics.checkNotNullParameter(descriptionMapper, "descriptionMapper");
        Intrinsics.checkNotNullParameter(sectionsMapper, "sectionsMapper");
        Intrinsics.checkNotNullParameter(footerButtonMapper, "footerButtonMapper");
        this.f17429b = actionButtonsSectionMapper;
        this.f17430c = sectionsMapper;
        this.d = footerButtonMapper;
    }

    public r(ryc.a extensionMapper, g0 navBarMapper, t5d.d swipeAssetTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(extensionMapper, "extensionMapper");
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsMapper, "swipeAssetTradeActionsMapper");
        this.f17429b = extensionMapper;
        this.f17430c = navBarMapper;
        this.d = swipeAssetTradeActionsMapper;
    }

    public r(vmh.n filterMapper, dsd.i widgetsMapper, tmh.d disclaimersMapper, imh.q searchIconFilterStateMapper, imh.o searchHintMapper, t5d.d swipeTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(filterMapper, "filterMapper");
        Intrinsics.checkNotNullParameter(widgetsMapper, "widgetsMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        Intrinsics.checkNotNullParameter(searchIconFilterStateMapper, "searchIconFilterStateMapper");
        Intrinsics.checkNotNullParameter(searchHintMapper, "searchHintMapper");
        Intrinsics.checkNotNullParameter(swipeTradeActionsMapper, "swipeTradeActionsMapper");
        this.f17429b = filterMapper;
        this.f17430c = widgetsMapper;
        this.d = disclaimersMapper;
    }

    public r(a0 buildHeader, h3b.y buildBalancesSection, h5b.d maintenanceMarginWidgetMapper, h3b.z footerActionsBuilder) {
        Intrinsics.checkNotNullParameter(buildHeader, "buildHeader");
        Intrinsics.checkNotNullParameter(buildBalancesSection, "buildBalancesSection");
        Intrinsics.checkNotNullParameter(maintenanceMarginWidgetMapper, "maintenanceMarginWidgetMapper");
        Intrinsics.checkNotNullParameter(footerActionsBuilder, "footerActionsBuilder");
        this.f17429b = buildBalancesSection;
        this.f17430c = maintenanceMarginWidgetMapper;
        this.d = footerActionsBuilder;
    }

    public r(wtk.r annualReturnMapper, wtk.v sharpeRatioMapper, q1 wealthDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(annualReturnMapper, "annualReturnMapper");
        Intrinsics.checkNotNullParameter(sharpeRatioMapper, "sharpeRatioMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimerMapper, "wealthDisclaimerMapper");
        this.f17429b = annualReturnMapper;
        this.f17430c = sharpeRatioMapper;
        this.d = wealthDisclaimerMapper;
    }
}
