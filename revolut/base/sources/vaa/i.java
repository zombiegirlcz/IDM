package vaa;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.PixAreaScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixAreaScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PixAreaScreen pixAreaScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixAreaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((BaseDraggableWidgetDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BaseDraggableWidgetDelegate.a event = (BaseDraggableWidgetDelegate.a) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a0 a0VarE3 = this.v.R2();
        Intrinsics.h(event);
        f0 f0Var = (f0) a0VarE3;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        f0Var.l2(new e0(f0Var, event, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
