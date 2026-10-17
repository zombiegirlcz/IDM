package l0a;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public final /* synthetic */ ChatTransferRecipient.CryptoAddressRecipient v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient, Continuation continuation) {
        super(3, continuation);
        this.v = cryptoAddressRecipient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        k kVar = new k(this.v, (Continuation) obj4);
        kVar.u = (Data) obj3;
        return kVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        CryptoAddress cryptoAddress = (CryptoAddress) data.getContent();
        ChatTransferRecipient.CryptoAddressRecipient cryptoAddressRecipient = this.v;
        if (cryptoAddress == null) {
            return cryptoAddressRecipient;
        }
        xi0.b bVar = cryptoAddressRecipient.f79722b;
        jz9.a aVar2 = cryptoAddressRecipient.f79723c;
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        return new ChatTransferRecipient.CryptoAddressRecipient(cryptoAddress, bVar, aVar2);
    }
}
