package com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.kompot;

import android.content.Intent;
import androidx.core.content.IntentCompat;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import h0l.c;
import h0l.d;
import j0l.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.m;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_backend_flow/kompot/TradingOnboardingBackendFlowController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lh0l/d;", "Lno/m;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradingOnboardingBackendFlowController extends SimpleViewController<d> implements m {
    public final AnalyticsProduct N;
    public final int O;
    public final b P;

    public TradingOnboardingBackendFlowController(TradingOnboardingBackendFlowContract$Configuration config, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.N = analyticsProduct;
        this.O = R$layout.screen_transparent;
        this.P = new b(config);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        b bVar = this.P;
        bVar.getClass();
        if (i != 9876) {
            return;
        }
        if (i2 == -1) {
            bVar.C2(new c(intent != null ? (NaviCommand) IntentCompat.getParcelableExtra(intent, "nextNaviCommand", NaviCommand.class) : null));
        } else {
            bVar.C2(h0l.b.f148431a);
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }
}
