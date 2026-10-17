package so1;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.feature.apm.bills.bpay.impl.screen.review.review.BPayReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BPayReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BPayReviewScreen bPayReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bPayReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a) this.v.d()).K2(new k(model.f51871a));
        return Unit.f186387a;
    }
}
