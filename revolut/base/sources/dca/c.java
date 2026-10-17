package dca;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.pix.impl.flow.qr_request.screen.request.PixQrRequestScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ PixQrRequestScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PixQrRequestScreen pixQrRequestScreen, Continuation continuation) {
        super(2, continuation);
        this.u = pixQrRequestScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVar = (r) this.u.d();
        rVar.getClass();
        rVar.n2(new cq6.k(rVar, null, 14), new whi.b(6));
        return Unit.f186387a;
    }
}
