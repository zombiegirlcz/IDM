package bdk;

import adk.l;
import com.revolut.retail.feature.plan_rewards.impl.data.service.MilestoneRewardsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f14607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f14607w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f14607w, continuation, 0);
            case 1:
                return new b(this.f14607w, continuation, 1);
            default:
                return new b(this.f14607w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    MilestoneRewardsService milestoneRewardsService = this.f14607w.f14608a;
                    this.v = 1;
                    obj2 = milestoneRewardsService.getOptInStatus(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(((l) obj2).f3402a);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    MilestoneRewardsService milestoneRewardsService2 = this.f14607w.f14608a;
                    this.v = 1;
                    if (milestoneRewardsService2.optInToMilestoneRewards(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                c cVar = this.f14607w;
                if (i3 == 0) {
                    o.b(obj2);
                    MilestoneRewardsService milestoneRewardsService3 = cVar.f14608a;
                    this.v = 1;
                    if (milestoneRewardsService3.optOutFromMilestoneRewards(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                x4l.c cVar2 = cVar.d;
                Unit unit = Unit.f186387a;
                this.v = 2;
                if (cVar2.e(unit, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
        }
    }
}
