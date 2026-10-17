package npb;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pcd.s;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = e.e3(eVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) obj2;
        s sVar = savingsAccountDetails.f86460a;
        return eVar.A2(new VaultsKompotFeatureConfig.RecurringTransfer.Destination(new VaultsKompotFeatureConfig.RecurringTransfer.Config(28, null, sVar.f234881a, sVar.getCurrency(), savingsAccountDetails.f86460a.e())));
    }
}
