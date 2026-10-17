package wt4;

import com.revolut.feature.credit.card.api.navigation.CreditCardTopupDestination;
import com.revolut.feature.credit.card.impl.ui.overdue_explainer.CreditCardOverdueExplainerController;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardOverdueExplainerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(CreditCardOverdueExplainerController creditCardOverdueExplainerController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardOverdueExplainerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.v, continuation, 0);
            default:
                return new l(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        CreditCardOverdueExplainerController creditCardOverdueExplainerController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = (n) creditCardOverdueExplainerController.O.getValue();
                d dVar = (d) ((e) ((j2) nVar.f299783q.f22677a).getValue()).f299772a.getContent();
                if (dVar != null && (str = dVar.f299770a) != null) {
                    nVar.C1(new CreditCardTopupDestination(str, (KompotDestination) null, 6));
                    nVar.B2();
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n) creditCardOverdueExplainerController.O.getValue()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
