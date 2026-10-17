package j6a;

import aw0.n6;
import cli.y;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.AccountDetailsPaymentController;
import com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.AccountDetailsPaymentControllerContract$ModalStep;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountDetailsPaymentController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AccountDetailsPaymentController accountDetailsPaymentController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountDetailsPaymentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AccountDetailsPaymentController accountDetailsPaymentController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a) accountDetailsPaymentController.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a aVar3 = (com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a) accountDetailsPaymentController.R2();
                y yVar = aVar3.f80279w;
                if (((g) ((j2) yVar.f22677a).getValue()).e) {
                    aVar3.C2(i.f171704a);
                } else {
                    Provider provider = aVar3.o.f80271a;
                    if (provider == null) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Provider is not valid");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    } else {
                        aVar3.C1(new ExternalDestination.Browser(provider.e, null));
                        aVar3.H2(yVar, new j3f.d(19));
                    }
                }
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oki.h.v2(((com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a) accountDetailsPaymentController.R2()).f80280x, AccountDetailsPaymentControllerContract$ModalStep.CountrySelection.f80273a, ModalDestination.Style.POPUP.f98311a);
                break;
        }
        return Unit.f186387a;
    }
}
