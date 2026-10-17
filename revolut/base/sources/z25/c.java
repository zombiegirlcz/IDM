package z25;

import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import gim.i;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.r9;
import yhm.o;
import zh9.r0;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r0 f318961w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, r0 r0Var, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
        this.f318961w = r0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f318961w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        r0 r0Var = this.f318961w;
        g gVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ufm.i iVarB = com.revolut.domain.interactors.transactions.a.b(gVar.u, new r9(r0Var.f322328c), null, null, null, null, 30);
            this.u = 1;
            obj2 = nim.a.b(iVarB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        a3 a3Var = (a3) d0.M0((List) obj2);
        if (a3Var == null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "PayLaterAccountEventHandler", j6.a.s("Plan transaction is null for plan: ", r0Var.f322326a, ", transaction: ", r0Var.f322328c, ". It is impossible state!"), null, null, 16);
            gVar.B2(new PayLaterKompotFeatureConfig.PlanDetailsNavigationDestination(r0Var.f322326a));
        } else {
            gVar.A2(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.g(a3Var), null, null, null, 126))));
        }
        return Unit.f186387a;
    }
}
