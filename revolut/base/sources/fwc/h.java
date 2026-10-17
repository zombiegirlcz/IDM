package fwc;

import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ TransactionsLimitsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TransactionsLimitsScreen transactionsLimitsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = transactionsLimitsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((p0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((r60.d) ((com.revolut.feature.security_hub.impl.ui.transactions_limits.a) this.u.d()).f85748q).Q();
        return Unit.f186387a;
    }
}
