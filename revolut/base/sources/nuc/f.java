package nuc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.impl.ui.hidden_transactions.HiddenTransactionsScreen;
import com.revolut.feature.security_hub.impl.ui.hidden_transactions.HiddenTransactionsScreenContract$ModalStep;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import tof.a3;
import tof.i7;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ HiddenTransactionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(HiddenTransactionsScreen hiddenTransactionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = hiddenTransactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.security_hub.impl.ui.hidden_transactions.a aVar2 = (com.revolut.feature.security_hub.impl.ui.hidden_transactions.a) lVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
        if (a3Var != null) {
            k71.i iVarP = q.P(a3Var);
            if (aVar2.f85585q.a()) {
                oki.h.v2(aVar2.u, new HiddenTransactionsScreenContract$ModalStep.TransactionDetailsPager(a3Var, (i7) aVar2.f85587s.f(), ((h) ((j2) aVar2.f85588t.f22677a).getValue()).f219284b), ModalDestination.Style.FullscreenPaged.f98310a);
            } else {
                aVar2.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(iVarP, null, null, null, 126))));
            }
        }
        return Unit.f186387a;
    }
}
