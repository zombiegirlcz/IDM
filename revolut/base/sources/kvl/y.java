package kvl;

import com.revolut.feature.trading_orders.common.models.AutoTopUpSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class y extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ a0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AutoTopUpSource.Pocket f190176w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, AutoTopUpSource.Pocket pocket, Continuation continuation) {
        super(2, continuation);
        this.v = a0Var;
        this.f190176w = pocket;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.v, this.f190176w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        AutoTopUpSource.Pocket pocket = this.f190176w;
        a0 a0Var = this.v;
        x xVar = new x(a0Var, pocket, null);
        this.u = 1;
        Object objB = pu7.a.B(a0Var.e, "on_set_auto_top_up_source", xVar, this);
        return objB == aVar ? aVar : objB;
    }
}
