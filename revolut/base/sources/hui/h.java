package hui;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.AsftHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ AsftHomeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AsftHomeScreen asftHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = asftHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ReferralContactDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c cVar = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c) this.u.d();
        cVar.getClass();
        cVar.C2(new l(null));
        return Unit.f186387a;
    }
}
