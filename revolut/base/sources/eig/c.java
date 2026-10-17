package eig;

import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.main.TravelMilesMainScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ TravelMilesMainScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelMilesMainScreen travelMilesMainScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelMilesMainScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((HeroBannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.travel.miles.impl.ui.screen.main.e eVar = (com.revolut.feature.travel.miles.impl.ui.screen.main.e) this.u.R2();
        eVar.getClass();
        eVar.l2(new q(1, eVar, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
