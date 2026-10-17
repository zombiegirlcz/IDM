package com.revolut.feature.credit.application.plugins.impl.ui.core.plugins;

import c84.p;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import kotlin.Metadata;
import no.d1;
import no.k;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc84/p;", "Lyki/f;", "Lin0/g;", "Lno/k;", "Lno/d1;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PluginFlowControllerV2 extends ViewController<p> implements f, g, k, d1 {
    public AnalyticsContext K;

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.K = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getK() {
        return this.K;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
