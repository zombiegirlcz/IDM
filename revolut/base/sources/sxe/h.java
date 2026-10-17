package sxe;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import wxe.u;
import wxe.y;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b f266472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f266473x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar, y yVar, Continuation continuation) {
        super(2, continuation);
        this.f266472w = bVar;
        this.f266473x = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.f266472w, this.f266473x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar2 = this.f266472w;
            ufm.i iVarB = ((ym6.d) bVar2.f90800t).b(new ExternalAccountsFeatureConfig.Configuration.TrueLayer(((u) this.f266473x).f300920a, null, null, null, null, null, false, null, 16333), null, true);
            this.u = bVar2;
            this.v = 1;
            Object objB = nim.a.b(iVarB, this);
            if (objB == aVar) {
                return aVar;
            }
            bVar = bVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = this.u;
            o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return bVar.C1(new BridgeDestination((NaviCommand) obj2));
    }
}
