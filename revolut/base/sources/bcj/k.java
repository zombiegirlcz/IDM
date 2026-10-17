package bcj;

import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositDestination;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ l u;
    public final /* synthetic */ xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wk5.a f14460w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, xi0.b bVar, wk5.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = lVar;
        this.v = bVar;
        this.f14460w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, this.v, this.f14460w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        return this.u.A2(new CryptoDepositDestination(new CryptoDepositInput.DirectDeposit.Option(this.f14460w, this.v)));
    }
}
