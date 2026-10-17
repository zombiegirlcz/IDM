package sb3;

import com.revolut.feature.cash_topup.api.models.BarcodeDetails;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import sb3.i;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        od0.i iVar = (od0.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        BarcodeDetails barcodeDetails = (BarcodeDetails) iVar.g();
        p pVar = this.v;
        if (barcodeDetails == null) {
            pVar.C2(i.c.f261483a);
        } else {
            pVar.H2(pVar.f261493s, new s78.d(barcodeDetails, 21));
        }
        return Unit.f186387a;
    }
}
