package eq5;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreen;
import com.revolut.feature.transfer.core.models.FundingSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ CryptoSendAmountInputScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CryptoSendAmountInputScreen cryptoSendAmountInputScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cryptoSendAmountInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar = (com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j) this.u.d();
        cli.y yVar = jVar.F;
        FundingSource fundingSource = ((r) ((j2) yVar.f22677a).getValue()).i;
        j2 j2Var = (j2) yVar.f22677a;
        FiatCryptoMoney fiatCryptoMoney = (FiatCryptoMoney) ((r) j2Var.getValue()).f128310g.getContent();
        nqi.c cVar = ((r) j2Var.getValue()).f;
        if (cVar != null && (bVar = ((r) j2Var.getValue()).f128308b) != null && fundingSource != null && fiatCryptoMoney != null) {
            jVar.n2(new a31.w(jVar, bVar, fundingSource, cVar, fiatCryptoMoney, (Continuation) null, 28), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
