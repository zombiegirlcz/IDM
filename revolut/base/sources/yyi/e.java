package yyi;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.SchemeLoungesHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ SchemeLoungesHomeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SchemeLoungesHomeScreen schemeLoungesHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = schemeLoungesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a aVar2 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.a) this.u.R2();
        aVar2.getClass();
        aVar2.n2(new y7i.h(aVar2, null, 28), new whi.b(6));
        return Unit.f186387a;
    }
}
