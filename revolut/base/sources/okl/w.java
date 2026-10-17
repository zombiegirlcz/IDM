package okl;

import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.data.model.Data;
import com.revolut.sso.api.models.QrDelegatedEvidence;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$OtpInput;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$SimBinding;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226244w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.sso.impl.ui.auth.n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226244w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(this.f226244w, continuation, 0);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(this.f226244w, continuation, 1);
                wVar2.v = obj2;
                return wVar2;
            case 2:
                w wVar3 = new w(this.f226244w, continuation, 2);
                wVar3.v = obj2;
                return wVar3;
            case 3:
                w wVar4 = new w(this.f226244w, continuation, 3);
                wVar4.v = obj2;
                return wVar4;
            case 4:
                w wVar5 = new w(this.f226244w, continuation, 4);
                wVar5.v = obj2;
                return wVar5;
            case 5:
                w wVar6 = new w(this.f226244w, continuation, 5);
                wVar6.v = obj2;
                return wVar6;
            case 6:
                w wVar7 = new w(this.f226244w, continuation, 6);
                wVar7.v = obj2;
                return wVar7;
            case 7:
                w wVar8 = new w(this.f226244w, continuation, 7);
                wVar8.v = obj2;
                return wVar8;
            case 8:
                w wVar9 = new w(this.f226244w, continuation, 8);
                wVar9.v = obj2;
                return wVar9;
            case 9:
                w wVar10 = new w(this.f226244w, continuation, 9);
                wVar10.v = obj2;
                return wVar10;
            default:
                w wVar11 = new w(this.f226244w, continuation, 10);
                wVar11.v = obj2;
                return wVar11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w) create((gkl.e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((w) create((gkl.e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((w) create((gkl.e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((w) create((gkl.e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((w) create((gkl.e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((w) create((gkl.e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((w) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((w) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((w) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((w) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        jkl.i iVar;
        int i = this.u;
        int i2 = 1;
        Object[] objArr = 0;
        com.revolut.sso.impl.ui.auth.n nVar = this.f226244w;
        switch (i) {
            case 0:
                gkl.e0 e0Var = (gkl.e0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.q3(e0Var.f144443a, zhm.f0.f322471a);
                return Unit.f186387a;
            case 1:
                gkl.e0 e0Var2 = (gkl.e0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.q3(e0Var2.f144443a, zhm.f0.f322471a);
                return Unit.f186387a;
            case 2:
                gkl.e0 e0Var3 = (gkl.e0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.sso.impl.ui.auth.n.K2(nVar, e0Var3);
                return Unit.f186387a;
            case 3:
                gkl.e0 e0Var4 = (gkl.e0) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.sso.impl.ui.auth.n.K2(nVar, e0Var4);
                return Unit.f186387a;
            case 4:
                gkl.e0 e0Var5 = (gkl.e0) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String secret = e0Var5.f144443a.f106100c;
                if (secret == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Intrinsics.checkNotNullParameter(secret, "secret");
                nVar.h3(new QrDelegatedEvidence(secret));
                return Unit.f186387a;
            case 5:
                gkl.e0 e0Var6 = (gkl.e0) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.sso.impl.ui.auth.n.K2(nVar, e0Var6);
                return Unit.f186387a;
            case 6:
                nii.n1 n1Var = (nii.n1) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof nii.j1) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Unexpected clause click", null, h0Var);
                } else if ((n1Var instanceof nii.k1) || (n1Var instanceof nii.l1)) {
                    nVar.v3(true);
                } else {
                    if (!(n1Var instanceof nii.m1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", "Unexpected secondary button click", null, h0Var2);
                }
                return Unit.f186387a;
            case 7:
                nii.n1 n1Var2 = (nii.n1) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof nii.l1) {
                    nVar.l2(new v(nVar, objArr == true ? 1 : 0, 8), new yi5.b(26));
                }
                return Unit.f186387a;
            case 8:
                nii.n1 n1Var3 = (nii.n1) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var3 instanceof nii.k1) && nVar.l0.d() == null) {
                    nVar.v3(false);
                }
                return Unit.f186387a;
            case 9:
                nii.n1 n1Var4 = (nii.n1) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var4 instanceof nii.l1) {
                    nVar.C2(bjl.o.f16181a);
                }
                return Unit.f186387a;
            default:
                qki.d dVar = nVar.m0;
                yki.i iVar2 = nVar.l0;
                Data data = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gkl.h0 h0Var3 = (gkl.h0) data.component1();
                Throwable error = data.getError();
                boolean loading = data.getLoading();
                if (h0Var3 != null) {
                    nVar.d0(false, false);
                    if (h0Var3 instanceof gkl.d0) {
                        nVar.y3();
                    } else if (h0Var3 instanceof gkl.e0) {
                        Challenge challenge = ((gkl.e0) h0Var3).f144443a;
                        jkl.i iVar3 = challenge.f106098a;
                        nVar.L.a(new tll.g(challenge));
                        AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) iVar2.d();
                        if (authenticationFlowContract$Step instanceof AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$OtpInput) {
                            jkl.i iVar4 = ((AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$OtpInput) authenticationFlowContract$Step).f106324a.f106098a;
                            jkl.i iVar5 = jkl.i.SMS;
                            if ((iVar4 == iVar5 && iVar3 == jkl.i.TELEPHONE) || (iVar4 == jkl.i.TELEPHONE && iVar3 == iVar5)) {
                                nVar.D3(data);
                                return Unit.f186387a;
                            }
                            if (iVar4 != iVar3) {
                                nVar.q3(challenge, zhm.f0.f322471a);
                            }
                        } else if (!(authenticationFlowContract$Step instanceof AuthenticationFlowContract$Step$EvidenceRequiredForAuthentication$SimBinding)) {
                            nVar.q3(challenge, zhm.f0.f322471a);
                        } else {
                            if (!(((j2) dVar.f22677a).getValue() instanceof AuthenticationFlowContract$State)) {
                                AuthenticationFlowContract$Step authenticationFlowContract$Step2 = (AuthenticationFlowContract$Step) iVar2.d();
                                String simpleName = authenticationFlowContract$Step2 != null ? authenticationFlowContract$Step2.getClass().getSimpleName() : null;
                                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                                throw new IllegalStateException(m72.b.q(m.p((j2) dVar.f22677a, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
                            }
                            nVar.H2(dVar, new d1(nVar, challenge, i2));
                        }
                    } else if (h0Var3 instanceof gkl.f0) {
                        gkl.f0 f0Var = (gkl.f0) h0Var3;
                        nVar.s3(f0Var.f144445a, f0Var.f144446b, f0Var.f144447c);
                    } else {
                        if (!(h0Var3 instanceof gkl.g0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar.y3();
                    }
                } else if (!loading && error != null) {
                    nVar.d0(false, false);
                    if (!(error instanceof HandledNetworkException)) {
                        nVar.l1().M0(new aii.i(error, (aii.a) null, 6));
                        if (iVar2.d() == null) {
                            nVar.B2();
                        }
                    }
                }
                Challenge f106299h = ((AuthenticationFlowContract$State) ((j2) dVar.f22677a).getValue()).getF106299h();
                if (f106299h == null || (iVar = f106299h.f106098a) == null) {
                    return Unit.f186387a;
                }
                if (yjl.d.e(iVar) != null) {
                    nVar.D3(data);
                }
                return Unit.f186387a;
        }
    }
}
