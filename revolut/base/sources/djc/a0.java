package djc;

import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import m1c.f1;
import m1c.s1;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ b0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f115289w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.v = b0Var;
        this.f115289w = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a0(this.v, this.f115289w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b0 b0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            vgc.p pVar = b0Var.f115292r;
            this.u = 1;
            objB = pVar.b(this.f115289w, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objB = obj2;
        }
        Set set = (Set) objB;
        if (set.isEmpty()) {
            return Unit.f186387a;
        }
        b0Var.C1(new BridgeDestination(vhi.c.c(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenTransactionList(new RevPointsTransactionPageParams(0, null, null, null, f1.RECURRING_PAYMENTS, s1.COMPLETED, null, d0.d1(set), null, 335), null, 2)), yhi.b.SOLID, null, false, 4)));
        return Unit.f186387a;
    }
}
