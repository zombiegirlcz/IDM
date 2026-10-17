package kb7;

import androidx.room.RxRoom;
import bjk.z1;
import c64.l;
import com.revolut.data.model.Data;
import com.revolut.feature.alipay.impl.data.network.AlipayPlusProxyService;
import com.revolut.feature.alipay_plus.mpm.model.APMPMError;
import com.revolut.feature.alipay_plus.mpm.model.APMPMProxyRequest;
import com.revolut.feature.alipay_plus.mpm.model.APMPMProxyResponse;
import com.revolut.feature.apm.bills.f24.api.navigation.F24Destination;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptPresentAction;
import com.revolut.retail.feature.pricing_plans.ui.impl.network.PricingPlanOffersService;
import d7a.p;
import efm.d0;
import fnc.s;
import ft3.h1;
import ggk.l0;
import gim.i;
import j54.v0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jld.h;
import kc9.m;
import kf9.f;
import kf9.j;
import kge.d;
import kgh.q;
import kh4.g;
import kjk.o;
import kk9.e;
import kk9.n;
import kkf.k9;
import kkf.n4;
import kkk.t;
import klf.h0;
import klf.k0;
import klf.o0;
import klf.r0;
import km2.r;
import km2.x;
import knd.c1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import org.json.JSONObject;
import skm.e0;
import skm.p0;
import tof.a3;
import ukm.j0;
import zh9.u0;
import zhm.a1;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f182527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f182528x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f182527w = obj2;
        this.f182528x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c((com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a) this.f182527w, (Set) this.f182528x, continuation, 0);
            case 1:
                return new c((m) this.f182527w, (ESignatureDetails) this.f182528x, continuation, 1);
            case 2:
                return new c((kd3.m) this.f182527w, (String) this.f182528x, continuation, 2);
            case 3:
                return new c((com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.a) this.f182527w, (String) this.f182528x, continuation, 3);
            case 4:
                return new c((f) this.f182527w, (jf0.c) this.f182528x, continuation, 4);
            case 5:
                return new c((j) this.f182527w, (jf0.c) this.f182528x, continuation, 5);
            case 6:
                return new c((d) this.f182527w, (ProductId) this.f182528x, continuation, 6);
            case 7:
                return new c((com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a) this.f182527w, (String) this.f182528x, continuation, 7);
            case 8:
                return new c((g) this.f182527w, (h1) this.f182528x, continuation, 8);
            case 9:
                return new c((l) this.f182527w, (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b) this.f182528x, continuation, 9);
            case 10:
                return new c((o) this.f182527w, (String) this.f182528x, continuation, 10);
            case 11:
                return new c((o) this.f182527w, (PlanOfferPromptPresentAction) this.f182528x, continuation, 11);
            case 12:
                return new c((s) this.f182527w, (APMPMProxyRequest) this.f182528x, continuation, 12);
            case 13:
                return new c((n) this.f182527w, (e) this.f182528x, continuation, 13);
            case 14:
                c cVar = new c((n4) this.f182528x, continuation, 14);
                cVar.f182527w = obj2;
                return cVar;
            case 15:
                return new c((k9) this.f182527w, (String) this.f182528x, continuation, 15);
            case 16:
                return new c((t) this.f182527w, (TermsScope) this.f182528x, continuation, 16);
            case 17:
                return new c((t) this.f182527w, (hha.d) this.f182528x, continuation, 17);
            case 18:
                c cVar2 = new c((kld.l) this.f182528x, continuation, 18);
                cVar2.f182527w = obj2;
                return cVar2;
            case 19:
                c cVar3 = new c((h0) this.f182528x, continuation, 19);
                cVar3.f182527w = obj2;
                return cVar3;
            case 20:
                c cVar4 = new c((o0) this.f182528x, continuation, 20);
                cVar4.f182527w = obj2;
                return cVar4;
            case 21:
                return new c((km2.i) this.f182527w, (String) this.f182528x, continuation, 21);
            case 22:
                return new c((r) this.f182527w, (km2.j) this.f182528x, continuation, 22);
            case 23:
                return new c((x) this.f182527w, (String) this.f182528x, continuation, 23);
            case 24:
                return new c((j0) this.f182527w, (List) this.f182528x, continuation, 24);
            case 25:
                return new c((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) this.f182527w, (ty0.a) this.f182528x, continuation, 25);
            case 26:
                return new c((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) this.f182527w, (l0) this.f182528x, continuation, 26);
            case 27:
                c cVar5 = new c((ko7.l) this.f182528x, continuation, 27);
                cVar5.f182527w = obj2;
                return cVar5;
            case 28:
                return new c((ko9.b) this.f182527w, (String) this.f182528x, continuation, 28);
            default:
                return new c((com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e) this.f182527w, (rr7.b) this.f182528x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        Object objB;
        Object objB2;
        Object objB3;
        Object objPerformProxy;
        String str;
        Object objX1;
        k0 k0Var;
        Object objD;
        oo9.a aVar;
        int i = this.u;
        int i2 = 19;
        boolean z = false;
        boolean z3 = false;
        aPMPMError = null;
        APMPMError aPMPMError = null;
        Object obj3 = this.f182528x;
        int i3 = 1;
        switch (i) {
            case 0:
                com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a aVar2 = (com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a) this.f182527w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    Object objB4 = aVar2.f74678p.b(this, "SECRET_ACCOUNTS", (Set) obj3);
                    if (objB4 != aVar3) {
                        objB4 = Unit.f186387a;
                    }
                    if (objB4 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar2.B2();
                return aVar2.X1(aVar2.o.b());
            case 1:
                m mVar = (m) this.f182527w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    tk3.e eVar = (tk3.e) mVar.f182682q.get();
                    this.v = 1;
                    objA = eVar.a(this);
                    if (objA == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                mVar.s1();
                mVar.C2(new kc9.f((ESignatureDetails) obj3, (String) objA));
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    kd3.m mVar2 = (kd3.m) this.f182527w;
                    ah1.m mVar3 = new ah1.m(mVar2, (String) obj3, , 28);
                    this.v = 1;
                    if (mVar2.p2(this, mVar3) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.a aVar7 = (com.revolut.feature.credit.application.plugins.impl.ui.loan_selection.a) this.f182527w;
                kd4.c cVar = new kd4.c(aVar7, (String) obj3, , i3);
                this.v = 1;
                Object objB5 = pu7.a.B(aVar7.k, "acceptLoan", cVar, this);
                return objB5 == aVar6 ? aVar6 : objB5;
            case 4:
                f fVar = (f) this.f182527w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objB = fVar.b((jf0.c) obj3, this);
                    if (objB == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                NaviCommand naviCommand = (NaviCommand) objB;
                if (naviCommand != null) {
                    fVar.f183340a.c(naviCommand);
                }
                return Boolean.TRUE;
            case 5:
                j jVar = (j) this.f182527w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objB2 = jVar.b((jf0.c) obj3, this);
                    if (objB2 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                F24Destination f24Destination = (F24Destination) objB2;
                if (f24Destination != null) {
                    jVar.f183347b.c(u0.f(f24Destination));
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarCreateSingle = RxRoom.createSingle(((dge.b) ((d) this.f182527w).f183974b).f114648a, true, false, new p(((ProductId) obj3).getId(), i2));
                    this.v = 1;
                    objB3 = nim.a.b(d0VarCreateSingle, this);
                    if (objB3 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB3 = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objB3, "await(...)");
                return cj9.c.R((List) objB3);
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a aVar12 = (com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.a) this.f182527w;
                q qVar = new q(aVar12, (String) obj3, , i3);
                this.v = 1;
                Object objB6 = pu7.a.B(aVar12.k, "navigateToPdfViewer", qVar, this);
                return objB6 == aVar11 ? aVar11 : objB6;
            case 8:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 != 0) {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                by3.a aVar14 = ((g) this.f182527w).f184054a;
                this.v = 1;
                f44.c cVar2 = aVar14.f19740a;
                cVar2.getClass();
                f44.b bVar = new f44.b(cVar2, (h1) obj3, , z3 ? 1 : 0);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, bVar, this);
                return objJ == aVar13 ? aVar13 : objJ;
            case 9:
                l lVar = (l) this.f182527w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    c64.m mVar4 = (c64.m) lVar;
                    Long lB = mVar4.f21634a.f129492a.b();
                    Long lC = mVar4.f21634a.f129492a.c();
                    fu3.c cVar3 = mVar4.f21634a.f129493b;
                    com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b) obj3;
                    h hVar = new h(3, bVar2, lB, lC, cVar3 != null ? cVar3.a() : 0, null);
                    this.v = 1;
                    if (bVar2.p2(this, hVar) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                o oVar = (o) this.f182527w;
                k49.f fVar2 = new k49.f(oVar, (String) obj3, , 12);
                this.v = 1;
                Object objB7 = o.b(oVar, fVar2, this);
                return objB7 == aVar16 ? aVar16 : objB7;
            case 11:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    PricingPlanOffersService pricingPlanOffersService = ((o) this.f182527w).f184459a;
                    PlanOfferPromptPresentAction planOfferPromptPresentAction = (PlanOfferPromptPresentAction) obj3;
                    Intrinsics.checkNotNullParameter(planOfferPromptPresentAction, "<this>");
                    if (!(planOfferPromptPresentAction instanceof PlanOfferPromptPresentAction.OfferPresented)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z1 z1Var = new z1(((PlanOfferPromptPresentAction.OfferPresented) planOfferPromptPresentAction).f102707a);
                    this.v = 1;
                    if (pricingPlanOffersService.reportPlanOfferPromptAction(z1Var, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    AlipayPlusProxyService alipayPlusProxyService = (AlipayPlusProxyService) ((s) this.f182527w).f136657b;
                    APMPMProxyRequest aPMPMProxyRequest = (APMPMProxyRequest) obj3;
                    Intrinsics.checkNotNullParameter(aPMPMProxyRequest, "<this>");
                    JSONObject jSONObjectBodyJson = aPMPMProxyRequest.bodyJson();
                    String string = jSONObjectBodyJson.getString("sdkRequestHeader");
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = jSONObjectBodyJson.getString("sdkRequestData");
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    jk1.c cVar4 = new jk1.c(string, string2);
                    this.v = 1;
                    objPerformProxy = alipayPlusProxyService.performProxy(cVar4, this);
                    if (objPerformProxy == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objPerformProxy = obj2;
                }
                jk1.d dVar = (jk1.d) objPerformProxy;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                JSONObject jSONObjectL = ce9.m.L(dVar.getSdkResponseHeader());
                JSONObject jSONObjectL2 = ce9.m.L(dVar.getSdkResponseData());
                jk1.e result = dVar.getResult();
                if (result != null) {
                    if (!Intrinsics.f(result.getResultStatus(), "F") && !Intrinsics.f(result.getResultStatus(), "U")) {
                        result = null;
                    }
                    if (result != null) {
                        String resultCode = result.getResultCode();
                        String str2 = resultCode == null ? "SYSTEM_ERROR" : resultCode;
                        String resultMessage = result.getResultMessage();
                        if (resultMessage == null) {
                            String resultCode2 = result.getResultCode();
                            str = resultCode2 == null ? "SYSTEM_ERROR" : resultCode2;
                        } else {
                            str = resultMessage;
                        }
                        aPMPMError = new APMPMError(str2, str, null, 4, null);
                    }
                }
                return new APMPMProxyResponse(jSONObjectL, jSONObjectL2, aPMPMError);
            case 13:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n nVar = (n) this.f182527w;
                a5k.n nVar2 = new a5k.n(nVar, (e) obj3, , 7);
                this.v = 1;
                Object objB8 = pu7.a.B(nVar.k, "repay-amount", nVar2, this);
                return objB8 == aVar19 ? aVar19 : objB8;
            case 14:
                FlowCollector flowCollector = (FlowCollector) this.f182527w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    ArrayList arrayListA = ((vi9.t) ((n4) obj3).o).a();
                    this.f182527w = null;
                    this.v = 1;
                    if (flowCollector.emit(arrayListA, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    Boolean bool = Boolean.FALSE;
                    this.v = 1;
                    objX1 = lg0.b.x1(((k9) this.f182527w).o, (String) obj3, null, bool, this, 2);
                    if (objX1 == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objX1 = obj2;
                }
                String str3 = (String) obj3;
                if (!((Boolean) objX1).booleanValue()) {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Transaction details screen. Unable to handle deeplink: ", str3));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return objX1;
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 != 0) {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                t tVar = (t) this.f182527w;
                v0 v0Var = new v0(tVar, (TermsScope) obj3, (Continuation) , 10);
                this.v = 1;
                Object objP2 = tVar.p2(this, v0Var);
                return objP2 == aVar22 ? aVar22 : objP2;
            case 17:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                t tVar2 = (t) this.f182527w;
                v0 v0Var2 = new v0(tVar2, (hha.d) obj3, (Continuation) , 11);
                this.v = 1;
                Object objP22 = tVar2.p2(this, v0Var2);
                return objP22 == aVar23 ? aVar23 : objP22;
            case 18:
                Pair pair = (Pair) this.f182527w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    kld.m mVar5 = (kld.m) pair.f186385a;
                    lkd.d dVar2 = (lkd.d) pair.f186386b;
                    akd.r rVar = mVar5.f185432a;
                    SlotContext slotContext = mVar5.f185433b;
                    twg.c cVar5 = ((kld.l) obj3).f185431n;
                    lkd.g gVar = new lkd.g(rVar);
                    this.f182527w = null;
                    this.v = 1;
                    if (cVar5.Y(slotContext, gVar, dVar2, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                FlowCollector flowCollector2 = (FlowCollector) this.f182527w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    k71.i iVar = ((h0) obj3).f185490b;
                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                    a3 a3Var = iVar instanceof k71.g ? ((k71.g) iVar).f181782b : iVar instanceof k71.h ? ((k71.h) iVar).f181783b : null;
                    if (a3Var != null) {
                        this.f182527w = null;
                        this.v = 1;
                        if (flowCollector2.emit(a3Var, this) == aVar25) {
                            return aVar25;
                        }
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                FlowCollector flowCollector3 = (FlowCollector) this.f182527w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    int i108 = r0.f185565a[((o0) obj3).f185545b.ordinal()];
                    if (i108 == 1) {
                        k0Var = new k0(null);
                    } else {
                        if (i108 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        k0Var = null;
                    }
                    this.f182527w = null;
                    this.v = 1;
                    if (flowCollector3.emit(k0Var, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    efm.b bVarDeleteUploadedBackground = ((km2.i) this.f182527w).f185693a.deleteUploadedBackground((String) obj3);
                    this.v = 1;
                    if (nim.a.a(bVarDeleteUploadedBackground, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    mk0.a aVar29 = ((r) this.f182527w).f185705a;
                    tk0.f fVar3 = new tk0.f(km2.m.a(r.Companion, (km2.j) obj3));
                    Map mapG = zhm.r0.g();
                    this.v = 1;
                    if (aVar29.e(fVar3, mapG, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                String str4 = (String) obj3;
                x xVar = (x) this.f182527w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    Set setA = xVar.a();
                    if (setA.contains(str4)) {
                        return Unit.f186387a;
                    }
                    LinkedHashSet linkedHashSetM = a1.m(setA, str4);
                    mk0.a aVar31 = xVar.f185712a;
                    tk0.e eVar2 = new tk0.e("VIEWED_FEATURED_THEMES");
                    List listD1 = zhm.d0.d1(linkedHashSetM);
                    this.v = 1;
                    if (aVar31.e(eVar2, listD1, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    j0 j0Var = (j0) this.f182527w;
                    c1 c1Var = new c1((List) obj3);
                    this.v = 1;
                    if (j0Var.send(c1Var, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 != 0) {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a aVar34 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) this.f182527w;
                k49.f fVar4 = new k49.f(aVar34, (ty0.a) obj3, , 18);
                this.v = 1;
                Object objP23 = aVar34.p2(this, fVar4);
                return objP23 == aVar33 ? aVar33 : objP23;
            case 26:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a aVar36 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_single_offer.a) this.f182527w;
                    k49.f fVar5 = new k49.f(aVar36, (l0) obj3, , i2);
                    this.v = 1;
                    if (aVar36.p2(this, fVar5) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                Data data = (Data) this.f182527w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    Intrinsics.h(data);
                    this.f182527w = null;
                    this.v = 1;
                    if (ko7.l.y2((ko7.l) obj3, data, this) == aVar37) {
                        return aVar37;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    lo9.d dVar3 = ((ko9.b) this.f182527w).f186276a;
                    String str5 = (String) obj3;
                    this.v = 1;
                    lo9.e eVar3 = (lo9.e) dVar3;
                    PaymentWidget paymentWidgetA = eVar3.f197426b.a(str5);
                    if ((paymentWidgetA != null && ((aVar = paymentWidgetA.f79073b) == oo9.a.COMPLETED || aVar == oo9.a.EXPIRED)) || (objD = eVar3.f197427c.d(str5, true, this)) != aVar38) {
                        objD = Unit.f186387a;
                    }
                    if (objD == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e eVar4 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.e) this.f182527w;
                    f9i.c cVar6 = ((rr7.b) obj3).f256733a;
                    this.v = 1;
                    if (eVar4.G1(cVar6, this) == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f182528x = obj2;
    }
}
