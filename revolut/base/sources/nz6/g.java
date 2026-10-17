package nz6;

import akb.s;
import au6.r1;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$Step$Restriction$AccountPending;
import et6.y1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nb6.p;
import nii.c0;
import skm.e0;
import skm.p0;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.onboarding.flow.b f220961w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f220961w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f220961w, continuation, 0);
            case 1:
                return new g(this.f220961w, continuation, 1);
            case 2:
                return new g(this.f220961w, continuation, 2);
            default:
                return new g(this.f220961w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar;
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar2 = this.f220961w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    bVar2.u.getClass();
                    c0 c0VarB = rz6.a.b();
                    e eVar = new e(bVar2.u, 0);
                    lic.a aVar2 = new lic.a(bVar2, 6);
                    f fVar = new f(bVar2, null);
                    this.v = 1;
                    obj2 = n14.k.S(bVar2.X(), c0VarB, aVar2, eVar, fVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                if (((nii.h) obj2) instanceof nii.g) {
                    com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.I2(bVar2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar3 = this.f220961w;
                if (i3 == 0) {
                    o.b(obj2);
                    bVar3.u.getClass();
                    c0 c0VarB2 = rz6.a.b();
                    e eVar2 = new e(bVar3.u, 1);
                    p pVar = new p(1, bVar3, com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.class, "refreshAccountDetailsAndRetryIfNotOnboarded", "refreshAccountDetailsAndRetryIfNotOnboarded(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 23);
                    this.v = 1;
                    obj2 = n14.k.V(bVar3, c0VarB2, null, eVar2, pVar, this, 2);
                    bVar = bVar3;
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    bVar = bVar3;
                }
                if (!(((nii.h) obj2) instanceof nii.g)) {
                    return bVar.C1(bVar.M2());
                }
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.I2(bVar);
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar4 = this.f220961w;
                if (i5 == 0) {
                    o.b(obj2);
                    qz6.i iVar = bVar4.f73993p;
                    this.v = 1;
                    obj2 = iVar.a(this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                qz6.g gVar = (qz6.g) obj2;
                if (gVar instanceof qz6.a) {
                    this.v = 2;
                    if (com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.K2(bVar4, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (!(gVar instanceof qz6.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qz6.f fVar2 = (qz6.f) gVar;
                    yki.i iVar2 = bVar4.D;
                    if (fVar2 instanceof qz6.b) {
                        oki.h.t2(bVar4, iVar2, new FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed(((qz6.b) fVar2).f250371a), true, null, false, 12);
                    } else if (fVar2 instanceof qz6.c) {
                        oki.h.D2(iVar2);
                    } else if (fVar2 instanceof qz6.d) {
                        oki.h.t2(bVar4, iVar2, new FreelancerOnboardingFlowContract$Step$Restriction$AccountPending(((qz6.d) fVar2).f250373a), true, null, false, 12);
                    } else {
                        if (!(fVar2 instanceof qz6.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar4.C1(u0.b(((qz6.e) fVar2).f250374a));
                        oki.h.D2(iVar2);
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    y1 y1Var = bVar2.f73994q;
                    this.v = 1;
                    r1 r1Var = y1Var.f129383a;
                    r1Var.getClass();
                    s sVar = new s(r1Var, continuation, 21);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, sVar, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                bVar2.H2(bVar2.C, new nj8.b((String) obj2, 22));
                return Unit.f186387a;
        }
    }
}
