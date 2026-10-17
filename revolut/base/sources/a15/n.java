package a15;

import a82.y;
import afa.e0;
import afa.z;
import ah1.s;
import ahd.r;
import an9.b0;
import android.os.Parcelable;
import aw0.k7;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.w0;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.delegates.kg;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.te;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n3;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.FlagCircleBadge;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import com.revolut.feature.credit.card.api.models.cancellation.PayoffBreakdown;
import com.revolut.feature.orders.ui.api.OrdersWidgetContract$Config;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.feature.pockets.api.navigation.PocketListType;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListContract$InputData;
import com.revolut.feature.pockets.impl.ui.pockets_list.model.CurrencyCountryKey;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.TransferWidgetCustomisationScreenContract$BottomSheetState;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.tab.crypto.api.extensions.account.AccountsExtensionContract$AccountsState;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoAccountsState;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoHeaderData;
import com.revolut.feature.transaction_list.impl.ui.scheduled_payments.ScheduledPaymentsScreenContract$Companion$PartnerSubscriptionsEntryPointParcel;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.cards.model.SharedRevolutCard;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import com.revolut.tracking.v3.AccountDetailsContext;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ej;
import ip0.q7;
import ip0.qd0;
import ip0.vd0;
import ip0.xh0;
import ip0.y10;
import ip0.zj;
import java.time.Instant;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import jq9.t;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import mx0.c7;
import qv0.c;
import tof.a3;
import zhm.a0;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class n implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f545c;

    public /* synthetic */ n(aq4.e eVar, aq4.k kVar, TextLocalisedClause textLocalisedClause) {
        this.f543a = 21;
        this.f544b = eVar;
        this.f545c = textLocalisedClause;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a0  */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v64, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v41, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v45, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r61, java.lang.Object r62, java.lang.Object r63) {
        /*
            Method dump skipped, instruction units count: 3348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a15.n.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r65, java.lang.Object r66, java.lang.Object r67) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a15.n.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        Collection collectionC;
        a82.c cVar = (a82.c) this.f544b;
        y yVar = (y) this.f545c;
        a82.d content = (a82.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        if (cVar.f1998b) {
            eVarB.add(((s12.f) yVar.f2028a).d(ApmMultibanco.f61815c.e()));
        }
        eVarB.addAll(((s12.a) yVar.f2029b).a(content.f1999a));
        Object[] elements = {new ListSubheaderDelegate.Model("ID_MORE_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.multibanco_area_section_more_actions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57322), c82.c.a(a82.a.Bills), c82.c.a(a82.a.ViaVerde)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        eVarB.addAll(((s12.i) yVar.f2030c).a(content.f2000b));
        a82.g info = content.f2001c;
        Intrinsics.checkNotNullParameter(info, "info");
        List list = info.f2004a;
        if (list.isEmpty()) {
            collectionC = f0.f322471a;
        } else {
            n3 n3Var = list.size() > 3 ? new n3(new TextLocalisedClause(R$string.multibanco_area_withdrawal_codes_see_all, null, null, 14), null) : null;
            RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.multibanco_area_withdrawal_codes_title, null, null, 14);
            List listV0 = d0.V0(list, 3);
            ArrayList arrayList = new ArrayList(w.t(listV0, 10));
            Iterator it8 = listV0.iterator();
            while (it8.hasNext()) {
                arrayList.add(c92.d.a((MultibancoWithdrawalCode) it8.next(), info.f2005b));
            }
            collectionC = u.c(RowsWidgetDelegate.Model.Companion.a(companion, "MultibancoAreaWithdrawalsMapper_header", textLocalisedClause, arrayList, true, n3Var, 96));
        }
        eVarB.addAll(collectionC);
        c82.b bVar = yVar.d;
        a82.b info2 = content.d;
        h93.f0 f0Var = info2.f1995a;
        Intrinsics.checkNotNullParameter(info2, "info");
        List listK = v.k(new ListSubheaderDelegate.Model("ID_CARDS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.multibanco_area_card_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57258), RowDelegate.Model.x(m93.c.a(bVar.f22072a, f0Var, info2.f1996b, false, null), null, null, null, null, null, 0, null, false, null, f0Var, 0, 0, 0, 0, null, -4194305, 15));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return u.a(eVarB);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object d(java.lang.Object r78, java.lang.Object r79, java.lang.Object r80) {
        /*
            Method dump skipped, instruction units count: 2464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a15.n.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r49, java.lang.Object r50, java.lang.Object r51) {
        /*
            Method dump skipped, instruction units count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a15.n.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v45, types: [aim.e] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v15, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable$Shimmering$Companion, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9 */
    private final Object g(Object obj2, Object obj3, Object obj4) {
        List list;
        Object obj5;
        CurrencyClause.Format.DisplayName displayName;
        List list2;
        ?? r72;
        int i;
        Iterable iterableC;
        String str;
        Collection collectionC;
        Collection arrayList;
        RowDelegate.Model model;
        ?? arrayList2;
        Set set;
        LinkedHashMap linkedHashMap;
        e0 e0Var;
        Map map;
        ?? C;
        xi0.b bVar;
        xi0.b bVar2;
        e0 e0Var2 = (e0) this.f544b;
        afa.g gVar = (afa.g) this.f545c;
        vf0.y yVar = (vf0.y) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(yVar, "<destruct>");
        List list3 = (List) yVar.f288491a;
        Set set2 = (Set) yVar.f288492b;
        List list4 = (List) yVar.f288493c;
        Map map2 = (Map) yVar.d;
        kn2.a aVar = (kn2.a) yVar.e;
        rfb.a aVar2 = (rfb.a) yVar.f;
        String str2 = gVar.f;
        PocketsListContract$InputData pocketsListContract$InputData = e0Var2.f3984b;
        CurrencyCountryKey currencyCountryKey = pocketsListContract$InputData.f80906b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap2.put(((xi0.b) entry.getKey()).f306286a, entry.getValue());
        }
        Map map3 = gVar.e;
        mn2.a aVar3 = aVar.f185975b;
        afa.b bVar3 = e0Var2.d;
        boolean zW = kotlin.text.d0.W(str2);
        if (zW) {
            list = list3;
            obj5 = list;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj6 : list3) {
                String str3 = ((io3.d) obj6).f163147c;
                List list5 = (List) linkedHashMap2.get(str3);
                if (list5 == null) {
                    list5 = f0.f322471a;
                }
                List list6 = list3;
                if (e0Var2.g(str2, str3, list5)) {
                    arrayList3.add(obj6);
                }
                list3 = list6;
            }
            list = list3;
            obj5 = arrayList3;
        }
        List listP0 = d0.P0((Iterable) obj5, e0Var2.f3985c);
        ArrayList arrayList4 = new ArrayList();
        Iterator it8 = listP0.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            displayName = CurrencyClause.Format.DisplayName.f57755a;
            if (!zHasNext) {
                break;
            }
            io3.d dVar = (io3.d) it8.next();
            Iterator it9 = it8;
            String str4 = dVar.f163147c;
            List list7 = list4;
            String str5 = dVar.f163147c;
            List list8 = (List) linkedHashMap2.get(str4);
            if (list8 == null) {
                list8 = f0.f322471a;
            }
            List list9 = list8;
            List list10 = list8;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj7 : list9) {
                mn2.a aVar4 = aVar3;
                rfb.a aVar5 = aVar2;
                if (obj7 instanceof mda.b) {
                    arrayList5.add(obj7);
                }
                aVar3 = aVar4;
                aVar2 = aVar5;
            }
            rfb.a aVar6 = aVar2;
            mn2.a aVar7 = aVar3;
            String str6 = (currencyCountryKey == null || (bVar2 = currencyCountryKey.f80928a) == null) ? null : bVar2.f306286a;
            String str7 = dVar.f163145a;
            boolean zF = Intrinsics.f(str6, str5);
            if (kotlin.text.d0.W(str2)) {
                set = set2;
                linkedHashMap = linkedHashMap2;
            } else {
                linkedHashMap = linkedHashMap2;
                set = set2;
                if (list10.size() > 1) {
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj8 : arrayList5) {
                        if (e0Var2.a(str2, ((mda.b) obj8).f204552b) || e0Var2.b(str5, str2)) {
                            arrayList6.add(obj8);
                        }
                    }
                    ArrayList arrayListA = bVar3.a(arrayList6);
                    C = new ArrayList(w.t(arrayListA, 10));
                    Iterator it10 = arrayListA.iterator();
                    while (it10.hasNext()) {
                        mda.c cVar = (mda.c) it10.next();
                        Iterator it11 = it10;
                        boolean z = zF && Intrinsics.f(cVar.a(), currencyCountryKey != null ? currencyCountryKey.f80929b : null);
                        wi0.b bVarA = cVar.a();
                        String strS = a0.d.s("POCKET_", str7, "_", bVarA.f297794a);
                        CompositeClause compositeClauseE = e0.e(str5, bVarA);
                        CompositeClause compositeClauseD = e0.d(str5);
                        e0 e0Var3 = e0Var2;
                        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str5, (ImageTransformations) null, (TextLocalisedClause) null, 14), z ? d8l.d.b(true) : new FlagCircleBadge(bVarA.f297794a), null, false, null, false, 60);
                        afa.d0 d0Var = new afa.d0(dVar, bVarA);
                        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                        AccountDetailsContext.a aVarNewBuilder = AccountDetailsContext.newBuilder();
                        aVarNewBuilder.h(str5);
                        w0 w0VarA = aVarNewBuilder.a();
                        companion.getClass();
                        C.add(new RowDelegate.Model(strS, image40, compositeClauseE, null, 0, compositeClauseD, null, null, 0, null, false, null, z, null, null, null, null, null, null, d0Var, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), 0, 0, 0, 0, 524279768));
                        it10 = it11;
                        e0Var2 = e0Var3;
                    }
                    e0Var = e0Var2;
                    map = map3;
                }
                a0.x((Iterable) C, arrayList4);
                it8 = it9;
                list4 = list7;
                linkedHashMap2 = linkedHashMap;
                set2 = set;
                map3 = map;
                aVar3 = aVar7;
                e0Var2 = e0Var;
                aVar2 = aVar6;
            }
            e0Var = e0Var2;
            if (arrayList5.size() > 1) {
                xi0.b.Companion.getClass();
                if (Intrinsics.f(map3.get(xi0.a.a(str5)), Boolean.TRUE)) {
                    ArrayList arrayListA2 = bVar3.a(arrayList5);
                    ArrayList arrayList7 = new ArrayList(w.t(arrayListA2, 10));
                    Iterator it12 = arrayListA2.iterator();
                    while (it12.hasNext()) {
                        mda.c cVar2 = (mda.c) it12.next();
                        boolean z3 = Intrinsics.f(cVar2.b(), currencyCountryKey != null ? currencyCountryKey.f80928a : null) && Intrinsics.f(cVar2.a(), currencyCountryKey.f80929b);
                        String strS2 = a0.d.s("POCKET_", str5, "_", cVar2.a().f297794a);
                        ArrayList arrayList8 = arrayList5;
                        CountryClause countryClause = new CountryClause(cVar2.a(), null);
                        CompositeClause compositeClauseD2 = e0.d(str5);
                        Iterator it13 = it12;
                        Map map4 = map3;
                        RowDelegate.Model.MainImage.IndentedImage indentedImage = new RowDelegate.Model.MainImage.IndentedImage(new CountryImage(cVar2.a().f297794a, (Integer) null, (ez0.e) null, 14), false, d8l.d.b(z3));
                        afa.d0 d0Var2 = new afa.d0(dVar, cVar2.a());
                        AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                        AccountDetailsContext.a aVarNewBuilder2 = AccountDetailsContext.newBuilder();
                        aVarNewBuilder2.h(str5);
                        w0 w0VarA2 = aVarNewBuilder2.a();
                        companion2.getClass();
                        arrayList7.add(new RowDelegate.Model(strS2, indentedImage, countryClause, null, 0, compositeClauseD2, null, null, 0, null, false, null, z3, null, null, null, null, null, null, d0Var2, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA2)), 0, 0, 0, 0, 524279768));
                        it12 = it13;
                        arrayList5 = arrayList8;
                        map3 = map4;
                    }
                    map = map3;
                    C = i26.l.e(e0.h(dVar, false, true, arrayList5.size()), arrayList7);
                } else {
                    map = map3;
                    RowDelegate.Model header = e0.h(dVar, Intrinsics.f((currencyCountryKey == null || (bVar = currencyCountryKey.f80928a) == null) ? null : bVar.f306286a, str5), false, arrayList5.size());
                    Intrinsics.checkNotNullParameter(header, "header");
                    C = u.c(header);
                }
            } else {
                map = map3;
                mda.c cVar3 = (mda.b) d0.d0(arrayList5);
                if (cVar3 == null) {
                    cVar3 = (mda.c) d0.d0(list10);
                }
                String strQ = j6.a.q("POCKET_", str7);
                xi0.b.Companion.getClass();
                CurrencyClause currencyClause = new CurrencyClause(xi0.a.a(str5), displayName, null, 4);
                Clause clauseF = e0.f(str5, cVar3);
                RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str5, (ImageTransformations) null, (TextLocalisedClause) null, 14), d8l.d.b(zF), null, false, null, false, 60);
                afa.d0 d0Var3 = new afa.d0(dVar, cVar3 != null ? cVar3.a() : null);
                AnalyticsContext.Companion companion3 = AnalyticsContext.INSTANCE;
                AccountDetailsContext.a aVarNewBuilder3 = AccountDetailsContext.newBuilder();
                aVarNewBuilder3.h(str5);
                w0 w0VarA3 = aVarNewBuilder3.a();
                companion3.getClass();
                C = u.c(new RowDelegate.Model(strQ, image402, currencyClause, null, 0, clauseF, null, null, 0, null, false, null, zF, null, null, null, null, null, null, d0Var3, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA3)), 0, 0, 0, 0, 524279768));
            }
            a0.x((Iterable) C, arrayList4);
            it8 = it9;
            list4 = list7;
            linkedHashMap2 = linkedHashMap;
            set2 = set;
            map3 = map;
            aVar3 = aVar7;
            e0Var2 = e0Var;
            aVar2 = aVar6;
        }
        e0 e0Var4 = e0Var2;
        rfb.a aVar8 = aVar2;
        Set set3 = set2;
        List list11 = list4;
        mn2.a aVar9 = aVar3;
        LinkedHashMap linkedHashMap3 = linkedHashMap2;
        if (Intrinsics.f(pocketsListContract$InputData.f80905a, PocketListType.RevXFiat.f80782a)) {
            list2 = null;
        } else {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                if (((List) entry2.getValue()).size() > 1) {
                    linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                }
            }
            Set setKeySet = linkedHashMap4.keySet();
            List list12 = list;
            ArrayList arrayList9 = new ArrayList(w.t(list12, 10));
            Iterator it14 = list12.iterator();
            while (it14.hasNext()) {
                arrayList9.add(((io3.d) it14.next()).f163147c);
            }
            Set setK = a1.k(set3, arrayList9);
            ArrayList arrayList10 = new ArrayList();
            Iterator it15 = setK.iterator();
            while (it15.hasNext()) {
                LinkedHashMap linkedHashMap5 = linkedHashMap3;
                Iterable iterable = (List) linkedHashMap5.get((String) it15.next());
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                a0.x(iterable, arrayList10);
                linkedHashMap3 = linkedHashMap5;
            }
            LinkedHashMap linkedHashMap6 = linkedHashMap3;
            if (kotlin.text.d0.W(str2)) {
                arrayList = null;
            } else {
                ArrayList arrayList11 = new ArrayList();
                for (Object obj9 : list12) {
                    if (setKeySet.contains(((io3.d) obj9).f163147c)) {
                        arrayList11.add(obj9);
                    }
                }
                arrayList = new ArrayList();
                Iterator it16 = arrayList11.iterator();
                while (it16.hasNext()) {
                    List list13 = (List) linkedHashMap6.get(((io3.d) it16.next()).f163147c);
                    if (list13 != null) {
                        arrayList2 = new ArrayList();
                        for (Object obj10 : list13) {
                            if (obj10 instanceof mda.a) {
                                arrayList2.add(obj10);
                            }
                        }
                    } else {
                        arrayList2 = f0.f322471a;
                    }
                    a0.x((Iterable) arrayList2, arrayList);
                }
            }
            if (arrayList == null) {
                arrayList = f0.f322471a;
            }
            List listU = d0.U(d0.E0(arrayList, arrayList10));
            if (!kotlin.text.d0.W(str2)) {
                ArrayList arrayList12 = new ArrayList();
                for (Object obj11 : listU) {
                    mda.c cVar4 = (mda.c) obj11;
                    e0 e0Var5 = e0Var4;
                    if (e0Var5.g(str2, cVar4.b().f306286a, u.c(cVar4))) {
                        arrayList12.add(obj11);
                    }
                    e0Var4 = e0Var5;
                }
                listU = arrayList12;
            }
            ArrayList<mda.c> arrayListA3 = bVar3.a(listU);
            ArrayList arrayList13 = new ArrayList(w.t(arrayListA3, 10));
            for (mda.c cVar5 : arrayListA3) {
                if (setKeySet.contains(cVar5.b().f306286a)) {
                    String str8 = cVar5.b().f306286a;
                    wi0.b bVarA2 = cVar5.a();
                    model = new RowDelegate.Model(a0.d.s("CURRENCY_", str8, "_", bVarA2.f297794a), new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str8, (ImageTransformations) null, (TextLocalisedClause) null, 14), new FlagCircleBadge(bVarA2.f297794a), null, false, null, false, 60), e0.e(str8, bVarA2), null, 0, e0.d(str8), null, null, 0, new pf(new TextLocalisedClause(R.string.common_action_add, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, new afa.a0(str8, bVarA2), null, 0, 0, 0, 0, 532673496);
                } else {
                    String str9 = cVar5.b().f306286a;
                    String strQ2 = j6.a.q("CURRENCY_", str9);
                    xi0.b.Companion.getClass();
                    model = new RowDelegate.Model(strQ2, new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str9, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62), new CurrencyClause(xi0.a.a(str9), displayName, null, 4), null, 0, e0.f(str9, cVar5), null, null, 0, new pf(new TextLocalisedClause(R.string.common_action_add, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, new z(str9, cVar5.a()), null, 0, 0, 0, 0, 532673496);
                }
                arrayList13.add(model);
            }
            list2 = arrayList13;
        }
        if (list2 == null) {
            list2 = f0.f322471a;
        }
        List list14 = !zW ? f0.f322471a : list11;
        if (aVar9 == null || !zW) {
            r72 = 0;
            i = 14;
            iterableC = f0.f322471a;
        } else {
            r72 = 0;
            i = 14;
            iterableC = u.c(new RowDelegate.Model("SWITCH_TO_REVOLUT_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_switch_to_revolut, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.profile.api.R$string.profileHome_settings_item_account_switch_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.profile.api.R$string.account_switch_profile_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar9, null, 0, 0, 0, 0, 532676568));
        }
        if (aVar8.f253748a && zW) {
            str = str2;
            collectionC = u.c(new RowDelegate.Model("SWITCH_SALARY_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_salary, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.profile.api.R$string.profileHome_settings_item_salary_switch_title, r72, r72, i), null, 0, new TextLocalisedClause(com.revolut.feature.profile.api.R$string.profileHome_settings_item_salary_switch_subtitle, r72, r72, i), null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar8, null, 0, 0, 0, 0, 532676568));
        } else {
            str = str2;
            collectionC = f0.f322471a;
        }
        ArrayList arrayListE0 = d0.E0(d0.E0(iterableC, collectionC), arrayList4);
        yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
        ArrayList arrayListE02 = d0.E0(arrayListE0, list14);
        List list15 = list2;
        yp0.b.k(list15, 0, 0, 0, 0, 31);
        ArrayList arrayListE03 = d0.E0(list15, arrayListE02);
        boolean zIsEmpty = arrayListE03.isEmpty();
        List listC = arrayListE03;
        if (zIsEmpty) {
            listC = u.c(new FullScreenStateDelegate.Model("ID_NOT_FOUND", new TextLocalisedClause(R.string.search_empty_message, u.c(str), r72, 12), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", r72, r72, r72, 30)), zj.REGULAR, null, false, null, null, true, 0, 0, 31716));
        }
        return listC;
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        s sVar = (s) this.f544b;
        ah1.e eVar = (ah1.e) this.f545c;
        SharedRevolutCardWrapper cardWrapper = (SharedRevolutCardWrapper) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        CardDetailsDesignConfig cardDetailsDesignConfig = (CardDetailsDesignConfig) eVar.f4852b.getContent();
        o5l.g gVar = eVar.f4853c;
        boolean z = eVar.d;
        aim.e eVarB = u.b();
        lw2.a aVar = sVar.f4871a;
        SharedRevolutCard sharedRevolutCard = ((RetailCardWrapper) cardWrapper).f64443a;
        String str = sharedRevolutCard.f104693a;
        int i = R$attr.uikit_dp16;
        eVarB.add(eg1.a.a(aVar, str, cardWrapper, cardDetailsDesignConfig, gVar, i, i, sharedRevolutCard));
        if (z) {
            sa saVar = new sa("SCAM_WARNING_LIST_ID", (Clause) new TextLocalisedClause(com.revolut.feature.add_card_to_google_pay_shared.impl.R$string.apple_pay_in_app_verification_fraud_warning_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.add_card_to_google_pay_shared.impl.R$string.apple_pay_in_app_verification_fraud_warning_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_warning, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4056);
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
            eVarB.add(saVar);
        }
        return u.a(eVarB);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object i(Object obj2, Object obj3, Object obj4) throws Throwable {
        CompositeClause compositeClause;
        Integer numValueOf;
        Object next;
        ahd.n nVar = (ahd.n) this.f544b;
        ahd.s sVar = (ahd.s) this.f545c;
        List items = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        List<WatchlistItem> list = items;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (WatchlistItem watchlistItem : list) {
            arrayList.add(new wh(watchlistItem.getId(), ((n3d.d) sVar.f4957a).e(watchlistItem.f86898a.d, watchlistItem, watchlistItem.getId()), u.c(new SwipeToActionDelegate.SwipeAction("delete-list-id", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_watchlist_screen_item_swipe_action_delete, null, null, 14), xh0.NEGATIVE, null, new ahd.m(watchlistItem), null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        }
        Data data = nVar.d;
        List list2 = arrayList;
        if (data != null) {
            List listA = sVar.f4958b.a(data, arrayList);
            list2 = arrayList;
            if (listA != null) {
                list2 = listA;
            }
        }
        if (items.isEmpty()) {
            List listC = u.c(new FullScreenStateDelegate.Model("empty-state-list-id", new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_rev10_watchlist_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_rev10_watchlist_empty_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D241", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_watchlist_screen_empty_watchlist_add_new_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1856));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        ArrayList arrayListJ = ue0.e.J(new RowDelegate.Model("add-to-watchlist-list-id", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_plus, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_widget_empty_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), list2);
        yp0.b.k(arrayListJ, 0, 0, 0, 0, 31);
        String str = nVar.f4951c;
        if (str != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj5 : arrayListJ) {
                if (obj5 instanceof wh) {
                    arrayList2.add(obj5);
                }
            }
            Iterator it8 = arrayList2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                Object obj6 = ((RowDelegate.Model) ((wh) next).f54925b).u;
                if ((obj6 instanceof ifd.g) && Intrinsics.f(((ifd.g) obj6).a().getId(), str)) {
                    break;
                }
            }
            wh whVar = (wh) next;
            if (whVar != null) {
                c.b bVar = c.b.f249511a;
                Intrinsics.checkNotNullParameter(bVar, "<set-?>");
                whVar.e = bVar;
            }
        }
        if (items.size() <= 1) {
            return arrayListJ;
        }
        int size = items.size();
        ogd.k kVar = nVar.f4949a;
        if (kVar != null) {
            ogd.m mVar = kVar.f225123a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(vc.o.r(mVar), null, new Click(30, (Integer) null, (Object) null, "Sorting", false), 10);
            Float fValueOf = Float.valueOf(16.0f);
            ogd.l lVar = kVar.f225124b;
            switch (r.f4956b[mVar.ordinal()]) {
                case 1:
                    numValueOf = null;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    int i = lVar == null ? -1 : r.f4955a[lVar.ordinal()];
                    if (i == -1) {
                        numValueOf = null;
                    } else if (i != 1) {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_down);
                    } else {
                        numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_up);
                    }
                    break;
                case 6:
                    int i2 = lVar == null ? -1 : r.f4955a[lVar.ordinal()];
                    if (i2 == -1) {
                        numValueOf = null;
                    } else if (i2 != 1) {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_up);
                    } else {
                        numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_down);
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Clause[] elements = {textLocalisedClause, numValueOf != null ? new ImageClause(numValueOf.intValue(), ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            m70.a.t(t0.f186434a);
            compositeClause = new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        } else {
            compositeClause = null;
        }
        return ue0.e.J(new ListSubheaderDelegate.Model("header-list-id", (Image) null, (Clause) new CompositeClause(v.k(new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.watchlists_subheader_assets, null, null, 14), new TextClause(String.valueOf(size), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12), (Image) null, (Clause) compositeClause, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450), arrayListJ);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        int i;
        Collection collectionG;
        RandomAccess randomAccess;
        chf.i iVar;
        TextLocalisedClause textLocalisedClause;
        Collection collectionI;
        int i2;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        List list;
        ahf.l lVar = (ahf.l) this.f544b;
        ahf.e0 e0Var = (ahf.e0) this.f545c;
        b9e.c content = (b9e.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (!content.f13735b.b() && lVar.f5082a.getLoading()) {
            return iii.c.c(5);
        }
        List content2 = lVar.f5083b;
        OrdersWidgetContract$Config config = lVar.f5084c;
        String str = lVar.d;
        chf.g incomeSorterData = lVar.f;
        lgf.a autoTopUpPayment = lVar.f5085g;
        List list2 = lVar.f5086h;
        int i3 = lVar.i;
        int i5 = lVar.f5087j;
        q qVar = lVar.k;
        b9e.e eVar = content.f13735b;
        xi0.b bVar = content.f13734a;
        List list3 = content.f13736c;
        List list4 = content.d;
        Map map = content.e;
        aim.e eVarB = u.b();
        a9e.h hVar = e0Var.f5077a;
        List list5 = eVar.f13737a;
        List list6 = eVar.o;
        List list7 = eVar.f13745n;
        List list8 = eVar.f13739c;
        eVarB.addAll(((mae.o) hVar).n(list5));
        List list9 = eVar.k;
        List listK = v.k(new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.schedule_payments_section_boleto_title, null, null, 14), new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorGrey50), (Float) null, (Float) null, 28));
        m70.a.t(t0.f186434a);
        ahf.e0.b(e0Var, eVarB, bVar, list3, list4, map, qVar, "BOLETO_HEADER_ID", list9, new CompositeClause(listK, mif.a.X(" "), null, null, 12), null, null, 3072);
        ahf.e0.b(e0Var, eVarB, bVar, list3, list4, map, qVar, "REFUNDS_HEADER_ID", eVar.f13742j, new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.schedule_payments_section_refund_title, null, null, 14), null, null, 7168);
        ahf.e0.b(e0Var, eVarB, bVar, list3, list4, map, qVar, "DEFERRED_PAYMENTS_HEADER_ID", eVar.f13740g, new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.subscriptions_list_section_deferred_payments_title, null, null, 14), null, null, 7168);
        List list10 = eVar.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list10) {
            if (((RecurringPaymentWithExtra) obj5).getF81653a().f249316b == ibd.f.ACTIVE) {
                arrayList.add(obj5);
            }
        }
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.schedule_payments_section_transfer_title, null, null, 14);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj6 : list10) {
            if (((RecurringPaymentWithExtra) obj6).getF81653a().f249316b == ibd.f.INACTIVE) {
                arrayList2.add(obj6);
            }
        }
        ahf.e0.b(e0Var, eVarB, bVar, list3, list4, map, qVar, "TRANSFERS_HEADER_ID", arrayList, textLocalisedClause4, arrayList2, null, 6144);
        List<RecurringPaymentWithExtra> list11 = eVar.f13743l;
        if ((list11 instanceof Collection) && list11.isEmpty()) {
            i = com.revolut.feature.transaction_list.impl.R$string.subscriptions_list_section_bills_title;
        } else {
            for (RecurringPaymentWithExtra recurringPaymentWithExtra : list11) {
                if (qua.u.y(recurringPaymentWithExtra.getF81653a()) || qua.u.I(recurringPaymentWithExtra.getF81653a())) {
                    i = com.revolut.feature.transaction_list.impl.R$string.subscriptions_list_section_bills_taxes_title;
                    break;
                }
            }
            i = com.revolut.feature.transaction_list.impl.R$string.subscriptions_list_section_bills_title;
        }
        ahf.e0.b(e0Var, eVarB, bVar, list3, list4, map, qVar, "BILLS_HEADER_ID", eVar.f13743l, new TextLocalisedClause(i, null, null, 14), null, null, 7168);
        ahf.e0.b(e0Var, eVarB, bVar, list3, list4, map, qVar, "SUBSCRIPTIONS_HEADER_ID", eVar.f13738b, new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_list_section_subscriptions_title, null, null, 14), null, null, 7168);
        if (!eVar.f13738b.isEmpty() && (str == null || str.length() == 0)) {
            if (i3 > 0) {
                i2 = R$drawable.uikit_icn_24_apps;
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.rewards_scheduled_payments_entry_point_with_subscriptions_title, null, null, 14);
                textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.rewards_scheduled_payments_entry_point_with_subscriptions_description, u.c(String.valueOf(i3)), null, 12);
            } else if (i5 <= 0) {
                list = f0.f322471a;
                eVarB.addAll(list);
            } else {
                i2 = R$drawable.uikit_icn_24_premium;
                textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.rewards_scheduled_payments_entry_point_without_subscriptions_title, u.c(String.valueOf(i5)), null, 12);
                textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.rewards_scheduled_payments_entry_point_without_subscriptions_description, null, null, 14);
            }
            TextLocalisedClause textLocalisedClause5 = textLocalisedClause2;
            TextLocalisedClause textLocalisedClause6 = textLocalisedClause3;
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i6 = R$attr.uikit_colorAccentNeutral;
            List listC = u.c(new RowDelegate.Model("PARTNER_SUBSCRIPTIONS_ENTRY_POINT_ID", new RowDelegate.Model.MainImage.Image40(wp5.y.h(new Color.Solid(i6), 0.1f, companion, i2, new Color.Solid(i6)), null, null, false, null, false, 62), textLocalisedClause5, null, 0, textLocalisedClause6, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, ScheduledPaymentsScreenContract$Companion$PartnerSubscriptionsEntryPointParcel.f91947a, null, 0, 0, 0, 0, 532675544));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            list = listC;
            eVarB.addAll(list);
        }
        ahf.e0.b(e0Var, eVarB, bVar, list3, list4, map, qVar, "PAY_LATER_HEADER_ID", eVar.d, new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_list_section_pay_later_title, null, null, 14), null, null, 7168);
        ahf.e0.b(e0Var, eVarB, bVar, list3, list4, map, qVar, "LOANS_LATER_HEADER_ID", eVar.e, new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_list_section_loans_title, null, null, 14), null, null, 7168);
        ahf.e0.b(e0Var, eVarB, bVar, list3, list4, map, qVar, "PIX_LATER_HEADER_ID", eVar.f13744m, new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.schedule_payments_section_pix_automatico_title, null, null, 14), null, null, 7168);
        yd9.g gVar = e0Var.f5078b;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(content2, "content");
        if (content2.isEmpty()) {
            collectionG = f0.f322471a;
        } else {
            List list12 = content2;
            int size = config.f78610c;
            if (size == -1) {
                size = content2.size();
            }
            List listV0 = d0.V0(list12, size);
            ArrayList arrayList3 = new ArrayList(w.t(listV0, 10));
            Iterator it8 = listV0.iterator();
            while (it8.hasNext()) {
                arrayList3.add(gVar.a((wd9.c) it8.next()));
            }
            OrdersWidgetContract$Config.Style style = config.f78609b;
            if (style instanceof OrdersWidgetContract$Config.Style.HeaderUnboxed) {
                if (((OrdersWidgetContract$Config.Style.HeaderUnboxed) style).f78612a) {
                    ListSubheaderDelegate.Model modelB = gVar.b(config, content2.size());
                    List listP = i2b.a.p(arrayList3, yd9.g.c(config, content2.size()));
                    yp0.b.k(listP, 0, 0, 0, 0, 31);
                    collectionG = i2b.a.q(modelB, listP);
                } else {
                    ListSubheaderDelegate.Model modelB2 = gVar.b(config, content2.size());
                    yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                    collectionG = i2b.a.q(modelB2, arrayList3);
                }
            } else if (style instanceof OrdersWidgetContract$Config.Style.HeaderBoxed) {
                collectionG = yp0.b.g(i2b.a.p(arrayList3, yd9.g.c(config, content2.size())), gVar.b(config, content2.size()), yp0.e0.INSIDE_BOX, 0, 0, 124);
            } else {
                if (!(style instanceof OrdersWidgetContract$Config.Style.NoHeader)) {
                    throw new NoWhenBranchMatchedException();
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                collectionG = arrayList3;
            }
        }
        eVarB.addAll(collectionG);
        List list13 = list8;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj7 : list13) {
            if (!qua.u.A(((RecurringPaymentWithExtra) obj7).getF81653a())) {
                arrayList4.add(obj7);
            }
        }
        TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_list_section_direct_debits_title, null, null, 14);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj8 : list13) {
            if (qua.u.A(((RecurringPaymentWithExtra) obj8).getF81653a())) {
                arrayList5.add(obj8);
            }
        }
        int i21 = 10;
        ahf.e0.b(e0Var, eVarB, bVar, list3, list4, map, qVar, "DIRECT_DEBITS_HEADER_ID", arrayList4, textLocalisedClause7, null, arrayList5, 5120);
        List list14 = list7;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj9 : list14) {
            if (((RecurringPaymentWithExtra) obj9).getF81653a().f249316b == ibd.f.ACTIVE) {
                arrayList6.add(obj9);
            }
        }
        TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_list_section_pay_to_title, null, null, 14);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj10 : list14) {
            if (((RecurringPaymentWithExtra) obj10).getF81653a().f249316b == ibd.f.INACTIVE) {
                arrayList7.add(obj10);
            }
        }
        ahf.e0.b(e0Var, eVarB, bVar, list3, list4, map, qVar, "PAY_TO_DEBITS_HEADER_ID", arrayList6, textLocalisedClause8, arrayList7, null, 6144);
        List list15 = list6;
        ArrayList arrayList8 = new ArrayList();
        for (Object obj11 : list15) {
            if (((RecurringPaymentWithExtra) obj11).getF81653a().f249316b == ibd.f.ACTIVE) {
                arrayList8.add(obj11);
            }
        }
        TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_list_section_upi_title, null, null, 14);
        ArrayList arrayList9 = new ArrayList();
        for (Object obj12 : list15) {
            if (((RecurringPaymentWithExtra) obj12).getF81653a().f249316b == ibd.f.SUSPENDED) {
                arrayList9.add(obj12);
            }
        }
        ahf.e0.b(e0Var, eVarB, bVar, list3, list4, map, qVar, "UPI_HEADER_ID", arrayList8, textLocalisedClause9, arrayList9, null, 6144);
        if (autoTopUpPayment != null) {
            AutoTopUpState autoTopUpState = autoTopUpPayment.f195111b;
            xgf.b bVar2 = e0Var.f;
            Intrinsics.checkNotNullParameter(autoTopUpPayment, "autoTopUpPayment");
            TopupMethod.StoredMethod storedMethod = autoTopUpPayment.f195110a;
            dj0.d dVar = autoTopUpState.e;
            if (dVar != null) {
                MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                dj0.d dVar2 = autoTopUpState.f;
                collectionI = dVar2 != null ? yp0.b.i(new RowDelegate.Model("AUTO_TOP_UP_LIST_ID", ((di6.a) bVar2.f305757a).b(storedMethod.getE()), null, null, new TextClause(storedMethod.getF60522c(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_list_auto_top_ups_subtitle, u.c(moneyClause), null, 12), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12), null, null, false, 126), false, false, null, null, null, null, null, autoTopUpPayment, null, 0, 0, 0, 0, 1056962412), new ListSubheaderDelegate.Model("AUTO_TOP_UP_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscriptions_list_section_auto_top_ups_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126) : f0.f322471a;
            } else {
                collectionI = f0.f322471a;
            }
            eVarB.addAll(collectionI);
        }
        aim.e eVarB2 = u.b();
        chf.i iVar2 = e0Var.f5079c;
        Intrinsics.checkNotNullParameter(incomeSorterData, "incomeSorterData");
        if (Intrinsics.f(incomeSorterData, chf.f.f24216a)) {
            randomAccess = f0.f322471a;
        } else {
            if (!(incomeSorterData instanceof chf.e)) {
                throw new NoWhenBranchMatchedException();
            }
            chf.e eVar2 = (chf.e) incomeSorterData;
            List<chf.d> list16 = eVar2.f24213a;
            ArrayList arrayList10 = new ArrayList(w.t(list16, 10));
            for (chf.d dVar3 : list16) {
                IncomeSorter incomeSorter = dVar3.f24211a;
                a3 a3Var = dVar3.f24212b;
                q qVar2 = eVar2.f24214b;
                List list17 = eVar2.f24215c;
                TextClause textClause = new TextClause(thf.m.a(iVar2.f24219b, a3Var, qVar2.f181795b, null, null, null, null, null, Constants.TAG_FC_SPEED_MODE), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str2 = incomeSorter.f99160a;
                thf.d dVar4 = iVar2.f24218a;
                Image imageB = dVar4.b(a3Var, qVar2);
                LayeredImage layeredImageD = thf.d.d(dVar4, a3Var);
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(imageB, layeredImageD != null ? new RawImageBadge(layeredImageD) : null, null, false, null, false, 60);
                tf tfVar = new tf(new yy0.h(textClause, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
                xi0.b bVar3 = a3Var.N1.f115083b;
                j9l.a aVar = iVar2.f24220c;
                ArrayList arrayList11 = incomeSorter.f99164h;
                ahf.e0 e0Var2 = e0Var;
                ArrayList arrayList12 = new ArrayList(w.t(arrayList11, i21));
                Iterator it9 = arrayList11.iterator();
                while (it9.hasNext()) {
                    arrayList12.add(((IncomeSorterDestination) it9.next()).f99166a);
                }
                dj0.d dVarA = aVar.a(bVar3, arrayList12, list17);
                hzi.a aVar2 = incomeSorter.i;
                int i22 = aVar2 == null ? -1 : chf.h.f24217a[aVar2.ordinal()];
                if (i22 == -1) {
                    iVar = iVar2;
                    textLocalisedClause = null;
                } else if (i22 == 1) {
                    iVar = iVar2;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_scheduled_payments_subtitle_sort_with_confirmation, null, null, 14);
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = iVar2;
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_scheduled_payments_subtitle_sorts_automatically, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorStatusSuccess), false, false, 254), i21);
                }
                TextLocalisedClause textLocalisedClause10 = dVarA != null ? new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_scheduled_payments_subtitle_payday, u.c(new MoneyClause(dVarA, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : null;
                arrayList10.add(new RowDelegate.Model(str2, image40, textClause, null, 0, (textLocalisedClause != null || textLocalisedClause10 == null) ? (textLocalisedClause == null || textLocalisedClause10 == null) ? null : new CompositeClause(v.k(textLocalisedClause10, textLocalisedClause), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12) : textLocalisedClause10, null, null, 0, tfVar, false, null, false, null, null, null, null, null, null, incomeSorter, null, 0, 0, 0, 0, 532675544));
                e0Var = e0Var2;
                iVar2 = iVar;
                i21 = 10;
            }
            randomAccess = arrayList10;
        }
        ahf.e0 e0Var3 = e0Var;
        eVarB2.addAll((Collection) randomAccess);
        aim.e eVarA = u.a(eVarB2);
        yp0.e0 e0Var4 = yp0.e0.OUTSIDE_BOX;
        int i32 = R$attr.uikit_dp8;
        int i33 = R$attr.uikit_dp16;
        boolean zIsEmpty = eVarA.isEmpty();
        Collection collectionD = eVarA;
        if (!zIsEmpty) {
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("INCOME_SORTER_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_scheduled_payments_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            int i43 = R$attr.uikit_dp16;
            int i59 = R$attr.uikit_dp0;
            yp0.b.p(model, i43, i59, i59, i59);
            collectionD = yp0.b.d(eVarA, model, e0Var4, i32, i32, i33, i33);
        }
        eVarB.addAll(collectionD);
        aim.e eVarA2 = u.a(eVarB);
        if (eVarA2.isEmpty() && str != null && str.length() != 0) {
            List listC2 = u.c(new FullScreenStateDelegate.Model("NO_RESULTS_LIST_ID", new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_members_search_empty_state, null, null, 14), new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.scheduled_payments_search_no_scheduled_payments_found, u.c(str), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736));
            yp0.b.k(listC2, 0, 0, 0, 0, 31);
            return listC2;
        }
        if (!eVarA2.isEmpty()) {
            return (str == null || str.length() == 0) ? d0.E0(e0Var3.a(), d0.E0(eVarA2, list2)) : d0.E0(e0Var3.a(), eVarA2);
        }
        List listC3 = u.c(new FullScreenStateDelegate.Model("NO_SUBSCRIPTIONS_ITEM_LIST_ID", new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.schedule_payments_empty_state_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.transactions_upcoming_empty_state_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D098", null, null, null, 30)), new l6(8, new TextLocalisedClause(com.revolut.feature.transaction_list.impl.R$string.transactions_upcoming_empty_state_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), h4.ACCENT), zj.REGULAR, false, null, null, null, 1984));
        yp0.b.k(listC3, 0, 0, 0, 0, 31);
        return d0.E0(e0Var3.a(), d0.E0(listC3, list2));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a15.n.k(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        uje.a aVar = ((ake.b) this.f544b).f5808a;
        AccountsExtensionContract$AccountsState accountsExtensionContract$AccountsState = (AccountsExtensionContract$AccountsState) this.f545c;
        CryptoHeaderData headerData = (CryptoHeaderData) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        if (headerData.f != yh5.a.ENABLED_AND_ONBOARDED && !headerData.f89822h) {
            ChosenBackground chosenBackground = ((CryptoAccountsState) accountsExtensionContract$AccountsState).f89817a.f5804c;
            return u.c(aVar.d(chosenBackground != null ? chosenBackground.f63742b : null));
        }
        ake.a aVar2 = ((CryptoAccountsState) accountsExtensionContract$AccountsState).f89817a;
        List list = aVar2.f5803b;
        SimpleTotalValueChart simpleTotalValueChart = aVar2.f;
        AccountSelectionNavBarContentView.b bVar = aVar2.f5805g;
        ChosenBackground chosenBackground2 = aVar2.f5804c;
        return u.c(aVar.b(headerData, list, simpleTotalValueChart, bVar, chosenBackground2 != null ? chosenBackground2.f63742b : null));
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        eg egVar;
        ReferralContactDelegate.Model model;
        Collection collectionI;
        RewardDelegate.Model modelD;
        ActionsView.Item item;
        ActionsView.Item item2;
        ActionsView.Item item3;
        an9.n nVar = (an9.n) this.f544b;
        an9.y yVar = (an9.y) this.f545c;
        an9.m content = (an9.m) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        PayeesFlowType payeesFlowType = nVar.e;
        Set selected = nVar.f6595c;
        if (payeesFlowType instanceof PayeesFlowType.RequireAuthentication) {
            im9.c selectedFilter = nVar.f6593a;
            int i = content.f6591b;
            int i2 = content.f6592c;
            int i3 = content.d;
            Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
            if (i > 0) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_select_tag_friends, u.c(Integer.valueOf(i)), null, 12);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                im9.c cVar = im9.c.REVOLUT;
                item = new ActionsView.Item("PAYEES_ACTION_DELEGATE_REVOLUT_LIST_ID", selectedFilter == cVar ? mx0.d.ACCENT : mx0.d.SEMIBLACK, false, null, null, textLocalisedClause, resourceImage, null, null, null, false, null, null, cVar, null, 24476);
            } else {
                item = null;
            }
            if (i2 > 0) {
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_select_tag_accounts, u.c(Integer.valueOf(i2)), null, 12);
                im9.c cVar2 = im9.c.ACCOUNTS;
                item2 = new ActionsView.Item("PAYEES_ACTION_DELEGATE_ACCOUNTS_LIST_ID", selectedFilter == cVar2 ? mx0.d.ACCENT : mx0.d.SEMIBLACK, false, null, null, textLocalisedClause2, null, null, null, null, false, null, null, cVar2, null, 24476);
            } else {
                item2 = null;
            }
            if (i3 > 0) {
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_select_tag_cards, u.c(Integer.valueOf(i3)), null, 12);
                im9.c cVar3 = im9.c.CARDS;
                item3 = new ActionsView.Item("PAYEES_ACTION_DELEGATE_CARDS_LIST_ID", selectedFilter == cVar3 ? mx0.d.ACCENT : mx0.d.SEMIBLACK, false, null, null, textLocalisedClause3, null, null, null, null, false, null, null, cVar3, null, 24476);
            } else {
                item3 = null;
            }
            ActionsView.Item[] elements = {item, item2, item3};
            Intrinsics.checkNotNullParameter(elements, "elements");
            eVarB.add(new ip0.z("PAYEES_ACTION_DELEGATE_LIST_ID", kotlin.collections.d.L(elements), null, null, 0, 0, 124));
        }
        an9.b bVar = yVar.f6606a;
        List paymentRecipients = d0.d1(selected);
        Intrinsics.checkNotNullParameter(paymentRecipients, "items");
        if (paymentRecipients.isEmpty()) {
            egVar = null;
        } else {
            km9.g gVar = bVar.f6578a;
            Intrinsics.checkNotNullParameter(paymentRecipients, "paymentRecipients");
            List<t> list = paymentRecipients;
            ArrayList<ReferralContactDelegate.Model> arrayList = new ArrayList(w.t(list, 10));
            for (t tVar : list) {
                if (tVar instanceof jq9.y) {
                    model = ((xl3.d) gVar.f185741c).k(((jq9.y) tVar).f177526a);
                } else if (tVar instanceof jq9.v) {
                    model = gVar.f185739a.b(((jq9.v) tVar).f177523a);
                } else {
                    if (!(tVar instanceof jq9.w)) {
                        throw new UnsupportedOperationException(gVar + " is not supported in payees");
                    }
                    aqa.c cVar4 = gVar.f185740b;
                    CardOwner cardOwner = ((jq9.w) tVar).f177524a.f81495a;
                    Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
                    String str = cardOwner.f81490a;
                    mra.b bVar2 = (mra.b) ((mra.i) cVar4).f208094a;
                    model = new ReferralContactDelegate.Model(str, bVar2.a(cardOwner), new TextClause(cardOwner.f81491b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, bVar2.b(cardOwner), null, null, null, cardOwner, null, 393176);
                }
                arrayList.add(ReferralContactDelegate.Model.e(model, null, null, null, null, false, tVar, 6143));
            }
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (ReferralContactDelegate.Model model2 : arrayList) {
                AvatarModel avatarModelF0 = model2.f53162b;
                AvatarModel.Default r92 = avatarModelF0 instanceof AvatarModel.Default ? (AvatarModel.Default) avatarModelF0 : null;
                if (r92 != null) {
                    avatarModelF0 = AvatarModel.Default.f0(r92, new DangerCircleBadge(dw0.a.Error), OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
                }
                arrayList2.add(ReferralContactDelegate.Model.e(model2, null, avatarModelF0, null, null, false, null, 8189));
            }
            egVar = new eg("ID_PAYEES_SELECTED_SCROLL", arrayList2, null, BitmapDescriptorFactory.HUE_RED, 0, 0, 1020);
            yp0.b.r(egVar, 0, 0, 0, 0, 15);
        }
        if (egVar != null) {
            eVarB.add(egVar);
        }
        b0 b0Var = yVar.f6607b;
        List suggested = content.e;
        Intrinsics.checkNotNullParameter(suggested, "suggested");
        if (suggested.isEmpty()) {
            collectionI = f0.f322471a;
        } else {
            ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("ID_PAYEES_SUGGESTED_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_select_section_suggested, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338);
            km9.g gVar2 = b0Var.f6579a;
            List paymentRecipients2 = d0.V0(suggested, 12);
            Intrinsics.checkNotNullParameter(paymentRecipients2, "paymentRecipients");
            List<t> list2 = paymentRecipients2;
            ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
            for (t tVar2 : list2) {
                if (tVar2 instanceof jq9.y) {
                    modelD = ((xl3.d) gVar2.f185741c).j(((jq9.y) tVar2).f177526a, false);
                } else if (tVar2 instanceof jq9.v) {
                    modelD = gVar2.f185739a.a(((jq9.v) tVar2).f177523a);
                } else {
                    if (!(tVar2 instanceof jq9.w)) {
                        throw new UnsupportedOperationException(gVar2 + " is not supported in payees");
                    }
                    modelD = ((mra.i) gVar2.f185740b).d(((jq9.w) tVar2).f177524a.f81495a);
                }
                arrayList3.add(RewardDelegate.Model.e(modelD, null, false, tVar2, 383));
            }
            collectionI = yp0.b.i(new te("ID_PAYEES_SUGGESTED_GRID_ID", arrayList3, 124), model3, null, 0, 0, 126);
        }
        eVarB.addAll(collectionI);
        an9.z zVar = yVar.f6608c;
        List recipients = content.f6590a;
        Intrinsics.checkNotNullParameter(recipients, "recipients");
        Intrinsics.checkNotNullParameter(selected, "selected");
        List<t> list3 = recipients;
        ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
        for (t tVar3 : list3) {
            boolean zContains = selected.contains(tVar3);
            RowDelegate.Model modelA = zVar.f6609a.a(tVar3);
            arrayList4.add(new SelectableDelegate.Model(j6.a.q("PAYEES_SELECTABLE_DELEGATE_PREFIX_", modelA.f53228a), modelA, zContains ? qd0.SELECTED : qd0.UNSELECTED, SelectableDelegate.b.C0424b.f53319a, vd0.CHECKBOX, false, null, tVar3, kg.SMALL, false, 31968));
        }
        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList4);
        return u.a(eVarB);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        dj0.d dVar = (dj0.d) this.f544b;
        YearMonth yearMonth = (YearMonth) this.f545c;
        od0.i content = (od0.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        PortfolioGoal portfolioGoal = (PortfolioGoal) content.f224257a;
        return new anc.m(((portfolioGoal == null || !Intrinsics.f(portfolioGoal.f95699a, dVar)) || (portfolioGoal == null || !Intrinsics.f(portfolioGoal.f95700b, yearMonth))) && dVar.f(dj0.d.e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f3  */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v47, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [com.revolut.core.ui_kit.delegates.ac] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9, types: [com.revolut.core.ui_kit.delegates.pb] */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5, types: [com.revolut.core.ui_kit.delegates.PlanWidgetDelegate$Model$ActionsGlow] */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r6v20, types: [com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r34, java.lang.Object r35, java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a15.n.o(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        boolean z;
        ej ejVar;
        aq4.e eVar = (aq4.e) this.f544b;
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) this.f545c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        io3.d dVar = (io3.d) pair.f186385a;
        wi0.b bVar = (wi0.b) pair.f186386b;
        long j2 = dVar.i;
        String str = dVar.f163147c;
        dj0.d dVar2 = eVar.f8247a;
        boolean z3 = j2 >= dVar2.f115082a;
        PayoffBreakdown payoffBreakdown = eVar.d;
        long j3 = dVar.i;
        xi0.b.Companion.getClass();
        dj0.d dVar3 = new dj0.d(j3, xi0.a.a(str));
        aim.e eVarB = u.b();
        if (payoffBreakdown != null) {
            aim.e eVarB2 = u.b();
            eVarB2.add(new CellDetailsDelegate.Model("breakdown_credit_balance", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_checkout_section_payoff_breakdown_card_balance_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(payoffBreakdown.f68715a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
            dj0.d dVar4 = payoffBreakdown.f68716b;
            if (dVar4 != null) {
                eVarB2.add(new CellDetailsDelegate.Model("breakdown_non_charged_instalments", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_checkout_section_payoff_breakdown_instalment_plans_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
            }
            eVarB2.add(new CellDetailsDelegate.Model("breakdown_total_interest", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_checkout_section_payoff_breakdown_accrued_interest_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(payoffBreakdown.f68717c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
            eVarB2.add(new CellDetailsDelegate.Model("breakdown_pending_fees", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_checkout_section_payoff_breakdown_pending_fees_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(payoffBreakdown.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
            dj0.d dVar5 = payoffBreakdown.e;
            if (dVar5 != null) {
                eVarB2.add(new CellDetailsDelegate.Model("breakdown_gmf_tax", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_checkout_section_payoff_breakdown_gmf_tax_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar5, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
            }
            aim.e eVarA = u.a(eVarB2);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            eVarB.addAll(eVarA);
        }
        List listK = v.k(new CellDetailsDelegate.Model("total_to_repay", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_checkout_section_balance_total_to_repay_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, j2.H3, null, 0, null, false, false, null, null, 32632), new RowDelegate.Model("source_pocket", new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_checkout_section_balance_amount_title, u.c(str), null, 12), null, 0, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_checkout_section_balance_amount_subtitle, u.c(new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), z3 ? null : new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), null, 8)), z3 ? null : new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 8), null, null, 0, null, z3, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        wi0.b.Companion.getClass();
        if (Intrinsics.f(bVar, wi0.b.O)) {
            z = false;
            ejVar = new ej("cancellation_disclaimer_co", new c7(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_checkout_section_disclaimer_co, null, null, 14), false, null, 6));
        } else {
            z = false;
            ejVar = null;
        }
        n14.e.b(eVarB, ejVar);
        aim.e eVarA2 = u.a(eVarB);
        if (!z3) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_checkout_button_add_money, null, null, 14);
        }
        return aq4.k.a(textLocalisedClause, eVarA2, true, eVar.f8249c != null ? true : z);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        String str = (String) this.f544b;
        com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.b bVar = (com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.b) this.f545c;
        aqb.e content = (aqb.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean zEquals = str.equals("ALL_ACCOUNTS_LIST_ID");
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.k(R$drawable.uikit_icn_24_vegan, R$attr.uikit_colorWhite, R$attr.uikit_colorAccent), d8l.d.b(zEquals), null, false, null, false, 60);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(oc.c.q(content.f8281b.f280366a), null, null, 14);
        ejb.b bVar2 = content.f8280a;
        ArrayList arrayListJ = ue0.e.J(new RowDelegate.Model("ALL_ACCOUNTS_LIST_ID", image40, textLocalisedClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(bVar2.f126836a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, zEquals, null, null, null, null, null, null, new aqb.k("ALL_ACCOUNTS_LIST_ID", null), null, 0, 0, 0, 0, 532667384), bVar.d(bVar2.f126837b, str, TransferWidgetCustomisationScreenContract$BottomSheetState.SelectAccount.f83390a));
        yp0.b.k(arrayListJ, 0, 0, 0, 0, 31);
        return arrayListJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0ae8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0af3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0af6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0c28  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0c49  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0c53  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0d6e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0d81  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0d85  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0d99  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0dc9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r78, java.lang.Object r79, java.lang.Object r80) {
        /*
            Method dump skipped, instruction units count: 3582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a15.n.r(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj2, Object obj3, Object obj4) {
        auj.q qVar = (auj.q) this.f544b;
        auj.g gVar = (auj.g) this.f545c;
        List pages = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Throwable th10 = (Throwable) obj4;
        Intrinsics.checkNotNullParameter(pages, "pages");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = pages.iterator();
        while (it8.hasNext()) {
            a0.x(((d0j.q) it8.next()).f110426b, arrayList);
        }
        if (arrayList.isEmpty() && th10 == null && !zBooleanValue) {
            return gVar.f9842a == d0j.m.PAST ? u.c(new FullScreenStateDelegate.Model("CHALLENGE_HISTORY_EMPTY_STATE_ITEM_ID", new TextLocalisedClause(com.revolut.retail.feature.api.rewards_hub.R$string.rewards_hub_earned_rewards_empty_title, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_trophy, null, null, 6)), null, zj.REGULAR, false, null, null, null, 1988)) : f0.f322471a;
        }
        aim.e eVarB = u.b();
        int i = 0;
        for (Object obj5 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            ChallengeMediumImageCardDelegate.Model modelA = qVar.f9859a.a((d0j.h) obj5, i);
            int i3 = R$attr.uikit_dp0;
            yp0.b.l(modelA, i3, i3, i3, i3, null, false, 48);
            eVarB.add(modelA);
            i = i2;
        }
        if (th10 != null) {
            eVarB.addAll(u.c(new FullScreenStateDelegate.Model("NEXT_PAGE_ERROR_ITEM_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, null, null, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 32724)));
        }
        if (zBooleanValue) {
            eVarB.addAll(qVar.a(2, arrayList.size()));
        }
        return u.a(eVarB);
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        List listC;
        av8.r rVar = (av8.r) this.f544b;
        av8.j jVar = (av8.j) this.f545c;
        List docSequences = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(docSequences, "docSequences");
        int i = 0;
        koi.j[] elements = {rVar.f9962b.f ? rVar.a(jVar.f9948a) : null, av8.r.b()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        av8.i iVar = jVar.f9950c;
        List list = docSequences;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Object next = it8.next();
            int i3 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            av8.i iVar2 = (av8.i) next;
            boolean zF = Intrinsics.f(iVar2, iVar);
            String strN = a0.d.n("docs_selectable_list_item_", i);
            String strN2 = a0.d.n("docs_cell_details_list_item_", i);
            if (iVar2 instanceof av8.h) {
                listC = u.c(((av8.h) iVar2).f9947a);
            } else {
                if (!(iVar2 instanceof av8.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                listC = ((av8.g) iVar2).f9946a;
            }
            List<my8.l> list2 = listC;
            ArrayList arrayList2 = new ArrayList(w.t(list2, i2));
            for (my8.l lVar : list2) {
                arrayList2.add(new q7(new TextClause(lVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CountryImage(lVar.f210385c.f297794a, (Integer) null, (ez0.e) null, 14)));
                iVar = iVar;
                iVar2 = iVar2;
                it8 = it8;
            }
            av8.i iVar3 = iVar;
            Iterator it9 = it8;
            arrayList.add(new SelectableDelegate.Model(strN, new CellDetailsListDelegate.Model(strN2, null, arrayList2, null, null, null, 2042), zF ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, true, null, iVar2, null, false, 32456));
            iVar = iVar3;
            i = i3;
            it8 = it9;
            i2 = 10;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return i2b.a.o(listL, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x06cd  */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [com.revolut.core.ui_kit_core.displayers.image.models.CdnImage, ip0.yj0] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r69, java.lang.Object r70, java.lang.Object r71) {
        /*
            Method dump skipped, instruction units count: 2320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a15.n.u(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        String str;
        String str2;
        aye.p pVar = (aye.p) this.f544b;
        aye.d dVar = (aye.d) this.f545c;
        yte.e content = (yte.e) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        yte.m mVar = dVar.f11137b;
        TextLocalisedClause textLocalisedClauseA = aye.p.a(mVar);
        TextLocalisedClause textLocalisedClause = textLocalisedClauseA != null ? new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_stored_method_details_subtitle_via_placeholder, u.c(textLocalisedClauseA), null, 12) : null;
        String str3 = content.d;
        TextClause textClause = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        Image imageB = ((di6.a) pVar.f11150a).b(content.f);
        if (imageB == null) {
            TopupMethodType topupMethodType = content.f316709c;
            imageB = topupMethodType != null ? sze.d.b(topupMethodType) : sze.d.a(R$drawable.uikit_icn_24_bank);
        }
        aye.h hVar = new aye.h(textClause, textLocalisedClause, imageB, u.c(new ActionsView.Item("ACTION_VIEW_ITEM_DELETE_LIST_ID", null, false, null, null, new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_stored_method_details_action_delete, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, "ACTION_VIEW_ITEM_DELETE_TAG", null, null, null, 30622)));
        Instant instant = content.e;
        yte.c cVar = content.f316710g;
        CellDetailsDelegate.Model model = instant != null ? new CellDetailsDelegate.Model("LAST_USED_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_stored_method_details_content_last_used_title, null, null, 14), (Image) null, 0, false, 30), new TimeClause(instant.toEpochMilli(), new TimeClause.Format.Pretty(0), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null;
        TextLocalisedClause textLocalisedClauseA2 = aye.p.a(mVar);
        CellDetailsDelegate.Model model2 = textLocalisedClauseA2 != null ? new CellDetailsDelegate.Model("METHOD_TYPE_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_stored_method_details_content_method_type_title, null, null, 14), (Image) null, 0, false, 30), textLocalisedClauseA2, null, null, null, null, 0, null, false, false, null, null, 32760) : null;
        CellDetailsDelegate.Model model3 = (cVar == null || (str2 = cVar.f316705a) == null) ? null : new CellDetailsDelegate.Model("ACCOUNT_NUMBER_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_stored_method_details_content_account_number_title, null, null, 14), (Image) null, 0, false, 30), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        CellDetailsDelegate.Model model4 = (cVar == null || (str = cVar.f316706b) == null) ? null : new CellDetailsDelegate.Model("IFSC_CODE_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_stored_method_details_content_ifsc_code_title, null, null, 14), (Image) null, 0, false, 30), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        String str4 = content.d;
        CellDetailsDelegate.Model[] elements = {model, model2, model3, model4, str4 != null ? new CellDetailsDelegate.Model("BANK_NAME_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_stored_method_details_content_bank_name_title, null, null, 14), (Image) null, 0, false, 30), new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new aye.l(yp0.b.g(kotlin.collections.d.L(elements), new ListSubheaderDelegate.Model("ACCOUNT_DETAIL_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.topup_stored_account_details_first_section_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), hVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0c13  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0c43  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0c46  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0cb7 A[LOOP:6: B:275:0x0cb1->B:277:0x0cb7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0cf6  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0cf9  */
    /* JADX WARN: Type inference failed for: r11v13, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v29, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r20v4, types: [com.revolut.core.ui_kit.models.Style, java.lang.Throwable, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r50, java.lang.Object r51, java.lang.Object r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a15.n.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ n(Object obj2, Object obj3, int i) {
        this.f543a = i;
        this.f544b = obj2;
        this.f545c = obj3;
    }
}
