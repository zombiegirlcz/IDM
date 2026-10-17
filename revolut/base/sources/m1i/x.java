package m1i;

import com.revolut.feature.exchange.models.ExchangeResult;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfigFinishBehavior;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f201591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExchangeResult f201592c;

    public /* synthetic */ x(e0 e0Var, ExchangeResult exchangeResult, int i) {
        this.f201590a = i;
        this.f201591b = e0Var;
        this.f201592c = exchangeResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f201590a) {
            case 0:
                e0 e0Var = this.f201591b;
                m mVar = e0Var.i;
                ExchangeFeatureConfigFinishBehavior finishBehavior = (ExchangeFeatureConfigFinishBehavior) obj2;
                Intrinsics.checkNotNullParameter(finishBehavior, "finishBehavior");
                if (Intrinsics.f(finishBehavior, ExchangeFeatureConfigFinishBehavior.Finish.f96861a)) {
                    return ((g1i.l0) mVar).d();
                }
                if (finishBehavior instanceof ExchangeFeatureConfigFinishBehavior.Navigate) {
                    return ((g1i.l0) mVar).g(((ExchangeFeatureConfigFinishBehavior.Navigate) finishBehavior).f96862a);
                }
                if (!Intrinsics.f(finishBehavior, ExchangeFeatureConfigFinishBehavior.Default.f96860a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ExchangeResult exchangeResult = this.f201592c;
                if ((exchangeResult instanceof ExchangeResult.Success ? (ExchangeResult.Success) exchangeResult : null) == null) {
                    return ((g1i.l0) mVar).d();
                }
                ExchangeResult.Success success = (ExchangeResult.Success) exchangeResult;
                boolean zA = v.a(success);
                dj0.d dVar = success.f72154b;
                dj0.d dVar2 = success.f72153a;
                if (zA) {
                    return new pfm.a(e0Var.N(success), new m0g.d(14, new x(e0Var, exchangeResult, 1)), 4);
                }
                Intrinsics.checkNotNullParameter(success, "<this>");
                if (!cp5.d.y(dVar2.f115083b) && !cp5.d.y(dVar.f115083b)) {
                    return ((g1i.l0) mVar).d();
                }
                xi0.b currency = cp5.d.y(dVar2.f115083b) ? dVar2.f115083b : dVar.f115083b;
                ocj.a destination = ocj.a.TRANSACTIONS;
                g1i.l0 l0Var = (g1i.l0) mVar;
                l0Var.getClass();
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(destination, "destination");
                return l0Var.d.a(FinishFlowCommand.f98647a);
            default:
                xi0.b destinationCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(destinationCurrency, "destinationCurrency");
                m mVar2 = this.f201591b.i;
                ExchangeResult.Success success2 = (ExchangeResult.Success) this.f201592c;
                String groupId = success2.f72156g;
                String legId = success2.f72157h;
                String str = success2.i;
                String walletId = success2.f72158j;
                g1i.l0 l0Var2 = (g1i.l0) mVar2;
                l0Var2.getClass();
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intrinsics.checkNotNullParameter(legId, "legId");
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                if (str != null && ((Boolean) ((g1i.m0) l0Var2.f139651c).H0().get()).booleanValue()) {
                    legId = str;
                }
                return l0Var2.g(new FeatureCommand(new TransactionsFeatureConfig.Details(qk.d.d(groupId, legId, walletId), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124)));
        }
    }
}
