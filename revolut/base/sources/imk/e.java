package imk;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.categorisation.api.model.AnalyticsAccountPocketSource;
import com.revolut.feature.statements.api.models.ConsolidatedStatementProductType;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.transactions.api.navigation.UpcomingPaymentsPocketInfo;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$State;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$State;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubModal;
import com.revolut.retail.trading.core.domain.PocketInfo;
import com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$State;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import org.joda.time.DateTime;
import tof.cc;
import tof.da;
import tof.dc;
import tof.fc;
import tof.g8;
import tof.h9;
import tof.i7;
import tof.n7;
import tof.o7;
import tof.oa;
import tof.qb;
import tof.s9;
import tof.y6;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f162507b;

    public /* synthetic */ e(int i, Set set) {
        this.f162506a = i;
        this.f162507b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        xi0.b bVar;
        int i = this.f162506a;
        i = 0;
        int i2 = 0;
        z = false;
        boolean z = false;
        Set set = this.f162507b;
        switch (i) {
            case 0:
                PlanHubModal modal = (PlanHubModal) obj2;
                Intrinsics.checkNotNullParameter(modal, "modal");
                return Boolean.valueOf(!set.contains(modal.f102649a));
            case 1:
                return Boolean.valueOf(set.contains((String) obj2));
            case 2:
                SubSpaceAccountItem accountItem = (SubSpaceAccountItem) obj2;
                Intrinsics.checkNotNullParameter(accountItem, "accountItem");
                ProductAccount productAccount = accountItem.f89560b;
                ProductAccount.ValueItem.Main main = productAccount instanceof ProductAccount.ValueItem.Main ? (ProductAccount.ValueItem.Main) productAccount : null;
                return Boolean.valueOf(main != null ? set.contains(main.f89504c.f89729a) : false);
            case 3:
                List executions = (List) obj2;
                Intrinsics.checkNotNullParameter(executions, "executions");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : executions) {
                    if (set.contains(((IncomeSorterExecution) obj3).f99239b)) {
                        arrayList.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : arrayList) {
                    String str = ((IncomeSorterExecution) obj4).f99239b;
                    Object objO = linkedHashMap.get(str);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str);
                    }
                    ((List) objO).add(obj4);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it8 = linkedHashMap.entrySet().iterator();
                while (it8.hasNext()) {
                    Iterator it9 = ((List) ((Map.Entry) it8.next()).getValue()).iterator();
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (it9.hasNext()) {
                            long j2 = ((IncomeSorterExecution) next).e;
                            do {
                                Object next2 = it9.next();
                                long j3 = ((IncomeSorterExecution) next2).e;
                                if (j2 < j3) {
                                    next = next2;
                                    j2 = j3;
                                }
                            } while (it9.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    IncomeSorterExecution incomeSorterExecution = (IncomeSorterExecution) next;
                    if (incomeSorterExecution != null) {
                        arrayList2.add(incomeSorterExecution);
                    }
                }
                return arrayList2;
            case 4:
                return k2h.f.a((k2h.f) obj2, set, null, 11);
            case 5:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : pockets) {
                    if (set.contains(((io3.d) obj5).f163145a)) {
                        arrayList3.add(obj5);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it10 = arrayList3.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(((io3.d) it10.next()).f163147c);
                }
                od0.h hVar = od0.i.Companion;
                UpcomingPaymentsPocketInfo.ListOfPockets listOfPockets = new UpcomingPaymentsPocketInfo.ListOfPockets(zhm.d0.i1(arrayList4));
                hVar.getClass();
                return od0.h.a(listOfPockets);
            case 6:
                Map sourcesByAnalyticsAccounts = (Map) obj2;
                Intrinsics.checkNotNullParameter(sourcesByAnalyticsAccounts, "sourcesByAnalyticsAccounts");
                ArrayList<AnalyticsAccountPocketSource> arrayList5 = new ArrayList();
                Iterator it11 = set.iterator();
                while (it11.hasNext()) {
                    Iterable iterable = (List) sourcesByAnalyticsAccounts.get((AnalyticsAccount.Pro.CurrencyPocket) it11.next());
                    if (iterable == null) {
                        iterable = zhm.f0.f322471a;
                    }
                    zhm.a0.x(iterable, arrayList5);
                }
                ArrayList arrayList6 = new ArrayList();
                for (AnalyticsAccountPocketSource analyticsAccountPocketSource : arrayList5) {
                    if (analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.PocketSource) {
                        bVar = io3.h.e(((AnalyticsAccountPocketSource.PocketSource) analyticsAccountPocketSource).f65740a).f115083b;
                    } else {
                        if (!(analyticsAccountPocketSource instanceof AnalyticsAccountPocketSource.SubaccountSource)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = null;
                    }
                    if (bVar != null) {
                        arrayList6.add(bVar);
                    }
                }
                return zhm.d0.i1(arrayList6);
            case 7:
                return ax4.b.a((ax4.b) obj2, null, null, null, this.f162507b, null, null, null, null, null, null, null, null, null, 8183);
            case 8:
                pcd.s vault = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                if (set.contains(vault.e) && (vault.f234885h instanceof pcd.f0)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                m3g.n updateState = (m3g.n) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return m3g.n.a(updateState, null, null, null, null, null, null, TravelExperienceFiltersSelection.a(updateState.f202545g, null, null, this.f162507b, false, null, 27), null, null, false, 959);
            case 10:
                List ratesDto = (List) obj2;
                Intrinsics.checkNotNullParameter(ratesDto, "ratesDto");
                ArrayList<n9l.a> arrayListF = io3.h.F(ratesDto);
                if (arrayListF.size() != set.size()) {
                    int iB = zhm.q0.b(zhm.w.t(arrayListF, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                    for (Object obj6 : arrayListF) {
                        n9l.a aVar = (n9l.a) obj6;
                        linkedHashMap2.put(new Pair(aVar.f213661a, aVar.f213662b), obj6);
                    }
                    Set<Pair> set2 = set;
                    arrayListF = new ArrayList(zhm.w.t(set2, 10));
                    for (Pair pair : set2) {
                        n9l.a aVar2 = (n9l.a) linkedHashMap2.get(pair);
                        if (aVar2 == null) {
                            aVar2 = new n9l.a(-1.0d, (xi0.b) pair.f186385a, (xi0.b) pair.f186386b);
                        }
                        arrayListF.add(aVar2);
                    }
                }
                ArrayList arrayList7 = new ArrayList(zhm.w.t(arrayListF, 10));
                for (n9l.a aVar3 : arrayListF) {
                    double d = aVar3.f213663c;
                    Double dValueOf = Double.valueOf(d);
                    if (d == -1.0d) {
                        dValueOf = null;
                    }
                    arrayList7.add(new m9l.g(aVar3, dValueOf));
                }
                return arrayList7;
            case 11:
                maa.j update = (maa.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return maa.j.a(update, null, 0, 0, null, this.f162507b, 15);
            case 12:
                maa.j update2 = (maa.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return maa.j.a(update2, null, 0, 0, null, this.f162507b, 15);
            case 13:
                yh5.a onboardingState = (yh5.a) obj2;
                Intrinsics.checkNotNullParameter(onboardingState, "onboardingState");
                if (!yh5.b.x(onboardingState)) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar2 = od0.i.Companion;
                i7.c cVar = i7.Companion;
                y6[] y6VarArr = {y6.CARD_PAYMENT};
                cVar.getClass();
                i7 i7VarA = fc.a(i7.c.d(y6VarArr), new da(set));
                hVar2.getClass();
                return od0.h.a(i7VarA);
            case 14:
                List types = (List) obj2;
                Intrinsics.checkNotNullParameter(types, "types");
                List list = types;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it12 = list.iterator();
                    while (it12.hasNext()) {
                        if (set.contains((String) it12.next()) && (i2 = i2 + 1) < 0) {
                            zhm.v.r();
                            throw null;
                        }
                    }
                }
                return Integer.valueOf(i2);
            case 15:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                ArrayList arrayList8 = new ArrayList();
                for (Object obj7 : it13) {
                    if (set.contains(((io3.d) obj7).e)) {
                        arrayList8.add(obj7);
                    }
                }
                return arrayList8;
            case 16:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                i7.c cVar2 = i7.Companion;
                i7[] i7VarArr = {new o7(), new n7()};
                cVar2.getClass();
                oa oaVarB = i7.c.b(i7VarArr);
                cc ccVar = new cc(nae.d.f);
                h9 h9Var = new h9(true);
                DateTime dateTimeMinusMonths = DateTime.now().minusMonths(1);
                Intrinsics.checkNotNullExpressionValue(dateTimeMinusMonths, "minusMonths(...)");
                dc dcVar = new dc(dateTimeMinusMonths);
                DateTime dateTimeMinusMonths2 = DateTime.now().minusMonths(1);
                Intrinsics.checkNotNullExpressionValue(dateTimeMinusMonths2, "minusMonths(...)");
                return i7.c.a(oaVarB, ccVar, h9Var, i7.c.b(dcVar, new g8(dateTimeMinusMonths2)), i7.c.e(new s9(set)));
            case 17:
                Intrinsics.checkNotNullParameter((String) obj2, "it");
                i7.c cVar3 = i7.Companion;
                i7[] i7VarArr2 = {new o7(), new n7()};
                cVar3.getClass();
                oa oaVarB2 = i7.c.b(i7VarArr2);
                cc ccVar2 = new cc(nae.d.f);
                qb qbVar = new qb(nae.d.f213861g);
                DateTime dateTimeMinusMonths3 = DateTime.now().minusMonths(1);
                Intrinsics.checkNotNullExpressionValue(dateTimeMinusMonths3, "minusMonths(...)");
                dc dcVar2 = new dc(dateTimeMinusMonths3);
                DateTime dateTimeMinusMonths4 = DateTime.now().minusMonths(1);
                Intrinsics.checkNotNullExpressionValue(dateTimeMinusMonths4, "minusMonths(...)");
                return i7.c.a(oaVarB2, ccVar2, qbVar, i7.c.b(dcVar2, new g8(dateTimeMinusMonths4)), new s9(set));
            case 18:
                com.revolut.feature.tab.lifestyle.impl.ui.screen.a updateState2 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a(updateState2, null, null, null, false, null, null, null, null, null, null, this.f162507b, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 268433407);
            case 19:
                ChangePhoneFlowContract$State update3 = (ChangePhoneFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ChangePhoneFlowContract$State.a(update3, set, null, null, 6);
            case 20:
                return ntf.g.a((ntf.g) obj2, null, this.f162507b, null, false, 55);
            case 21:
                oc9.v update4 = (oc9.v) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return oc9.v.a(update4, null, null, null, this.f162507b, null, null, 55);
            case 22:
                oc9.v update5 = (oc9.v) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return oc9.v.a(update5, null, null, null, null, null, this.f162507b, 31);
            case 23:
                PocketInfo it14 = (PocketInfo) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(set == null || set.contains(it14.getF104478b().f115083b));
            case 24:
                PocketInfo it15 = (PocketInfo) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(set == null || !set.contains(it15.getF104478b().f115083b));
            case 25:
                WorkflowFlowContract$State update6 = (WorkflowFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return WorkflowFlowContract$State.a(update6, null, this.f162507b, null, null, null, ISO781611.SMT_TAG);
            case 26:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                Set set3 = (Set) rVar.f314201a;
                uib.a aVar4 = (uib.a) rVar.f314202b;
                do3.n nVar = (do3.n) rVar.f314203c;
                SelectableDelegate.Model modelF = pzd.c.f(ConsolidatedStatementProductType.SAVINGS, set3, set, aVar4.f280366a, nVar);
                ConsolidatedStatementProductType consolidatedStatementProductType = ConsolidatedStatementProductType.COMMODITIES;
                uib.c cVar4 = aVar4.f280366a;
                qv0.i[] elements = {modelF, pzd.c.f(consolidatedStatementProductType, set3, set, cVar4, nVar), pzd.c.f(ConsolidatedStatementProductType.STOCK, set3, set, cVar4, nVar), pzd.c.f(ConsolidatedStatementProductType.CRYPTO, set3, set, cVar4, nVar)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                return listL;
            case 27:
                return pzd.p.a((pzd.p) obj2, this.f162507b, null, null, null, null, null, 510);
            case 28:
                qp7.i updateState3 = (qp7.i) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return qp7.i.a(updateState3, null, set, 1);
            default:
                AirportLoungePassDetailsFlowContract$State update7 = (AirportLoungePassDetailsFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return AirportLoungePassDetailsFlowContract$State.a(update7, false, null, null, this.f162507b, 31);
        }
    }

    public /* synthetic */ e(Object obj2, Set set, int i) {
        this.f162506a = i;
        this.f162507b = set;
    }
}
