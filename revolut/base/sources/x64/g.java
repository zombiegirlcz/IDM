package x64;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.content.CongratulationsContentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ CongratulationsContentScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CongratulationsContentScreen congratulationsContentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = congratulationsContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        c cVar = (c) this.u.R2();
        cVar.getClass();
        cVar.n2(new bv4.h(cVar, null, 28), new x0b.c(cVar, 22));
        return Unit.f186387a;
    }
}
