package pqg;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ i0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.v = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i0 i0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            e0 e0Var = new e0(i0Var, null);
            this.u = 1;
            obj2 = i0Var.p2(this, e0Var);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        CurrencyChooserFlowDestination.StartType.BalancePicker balancePicker = (CurrencyChooserFlowDestination.StartType.BalancePicker) obj2;
        return i0Var.C1(new BridgeDestination(vhi.c.c(new CurrencyChooserFlowDestination(balancePicker), yhi.b.POPUP, balancePicker.f99479j, false, 8)));
    }
}
