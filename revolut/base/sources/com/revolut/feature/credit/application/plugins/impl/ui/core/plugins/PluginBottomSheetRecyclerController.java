package com.revolut.feature.credit.application.plugins.impl.ui.core.plugins;

import aii.r;
import cli.j;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import in0.g;
import kji.f;
import kotlin.Metadata;
import no.k;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginBottomSheetRecyclerController;", "Laii/r;", "OUTPUT_DATA", "Lcli/j;", "DOMAIN", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lno/k;", "Lin0/g;", "Lkji/f;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PluginBottomSheetRecyclerController<OUTPUT_DATA extends r, DOMAIN extends j> extends BaseBottomSheetRecyclerController<OUTPUT_DATA, DOMAIN> implements k, g, f {
    public AnalyticsContext Q;

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Q = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getQ() {
        return this.Q;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
