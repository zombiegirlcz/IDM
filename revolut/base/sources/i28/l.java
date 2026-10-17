package i28;

import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ i3 u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i3 i3Var, n nVar, Continuation continuation) {
        super(2, continuation);
        this.u = i3Var;
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = this.u.f55382c.u;
        n4l.e stockLendingStatus = obj3 instanceof n4l.e ? (n4l.e) obj3 : null;
        if (stockLendingStatus == null) {
            return Unit.f186387a;
        }
        n nVar = this.v;
        d1e.a aVar2 = nVar.f157900c;
        Intrinsics.checkNotNullParameter(stockLendingStatus, "stockLendingStatus");
        NaviCommand naviCommandB = aVar2.b(stockLendingStatus);
        BridgeDestination bridgeDestinationB = naviCommandB != null ? u0.b(naviCommandB) : null;
        if (bridgeDestinationB != null) {
            nVar.f157898a.a(bridgeDestinationB);
        }
        return Unit.f186387a;
    }
}
