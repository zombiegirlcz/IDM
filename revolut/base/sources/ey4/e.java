package ey4;

import aii.q;
import com.revolut.feature.credit.core.ui.fullscreen_info.CreditFullScreenInfoController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditFullScreenInfoController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CreditFullScreenInfoController creditFullScreenInfoController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditFullScreenInfoController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        q qVar = q.f5292a;
        CreditFullScreenInfoController creditFullScreenInfoController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((f) ((a) creditFullScreenInfoController.P.getValue())).C2(qVar);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((f) ((a) creditFullScreenInfoController.P.getValue())).C2(qVar);
                break;
        }
        return Unit.f186387a;
    }
}
