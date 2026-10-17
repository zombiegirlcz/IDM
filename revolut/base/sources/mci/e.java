package mci;

import ael.e1;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.BrazilInboundConsentDetailsScreen;
import com.revolut.feature.profile.impl.ui.close_account.SelfTerminationFlowContract$InputData;
import com.revolut.feature.rev_points.models.SpareChangeRefundQuote;
import com.revolut.feature.salary_switch.impl.network.PayrollService;
import efm.d0;
import elm.f;
import gim.i;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import l40.j;
import ll4.w;
import mg7.u;
import mhd.j0;
import mhd.o0;
import mic.g0;
import mk0.o;
import mlk.h0;
import mn1.b0;
import mp6.n;
import mq4.t;
import mq4.x;
import mqc.k;
import mu4.g;
import mu8.l;
import mwk.s;
import n1.y;
import n33.i2;
import oki.h;
import om4.x2;
import r10.q;
import retrofit2.HttpException;
import retrofit2.Response;
import skm.a2;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.z1;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f204364w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f204364w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((com.revolut.feature_retail_user_declarations.terms_review.flow.a) this.f204364w, continuation, 0);
            case 1:
                return new e((com.revolut.retail.feature.pod_nominees.impl.edit.c) this.f204364w, continuation, 1);
            case 2:
                return new e((u) this.f204364w, continuation, 2);
            case 3:
                return new e((com.revolut.feature.add_money.impl.flow.c) this.f204364w, continuation, 3);
            case 4:
                return new e((j0) this.f204364w, continuation, 4);
            case 5:
                return new e((g0) this.f204364w, continuation, 5);
            case 6:
                e eVar = new e((BrazilInboundConsentDetailsScreen) this.f204364w, continuation, 6);
                eVar.v = ((Number) obj2).intValue();
                return eVar;
            case 7:
                return new e((o) this.f204364w, continuation, 7);
            case 8:
                return new e((mli.e) this.f204364w, continuation, 8);
            case 9:
                return new e((h0) this.f204364w, continuation, 9);
            case 10:
                return new e((mm5.o) this.f204364w, continuation, 10);
            case 11:
                return new e((com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b) this.f204364w, continuation, 11);
            case 12:
                return new e((com.revolut.feature.profile.impl.ui.close_account.c) this.f204364w, continuation, 12);
            case 13:
                return new e((b0) this.f204364w, continuation, 13);
            case 14:
                return new e((com.revolut.feature.profile.impl.ui.profile.a) this.f204364w, continuation, 14);
            case 15:
                return new e((com.revolut.feature.retail.savings.impl.ui.add_money.b) this.f204364w, continuation, 15);
            case 16:
                return new e((n) this.f204364w, continuation, 16);
            case 17:
                return new e((x) this.f204364w, continuation, 17);
            case 18:
                return new e((k) this.f204364w, continuation, 18);
            case 19:
                return new e((com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e) this.f204364w, continuation, 19);
            case 20:
                return new e((g) this.f204364w, continuation, 20);
            case 21:
                return new e((l) this.f204364w, continuation, 21);
            case 22:
                return new e((com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a) this.f204364w, continuation, 22);
            case 23:
                return new e((mvj.b) this.f204364w, continuation, 23);
            case 24:
                return new e((s) this.f204364w, continuation, 24);
            case 25:
                return new e((mz3.j0) this.f204364w, continuation, 25);
            case 26:
                return new e((com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.b) this.f204364w, continuation, 26);
            case 27:
                return new e((com.revolut.feature.rev_points.impl.ui.transactions.details.b) this.f204364w, continuation, 27);
            case 28:
                return new e((n2c.d) this.f204364w, continuation, 28);
            default:
                return new e((com.revolut.feature.store.impl.ui.orders.see_all.a) this.f204364w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 6:
                break;
        }
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        a2 a2VarI2;
        int i = this.u;
        int i2 = 27;
        int i3 = 26;
        int i5 = 2;
        int i6 = 0;
        int i21 = 5;
        Continuation continuation = null;
        Object obj3 = this.f204364w;
        int i22 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature_retail_user_declarations.terms_review.flow.a aVar2 = (com.revolut.feature_retail_user_declarations.terms_review.flow.a) obj3;
                    d dVar = new d(aVar2, null);
                    this.v = 1;
                    if (aVar2.p2(this, dVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.pod_nominees.impl.edit.c cVar = (com.revolut.retail.feature.pod_nominees.impl.edit.c) obj3;
                com.revolut.retail.feature.pod_nominees.impl.edit.b bVar = new com.revolut.retail.feature.pod_nominees.impl.edit.b(cVar, null);
                this.v = 1;
                Object objP2 = cVar.p2(this, bVar);
                return objP2 == aVar3 ? aVar3 : objP2;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    u uVar = (u) obj3;
                    q qVar = uVar.o;
                    Map map = uVar.f205191t.f74869b;
                    this.v = 1;
                    Object objD = ((qf7.i) qVar.f250849b).e.d(map, false, this);
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
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.add_money.impl.flow.c cVar2 = (com.revolut.feature.add_money.impl.flow.c) obj3;
                    com.revolut.feature.add_money.impl.flow.a aVar6 = new com.revolut.feature.add_money.impl.flow.a(cVar2, null);
                    this.v = 1;
                    if (cVar2.p2(this, aVar6) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    ohd.a aVar8 = ((j0) obj3).f205508s;
                    this.v = 1;
                    dte.b bVar2 = aVar8.f225349m;
                    aVar8.f225350n.getClass();
                    w2d.a.a();
                    Object objZ2 = bVar2.Z2("watchlistRearrangeItems", this);
                    if (objZ2 != aVar7) {
                        objZ2 = Unit.f186387a;
                    }
                    if (objZ2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                g0 g0Var = (g0) obj3;
                j jVar = new j(g0Var, continuation, i3);
                this.v = 1;
                Object objB = pu7.a.B(g0Var.k, "PERK_DETAILS_AUTO_ACTIVATION_TASK_ID", jVar, this);
                return objB == aVar9 ? aVar9 : objB;
            case 6:
                int i92 = this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.a aVar11 = (com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.a) ((BrazilInboundConsentDetailsScreen) obj3).R2();
                aVar11.H2(aVar11.f72569q, new l2c.l(i92, i5));
                return Unit.f186387a;
            case 7:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (o.l((o) obj3, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    xjl.o oVar = ((mli.e) obj3).d;
                    this.v = 1;
                    ad4.c cVar3 = new ad4.c(oVar.f306577a, continuation, i2);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(f.f127540b, cVar3, this);
                    if (objJ != obj4) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj4) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj4) {
                        return obj4;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                h0 h0Var = (h0) obj3;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarF = h0Var.u.f(false);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarF, this);
                    if (obj2 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                h0Var.H2(h0Var.E, new a2f.j((do3.n) obj2, 15));
                return Unit.f186387a;
            case 10:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                mm5.o oVar2 = (mm5.o) obj3;
                j jVar2 = new j(oVar2, continuation, i2);
                this.v = 1;
                Object objB0 = u0.b0(oVar2.X(), "ACTION_BUTTON_TAG", jVar2, this);
                return objB0 == aVar14 ? aVar14 : objB0;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b bVar3 = (com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.b) obj3;
                    com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.a aVar16 = new com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.a(bVar3, null);
                    this.v = 1;
                    if (bVar3.p2(this, aVar16) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                com.revolut.feature.profile.impl.ui.close_account.c cVar4 = (com.revolut.feature.profile.impl.ui.close_account.c) obj3;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    wli.x xVar = cVar4.f81360r;
                    SelfTerminationFlowContract$InputData selfTerminationFlowContract$InputData = cVar4.o;
                    String str = selfTerminationFlowContract$InputData.f81352a;
                    Boolean boolValueOf = Boolean.valueOf(selfTerminationFlowContract$InputData.f81354c);
                    this.v = 1;
                    obj2 = lg0.b.x1(xVar, str, null, boolValueOf, this, 2);
                    if (obj2 == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    h.D2(cVar4.u);
                    return Unit.f186387a;
                }
                cVar4.J2(new IllegalStateException("Unable to handle self-termination deeplink"));
                return Unit.f186387a;
            case 13:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    b0 b0Var = (b0) obj3;
                    o0 o0Var = new o0(b0Var, continuation, i21);
                    this.v = 1;
                    if (b0Var.p2(this, o0Var) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                efm.k kVarFirstElement = m70.a.g(pre.c.l(((com.revolut.feature.profile.impl.ui.profile.a) obj3).o, null, null, f0.f322471a, 11), null, null, 3).firstElement();
                Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
                rfm.x xVarX = ue0.e.x(kVarFirstElement);
                this.v = 1;
                Object objI = nim.a.i(xVarX, this);
                return objI == aVar19 ? aVar19 : objI;
            case 15:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.retail.savings.impl.ui.add_money.b bVar4 = (com.revolut.feature.retail.savings.impl.ui.add_money.b) obj3;
                com.revolut.feature.retail.savings.impl.ui.add_money.a aVar21 = new com.revolut.feature.retail.savings.impl.ui.add_money.a(bVar4, null);
                this.v = 1;
                Object objP22 = bVar4.p2(this, aVar21);
                return objP22 == aVar20 ? aVar20 : objP22;
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = ((n) obj3).f207764s;
                    this.v = 1;
                    if (z1Var.emit(ep6.l.f128091a, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    x xVar2 = (x) obj3;
                    t tVar = new t(xVar2, continuation, i22);
                    this.v = 1;
                    if (xVar2.p2(this, tVar) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                PayrollService payrollService = ((k) obj3).f207962b;
                this.v = 1;
                Object requestStatusHistory = payrollService.getRequestStatusHistory(this);
                return requestStatusHistory == aVar24 ? aVar24 : requestStatusHistory;
            case 19:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e eVar = (com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e) obj3;
                    com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.a aVar26 = new com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.a(eVar, null);
                    this.v = 1;
                    if (eVar.p2(this, aVar26) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                g gVar = (g) obj3;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    al4.n nVar = gVar.f208957p;
                    this.v = 1;
                    if (((x2) nVar).H(this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i111 != 1) {
                        if (i111 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                al4.n nVar2 = gVar.f208957p;
                String str2 = gVar.o.f69601a;
                w wVar = w.SPEI;
                this.v = 2;
                if (((x2) nVar2).M(str2, wVar, this) == aVar27) {
                    return aVar27;
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    l lVar = (l) obj3;
                    mtd.e eVar2 = new mtd.e(lVar, continuation, i5);
                    this.v = 1;
                    if (lVar.p2(this, eVar2) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a aVar29 = (com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.a) obj3;
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    wtc.g0 g0Var2 = aVar29.o;
                    String str3 = ((mvc.c) ((j2) aVar29.f85653q.f22677a).getValue()).f209213a.f85428a;
                    this.v = 1;
                    cuc.e0 e0Var = g0Var2.f299869a;
                    e0Var.getClass();
                    cuc.d0 d0Var = new cuc.d0(e0Var, str3, continuation, i6);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(f.f127540b, d0Var, this);
                    if (objJ2 != obj5) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 != obj5) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar29.B2();
                return Unit.f186387a;
            case 23:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    mvj.b bVar5 = (mvj.b) obj3;
                    com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.a aVar31 = new com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.remove_event.a(bVar5, null);
                    this.v = 1;
                    if (u0.b0(bVar5.X(), "remove_event_confirm_button", aVar31, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                s sVar = (s) obj3;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarE = ((ael.k) sVar.f209526p).e(sVar.o.f104061a);
                    this.v = 1;
                    obj2 = nim.a.b(iVarE, this);
                    if (obj2 == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                sVar.H2(sVar.O, new e1((nel.n) obj2, 8));
                return Unit.f186387a;
            case 25:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    sp3.a aVar34 = ((mz3.j0) obj3).f210613b;
                    bs3.i iVar = new bs3.i("questionnaire", bs3.g.INCOGNIA);
                    this.v = 1;
                    if (((qq3.g) aVar34).a(iVar, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.b bVar6 = (com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.b) obj3;
                    com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.a aVar36 = new com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.a(bVar6, null);
                    this.v = 1;
                    if (bVar6.p2(this, aVar36) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                com.revolut.feature.rev_points.impl.ui.transactions.details.b bVar7 = (com.revolut.feature.rev_points.impl.ui.transactions.details.b) obj3;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarFirstOrError = m70.a.g(bVar7.f83857s.o(), null, new mv5.h(29), 1).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    this.v = 1;
                    obj2 = nim.a.b(d0VarFirstOrError, this);
                    if (obj2 == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                od0.i iVar2 = (od0.i) obj2;
                Intrinsics.h(iVar2);
                bVar7.l2(new n0c.u(iVar2, bVar7, null), new yi5.b(i3));
                return Unit.f186387a;
            case 28:
                n2c.d dVar2 = (n2c.d) obj3;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                try {
                    if (i119 == 0) {
                        yhm.o.b(obj2);
                        d0<Response<r1c.h>> spareChangeRefundQuote = ((s1c.f) dVar2.o.f257629a).f259131a.getSpareChangeRefundQuote();
                        s08.g gVar2 = new s08.g(i21, new s1c.a(i21));
                        spareChangeRefundQuote.getClass();
                        ufm.i iVar3 = new ufm.i(spareChangeRefundQuote, gVar2, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                        ufm.n nVarI0 = te0.w.i0(iVar3);
                        this.v = 1;
                        obj2 = nim.a.b(nVarI0, this);
                        if (obj2 == aVar38) {
                            return aVar38;
                        }
                    } else {
                        if (i119 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    SpareChangeRefundQuote spareChangeRefundQuote2 = (SpareChangeRefundQuote) obj2;
                    dj0.d dVar3 = spareChangeRefundQuote2.f84093a;
                    if (dVar3.f115082a <= 0) {
                        return dVar2.I2(dVar3);
                    }
                    dVar2.H2(dVar2.f211518q, new y(spareChangeRefundQuote2, 7));
                    return Unit.f186387a;
                } catch (HttpException e) {
                    Response<?> response = e.response();
                    Integer num = response != null ? new Integer(response.code()) : null;
                    if (num != null && num.intValue() == 409) {
                        rul.e eVar3 = dVar2.o;
                        eVar3.getClass();
                        w4l.i loadingStrategy = w4l.i.f294643c;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        s1c.f fVar = (s1c.f) eVar3.f257629a;
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        a2VarI2 = yji.l.a1(dVar2, rd0.e.b(fVar.e.e(Unit.f186387a, loadingStrategy)), null, null, new n2c.c(dVar2, continuation, i22), 3);
                    } else {
                        if (num == null || num.intValue() != 422) {
                            throw e;
                        }
                        a2VarI2 = dVar2.I2(qvb.a.b(0L).f83960a);
                    }
                    return a2VarI2;
                }
            default:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.store.impl.ui.orders.see_all.a aVar40 = (com.revolut.feature.store.impl.ui.orders.see_all.a) obj3;
                    n3e.b bVar8 = aVar40.o;
                    ihm.f events = aVar40.f88720s;
                    n3e.c cVar5 = (n3e.c) bVar8;
                    cVar5.getClass();
                    Intrinsics.checkNotNullParameter(events, "events");
                    int i121 = 24;
                    efm.b bVarSwitchMapCompletable = cVar5.d.startWith(Unit.f186387a).switchMapCompletable(new i2(i121, new n09.j0(cVar5, events, i121)));
                    Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
                    this.v = 1;
                    if (nim.a.a(bVarSwitchMapCompletable, this) == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
