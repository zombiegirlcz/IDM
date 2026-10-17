package rje;

import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositDestination;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements Function1 {
    public final /* synthetic */ d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Continuation continuation) {
        super(1, continuation);
        this.u = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.A2(new CryptoDepositDestination(new CryptoDepositInput.Overview((xi0.b) null, (com.revolut.retail.feature.crypto_deposits.api.navigation.a) null, false, (hbj.b) null, (wk5.a) null, 63)));
        return Unit.f186387a;
    }
}
