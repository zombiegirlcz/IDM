package wol;

import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.sso.impl.ui.qr_challenge.displayer.QrDisplayerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import wnc.x;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ QrDisplayerController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(QrDisplayerController qrDisplayerController, Continuation continuation) {
        super(2, continuation);
        this.u = qrDisplayerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((QRCodeDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVar = (t) this.u.R.getValue();
        tVar.H2(tVar.u, new x(22));
        tVar.C2(o.f298972a);
        return Unit.f186387a;
    }
}
