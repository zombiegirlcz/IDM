package qf7;

import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryParams;
import java.util.Map;
import kf7.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f245262w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f245262w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f245262w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f245262w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f245262w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f245262w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((LotteryParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        i iVar = this.f245262w;
        switch (i) {
            case 0:
                IncentiveRewardDetailsParams incentiveRewardDetailsParams = (IncentiveRewardDetailsParams) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = iVar.f245271c;
                i.Companion.getClass();
                return j6.a.k(hf7.c.class, cVar, c.c(incentiveRewardDetailsParams));
            case 1:
                Map map = (Map) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return j6.a.k(gf7.o.class, iVar.f245271c, i.a(map));
            case 2:
                LotteryParams lotteryParams = (LotteryParams) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar2 = iVar.f245271c;
                i.Companion.getClass();
                return j6.a.k(com.revolut.feature.incentive_reward.impl.model.lotteries.b.class, cVar2, c.a(lotteryParams));
            default:
                LotteryParams lotteryParams2 = (LotteryParams) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar3 = iVar.f245271c;
                i.Companion.getClass();
                return j6.a.k(r.class, cVar3, c.b(lotteryParams2));
        }
    }
}
