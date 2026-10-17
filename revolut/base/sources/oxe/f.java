package oxe;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.topup_screen.impl.flows.cvv.screen.CvvScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import os9.t;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CvvScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CvvScreen cvvScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cvvScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVar = (n) this.v.P.getValue();
        String cvv = textData.f52598b.toString();
        nVar.getClass();
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        y yVar = nVar.f230798q;
        Object value = ((j2) yVar.f22677a).getValue();
        g gVar = value instanceof g ? (g) value : null;
        if (gVar != null) {
            nVar.H2(yVar, new t(gVar, cvv, 8));
        }
        return Unit.f186387a;
    }
}
