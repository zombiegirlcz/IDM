package ej6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.domain.models.openbanking.OpenBankingPayment;
import com.revolut.domain.models.openbanking.Provider;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreen;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ OpenBankingAuthPaymentScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(OpenBankingAuthPaymentScreen openBankingAuthPaymentScreen, Continuation continuation) {
        super(2, continuation);
        this.u = openBankingAuthPaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d dVar = (com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) this.u.R2();
        AccountWrapper accountWrapper = ((l) ((j2) dVar.D.f22677a).getValue()).f126745c;
        if (accountWrapper != null) {
            String pocketId = accountWrapper.getPocketId();
            OpenBankingPayment openBankingPayment = dVar.o.f72530b;
            Provider provider = openBankingPayment.f60394p;
            if (provider == null || (str = provider.e) == null) {
                str = openBankingPayment.f60393n;
            }
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dVar.C2(new t(openBankingPayment.f60391l, pocketId, str));
        }
        return Unit.f186387a;
    }
}
