package com.revolut.feature.stock_lending.impl.ui.onboarding;

import aii.q;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import g1e.e;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/stock_lending/impl/ui/onboarding/StockLendingOnboardingController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "Lno/m;", "feature_stock_lending_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockLendingOnboardingController extends SimpleViewController<q> implements m {
    public final AnalyticsProduct.Retail N;
    public final int O;
    public final e P;

    public StockLendingOnboardingController(StockLendingOnboardingContract$Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        k9 k9Var = k9.Trading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.N = a.h(k9Var, "value", k9Var);
        this.O = R$layout.screen_transparent;
        this.P = new e(configuration);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        e eVar = this.P;
        if (i != 31452) {
            eVar.getClass();
        } else if (i2 == -1) {
            eVar.C2(q.f5292a);
        } else {
            eVar.B2();
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }
}
