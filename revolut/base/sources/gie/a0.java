package gie;

import com.revolut.core.ui_kit.delegates.VoucherExtraSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.j4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.v = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a0 a0Var = new a0(this.v, continuation);
        a0Var.u = obj2;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((BaseDraggableWidgetDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BaseDraggableWidgetDelegate.a aVar = (BaseDraggableWidgetDelegate.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j4 j4Var = aVar instanceof j4 ? (j4) aVar : null;
        VoucherExtraSmallTileDelegate.Model model = j4Var != null ? j4Var.f55398c : null;
        if (model == null) {
            model = null;
        }
        Object f51742s = model != null ? model.getF51742s() : null;
        zn.d dVar = f51742s instanceof zn.d ? (zn.d) f51742s : null;
        if (dVar != null) {
            this.v.f144127m.Z2(dVar);
        }
        return Unit.f186387a;
    }
}
