package com.revolut.feature.credit.application.plugins.impl.ui.core.plugins;

import aii.r;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import kji.f;
import kotlin.Metadata;
import no.k;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Laii/r;", "OUTPUT_DATA", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lno/k;", "Lin0/g;", "Lkji/f;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PluginScreenController<OUTPUT_DATA extends r> extends ViewController<OUTPUT_DATA> implements k, g, f {
    public AnalyticsContext K;

    public void K1(AnalyticsContext analyticsContext) {
        this.K = analyticsContext;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public AnalyticsContext getK() {
        return this.K;
    }

    @Override // in0.g
    public boolean p0() {
        return true;
    }
}
