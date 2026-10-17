package ka2;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.apm.payid.impl.screen.area.AreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ AreaScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AreaScreen areaScreen, Continuation continuation) {
        super(2, continuation);
        this.u = areaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.apm.payid.impl.screen.area.c) this.u.d()).I2(s.f182405a);
        return Unit.f186387a;
    }
}
