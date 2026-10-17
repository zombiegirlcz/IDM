package zb6;

import com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.OneTimeDonationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ OneTimeDonationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(OneTimeDonationScreen oneTimeDonationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = oneTimeDonationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        OneTimeDonationScreen oneTimeDonationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) oneTimeDonationScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a aVar3 = (com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation.a) oneTimeDonationScreen.d();
                aVar3.getClass();
                aVar3.l2(new mt8.b(aVar3, false, null, 21), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
