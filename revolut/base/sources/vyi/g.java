package vyi;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.saved_lounges.AirportSavedLoungesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ AirportSavedLoungesScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AirportSavedLoungesScreen airportSavedLoungesScreen, Continuation continuation) {
        super(2, continuation);
        this.u = airportSavedLoungesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVar = (r) this.u.Y.getValue();
        rVar.getClass();
        rVar.n2(new vmf.k(rVar, null, 15), new whi.b(6));
        return Unit.f186387a;
    }
}
