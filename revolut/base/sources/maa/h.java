package maa;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.pix.impl.flow.pix_area.screens.add_trusted_account.PixAddTrustedAccountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ PixAddTrustedAccountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PixAddTrustedAccountScreen pixAddTrustedAccountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = pixAddTrustedAccountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.d().f203993s.k(null);
        return Unit.f186387a;
    }
}
