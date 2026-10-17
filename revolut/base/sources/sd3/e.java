package sd3;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashbackTransactionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CashbackTransactionsScreen cashbackTransactionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cashbackTransactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVar = (g) this.v.V.getValue();
        Intrinsics.h(model);
        l lVar = (l) gVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof a3) {
            lVar.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(q.P((a3) obj3), null, null, null, 126))));
        }
        return Unit.f186387a;
    }
}
