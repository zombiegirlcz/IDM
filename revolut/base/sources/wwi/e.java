package wwi;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_search.AirportSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ AirportSearchScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AirportSearchScreen airportSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.u = airportSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z1 z1Var = ((q) ((k) this.u.Z.getValue())).f300689q;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}
