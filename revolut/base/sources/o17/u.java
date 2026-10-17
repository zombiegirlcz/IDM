package o17;

import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a f221336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q17.b f221337x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar, q17.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f221336w = aVar;
        this.f221337x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f221336w, this.f221337x, continuation, 0);
            default:
                return new u(this.f221336w, this.f221337x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FreelancerOrder freelancerOrder = this.f221337x.f241394a;
                    this.v = 1;
                    com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar2 = this.f221336w;
                    if (aVar2.p2(this, new q(aVar2, freelancerOrder, null, 1)) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FreelancerOrder freelancerOrder2 = this.f221337x.f241394a;
                    this.v = 1;
                    if (com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a.I2(this.f221336w, freelancerOrder2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
