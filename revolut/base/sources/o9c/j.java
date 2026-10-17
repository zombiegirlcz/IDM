package o9c;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevolutPaySummaryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(RevolutPaySummaryScreen revolutPaySummaryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revolutPaySummaryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((AttributeSelectorSmallDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AttributeSelectorSmallDelegate.Model model = (AttributeSelectorSmallDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarE3 = this.v.R2();
        Object obj3 = model.f51674g;
        com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar = (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) uVarE3;
        if (obj3 instanceof t6c.f) {
            t6c.f paymentOption = (t6c.f) obj3;
            q9c.b0 b0Var = (q9c.b0) fVar.C;
            b0Var.getClass();
            Intrinsics.checkNotNullParameter(paymentOption, "paymentOption");
            b0Var.X2(b0Var.o, new q56.o(paymentOption, 24));
        } else {
            fVar.getClass();
        }
        return Unit.f186387a;
    }
}
