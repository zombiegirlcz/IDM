package od3;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashbackProductScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CashbackProductScreen cashbackProductScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cashbackProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g0 g0VarT2 = this.v.T2();
        Intrinsics.h(model);
        s0 s0Var = (s0) g0VarT2;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof a3) {
            s0Var.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P((a3) obj3), null, null, null, 126))));
        }
        return Unit.f186387a;
    }
}
