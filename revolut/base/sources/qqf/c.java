package qqf;

import aii.r;
import com.revolut.feature.transfer.core.impl.ui.reason.summary.ReasonForTransferSummaryScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ReasonForTransferSummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ReasonForTransferSummaryScreen reasonForTransferSummaryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = reasonForTransferSummaryScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        r jVar = h.f248539a;
        ReasonForTransferSummaryScreen reasonForTransferSummaryScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((n) reasonForTransferSummaryScreen.h3()).v2(jVar);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n nVar = (n) reasonForTransferSummaryScreen.h3();
                krf.c cVar = ((f) nVar.t2()).f248537c;
                if (cVar != null) {
                    jVar = new j(cVar);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Submit was pressed without TransferReason");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                nVar.v2(jVar);
                break;
        }
        return Unit.f186387a;
    }
}
