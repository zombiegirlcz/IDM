package hea;

import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingDestination;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.pocket_details.a u;
    public final /* synthetic */ mn2.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar, mn2.a aVar2, Continuation continuation) {
        super(1, continuation);
        this.u = aVar;
        this.v = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h0(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return this.u.C1(new BankAccountSwitchingDestination(new BankAccountSwitchingFlowInputData.RequestList(this.v)));
    }
}
