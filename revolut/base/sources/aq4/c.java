package aq4;

import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.CancellationCheckoutScreen;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.a;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CancellationCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CancellationCheckoutScreen cancellationCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cancellationCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CancellationCheckoutScreen cancellationCheckoutScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b) cancellationCheckoutScreen.d()).C2(a.C0477a.f69107a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b bVar = (com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b) cancellationCheckoutScreen.d();
                io3.d dVar = (io3.d) ((e) ((j2) bVar.f69112r.f22677a).getValue()).f8248b.getContent();
                if (dVar != null) {
                    if (dVar.i < bVar.o.f69102a.f115082a) {
                        bVar.C1(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, null, pte.a.NESTED_TOP_UP, 23)));
                    } else {
                        bVar.C2(a.b.f69108a);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
