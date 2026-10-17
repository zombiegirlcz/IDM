package k6a;

import aw0.n6;
import cli.y;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.cards.CardsPaymentController;
import com.revolut.kompot.common.ExternalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import k50.a4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CardsPaymentController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CardsPaymentController cardsPaymentController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cardsPaymentController;
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
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardsPaymentController cardsPaymentController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((s) cardsPaymentController.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar = (s) cardsPaymentController.d();
                y yVar = sVar.v;
                if (((j) ((j2) yVar.f22677a).getValue()).f) {
                    sVar.C2(l.f181660a);
                } else {
                    Provider provider = sVar.o.f80281a;
                    if (provider == null) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Provider is not valid");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    } else {
                        sVar.C1(new ExternalDestination.Browser(provider.e, null));
                        sVar.H2(yVar, new a4(20));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
