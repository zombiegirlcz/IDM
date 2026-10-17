package y7k;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class q0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CenteredAmountDelegate.Model f311567w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(CenteredAmountDelegate.Model model, com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f311567w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q0(this.f311567w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            CenteredAmountDelegate.Model model = this.f311567w;
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar2 = this.v;
            p0 p0Var = new p0(model, aVar2, null);
            this.u = 1;
            if (aVar2.p2(this, p0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
