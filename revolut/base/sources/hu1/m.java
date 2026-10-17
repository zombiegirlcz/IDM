package hu1;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BlikCodeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(BlikCodeScreen blikCodeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = blikCodeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((BaseDraggableWidgetDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BaseDraggableWidgetDelegate.a event = (BaseDraggableWidgetDelegate.a) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarT2 = this.v.T2();
        Intrinsics.h(event);
        e0 e0Var = (e0) qVarT2;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        h12.g gVarC = ((u12.a) e0Var.f155514r).c(event);
        if (gVarC != null) {
            e0Var.C2(gVarC);
        } else {
            e0.y2(event);
        }
        return Unit.f186387a;
    }
}
