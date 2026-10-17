package mca;

import aw0.n6;
import com.revolut.feature.pix.impl.flow.transfer.apm.recipient_warning.PixApmRecipientWarningController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PixApmRecipientWarningController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(PixApmRecipientWarningController pixApmRecipientWarningController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pixApmRecipientWarningController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PixApmRecipientWarningController pixApmRecipientWarningController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) pixApmRecipientWarningController.U.getValue();
                if (!hVar.o) {
                    hVar.o = true;
                    hVar.C2(d.f204333a);
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar2 = (h) pixApmRecipientWarningController.U.getValue();
                if (!hVar2.o) {
                    hVar2.o = true;
                    hVar2.C2(c.f204332a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
