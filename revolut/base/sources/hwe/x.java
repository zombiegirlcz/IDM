package hwe;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingDestination;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flow.topup_methods.d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            d0 d0VarF = dVar.f90660p.f(false);
            this.u = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Address address = ((do3.n) obj2).k;
        mn2.a aVar2 = null;
        wi0.b bVarG = address != null ? nz8.d.g(address) : null;
        wi0.b.Companion.getClass();
        if (Intrinsics.f(bVarG, wi0.b.h2)) {
            aVar2 = mn2.a.OVERSTAP;
        } else if (Intrinsics.f(bVarG, wi0.b.p0)) {
            aVar2 = mn2.a.CASS;
        } else if (Intrinsics.f(bVarG, wi0.b.f297760n0)) {
            aVar2 = mn2.a.MOBILITY;
        }
        if (aVar2 != null) {
            dVar.C2(new f(new BankAccountSwitchingDestination(new BankAccountSwitchingFlowInputData.RequestList(aVar2))));
        }
        return Unit.f186387a;
    }
}
