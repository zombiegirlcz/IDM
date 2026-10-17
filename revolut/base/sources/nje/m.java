package nje;

import com.revolut.feature.crypto.zero_fees.api.models.CryptoZeroFeesPromotion;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nhg.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CryptoZeroFeesPromotion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CryptoZeroFeesPromotion cryptoZeroFeesPromotion = (CryptoZeroFeesPromotion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = cryptoZeroFeesPromotion instanceof CryptoZeroFeesPromotion.Active;
        n nVar = this.v;
        if (z) {
            nVar.x2(new bg5.f(cryptoZeroFeesPromotion, 1));
        } else {
            nVar.x2(new f0(17));
        }
        return Unit.f186387a;
    }
}
