package pe2;

import android.app.Activity;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.swish.impl.ui.home.domain.AreaContent;
import com.revolut.feature.bank_account_switching.impl.data.network.BankAccountSwitchingService;
import com.revolut.feature.bank_account_switching.impl.domain.joint_account.JointAccountData;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.OverstapAccountSwitchingFlowContract$Step;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.InsuranceDetailsLayoutScreenContract$InputData;
import com.revolut.feature.trading_add_ons.navigation.TradingAddOnsDestination$AddOnsMainDestination;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.CommodityAssetDetailsDestination;
import com.revolut.retail.feature.pod_nominees.impl.R$string;
import com.revolut.retail.feature.pricing_plans.impl.network.FamilyPlanService;
import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanCancelService;
import com.revolut.retail.feature.pricing_plans.impl.network.StudentPlanService;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.shared.feature.wealth.models.transaction.FeeType;
import dfl.i0;
import efm.d0;
import gfk.o0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import nii.z;
import om4.r0;
import pfk.s;
import pfk.t0;
import pfk.x;
import pi6.r;
import pig.u;
import pjl.z0;
import pkf.v2;
import pmk.v;
import pnh.a0;
import pth.y;
import retrofit2.HttpException;
import retrofit2.Response;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q;
import yhm.o;
import zh9.u0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f235324w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235324w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l((com.revolut.feature.apm.swish.impl.ui.home.area.a) this.f235324w, continuation, 0);
            case 1:
                return new l((com.revolut.retail.feature.pod_nominees.impl.flow.b) this.f235324w, continuation, 1);
            case 2:
                return new l((pf9.e) this.f235324w, continuation, 2);
            case 3:
                return new l((s) this.f235324w, continuation, 3);
            case 4:
                return new l((x) this.f235324w, continuation, 4);
            case 5:
                return new l((t0) this.f235324w, continuation, 5);
            case 6:
                return new l((com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.e) this.f235324w, continuation, 6);
            case 7:
                return new l((com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d) this.f235324w, continuation, 7);
            case 8:
                return new l((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a) this.f235324w, continuation, 8);
            case 9:
                return new l((pj4.k) this.f235324w, continuation, 9);
            case 10:
                return new l((pj9.l) this.f235324w, continuation, 10);
            case 11:
                return new l((pjl.g) this.f235324w, continuation, 11);
            case 12:
                return new l((pk6.j) this.f235324w, continuation, 12);
            case 13:
                return new l((pk8.i) this.f235324w, continuation, 13);
            case 14:
                return new l((pk9.k) this.f235324w, continuation, 14);
            case 15:
                return new l((v2) this.f235324w, continuation, 15);
            case 16:
                return new l((com.revolut.feature.user.checklist.impl.ui.flow.b) this.f235324w, continuation, 16);
            case 17:
                return new l((v) this.f235324w, continuation, 17);
            case 18:
                return new l((pn2.d) this.f235324w, continuation, 18);
            case 19:
                return new l((com.revolut.feature.wealth.ui.impl.trades.b) this.f235324w, continuation, 19);
            case 20:
                return new l((po8.h) this.f235324w, continuation, 20);
            case 21:
                return new l((com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b) this.f235324w, continuation, 21);
            case 22:
                return new l((psk.i) this.f235324w, continuation, 22);
            case 23:
                return new l((pt2.f) this.f235324w, continuation, 23);
            case 24:
                return new l((pt9.i) this.f235324w, continuation, 24);
            case 25:
                return new l((com.revolut.feature.rev10_main_screen.impl.ui.a) this.f235324w, continuation, 25);
            case 26:
                return new l((y) this.f235324w, continuation, 26);
            case 27:
                return new l((puk.s) this.f235324w, continuation, 27);
            case 28:
                return new l((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b) this.f235324w, continuation, 28);
            default:
                return new l((com.revolut.feature.security_hub.impl.ui.street_mode.flow.b) this.f235324w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objO;
        Object objJ;
        Object value;
        Object valueOfferReminder;
        Object objB;
        Object objB2;
        Object obligatedProducts;
        Object objX;
        Object objB3;
        Object objB4;
        int i = this.u;
        int i2 = 5;
        int i3 = 7;
        int i5 = 2;
        int i6 = 3;
        int i21 = 9;
        int i22 = 0;
        Continuation continuation = null;
        Object obj3 = this.f235324w;
        int i32 = 1;
        switch (i) {
            case 0:
                com.revolut.feature.apm.swish.impl.ui.home.area.a aVar = (com.revolut.feature.apm.swish.impl.ui.home.area.a) obj3;
                cli.y yVar = aVar.f62926q;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                try {
                    if (i33 == 0) {
                        o.b(obj2);
                        com.revolut.feature.apm.swish.impl.domain.a aVar3 = aVar.o;
                        this.v = 1;
                        aVar3.getClass();
                        objO = e0.o(new i4g.d(aVar3, continuation, i32), this);
                        if (objO == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i33 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        objO = obj2;
                    }
                    aVar.H2(yVar, new pb2.v((AreaContent) objO, i21));
                    break;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    aVar.H2(yVar, new d22.f(i21, e));
                }
                return Unit.f186387a;
            case 1:
                com.revolut.retail.feature.pod_nominees.impl.flow.b bVar = (com.revolut.retail.feature.pod_nominees.impl.flow.b) obj3;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    o.b(obj2);
                    bVar.f102615q.getClass();
                    Flow flowX1 = bVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.pod_nominees_failed_reauth, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                    this.v = 1;
                    if (q.x(flowX1, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                oki.h.D2(bVar.f102616r);
                return Unit.f186387a;
            case 2:
                pf9.e eVar = (pf9.e) obj3;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    o.b(obj2);
                    en1.a aVar6 = eVar.f235534r;
                    this.v = 1;
                    bn1.a aVar7 = new bn1.a(aVar6.f127707a, continuation, i22);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, aVar7, this);
                    if (objJ == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objJ = obj2;
                }
                om1.a aVar8 = (om1.a) objJ;
                j2 j2Var = eVar.u;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, pf9.h.a((pf9.h) value, null, null, aVar8, 3)));
                if (eVar.f235532p.f78682b && aVar8.f226496c) {
                    om1.c terms = aVar8.getTerms();
                    String id10 = terms != null ? terms.getId() : null;
                    if (id10 == null) {
                        id10 = "";
                    }
                    yji.n.P2(eVar, eVar.o2(new pm1.b(id10)), null, new pf9.a(eVar, i32), 1);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    o.b(obj2);
                    FamilyPlanService familyPlanService = ((s) obj3).f235686b;
                    this.v = 1;
                    if (familyPlanService.createFamily(this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                try {
                    if (i74 == 0) {
                        o.b(obj2);
                        PricingPlanCancelService pricingPlanCancelService = ((x) obj3).f235707a;
                        this.v = 1;
                        valueOfferReminder = pricingPlanCancelService.getValueOfferReminder(this);
                        if (valueOfferReminder == aVar10) {
                            return aVar10;
                        }
                    } else {
                        if (i74 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        valueOfferReminder = obj2;
                    }
                    Response response = (Response) valueOfferReminder;
                    if (response.code() != 204) {
                        if (!response.isSuccessful()) {
                            throw new HttpException(response);
                        }
                        hfk.s sVar = (hfk.s) response.body();
                        if (sVar != null) {
                            return ifk.g.b(sVar);
                        }
                    }
                    return iha.y.f161359a;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th10) {
                    return new iha.z(th10);
                }
            case 5:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    o.b(obj2);
                    StudentPlanService studentPlanService = ((t0) obj3).f235696a;
                    o0 o0Var = new o0(0);
                    this.v = 1;
                    if (studentPlanService.patchStudentVerificationResend(o0Var, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.e eVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.e) obj3;
                    p40.v vVar = new p40.v(eVar2, continuation, i6);
                    this.v = 1;
                    if (eVar2.p2(this, vVar) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    o.b(obj2);
                    com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d dVar = (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d) obj3;
                    r rVar = new r(dVar, continuation, i5);
                    this.v = 1;
                    if (dVar.p2(this, rVar) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a aVar15 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a) obj3;
                    p40.v vVar2 = new p40.v(aVar15, continuation, 4);
                    this.v = 1;
                    if (aVar15.p2(this, vVar2) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 != 0) {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                pj4.k kVar = (pj4.k) obj3;
                p40.v vVar3 = new p40.v(kVar, continuation, i2);
                this.v = 1;
                Object objB5 = pu7.a.B(kVar.k, "refresh waiting list dashboard", vVar3, this);
                return objB5 == aVar16 ? aVar16 : objB5;
            case 10:
                pj9.l lVar = (pj9.l) obj3;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    o.b(obj2);
                    String str = ((pj9.f) ((j2) lVar.f236716s.f22677a).getValue()).f236706c;
                    if (!lVar.f236715r || str == null) {
                        xh9.a aVar18 = lVar.o;
                        this.v = 2;
                        Object objB6 = ((ej9.e0) ((ti9.g) aVar18).f271456a).b(this);
                        if (objB6 != aVar17) {
                            objB6 = Unit.f186387a;
                        }
                        if (objB6 == aVar17) {
                            return aVar17;
                        }
                    } else {
                        ti9.l lVar2 = lVar.f236713p;
                        this.v = 1;
                        Object objB7 = ((ti9.n) lVar2).f271471b.f126810c.b(new ej9.h(str), false, this);
                        if (objB7 != aVar17) {
                            objB7 = Unit.f186387a;
                        }
                        if (objB7 != aVar17) {
                            objB7 = Unit.f186387a;
                        }
                        if (objB7 == aVar17) {
                            return aVar17;
                        }
                    }
                } else {
                    if (i102 != 1 && i102 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                pjl.g gVar = (pjl.g) obj3;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    o.b(obj2);
                    z0 z0Var = (z0) ((uil.a) gVar.f236812b.get());
                    z0Var.getClass();
                    vkm.d dVarK = q.k(new pdi.j(z0Var, continuation, 19));
                    pdi.j jVar = new pdi.j(gVar, continuation, 18);
                    this.v = 1;
                    if (q.o(dVarK, jVar, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                pk6.j jVar2 = (pk6.j) obj3;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    o.b(obj2);
                    d0 d0VarD = ((xg6.j) jVar2.f236932p).d(jVar2.o.f72717a, w4l.h.f294642c);
                    this.v = 1;
                    objB = nim.a.b(d0VarD, this);
                    if (objB == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                jVar2.H2(jVar2.f236933q, new u((Data) objB, 17));
                return Unit.f186387a;
            case 13:
                pk8.i iVar = (pk8.i) obj3;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    o.b(obj2);
                    kk8.k kVar2 = iVar.o;
                    this.v = 1;
                    objB2 = kVar2.b(this);
                    if (objB2 == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB2 = obj2;
                }
                iVar.H2(iVar.f236942p, new ai7.a(i5, (Integer) objB2));
                return Unit.f186387a;
            case 14:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    o.b(obj2);
                    pk9.k kVar3 = (pk9.k) obj3;
                    ti9.l lVar3 = kVar3.o;
                    String str2 = kVar3.f236949p.f78927a;
                    this.v = 1;
                    Object objB8 = ((ti9.n) lVar3).f271471b.f126810c.b(new ej9.h(str2), false, this);
                    if (objB8 != aVar22) {
                        objB8 = Unit.f186387a;
                    }
                    if (objB8 != aVar22) {
                        objB8 = Unit.f186387a;
                    }
                    if (objB8 == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                v2 v2Var = (v2) obj3;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 != 0) {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                tji.f fVarQ2 = v2Var.q2();
                p40.v vVar4 = new p40.v(v2Var, continuation, 6);
                this.v = 1;
                Object objB0 = u0.b0(fVarQ2, "CryptoDepositTransactionDetails_ReturnDepositBanner_Action_Return_LoadingTag", vVar4, this);
                return objB0 == aVar23 ? aVar23 : objB0;
            case 16:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    o.b(obj2);
                    com.revolut.feature.user.checklist.impl.ui.flow.b bVar2 = (com.revolut.feature.user.checklist.impl.ui.flow.b) obj3;
                    com.revolut.feature.user.checklist.impl.ui.flow.a aVar25 = new com.revolut.feature.user.checklist.impl.ui.flow.a(bVar2, null);
                    this.v = 1;
                    if (bVar2.p2(this, aVar25) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    o.b(obj2);
                    v vVar5 = (v) obj3;
                    p40.v vVar6 = new p40.v(vVar5, continuation, i3);
                    this.v = 1;
                    if (vVar5.p2(this, vVar6) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    o.b(obj2);
                    BankAccountSwitchingService bankAccountSwitchingService = ((pn2.d) obj3).f237658a;
                    this.v = 1;
                    obligatedProducts = bankAccountSwitchingService.getObligatedProducts("ACCOUNT_SWITCH_OUT", this);
                    if (obligatedProducts != arrayList) {
                    }
                    return arrayList;
                }
                if (i110 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                obligatedProducts = obj2;
                Iterable<rn2.e> iterable = (Iterable) obligatedProducts;
                arrayList = new ArrayList(w.t(iterable, 10));
                for (rn2.e eVar3 : iterable) {
                    Intrinsics.checkNotNullParameter(eVar3, "<this>");
                    arrayList.add(eVar3.getLabel());
                }
                return arrayList;
            case 19:
                com.revolut.feature.wealth.ui.impl.trades.b bVar3 = (com.revolut.feature.wealth.ui.impl.trades.b) obj3;
                i0 i0Var = bVar3.C;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    o.b(obj2);
                    jhi.b bVarG = mo3.a.g(bVar3.D.B(new a0(i22)), null, null, 3);
                    this.v = 1;
                    objX = q.x(bVarG, this);
                    if (objX == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objX = obj2;
                }
                nel.n nVar = (nel.n) ((Pair) objX).f186385a;
                aii.u tradingAddOnsDestination$AddOnsMainDestination = ((i0Var instanceof dfl.l) && ((dfl.l) i0Var).f114422t == FeeType.TRADING_PRO_FEE) ? new TradingAddOnsDestination$AddOnsMainDestination(0) : ((i0Var instanceof dfl.e) && cp5.d.y((xi0.b) ((dfl.e) i0Var).f114274t.f186385a)) ? new CommodityAssetDetailsDestination((xi0.b) ((dfl.e) i0Var).f114274t.f186385a, null) : nVar != null ? new AssetDetailsDestination(nVar.f214596b, null, false, null, null, null, 62) : null;
                if (tradingAddOnsDestination$AddOnsMainDestination != null) {
                    return bVar3.C1(tradingAddOnsDestination$AddOnsMainDestination);
                }
                return null;
            case 20:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    o.b(obj2);
                    po8.h hVar = (po8.h) obj3;
                    p40.v vVar7 = new p40.v(hVar, continuation, i21);
                    this.v = 1;
                    if (u0.b0(hVar.X(), "LOADING_TAG_PRIMARY_BUTTON", vVar7, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b bVar4 = (com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.overstap.b) obj3;
                yki.i iVar2 = bVar4.f64043r;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    o.b(obj2);
                    smd.s sVar2 = bVar4.f64041p;
                    this.v = 1;
                    objB3 = sVar2.B(this);
                    if (objB3 == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB3 = obj2;
                }
                JointAccountData jointAccountData = (JointAccountData) objB3;
                if (jointAccountData == null) {
                    oki.h.t2(bVar4, iVar2, new OverstapAccountSwitchingFlowContract$Step.SourceAccountForm(wn2.a.PERSONAL), !(iVar2.d() instanceof OverstapAccountSwitchingFlowContract$Step.ProductArticle), null, false, 12);
                } else {
                    oki.h.t2(bVar4, iVar2, new OverstapAccountSwitchingFlowContract$Step.TargetAccountSelection(jointAccountData), !(iVar2.d() instanceof OverstapAccountSwitchingFlowContract$Step.ProductArticle), null, false, 12);
                }
                return Unit.f186387a;
            case 22:
                psk.i iVar3 = (psk.i) obj3;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    o.b(obj2);
                    ufm.i iVarE = ((ael.k) iVar3.f239507n).e(iVar3.f239505l.f239502a);
                    this.v = 1;
                    objB4 = nim.a.b(iVarE, this);
                    if (objB4 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB4 = obj2;
                }
                nel.n nVar2 = (nel.n) objB4;
                if (io3.h.i(nVar2.f214597c)) {
                    yji.n.l2(iVar3, q.Q(iVar3.o.a(), new r0(continuation, iVar3, nVar2, 8)), null, null, 7);
                    return Unit.f186387a;
                }
                hx7.e.n(new IllegalArgumentException(j6.a.q("Attributes widget was called with not Bond instrument. Instrument ref: ", nVar2.f214596b)));
                return Unit.f186387a;
            case 23:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    o.b(obj2);
                    pt2.f fVar = (pt2.f) obj3;
                    ryc.a aVar32 = fVar.f239597p;
                    Activity activity = fVar.o;
                    ui0.b bVarG2 = cj9.c.g(ui0.b.Companion);
                    this.v = 1;
                    if (aVar32.f(activity, bVarG2) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    o.b(obj2);
                    pt9.i iVar4 = (pt9.i) obj3;
                    p40.v vVar8 = new p40.v(iVar4, continuation, 12);
                    this.v = 1;
                    if (iVar4.p2(this, vVar8) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    o.b(obj2);
                    qr0.i iVar5 = ((com.revolut.feature.rev10_main_screen.impl.ui.a) obj3).f83440r;
                    this.v = 1;
                    Object objEmit = ((ntb.c) iVar5.f248595b).f219012a.emit(gtb.a.TAB_RESELECTED_WHEN_SCREEN_ALREADY_SCROLLED_UP, this);
                    if (objEmit != aVar34) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit != aVar34) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (((y) obj3).invoke(this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    o.b(obj2);
                    y08.a aVar37 = ((puk.s) obj3).f239960x;
                    this.v = 1;
                    if (aVar37.Z2(false, this) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    o.b(obj2);
                    com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b bVar5 = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b) obj3;
                    mu7.c cVar = bVar5.f76124t;
                    InsuranceDetailsLayoutScreenContract$InputData insuranceDetailsLayoutScreenContract$InputData = bVar5.o;
                    String str3 = insuranceDetailsLayoutScreenContract$InputData.f76112a;
                    boolean z = insuranceDetailsLayoutScreenContract$InputData.f76113b;
                    this.v = 1;
                    if (cVar.b(this, str3, z) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 != 0) {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.street_mode.flow.b bVar6 = (com.revolut.feature.security_hub.impl.ui.street_mode.flow.b) obj3;
                com.revolut.feature.security_hub.impl.ui.street_mode.flow.a aVar40 = new com.revolut.feature.security_hub.impl.ui.street_mode.flow.a(bVar6, null);
                this.v = 1;
                Object objB9 = pu7.a.B(bVar6.k, "StreetModeProductArticle", aVar40, this);
                return objB9 == aVar39 ? aVar39 : objB9;
        }
    }
}
