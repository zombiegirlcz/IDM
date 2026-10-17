package ux;

import com.revolut.camerakit.revolut.ui.barcode.BarcodeReaderFlowContract$OutputData;
import dx.q;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes16.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((xv.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xv.l lVar = (xv.l) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (lVar instanceof q) {
            q qVar = (q) lVar;
            Iterable iterable = qVar.f120511a;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                this.v.C2(new BarcodeReaderFlowContract$OutputData.Success(qVar.f120512b.f120508a));
            } else {
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    if (!((xv.q) it8.next()).d()) {
                        break;
                    }
                }
                this.v.C2(new BarcodeReaderFlowContract$OutputData.Success(qVar.f120512b.f120508a));
            }
        }
        return Unit.f186387a;
    }
}
