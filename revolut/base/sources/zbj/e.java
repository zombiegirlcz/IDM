package zbj;

import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import com.revolut.retail.feature.crypto_deposits.impl.R$string;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoDepositsOverviewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CryptoDepositsOverviewController cryptoDepositsOverviewController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoDepositsOverviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CircleActionButtonsBarDelegate.CircleActionButton) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CircleActionButtonsBarDelegate.CircleActionButton model = (CircleActionButtonsBarDelegate.CircleActionButton) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c cVar = (com.revolut.retail.feature.crypto_deposits.impl.ui.overview.c) sVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52088a;
        if (Intrinsics.f(str, "COPY_BUTTON_ID")) {
            cVar.I2(new j0(6), true);
        } else if (Intrinsics.f(str, "SHARE_BUTTON_ID")) {
            Object obj3 = model.f52092h;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress");
            CryptoDepositAddress cryptoDepositAddress = (CryptoDepositAddress) obj3;
            fcj.b bVar = cVar.o;
            xi0.b currency = ((q) ((j2) cVar.F.f22677a).getValue()).f320926b;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(cryptoDepositAddress, "cryptoDepositAddress");
            Intrinsics.checkNotNullParameter(currency, "currency");
            String string = bVar.f133832c.b(new TextLocalisedClause(R$string.crypto_receive_screen_receive_share_address_text, zhm.v.k(ix0.d0.a(currency, null), ((ik5.a) bVar.f133830a).b(cryptoDepositAddress.d, false, null), cryptoDepositAddress.f100038b), null, 12)).toString();
            tqi.e eVar = cVar.f100094x;
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            cVar.C1(eVar.b("", string));
        }
        return Unit.f186387a;
    }
}
