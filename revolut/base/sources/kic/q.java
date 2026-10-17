package kic;

import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import te0.w;
import tfm.n4;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rewards.impl.ui.details.flow.b f184212w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.rewards.impl.ui.details.flow.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f184212w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f184212w, continuation, 0);
            default:
                return new q(this.f184212w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.rewards.impl.ui.details.flow.b bVar = this.f184212w;
                    bgc.e eVar = bVar.f84940p;
                    PerkDetailsFlowContract$InputData perkDetailsFlowContract$InputData = bVar.o;
                    n4 n4VarE = ((ugc.g) eVar).h(perkDetailsFlowContract$InputData.f84922a, perkDetailsFlowContract$InputData.f, true).replay(1).e();
                    Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
                    vkm.d dVarB = rd0.e.b(ue0.e.q(w.l(n4VarE, pd.b.r(n4VarE, new i(bVar, 0))), y0.b(new Pair("PerkDetailsFlowModel", "observeSteps"))));
                    p pVar = new p(bVar);
                    this.v = 1;
                    if (dVarB.collect(pVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.rewards.impl.ui.details.flow.b bVar2 = this.f184212w;
                m mVar = new m(bVar2, null, 3);
                this.v = 1;
                Object objB = pu7.a.B(bVar2.k, "PERK_DETAILS_RELOAD_TASK_ID", mVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
