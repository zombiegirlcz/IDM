package oh4;

import aw0.l6;
import com.revolut.feature.productintro.view.AccountsNavBarContentView;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$ClickParcel;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.network.WaitlistService;
import com.revolut.sso.api.models.CardPINEvidence;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$EmailOtp;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$PhoneCallOtp;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$SimBinding;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$SmsOtp;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp;
import com.revolut.sso.impl.ui.auth.n;
import efm.d0;
import ft3.d1;
import gkl.m1;
import gkl.n1;
import gkl.o1;
import gkl.p1;
import gkl.q1;
import hd.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import nyb.q;
import oi4.p;
import okl.i1;
import om4.k3;
import om4.r2;
import om4.x2;
import oq9.o;
import os9.u;
import skm.e0;
import skm.g0;
import skm.k0;
import skm.p0;
import ui9.z;
import vkm.j2;
import wli.x;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f225292w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f225293x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj2, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f225293x = obj2;
        this.f225292w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i((String) this.f225292w, (l) this.f225293x, continuation, 0);
            case 1:
                return new i((p) this.f225292w, (zm3.i) this.f225293x, continuation, 1);
            case 2:
                return new i(2, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.a) this.f225293x, (String) this.f225292w, continuation);
            case 3:
                return new i(3, (oj2.i) this.f225293x, (String) this.f225292w, continuation);
            case 4:
                return new i((com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c) this.f225292w, (we6.i) this.f225293x, continuation, 4);
            case 5:
                return new i((oj9.e) this.f225292w, (ai9.b) this.f225293x, continuation, 5);
            case 6:
                return new i((com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.b) this.f225292w, (MoreForFamilyScreenContract$ClickParcel) this.f225293x, continuation, 6);
            case 7:
                return new i((n) this.f225292w, (bll.e) this.f225293x, continuation, 7);
            case 8:
                return new i((n) this.f225292w, (ill.d) this.f225293x, continuation, 8);
            case 9:
                return new i((n) this.f225292w, (vnl.d) this.f225293x, continuation, 9);
            case 10:
                return new i((n) this.f225292w, (vnl.k) this.f225293x, continuation, 10);
            case 11:
                return new i((n) this.f225292w, (Evidence) this.f225293x, continuation, 11);
            case 12:
                return new i((n) this.f225292w, (Claim) this.f225293x, continuation, 12);
            case 13:
                return new i((n) this.f225292w, (gkl.m) this.f225293x, continuation, 13);
            case 14:
                return new i((n) this.f225292w, (Challenge) this.f225293x, continuation, 14);
            case 15:
                return new i((n) this.f225292w, (jkl.i) this.f225293x, continuation, 15);
            case 16:
                return new i((qkl.f) this.f225292w, (n) this.f225293x, continuation, 16);
            case 17:
                return new i((com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.b) this.f225292w, (em8.a) this.f225293x, continuation, 17);
            case 18:
                return new i((AccountsNavBarContentView) this.f225292w, (l6) this.f225293x, continuation, 18);
            case 19:
                i iVar = new i((x2) this.f225293x, continuation);
                iVar.f225292w = obj2;
                return iVar;
            case 20:
                return new i(20, (k3) this.f225293x, (String) this.f225292w, continuation);
            case 21:
                return new i(21, (om8.c) this.f225293x, (String) this.f225292w, continuation);
            case 22:
                return new i(22, (k18.c) this.f225293x, (String) this.f225292w, continuation);
            case 23:
                return new i((ona.i) this.f225292w, this.f225293x, continuation, 23);
            case 24:
                return new i((oo2.p) this.f225292w, (qo2.k) this.f225293x, continuation, 24);
            case 25:
                return new i((r) this.f225292w, (ook.c) this.f225293x, continuation, 25);
            case 26:
                return new i((oq3.m) this.f225292w, (d1) this.f225293x, continuation, 26);
            case 27:
                return new i((oq3.m) this.f225292w, (pq3.h) this.f225293x, continuation, 27);
            case 28:
                return new i((jpg.e) this.f225292w, (oqg.b) this.f225293x, continuation, 28);
            default:
                return new i((u) this.f225292w, (o) this.f225293x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 25:
                break;
        }
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v125, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v12 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objK;
        Claim claim;
        Object waitlistEntries;
        int i = this.u;
        int i2 = 26;
        int i3 = 7;
        int i5 = 4;
        int i6 = 0;
        int i21 = 2;
        ArrayList arrayList = null;
        Object obj3 = this.f225293x;
        int i22 = 1;
        switch (i) {
            case 0:
                String str = (String) this.f225292w;
                l lVar = (l) obj3;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                if (!a0.H(str, "revolut://", false)) {
                    return lVar.C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig((String) this.f225292w, null, 0, false, true, true, 65438))));
                }
                if (str.equals("revolut://app/credit/bureaus")) {
                    lVar.l2(new j(lVar, simpleName, i21), new yi5.b(i2));
                    return Unit.f186387a;
                }
                x xVar = lVar.f225301w;
                String str2 = (String) this.f225292w;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, str2, null, null, this, 6);
                return objX1 == aVar ? aVar : objX1;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                p pVar = (p) this.f225292w;
                oi4.o oVar = new oi4.o(pVar, (zm3.i) obj3, simpleName, i22);
                this.v = 1;
                Object objB = pu7.a.B(pVar.k, "Submit spousal consent request", oVar, this);
                return objB == aVar2 ? aVar2 : objB;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.a aVar4 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch.a) obj3;
                nk9.l lVar2 = new nk9.l(aVar4, (String) this.f225292w, simpleName, i2);
                this.v = 1;
                Object objP2 = aVar4.p2(this, lVar2);
                return objP2 == aVar3 ? aVar3 : objP2;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x xVar2 = ((oj2.i) obj3).f225720q;
                String str3 = (String) this.f225292w;
                this.v = 1;
                Object objX12 = lg0.b.x1(xVar2, str3, null, null, this, 6);
                return objX12 == aVar5 ? aVar5 : objX12;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    oj6.g gVar = ((com.revolut.feature.external_accounts.impl.ui.brazil.inbound_mandate_confirmation.c) this.f225292w).f72586r;
                    we6.f fVar = (we6.f) ((we6.i) obj3);
                    oj6.f fVar2 = new oj6.f(fVar.f296636a, fVar.f296637b, fVar.f296638c);
                    this.v = 1;
                    Object objEmit = gVar.f225743a.emit(fVar2, this);
                    if (objEmit != aVar6) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    z zVar = ((oj9.e) this.f225292w).f225750l;
                    ai9.h hVar = ((ai9.b) obj3).f5215b;
                    this.v = 1;
                    ej9.b bVar = new ej9.b(zVar.f280364b, hVar, simpleName, i22);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, bVar, this);
                    Object obj4 = objJ;
                    if (objJ != aVar7) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 != aVar7) {
                        obj4 = Unit.f186387a;
                    }
                    if (obj4 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.b bVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.b) this.f225292w;
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.a aVar9 = new com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.a((MoreForFamilyScreenContract$ClickParcel) obj3, bVar2, null);
                this.v = 1;
                Object objY2 = bVar2.Y2(this, aVar9);
                return objY2 == aVar8 ? aVar8 : objY2;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    n nVar = (n) this.f225292w;
                    bll.d dVar = (bll.d) ((bll.e) obj3);
                    CardPINEvidence cardPINEvidence = new CardPINEvidence(dVar.f16741a, dVar.f16742b);
                    this.v = 1;
                    if (n.Q2(nVar, null, cardPINEvidence, null, this, 5) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    n nVar2 = (n) this.f225292w;
                    jkl.i iVar = ((ill.c) ((ill.d) obj3)).f162264a;
                    this.v = 1;
                    if (n.U2(nVar2, iVar, null, this, 2) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    n nVar3 = (n) this.f225292w;
                    nk9.l lVar3 = new nk9.l(nVar3, (vnl.d) obj3, simpleName, 27);
                    this.v = 1;
                    if (nVar3.p2(this, lVar3) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    n nVar4 = (n) this.f225292w;
                    nk9.l lVar4 = new nk9.l(nVar4, (vnl.k) obj3, simpleName, 28);
                    this.v = 1;
                    if (nVar4.p2(this, lVar4) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (n.Q2((n) this.f225292w, null, (Evidence) obj3, null, this, 5) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                Claim claim2 = (Claim) obj3;
                n nVar5 = (n) this.f225292w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    wll.c cVar = nVar5.f106379w;
                    String strA = com.revolut.sso.impl.ui.auth.o.a((AuthenticationFlowContract$State) ((j2) nVar5.m0.f22677a).getValue(), nVar5.S);
                    this.v = 1;
                    objK = cVar.k(nVar5, strA, claim2, this);
                    if (objK == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i103 != 1) {
                        if (i103 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objK = obj2;
                }
                q1 q1Var = (q1) objK;
                if (q1Var instanceof m1) {
                    return yji.l.b1(nVar5, nVar5.X1(((jol.c) nVar5.D).b(claim2)), null, null, 7);
                }
                if (q1Var instanceof o1) {
                    AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) ((j2) nVar5.m0.f22677a).getValue();
                    if ((authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery) || (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) || (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication) || (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication)) {
                        claim = null;
                    } else {
                        if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        claim = ((AuthenticationFlowContract$State.SignIn) authenticationFlowContract$State).f106286c;
                    }
                    String str4 = claim instanceof Claim.Phone ? ((Claim.Phone) claim).f106131a : null;
                    if (str4 == null) {
                        nVar5.y3();
                    } else {
                        yji.l.b1(nVar5, nVar5.X1(((jol.c) nVar5.D).g(str4)), null, null, 7);
                    }
                    return Unit.f186387a;
                }
                if (!(q1Var instanceof n1)) {
                    if (!(q1Var instanceof p1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.v = 2;
                    if (nVar5.p3(claim2, this) == aVar15) {
                        return aVar15;
                    }
                    return Unit.f186387a;
                }
                Challenge challenge = ((n1) q1Var).f144468a;
                qki.d dVar2 = nVar5.m0;
                if (!(((j2) dVar2.f22677a).getValue() instanceof AuthenticationFlowContract$State)) {
                    AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) nVar5.l0.d();
                    simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : 0;
                    kotlin.jvm.internal.p0 p0Var2 = o0.f186429a;
                    throw new IllegalStateException(m72.b.q(okl.m.p((j2) dVar2.f22677a, p0Var2), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var2.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
                }
                nVar5.H2(dVar2, new okl.d1(nVar5, challenge, i6));
                jkl.i iVar2 = challenge.f106098a;
                switch (okl.o.f226224b[iVar2.ordinal()]) {
                    case 1:
                        n.j3(nVar5, new AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$SimBinding(((Claim.Phone) claim2).f106131a, challenge));
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 21:
                    case 22:
                    case 24:
                    case 25:
                    case 26:
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "Revolut SSO", iVar2 + " method is not supported for claim confirmation", null, h0Var);
                        nVar5.y3();
                        break;
                    case 7:
                        n.j3(nVar5, new AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$EmailOtp(((Claim.Email) claim2).f106127a, challenge));
                        break;
                    case 19:
                        n.j3(nVar5, new AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$SmsOtp(((Claim.Phone) claim2).f106131a, challenge));
                        break;
                    case 20:
                        n.j3(nVar5, new AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$PhoneCallOtp(((Claim.Phone) claim2).f106131a, challenge));
                        break;
                    case 23:
                        n.j3(nVar5, new AuthenticationFlowContract$Step$EvidenceRequiredForClaimConfirmation$WhatsAppOtp(((Claim.Phone) claim2).f106131a, challenge));
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 13:
                n nVar6 = (n) this.f225292w;
                qki.d dVar3 = nVar6.m0;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    Set setR6 = ((AuthenticationFlowContract$State) ((j2) dVar3.f22677a).getValue()).getK();
                    HashSet hashSet = new HashSet();
                    gkl.m mVar = (gkl.m) obj3;
                    for (Object obj5 : setR6) {
                        if (((gkl.m) obj5) != mVar) {
                            hashSet.add(obj5);
                        }
                    }
                    if (!(((j2) dVar3.f22677a).getValue() instanceof AuthenticationFlowContract$State)) {
                        AuthenticationFlowContract$Step authenticationFlowContract$Step2 = (AuthenticationFlowContract$Step) nVar6.l0.d();
                        String simpleName = authenticationFlowContract$Step2 != null ? authenticationFlowContract$Step2.getClass().getSimpleName() : null;
                        kotlin.jvm.internal.p0 p0Var3 = o0.f186429a;
                        throw new IllegalStateException(m72.b.q(okl.m.p((j2) dVar3.f22677a, p0Var3), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var3.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
                    }
                    nVar6.H2(dVar3, new q(nVar6, hashSet, i3));
                    this.v = 1;
                    if (n.Q2(nVar6, null, null, null, this, 7) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    n nVar7 = (n) this.f225292w;
                    i1 i1Var = new i1((Challenge) obj3, nVar7, null);
                    this.v = 1;
                    if (nVar7.p2(this, i1Var) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((n) this.f225292w).T2((jkl.i) obj3, null, true, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    long jLongValue = ((qkl.f) this.f225292w).f247028a.longValue();
                    this.v = 1;
                    if (k0.b(jLongValue, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                oki.h.D2(((n) obj3).l0);
                return Unit.f186387a;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 != 0) {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.b bVar3 = (com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.b) this.f225292w;
                ol8.e eVar = new ol8.e(bVar3, (em8.a) obj3, simpleName, i6);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar3.k, "HANDLE_JUNIOR_ADD_PHONE_NUMBER_RESULT", eVar, this);
                return objB2 == aVar20 ? aVar20 : objB2;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((AccountsNavBarContentView) this.f225292w).A.e((l6) obj3, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                x2 x2Var = (x2) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) this.f225292w;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                g0[] g0VarArr = {e0.g(coroutineScope, null, null, new r2(x2Var, simpleName, 3), 3), e0.g(coroutineScope, null, null, new r2(x2Var, simpleName, i5), 3)};
                this.f225292w = null;
                this.v = 1;
                Object objI = e0.i(g0VarArr, this);
                return objI == aVar22 ? aVar22 : objI;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    mk0.a aVar24 = ((k3) obj3).f226619a;
                    k3.Companion.getClass();
                    Intrinsics.checkNotNullParameter("CREDIT_CARD_BALANCE_DISPLAY_SETTING", "id");
                    tk0.d dVar4 = new tk0.d("CREDIT_CARD_BALANCE_DISPLAY_SETTING");
                    String str5 = (String) this.f225292w;
                    this.v = 1;
                    if (aVar24.e(dVar4, str5, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                try {
                    if (i112 == 0) {
                        yhm.o.b(obj2);
                        om8.c cVar2 = (om8.c) obj3;
                        String str6 = (String) this.f225292w;
                        jm8.b bVar4 = cVar2.f226775b;
                        this.v = 1;
                        Object objD = bVar4.e.d(str6, true, this);
                        if (objD != aVar25) {
                            objD = Unit.f186387a;
                        }
                        if (objD == aVar25) {
                            return aVar25;
                        }
                    } else {
                        if (i112 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    return Unit.f186387a;
                } catch (Exception e) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                    return null;
                }
            case 22:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    kgm.c cVar3 = (kgm.c) ((k18.c) obj3).f180141c;
                    String str7 = (String) this.f225292w;
                    this.v = 1;
                    Object objD2 = ((un8.b) cVar3.f184018b).d.d(str7, true, this);
                    if (objD2 != aVar26) {
                        objD2 = Unit.f186387a;
                    }
                    if (objD2 != aVar26) {
                        objD2 = Unit.f186387a;
                    }
                    if (objD2 == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                d0 d0VarS1 = lg0.b.s1(((ona.i) this.f225292w).f226928r, ((e7l.q) obj3).f123425b, null, null, 2);
                this.v = 1;
                Object objB3 = nim.a.b(d0VarS1, this);
                return objB3 == aVar27 ? aVar27 : objB3;
            case 24:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    oo2.p pVar2 = (oo2.p) this.f225292w;
                    ol8.e eVar2 = new ol8.e(pVar2, (qo2.k) obj3, simpleName, i21);
                    this.v = 1;
                    if (pVar2.p2(this, eVar2) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                ook.c cVar4 = (ook.c) obj3;
                Object arrayList2 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    WaitlistService waitlistService = (WaitlistService) ((r) this.f225292w).f151364a;
                    String str8 = cVar4.f227140a;
                    List list = cVar4.f227141b;
                    if (list != null) {
                        List list2 = list;
                        arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((gok.b) it8.next()).name());
                        }
                    }
                    String str9 = cVar4.f227142c;
                    this.v = 1;
                    waitlistEntries = waitlistService.getWaitlistEntries(str8, arrayList, str9, this);
                    if (waitlistEntries != arrayList2) {
                    }
                    return arrayList2;
                }
                if (i116 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                waitlistEntries = obj2;
                Iterable iterable = (Iterable) waitlistEntries;
                arrayList2 = new ArrayList(w.t(iterable, 10));
                Iterator it9 = iterable.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(ue8.c.T((mok.b) it9.next()));
                }
                return arrayList2;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                up3.b bVar5 = ((oq3.m) this.f225292w).e;
                this.v = 1;
                Object objG = ((xq3.q) bVar5).g((d1) obj3, this);
                return objG == aVar29 ? aVar29 : objG;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xq3.d dVar5 = ((oq3.m) this.f225292w).f227725g;
                String strE = ((pq3.h) obj3).f238677b.e(4);
                this.v = 1;
                xr3.e eVar3 = dVar5.f308066a;
                eVar3.getClass();
                xr3.d dVar6 = new xr3.d(eVar3, strE, simpleName, i22);
                p0 p0Var4 = p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, dVar6, this);
                return objJ2 == aVar30 ? aVar30 : objJ2;
            case 28:
                oqg.b bVar6 = (oqg.b) obj3;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    jpg.e eVar4 = (jpg.e) this.f225292w;
                    if (eVar4 instanceof jpg.d) {
                        jpg.a aVar32 = ((jpg.d) eVar4).f177274a;
                        this.v = 1;
                        if (oqg.b.O2(bVar6, aVar32, this) == aVar31) {
                            return aVar31;
                        }
                    } else if (!(eVar4 instanceof jpg.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Unit unit = Unit.f186387a;
                bVar6.I2();
                return Unit.f186387a;
            default:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    u uVar = (u) this.f225292w;
                    ol8.e eVar5 = new ol8.e(uVar, (o) obj3, simpleName, 5);
                    this.v = 1;
                    if (uVar.p2(this, eVar5) == aVar33) {
                        return aVar33;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f225292w = obj2;
        this.f225293x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x2 x2Var, Continuation continuation) {
        super(2, continuation);
        this.u = 19;
        this.f225293x = x2Var;
    }
}
