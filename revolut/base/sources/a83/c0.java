package a83;

import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$State;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.feature.global_markets.domain.MarketAsset;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.tab.accounts.impl.ui.spaces.AccountSpacesContract$State;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.rxdata.core.CompositeException;
import com.revolut.shared.feature.wealth.domain.api.interactors.PartialPortfolioBalanceException;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.screener.ScreenerInstrument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2040b;

    public /* synthetic */ c0(int i, ArrayList arrayList) {
        this.f2039a = i;
        this.f2040b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        bjb.a aVar;
        int i = this.f2039a;
        ArrayList arrayList = null;
        ArrayList<String> items = this.f2040b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                ArrayList arrayListE0 = zhm.d0.E0((List) pair.f186386b, (List) pair.f186385a);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(items, 10));
                Iterator it8 = items.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(new PocketWithSubaccount((io3.d) it8.next(), (String) null, (xi0.b) null, (List) null, false, 62));
                }
                return zhm.d0.E0(arrayList2, arrayListE0);
            case 1:
                a94.r update = (a94.r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data debts = zi0.c.P(items, false, null, 3);
                update.getClass();
                Intrinsics.checkNotNullParameter(debts, "debts");
                return new a94.r(debts, null, null);
            case 2:
                v9l.a sharedTransaction = (v9l.a) obj2;
                Intrinsics.checkNotNullParameter(sharedTransaction, "sharedTransaction");
                xl2.q qVarB = ad0.n.b(items, sharedTransaction);
                return (qVarB == null || qVarB.f306928b == null) ? SelectableDelegate.b.C0424b.f53319a : SelectableDelegate.b.c.f53320a;
            case 3:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                List list = (List) data.component1();
                if (list == null) {
                    return data;
                }
                List list2 = list;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(((InstrumentTicker) it9.next()).f105112b);
                }
                List list3 = (List) ue0.e.M(zhm.d0.B0(items, arrayList3));
                PartialPortfolioBalanceException partialPortfolioBalanceException = list3 != null ? new PartialPortfolioBalanceException(list3) : null;
                Throwable error = data.getError();
                return Data.copy$default(data, list, partialPortfolioBalanceException == null ? error : error == null ? partialPortfolioBalanceException : new CompositeException(zhm.v.k(error, partialPortfolioBalanceException)), false, 4, null);
            case 4:
                ahd.n update2 = (ahd.n) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ahd.n.a(update2, null, new Data(this.f2040b, null, false, 6, null), null, null, 13);
            case 5:
                AccountSpacesContract$State update3 = (AccountSpacesContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return AccountSpacesContract$State.a(update3, this.f2040b, null, null, null, null, 30);
            case 6:
                av5.f updateState = (av5.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return av5.f.a(updateState, null, items, 13);
            case 7:
                List vendors = (List) obj2;
                Intrinsics.checkNotNullParameter(vendors, "vendors");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : vendors) {
                    List listJ = jli.g.j(((PaymentVendor) obj3).f64080b);
                    if (!items.isEmpty()) {
                        for (String str : items) {
                            List list4 = listJ;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                Iterator it10 = list4.iterator();
                                while (it10.hasNext()) {
                                    if (kotlin.text.a0.H((String) it10.next(), str, true)) {
                                    }
                                }
                            }
                            break;
                        }
                    }
                    arrayList4.add(obj3);
                }
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                Iterator it11 = arrayList4.iterator();
                while (it11.hasNext()) {
                    arrayList5.add(new b4k.a((PaymentVendor) it11.next()));
                }
                return arrayList5;
            case 8:
                bx8.m update4 = (bx8.m) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return bx8.m.a(update4, null, zhm.d0.d1(items), 1);
            case 9:
                bx8.m update5 = (bx8.m) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return bx8.m.a(update5, items, null, 2);
            case 10:
                bx8.m update6 = (bx8.m) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return bx8.m.a(update6, null, zhm.d0.d1(items), 1);
            case 11:
                k77.l assets = (k77.l) obj2;
                Intrinsics.checkNotNullParameter(assets, "assets");
                List<MarketAsset> list5 = assets.f181839a;
                ArrayList arrayList6 = new ArrayList();
                for (MarketAsset marketAsset : list5) {
                    MarketAsset.Index index = marketAsset instanceof MarketAsset.Index ? (MarketAsset.Index) marketAsset : null;
                    if (index != null) {
                        arrayList6.add(index);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj4 : arrayList6) {
                    if (items.contains(((MarketAsset.Index) obj4).a())) {
                        arrayList7.add(obj4);
                    }
                }
                return arrayList7;
            case 12:
                c5j.j update7 = (c5j.j) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return c5j.j.a(update7, items, 0, 6);
            case 13:
                TabAccountsScreenContract$State update8 = (TabAccountsScreenContract$State) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return TabAccountsScreenContract$State.a(update8, null, null, null, null, null, null, null, zi0.c.P(items, false, null, 3), null, null, null, false, null, false, null, null, null, null, null, false, false, null, 4194175);
            case 14:
                csj.i updateState2 = (csj.i) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                Data data2 = updateState2.f108482a;
                csj.g gVar = (csj.g) data2.getContent();
                Data categoriesBudgetsData = Data.copy$default(data2, gVar != null ? csj.g.a(gVar, items) : null, null, false, 6, null);
                Intrinsics.checkNotNullParameter(categoriesBudgetsData, "categoriesBudgetsData");
                return new csj.i(categoriesBudgetsData);
            case 15:
                csj.i updateState3 = (csj.i) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                Data data3 = updateState3.f108482a;
                csj.g gVar2 = (csj.g) data3.getContent();
                Data categoriesBudgetsData2 = Data.copy$default(data3, gVar2 != null ? csj.g.a(gVar2, items) : null, null, false, 6, null);
                Intrinsics.checkNotNullParameter(categoriesBudgetsData2, "categoriesBudgetsData");
                return new csj.i(categoriesBudgetsData2);
            case 16:
                List performanceAssets = (List) obj2;
                Intrinsics.checkNotNullParameter(performanceAssets, "performanceAssets");
                List list6 = performanceAssets;
                int iB = zhm.q0.b(zhm.w.t(list6, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj5 : list6) {
                    linkedHashMap.put(((vel.f) obj5).a(), obj5);
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it12 = items.iterator();
                while (it12.hasNext()) {
                    ScreenerInstrument screenerInstrument = (ScreenerInstrument) it12.next();
                    vel.f fVar = (vel.f) linkedHashMap.get(screenerInstrument.f105162a);
                    g0h.a aVar2 = fVar == null ? null : new g0h.a(screenerInstrument, fVar);
                    if (aVar2 != null) {
                        arrayList8.add(aVar2);
                    }
                }
                return arrayList8;
            case 17:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return zhm.d0.E0(items, it13);
            case 18:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                LinkedHashSet linkedHashSet = config.M;
                xi0.a aVar3 = xi0.b.Companion;
                ArrayList arrayList9 = new ArrayList(zhm.w.t(linkedHashSet, 10));
                Iterator it14 = linkedHashSet.iterator();
                while (it14.hasNext()) {
                    t61.a.A(aVar3, (String) it14.next(), arrayList9);
                }
                Collection collection = config.T;
                List list7 = config.P0;
                if (list7 != null) {
                    List list8 = list7;
                    arrayList = new ArrayList(zhm.w.t(list8, 10));
                    Iterator it15 = list8.iterator();
                    while (it15.hasNext()) {
                        arrayList.add(((e7l.h) it15.next()).f123408a);
                    }
                }
                Collection[] elements = {arrayList9, collection, arrayList};
                Intrinsics.checkNotNullParameter(elements, "elements");
                Set setI1 = zhm.d0.i1(zhm.w.u(kotlin.collections.d.L(elements)));
                ArrayList arrayList10 = new ArrayList();
                for (Object obj6 : items) {
                    if (setI1.contains((xi0.b) obj6)) {
                        arrayList10.add(obj6);
                    }
                }
                return arrayList10;
            case 19:
                eh1.l update9 = (eh1.l) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                Data cardOtpDataList = zi0.c.P(items, false, null, 3);
                update9.getClass();
                Intrinsics.checkNotNullParameter(cardOtpDataList, "cardOtpDataList");
                return new eh1.l(cardOtpDataList);
            case 20:
                ezk.a update10 = (ezk.a) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return ezk.a.a(update10, null, null, items, 3);
            case 21:
                fci.g update11 = (fci.g) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return fci.g.a(update11, null, items, 5);
            case 22:
                gk7.f updateState4 = (gk7.f) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return gk7.f.a(updateState4, null, this.f2040b, null, null, 13);
            case 23:
                List list9 = (List) obj2;
                ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("scopes", list9);
                Iterator it16 = items.iterator();
                while (it16.hasNext()) {
                    SavingsDocument savingsDocument = (SavingsDocument) it16.next();
                    if (savingsDocument instanceof SavingsDocument.Link) {
                        aVar = new bjb.a(((SavingsDocument.Link) savingsDocument).f86608a, savingsDocument);
                    } else {
                        if (!(savingsDocument instanceof SavingsDocument.Scope)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Iterator it17 = list9.iterator();
                        while (true) {
                            if (it17.hasNext()) {
                                next = it17.next();
                                if (Intrinsics.f(((SavingsDocument.Scope) savingsDocument).f86611a, ((Terms) next).f.f90390a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        Terms terms = (Terms) next;
                        aVar = terms != null ? new bjb.a(terms.f90359h, savingsDocument) : null;
                    }
                    if (aVar != null) {
                        arrayListY.add(aVar);
                    }
                }
                return arrayListY;
            case 24:
                hq9.h update12 = (hq9.h) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                update12.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                return new hq9.h(items);
            case 25:
                BiometricVerificationDocumentStepFlowContract$State update13 = (BiometricVerificationDocumentStepFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                update13.getClass();
                Intrinsics.checkNotNullParameter(items, "mediaKeys");
                return new BiometricVerificationDocumentStepFlowContract$State(items);
            case 26:
                i06.g update14 = (i06.g) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return i06.g.a(update14, false, this.f2040b, false, null, false, 29);
            case 27:
                ihd.o updateState5 = (ihd.o) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return ihd.o.a(updateState5, null, this.f2040b, null, false, 29);
            case 28:
                ihd.o updateState6 = (ihd.o) obj2;
                Intrinsics.checkNotNullParameter(updateState6, "$this$updateState");
                return ihd.o.a(updateState6, null, this.f2040b, null, false, 29);
            default:
                jch.j update15 = (jch.j) obj2;
                Intrinsics.checkNotNullParameter(update15, "$this$update");
                return jch.j.a(update15, items);
        }
    }

    public /* synthetic */ c0(Object obj2, ArrayList arrayList, int i) {
        this.f2039a = i;
        this.f2040b = arrayList;
    }

    public /* synthetic */ c0(ArrayList arrayList, ael.t tVar) {
        this.f2039a = 3;
        this.f2040b = arrayList;
    }
}
