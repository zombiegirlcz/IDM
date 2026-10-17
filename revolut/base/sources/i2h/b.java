package i2h;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash.CashSelectionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CashSelectionController cashSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = cashSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model rowModel = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.O.getValue();
        Intrinsics.h(rowModel);
        j jVar = (j) eVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(rowModel, "rowModel");
        Object obj3 = rowModel.u;
        if (obj3 instanceof kel.b) {
            jVar.f157942q.b(y0.b(((kel.b) obj3).f183148a.e));
        }
        return Unit.f186387a;
    }
}
