package od3;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.api.navigation.CreditCardHomeFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s0 f224273w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(s0 s0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f224273w = s0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j0 j0Var = new j0(this.f224273w, continuation, 0);
                j0Var.v = obj2;
                return j0Var;
            case 1:
                j0 j0Var2 = new j0(this.f224273w, continuation, 1);
                j0Var2.v = obj2;
                return j0Var2;
            default:
                j0 j0Var3 = new j0(this.f224273w, continuation, 2);
                j0Var3.v = obj2;
                return j0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j0) create((f0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        s0 s0Var = this.f224273w;
        switch (i) {
            case 0:
                f0 f0Var = (f0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0Var.x2(new o9h.b(f0Var, 14));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0Var.x2(new o54.a(data, s0Var, 26));
                break;
            default:
                String str = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s0Var.C1(new BridgeDestination(new FeatureCommand(new CreditCardHomeFeatureConfig(str))));
                break;
        }
        return Unit.f186387a;
    }
}
