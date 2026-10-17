package udk;

import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.screen.PlanRewardsRevealScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PlanRewardsRevealScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PlanRewardsRevealScreen planRewardsRevealScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = planRewardsRevealScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            case 3:
                return new c(this.v, continuation, 3);
            default:
                return new c(this.v, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        e eVar = e.f279255a;
        l lVar = l.f279261a;
        PlanRewardsRevealScreen planRewardsRevealScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                planRewardsRevealScreen.e3().C2(eVar);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVarE3 = planRewardsRevealScreen.e3();
                xck.t tVar = (xck.t) ((d) ((j2) zVarE3.f279283x.f22677a).getValue()).f279252a.getContent();
                if (tVar != null) {
                    xck.s sVar = tVar.f;
                    if (sVar instanceof xck.r) {
                        zVarE3.C2(new g(((xck.r) sVar).f304181a));
                    } else if (sVar instanceof xck.p) {
                        zVarE3.C2(new f(((xck.p) sVar).f304178a));
                    } else {
                        if (!(sVar instanceof xck.q)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zVarE3.C2(eVar);
                    }
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVarE32 = planRewardsRevealScreen.e3();
                zVarE32.H2(zVarE32.f279283x, new ud3.m(13));
                zVarE32.I2();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVarE33 = planRewardsRevealScreen.e3();
                if (Intrinsics.f(((d) ((j2) zVarE33.f279283x.f22677a).getValue()).f279254c, lVar)) {
                    zVarE33.J2(true);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVarE34 = planRewardsRevealScreen.e3();
                if (Intrinsics.f(((d) ((j2) zVarE34.f279283x.f22677a).getValue()).f279254c, lVar)) {
                    zVarE34.J2(false);
                }
                return Unit.f186387a;
        }
    }
}
