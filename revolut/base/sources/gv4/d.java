package gv4;

import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.CreditCardAccruedInterestsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardAccruedInterestsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CreditCardAccruedInterestsScreen creditCardAccruedInterestsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardAccruedInterestsScreen;
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

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardAccruedInterestsScreen creditCardAccruedInterestsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.a) ((h) creditCardAccruedInterestsScreen.R.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.a) ((h) creditCardAccruedInterestsScreen.R.getValue())).C2(g.f147052a);
                break;
        }
        return Unit.f186387a;
    }
}
