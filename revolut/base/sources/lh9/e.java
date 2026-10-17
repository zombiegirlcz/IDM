package lh9;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.review.FormReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FormReviewScreen formReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = formReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((r) this.v.R2()).I2(model.o);
        return Unit.f186387a;
    }
}
