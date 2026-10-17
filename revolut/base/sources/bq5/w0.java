package bq5;

import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressDestinationTag;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w0 w0Var = new w0(this.v, continuation);
        w0Var.u = obj2;
        return w0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w0) create((CryptoAddress) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar = this.v;
        cli.y yVar = aVar.C;
        CryptoAddress cryptoAddress = (CryptoAddress) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        CryptoAddressDestinationTag cryptoAddressDestinationTag = cryptoAddress.d;
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddress.f71065l;
        CryptoAddressDestinationTag.Optional optional = cryptoAddressDestinationTag instanceof CryptoAddressDestinationTag.Optional ? (CryptoAddressDestinationTag.Optional) cryptoAddressDestinationTag : null;
        String str = optional != null ? optional.f71071a : null;
        if (str == null) {
            str = "";
        }
        aVar.H2(yVar, new a5b.b((Object) cryptoAddress, (Object) com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a.M2(cryptoAddressRecipientDetails), str, (Enum) com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a.O2(cryptoAddressRecipientDetails, ((a0) ((j2) yVar.f22677a).getValue()).i), 10));
        return Unit.f186387a;
    }
}
