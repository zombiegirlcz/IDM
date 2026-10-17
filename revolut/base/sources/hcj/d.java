package hcj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.address_list.ReturnCryptoDepositAddressListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReturnCryptoDepositAddressListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ReturnCryptoDepositAddressListScreen returnCryptoDepositAddressListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = returnCryptoDepositAddressListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model rowModel = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        Intrinsics.h(rowModel);
        p pVar = (p) lVarE3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(rowModel, "rowModel");
        Object obj3 = rowModel.u;
        if (Intrinsics.f(rowModel.f53228a, "ADD_ADDRESS_ID")) {
            pVar.C2(g.f150906a);
        } else if (obj3 instanceof CryptoAddress) {
            CryptoAddress cryptoAddress = (CryptoAddress) obj3;
            if (cryptoAddress.f71062g == ko5.c.ACTIVE) {
                pVar.C2(new i(cryptoAddress));
            } else {
                pVar.C2(new h(cryptoAddress));
            }
        }
        return Unit.f186387a;
    }
}
