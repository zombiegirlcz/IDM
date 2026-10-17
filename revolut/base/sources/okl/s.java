package okl;

import com.revolut.data.model.Data;
import com.revolut.sso.api.models.BankIdEvidence;
import com.revolut.sso.api.models.BioSignatureEvidence;
import com.revolut.sso.api.models.DAPEvidence;
import com.revolut.sso.api.models.SignatureEvidence;
import com.revolut.sso.impl.domain.models.AuthAction;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import yhm.m;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226238x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.sso.impl.ui.auth.n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226238x = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f226238x, continuation, 0);
                sVar.f226237w = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(this.f226238x, continuation, 1);
                sVar2.f226237w = obj2;
                return sVar2;
            case 2:
                s sVar3 = new s(this.f226238x, continuation, 2);
                sVar3.f226237w = obj2;
                return sVar3;
            case 3:
                s sVar4 = new s(this.f226238x, continuation, 3);
                sVar4.f226237w = obj2;
                return sVar4;
            case 4:
                s sVar5 = new s(this.f226238x, continuation, 4);
                sVar5.f226237w = obj2;
                return sVar5;
            case 5:
                s sVar6 = new s(this.f226238x, continuation, 5);
                sVar6.f226237w = obj2;
                return sVar6;
            case 6:
                s sVar7 = new s(this.f226238x, continuation, 6);
                sVar7.f226237w = obj2;
                return sVar7;
            default:
                s sVar8 = new s(this.f226238x, continuation, 7);
                sVar8.f226237w = obj2;
                return sVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((s) create((jkl.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((s) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((s) create((BioSignatureEvidence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((s) create((SignatureEvidence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((bjl.t0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        int i = this.u;
        int i2 = 2;
        com.revolut.sso.impl.ui.auth.n nVar = this.f226238x;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.f226237w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    jkl.i iVar = jkl.i.BANK_ID;
                    r rVar = new r(nVar, coroutineScope, null);
                    this.f226237w = null;
                    this.v = 1;
                    if (nVar.S2(true, iVar, rVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.f226237w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    jkl.i iVar2 = jkl.i.DAP;
                    t tVar = new t(nVar, coroutineScope2, null);
                    this.f226237w = null;
                    this.v = 1;
                    if (nVar.S2(true, iVar2, tVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                jkl.i iVar3 = (jkl.i) this.f226237w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.f226237w = null;
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.U2(nVar, iVar3, null, this, 2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                try {
                    if (i21 == 0) {
                        yhm.o.b(obj2);
                        m.Companion companion = yhm.m.INSTANCE;
                        Challenge f106299h = ((AuthenticationFlowContract$State) ((j2) nVar.m0.f22677a).getValue()).getF106299h();
                        Set setH = zhm.z0.h(f106299h != null ? f106299h.f106098a : null);
                        w wVar = new w(nVar, continuation, i2);
                        this.f226237w = null;
                        this.v = 1;
                        if (nVar.X2(true, setH, wVar, this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i21 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    objA = Unit.f186387a;
                    m.Companion companion2 = yhm.m.INSTANCE;
                    break;
                } catch (Throwable th10) {
                    m.Companion companion3 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                Throwable thA = yhm.m.a(objA);
                if (thA == null) {
                    return new yhm.m(objA);
                }
                nVar.D3(new Data(null, thA, false, 5, null));
                throw thA;
            case 4:
                String str = (String) this.f226237w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n1 n1Var = nVar.f106374p;
                AuthAction authActionR2 = nVar.R2(str);
                jkl.i iVar4 = jkl.i.WEB_AUTHN;
                this.f226237w = null;
                this.v = 1;
                Object objC = n1.c(n1Var, authActionR2, iVar4, this);
                return objC == aVar5 ? aVar5 : objC;
            case 5:
                BioSignatureEvidence bioSignatureEvidence = (BioSignatureEvidence) this.f226237w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    this.f226237w = null;
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(this.f226238x, null, bioSignatureEvidence, null, this, 5) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                SignatureEvidence signatureEvidence = (SignatureEvidence) this.f226237w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    this.f226237w = null;
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(this.f226238x, null, signatureEvidence, null, this, 5) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                bjl.t0 t0Var = (bjl.t0) this.f226237w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    boolean z = t0Var instanceof bjl.r0;
                    com.revolut.sso.impl.ui.auth.n nVar2 = this.f226238x;
                    if (z) {
                        bjl.r0 result = (bjl.r0) t0Var;
                        ((vkl.e) nVar2.f106376r).getClass();
                        Intrinsics.checkNotNullParameter(result, "result");
                        String challengeId = result.f16185a;
                        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                        BankIdEvidence bankIdEvidence = new BankIdEvidence(challengeId);
                        this.f226237w = null;
                        this.v = 1;
                        if (com.revolut.sso.impl.ui.auth.n.Q2(nVar2, null, bankIdEvidence, null, this, 5) == aVar8) {
                            return aVar8;
                        }
                    } else {
                        if (!(t0Var instanceof bjl.s0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bjl.s0 result2 = (bjl.s0) t0Var;
                        ((pml.e) nVar2.B).getClass();
                        Intrinsics.checkNotNullParameter(result2, "result");
                        String challengeId2 = result2.f16188a;
                        Intrinsics.checkNotNullParameter(challengeId2, "challengeId");
                        DAPEvidence dAPEvidence = new DAPEvidence(challengeId2);
                        this.f226237w = null;
                        this.v = 2;
                        if (com.revolut.sso.impl.ui.auth.n.Q2(nVar2, null, dAPEvidence, null, this, 5) == aVar8) {
                            return aVar8;
                        }
                    }
                } else {
                    if (i43 != 1 && i43 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
