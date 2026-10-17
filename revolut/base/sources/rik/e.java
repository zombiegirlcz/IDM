package rik;

import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.confirmation_code.data.OtpTask;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_amount.CreditCardInstalmentRepayChooseAmountScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.india.upi.flow.UpiTransferFlowContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking.TradeRevPointsAccountUnlinkingScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import efm.h0;
import ffk.c0;
import ft3.h1;
import gim.i;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import om4.r1;
import om4.y2;
import rlh.d0;
import rlh.j;
import rp9.m;
import rqc.h;
import rvc.n;
import s09.k;
import s8d.l;
import s8f.g;
import sbb.r;
import se4.o;
import skm.e0;
import skm.k0;
import skm.p0;
import srd.q;
import ss4.y;
import te0.w;
import tsk.t;
import vkm.j2;
import vkm.t0;
import vkm.z1;
import wli.x;
import yh5.d;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f254591w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f254591w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a) this.f254591w, continuation, 0);
            case 1:
                return new e((rje.d) this.f254591w, continuation, 1);
            case 2:
                return new e((com.revolut.feature.confirmation_code.ui.otp.a) this.f254591w, continuation, 2);
            case 3:
                return new e((j) this.f254591w, continuation, 3);
            case 4:
                return new e((com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a) this.f254591w, continuation, 4);
            case 5:
                return new e((m) this.f254591w, continuation, 5);
            case 6:
                return new e((com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) this.f254591w, continuation, 6);
            case 7:
                return new e((h) this.f254591w, continuation, 7);
            case 8:
                return new e((rsl.h) this.f254591w, continuation, 8);
            case 9:
                return new e((n) this.f254591w, continuation, 9);
            case 10:
                return new e((com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a) this.f254591w, continuation, 10);
            case 11:
                return new e((e) this.f254591w, continuation, 11);
            case 12:
                return new e((k) this.f254591w, continuation, 12);
            case 13:
                return new e((s2f.d) this.f254591w, continuation, 13);
            case 14:
                return new e((s38.n) this.f254591w, continuation, 14);
            case 15:
                return new e((s6b.m) this.f254591w, continuation, 15);
            case 16:
                return new e((l) this.f254591w, continuation, 16);
            case 17:
                return new e((g) this.f254591w, continuation, 17);
            case 18:
                return new e((s92.k) this.f254591w, continuation, 18);
            case 19:
                return new e((sai.k) this.f254591w, continuation, 19);
            case 20:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e) this.f254591w, continuation, 20);
            case 21:
                return new e((r) this.f254591w, continuation, 21);
            case 22:
                return new e((o) this.f254591w, continuation, 22);
            case 23:
                return new e((com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g) this.f254591w, continuation, 23);
            case 24:
                return new e((sjk.g) this.f254591w, continuation, 24);
            case 25:
                return new e((com.revolut.feature.backend_driven_limits.impl.v2.ui.list.d) this.f254591w, continuation, 25);
            case 26:
                return new e((snk.r) this.f254591w, continuation, 26);
            case 27:
                return new e((q) this.f254591w, continuation, 27);
            case 28:
                return new e((y) this.f254591w, continuation, 28);
            default:
                return new e((com.revolut.feature.apm.blik.impl.ui.terms_acceptance.c) this.f254591w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        Object objJ;
        h0 iVar;
        Object objX;
        Object objA2;
        Object objE3;
        Object objX1;
        int i = this.u;
        int i2 = 23;
        boolean z = false;
        int i3 = 3;
        int i5 = 2;
        Continuation continuation = null;
        Object obj3 = this.f254591w;
        int i6 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objI2 = com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a.I2((com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a) obj3, this);
                return objI2 == aVar ? aVar : objI2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    rje.d dVar = (rje.d) obj3;
                    vh5.a aVar3 = dVar.o;
                    rje.a aVar4 = new rje.a(dVar, null);
                    this.v = 1;
                    if (aVar3.Z2((3 & 1) != 0, d.a.f313774a, aVar4, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.confirmation_code.ui.otp.a aVar6 = (com.revolut.feature.confirmation_code.ui.otp.a) obj3;
                    pk3.a aVar7 = aVar6.f65964p;
                    ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData = aVar6.o;
                    OtpTask otpTask = eSignOtpScreenContract$InputData.f65952b;
                    h1 h1Var = eSignOtpScreenContract$InputData.k;
                    this.v = 1;
                    if (aVar7.a(otpTask, h1Var, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                j jVar = (j) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    nlh.b bVar = jVar.f255059p;
                    sih.b bVar2 = sih.b.STOCKS;
                    this.v = 1;
                    bVar.getClass();
                    objA = nlh.b.a(bVar2);
                    if (objA == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                return jVar.C1((KompotDestination) objA);
            case 4:
                com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a aVar9 = (com.revolut.feature.external_accounts.impl.ui.india.upi.flow.a) obj3;
                UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = aVar9.o;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    lg6.a aVar11 = new lg6.a(upiTransferFlowContract$InputData.f72934a, upiTransferFlowContract$InputData.d, upiTransferFlowContract$InputData.f72935b, upiTransferFlowContract$InputData.f72936c);
                    kg6.a aVar12 = aVar9.f72941q;
                    this.v = 1;
                    th6.h hVar = aVar12.f183920a;
                    hVar.getClass();
                    tgk.f fVar = new tgk.f(hVar, aVar11, continuation, i3);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, fVar, this);
                    if (objJ == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                lg6.b bVar3 = (lg6.b) objJ;
                aVar9.H2(aVar9.f72944t, new d0(bVar3, 5));
                aVar9.I2(bVar3.f, bVar3.f195079g, upiTransferFlowContract$InputData.d, upiTransferFlowContract$InputData.f72935b != null);
                return Unit.f186387a;
            case 5:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                m mVar = (m) obj3;
                xi0.b bVarA = com.revolut.feature.payments.bills_chooser.api.common.a.a(((rp9.a) mVar.t2()).f256290b);
                if (bVarA != null) {
                    iVar = efm.d0.m(bVarA);
                    Intrinsics.checkNotNullExpressionValue(iVar, "just(...)");
                } else {
                    xi0.b bVar4 = mVar.f256302p.f79188c;
                    if (bVar4 != null) {
                        iVar = efm.d0.m(bVar4);
                    } else {
                        sp9.b bVar5 = mVar.f256303q;
                        ufm.i iVarX = bVar5.e.x(AccountId.Personal.f51414a);
                        efm.d0 d0VarFirstOrError = zi0.c.J(((ik3.c) bVar5.f264908b).n()).firstOrError();
                        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                        iVar = new ufm.i(new ufm.i(w.H0(iVarX, zi0.c.t(d0VarFirstOrError)), new sp5.h(i5, new sl5.a(bVar5, 11)), 0), new sp5.h(i3, new soi.a(i5)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    }
                }
                this.v = 1;
                Object objB = nim.a.b(iVar, this);
                return objB == aVar13 ? aVar13 : objB;
            case 6:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar = (com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) obj3;
                y2 y2Var = cVar.f69184p;
                String str = cVar.o.f69172a;
                this.v = 1;
                dp4.e0 e0Var = y2Var.f226758a;
                e0Var.getClass();
                dlk.k kVar = new dlk.k(e0Var, str, continuation, 10);
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, kVar, this);
                return objJ2 == aVar14 ? aVar14 : objJ2;
            case 7:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    h hVar2 = (h) obj3;
                    bld.k kVar2 = new bld.k(hVar2, continuation, 4);
                    this.v = 1;
                    if (u0.b0(hVar2.X(), "CANCEL_SALARY_SWITCH_REQUEST_LOADING_TAG", kVar2, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                rsl.h hVar3 = (rsl.h) obj3;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG = mo3.a.g(new t0(hVar3.f257136w.B(new rsl.c(i5)), 1), null, new rnd.d0(i2), 1);
                    this.v = 1;
                    objX = vkm.q.x(bVarG, this);
                    if (objX == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objX = obj2;
                }
                return hVar3.A2(new AssetDetailsDestination(((nel.n) objX).f214596b, null, false, null, null, null, 62));
            case 9:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    n nVar = (n) obj3;
                    String str2 = nVar.o.f85672a;
                    if (str2 != null) {
                        this.v = 1;
                        if (n.J2(nVar, str2, this) == aVar17) {
                            return aVar17;
                        }
                    } else {
                        this.v = 2;
                        if (n.I2(nVar, this) == aVar17) {
                            return aVar17;
                        }
                    }
                } else {
                    if (i96 != 1 && i96 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a) obj3).M2(this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((e) obj3).invoke(this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                k kVar3 = (k) obj3;
                efm.d0 d0VarB = kVar3.f258916l.b(kVar3.f258918n.f78016a, u09.y.COMPLETED);
                this.v = 1;
                Object objB2 = nim.a.b(d0VarB, this);
                return objB2 == aVar20 ? aVar20 : objB2;
            case 13:
                s2f.d dVar2 = (s2f.d) obj3;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    t tVar = dVar2.f259306p;
                    TradeRevPointsAccountUnlinkingScreenContract$InputData tradeRevPointsAccountUnlinkingScreenContract$InputData = dVar2.o;
                    u2f.j jVar2 = tradeRevPointsAccountUnlinkingScreenContract$InputData.f91178a;
                    String str3 = tradeRevPointsAccountUnlinkingScreenContract$InputData.f91179b;
                    this.v = 1;
                    if (tVar.y(jVar2, str3, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dVar2.B2();
                return Unit.f186387a;
            case 14:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((s38.n) obj3).Z2(null, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    s6b.m mVar2 = (s6b.m) obj3;
                    c6b.a aVar24 = mVar2.o;
                    Map map = ((s6b.g) ((j2) mVar2.f260210r.f22677a).getValue()).f260197a;
                    this.v = 1;
                    y5b.j jVar3 = aVar24.f21752a;
                    jVar3.getClass();
                    y5b.e eVar = new y5b.e(jVar3, map, continuation, z ? 1 : 0);
                    p0 p0Var3 = p0.f264001a;
                    Object objJ3 = e0.J(elm.f.f127540b, eVar, this);
                    Object obj4 = objJ3;
                    if (objJ3 != aVar23) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 != aVar23) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    x xVar = ((l) obj3).f260978q;
                    this.v = 1;
                    if (gc0.c.m(xVar, "revolut://app/cards/order-selection/skip_cards", "HelpWithCardScreenModel", this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = ((g) obj3).f260988q;
                    Unit unit = Unit.f186387a;
                    this.v = 1;
                    if (z1Var.emit(unit, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                s92.k kVar4 = (s92.k) obj3;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                s92.e eVar2 = (s92.e) ((j2) kVar4.f261098p.f22677a).getValue();
                f92.g gVar = kVar4.o;
                f92.b bVar6 = eVar2.f261090a;
                String str4 = eVar2.f261091b;
                this.v = 1;
                gVar.getClass();
                etj.l lVar = new etj.l(str4, bVar6, gVar, null, 11);
                p0 p0Var4 = p0.f264001a;
                Object objJ4 = e0.J(elm.f.f127540b, lVar, this);
                return objJ4 == aVar27 ? aVar27 : objJ4;
            case 19:
                sai.k kVar5 = (sai.k) obj3;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    pai.a aVar29 = kVar5.f261417p;
                    String str5 = kVar5.o.f97576a;
                    this.v = 1;
                    objA2 = ((pai.e) aVar29).a(str5, this);
                    if (objA2 == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA2 = obj2;
                }
                zlg.f fVar2 = (zlg.f) objA2;
                if (fVar2 instanceof zlg.e) {
                    kVar5.H2(kVar5.u, new abi.n((zlg.e) fVar2, 1));
                } else {
                    if (!Intrinsics.f(fVar2, zlg.d.f323253a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar5.C2(sai.g.f261413a);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                sb4.c cVar2 = ((com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e) obj3).f67730p;
                this.v = 1;
                hx3.a aVar31 = cVar2.f261499a;
                h1 h1VarC = cVar2.c();
                j34.g gVar2 = ((hx3.g) aVar31).f156379a;
                gVar2.getClass();
                j34.c cVar3 = new j34.c(gVar2, h1VarC, continuation, i6);
                p0 p0Var5 = p0.f264001a;
                Object objJ5 = e0.J(elm.f.f127540b, cVar3, this);
                return objJ5 == aVar30 ? aVar30 : objJ5;
            case 21:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    uak.f fVar3 = ((r) obj3).f261557l;
                    this.v = 1;
                    if (fVar3.b(this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                o oVar = (o) obj3;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    qe4.e eVar3 = oVar.f262115r;
                    String str6 = oVar.f262113p.f68040a;
                    this.v = 1;
                    objE3 = ((qe4.l) eVar3).e3(str6, this);
                    if (objE3 == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i111 != 1) {
                        if (i111 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        o.I2(oVar);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objE3 = obj2;
                }
                qe4.d dVar3 = (qe4.d) objE3;
                if (!(dVar3 instanceof qe4.c)) {
                    if (!(dVar3 instanceof qe4.b) && !(dVar3 instanceof qe4.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i112 = jli.h.f175850a;
                    return Unit.f186387a;
                }
                oVar.H2(oVar.f262116s, new sdi.k((qe4.c) dVar3, ((l80.f) oVar.f262114q).f(), i6));
                this.v = 2;
                if (k0.b(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, this) == aVar33) {
                    return aVar33;
                }
                o.I2(oVar);
                return Unit.f186387a;
            case 23:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                c0 c0Var = (c0) ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g) obj3).f103295s;
                c0Var.getClass();
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                jhi.b bVarG2 = mo3.a.g(nim.a.v(c0Var.f134821a.j(loadingStrategy), new fe9.f(27)), null, new sa5.a(i2), 1);
                this.v = 1;
                Object objX2 = vkm.q.x(bVarG2, this);
                return objX2 == aVar34 ? aVar34 : objX2;
            case 24:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ffk.t tVar2 = ((sjk.g) obj3).o;
                this.v = 1;
                Object objA3 = tVar2.a(this);
                return objA3 == aVar35 ? aVar35 : objA3;
            case 25:
                com.revolut.feature.backend_driven_limits.impl.v2.ui.list.d dVar4 = (com.revolut.feature.backend_driven_limits.impl.v2.ui.list.d) obj3;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    il2.i iVar2 = (il2.i) ((sl2.i) ((j2) dVar4.f63220t.f22677a).getValue()).f264088a.getContent();
                    if (!(iVar2 instanceof il2.h)) {
                        Exception exc2 = new Exception("Restrictions Result is No Content");
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, exc2, h0Var);
                        return Unit.f186387a;
                    }
                    il2.a aVar37 = ((il2.h) iVar2).f162057a.e;
                    if (aVar37 == null) {
                        return null;
                    }
                    x xVar2 = dVar4.f63216p;
                    String str7 = aVar37.f162043b;
                    this.v = 1;
                    objX1 = lg0.b.x1(xVar2, str7, null, null, this, 6);
                    if (objX1 == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objX1 = obj2;
                }
                Boolean bool = (Boolean) objX1;
                bool.getClass();
                return bool;
            case 26:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 != 0) {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                snk.r rVar = (snk.r) obj3;
                snk.o oVar2 = new snk.o(rVar, null);
                this.v = 1;
                Object objP2 = rVar.p2(this, oVar2);
                return objP2 == aVar38 ? aVar38 : objP2;
            case 27:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                q qVar = (q) obj3;
                tsj.g gVar3 = qVar.f265182p;
                String str8 = ((srd.a) ((j2) qVar.f265183q.f22677a).getValue()).f265160a.f99216a;
                this.v = 1;
                Object objC = gVar3.c(str8, this);
                return objC == aVar39 ? aVar39 : objC;
            case 28:
                y yVar = (y) obj3;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    CreditCardInstalmentRepayChooseAmountScreenContract$InputData creditCardInstalmentRepayChooseAmountScreenContract$InputData = yVar.o;
                    CreditCardInstalmentRepayChooseAmountScreenContract$InputData creditCardInstalmentRepayChooseAmountScreenContract$InputData2 = yVar.o;
                    al4.m mVar3 = yVar.f265306q;
                    int i119 = ss4.x.f265304a[creditCardInstalmentRepayChooseAmountScreenContract$InputData.f69461c.ordinal()];
                    if (i119 == 1) {
                        String str9 = creditCardInstalmentRepayChooseAmountScreenContract$InputData2.f69459a;
                        String str10 = creditCardInstalmentRepayChooseAmountScreenContract$InputData2.f69460b;
                        this.v = 1;
                        if (((r1) mVar3).q(str9, str10, this) == aVar40) {
                            return aVar40;
                        }
                    } else {
                        if (i119 != 2 && i119 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str11 = creditCardInstalmentRepayChooseAmountScreenContract$InputData2.f69459a;
                        String str12 = creditCardInstalmentRepayChooseAmountScreenContract$InputData2.f69460b;
                        this.v = 2;
                        if (al4.m.a(mVar3, str11, str12, this) == aVar40) {
                            return aVar40;
                        }
                    }
                } else {
                    if (i118 != 1 && i118 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 != 0) {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                eu1.a aVar42 = ((com.revolut.feature.apm.blik.impl.ui.terms_acceptance.c) obj3).f61692p;
                this.v = 1;
                Object objD = ((iz1.h) ((eu1.h) aVar42).d).d(ApmBlik.f61809c, null, this);
                return objD == aVar41 ? aVar41 : objD;
        }
    }
}
