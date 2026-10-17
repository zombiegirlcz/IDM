package hae;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptions.impl.history.kompot.SubscriptionHistoryControllerContract$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import efm.r;
import ha1.s;
import hae.i;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import yua.q;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends oki.h implements e {
    public final SubscriptionHistoryControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xua.a f150497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final whf.b f150498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s71.c f150499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i9e.c f150500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f150501t;

    public l(SubscriptionHistoryControllerContract$InputData inputData, n stateMapper, xua.a recurringPaymentInteractor, whf.b transactionsContentProvider, s71.c recurringPaymentsFilterProvider, i9e.c amountConverter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentsFilterProvider, "recurringPaymentsFilterProvider");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.o = inputData;
        this.f150497p = recurringPaymentInteractor;
        this.f150498q = transactionsContentProvider;
        this.f150499r = recurringPaymentsFilterProvider;
        this.f150500s = amountConverter;
        this.f150501t = mra.d.b(this, new f(new TextClause(inputData.f89203b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        SubscriptionHistoryControllerContract$InputData subscriptionHistoryControllerContract$InputData = this.o;
        boolean z = subscriptionHistoryControllerContract$InputData.d;
        r map = m70.a.g(((q) this.f150497p).o(subscriptionHistoryControllerContract$InputData.f89202a), new h43.q(26), null, 2).map(new k(new gae.a(this, z, 7), 1));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarOnErrorReturn = m70.a.g(whf.b.a(this.f150498q, map, null, null, null, 14), null, new h43.q(25), 1).flatMapSingle(new s(28, new h56.a(this, 18))).map(new s(29, new ha1.k(24))).onErrorReturn(new k(new ha1.k(25), 0));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturn, "onErrorReturn(...)");
        yji.l.a1(this, rd0.e.b(rVarOnErrorReturn), null, null, new gul.n(this, null, 27), 3);
    }

    public final void I2(i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof j)) {
            if (!event.equals(i.a.f150493a)) {
                throw new NoWhenBranchMatchedException();
            }
            B2();
        } else {
            Object obj2 = ((j) event).f150494a.u;
            a3 a3Var = obj2 instanceof a3 ? (a3) obj2 : null;
            if (a3Var == null) {
                return;
            }
            C1(u0.c(new TransactionsFeatureConfig.Details(ofm.q.P(a3Var), null, null, null, 122)));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f150501t;
    }
}
