package wqf;

import aii.q;
import com.revolut.feature.transfer.core.impl.ui.transfer.cancellation.TransferCancellationDialogScreen;
import gim.i;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransferCancellationDialogScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(TransferCancellationDialogScreen transferCancellationDialogScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transferCancellationDialogScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.v, continuation, 0);
            default:
                return new a(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransferCancellationDialogScreen transferCancellationDialogScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((d) transferCancellationDialogScreen.Q.getValue()).v2(q.f5292a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVar = (d) transferCancellationDialogScreen.Q.getValue();
                dVar.getClass();
                dVar.l2(new c(dVar, null), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
