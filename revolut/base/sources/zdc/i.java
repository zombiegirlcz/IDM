package zdc;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.shared.ui.order_summary.OrderSummaryScreenContract$InputData;
import k7c.k;
import kotlin.jvm.internal.Intrinsics;
import tyc.l;
import w4l.j;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends oki.h implements dli.b {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zcc.a f321449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final OrderSummaryScreenContract$InputData f321450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f321451r;

    public i(k orderDetailsRepository, zcc.a paymentSummaryInteractor, OrderSummaryScreenContract$InputData inputData, l stateMapper) {
        Intrinsics.checkNotNullParameter(orderDetailsRepository, "orderDetailsRepository");
        Intrinsics.checkNotNullParameter(paymentSummaryInteractor, "paymentSummaryInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = orderDetailsRepository;
        this.f321449p = paymentSummaryInteractor;
        this.f321450q = inputData;
        this.f321451r = mra.d.b(this, new g(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String orderToken = this.f321450q.f84716a;
        k kVar = this.o;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        j loadingStrategy = j.f294644c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, rd0.e.b(kVar.d.e(orderToken, loadingStrategy)), null, null, new yy6.f(this, null, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f321451r;
    }
}
