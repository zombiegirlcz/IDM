package o17;

import au6.k2;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import et6.a3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a f221332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FreelancerOrder f221333x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar, FreelancerOrder freelancerOrder, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f221332w = aVar;
        this.f221333x = freelancerOrder;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f221332w, this.f221333x, continuation, 0);
            default:
                return new q(this.f221332w, this.f221333x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar2 = this.f221332w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    a3 a3Var = aVar2.f74126t;
                    String orderId = this.f221333x.f73289a;
                    a3Var.getClass();
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    k2 k2Var = (k2) a3Var.f129191a;
                    k2Var.getClass();
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    pfm.r rVarG0 = te0.w.g0(k2Var.f9553a.cancelOrder(orderId, new Object()));
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar2.f74129y.a();
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar4 = this.f221332w;
                q qVar = new q(aVar4, this.f221333x, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(aVar4.k, "cancel_freelancer_sale", qVar, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
