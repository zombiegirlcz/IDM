package hwe;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.i implements Function2 {
    public com.revolut.feature.topup_screen.impl.flow.topup_methods.d u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flow.topup_methods.d f156158w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f156158w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.f156158w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar2 = this.f156158w;
            ufm.i iVarB = ((ym6.d) dVar2.f90665w).b(new ExternalAccountsFeatureConfig.Configuration.TrueLayer(null, null, null, null, null, null, false, null, 16381), new ExternalAccountsFeatureConfig.Configuration.DirectLink(new Integer(1000), null, null, null, null, 126), true);
            this.u = dVar2;
            this.v = 1;
            Object objB = nim.a.b(iVarB, this);
            if (objB == aVar) {
                return aVar;
            }
            dVar = dVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return dVar.C1(new BridgeDestination((NaviCommand) obj2));
    }
}
