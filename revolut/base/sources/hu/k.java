package hu;

import aw0.n6;
import com.revolut.biometric_verification.impl.ui.step.nfc.reader.v2.NfcReadyToScanController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ NfcReadyToScanController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(NfcReadyToScanController nfcReadyToScanController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = nfcReadyToScanController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.v, continuation, 0);
            default:
                return new k(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        NfcReadyToScanController nfcReadyToScanController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                nfcReadyToScanController.c3(i.f155475a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                nfcReadyToScanController.c3(h.f155474a);
                break;
        }
        return Unit.f186387a;
    }
}
