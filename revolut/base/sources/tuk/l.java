package tuk;

import com.revolut.feature.wealth.api.declaration.DisclosuresFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ ty0.a u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ty0.a aVar, n nVar, Continuation continuation) {
        super(1, continuation);
        this.u = aVar;
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ty0.a aVar2 = this.u;
        if (Intrinsics.f(aVar2.f275445a, "FOOTER_LEARN_MORE")) {
            return this.v.C1(new BridgeDestination(new FeatureCommand(DisclosuresFeatureConfig.TradingDisclosuresFeatureConfig.f95197a)));
        }
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, null, j6.a.q("unsupported clickId=", aVar2.f275445a), null, null, 16);
        return Unit.f186387a;
    }
}
