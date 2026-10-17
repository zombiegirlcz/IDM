package rk9;

import com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.SummaryController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tw0.x;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SummaryController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SummaryController summaryController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = summaryController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
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

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SummaryController summaryController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a) summaryController.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a aVar3 = (com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a) summaryController.d();
                aVar3.getClass();
                aVar3.l2(new t(aVar3, null, 0), new yi5.b(26));
                break;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a) summaryController.d()).C2(k.f254775a);
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x.b(((tki.b) ((tki.a) summaryController.S.getValue())).f271959b.h(), ((tki.b) ((tki.a) r4.getValue())).f271959b.f.getItemCount() - 1);
                break;
        }
        return Unit.f186387a;
    }
}
