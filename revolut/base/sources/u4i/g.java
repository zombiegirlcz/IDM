package u4i;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee.FeeBreakdownScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FeeBreakdownScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FeeBreakdownScreen feeBreakdownScreen, Continuation continuation) {
        super(2, continuation);
        this.v = feeBreakdownScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((t) this.v.R2()).I2(model.f51787l);
        return Unit.f186387a;
    }
}
