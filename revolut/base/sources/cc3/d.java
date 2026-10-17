package cc3;

import cc3.f;
import com.revolut.feature.cash_topup.impl.ui.flow.delete_barcode.DeleteBarcodeConfirmationFlow;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.p;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DeleteBarcodeConfirmationFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(DeleteBarcodeConfirmationFlow deleteBarcodeConfirmationFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = deleteBarcodeConfirmationFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DeleteBarcodeConfirmationFlow deleteBarcodeConfirmationFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) deleteBarcodeConfirmationFlow.d3();
                j60.a.v(jVar.o, false, new h(jVar, 0), 1);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar2 = (j) deleteBarcodeConfirmationFlow.d3();
                jVar2.getClass();
                jVar2.n2(new bv4.h(jVar2, null, 14), new bwc.i(1, jVar2, j.class, "handleGenericFlowError", "handleGenericFlowError(Ljava/lang/Throwable;)Z", 0, 13));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) deleteBarcodeConfirmationFlow.d3()).C2(f.a.f22925a);
                break;
        }
        return Unit.f186387a;
    }
}
