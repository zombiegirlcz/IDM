package ag5;

import aii.q;
import aw0.n6;
import com.revolut.feature.crypto.exchange.fees.impl.ui.crypto_exchange_fees_dialog_controller.CryptoExchangeFeesDialogController;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CryptoExchangeFeesDialogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CryptoExchangeFeesDialogController cryptoExchangeFeesDialogController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cryptoExchangeFeesDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoExchangeFeesDialogController cryptoExchangeFeesDialogController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) ((c) cryptoExchangeFeesDialogController.R.getValue());
                String str = ((d) ((j2) hVar.f4795r.f22677a).getValue()).f4789c;
                if (str == null) {
                    str = "https://www.revolut.com/legal/exchangingcryptocurrenciespersonalfees";
                }
                hVar.C1(new ExternalDestination.Browser(str, null));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) ((c) cryptoExchangeFeesDialogController.R.getValue())).C2(q.f5292a);
                break;
        }
        return Unit.f186387a;
    }
}
