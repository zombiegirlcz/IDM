package ow1;

import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BrebQrRequestScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BrebQrRequestScreen brebQrRequestScreen, Continuation continuation) {
        super(2, continuation);
        this.v = brebQrRequestScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CircleActionButtonsBarDelegate.CircleActionButton) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CircleActionButtonsBarDelegate.CircleActionButton circleActionButton = (CircleActionButtonsBarDelegate.CircleActionButton) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.v.R2().I2(circleActionButton.f52088a);
        return Unit.f186387a;
    }
}
