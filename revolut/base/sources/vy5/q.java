package vy5;

import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ sfe.m u;
    public final /* synthetic */ w v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(sfe.m mVar, w wVar, Continuation continuation) {
        super(1, continuation);
        this.u = mVar;
        this.v = wVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        sfe.m mVar = this.u;
        String str = mVar.f262420b.f89729a;
        v0.Companion.getClass();
        if (Intrinsics.f(str, v0.f293220q)) {
            return StartUpPocket.FiatAccountsAll.f104847a;
        }
        this.v.getClass();
        io3.d dVarG3 = w.g3(mVar);
        if (dVarG3 != null) {
            return new StartUpPocket.FiatCurrencyAccount(dVarG3.f163145a);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
