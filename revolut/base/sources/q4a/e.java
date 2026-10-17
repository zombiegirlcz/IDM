package q4a;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.search.PaymentsSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ PaymentsSearchScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PaymentsSearchScreen paymentsSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.u = paymentsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((BannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar2 = (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.u.R2();
        aVar2.getClass();
        aVar2.l2(new pwb.p(aVar2, null, 11), new yi5.b(26));
        return Unit.f186387a;
    }
}
