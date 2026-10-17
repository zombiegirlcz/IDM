package xub;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.rev_points.buying.impl.ui.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dj0.d f309007w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f309007w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f309007w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar2 = this.v;
        dj0.d dVar2 = this.f309007w;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = com.revolut.feature.rev_points.buying.impl.ui.flow.a.I2(aVar2, dVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Long l2 = (Long) obj2;
        if (l2 != null && l2.longValue() >= dVar2.f115082a) {
            com.revolut.feature.rev_points.buying.impl.ui.flow.a.J2(aVar2);
            return Unit.f186387a;
        }
        if (l2 != null) {
            dVar = new dj0.d(dVar2.f115082a - l2.longValue(), dVar2.f115083b);
        } else {
            dVar = dVar2;
        }
        aVar2.H2(aVar2.f83564q, new vtf.b(4, dVar2));
        aVar2.C1(new BridgeDestination(u0.f(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, dVar, null, pte.a.NESTED_TOP_UP, 22)))));
        return Unit.f186387a;
    }
}
