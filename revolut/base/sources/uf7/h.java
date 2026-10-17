package uf7;

import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.screen.details.IncentiveRewardDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IncentiveRewardDetailsController f279608w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(IncentiveRewardDetailsController incentiveRewardDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f279608w = incentiveRewardDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f279608w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f279608w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h(this.f279608w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
            default:
                h hVar4 = new h(this.f279608w, continuation, 3);
                hVar4.v = obj2;
                return hVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 17;
        Continuation continuation = null;
        IncentiveRewardDetailsController incentiveRewardDetailsController = this.f279608w;
        switch (i) {
            case 0:
                w screenItemParcel = (w) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var = (f0) incentiveRewardDetailsController.d();
                f0Var.getClass();
                Intrinsics.checkNotNullParameter(screenItemParcel, "screenItemParcel");
                f0Var.n2(new u2i.g(f0Var, screenItemParcel, continuation, i2), new whi.b(6));
                break;
            case 1:
                w screenItemParcel2 = (w) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var2 = (f0) incentiveRewardDetailsController.d();
                f0Var2.getClass();
                Intrinsics.checkNotNullParameter(screenItemParcel2, "screenItemParcel");
                f0Var2.n2(new u2i.g(f0Var2, screenItemParcel2, continuation, i2), new whi.b(6));
                break;
            case 2:
                w screenItemParcel3 = (w) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var3 = (f0) incentiveRewardDetailsController.d();
                f0Var3.getClass();
                Intrinsics.checkNotNullParameter(screenItemParcel3, "screenItemParcel");
                f0Var3.n2(new u2i.g(f0Var3, screenItemParcel3, continuation, i2), new whi.b(6));
                break;
            default:
                a3 transaction = (a3) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var4 = (f0) incentiveRewardDetailsController.d();
                f0Var4.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                f0Var4.n2(new u2i.g(f0Var4, transaction, continuation, 18), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
