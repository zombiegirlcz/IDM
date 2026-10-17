package dzh;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.recurringbuys.api.navigation.RecurringBuysFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import dj0.d;
import gim.i;
import jzh.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f121343w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature_crypto_order_flow.impl.flow.a aVar, x xVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f121343w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f121343w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature_crypto_order_flow.impl.flow.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            ufm.i iVarX = aVar2.f96770q.x(AccountId.Personal.f51414a);
            this.u = 1;
            obj2 = nim.a.b(iVarX, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        xi0.b bVar = (xi0.b) obj2;
        Intrinsics.h(bVar);
        return aVar2.C1(u0.b(new FeatureCommand(new RecurringBuysFeatureConfig.CreateWithPresetValues(new d(0L, bVar), this.f121343w.f179870a, null, null))));
    }
}
