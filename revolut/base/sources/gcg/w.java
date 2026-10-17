package gcg;

import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsKompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ e0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jxf.a f142471w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e0 e0Var, jxf.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = e0Var;
        this.f142471w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.v, this.f142471w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e0 e0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            if (e0.I2(e0Var, this.f142471w, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return e0Var.C1(new BridgeDestination(new FeatureCommand(TravelHotelsKompotFeatureConfig.SearchResults.f93635g)));
    }
}
