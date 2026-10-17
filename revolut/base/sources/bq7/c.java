package bq7;

import be7.s;
import bq5.o0;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation.refund.CancellationRefundScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CancellationRefundScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CancellationRefundScreen cancellationRefundScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cancellationRefundScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CancellationRefundScreen cancellationRefundScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cancellationRefundScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) ((h) cancellationRefundScreen.Z.getValue());
                Object content = ((f) lVar.t2()).f17778a.getContent();
                if (content == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                lVar.x2(new o0(4));
                lVar.l2(new s(lVar, (kl7.a) content, null, 18), new ax9.d(1, lVar, vl7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 24));
                return Unit.f186387a;
        }
    }
}
