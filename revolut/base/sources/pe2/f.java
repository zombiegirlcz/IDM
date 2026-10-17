package pe2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.apm.swish.impl.ui.home.area.SwishHomeAreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import pd4.u;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ SwishHomeAreaScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SwishHomeAreaScreen swishHomeAreaScreen, Continuation continuation) {
        super(2, continuation);
        this.u = swishHomeAreaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.apm.swish.impl.ui.home.area.a aVar2 = (com.revolut.feature.apm.swish.impl.ui.home.area.a) ((h) this.u.Q.getValue());
        aVar2.H2(aVar2.f62926q, new u(15));
        aVar2.l2(new l(aVar2, null, 0), new yi5.b(26));
        return Unit.f186387a;
    }
}
