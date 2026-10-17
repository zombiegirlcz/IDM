package jx1;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.core.code.ui.ApmCodeController;
import ji1.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ ApmCodeController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ApmCodeController apmCodeController, Continuation continuation) {
        super(2, continuation);
        this.u = apmCodeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.apm.core.code.ui.a aVar2 = (com.revolut.feature.apm.core.code.ui.a) ((h) this.u.O.getValue());
        aVar2.getClass();
        aVar2.l2(new m(aVar2, null, 17), new yi5.b(26));
        return Unit.f186387a;
    }
}
