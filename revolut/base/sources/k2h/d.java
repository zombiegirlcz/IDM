package k2h;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionController;
import ip0.qd0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InstrumentSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InstrumentSelectionController instrumentSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = instrumentSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model selectableModel = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVar = (e) this.v.P.getValue();
        Intrinsics.h(selectableModel);
        n nVar = (n) eVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(selectableModel, "selectableModel");
        Object obj3 = ((RowDelegate.Model) selectableModel.f53305b).u;
        if (obj3 instanceof nel.n) {
            nVar.f180595s.c(((nel.n) obj3).f214596b, selectableModel.f53306c == qd0.UNSELECTED);
        }
        return Unit.f186387a;
    }
}
