package r7b;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.CobrandedCardsPlanHubTransactionDetailsScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import qu4.s;
import tof.a3;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CobrandedCardsPlanHubTransactionDetailsScreen f252065w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CobrandedCardsPlanHubTransactionDetailsScreen cobrandedCardsPlanHubTransactionDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f252065w = cobrandedCardsPlanHubTransactionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f252065w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f252065w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CobrandedCardsPlanHubTransactionDetailsScreen cobrandedCardsPlanHubTransactionDetailsScreen = this.f252065w;
        switch (i) {
            case 0:
                a3 transaction = (a3) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) cobrandedCardsPlanHubTransactionDetailsScreen.d();
                lVar.getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                lVar.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(q.P(transaction), null, null, null, 126))));
                break;
            default:
                String deeplink = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar2 = (l) cobrandedCardsPlanHubTransactionDetailsScreen.d();
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                lVar2.l2(new s(lVar2, deeplink, null, 26), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
