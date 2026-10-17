package ijc;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.rev_points_earned.RentAndBillsRevPointsEarnedScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ RentAndBillsRevPointsEarnedScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RentAndBillsRevPointsEarnedScreen rentAndBillsRevPointsEarnedScreen, Continuation continuation) {
        super(2, continuation);
        this.u = rentAndBillsRevPointsEarnedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((k) ((h) this.u.O.getValue())).C2(e.f161760a);
        return Unit.f186387a;
    }
}
