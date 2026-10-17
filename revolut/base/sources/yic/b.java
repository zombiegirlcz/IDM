package yic;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.home.RentAndBillsHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ RentAndBillsHomeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RentAndBillsHomeScreen rentAndBillsHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = rentAndBillsHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVar = (x) this.u.R2();
        xVar.H2(xVar.v, new yi5.b(4));
        xVar.u.a();
        return Unit.f186387a;
    }
}
