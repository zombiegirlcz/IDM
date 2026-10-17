package rp4;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.credit.card.impl.ui.autopay.amount_confirmation.AutopayAmountConfirmationController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.n0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ AutopayAmountConfirmationController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AutopayAmountConfirmationController autopayAmountConfirmationController, Continuation continuation) {
        super(2, continuation);
        this.u = autopayAmountConfirmationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.u.U.getValue();
        jVar.H2(jVar.f256266p, new n0(8));
        return Unit.f186387a;
    }
}
