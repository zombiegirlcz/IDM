package lah;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.CollectDepositInfoFlowContract$Input;
import com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.CollectDepositInfoFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import oki.h;
import yki.g;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends h implements g {
    public final CollectDepositInfoFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnalyticsProduct f193399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f193400q;

    public e(CollectDepositInfoFlowContract$Input inputData, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.o = inputData;
        this.f193399p = analyticsProduct;
        this.f193400q = cp5.d.a(this, CollectDepositInfoFlowContract$Step.SCREEN, f0.f322471a, new v(this, 24));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f193400q;
    }
}
