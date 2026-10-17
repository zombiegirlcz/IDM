package mhd;

import bjl.s0;
import bjl.t0;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$State;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.TripsFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.TripsFlowContract$Step;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.sso.api.models.BankIdEvidence;
import com.revolut.sso.api.models.DAPEvidence;
import com.revolut.sso.api.models.UaePassEvidence;
import com.revolut.sso.impl.domain.models.AuthAction;
import ggk.u0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mod.b;
import mod.f;
import n4d.r0;
import rp0.k1;
import vkm.j2;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f205523w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f205524x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f205523w = obj2;
        this.f205524x = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v57, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p0((q0) this.f205523w, (List) this.f205524x, continuation, 0);
            case 1:
                return new p0((com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b) this.f205523w, (oi4.g) this.f205524x, continuation, 1);
            case 2:
                return new p0((mjf.b0) this.f205523w, (String) this.f205524x, continuation, 2);
            case 3:
                return new p0((mk0.o) this.f205523w, (sk0.b) this.f205524x, continuation, 3);
            case 4:
                return new p0((mkb.c) this.f205523w, (String) this.f205524x, continuation, 4);
            case 5:
                return new p0((tji.f) this.f205523w, (Function1) this.f205524x, continuation, 5);
            case 6:
                return new p0((com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b) this.f205523w, (lha.h) this.f205524x, continuation, 6);
            case 7:
                return new p0((com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b) this.f205523w, (lha.k) this.f205524x, continuation, 7);
            case 8:
                return new p0((mlk.h0) this.f205523w, (u0) this.f205524x, continuation, 8);
            case 9:
                return new p0((com.revolut.sso.impl.ui.combined_authentication.flow.c) this.f205523w, (BankIdEvidence) this.f205524x, continuation, 9);
            case 10:
                return new p0((com.revolut.sso.impl.ui.combined_authentication.flow.c) this.f205523w, (String) this.f205524x, continuation, 10);
            case 11:
                p0 p0Var = new p0((com.revolut.sso.impl.ui.combined_authentication.flow.c) this.f205524x, continuation, 11);
                p0Var.f205523w = obj2;
                return p0Var;
            case 12:
                return new p0((mm1.c) this.f205523w, (mm1.d) this.f205524x, continuation, 12);
            case 13:
                return new p0((mm5.o) this.f205523w, (List) this.f205524x, continuation, 13);
            case 14:
                return new p0((com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b) this.f205523w, (nm6.h) this.f205524x, continuation, 14);
            case 15:
                return new p0((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.f205523w, (cp7.f) this.f205524x, continuation, 15);
            case 16:
                return new p0((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.f205523w, (rr7.b) this.f205524x, continuation, 16);
            case 17:
                return new p0((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.f205523w, (String) this.f205524x, continuation, 17);
            case 18:
                return new p0((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.f205523w, (dj0.d) this.f205524x, continuation, 18);
            case 19:
                return new p0((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.f205523w, (ApplicationForm) this.f205524x, continuation, 19);
            case 20:
                return new p0((mmc.d) this.f205523w, (yki.l) this.f205524x, continuation, 20);
            case 21:
                p0 p0Var2 = new p0((mmd.b) this.f205524x, continuation, 21);
                p0Var2.f205523w = obj2;
                return p0Var2;
            case 22:
                p0 p0Var3 = new p0((com.revolut.sso.impl.ui.manual_review.b) this.f205524x, continuation, 22);
                p0Var3.f205523w = obj2;
                return p0Var3;
            case 23:
                return new p0((mo2.f) this.f205523w, (String) this.f205524x, continuation, 23);
            case 24:
                return new p0((mod.l) this.f205523w, (Trip) this.f205524x, continuation, 24);
            case 25:
                return new p0((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) this.f205523w, (god.b) this.f205524x, continuation, 25);
            case 26:
                return new p0((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) this.f205523w, (Trip) this.f205524x, continuation, 26);
            case 27:
                return new p0((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) this.f205523w, (aii.m) this.f205524x, continuation, 27);
            case 28:
                return new p0((mp6.n) this.f205523w, (Function1) this.f205524x, continuation);
            default:
                return new p0((com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a) this.f205523w, (mpd.b) this.f205524x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v35, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        Object objInvoke;
        Object objJ;
        Object objJ2;
        Object objS;
        Object objX;
        Object objP2;
        Object objP22;
        int i = this.u;
        int i2 = 14;
        int i3 = 7;
        int i5 = 2;
        Continuation continuation = null;
        Object obj3 = this.f205524x;
        switch (i) {
            case 0:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    q0 q0Var = (q0) this.f205523w;
                    l3d.h0 h0Var = q0Var.f205527m;
                    String str = q0Var.f205526l.f86889a;
                    this.v = 1;
                    r0 r0Var = h0Var.f191909a;
                    List list = (List) obj3;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((WatchlistItem) it8.next()).f86902h);
                    }
                    mll.c0 c0Var = new mll.c0(r0Var, str, arrayList, null, 25);
                    skm.p0 p0Var = skm.p0.f264001a;
                    Object objJ3 = skm.e0.J(elm.f.f127540b, c0Var, this);
                    Object obj5 = fim.a.COROUTINE_SUSPENDED;
                    if (objJ3 != obj5) {
                        objJ3 = Unit.f186387a;
                    }
                    if (objJ3 != obj5) {
                        objJ3 = Unit.f186387a;
                    }
                    if (objJ3 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b) this.f205523w;
                    o0 o0Var = new o0(bVar, (oi4.g) obj3, continuation, i5);
                    this.v = 1;
                    if (bVar.p2(this, o0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    mhf.j jVar = (mhf.j) ((mjf.b0) this.f205523w).f.get();
                    Set setB = y0.b((String) obj3);
                    this.v = 1;
                    if (((mjf.k0) jVar).g(setB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                mk0.o oVar = (mk0.o) this.f205523w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    List listC = zhm.u.c((sk0.b) obj3);
                    boolean z = oVar.f206167g.get();
                    this.v = 1;
                    if (oVar.q(listC, z, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    ugc.a aVar5 = ((mkb.c) this.f205523w).f206213a;
                    this.v = 1;
                    Object objD = ((tjb.g) aVar5.f279998b).f.d((String) obj3, false, this);
                    if (objD != aVar4) {
                        objD = Unit.f186387a;
                    }
                    if (objD != aVar4) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                tji.f fVar = (tji.f) this.f205523w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                try {
                    if (i43 == 0) {
                        yhm.o.b(obj2);
                        oi0.d.I(fVar, true, false);
                        this.v = 1;
                        objInvoke = ((Function1) obj3).invoke(this);
                        if (objInvoke == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i43 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objInvoke = obj2;
                    }
                    oi0.d.I(fVar, false, false);
                    return objInvoke;
                } catch (Throwable th10) {
                    oi0.d.I(fVar, false, false);
                    throw th10;
                }
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b bVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b) this.f205523w;
                    mkk.l lVar = new mkk.l(bVar2, (lha.h) obj3, null);
                    this.v = 1;
                    if (bVar2.p2(this, lVar) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b bVar3 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b) this.f205523w;
                    mkk.r rVar = new mkk.r(bVar3, (lha.k) obj3, null);
                    this.v = 1;
                    if (bVar3.p2(this, rVar) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((mlk.h0) this.f205523w).C.g((u0) obj3, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.combined_authentication.flow.c.P2((com.revolut.sso.impl.ui.combined_authentication.flow.c) this.f205523w, (BankIdEvidence) obj3, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.sso.impl.ui.combined_authentication.flow.c cVar = (com.revolut.sso.impl.ui.combined_authentication.flow.c) this.f205523w;
                    UaePassEvidence uaePassEvidence = new UaePassEvidence((String) obj3);
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.combined_authentication.flow.c.P2(cVar, uaePassEvidence, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                com.revolut.sso.impl.ui.combined_authentication.flow.c cVar2 = (com.revolut.sso.impl.ui.combined_authentication.flow.c) obj3;
                t0 t0Var = (t0) this.f205523w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    if (t0Var instanceof bjl.r0) {
                        BankIdEvidence bankIdEvidence = new BankIdEvidence(((bjl.r0) t0Var).f16185a);
                        this.f205523w = null;
                        this.v = 1;
                        if (com.revolut.sso.impl.ui.combined_authentication.flow.c.P2(cVar2, bankIdEvidence, this) == aVar12) {
                            return aVar12;
                        }
                    } else {
                        if (!(t0Var instanceof s0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        DAPEvidence dAPEvidence = new DAPEvidence(((s0) t0Var).f16188a);
                        this.f205523w = null;
                        this.v = 2;
                        if (com.revolut.sso.impl.ui.combined_authentication.flow.c.P2(cVar2, dAPEvidence, this) == aVar12) {
                            return aVar12;
                        }
                    }
                } else {
                    if (i99 != 1 && i99 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                mm1.c cVar3 = (mm1.c) this.f205523w;
                mm1.d dVar = (mm1.d) obj3;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                try {
                    if (i100 == 0) {
                        yhm.o.b(obj2);
                        im1.a aVar14 = cVar3.f207125b;
                        BillerSearchNavigation$InputData billerSearchNavigation$InputData = cVar3.f207124a;
                        xo1.g gVar = billerSearchNavigation$InputData.f61154a;
                        String str2 = dVar.f207128b;
                        if (kotlin.text.d0.W(str2)) {
                            str2 = null;
                        }
                        cm1.b bVar4 = new cm1.b(gVar, str2, dVar.f207127a, billerSearchNavigation$InputData.f61155b);
                        this.v = 1;
                        fjd.g0 g0Var = new fjd.g0(aVar14.f162277a, bVar4, continuation, 5);
                        skm.p0 p0Var2 = skm.p0.f264001a;
                        objJ = skm.e0.J(elm.f.f127540b, g0Var, this);
                        if (objJ == aVar13) {
                            return aVar13;
                        }
                    } else {
                        if (i100 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objJ = obj2;
                    }
                    return zi0.c.P(objJ, false, null, 3);
                } catch (Exception e) {
                    return zi0.c.O(e);
                }
            case 13:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    mm5.o oVar2 = (mm5.o) this.f205523w;
                    mm5.n nVar = new mm5.n((List) obj3, oVar2, null);
                    this.v = 1;
                    if (zh9.u0.b0(oVar2.X(), "ACTION_BUTTON_TAG", nVar, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b bVar5 = (com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b) this.f205523w;
                    nm6.g gVar2 = (nm6.g) ((nm6.h) obj3);
                    String str3 = gVar2.f217188a;
                    String str4 = gVar2.f217189b;
                    this.v = 1;
                    if (bVar5.J2(str3, str4, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                cp7.f fVar2 = (cp7.f) obj3;
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j jVar2 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.f205523w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    ApplicationForm applicationForm = ((cp7.g) fVar2).f107897a;
                    this.v = 1;
                    if (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j.Q2(jVar2, applicationForm, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                jVar2.B2(true);
                jVar2.L2(CarOnboardingFlowContract$State.a((CarOnboardingFlowContract$State) jVar2.A2().f98429a, ((cp7.g) fVar2).f107897a, null, null, null, 14));
                return Unit.f186387a;
            case 16:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j jVar3 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.f205523w;
                    f9i.c cVar4 = ((rr7.b) obj3).f256733a;
                    this.v = 1;
                    if (jVar3.G1(cVar4, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j jVar4 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.f205523w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    jVar4.X1(vl7.a.c(new TextLocalisedClause(R$string.car_insurance_purchase_loading_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_purchase_loading_description, null, null, 14)));
                    ll7.v vVar = jVar4.v;
                    this.v = 1;
                    ll7.e0 e0Var = (ll7.e0) vVar;
                    e0Var.getClass();
                    ll7.z zVar = new ll7.z(e0Var, (String) obj3, null);
                    skm.p0 p0Var3 = skm.p0.f264001a;
                    objJ2 = skm.e0.J(elm.f.f127540b, zVar, this);
                    if (objJ2 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ2 = obj2;
                }
                return yji.l.a1(jVar4, jVar4.X1(vl7.a.e(new TextLocalisedClause(R$string.car_insurance_policy_purchase_success_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_policy_purchase_success_description, null, null, 14), new TextLocalisedClause(R$string.car_insurance_common_continue, null, null, 14), 8)), null, null, new com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.c(jVar4, (String) objJ2, null), 3);
            case 18:
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j jVar5 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.f205523w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objS = hx7.i.s(jVar5.f75435x, (dj0.d) obj3, this);
                    if (objS == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objS = obj2;
                }
                dj0.d dVar2 = (dj0.d) objS;
                return yji.l.a1(jVar5, jVar5.X1(vl7.a.b(dVar2, new Integer(R$string.car_insurance_error_insufficient_funds_description_you))), null, null, new lhk.a0(jVar5, dVar2, continuation, 11), 3);
            case 19:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.f205523w).T2((ApplicationForm) obj3, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                mmc.d dVar3 = (mmc.d) this.f205523w;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objX = vkm.q.x(mo3.a.g(glc.a.a(dVar3.f207193q, dVar3.o.f207188a), null, new mh1.e(20), 1), this);
                    if (objX == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i108 != 1) {
                        if (i108 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        oki.h.D2((yki.l) obj3);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objX = obj2;
                }
                a3b.i iVar = new a3b.i(dVar3, (RoboPortfolioInfo) objX, i2);
                l40.j jVar6 = new l40.j(dVar3, continuation, 29);
                this.v = 2;
                if (n14.k.V(dVar3, null, null, iVar, jVar6, this, 3) == aVar22) {
                    return aVar22;
                }
                oki.h.D2((yki.l) obj3);
                return Unit.f186387a;
            case 21:
                List list2 = (List) this.f205523w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xld.d dVar4 = ((mmd.b) obj3).f207203m;
                this.f205523w = null;
                this.v = 1;
                List listA = ((lmd.e) dVar4).a(list2);
                return listA == aVar23 ? aVar23 : listA;
            case 22:
                String str5 = (String) this.f205523w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.sso.impl.ui.manual_review.b bVar6 = (com.revolut.sso.impl.ui.manual_review.b) obj3;
                AuthAction authAction = bVar6.o.f106573a;
                this.f205523w = null;
                this.v = 1;
                Object objI2 = com.revolut.sso.impl.ui.manual_review.b.I2(bVar6, authAction, str5, this);
                return objI2 == aVar24 ? aVar24 : objI2;
            case 23:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar26 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(((mo2.f) this.f205523w).o, (String) obj3, aVar26, null, this, 4);
                return objX1 == aVar25 ? aVar25 : objX1;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                j2 j2Var = ((mod.l) this.f205523w).f207623b.f227093a;
                mkk.q qVar = new mkk.q((Trip) obj3, continuation, i3);
                this.v = 1;
                Object objA = vkm.q.A(j2Var, qVar, this);
                return objA == aVar27 ? aVar27 : objA;
            case 25:
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar28 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) this.f205523w;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    o0 o0Var2 = new o0(aVar28, (god.b) obj3, continuation, 6);
                    this.v = 1;
                    objP2 = aVar28.p2(this, o0Var2);
                    if (objP2 == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i113 != 1) {
                        if (i113 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objP2 = obj2;
                }
                mod.b bVar7 = (mod.b) objP2;
                if (bVar7 instanceof mod.c) {
                    yki.a aVar30 = aVar28.f87630r;
                    TripsFlowContract$InputData tripsFlowContract$InputData = aVar28.f87629q;
                    if (tripsFlowContract$InputData instanceof TripsFlowContract$InputData.List) {
                        aVar30.e(true);
                    } else {
                        if (!(tripsFlowContract$InputData instanceof TripsFlowContract$InputData.AddTrip)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.t2(aVar28, aVar30, new TripsFlowContract$Step.List(null), false, null, false, 12);
                    }
                    ((k1) aVar28.f87628p).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "trip_success", new TextLocalisedQuantityClause(R$plurals.trips_add_trip_sheet_multi_success, Integer.valueOf(((mod.c) bVar7).f207607a), (List) null, (Style) null, 28), null, null, null, 60));
                } else {
                    if (!(bVar7 instanceof b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i114 = com.revolut.feature.spending_analytics.api.R$string.trips_add_trip_error_title;
                    this.v = 2;
                    if (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a.I2(aVar28, i114, this) == aVar29) {
                        return aVar29;
                    }
                }
                return Unit.f186387a;
            case 26:
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar31 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) this.f205523w;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    o0 o0Var3 = new o0(aVar31, (Trip) obj3, continuation, i3);
                    this.v = 1;
                    objP22 = aVar31.p2(this, o0Var3);
                    if (objP22 == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i115 != 1) {
                        if (i115 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objP22 = obj2;
                }
                mod.f fVar3 = (mod.f) objP22;
                if (fVar3 instanceof f.b) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a.J2(aVar31, com.revolut.feature.spending_analytics.api.R$string.trips_remove_trip_sheet_success);
                } else {
                    if (!(fVar3 instanceof f.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i116 = com.revolut.feature.spending_analytics.api.R$string.trips_remove_trip_error_title;
                    this.v = 2;
                    if (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a.I2(aVar31, i116, this) == aVar32) {
                        return aVar32;
                    }
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar34 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) this.f205523w;
                    int i118 = ((mod.q) ((aii.m) obj3)).f207632b;
                    this.v = 1;
                    if (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a.I2(aVar34, i118, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 != 0) {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                mp6.n nVar2 = (mp6.n) this.f205523w;
                boe.k kVar = new boe.k(17, null, (gim.i) obj3);
                this.v = 1;
                Object objB = pu7.a.B(nVar2.e, "RATE_TASK_ID", kVar, this);
                return objB == aVar35 ? aVar35 : objB;
            default:
                com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a aVar36 = (com.revolut.feature.spending_analytics.impl.ui.rev10.custom_period.select.a) this.f205523w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                try {
                    if (i120 == 0) {
                        yhm.o.b(obj2);
                        kge.d dVar5 = aVar36.f87683q;
                        String str6 = aVar36.o.f;
                        mpd.b bVar8 = (mpd.b) obj3;
                        LocalDate localDate = bVar8.f207788a;
                        if (localDate == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        LocalDate localDate2 = bVar8.f207789b;
                        if (localDate2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = new AnalyticsSpendingPeriod$Interval(localDate, localDate2);
                        lzi.i iVar2 = lzi.i.CUSTOM;
                        this.v = 1;
                        if (dVar5.B(str6, analyticsSpendingPeriod$Interval, iVar2, this) == aVar37) {
                            return aVar37;
                        }
                    } else {
                        if (i120 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    aVar36.B2();
                    return Unit.f186387a;
                } catch (Exception e2) {
                    aVar36.H2(aVar36.f87685s, new mlk.a0(22));
                    throw e2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f205524x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p0(mp6.n nVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 28;
        this.f205523w = nVar;
        this.f205524x = (gim.i) function1;
    }
}
