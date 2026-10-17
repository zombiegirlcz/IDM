package vmj;

import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vge.r;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimShareQrCodeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EsimShareQrCodeScreen esimShareQrCodeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimShareQrCodeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CircleActionButtonsBarDelegate.CircleActionButton) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CircleActionButtonsBarDelegate.CircleActionButton circleActionButton = (CircleActionButtonsBarDelegate.CircleActionButton) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.P.getValue();
        Object obj3 = circleActionButton.f52092h;
        jVar.getClass();
        if (obj3 instanceof g) {
            jVar.l2(new r(jVar, obj3, null, 28), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
