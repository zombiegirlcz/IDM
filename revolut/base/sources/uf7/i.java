package uf7;

import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.screen.details.IncentiveRewardDetailsController;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ IncentiveRewardDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(IncentiveRewardDetailsController incentiveRewardDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = incentiveRewardDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            case 1:
                return new i(this.v, continuation, 1);
            default:
                return new i(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        IncentiveRewardDetailsController incentiveRewardDetailsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v(((f0) incentiveRewardDetailsController.e3()).u, false, null, 3);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var = (f0) incentiveRewardDetailsController.e3();
                j60.a.v(f0Var.u, false, null, 3);
                f0Var.l2(new c0(f0Var, null, 0), new y(f0Var, 1));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((f0) incentiveRewardDetailsController.e3()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
