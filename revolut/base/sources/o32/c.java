package o32;

import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.QrDetailsFlow;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ QrDetailsFlow u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(QrDetailsFlow qrDetailsFlow, Continuation continuation) {
        super(2, continuation);
        this.u = qrDetailsFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CircleActionButtonsBarDelegate.CircleActionButton) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((com.revolut.feature.apm.core.ui.impl.ui.qr.details.a) ((d) this.u.O.getValue())).C2(g12.c.f139518a);
        return Unit.f186387a;
    }
}
