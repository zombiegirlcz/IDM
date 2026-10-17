package qf7;

import com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryParams;
import com.revolut.feature.incentive_reward.impl.network.IncentiveRewardService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ LotteryParams f245263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f245264x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i iVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f245264x = iVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        LotteryParams lotteryParams = (LotteryParams) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e eVar = new e(this.f245264x, continuation, 0);
                eVar.f245263w = lotteryParams;
                return eVar.invokeSuspend(Unit.f186387a);
            default:
                e eVar2 = new e(this.f245264x, continuation, 1);
                eVar2.f245263w = lotteryParams;
                return eVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                LotteryParams lotteryParams = this.f245263w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                IncentiveRewardService incentiveRewardService = this.f245264x.f245269a;
                String str = lotteryParams.f74855a;
                this.f245263w = null;
                this.v = 1;
                Object lotteryDrawDetails = incentiveRewardService.getLotteryDrawDetails(str, this);
                return lotteryDrawDetails == aVar ? aVar : lotteryDrawDetails;
            default:
                LotteryParams lotteryParams2 = this.f245263w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                IncentiveRewardService incentiveRewardService2 = this.f245264x.f245269a;
                String str2 = lotteryParams2.f74855a;
                this.f245263w = null;
                this.v = 1;
                Object lotteryEnrollmentDetails = incentiveRewardService2.getLotteryEnrollmentDetails(str2, this);
                return lotteryEnrollmentDetails == aVar2 ? aVar2 : lotteryEnrollmentDetails;
        }
    }
}
