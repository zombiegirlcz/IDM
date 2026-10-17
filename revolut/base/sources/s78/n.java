package s78;

import cfl.p;
import cfl.v;
import com.revolut.data.model.Data;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import com.revolut.feature.global_markets.domain.MarketAsset;
import com.revolut.feature.global_markets.domain.MarketAssetWithPerformance;
import com.revolut.feature.payees.impl.ui.payees_overview.flow.PayeesOverviewFlowContract$FlowPagerItem;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import d9.t0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jq9.b0;
import jq9.q;
import jq9.t;
import jq9.w;
import jq9.y;
import jq9.z;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pcd.h0;
import pcd.s;
import s7a.m0;
import zhm.d0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f260589b;

    public /* synthetic */ n(List list, int i) {
        this.f260588a = i;
        this.f260589b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        Object aVar;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        v vVar;
        jjb.c cVarA;
        Object next5;
        Object next6;
        Object next7;
        switch (this.f260588a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return this.f260589b;
            case 1:
                Data items = zi0.c.P(this.f260589b, false, null, 3);
                ((s8d.e) obj2).getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                return new s8d.e(items);
            case 2:
                sbd.d params = (sbd.d) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                List<lcd.i> list = this.f260589b;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = false;
                } else {
                    for (lcd.i iVar : list) {
                        if (Intrinsics.f(iVar.f193848a, params.f261573a) || Intrinsics.f(iVar.f193850c, params.f261573a)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return se1.d.a((se1.d) obj2, null, null, this.f260589b.size() > 1, null, null, 27);
            case 4:
                return sm9.e.a((sm9.e) obj2, d0.E0(this.f260589b, u.c(PayeesOverviewFlowContract$FlowPagerItem.CurrentUser.f79005a)), null, 2);
            case 5:
                return snd.b.a((snd.b) obj2, null, this.f260589b, 1);
            case 6:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                List list3 = (List) pair.f186386b;
                List<mwg.k> list4 = this.f260589b;
                ArrayList arrayList = new ArrayList();
                for (mwg.k bond : list4) {
                    Iterator it8 = list2.iterator();
                    while (true) {
                        aVar = null;
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(((nel.n) next).f214596b, bond.f)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    nel.n nVar = (nel.n) next;
                    if (nVar == null) {
                        Iterator it9 = list3.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next2 = it9.next();
                                if (Intrinsics.f(((nel.n) next2).e, bond.f209470b)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        nVar = (nel.n) next2;
                    }
                    if (nVar != null) {
                        int i = sxg.b.f266485a[nVar.f214597c.ordinal()];
                        if (i == 1) {
                            String assetName = nVar.d;
                            String ref2 = nVar.f214596b;
                            String symbol = nVar.e;
                            Intrinsics.checkNotNullParameter(bond, "bond");
                            Intrinsics.checkNotNullParameter(assetName, "assetName");
                            Intrinsics.checkNotNullParameter(ref2, "ref");
                            Intrinsics.checkNotNullParameter(symbol, "symbol");
                            aVar = new rxg.a(symbol, ref2, assetName, bond.d, r10.f115082a, bond.f209471c);
                        } else if (i == 2) {
                            String assetName2 = nVar.d;
                            String ref3 = nVar.f214596b;
                            String symbol2 = nVar.e;
                            Intrinsics.checkNotNullParameter(bond, "fund");
                            Intrinsics.checkNotNullParameter(assetName2, "assetName");
                            Intrinsics.checkNotNullParameter(ref3, "ref");
                            Intrinsics.checkNotNullParameter(symbol2, "symbol");
                            aVar = new rxg.f(symbol2, ref3, assetName2, bond.d, r9.f115082a, bond.f209471c);
                        } else if (i != 3) {
                            String assetName3 = nVar.d;
                            String ref4 = nVar.f214596b;
                            String symbol3 = nVar.e;
                            Intrinsics.checkNotNullParameter(bond, "stock");
                            Intrinsics.checkNotNullParameter(assetName3, "assetName");
                            Intrinsics.checkNotNullParameter(ref4, "ref");
                            Intrinsics.checkNotNullParameter(symbol3, "symbol");
                            aVar = new rxg.i(symbol3, ref4, assetName3, bond.d, r7.f115082a, bond.f209471c);
                        } else {
                            String assetName4 = nVar.d;
                            String ref5 = nVar.f214596b;
                            String symbol4 = nVar.e;
                            ej0.b bVar = bond.f209472g;
                            if (bVar != null) {
                                dj0.d openingPrice = t0.D(bVar, nVar);
                                BigDecimal quantity = bond.f209473h;
                                if (quantity != null) {
                                    Intrinsics.checkNotNullParameter(bond, "cfdPosition");
                                    Intrinsics.checkNotNullParameter(assetName4, "assetName");
                                    Intrinsics.checkNotNullParameter(ref5, "ref");
                                    Intrinsics.checkNotNullParameter(symbol4, "symbol");
                                    Intrinsics.checkNotNullParameter(openingPrice, "openingPrice");
                                    Intrinsics.checkNotNullParameter(quantity, "quantity");
                                    aVar = new rxg.c(symbol4, ref5, assetName4, openingPrice, null, quantity, bond.d, r8.f115082a, bond.f209471c);
                                }
                            }
                        }
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                return arrayList;
            case 7:
                ybl.g productsGroupAvailability = (ybl.g) obj2;
                Intrinsics.checkNotNullParameter(productsGroupAvailability, "productsGroupAvailability");
                od0.h hVar = od0.i.Companion;
                p group = p.BONDS;
                Set requiredProductStates = y0.b(v.ONBOARDING);
                productsGroupAvailability.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                List productCodes = this.f260589b;
                Intrinsics.checkNotNullParameter(productCodes, "productCodes");
                TradingAccountType.Gia accountType = TradingAccountType.Gia.f105270a;
                Intrinsics.checkNotNullParameter(accountType, "accountType");
                Intrinsics.checkNotNullParameter(requiredProductStates, "requiredProductStates");
                ybl.h hVar2 = (ybl.h) productsGroupAvailability.f312386a.get(group);
                boolean z3 = false;
                if (hVar2 != null) {
                    Intrinsics.checkNotNullParameter(productCodes, "productCodes");
                    Intrinsics.checkNotNullParameter(accountType, "accountType");
                    Intrinsics.checkNotNullParameter(requiredProductStates, "requiredProductStates");
                    if (!productCodes.isEmpty()) {
                        Set productCodes2 = d0.i1(productCodes);
                        m0 predicate = new m0(27, requiredProductStates);
                        Intrinsics.checkNotNullParameter(productCodes2, "productCodes");
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(predicate, "predicate");
                        if (!productCodes2.isEmpty()) {
                            Iterator it10 = hVar2.f312387a.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next3 = it10.next();
                                    if (Intrinsics.f(((TradingAccount) next3).W(), accountType)) {
                                    }
                                } else {
                                    next3 = null;
                                }
                            }
                            TradingAccount tradingAccount = (TradingAccount) next3;
                            if (tradingAccount != null) {
                                Set<TradingProductCode> set = productCodes2;
                                if ((set instanceof Collection) && set.isEmpty()) {
                                    z3 = true;
                                } else {
                                    for (TradingProductCode tradingProductCode : set) {
                                        Iterator it11 = tradingAccount.c0().iterator();
                                        while (true) {
                                            if (it11.hasNext()) {
                                                next4 = it11.next();
                                                if (Intrinsics.f(((TradingProduct) next4).f105281b, tradingProductCode)) {
                                                }
                                            } else {
                                                next4 = null;
                                            }
                                        }
                                        TradingProduct tradingProduct = (TradingProduct) next4;
                                        if (!((tradingProduct == null || (vVar = tradingProduct.f105282c) == null) ? false : ((Boolean) predicate.invoke(vVar)).booleanValue())) {
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        }
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                hVar.getClass();
                return od0.h.a(boolValueOf);
            case 8:
                List<jq9.k> recipients = (List) obj2;
                Intrinsics.checkNotNullParameter(recipients, "recipients");
                ArrayList arrayList2 = new ArrayList();
                for (jq9.k kVar : recipients) {
                    boolean z4 = kVar instanceof jq9.p;
                    List list5 = this.f260589b;
                    t zVar = null;
                    if (z4) {
                        if (list5.contains(WhoToTransferFilter.Revolut.f80005a)) {
                            zVar = new y(((jq9.p) kVar).f177514b);
                        }
                    } else if (kVar instanceof jq9.m) {
                        if (list5.contains(WhoToTransferFilter.Accounts.f79984a)) {
                            zVar = new jq9.v(((jq9.m) kVar).f177508b);
                        }
                    } else if (kVar instanceof jq9.n) {
                        if (list5.contains(WhoToTransferFilter.Cards.f79998a)) {
                            zVar = new w(((jq9.n) kVar).f177510b);
                        }
                    } else if ((kVar instanceof q) && list5.contains(WhoToTransferFilter.ApmUpi.f79995a)) {
                        PaymentCounterpartyInfo paymentCounterpartyInfo = ((q) kVar).f177516b;
                        if (paymentCounterpartyInfo.f79061b == ho9.b.UPI_CONTACT) {
                            zVar = new z(paymentCounterpartyInfo);
                        }
                    }
                    if (zVar != null) {
                        arrayList2.add(zVar);
                    }
                }
                return d0.V0(arrayList2, 12);
            case 9:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list6 = (List) pair2.f186385a;
                List list7 = (List) pair2.f186386b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it12 = list6.iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : list7) {
                            if (!d0.T(arrayList3, (t) obj3)) {
                                arrayList4.add(obj3);
                            }
                        }
                        ArrayList arrayListE0 = d0.E0(arrayList4, arrayList3);
                        HashSet hashSet = new HashSet();
                        ArrayList arrayListF1 = d0.f1(arrayListE0);
                        arrayListF1.removeIf(new akl.p(new jci.h(hashSet, 2), 23));
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : arrayListF1) {
                            t tVar = (t) obj4;
                            boolean z6 = tVar instanceof y;
                            y yVar = z6 ? (y) tVar : null;
                            boolean z11 = (yVar != null ? yVar.f177526a : null) instanceof zm3.j;
                            List list8 = this.f260589b;
                            if (!z11 || !list8.contains(e3a.c.REVOLUT_CONTACT_REMOTE)) {
                                y yVar2 = z6 ? (y) tVar : null;
                                if (!((yVar2 != null ? yVar2.f177526a : null) instanceof zm3.i) || !list8.contains(e3a.c.REVOLUT_CONTACT_LOCAL)) {
                                    y yVar3 = z6 ? (y) tVar : null;
                                    if (!((yVar3 != null ? yVar3.f177526a : null) instanceof zm3.e) || !list8.contains(e3a.c.DEVICE_CONTACT_EMAIL)) {
                                        y yVar4 = z6 ? (y) tVar : null;
                                        if ((!((yVar4 != null ? yVar4.f177526a : null) instanceof zm3.f) || !list8.contains(e3a.c.DEVICE_CONTACT_PHONE)) && (!(tVar instanceof b0) || !list8.contains(e3a.c.GROUP))) {
                                        }
                                    }
                                }
                            }
                            arrayList5.add(obj4);
                        }
                        return arrayList5;
                    }
                    Object next8 = it12.next();
                    zm3.a aVar2 = ((y) next8).f177526a;
                    zm3.i iVar2 = aVar2 instanceof zm3.i ? (zm3.i) aVar2 : null;
                    if (iVar2 != null && iVar2.f323352c) {
                        arrayList3.add(next8);
                    }
                }
                break;
            case 10:
                List list9 = this.f260589b;
                Intrinsics.h(list9);
                return tb6.m.a((tb6.m) obj2, null, null, null, null, null, null, null, null, null, list9, false, false, false, null, 15871);
            case 11:
                return tch.q.a((tch.q) obj2, null, null, this.f260589b, null, 11);
            case 12:
                return bih.h.a((bih.h) obj2, null, this.f260589b, null, null, null, 61);
            case 13:
                od0.i tradingAccountState = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(tradingAccountState, "tradingAccountState");
                List<SavingsAccountDetails> list10 = this.f260589b;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list10, 10));
                for (SavingsAccountDetails savingsAccountDetails : list10) {
                    SavingsProductData savingsProductData = savingsAccountDetails.f86462c;
                    s sVar = savingsAccountDetails.f86460a;
                    dj0.d dVar = null;
                    if (savingsProductData != null) {
                        jjb.b bVar2 = jjb.c.Companion;
                        cfl.b bVar3 = (cfl.b) tradingAccountState.f224257a;
                        bVar2.getClass();
                        cVarA = jjb.b.a(savingsProductData, bVar3);
                    } else {
                        cVarA = null;
                    }
                    h0 h0Var = sVar.f234883c;
                    long j2 = sVar.f234884g;
                    zld.a aVar3 = (cVarA == jjb.c.PAUSED || !(h0Var == h0.ACTIVE || h0Var == h0.PENDING_ACTIVATION)) ? zld.a.PENDING : zld.a.ACTIVE;
                    if (j2 != 0) {
                        dVar = new dj0.d(j2, kii.e.u(sVar, xi0.b.Companion));
                    }
                    arrayList6.add(new IncomeSorterDestinationInfo.Savings(savingsAccountDetails, dVar, aVar3));
                }
                return arrayList6;
            case 14:
                Object[] items2 = (Object[]) obj2;
                Intrinsics.checkNotNullParameter(items2, "items");
                ArrayList arrayList7 = new ArrayList();
                int length = items2.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    Object obj5 = items2[i2];
                    int i5 = i3 + 1;
                    Object obj6 = ((Pair) this.f260589b.get(i3)).f186385a;
                    Intrinsics.i(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                    if (!((Boolean) obj5).booleanValue()) {
                        obj6 = null;
                    }
                    n02.b bVar4 = (n02.b) obj6;
                    if (bVar4 != null) {
                        arrayList7.add(bVar4);
                    }
                    i2++;
                    i3 = i5;
                }
                return arrayList7;
            case 15:
                Pair it13 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return d0.E0((Iterable) it13.f186386b, d0.E0((Iterable) it13.f186385a, this.f260589b));
            case 16:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, this.f260589b, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194047);
            case 17:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, null, null, null, null, null, null, null, this.f260589b, null, null, null, null, null, null, 4161535);
            case 18:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, null, this.f260589b, null, null, null, null, null, null, null, null, null, null, null, null, 4193791);
            case 19:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, this.f260589b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194239);
            case 20:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, null, null, this.f260589b, null, null, null, null, null, null, null, null, null, null, null, 4193279);
            case 21:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, null, null, null, this.f260589b, null, null, null, null, null, null, null, null, null, null, 4192255);
            case 22:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, null, null, null, null, null, this.f260589b, null, null, null, null, null, null, null, null, 4186111);
            case 23:
                return u8j.b.a((u8j.b) obj2, false, null, null, null, null, null, null, null, null, null, null, null, this.f260589b, null, null, null, null, null, null, null, 4177919);
            case 24:
                List list11 = this.f260589b;
                Intrinsics.h(list11);
                return ueg.v.a((ueg.v) obj2, null, null, null, null, null, null, null, null, null, null, null, list11, null, null, null, null, null, null, false, null, null, null, null, 8386559);
            case 25:
                tk5.j multichainInfoSheet = ((uk5.b) obj2).f280687a;
                Intrinsics.checkNotNullParameter(multichainInfoSheet, "multichainInfoSheet");
                return new uk5.b(multichainInfoSheet, this.f260589b);
            case 26:
                return new um2.e(this.f260589b, ((Boolean) obj2).booleanValue());
            case 27:
                List detailsContent = (List) obj2;
                Intrinsics.checkNotNullParameter(detailsContent, "detailsContent");
                List<FincrimeHomeScreen$V2> list12 = detailsContent;
                ArrayList arrayList8 = new ArrayList(zhm.w.t(list12, 10));
                for (FincrimeHomeScreen$V2 fincrimeHomeScreen$V2 : list12) {
                    Iterator it14 = this.f260589b.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            next5 = it14.next();
                            if (Intrinsics.f((String) next5, fincrimeHomeScreen$V2.i)) {
                            }
                        } else {
                            next5 = null;
                        }
                    }
                    if (next5 == null) {
                        throw new IllegalArgumentException(p.a.p("Can't find ticket ", fincrimeHomeScreen$V2.i, " by details").toString());
                    }
                    arrayList8.add(new TicketDetails((String) next5, fincrimeHomeScreen$V2));
                }
                return arrayList8;
            case 28:
                List items3 = (List) obj2;
                Intrinsics.checkNotNullParameter(items3, "items");
                ArrayList arrayList9 = new ArrayList();
                for (Object obj7 : items3) {
                    qv0.i iVar3 = (qv0.i) obj7;
                    List list13 = this.f260589b;
                    if (list13 == null || !list13.contains(iVar3.getF55154b())) {
                        arrayList9.add(obj7);
                    }
                }
                return arrayList9;
            default:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list14 = (List) pair3.f186385a;
                List list15 = (List) pair3.f186386b;
                List<MarketAsset> list16 = this.f260589b;
                ArrayList arrayList10 = new ArrayList(zhm.w.t(list16, 10));
                for (MarketAsset marketAsset : list16) {
                    Iterator it15 = list14.iterator();
                    while (true) {
                        if (it15.hasNext()) {
                            next6 = it15.next();
                            if (Intrinsics.f(((MarketAssetWithPerformance) next6).getF74577a(), marketAsset)) {
                            }
                        } else {
                            next6 = null;
                        }
                    }
                    MarketAssetWithPerformance marketAssetWithPerformance = (MarketAssetWithPerformance) next6;
                    if (marketAssetWithPerformance == null) {
                        Iterator it16 = list15.iterator();
                        while (true) {
                            if (it16.hasNext()) {
                                next7 = it16.next();
                                if (Intrinsics.f(((MarketAssetWithPerformance) next7).getF74577a(), marketAsset)) {
                                }
                            } else {
                                next7 = null;
                            }
                        }
                        marketAssetWithPerformance = (MarketAssetWithPerformance) next7;
                        if (marketAssetWithPerformance == null) {
                            marketAssetWithPerformance = new MarketAssetWithPerformance(marketAsset, null);
                        }
                    }
                    arrayList10.add(marketAssetWithPerformance);
                }
                return arrayList10;
        }
    }

    public /* synthetic */ n(List list, tpd.f fVar) {
        this.f260588a = 13;
        this.f260589b = list;
    }

    public /* synthetic */ n(t3a.h hVar, List list) {
        this.f260588a = 9;
        this.f260589b = list;
    }
}
