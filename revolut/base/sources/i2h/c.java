package i2h;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash.CashSelectionController;
import ip0.qd0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CashSelectionController cashSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = cashSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model selectableModel = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.O.getValue();
        Intrinsics.h(selectableModel);
        j jVar = (j) eVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(selectableModel, "selectableModel");
        Object obj3 = ((RowDelegate.Model) selectableModel.f53305b).u;
        if (obj3 instanceof kel.b) {
            jVar.f157942q.c(((kel.b) obj3).f183148a.e, selectableModel.f53306c == qd0.UNSELECTED);
        }
        return Unit.f186387a;
    }
}
