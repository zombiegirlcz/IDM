package h22;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.details.BreakdownDetailsController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BreakdownDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BreakdownDetailsController breakdownDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = breakdownDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((com.revolut.feature.apm.core.ui.impl.ui.breakdown.details.a) ((a) this.v.T.getValue())).I2(model.o);
        return Unit.f186387a;
    }
}
