package raf;

import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.give_consent.GiveConsentConfiguration;
import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimDetails;
import com.revolut.feature.insurance.api.models.cfac.CFACClaimDetailsExpense;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.revolutpay.order_tracking.models.delivery.Delivery;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.models.NonProductAccountFilter;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowContract$State;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.kompot.common.flow.navigation.NavigationFlow;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import et6.h1;
import hha.s;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rg4.t;
import rg4.x;
import rk7.g;
import skm.p0;
import tb1.a;
import til.r;
import tof.i7;
import tof.s9;
import vkm.j2;
import z0h.p1;
import z0h.t1;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f252844b;

    public /* synthetic */ o(Object obj2, int i) {
        this.f252843a = i;
        this.f252844b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        int i2;
        int i3 = this.f252843a;
        int i5 = 26;
        int i6 = 1;
        int i21 = 0;
        Continuation continuation = null;
        Object obj3 = this.f252844b;
        switch (i3) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (List) ((q) obj3).f252847b.getValue();
            case 1:
                EmailFlowOutputData emailData = (EmailFlowOutputData) obj3;
                EmailFlowContract$State update = (EmailFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                Intrinsics.checkNotNullParameter(emailData, "emailData");
                return new EmailFlowContract$State(emailData);
            case 2:
                rb6.f updateState = (rb6.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Object obj4 = ((AttributeSelectorSmallDelegate.Model) obj3).f51674g;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.money.Money");
                return rb6.f.a(updateState, null, null, (dj0.d) obj4, 7);
            case 3:
                rbc.g update2 = (rbc.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Delivery delivery = ((zac.i) ((zac.j) obj3)).f320653a;
                update2.getClass();
                Intrinsics.checkNotNullParameter(delivery, "delivery");
                return new rbc.g(delivery, true);
            case 4:
                rbh.c updateState2 = (rbh.c) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                Data dataP = zi0.c.P(((pch.d) obj3).f234911a, false, null, 3);
                updateState2.getClass();
                return new rbh.c(dataP);
            case 5:
                rc1.b bVar = (rc1.b) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    bVar.v2(a.C1506a.f269432a);
                } else {
                    bVar.l2(new rbh.k(bVar, continuation, i6), new yi5.b(i5));
                }
                return Unit.f186387a;
            case 6:
                t1 wealthDisclaimersData = (t1) obj2;
                Intrinsics.checkNotNullParameter(wealthDisclaimersData, "wealthDisclaimersData");
                y yVar = ((com.revolut.feature.wealth.impl.ui.screens.popularassets.a) obj3).v;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                return new p1(u.c(d8l.d.q(((rch.e) j2Var.getValue()).f253272b, xzg.a.CFD) ? new z0h.f(wealthDisclaimersData.f318563a, wealthDisclaimersData.f318564b) : d8l.d.q(((rch.e) j2Var2.getValue()).f253272b, xzg.a.ETF) ? new z0h.g(wealthDisclaimersData.f318563a, wealthDisclaimersData.f318564b) : d8l.d.q(((rch.e) j2Var2.getValue()).f253272b, xzg.a.BOND) ? new z0h.e(wealthDisclaimersData.f318563a, wealthDisclaimersData.f318564b) : new z0h.i(wealthDisclaimersData.f318563a, wealthDisclaimersData.f318564b)), wealthDisclaimersData.f318564b);
            case 7:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((rch.q) obj3).a();
            case 8:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ((rd3.j) obj3).e.getClass();
                return od3.b.b();
            case 9:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                ((rd3.o) obj3).e.getClass();
                return od3.b.b();
            case 10:
                com.revolut.feature_rev_points_pocket_impl.ui.flow.a aVar = (com.revolut.feature_rev_points_pocket_impl.ui.flow.a) obj3;
                xdi.l outputData = (xdi.l) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof xdi.k) {
                    xdi.k kVar = (xdi.k) outputData;
                    RevPointsPocketInfo revPointsPocketInfo = kVar.f304459a;
                    aVar.C1(com.revolut.feature_rev_points_pocket_impl.ui.flow.a.J2(revPointsPocketInfo.f97784a, new TabAccountsInitialPayload.Action(vhi.c.c(com.revolut.feature_rev_points_pocket_impl.ui.flow.a.I2(Long.valueOf(pyd.c.H(kVar.f304460b.f97781c, revPointsPocketInfo.e).f115082a)), yhi.b.SOLID, null, false, 12))));
                } else if (outputData instanceof xdi.j) {
                    aVar.C1(com.revolut.feature_rev_points_pocket_impl.ui.flow.a.J2(((xdi.j) outputData).f304458a.f97784a, null));
                } else {
                    if (!(outputData instanceof xdi.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xdi.i iVar = (xdi.i) outputData;
                    aVar.C1(com.revolut.feature_rev_points_pocket_impl.ui.flow.a.I2(Long.valueOf(pyd.c.H(iVar.f304457b.f97781c, iVar.f304456a.e).f115082a)));
                }
                return Unit.f186387a;
            case 11:
                rdj.h hVar = (rdj.h) obj3;
                ncj.c cVar = (ncj.c) obj2;
                Intrinsics.checkNotNullParameter(cVar, "<destruct>");
                ncj.b bVar2 = cVar.f214224a;
                qta.c cVar2 = cVar.f214225b;
                if (bVar2.f214223c.isEmpty()) {
                    return null;
                }
                ncj.c cVar3 = new ncj.c(bVar2, cVar2);
                hVar.getClass();
                List list = bVar2.f214223c;
                if (list.isEmpty()) {
                    return new rdj.e(cVar3, 0);
                }
                LocalDate localDateE = ((l80.f) hVar.f253470b).e();
                if (localDateE.isBefore(((ncj.a) d0.b0(list)).d)) {
                    return new rdj.e(cVar3, 0);
                }
                if (ChronoUnit.DAYS.between(bVar2.f214222b.atZone(ZoneOffset.UTC).toLocalDate(), localDateE) > 30) {
                    return new rdj.e(ncj.c.a(cVar3, ncj.b.a(bVar2, f0.f322471a)), list.size());
                }
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (Object obj5 : list) {
                    if (z) {
                        arrayList.add(obj5);
                    } else {
                        ncj.a aVar2 = (ncj.a) obj5;
                        if (!localDateE.isEqual(aVar2.d) && !localDateE.isAfter(aVar2.d)) {
                            arrayList.add(obj5);
                            z = true;
                        }
                    }
                }
                int size = list.size() - arrayList.size();
                return size == 0 ? new rdj.e(cVar3, 0) : new rdj.e(ncj.c.a(cVar3, ncj.b.a(cVar3.f214224a, arrayList)), size);
            case 12:
                com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a aVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a) obj3;
                se4.i result = (se4.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, se4.i.f262105a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3.l2(new re4.i(aVar3, continuation, i21), new yi5.b(i5));
                return Unit.f186387a;
            case 13:
                rea.m mVar = (rea.m) obj3;
                io3.d createdPocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(createdPocket, "createdPocket");
                pfm.a aVarI0 = mVar.f253579b.i0(AccountId.Personal.f51414a);
                h1 h1Var = mVar.f253580c;
                lr6.j selection = new lr6.j(createdPocket.f163145a);
                Intrinsics.checkNotNullParameter(selection, "selection");
                return aVarI0.e(pd.b.n(p0.f264003c, new esa.i(h1Var, selection, continuation, 4))).f(efm.d0.m(createdPocket.f163145a));
            case 14:
                ved.h it12 = (ved.h) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                ((com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alert_details.a) obj3).I2();
                return Unit.f186387a;
            case 15:
                hha.d it13 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                ((rf3.e) obj3).getClass();
                return s.o(it13) ? v30.s.PRIVATE : s.p(it13) ? v30.s.ULTRA : s.j(it13) ? v30.s.METAL : s.n(it13) ? v30.s.PREMIUM : v30.s.STANDARD;
            case 16:
                do3.n it14 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new rfm.o(new pu9.a(it14, (rf3.l) obj3, 15));
            case 17:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) ((rg3.o) obj3).f254014b.get("CHALLENGES_KEY");
            case 18:
                return rg4.n.a((rg4.n) obj2, new Data((PreApplicationChecksScenario) obj3, null, false, 6, null), false, 2);
            case 19:
                Function0 getLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getLoadingItems, "getLoadingItems");
                return new t((List) getLoadingItems.invoke(), ((x) obj3).d(null), null);
            case 20:
                rgf.f fVar = (rgf.f) obj2;
                return rgf.f.a(fVar, null, null, null, null, null, null, null, r0.q(fVar.f254153h, new Pair(NonProductAccountFilter.Crypto.f89715a, ((PocketBalancesWithSum) obj3).f71385b)), null, 895);
            case 21:
                d67.u it15 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                oki.h.D2(((com.revolut.retail.feature.esim.impl.ui.flows.share_qr_code.b) obj3).f100880s);
                return Unit.f186387a;
            case 22:
                rh8.a aVar4 = (rh8.a) obj3;
                vf0.h hVar2 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar2, "<destruct>");
                List list2 = (List) hVar2.f288433a;
                Collection collection = (Collection) hVar2.f288434b;
                lf8.c cVar4 = (lf8.c) hVar2.f288435c;
                List list3 = (List) hVar2.d;
                if (!cVar4.f194666a) {
                    return th8.a.DISABLED;
                }
                aVar4.getClass();
                Collection collection2 = collection;
                boolean z3 = collection2 instanceof Collection;
                if (z3 && collection2.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it16 = collection2.iterator();
                    i = 0;
                    while (it16.hasNext()) {
                        if (((JuniorBankingProfile) it16.next()).f77104l != ij8.h.CREATED && (i = i + 1) < 0) {
                            v.r();
                            throw null;
                        }
                    }
                }
                if (i >= uc0.b.m(list3)) {
                    return th8.a.MAX_TOTAL_ACCOUNT_LIMIT_REACHED;
                }
                List list4 = list2;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it17 = list4.iterator();
                    i2 = 0;
                    while (it17.hasNext()) {
                        if (((psg.a) it17.next()).d == psg.b.GUARDIAN && (i2 = i2 + 1) < 0) {
                            v.r();
                            throw null;
                        }
                    }
                }
                if (!z3 || !collection2.isEmpty()) {
                    Iterator it18 = collection2.iterator();
                    while (it18.hasNext()) {
                        if (((JuniorBankingProfile) it18.next()).f77104l == ij8.h.CREATED && (i21 = i21 + 1) < 0) {
                            v.r();
                            throw null;
                        }
                    }
                }
                return i2 - i21 >= uc0.b.l(list3) ? th8.a.MAX_GUARDIAN_ACCOUNT_LIMIT_REACHED : th8.a.AVAILABLE;
            case 23:
                rhj.l lVar = (rhj.l) obj3;
                List subscriptions = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                return ((jte.d) lVar.f254499p).c(EsimApi$Toggles.EsimGifting.f100175c) ? lVar.f254502s.W(subscriptions, hfj.a.SKIP_IF_NO_SUBSCRIPTIONS) : nim.a.v(lVar.f254501r.n(subscriptions, hfj.a.SKIP_IF_NO_SUBSCRIPTIONS), new rg3.d(20));
            case 24:
                GiveConsentConfiguration giveConsentConfiguration = (GiveConsentConfiguration) obj3;
                Intrinsics.h(giveConsentConfiguration);
                return ri4.e.a((ri4.e) obj2, null, giveConsentConfiguration, 1);
            case 25:
                NavigationFlow navigationFlow = (NavigationFlow) obj3;
                NavigationFlow.Step it19 = (NavigationFlow.Step) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                o6.a aVar5 = navigationFlow.P;
                zv0.a aVarD3 = navigationFlow.d3();
                if (aVarD3 != null) {
                    if (navigationFlow.k().b()) {
                        navigationFlow.D2().postDelayed(aVar5, 100L);
                    } else {
                        navigationFlow.D2().removeCallbacks(aVar5);
                        aVarD3.setNonCancelable(navigationFlow.O, false);
                    }
                }
                return Unit.f186387a;
            case 26:
                com.revolut.feature.credit.application.plugins.impl.ui.workflow.a aVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.workflow.a) obj3;
                r it20 = (r) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                if (it20 instanceof til.o) {
                    if (((til.o) it20).f271582a) {
                        c84.t.J2(aVar6, false, null, null, 7);
                    } else {
                        aVar6.K2(null);
                    }
                } else if (it20 instanceof til.q) {
                    aVar6.l2(new rbh.k(aVar6, continuation, 6), new yi5.b(i5));
                } else {
                    if (!(it20 instanceof til.n) && !(it20 instanceof til.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "CreditWorkflowModel", "Not supported workflow result " + it20, null, h0Var);
                    aVar6.K2(null);
                }
                return Unit.f186387a;
            case 27:
                rk7.l lVar2 = (rk7.l) obj3;
                CFACClaimDetails claimDetails = (CFACClaimDetails) obj2;
                Intrinsics.checkNotNullParameter(claimDetails, "claimDetails");
                ArrayList arrayList2 = claimDetails.f74945g;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it21 = arrayList2.iterator();
                while (it21.hasNext()) {
                    arrayList3.add(((CFACClaimDetailsExpense) it21.next()).f74946a.f74956a);
                }
                whf.b bVar3 = lVar2.f254764p;
                i7.c cVar5 = i7.Companion;
                i7[] i7VarArr = {new s9(d0.i1(arrayList3))};
                cVar5.getClass();
                efm.r rVarJust = efm.r.just(i7.c.a(i7VarArr));
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                return whf.b.a(bVar3, rVarJust, null, null, null, 14);
            case 28:
                Function0 it22 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                ((rk7.n) obj3).getClass();
                return g.a.f254759a;
            default:
                Unit it23 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return (il2.i) ((rl2.d) obj3).f254912b.get("KEY_RESTRICTIONS");
        }
    }
}
