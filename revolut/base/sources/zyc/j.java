package zyc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.selfserve.sot.impl.ui.home.SotHomeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ SotHomeController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SotHomeController sotHomeController, Continuation continuation) {
        super(2, continuation);
        this.u = sotHomeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((s) this.u.P.getValue()).C2(n.f326423a);
        return Unit.f186387a;
    }
}
