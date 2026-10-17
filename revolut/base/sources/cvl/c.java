package cvl;

import com.revolut.feature.trading_orders.api.ui.pocket_picker.SourcePocketPickerContract$OutputData;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.trading.orders.ui.screens.pocket_picker.SourcePocketPickerController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SourcePocketPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SourcePocketPickerController sourcePocketPickerController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = sourcePocketPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Object[] objArr = 0;
        SourcePocketPickerController sourcePocketPickerController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.screens.pocket_picker.b bVar = (com.revolut.trading.orders.ui.screens.pocket_picker.b) sourcePocketPickerController.R2();
                bVar.getClass();
                bVar.n2(new i(bVar, objArr == true ? 1 : 0, 1), new whi.b(6));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.screens.pocket_picker.b bVar2 = (com.revolut.trading.orders.ui.screens.pocket_picker.b) sourcePocketPickerController.R2();
                l lVar = (l) ((j2) bVar2.getState().f22677a).getValue();
                SourcePocket sourcePocket = lVar.f109491c;
                SourcePocketPickerContract$OutputData sourcePocketPickerContract$OutputData = sourcePocket != null ? new SourcePocketPickerContract$OutputData(lVar.f109489a, sourcePocket) : null;
                if (sourcePocketPickerContract$OutputData == null) {
                    hx7.e.n(new Exception("Result is expected"));
                } else {
                    bVar2.C2(sourcePocketPickerContract$OutputData);
                }
                break;
        }
        return Unit.f186387a;
    }
}
