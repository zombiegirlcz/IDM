package sb3;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.cash_topup.impl.ui.barcode.CashTopUpBarcodeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashTopUpBarcodeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CashTopUpBarcodeScreen cashTopUpBarcodeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cashTopUpBarcodeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((p) this.v.R2()).I2(model.f53228a);
        return Unit.f186387a;
    }
}
