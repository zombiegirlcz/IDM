package qpd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.GroupDetailsScreenContract$ModalStep;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GroupDetailsScreen groupDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        a3 transaction = obj3 instanceof a3 ? (a3) obj3 : null;
        if (transaction != null) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.group_details.a) ((g) this.v.O.getValue());
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            if (((jte.d) aVar2.f87707q).c(AnalyticsFeatureApi$Toggles.AnalyticsTransactionDetailsPager.f87389c)) {
                oki.h.v2(aVar2.v, new GroupDetailsScreenContract$ModalStep.TransactionDetailsPager(transaction, ((f) ((j2) aVar2.u.f22677a).getValue()).f248353b), ModalDestination.Style.FullscreenPaged.f98310a);
            } else {
                aVar2.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.g(transaction), com.revolut.feature.transactions.api.navigation.a.ANALYTICS, null, null, 124))));
            }
        }
        return Unit.f186387a;
    }
}
