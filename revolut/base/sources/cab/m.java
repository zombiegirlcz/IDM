package cab;

import android.os.Parcelable;
import aw0.j0;
import aw0.ka;
import aw0.o9;
import aw0.p9;
import aw0.u0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.delegates.mf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFilter;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixQrCode;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsRevPoints;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreenContract$InputData;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumber;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.tracking.v3.InvestNewOrderStartedContext;
import com.revolut.trading.orders.R$plurals;
import ctk.t;
import cul.p2;
import cul.v;
import cvl.r;
import cvl.s;
import d27.b0;
import d27.c0;
import d27.p0;
import d7j.o0;
import grl.b6;
import grl.d6;
import grl.e4;
import ip0.l70;
import ip0.qd0;
import ip0.vd0;
import ip0.z;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.r0;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.f3;
import mx0.h3;
import nel.x;
import tof.a3;
import whf.j;
import whf.p;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22596c;

    public /* synthetic */ m(Object obj2, Object obj3, int i) {
        this.f22594a = i;
        this.f22595b = obj2;
        this.f22596c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.m.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        ctk.l lVar = (ctk.l) this.f22595b;
        t tVar = (t) this.f22596c;
        List instruments = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        if (instruments.isEmpty()) {
            return f0.f322471a;
        }
        List<vel.f> listV0 = d0.V0(instruments, 9);
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        for (vel.f fVar : listV0) {
            arrayList.add(j1h.b.b(tVar.f108701a, fVar, new ctk.i(fVar.b().f288357a), null, null, 12));
        }
        return yp0.b.g(u.c(new eg("similar-to-instruments", arrayList, null, BitmapDescriptorFactory.HUE_RED, 0, 0, 1020)), new ListSubheaderDelegate.Model("similar-to-instrument-header", (Image) null, (Clause) new TextLocalisedClause(R$string.instrument_similar_instruments_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R$string.wealth_view_all, null, null, 14), true, (Object) new ctk.j(lVar.f108690a), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898), null, 0, 0, 126);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x068c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x07d9  */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v16, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r68, java.lang.Object r69, java.lang.Object r70) {
        /*
            Method dump skipped, instruction units count: 2346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.m.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        p2 p2Var = (p2) this.f22595b;
        v vVar = (v) this.f22596c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        nel.n nVar = (nel.n) pair.f186385a;
        InstrumentTicker instrumentTicker = (InstrumentTicker) pair.f186386b;
        dsl.a aVar = p2Var.f109156g;
        String ticker = nVar.e;
        nel.t exchange = nVar.k;
        bfl.g orderSide = vVar.f109175a;
        r0 orderType = vVar.f109176b;
        boolean zA = x.a(instrumentTicker);
        Intrinsics.checkNotNullParameter(instrumentTicker, "<this>");
        boolean zContains = x.f214635a.contains(instrumentTicker.v);
        ((dsl.b) aVar).getClass();
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        InvestNewOrderStartedContext.a aVarNewBuilder = InvestNewOrderStartedContext.newBuilder();
        aVarNewBuilder.c();
        ((InvestNewOrderStartedContext) aVarNewBuilder.f49761b).setTicker(ticker);
        String strA = exchange.a();
        aVarNewBuilder.c();
        ((InvestNewOrderStartedContext) aVarNewBuilder.f49761b).setExchange(strA);
        e4 e4Var = zA ? e4.OPEN : zContains ? e4.EXTENDED_HOURS : e4.CLOSE;
        aVarNewBuilder.c();
        ((InvestNewOrderStartedContext) aVarNewBuilder.f49761b).setExchangeStatus(e4Var);
        b6 b6VarO = v04.b.O(orderSide);
        aVarNewBuilder.c();
        ((InvestNewOrderStartedContext) aVarNewBuilder.f49761b).setOrderSide(b6VarO);
        d6 d6VarP = v04.b.P(orderType);
        aVarNewBuilder.c();
        ((InvestNewOrderStartedContext) aVarNewBuilder.f49761b).setOrderType(d6VarP);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        cv5.a aVar = (cv5.a) this.f22595b;
        Data data = (Data) this.f22596c;
        List transactions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("SUSPICIOUS_DEPOSITS_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.crypto_investments.api.R$string.crypto_investments_action_required_text, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        p pVar = (p) data.getContent();
        q qVarA = pVar != null ? pVar.f297647b : null;
        thf.g gVar = aVar.f109282b;
        if (qVarA == null) {
            q.Companion.getClass();
            qVarA = k71.p.a();
        }
        ArrayList<RowDelegate.Model> arrayListQ = ((anf.k) gVar).q(transactions, qVarA, new thf.f(false, 3));
        ArrayList arrayList = new ArrayList(w.t(arrayListQ, 10));
        for (RowDelegate.Model modelX : arrayListQ) {
            Object obj5 = modelX.u;
            if (obj5 instanceof a3) {
                modelX = RowDelegate.Model.x(modelX, null, null, null, null, null, 0, null, false, null, new pt5.k((a3) obj5), 0, 0, 0, 0, null, -4194305, 15);
            }
            arrayList.add(modelX);
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return i2b.a.q(model, arrayList);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        Set set;
        cv6.q qVar = (cv6.q) this.f22595b;
        cv6.j jVar = (cv6.j) this.f22596c;
        Set allCurrencies = (Set) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(allCurrencies, "allCurrencies");
        AcquiringPaymentFilter acquiringPaymentFilter = jVar.f109287b;
        boolean z = jVar.f109288c;
        t17.g gVar = qVar.f109299c;
        if (acquiringPaymentFilter == null || (set = acquiringPaymentFilter.f73367a) == null) {
            set = h0.f322473a;
        }
        aim.e eVarB = u.b();
        eVarB.add(gVar.a(allCurrencies.size(), set.size(), "ITEM_ID_CURRENCY_HEADER"));
        a0.x(gVar.b(z, set, allCurrencies, "ITEM_ID_SEE_ALL_CURRENCIES"), eVarB);
        return u.a(eVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    private final Object h(Object obj2, Object obj3, Object obj4) {
        boolean z;
        boolean z3;
        cvl.q qVar;
        Map map;
        qv0.i iVar;
        boolean z4;
        cvl.v vVar;
        boolean z6;
        boolean z11;
        aim.e eVar;
        Clause clause;
        MoneyClause moneyClause;
        MoneyClause moneyClauseB;
        Clause clauseG;
        Clause textLocalisedQuantityClause;
        Map map2;
        cvl.l lVar = (cvl.l) this.f22595b;
        cvl.v vVar2 = (cvl.v) this.f22596c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Set set = (Set) pair.f186385a;
        List list = (List) pair.f186386b;
        aim.e eVarB = u.b();
        cvl.q qVar2 = null;
        if (lVar.f109495l) {
            xi0.b bVar = lVar.f109489a;
            boolean z12 = lVar.f109496m;
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("list_id_currency_section_title", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_trading_pocket_picker_section_currency_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 57338);
            Set<xi0.b> set2 = set;
            ArrayList arrayList = new ArrayList(w.t(set2, 10));
            for (xi0.b bVar2 : set2) {
                String strQ = j6.a.q("list_id_currency_section_item_", bVar2.f306286a);
                CurrencyClause currencyClause = new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, null, 4);
                CurrencyImage currencyImage = new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
                mx0.d dVar = bVar2.equals(bVar) ? mx0.d.ACCENT : mx0.d.SEMIBLACK;
                List listK = zhm.v.k(new TextLocalisedClause(R$string.wealth_trading_pocket_picker_section_currency_title, null, null, 14), new TextClause(bVar2.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                m70.a.t(t0.f186434a);
                arrayList.add(new ActionsView.Item(strQ, dVar, false, null, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), currencyClause, currencyImage, null, null, null, false, null, null, bVar2, null, 23436));
            }
            z = false;
            z3 = true;
            List listP = i2b.a.p(arrayList, z12 ? new ActionsView.Item("list_id_currency_section_item_other", mx0.d.SEMIBLACK, false, null, null, new TextLocalisedClause(R$string.wealth_trading_pocket_picker_section_currency_item_more, null, null, 14), null, null, null, null, false, null, null, null, null, 32668) : null);
            mx0.l lVar2 = mx0.l.SCROLLABLE;
            int i = R$attr.uikit_dp8;
            eVarB.addAll(zhm.v.k(model, new z("list_id_currency_section_items", listP, null, lVar2, i, i, 68)));
        } else {
            z = false;
            z3 = true;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            xdf.i iVar2 = (xdf.i) it8.next();
            aim.e eVarB2 = u.b();
            List list2 = iVar2.f304438b;
            List list3 = list2;
            Iterator it9 = list3.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    qVar = qVar2;
                    break;
                }
                xdf.h hVar = (xdf.h) it9.next();
                Data data = lVar.f109493h;
                qVar = (data == null || (map2 = (Map) data.getContent()) == null) ? qVar2 : (cvl.q) map2.get(new r(hVar.f304435b));
                if (qVar != null) {
                    break;
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it10 = list3.iterator();
            while (it10.hasNext()) {
                xdf.h hVar2 = (xdf.h) it10.next();
                List list4 = hVar2.f304436c;
                TextLocalisedClause textLocalisedClause = hVar2.f304434a;
                List list5 = list4;
                Iterator it11 = it8;
                ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                Iterator it12 = list5.iterator();
                while (it12.hasNext()) {
                    SourcePocket sourcePocket = (SourcePocket) it12.next();
                    evl.c cVar = vVar2.f109505a;
                    Iterator it13 = it12;
                    SourcePocket sourcePocket2 = lVar.f109491c;
                    String f91780a = sourcePocket2 != null ? sourcePocket2.getF91780a() : null;
                    List list6 = list2;
                    Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
                    Iterator it14 = it10;
                    boolean zF = Intrinsics.f(sourcePocket.getF91780a(), f91780a);
                    String strQ2 = j6.a.q("list_id_pocket_item_", sourcePocket.getF91780a());
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(cVar.c(sourcePocket), zF ? new WhiteCircleBadge(dw0.a.Checked) : null, null, false, null, false, 60);
                    Clause clauseE = cVar.e(sourcePocket, null);
                    Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
                    boolean z29 = sourcePocket instanceof SourcePocket.Holding;
                    if (z29 || (sourcePocket instanceof SourcePocket.Pocket) || (sourcePocket instanceof SourcePocket.VaultWrapper)) {
                        z4 = z3;
                        vVar = vVar2;
                        z6 = z29;
                        z11 = z;
                        eVar = eVarB;
                        clause = null;
                    } else if (sourcePocket instanceof SourcePocket.InvestAccountCombinedBuyingPower) {
                        CombinedBuyingPowerConverted combinedBuyingPowerConverted = ((SourcePocket.InvestAccountCombinedBuyingPower) sourcePocket).f91782c;
                        if (combinedBuyingPowerConverted.f95658a != null) {
                            vVar = vVar2;
                            z6 = z29;
                            textLocalisedQuantityClause = new TextLocalisedClause(R$string.trading_cash_balance_margin_borrowingLimitItem_title, null, null, 14);
                        } else {
                            vVar = vVar2;
                            z6 = z29;
                            textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.wealth_trading_pocket_picker_group_combined_buying_power_subtitle, Integer.valueOf(combinedBuyingPowerConverted.f95659b.size()), (List) null, (Style) null, 28);
                        }
                        z4 = z3;
                        clause = textLocalisedQuantityClause;
                        z11 = z;
                        eVar = eVarB;
                    } else {
                        vVar = vVar2;
                        z6 = z29;
                        if (!(sourcePocket instanceof SourcePocket.Savings)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SavingsProductData savingsProductData = ((SourcePocket.Savings) sourcePocket).f91788a.f86462c;
                        if (savingsProductData != null) {
                            dcd.b bVar3 = cVar.f129978a;
                            SavingsProductData savingsProductData2 = new SavingsProductData(savingsProductData.f86683a, savingsProductData.f86684b);
                            z11 = z;
                            z4 = z3;
                            eVar = eVarB;
                            clauseG = bVar3.g(savingsProductData2, z11, null, z4);
                        } else {
                            z11 = z;
                            z4 = z3;
                            eVar = eVarB;
                            clauseG = null;
                        }
                        clause = clauseG;
                    }
                    Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
                    SourcePocket.Balance e = sourcePocket.getE();
                    if (e == null) {
                        moneyClause = null;
                    } else {
                        if (!(e instanceof SourcePocket.Balance.MoneyBalance)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        moneyClause = new MoneyClause(((SourcePocket.Balance.MoneyBalance) e).f91775a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                    }
                    Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
                    if (z6 || (sourcePocket instanceof SourcePocket.Pocket) || (sourcePocket instanceof SourcePocket.Savings) || (sourcePocket instanceof SourcePocket.VaultWrapper)) {
                        moneyClauseB = evl.c.b(sourcePocket);
                    } else {
                        if (!(sourcePocket instanceof SourcePocket.InvestAccountCombinedBuyingPower)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CombinedBuyingPowerConverted.MarginBorrowingLimit marginBorrowingLimit = ((SourcePocket.InvestAccountCombinedBuyingPower) sourcePocket).f91782c.f95658a;
                        moneyClauseB = marginBorrowingLimit != null ? new MoneyClause(marginBorrowingLimit.getF95665a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : evl.c.b(sourcePocket);
                    }
                    arrayList4.add(new RowDelegate.Model(strQ2, image40, clauseE, null, 0, clause, null, null, 0, new RowDelegate.Model.c.b(moneyClause, moneyClauseB, null, false, 124), false, null, zF, null, null, null, null, null, null, new cvl.m(sourcePocket), null, 0, 0, 0, 0, 532667352));
                    eVarB = eVar;
                    z = z11;
                    z3 = z4;
                    it12 = it13;
                    list2 = list6;
                    it10 = it14;
                    vVar2 = vVar;
                }
                boolean z31 = z3;
                cvl.v vVar3 = vVar2;
                List list7 = list2;
                Iterator it15 = it10;
                boolean z41 = z;
                aim.e eVar2 = eVarB;
                aim.e eVarB3 = u.b();
                if (!arrayList4.isEmpty()) {
                    aw0.t0 t0Var = new aw0.t0((Clause) textLocalisedClause, (Image) null, 0, false, 30);
                    m70.a.c(t0.f186434a);
                    eVarB3.add(new CellDetailsDelegate.Model("list_id_group_header_item_" + textLocalisedClause, t0Var, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, u0.SMALL, 0, null, false, false, null, null, 32504));
                    Data data2 = lVar.f109492g;
                    if (data2 != null && (map = (Map) data2.getContent()) != null && (iVar = (qv0.i) map.get(new cvl.k(hVar2.f304435b))) != null) {
                        iVar.g(R$attr.uikit_dp2);
                        iVar.o(R$attr.uikit_dp2);
                        eVarB3.add(iVar);
                    }
                    eVarB3.addAll(arrayList4);
                }
                aim.e eVarA = u.a(eVarB3);
                if (eVarA.isEmpty()) {
                    eVarA = null;
                }
                if (eVarA != null) {
                    arrayList3.add(eVarA);
                }
                eVarB = eVar2;
                it8 = it11;
                z = z41;
                z3 = z31;
                list2 = list7;
                it10 = it15;
                vVar2 = vVar3;
            }
            boolean z49 = z3;
            cvl.v vVar4 = vVar2;
            Iterator it16 = it8;
            List list8 = list2;
            boolean z54 = z;
            aim.e eVar3 = eVarB;
            ArrayList arrayList5 = new ArrayList();
            ?? r72 = z54;
            for (Object obj5 : arrayList3) {
                int i2 = r72 + 1;
                if (r72 < 0) {
                    zhm.v.s();
                    throw null;
                }
                List list9 = (List) obj5;
                yp0.b.k(list9, R$attr.uikit_dp0, r72 == zhm.v.j(list8) ? z49 : z54 ? R$attr.uikit_dp16 : R$attr.uikit_dp8, 0, 0, 28);
                a0.x(list9, arrayList5);
                r72 = i2;
            }
            if (!arrayList5.isEmpty()) {
                ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("list_id_section_header_item_" + iVar2.f304437a, (Image) null, iVar2.f304437a, qVar != null ? new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral_10), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, qVar != null ? z49 : z54, false, (Clause) null, false, (Object) (qVar != null ? new cvl.n(qVar) : null), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 260066);
                yp0.b.a(model2);
                eVarB2.add(model2);
            }
            eVarB2.addAll(arrayList5);
            a0.x(u.a(eVarB2), arrayList2);
            eVarB = eVar3;
            it8 = it16;
            z = z54;
            z3 = z49;
            vVar2 = vVar4;
            qVar2 = null;
        }
        cvl.v vVar5 = vVar2;
        aim.e eVar4 = eVarB;
        eVar4.addAll(arrayList2);
        Data data3 = lVar.i;
        List listB = data3 != null ? ((aah.m) vVar5.f109506b).b(data3) : null;
        if (listB == null) {
            listB = f0.f322471a;
        }
        eVar4.addAll(listB);
        return new cvl.t(u.a(eVar4), lVar.f109495l ? new s(new TextLocalisedClause(R.string.button_action_done, null, null, 14)) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x03f0  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 1622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.m.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        String strE;
        String string;
        String str;
        d27.s sVar;
        InputTextDelegate.Model model;
        InputTextDelegate.Model model2;
        LocalDate localDate;
        p0 p0Var = (p0) this.f22595b;
        d27.u uVar = (d27.u) this.f22596c;
        xi0.b currency = (xi0.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        b0 b0VarD = p0.d(true);
        aim.e eVarB = u.b();
        d27.o oVar = uVar.f110774c;
        d27.q qVar = uVar.e;
        d27.t tVar = uVar.f110777j;
        d27.s sVar2 = uVar.f110776h;
        if (oVar.f110760a == lr6.c.PENDING && !oVar.f110761b) {
            eVarB.add(p0Var.f110763b.a());
        }
        InputTextDelegate.Model model3 = new InputTextDelegate.Model("LIST_ID_ITEM_TITLE_INPUT", new TextClause(uVar.k, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_setup_input_description_title, null, null, 14), null, null, null, null, false, null, false, false, 0, false, 1, false, sVar2 == d27.s.TITLE, false, null, false, false, 0, false, false, null, -167772168, 131071);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model3);
        aim.e eVarB2 = u.b();
        eVarB2.add(new ListSubheaderDelegate.Model("LIST_ID_ITEM_AMOUNT_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_payment_links_details_sections_totals_amount_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        dj0.d dVar = new dj0.d(uVar.f110773b.f110757b, currency);
        boolean z = uVar.f;
        boolean z3 = !z;
        TextClause textClause = new TextClause(currency.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        nx0.e eVar = nx0.e.AMOUNT;
        if (z) {
            m70.a.c(t0.f186434a);
            strE = "";
        } else {
            strE = p0Var.f110762a.e(dVar);
        }
        if (z) {
            m70.a.c(t0.f186434a);
            string = "";
        } else {
            string = u80.o.b(new u80.g(dVar, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
        }
        if (z) {
            m70.a.c(t0.f186434a);
            str = "";
        } else {
            str = "0";
        }
        AmountEditDelegate.Model model4 = new AmountEditDelegate.Model("LIST_ID_ITEM_AMOUNT", textClause, new bw0.h(strE, string, true, null, Boolean.valueOf(sVar2 == d27.s.AMOUNT), null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z3, 12244), eVar, null, null, null, false, currency, null, 1680);
        yp0.b.r(model4, 0, 0, 0, 0, 15);
        eVarB2.add(model4);
        eVarB2.add(new RowDelegate.Model("LIST_ID_ITEM_CUSTOMER_SETS_PRICE", null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_setup_input_customer_amount_title, null, null, 14), null, 0, null, null, null, 0, new vf(z, true), false, null, false, null, null, p0.a(), null, null, null, null, null, 0, 0, 0, 0, 536804346));
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        aim.e eVarB3 = u.b();
        eVarB3.add(new ListSubheaderDelegate.Model("LIST_ID_ADVANCED_OPTIONS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_payment_link_setup_sections_options_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        aim.e eVarB4 = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_payment_link_setup_sections_options_payments, null, null, 14);
        mf mfVarA = p0.a();
        d27.r rVar = uVar.f110775g;
        RowDelegate.Model model5 = new RowDelegate.Model("LIST_ID_ITEM_LIMIT_SALES_NUMBER", null, textLocalisedClause, null, 0, null, null, null, 0, new vf(tVar.f110769a, true), false, null, false, null, null, mfVarA, null, null, null, null, null, 0, 0, 0, 0, 536804346);
        if (tVar.f110769a) {
            Integer num = tVar.f110770b;
            String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
            sVar = sVar2;
            model = new InputTextDelegate.Model("LIST_ID_ITEM_LIMIT_SALES_NUMBER_INPUT", new TextClause(strValueOf == null ? "" : strValueOf, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextClause("0", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), !tVar.a() ? new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_setup_input_limit_error_message, zhm.v.k("1", "500"), null, 12) : null, null, null, false, null, !tVar.a(), false, 2, false, 1, false, sVar == d27.s.REUSABLE_COUNT, false, ehe.n.w(3), false, false, 0, false, false, null, 1977483124, 131071);
        } else {
            sVar = sVar2;
            model = null;
        }
        Object[] elements = {model5, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        a0.x(kotlin.collections.d.L(elements), eVarB4);
        Object[] elements2 = {new RowDelegate.Model("LIST_ID_ITEM_EXPIRY_DATE", null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_payment_link_setup_sections_options_date, null, null, 14), null, 0, null, null, null, 0, new vf(rVar.f110768b, true), false, null, false, null, null, p0.a(), null, null, null, null, null, 0, 0, 0, 0, 536804346), (!rVar.f110768b || (localDate = rVar.f110767a) == null) ? null : new InputTextDelegate.Model("LIST_ID_ITEM_EXPIRY_DATE_INPUT", new TimeClause(oc.c.F(localDate), TimeClause.Format.DateLong.f57962b, null, null, 12), null, null, null, new ResourceImage(R$drawable.uikit_icn_24_calendar_date, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, false, null, false, false, 0, false, 1, false, false, false, null, false, false, 0, false, false, null, -100667396, 131071)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        a0.x(kotlin.collections.d.L(elements2), eVarB4);
        aim.e eVarA2 = u.a(eVarB4);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        a0.x(eVarA2, eVarB3);
        eVarB.addAll(u.a(eVarB3));
        RowDelegate.Model model6 = new RowDelegate.Model("LIST_ID_ITEM_CUSTOM_FIELD", null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_custom_field_header_title, null, null, 14), null, 0, null, null, null, 0, new vf(qVar.f110766b, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
        if (qVar.f110766b) {
            model2 = new InputTextDelegate.Model("LIST_ID_ITEM_CUSTOM_FIELD_INPUT", new TextClause(qVar.f110765a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_template_setup_custom_fields_field_name, null, null, 14), null, null, null, false, null, false, false, 0, false, 1, false, sVar == d27.s.CUSTOM_FIELD, false, ehe.n.w(500), false, false, 0, false, false, null, 1979711476, 131071);
        } else {
            model2 = null;
        }
        Object[] elements3 = {model6, model2};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        List listL = kotlin.collections.d.L(elements3);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        List listV = zjh.j.v(p0Var.f110764c, uVar.i);
        int i = R$attr.uikit_dp16;
        yp0.b.q(listV, i, i, 0, 0, 12);
        eVarB.addAll(listV);
        return new c0(p0.b(uVar), u.a(eVarB), b0VarD);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        d32.b bVar = (d32.b) this.f22595b;
        z22.a aVar = (z22.a) this.f22596c;
        a32.n content = (a32.n) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ApmQuote apmQuote = content.f1031a;
        if (apmQuote == null) {
            return f0.f322471a;
        }
        List listA = bVar.f110900b.a(apmQuote, aVar.getF72729b(), !Intrinsics.f(apmQuote.f62211c.f115083b, r9.f115083b));
        int i = R$attr.uikit_dp16;
        yp0.b.k(listA, i, i, 0, 0, 28);
        return listA;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r24, java.lang.Object r25, java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.m.l(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        h3 h3Var;
        d4b.k kVar = (d4b.k) this.f22595b;
        a4b.r rVar = (a4b.r) this.f22596c;
        dj0.d content = (dj0.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        CurrencyImage currencyImage = new CurrencyImage(kVar.f111266a.f12237b.i.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_cfd_order_form_cfd_account, null, null, 14);
        MoneyClause moneyClause = new MoneyClause(content, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        if (Intrinsics.f(rVar, a4b.k.f1244a)) {
            h3Var = h3.ERROR;
        } else {
            if (!(rVar instanceof a4b.l) && !(rVar instanceof a4b.n) && !(rVar instanceof a4b.m) && !Intrinsics.f(rVar, a4b.o.f1248a) && !Intrinsics.f(rVar, a4b.p.f1249a) && !Intrinsics.f(rVar, a4b.q.f1250a)) {
                throw new NoWhenBranchMatchedException();
            }
            h3Var = h3.ACTIVE_NOT_CLICKABLE;
        }
        return new f3(currencyImage, textLocalisedClause, moneyClause, false, h3Var, false);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        d8d.c cVar = (d8d.c) this.f22595b;
        b8d.m mVar = (b8d.m) this.f22596c;
        aj0.c faq = (aj0.c) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(faq, "faq");
        Data data = mVar.e;
        return (List) iii.c.f(mVar.f13178c, new d7j.p0(cVar, 24), new o0(8), new d8d.a(cVar, faq, mVar.f, data, 0));
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        dj0.d dVar;
        Clause textLocalisedClause;
        dca.t tVar = (dca.t) this.f22595b;
        dca.i iVar = (dca.i) this.f22596c;
        PixQrCode pixQrCode = (PixQrCode) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pixQrCode, "pixQrCode");
        int[][] iArr = pixQrCode.f80418a;
        if (iArr == null) {
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Unable to render pix qr code - matrix is null for content ", pixQrCode.f80419b));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return dca.t.a();
        }
        dca.g gVar = (dca.g) iVar;
        dj0.d dVar2 = gVar.f112829c;
        String str = gVar.d;
        PixKey pixKey = gVar.f112828b;
        List listC = u.c(new l70("QR_CODE_ID", new QrCodeImage(iArr, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(1000), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28), false, 0, 124));
        int i = R$attr.uikit_dp32;
        yp0.b.k(listC, 0, 0, i, i, 19);
        mx0.l lVar = mx0.l.DYNAMIC_CIRCLE_ACTIONS;
        mx0.d dVar3 = mx0.d.BLACK;
        ActionsView.Item[] elements = {new ActionsView.Item("COPY_KEY_BUTTON_ID", dVar3, false, null, null, new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_area_copy_key, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, pixQrCode, null, 24476), new ActionsView.Item("SHARE_QR_BUTTON_ID", dVar3, false, null, null, new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_share, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, pixQrCode, null, 24476), (dVar2 == null && str == null) ? null : new ActionsView.Item("RESET_QR_BUTTON_ID", dVar3, false, null, null, new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_reset, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_repeat, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listC2 = u.c(new z("PIX_ACTIONS_ID", kotlin.collections.d.L(elements), null, lVar, 0, 0, 116));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_amount_label, null, null, 14);
        if (dVar2 != null) {
            textLocalisedClause = new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            dVar = dVar2;
        } else {
            dVar = dVar2;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_amount_defaultValue, null, null, 14);
        }
        CellDetailsActionDelegate.Model model = new CellDetailsActionDelegate.Model("ADD_AMOUNT_KEY_ID", textLocalisedClause2, 0, new ResourceImage((dVar == null || !(dVar.k() ^ true)) ? R$drawable.uikit_icn_16_plus : R$drawable.uikit_icn_24_pen, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), textLocalisedClause, false, false, null, null, 0, 0, 32736);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_description_label, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = (str == null || str.length() == 0) ? new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_amount_defaultValue, null, null, 14) : new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_description_edit, null, null, 14);
        Object[] elements2 = {model, new CellDetailsNoteDelegate.Model("ADD_DESCRIPTION_KEY_ID", textLocalisedClause3, null, (str == null || str.length() == 0) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, new ResourceImage((str == null || str.length() == 0) ? R$drawable.uikit_icn_16_plus : R$drawable.uikit_icn_24_pen, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), textLocalisedClause4, null, null, null, 0, 130676)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL = kotlin.collections.d.L(elements2);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        List listC3 = u.c(new CellDetailsActionDelegate.Model("CHANGE_PIX_KEY_ID", new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_pix_key_used_label, null, null, 14), 0, new ResourceImage(c6d.b.j(pixKey), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(((vca.f) tVar.f112847a).a(pixKey), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false, null, null, 0, 0, 32736));
        yp0.b.k(listC3, 0, 0, 0, 0, 31);
        return d0.E0(listC3, d0.E0(listL, d0.E0(listC2, listC)));
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        de9.h hVar = (de9.h) this.f22595b;
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) this.f22596c;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter((oe9.e) obj2, "<unused var>");
        return zBooleanValue ? new de9.q(new de9.p(Integer.valueOf(hVar.f113322a.length())), null, hVar.e, 2) : new de9.q(null, textLocalisedClause, hVar.e, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0535  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r45, java.lang.Object r46, java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 2324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.m.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        String str;
        ac4.g gVar = (ac4.g) this.f22595b;
        dfg.e eVar = (dfg.e) this.f22596c;
        rei.g booking = (rei.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(booking, "booking");
        kag.a aVar = (kag.a) gVar.f3032c;
        List listC = aVar.c(booking.d.f253631a.f253637a, eVar.f113894c.contains("FIRST_NAME_ITEM_ID"));
        rei.q qVar = booking.d;
        String str2 = qVar.f253631a.f253638b;
        Set set = eVar.f113894c;
        List listD = aVar.d(str2, set.contains("LAST_NAME_ITEM_ID"));
        List listE = aVar.e(qVar.f253633c, set.contains("PHONE_ITEM_ID"));
        List listB = aVar.b(qVar.f253632b, set.contains("EMAIL_ITEM_ID"));
        rei.k kVar = (rei.k) d0.d0(booking.i);
        if (kVar == null || (str = kVar.k) == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        return new dfg.h(w.u(zhm.v.k(listC, listD, listE, listB, kag.a.a(str))), new dfg.f(new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_common_action_done, null, null, 14), Intrinsics.f(eVar.d, Boolean.TRUE)));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.m.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        double d;
        int i;
        List list;
        djc.j jVar;
        TextLocalisedClause textLocalisedClause;
        ActionsView.Item item;
        djc.i iVar = (djc.i) this.f22595b;
        djc.c0 c0Var = (djc.c0) this.f22596c;
        vf0.h hVar = (vf0.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(hVar, "<destruct>");
        List recurringPayments = (List) hVar.f288433a;
        RentAndBillsLinkedPayments linkedPayments = (RentAndBillsLinkedPayments) hVar.f288434b;
        RentAndBillsRevPoints rentAndBillsRevPoints = (RentAndBillsRevPoints) hVar.f288435c;
        List list2 = (List) hVar.d;
        egc.a categoryType = iVar.f115299a;
        rentAndBillsRevPoints.getClass();
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        int i2 = egc.b.f125627a[categoryType.ordinal()];
        if (i2 == 1) {
            d = rentAndBillsRevPoints.f84800b;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d = rentAndBillsRevPoints.f84801c;
        }
        gjc.d dVar = c0Var.f115297a;
        LocalDate localDate = iVar.f;
        Intrinsics.checkNotNullParameter(linkedPayments, "linkedPayments");
        RentAndBillsManageLinkedPaymentsScreenContract$InputData rentAndBillsManageLinkedPaymentsScreenContract$InputData = dVar.f144250a;
        egc.a aVar = rentAndBillsManageLinkedPaymentsScreenContract$InputData.f84980a;
        List listC = bkc.c.c(linkedPayments, aVar);
        if (listC.isEmpty()) {
            i = 0;
        } else {
            Iterator it8 = listC.iterator();
            int i3 = 0;
            while (it8.hasNext()) {
                if (((RentAndBillsLinkedPayments.Category.LinkedPayment) it8.next()).f84793c == com.revolut.feature.rewards.api.model.rent_and_bills.a.LINKED && (i3 = i3 + 1) < 0) {
                    zhm.v.r();
                    throw null;
                }
            }
            i = i3;
        }
        double d5 = d;
        ImageClauseTint.TextColor imageTint = ImageClauseTint.TextColor.f57790a;
        if (i > 0) {
            RentAndBillsConfigurations.Configuration configuration = rentAndBillsManageLinkedPaymentsScreenContract$InputData.f84981b;
            if (aVar != egc.a.BILLS || i >= configuration.f84781c) {
                list = list2;
                item = null;
            } else {
                list = list2;
                item = new ActionsView.Item("ADD_PAYMENT_ACTION_ID", mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_success_bills_secondary_button_text, null, null, 14), null, null, null, null, false, null, null, null, null, 32668);
            }
            aw0.k kVar = new aw0.k(6, new TextLocalisedClause(mra.d.E(aVar, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_rent_title, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_bills_title), null, null, 14), null, false);
            Intrinsics.checkNotNullParameter(imageTint, "imageTint");
            RevPoints revPointsA = qvb.a.a(d5);
            o9 sensitivity = o9.SENSITIVE;
            nub.b format = new nub.b(0);
            nub.c cVar = nub.a.f219272a;
            Intrinsics.checkNotNullParameter(revPointsA, "<this>");
            Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
            Intrinsics.checkNotNullParameter(format, "format");
            jVar = new djc.j(kVar, nub.a.c(revPointsA.b(), sensitivity, true, format, null, 40.0f, imageTint), localDate != null ? new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_description, u.c(new TimeClause(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8) : new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_description_no_next_payment_date, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), zhm.v.l(item));
        } else {
            list = list2;
            ActionsView.Item item2 = new ActionsView.Item("ADD_PAYMENT_ACTION_ID", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(mra.d.E(aVar, com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_details_rent_footer_button_text, com.revolut.feature.rewards.impl.R$string.rent_and_bills_link_payment_details_bills_footer_button_text), null, null, 14), null, null, null, null, false, null, null, null, null, 32668);
            aw0.k kVar2 = new aw0.k(6, new TextLocalisedClause(mra.d.E(aVar, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_rent_title, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_bills_title), null, null, 14), null, false);
            Intrinsics.checkNotNullParameter(imageTint, "imageTint");
            RevPoints revPointsA2 = qvb.a.a(0.0d);
            o9 sensitivity2 = o9.SENSITIVE;
            nub.b format2 = new nub.b(0);
            nub.c cVar2 = nub.a.f219272a;
            Intrinsics.checkNotNullParameter(revPointsA2, "<this>");
            Intrinsics.checkNotNullParameter(sensitivity2, "sensitivity");
            Intrinsics.checkNotNullParameter(format2, "format");
            jVar = new djc.j(kVar2, nub.a.c(revPointsA2.b(), sensitivity2, true, format2, null, 40.0f, imageTint), null, u.c(item2));
        }
        twg.c cVar3 = c0Var.f115298b;
        qv0.i iVar2 = iVar.e;
        boolean z = iVar.f115303h;
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(linkedPayments, "linkedPayments");
        List helpItemsData = list;
        Intrinsics.checkNotNullParameter(helpItemsData, "helpItemsData");
        gjc.i iVar3 = (gjc.i) cVar3.f275018b;
        egc.a aVar2 = ((RentAndBillsManageLinkedPaymentsScreenContract$InputData) cVar3.f275017a).f84980a;
        ArrayList linkedPaymentsForCategory = bkc.c.b(linkedPayments, aVar2);
        Intrinsics.checkNotNullParameter(linkedPaymentsForCategory, "linkedPaymentsForCategory");
        RentAndBillsManageLinkedPaymentsScreenContract$InputData rentAndBillsManageLinkedPaymentsScreenContract$InputData2 = iVar3.f144254a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_status_title, null, null, 14);
        if (linkedPaymentsForCategory.isEmpty()) {
            textLocalisedClause = new TextLocalisedClause(mra.d.E(rentAndBillsManageLinkedPaymentsScreenContract$InputData2.f84980a, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_status_text_rent_inactive, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_status_text_bills_inactive), null, null, 14);
        } else {
            egc.a aVar3 = rentAndBillsManageLinkedPaymentsScreenContract$InputData2.f84980a;
            Iterator it9 = linkedPaymentsForCategory.iterator();
            double d6 = 0.0d;
            while (it9.hasNext()) {
                d6 += ((RentAndBillsLinkedPayments.Category.LinkedPayment) it9.next()).d;
            }
            double d10 = rentAndBillsManageLinkedPaymentsScreenContract$InputData2.f84981b.f84779a;
            if (d6 <= d10) {
                d10 = d6;
            }
            int i5 = gjc.h.f144253a[aVar3.ordinal()];
            if (i5 == 1) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_status_text_rent_active, u.c(bkc.d.a(d10, p9.ONLY_NEGATIVE)), null, 12);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_status_text_bills_active2, u.c(bkc.d.a(d10, p9.ONLY_NEGATIVE)), null, 12);
            }
        }
        CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model("PAYMENT_STATUS_CELL_DETAILS_ID", textLocalisedClause2, null, textLocalisedClause, null, false, null, null, null, null, null, 0, 131060);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listC2 = u.c(model);
        gjc.b bVar = (gjc.b) cVar3.d;
        List listC3 = bkc.c.c(linkedPayments, aVar2);
        RentAndBillsManageLinkedPaymentsScreenContract$InputData rentAndBillsManageLinkedPaymentsScreenContract$InputData3 = bVar.f144249a;
        ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("payments", listC3);
        for (Object obj5 : listC3) {
            List list3 = listC2;
            if (((RentAndBillsLinkedPayments.Category.LinkedPayment) obj5).f84793c == com.revolut.feature.rewards.api.model.rent_and_bills.a.LINKED) {
                arrayListY.add(obj5);
            }
            listC2 = list3;
        }
        List list4 = listC2;
        double d15 = 0.0d;
        for (Iterator it10 = arrayListY.iterator(); it10.hasNext(); it10 = it10) {
            d15 += ((RentAndBillsLinkedPayments.Category.LinkedPayment) it10.next()).d;
            z = z;
        }
        boolean z3 = z;
        double d41 = 0.0d;
        for (Iterator it11 = arrayListY.iterator(); it11.hasNext(); it11 = it11) {
            d41 += ((RentAndBillsLinkedPayments.Category.LinkedPayment) it11.next()).d;
        }
        RentAndBillsConfigurations.Configuration configuration2 = rentAndBillsManageLinkedPaymentsScreenContract$InputData3.f84981b;
        egc.a aVar4 = rentAndBillsManageLinkedPaymentsScreenContract$InputData3.f84980a;
        double d51 = configuration2.f84780b.f115082a;
        double d68 = configuration2.f84779a * d51;
        djc.j jVar2 = jVar;
        aw0.t0 t0Var = new aw0.t0((Clause) new TextLocalisedClause(mra.d.E(aVar4, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_details_allowance_rent_title, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_details_allowance_bills_title), null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20);
        dj0.d dVar2 = configuration2.f84780b;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ALLOWANCE_CELL_DETAILS_ID", t0Var, new CompositeClause(zhm.v.k(sx4.f.b(3, null, null, new dj0.d((long) (d41 * d51), dVar2.f115083b)), sx4.f.b(3, null, null, new dj0.d((long) d68, dVar2.f115083b))), new TextClause(" / ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30712);
        CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("EARN_RATE_CELL_DETAILS_ID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_details_earn_rate_title, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_details_earn_rate_value, u.c(sx4.f.b(3, null, null, dVar2)), null, 12), null, null, null, null, 0, null, false, false, null, null, 30712);
        aw0.t0 t0Var2 = new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_details_monthly_points_title, null, null, 14), (Image) null, 0, false, 30);
        RevPoints revPointsA3 = qvb.a.a(d15);
        o9 o9Var = o9.SENSITIVE;
        Object[] elements = {model2, model3, new CellDetailsDelegate.Model("MONTHLY_POINTS_CELL_DETAILS_ID", t0Var2, nub.a.l(revPointsA3, o9Var, new nub.b(0), null, BitmapDescriptorFactory.HUE_RED, 56), null, null, null, null, 0, null, false, false, null, null, 30712), new CellDetailsDelegate.Model("TOTAL_EARNED_CELL_DETAILS_ID", new aw0.t0((Clause) new TextLocalisedClause(mra.d.E(aVar4, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_details_total_earned_rent_title, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_details_total_earned_bills_title), null, null, 14), (Image) null, 0, false, 30), nub.a.l(qvb.a.a(d5), o9Var, new nub.b(0), null, BitmapDescriptorFactory.HUE_RED, 56), null, null, null, null, 0, null, false, false, null, null, 30712), d5 > 0.0d ? new CellDetailsChevronDelegate.Model("SHOW_ALL_POINTS_ACTIVITY_CELL_ID", new TextLocalisedClause(com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_details_see_all_points_activity, null, null, 14), f2.INTERNAL, 0, null, null, 2040) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        List listL2 = zhm.v.l(iVar2);
        gjc.f fVar = (gjc.f) cVar3.f275019c;
        ArrayList linkedPaymentsForCategory2 = bkc.c.b(linkedPayments, aVar2);
        RentAndBillsManageLinkedPaymentsScreenContract$InputData rentAndBillsManageLinkedPaymentsScreenContract$InputData4 = fVar.f144251a;
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(linkedPaymentsForCategory2, "linkedPaymentsForCategory");
        List list5 = recurringPayments;
        int iB = q0.b(w.t(list5, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj6 : list5) {
            linkedHashMap.put(((qua.p) obj6).f249314a.f160150a, obj6);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it12 = linkedPaymentsForCategory2.iterator();
        while (it12.hasNext()) {
            qua.p pVar = (qua.p) linkedHashMap.get(((RentAndBillsLinkedPayments.Category.LinkedPayment) it12.next()).f84792b.f84794a);
            RowDelegate.Model modelA = pVar != null ? fVar.f144252b.a(pVar, true) : null;
            if (modelA != null) {
                arrayList.add(modelA);
            }
        }
        List listV0 = z3 ? arrayList : d0.V0(arrayList, 3);
        aim.e eVarB = u.b();
        eVarB.add(new CellDetailsNoteDelegate.Model("LINKED_PAYMENTS_CELL_TITLE_ID", new TextLocalisedClause(mra.d.E(rentAndBillsManageLinkedPaymentsScreenContract$InputData4.f84980a, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_linked_payments_rent_title, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_linked_payments_bills_title), null, null, 14), null, null, null, false, null, null, null, null, null, 0, 131060));
        if (listV0.isEmpty()) {
            eVarB.add(new RowDelegate.Model("EMPTY_LINKED_PAYMENTS_ROW_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_puzzle, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(mra.d.E(rentAndBillsManageLinkedPaymentsScreenContract$InputData4.f84980a, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_linked_payments_empty_rent_title, com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_linked_payments_empty_bills_title), null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        } else {
            eVarB.addAll(listV0);
        }
        if (arrayList.size() > 3) {
            eVarB.add(new LargeActionButtonDelegate.Model("SHOW_MORE_PAYMENTS_BUTTON_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(z3 ? com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_linked_payments_show_less : com.revolut.feature.rewards.impl.R$string.rent_and_bills_manage_linked_payments_linked_payments_show_more, null, null, 14), false, null, null, null, null, 1000));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new djc.t(jVar2, w.u(zhm.v.k(list4, listL, listL2, eVarA, helpItemsData)), !bkc.c.b(linkedPayments, iVar.f115299a).isEmpty());
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        dkj.m mVar = (dkj.m) this.f22595b;
        dkj.g gVar = (dkj.g) this.f22596c;
        List featuredPhoneNumbers = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(featuredPhoneNumbers, "featuredPhoneNumbers");
        List list = featuredPhoneNumbers;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                LargeActionButton.ButtonStyle.FlatButton flatButton = LargeActionButton.ButtonStyle.o;
                int i2 = R$drawable.uikit_icn_24_refresh;
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
                Float fValueOf = Float.valueOf(24.0f);
                List listK = zhm.v.k(new ImageClause(i2, numValueOf, fValueOf, fValueOf, 16), new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_mobile_plans_vip_number_selection_refresh, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10));
                m70.a.t(t0.f186434a);
                ArrayList arrayListF0 = d0.F0(new LargeActionButtonDelegate.Model("ID_REFRESH_BUTTON", flatButton, null, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, null, null, null, null, 1000), arrayList);
                yp0.b.k(arrayListF0, 0, 0, 0, 0, 31);
                return arrayListF0;
            }
            Object next = it8.next();
            int i3 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            EsimFeaturedPhoneNumber esimFeaturedPhoneNumber = (EsimFeaturedPhoneNumber) next;
            String strN = a0.d.n("ID_FEATURED_PHONE_NUMBER_", i);
            RowDelegate.Model model = new RowDelegate.Model(a0.d.n("ID_FEATURED_PHONE_NUMBER_", i), null, new TextClause(z80.b.b(mVar.f115581b, esimFeaturedPhoneNumber.f100255b, null, null, 6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, esimFeaturedPhoneNumber, null, 0, 0, 0, 0, 532676602);
            vd0 vd0Var = vd0.RADIO;
            EsimFeaturedPhoneNumber esimFeaturedPhoneNumber2 = gVar.d;
            arrayList.add(new SelectableDelegate.Model(strN, model, Intrinsics.f(esimFeaturedPhoneNumber2 != null ? esimFeaturedPhoneNumber2.f100254a : null, esimFeaturedPhoneNumber.f100254a) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0Var, true, null, null, null, false, 32712));
            i = i3;
        }
    }

    private final Object v(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayListF0;
        dm3.n nVar = (dm3.n) this.f22595b;
        aim.e eVar = (aim.e) this.f22596c;
        p content = (p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayListA = whf.n.a(nVar.f115843b, content, null, j.a.f297643a, null, 10);
        if (arrayListA.size() > 3) {
            arrayListF0 = d0.F0(new LargeActionButtonDelegate.Model("SEE_ALL_TRANSACTIONS_BUTTON_ID", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.contacts.impl.R$string.recipient_profile_transactions_see_all, null, null, 14), false, null, null, null, null, 1000), d0.V0(arrayListA, 3));
        } else {
            arrayListF0 = arrayListA;
        }
        if (!arrayListA.isEmpty()) {
            eVar.add(new ListSubheaderDelegate.Model("TRANSACTIONS_HEADER_ID", null, new TextLocalisedClause(com.revolut.feature.contacts.impl.R$string.recipient_profile_section_title_transactions, null, null, 14), null, null, null, j0.TRANSPARENT, null, null, false, false, null, null, R$attr.uikit_dp16, R$attr.uikit_dp12, 0, 0, 13631418));
            yp0.b.k(arrayListF0, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
            eVar.addAll(arrayListF0);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0555 A[PHI: r16 r21 r29
      0x0555: PHI (r16v30 java.util.List) = 
      (r16v11 java.util.List)
      (r16v12 java.util.List)
      (r16v13 java.util.List)
      (r16v14 java.util.List)
      (r16v15 java.util.List)
      (r16v16 java.util.List)
      (r16v17 java.util.List)
      (r16v18 java.util.List)
      (r16v19 java.util.List)
      (r16v20 java.util.List)
      (r16v21 java.util.List)
      (r16v22 java.util.List)
      (r16v23 java.util.List)
      (r16v24 java.util.List)
      (r16v25 java.util.List)
      (r16v27 java.util.List)
      (r16v31 java.util.List)
     binds: [B:154:0x0553, B:150:0x053b, B:146:0x0521, B:142:0x0507, B:138:0x04ec, B:134:0x04d1, B:130:0x04b6, B:126:0x049b, B:122:0x0480, B:118:0x0465, B:114:0x044a, B:110:0x0430, B:106:0x0416, B:102:0x03fc, B:98:0x03e0, B:94:0x03cc, B:87:0x039c] A[DONT_GENERATE, DONT_INLINE]
      0x0555: PHI (r21v23 int) = 
      (r21v4 int)
      (r21v5 int)
      (r21v6 int)
      (r21v7 int)
      (r21v8 int)
      (r21v9 int)
      (r21v10 int)
      (r21v11 int)
      (r21v12 int)
      (r21v13 int)
      (r21v14 int)
      (r21v15 int)
      (r21v16 int)
      (r21v17 int)
      (r21v18 int)
      (r21v20 int)
      (r21v24 int)
     binds: [B:154:0x0553, B:150:0x053b, B:146:0x0521, B:142:0x0507, B:138:0x04ec, B:134:0x04d1, B:130:0x04b6, B:126:0x049b, B:122:0x0480, B:118:0x0465, B:114:0x044a, B:110:0x0430, B:106:0x0416, B:102:0x03fc, B:98:0x03e0, B:94:0x03cc, B:87:0x039c] A[DONT_GENERATE, DONT_INLINE]
      0x0555: PHI (r29v30 java.lang.String) = 
      (r29v11 java.lang.String)
      (r29v12 java.lang.String)
      (r29v13 java.lang.String)
      (r29v14 java.lang.String)
      (r29v15 java.lang.String)
      (r29v16 java.lang.String)
      (r29v17 java.lang.String)
      (r29v18 java.lang.String)
      (r29v19 java.lang.String)
      (r29v20 java.lang.String)
      (r29v21 java.lang.String)
      (r29v22 java.lang.String)
      (r29v23 java.lang.String)
      (r29v24 java.lang.String)
      (r29v25 java.lang.String)
      (r29v27 java.lang.String)
      (r29v31 java.lang.String)
     binds: [B:154:0x0553, B:150:0x053b, B:146:0x0521, B:142:0x0507, B:138:0x04ec, B:134:0x04d1, B:130:0x04b6, B:126:0x049b, B:122:0x0480, B:118:0x0465, B:114:0x044a, B:110:0x0430, B:106:0x0416, B:102:0x03fc, B:98:0x03e0, B:94:0x03cc, B:87:0x039c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0cc8  */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v38, types: [com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint] */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r3v140, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v141, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v142, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r69, java.lang.Object r70, java.lang.Object r71) {
        /*
            Method dump skipped, instruction units count: 3372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.m.w(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0702  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r69, java.lang.Object r70, java.lang.Object r71) {
        /*
            Method dump skipped, instruction units count: 1835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.m.x(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0a49  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            Method dump skipped, instruction units count: 3514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.m.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
