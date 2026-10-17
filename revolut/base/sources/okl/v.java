package okl;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$State;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$Step;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f226242w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.sso.impl.ui.auth.n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226242w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f226242w, continuation, 0);
            case 1:
                return new v(this.f226242w, continuation, 1);
            case 2:
                return new v(this.f226242w, continuation, 2);
            case 3:
                return new v(this.f226242w, continuation, 3);
            case 4:
                return new v(this.f226242w, continuation, 4);
            case 5:
                return new v(this.f226242w, continuation, 5);
            case 6:
                return new v(this.f226242w, continuation, 6);
            case 7:
                return new v(this.f226242w, continuation, 7);
            case 8:
                return new v(this.f226242w, continuation, 8);
            case 9:
                return new v(this.f226242w, continuation, 9);
            case 10:
                return new v(this.f226242w, continuation, 10);
            default:
                return new v(this.f226242w, continuation, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v12 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objX;
        int i = this.u;
        int i2 = 2;
        com.revolut.sso.impl.ui.auth.n nVar = this.f226242w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    jkl.i iVar = jkl.i.UAE_PASS;
                    u uVar = new u(nVar, null);
                    this.v = 1;
                    if (nVar.S2(true, iVar, uVar, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    Set setB = zhm.y0.b(jkl.i.BANK_ID);
                    this.v = 1;
                    if (nVar.X2(true, setB, new w(nVar, null, 1), this) == aVar2) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    Set setB2 = zhm.y0.b(jkl.i.DAP);
                    this.v = 1;
                    if (nVar.X2(true, setB2, new w(nVar, null, 1), this) == aVar3) {
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
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(this.f226242w, null, null, null, this, 7) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    Set setB3 = zhm.y0.b(jkl.i.OKTA);
                    this.v = 1;
                    if (nVar.X2(true, setB3, new w(nVar, null, 1), this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    jkl.i iVar2 = jkl.i.QR_DELEGATED;
                    w wVar = new w(nVar, simpleName, 4);
                    this.v = 1;
                    if (nVar.S2(false, iVar2, wVar, this) == aVar6) {
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
                com.revolut.sso.impl.ui.auth.n nVar2 = this.f226242w;
                yki.i iVar3 = nVar2.l0;
                qki.d dVar = nVar2.m0;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    knl.d dVar2 = nVar2.O;
                    this.v = 1;
                    z1 z1Var = ((knl.h) dVar2).o;
                    b.Companion companion = kotlin.time.b.INSTANCE;
                    objX = vkm.q.x(zi0.c.M(z1Var, null, kotlin.time.c.h(10000L, pkm.e.MILLISECONDS), null), this);
                    if (objX == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i33 != 1) {
                        if (i33 == 2) {
                            yhm.o.b(obj2);
                            return Unit.f186387a;
                        }
                        if (i33 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objX = obj2;
                }
                LocationDomain locationDomain = (LocationDomain) objX;
                if (locationDomain == null) {
                    if (!(((j2) dVar.f22677a).getValue() instanceof AuthenticationFlowContract$State)) {
                        AuthenticationFlowContract$Step authenticationFlowContract$Step = (AuthenticationFlowContract$Step) iVar3.d();
                        String simpleName = authenticationFlowContract$Step != null ? authenticationFlowContract$Step.getClass().getSimpleName() : null;
                        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                        throw new IllegalStateException(m72.b.q(m.p((j2) dVar.f22677a, p0Var), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
                    }
                    nVar2.H2(dVar, new l0(nVar2, 1));
                    this.v = 2;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(nVar2, null, null, null, this, 7) == aVar7) {
                        return aVar7;
                    }
                    return Unit.f186387a;
                }
                if (!(((j2) dVar.f22677a).getValue() instanceof AuthenticationFlowContract$State)) {
                    AuthenticationFlowContract$Step authenticationFlowContract$Step2 = (AuthenticationFlowContract$Step) iVar3.d();
                    simpleName = authenticationFlowContract$Step2 != null ? authenticationFlowContract$Step2.getClass().getSimpleName() : 0;
                    kotlin.jvm.internal.p0 p0Var2 = kotlin.jvm.internal.o0.f186429a;
                    throw new IllegalStateException(m72.b.q(m.p((j2) dVar.f22677a, p0Var2), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName, ",\n                Expected: ", p0Var2.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
                }
                nVar2.H2(dVar, new nyb.q(nVar2, locationDomain, 6));
                this.v = 3;
                if (com.revolut.sso.impl.ui.auth.n.Q2(nVar2, null, null, null, this, 7) == aVar7) {
                    return aVar7;
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.sso.impl.ui.auth.n nVar3 = this.f226242w;
                    qki.d dVar3 = nVar3.m0;
                    if (!(((j2) dVar3.f22677a).getValue() instanceof AuthenticationFlowContract$State)) {
                        AuthenticationFlowContract$Step authenticationFlowContract$Step3 = (AuthenticationFlowContract$Step) nVar3.l0.d();
                        String simpleName2 = authenticationFlowContract$Step3 != null ? authenticationFlowContract$Step3.getClass().getSimpleName() : null;
                        kotlin.jvm.internal.p0 p0Var3 = kotlin.jvm.internal.o0.f186429a;
                        throw new IllegalStateException(m72.b.q(m.p((j2) dVar3.f22677a, p0Var3), v0.a.m("Authentication flow has unexpected state.\n                Current step: ", simpleName2, ",\n                Expected: ", p0Var3.b(AuthenticationFlowContract$State.class).m(), "\n                Actual: ")).toString());
                    }
                    nVar3.H2(dVar3, new l0(nVar3, 2));
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(nVar3, null, null, null, this, 7) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    jkl.i iVar4 = jkl.i.IN_SMS;
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.U2(nVar, iVar4, null, this, 2) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    b1 b1Var = new b1(nVar, simpleName, i2);
                    this.v = 1;
                    if (nVar.p2(this, b1Var) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.sso.impl.ui.auth.n.Q2(this.f226242w, null, null, null, this, 7) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                try {
                    if (i92 == 0) {
                        yhm.o.b(obj2);
                        gu2.e eVar = nVar.v;
                        this.v = 1;
                        if (eVar.Q(this) == aVar12) {
                            return aVar12;
                        }
                    } else {
                        if (i92 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    return Unit.f186387a;
                } catch (Exception e) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
        }
    }
}
