package sb3;

import com.revolut.feature.cash_topup.api.models.BarcodeDetails;
import com.revolut.feature.cash_topup.impl.ui.barcode.CashTopUpBarcodeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sb3.i;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CashTopUpBarcodeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CashTopUpBarcodeScreen cashTopUpBarcodeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cashTopUpBarcodeScreen;
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
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        CashTopUpBarcodeScreen cashTopUpBarcodeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((p) cashTopUpBarcodeScreen.e3()).C2(i.b.f261482a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) cashTopUpBarcodeScreen.e3();
                BarcodeDetails barcodeDetails = ((h) ((j2) pVar.f261493s.f22677a).getValue()).f261480a;
                if (barcodeDetails != null && (str = barcodeDetails.i) != null) {
                    pVar.C2(new j(str));
                }
                break;
        }
        return Unit.f186387a;
    }
}
