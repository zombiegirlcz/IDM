package vdl;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.transaction_list.impl.ui.list.screen.TransactionsLinearLayoutManager;
import com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.TransactionsScreen;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccount;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$Step;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import fdl.x2;
import fdl.y2;
import ip0.f7;
import ip0.g7;
import ip0.nb0;
import ip0.pb0;
import ip0.q10;
import ip0.t10;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import wff.n;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f287935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f287936b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f287935a = i;
        this.f287936b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        veh.f state;
        Object next2;
        boolean z;
        int i = this.f287935a;
        int i2 = 5;
        int i3 = 7;
        boolean z3 = false;
        int i5 = 2;
        int i6 = 1;
        ArrayList arrayList = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = this.f287936b;
        switch (i) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (wel.d) ((d) obj5).f287949b.get("INVEST_BUY_BLOCK");
            case 1:
                String portfolioId = (String) obj2;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                return (List) ((f) obj5).f287964b.get(f.a(portfolioId));
            case 2:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (List) ((h) obj5).f287970a.get("INDEXES_CACHE_KEY");
            case 3:
                y2 it10 = (y2) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                String ref2 = ((l) obj5).f287992a;
                Object obj6 = tcl.g.f269882a;
                Intrinsics.checkNotNullParameter(it10, "<this>");
                Intrinsics.checkNotNullParameter(ref2, "ref");
                List recommendations = it10.getRecommendations();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(recommendations, 10));
                Iterator it11 = recommendations.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(tcl.g.a((x2) it11.next()));
                }
                return new jel.i1(ref2, arrayList2);
            case 4:
                r rVar = (r) obj5;
                Set instruments = (Set) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                Set<nel.n> set = instruments;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(set, 10));
                Iterator it12 = set.iterator();
                while (it12.hasNext()) {
                    arrayList3.add(((nel.n) it12.next()).f214596b);
                }
                ArrayList arrayList4 = new ArrayList();
                for (nel.n nVar : set) {
                    afl.a aVar = (afl.a) rVar.e.get(r.b(nVar));
                    Pair pair = aVar == null ? null : new Pair(nVar.f214596b, aVar);
                    if (pair != null) {
                        arrayList4.add(pair);
                    }
                }
                Map mapT = zhm.r0.t(arrayList4);
                if (mapT.keySet().containsAll(arrayList3)) {
                    Collection collectionValues = mapT.values();
                    arrayList = new ArrayList(zhm.w.t(collectionValues, 10));
                    Iterator it13 = collectionValues.iterator();
                    while (it13.hasNext()) {
                        arrayList.add((afl.a) it13.next());
                    }
                }
                return arrayList;
            case 5:
                x xVar = (x) obj5;
                List instruments2 = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments2, "instruments");
                if (!(xVar instanceof w)) {
                    if (!(xVar instanceof v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Iterator it14 = instruments2.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            Object next3 = it14.next();
                            if (Intrinsics.f(((nel.n) next3).f214596b, ((v) xVar).f288051a)) {
                                obj4 = next3;
                            }
                        }
                    }
                    return (nel.n) obj4;
                }
                List list = instruments2;
                Iterator it15 = list.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next = it15.next();
                        if (Intrinsics.f(((nel.n) next).e, ((w) xVar).f288054a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                nel.n nVar2 = (nel.n) next;
                if (nVar2 != null) {
                    return nVar2;
                }
                Iterator it16 = list.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        Object next4 = it16.next();
                        if (((nel.n) next4).f214604p.contains(((w) xVar).f288054a)) {
                            obj3 = next4;
                        }
                    }
                }
                return (nel.n) obj3;
            case 6:
                hdl.e it17 = (hdl.e) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return hx7.i.P(it17, ((n0) obj5).f288004a);
            case 7:
                z0 params = (z0) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (eel.a) ((d1) obj5).d.get(d1.d(params));
            case 8:
                j1 params2 = (j1) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (eel.e) ((l1) obj5).e.get(l1.c(params2));
            case 9:
                nw5.a aVar2 = ((vea.l) obj5).f288209j;
                LinkedHashMap currenciesMap = (LinkedHashMap) obj2;
                Intrinsics.checkNotNullParameter(currenciesMap, "currenciesMap");
                Set setKeySet = currenciesMap.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                ArrayList arrayList5 = new ArrayList();
                for (Object obj7 : setKeySet) {
                    if (cp5.d.z((xi0.b) obj7)) {
                        arrayList5.add(obj7);
                    }
                }
                return arrayList5.isEmpty() ? efm.r.just(new vea.g(currenciesMap, zhm.r0.g(), zhm.r0.g())) : m70.a.g(nim.a.w(kli.a.i(zi0.c.j(currenciesMap), zi0.c.o(aVar2.a(arrayList5, n9l.b.SEC_3)), zi0.c.o(aVar2.b(arrayList5, tzg.j.ONE_DAY))), new vch.h0(29)), null, new vea.b(i6), 1);
            case 10:
                return ved.g.a((ved.g) obj2, (tfd.b) obj5, null, 13);
            case 11:
                qel.b bVar = (qel.b) obj5;
                veh.e updateStateAndOptionsChainParams = (veh.e) obj2;
                Intrinsics.checkNotNullParameter(updateStateAndOptionsChainParams, "$this$updateStateAndOptionsChainParams");
                Data data = updateStateAndOptionsChainParams.f288321a;
                if (data == null || (state = (veh.f) data.getContent()) == null) {
                    return updateStateAndOptionsChainParams;
                }
                Data data2 = updateStateAndOptionsChainParams.f288321a;
                Intrinsics.checkNotNullParameter(state, "state");
                if (state.f288326c != bVar) {
                    state = veh.f.a(state, null, bVar, 3);
                }
                return veh.e.a(updateStateAndOptionsChainParams, Data.copy$default(data2, state, null, false, 6, null), null, null, 6);
            case 12:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return veh.n.a((InstrumentTicker) obj5);
            case 13:
                vf0.m mVar = (vf0.m) obj5;
                long j2 = (long) (mVar.f * mVar.f288459b);
                long j3 = mVar.f288458a;
                if (j2 > j3) {
                    j2 = j3;
                }
                mVar.f = j2;
                return Unit.f186387a;
            case 14:
                com.revolut.feature.transaction.troubleshooter.impl.ui.flow.a aVar3 = (com.revolut.feature.transaction.troubleshooter.impl.ui.flow.a) obj5;
                wff.n output = (wff.n) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof n.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3.I2();
                return Unit.f186387a;
            case 15:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list2 = (List) pair2.f186385a;
                hfg.e eVar = (hfg.e) pair2.f186386b;
                ((vfg.e) obj5).getClass();
                Iterator it19 = list2.iterator();
                while (true) {
                    if (it19.hasNext()) {
                        next2 = it19.next();
                        if (Intrinsics.f(((TravelMilesAccountV2) next2).f94087c.f94109a, eVar.f151827j.f94103a)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                TravelMilesAccountV2 travelMilesAccountV2 = (TravelMilesAccountV2) next2;
                return travelMilesAccountV2 != null ? hfg.e.a(eVar, TravelMilesProvider.a(eVar.f151827j, new TravelMilesAccount(travelMilesAccountV2.f94085a, travelMilesAccountV2.f94086b, travelMilesAccountV2.d)), null, 15871) : eVar;
            case 16:
                lk0.g it20 = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                pfm.h hVar = new pfm.h(new v3e.t((vfg.k) obj5, it20, i3), i5);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 17:
                vfg.i iVar = (vfg.i) obj5;
                Data data3 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                hfg.p pVar = (hfg.p) data3.getContent();
                List list3 = pVar != null ? pVar.f151880a : null;
                if (list3 == null) {
                    list3 = zhm.f0.f322471a;
                }
                return new lk0.e(list3, iVar, data3.getLoading(), null, data3.getError(), 8);
            case 18:
                lk0.g it21 = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                pfm.h hVar2 = new pfm.h(new v3e.t((vfg.o) obj5, it21, 8), i5);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            case 19:
                lk0.g pagedData = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                return new pfm.h(new v3e.t((vfg.t) obj5, pagedData, 9), i5);
            case 20:
                gfg.b bVar2 = (gfg.b) obj5;
                Data it22 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                List list4 = (List) it22.getContent();
                if (list4 == null) {
                    list4 = zhm.f0.f322471a;
                }
                return new lk0.e(list4, bVar2, it22.getLoading(), null, it22.getError(), 8);
            case 21:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                ((vfh.l) obj5).L2(new nii.y0(null, new nii.z(new TextLocalisedClause(R$string.trading_order_error_create, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                return Boolean.TRUE;
            case 22:
                ufm.d dVar = (ufm.d) obj5;
                String currentPlanId = (String) obj2;
                Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                zga.m mVar2 = (zga.m) dVar.f279875a;
                Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(nim.a.v(((x4l.c) mVar2.f322106c.getValue()).b(currentPlanId, loadingStrategy), new zg6.c(i5)), new v73.c(dVar, currentPlanId, 22));
            case 23:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                ((vgc.p) obj5).getClass();
                nkm.d0 d0VarX = nkm.y.x(nkm.y.z(nkm.y.n(zhm.d0.Q(transactions), new vga.g(4)), new vga.g(i2)), new vga.g(i5));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it23 = d0VarX.f216835a.iterator();
                while (it23.hasNext()) {
                    Pair pair3 = (Pair) d0VarX.f216836b.invoke(it23.next());
                    String str = (String) pair3.f186385a;
                    Object objO = linkedHashMap.get(str);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str);
                    }
                    ((List) objO).add((String) pair3.f186386b);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zhm.q0.b(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), zhm.d0.i1((List) entry.getValue()));
                }
                return linkedHashMap2;
            case 24:
                PersistedBackground persistedBackground = (PersistedBackground) obj2;
                Intrinsics.checkNotNullParameter(persistedBackground, "persistedBackground");
                return vge.x.d((ProductAccount.ValueItem) obj5, persistedBackground);
            case 25:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                ((tul.b) obj5).getClass();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj8 : accounts) {
                    if (((ProductAccount) obj8) instanceof ProductAccount.ValueItem.Discover) {
                        z = !z3;
                        if (!z3) {
                            z3 = true;
                        }
                    } else {
                        z = true;
                    }
                    if (z) {
                        arrayList6.add(obj8);
                    }
                }
                return arrayList6;
            case 26:
                Context context = (Context) obj2;
                KProperty[] kPropertyArr = TransactionsScreen.Z;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                TransactionsLinearLayoutManager transactionsLinearLayoutManager = new TransactionsLinearLayoutManager(context, 1, false);
                transactionsLinearLayoutManager.f91921a = new v73.c((TransactionsScreen) obj5, transactionsLinearLayoutManager, 26);
                return transactionsLinearLayoutManager;
            case 27:
                return vgf.r.a((vgf.r) obj2, new Data(null, null, true, 3, null), null, null, null, zhm.r0.g(), null, ((com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) obj5).J2(null), false, false, false, null, null, 3978);
            case 28:
                vgg.c0 c0Var = (vgg.c0) obj5;
                Function0 it24 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                kotlin.jvm.internal.s0 s0Var = new kotlin.jvm.internal.s0(7);
                g7 g7Var = new g7(new f7());
                yp0.b.l(g7Var, 0, 0, 0, 0, null, false, 63);
                s0Var.a(g7Var);
                aim.e eVarB = zhm.u.b();
                eVarB.add(new ListSubheaderDelegate.Model("HOW_IT_WORKS_SUB_HEADER_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278));
                IntRange intRange = new IntRange(0, 3, 1);
                ArrayList arrayList7 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it25 = intRange.iterator();
                while (it25.f289625c) {
                    arrayList7.add(nb0.b(pb0.Companion, a0.d.n("HOW_IT_WORKS_LOADING_ITEM_LIST_ID", it25.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList7);
                s0Var.b(zhm.u.a(eVarB).toArray(new koi.j[0]));
                s0Var.b(c0Var.f289158b.b().toArray(new koi.j[0]));
                s0Var.a(new ListSubheaderDelegate.Model("EXTRA_REDEEM_OPTIONS_SUB_HEADER_LIST_ID", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, true, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65278));
                s0Var.a(new pb0("EXTRA_REDEEM_OPTIONS_LOADING_ITEM_LIST_ID1"));
                s0Var.a(new pb0("EXTRA_REDEEM_OPTIONS_LOADING_ITEM_LIST_ID2"));
                s0Var.a(new t10("DESCRIPTION_LIST_ID", q10.f165912a));
                ArrayList arrayList8 = s0Var.f186433a;
                return new vgg.u(zhm.v.k(arrayList8.toArray(new koi.j[arrayList8.size()])), vgg.m.f289168a, false, new TextLocalisedClause(com.revolut.feature.travel.miles.api.R$string.miles_airline_details_footer_action, null, null, 14));
            default:
                FamilyPlanFlow familyPlanFlow = (FamilyPlanFlow) obj5;
                FamilyPlanFlowContract$Step it26 = (FamilyPlanFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                View viewD2 = familyPlanFlow.D2();
                Context context2 = familyPlanFlow.D2().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                viewD2.setBackgroundColor(kli.a.s(R$attr.uikit_windowBackground, context2));
                return Unit.f186387a;
        }
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f287935a = i;
        this.f287936b = obj3;
    }
}
