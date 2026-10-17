package zq5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CryptoSendWalletsListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(CryptoSendWalletsListController cryptoSendWalletsListController, Continuation continuation) {
        super(2, continuation);
        this.v = cryptoSendWalletsListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a aVar2 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a) vVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (Intrinsics.f(model.f53228a, "CRYPTO_SEND_WALLETS_CLIPBOARD_ADDRESS_ID")) {
            aVar2.H2(aVar2.B, new n68.t(model, 3));
        } else if (obj3 instanceof e0) {
            aVar2.u.c3((e0) obj3);
        } else if (obj3 instanceof h0) {
            aVar2.v.f3((h0) obj3);
        }
        return Unit.f186387a;
    }
}
