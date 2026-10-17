package okl;

import com.revolut.kompot.common.ExternalDestination;
import com.revolut.sso.impl.domain.models.Challenge;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.domain.models.Identifier;
import com.revolut.sso.impl.domain.models.InitialAuthenticationCredential;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step;
import com.revolut.sso.impl.ui.password_flow.a;
import gnl.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f226160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226161b;

    public /* synthetic */ d(com.revolut.sso.impl.ui.auth.n nVar, int i) {
        this.f226160a = i;
        this.f226161b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v13 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        jkl.i iVar;
        int i = this.f226160a;
        int i2 = 0;
        com.revolut.sso.impl.ui.auth.n nVar = this.f226161b;
        int i3 = 6;
        switch (i) {
            case 0:
                bll.e outputData = (bll.e) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof bll.c) {
                    nVar.Z2(zhm.y0.b(jkl.i.CARD_PIN));
                } else {
                    if (!(outputData instanceof bll.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.l2(new oh4.i(nVar, outputData, (Continuation) simpleName, 7), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                vml.i result = (vml.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof vml.g) {
                    String value = ((vml.g) result).f290621a;
                    Intrinsics.checkNotNullParameter(value, "value");
                    nVar.o3(new Claim.Email(value));
                } else {
                    if (!Intrinsics.f(result, vml.h.f290622a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.l2(new oh4.i(nVar, gkl.m.EMAIL, (Continuation) simpleName, 13), new yi5.b(26));
                }
                return Unit.f186387a;
            case 2:
                af9.g result2 = (af9.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                String value2 = result2.f3968a;
                Intrinsics.checkNotNullParameter(value2, "value");
                nVar.o3(new Claim.Password(value2));
                return Unit.f186387a;
            case 3:
                gnl.i data = (gnl.i) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                qki.d dVar = nVar.m0;
                yki.i iVar2 = nVar.l0;
                j2 j2Var = (j2) dVar.f22677a;
                j2 j2Var2 = (j2) dVar.f22677a;
                if (!(j2Var.getValue() instanceof AuthenticationFlowContract$State)) {
                    AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) iVar2.d();
                    String simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : null;
                    kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                    throw new IllegalStateException(m72.b.q(m.p(j2Var2, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
                }
                nVar.H2(dVar, new l0(nVar, 0));
                ((akl.h) nVar.f106374p.f226220a).clear();
                if (data instanceof i.e) {
                    nVar.n2(new com.revolut.sso.impl.ui.auth.b(nVar, null), new whi.b(6));
                } else if (data instanceof gnl.j) {
                    Identifier identifier = ((gnl.j) data).f145038a;
                    if (identifier instanceof Identifier.Email) {
                        com.revolut.sso.impl.ui.auth.n.j3(nVar, AuthenticationFlowContract$Step.EnterEmailWhenLostAccess.f106316a);
                    } else {
                        if (!(identifier instanceof Identifier.Phone)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        com.revolut.sso.impl.ui.auth.n.j3(nVar, AuthenticationFlowContract$Step.EnterPhoneWhenLostAccess.f106317a);
                    }
                } else if (data instanceof gnl.k) {
                    if (!(j2Var2.getValue() instanceof AuthenticationFlowContract$State.SignIn)) {
                        AuthenticationFlowContract$Step authenticationFlowContract$Step2 = (AuthenticationFlowContract$Step) iVar2.d();
                        simpleName = authenticationFlowContract$Step2 != null ? authenticationFlowContract$Step2.getClass().getSimpleName() : 0;
                        kotlin.jvm.internal.p0 p0Var2 = kotlin.jvm.internal.o0.f186429a;
                        throw new IllegalStateException(m72.b.q(m.p(j2Var2, p0Var2), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var2.b(AuthenticationFlowContract$State.SignIn.class).m(), "\n                Actual: ")).toString());
                    }
                    nVar.H2(dVar, new nyb.q(nVar, data, 5));
                    nVar.n2(new com.revolut.sso.impl.ui.auth.c(nVar, data, null), new whi.b(6));
                } else if (data instanceof gnl.l) {
                    nVar.n2(new com.revolut.sso.impl.ui.auth.d(nVar, ((gnl.l) data).f145040a, null), new whi.b(6));
                } else if (data instanceof i.a) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", data.getClass() + " is not supported here. Please review screen configuration", null, h0Var);
                } else if (data instanceof i.d) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", data.getClass() + " is not supported here. Please review screen configuration", null, h0Var2);
                } else if (data instanceof i.b) {
                    nVar.n2(new s(nVar, null, 0), new whi.b(6));
                } else if (data instanceof i.c) {
                    nVar.n2(new s(nVar, null, 1), new whi.b(6));
                } else {
                    if (!(data instanceof i.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.n2(new v(nVar, simpleName, i2), new whi.b(6));
                }
                return Unit.f186387a;
            case 4:
                ill.d outputData2 = (ill.d) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof ill.b) {
                    nVar.Z2(zhm.d0.i1(((ill.b) outputData2).f162263a));
                } else {
                    if (!(outputData2 instanceof ill.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.n2(new oh4.i(nVar, outputData2, (Continuation) simpleName, 8), new whi.b(6));
                }
                return Unit.f186387a;
            case 5:
                qki.d dVar2 = nVar.m0;
                com.revolut.sso.impl.ui.password_flow.a result3 = (com.revolut.sso.impl.ui.password_flow.a) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (Intrinsics.f(result3, a.C0639a.f106626a) || Intrinsics.f(result3, a.b.f106627a)) {
                    if (result3 instanceof a.C0639a) {
                        iVar = jkl.i.PIN;
                    } else {
                        if (!(result3 instanceof a.b)) {
                            throw new IllegalStateException(a10.b.s("impossible state: ", result3.getClass().getName(), " result is not expected"));
                        }
                        iVar = jkl.i.PASSWORD;
                    }
                    if ((((j2) dVar2.f22677a).getValue() instanceof AuthenticationFlowContract$State.SignIn) && (((AuthenticationFlowContract$State) ((j2) dVar2.f22677a).getValue()).getF106296b() instanceof InitialAuthenticationCredential.Account)) {
                        nVar.n2(new com.revolut.sso.impl.ui.auth.e(nVar, iVar, null), new whi.b(6));
                    } else {
                        nVar.Z2(zhm.y0.b(iVar));
                    }
                } else if (result3 instanceof jol.e) {
                    nVar.n2(new r0(nVar, result3, (Continuation) null), new whi.b(6));
                } else {
                    if (!(result3 instanceof jol.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.n2(new r0(result3, nVar, (Continuation) null), new whi.b(6));
                }
                return Unit.f186387a;
            case 6:
                lml.e result4 = (lml.e) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (!Intrinsics.f(result4, lml.e.f197096a)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVar.l2(new v(nVar, simpleName, 3), new yi5.b(26));
                return Unit.f186387a;
            case 7:
                vkl.c result5 = (vkl.c) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (result5 instanceof vkl.a) {
                    nVar.n2(new v(nVar, simpleName, 1), new whi.b(6));
                } else {
                    if (!(result5 instanceof vkl.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.C1(new ExternalDestination.ByIntent(((vkl.b) result5).f289986a, null));
                }
                return Unit.f186387a;
            case 8:
                pol.k result6 = (pol.k) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                if (result6 instanceof pol.h) {
                    String value3 = ((pol.h) result6).d;
                    Intrinsics.checkNotNullParameter(value3, "value");
                    nVar.o3(new Claim.Phone(value3));
                } else {
                    if (!Intrinsics.f(result6, pol.j.f238054a)) {
                        if (Intrinsics.f(result6, pol.i.f238053a)) {
                            throw new IllegalStateException("Phone creation does not support sign-in as an alternative action. Please, review screen configuration");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.l2(new oh4.i(nVar, gkl.m.PHONE, (Continuation) simpleName, 13), new yi5.b(26));
                }
                return Unit.f186387a;
            case 9:
                qki.d dVar3 = nVar.m0;
                ukl.f outputData3 = (ukl.f) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                boolean zF = Intrinsics.f(outputData3, ukl.c.f280794a);
                bjl.f0 f0Var = bjl.f0.f16165a;
                bjl.r rVar = bjl.r.f16184a;
                bjl.v vVar = bjl.v.f16190a;
                bjl.o oVar = bjl.o.f16181a;
                if (zF) {
                    AuthenticationFlowContract$State authenticationFlowContract$State = (AuthenticationFlowContract$State) ((j2) dVar3.f22677a).getValue();
                    if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.AccessRecovery) {
                        nVar.C2(oVar);
                    } else if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignIn) {
                        if (nVar.F.b4()) {
                            nVar.C2(new bjl.a0(false));
                        } else {
                            oki.h.D2(nVar.l0);
                        }
                    } else if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) {
                        nVar.C2(vVar);
                    } else if (authenticationFlowContract$State instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) {
                        nVar.C2(rVar);
                    } else {
                        if (!(authenticationFlowContract$State instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar.k3(f0Var);
                    }
                } else if (outputData3 instanceof ukl.d) {
                    nVar.d3(((ukl.d) outputData3).f280795a);
                } else {
                    if (!Intrinsics.f(outputData3, ukl.e.f280796a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AuthenticationFlowContract$State authenticationFlowContract$State2 = (AuthenticationFlowContract$State) ((j2) dVar3.f22677a).getValue();
                    if (authenticationFlowContract$State2 instanceof AuthenticationFlowContract$State.AccessRecovery) {
                        nVar.C2(oVar);
                    } else if (authenticationFlowContract$State2 instanceof AuthenticationFlowContract$State.SignIn) {
                        nVar.u3(false);
                    } else if (authenticationFlowContract$State2 instanceof AuthenticationFlowContract$State.OperationBoundAuthentication) {
                        nVar.k3(vVar);
                    } else if (authenticationFlowContract$State2 instanceof AuthenticationFlowContract$State.ExternalClientAuthentication) {
                        nVar.C2(rVar);
                    } else {
                        if (!(authenticationFlowContract$State2 instanceof AuthenticationFlowContract$State.SignInWithRevolutIdAuthentication)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar.k3(f0Var);
                    }
                }
                return Unit.f186387a;
            case 10:
                knl.c result7 = (knl.c) obj2;
                Intrinsics.checkNotNullParameter(result7, "result");
                if (Intrinsics.f(result7, knl.a.f186192a)) {
                    nVar.n2(new v(nVar, simpleName, i3), new whi.b(6));
                } else {
                    if (!Intrinsics.f(result7, knl.b.f186193a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.n2(new v(nVar, simpleName, 7), new whi.b(6));
                }
                return Unit.f186387a;
            case 11:
                pml.c result8 = (pml.c) obj2;
                Intrinsics.checkNotNullParameter(result8, "result");
                if (result8 instanceof pml.a) {
                    nVar.n2(new v(nVar, simpleName, 2), new whi.b(6));
                } else {
                    if (!(result8 instanceof pml.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.C1(new ExternalDestination.ByIntent(((pml.b) result8).f237646a, null));
                }
                return Unit.f186387a;
            case 12:
                vml.i result9 = (vml.i) obj2;
                Intrinsics.checkNotNullParameter(result9, "result");
                if (!(result9 instanceof vml.g)) {
                    throw new IllegalStateException("Email required to launch access recovery flow");
                }
                String value4 = ((vml.g) result9).f290621a;
                Intrinsics.checkNotNullParameter(value4, "value");
                qki.d dVar4 = nVar.m0;
                if (((j2) dVar4.f22677a).getValue() instanceof AuthenticationFlowContract$State.SignIn) {
                    nVar.H2(dVar4, new i0(nVar, nVar, value4, i2));
                    nVar.l2(new h0(nVar, value4, null), new yi5.b(26));
                    return Unit.f186387a;
                }
                AuthenticationFlowContract$Step authenticationFlowContract$Step3 = (AuthenticationFlowContract$Step) nVar.l0.d();
                String simpleName2 = authenticationFlowContract$Step3 != null ? authenticationFlowContract$Step3.getClass().getSimpleName() : null;
                kotlin.jvm.internal.p0 p0Var3 = kotlin.jvm.internal.o0.f186429a;
                throw new IllegalStateException(m72.b.q(m.p((j2) dVar4.f22677a, p0Var3), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName2, ",\n                Expected: ", p0Var3.b(AuthenticationFlowContract$State.SignIn.class).m(), "\n                Actual: ")).toString());
            case 13:
                znl.c result10 = (znl.c) obj2;
                Intrinsics.checkNotNullParameter(result10, "result");
                String value5 = result10.f323835a;
                Intrinsics.checkNotNullParameter(value5, "value");
                nVar.o3(new Claim.Pin(value5));
                return Unit.f186387a;
            case 14:
                mnl.f outputData4 = (mnl.f) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                if (outputData4 instanceof mnl.d) {
                    nVar.m3(((mnl.d) outputData4).f207518a);
                } else if (outputData4 instanceof mnl.e) {
                    nVar.l2(new m0(nVar, simpleName, i2), new yi5.b(26));
                } else {
                    if (!(outputData4 instanceof mnl.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.d3(((mnl.c) outputData4).f207517a);
                    Unit unit = Unit.f186387a;
                }
                return Unit.f186387a;
            case 15:
                vnl.k result11 = (vnl.k) obj2;
                Intrinsics.checkNotNullParameter(result11, "result");
                if (result11 instanceof vnl.i) {
                    nVar.n2(new oh4.i(nVar, result11, (Continuation) simpleName, 10), new whi.b(6));
                } else {
                    if (!(result11 instanceof vnl.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.v3(false);
                }
                return Unit.f186387a;
            case 16:
                gnl.i data2 = (gnl.i) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                if (data2 instanceof gnl.k) {
                    Identifier identifier2 = ((gnl.k) data2).f145039a;
                    if (identifier2 instanceof Identifier.Email) {
                        nVar.n2(new v0(nVar, ((Claim.Email) yjl.h.b(identifier2)).f106127a, null), new whi.b(6));
                    } else {
                        if (!(identifier2 instanceof Identifier.Phone)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar.n2(new x0(nVar, ((Claim.Phone) yjl.h.b(identifier2)).f106131a, null), new whi.b(6));
                    }
                } else {
                    if (!(data2 instanceof i.e) && !(data2 instanceof gnl.j) && !(data2 instanceof i.a) && !(data2 instanceof gnl.l) && !(data2 instanceof i.b) && !(data2 instanceof i.c) && !(data2 instanceof i.d) && !(data2 instanceof i.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", data2.getClass() + " is not supported here. Please review screen configuration", null, h0Var3);
                    Unit unit2 = Unit.f186387a;
                }
                return Unit.f186387a;
            case 17:
                qkl.c result12 = (qkl.c) obj2;
                Intrinsics.checkNotNullParameter(result12, "result");
                if (result12 instanceof qkl.a) {
                    nVar.k3(((qkl.a) result12).f247024a);
                } else {
                    if (!(result12 instanceof qkl.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(nVar.l0);
                }
                return Unit.f186387a;
            case 18:
                tni.f result13 = (tni.f) obj2;
                Intrinsics.checkNotNullParameter(result13, "result");
                if (result13 instanceof tni.c) {
                    nVar.Z2(zhm.y0.b(jkl.i.EMAIL));
                } else if (result13 instanceof tni.d) {
                    nVar.l2(new k0(nVar, result13, simpleName, i2), new yi5.b(26));
                } else {
                    if (!(result13 instanceof tni.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.l2(new k0(nVar, result13, simpleName, 1), new yi5.b(26));
                }
                return Unit.f186387a;
            case 19:
                lni.i result14 = (lni.i) obj2;
                Intrinsics.checkNotNullParameter(result14, "result");
                a2 a2Var = nVar.f106373k0;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                if (result14 instanceof lni.d) {
                    nVar.n2(new s(nVar, null, 3), new whi.b(6));
                } else if (result14 instanceof lni.e) {
                    nVar.n2(new nyd.j(nVar, result14, (Continuation) simpleName, 19), new whi.b(6));
                } else if (result14 instanceof lni.f) {
                    nVar.n2(new d0(nVar, result14, simpleName, i2), new whi.b(6));
                } else if (result14 instanceof lni.h) {
                    nVar.n2(new d0(nVar, result14, simpleName, 1), new whi.b(6));
                } else {
                    if (!(result14 instanceof lni.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.n2(new d0(nVar, result14, simpleName, 2), new whi.b(6));
                }
                return Unit.f186387a;
            case 20:
                tnl.d result15 = (tnl.d) obj2;
                Intrinsics.checkNotNullParameter(result15, "result");
                if (result15 instanceof tnl.a) {
                    String str = ((tnl.a) result15).f272467a;
                    Challenge f106299h = ((AuthenticationFlowContract$State) ((j2) nVar.m0.f22677a).getValue()).getF106299h();
                    String str2 = f106299h != null ? f106299h.f106100c : null;
                    if (str.equals(str2)) {
                        nVar.l2(new e0(nVar, str2, simpleName, i2), new yi5.b(26));
                    } else {
                        nVar.z3();
                    }
                } else if (Intrinsics.f(result15, tnl.b.f272468a)) {
                    nVar.z3();
                } else {
                    if (!Intrinsics.f(result15, tnl.c.f272469a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.n2(new v(nVar, simpleName, 4), new whi.b(6));
                }
                return Unit.f186387a;
            case 21:
                pol.k result16 = (pol.k) obj2;
                Intrinsics.checkNotNullParameter(result16, "result");
                if (!(result16 instanceof pol.h)) {
                    throw new IllegalStateException("Phone required to launch access recovery flow");
                }
                String value6 = ((pol.h) result16).d;
                Intrinsics.checkNotNullParameter(value6, "value");
                qki.d dVar5 = nVar.m0;
                if (((j2) dVar5.f22677a).getValue() instanceof AuthenticationFlowContract$State.SignIn) {
                    nVar.H2(dVar5, new i0(nVar, nVar, value6, 1));
                    nVar.l2(new j0(nVar, value6, null), new yi5.b(26));
                    return Unit.f186387a;
                }
                AuthenticationFlowContract$Step authenticationFlowContract$Step4 = (AuthenticationFlowContract$Step) nVar.l0.d();
                String simpleName3 = authenticationFlowContract$Step4 != null ? authenticationFlowContract$Step4.getClass().getSimpleName() : null;
                kotlin.jvm.internal.p0 p0Var4 = kotlin.jvm.internal.o0.f186429a;
                throw new IllegalStateException(m72.b.q(m.p((j2) dVar5.f22677a, p0Var4), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName3, ",\n                Expected: ", p0Var4.b(AuthenticationFlowContract$State.SignIn.class).m(), "\n                Actual: ")).toString());
            default:
                vnl.d result17 = (vnl.d) obj2;
                Intrinsics.checkNotNullParameter(result17, "result");
                if (result17 instanceof vnl.a) {
                    nVar.n2(new oh4.i(nVar, result17, (Continuation) simpleName, 9), new whi.b(6));
                } else {
                    if (!(result17 instanceof vnl.b) && !(result17 instanceof vnl.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.v3(false);
                }
                return Unit.f186387a;
        }
    }
}
