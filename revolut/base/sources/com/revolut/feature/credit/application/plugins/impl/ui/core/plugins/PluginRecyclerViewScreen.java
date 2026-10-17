package com.revolut.feature.credit.application.plugins.impl.ui.core.plugins;

import aii.r;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import jki.n;
import kotlin.Metadata;
import no.k;
import yhm.d;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00072\u00020\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginRecyclerViewScreen;", "Ljki/n;", "UI_STATE", "Lcom/revolut/kompot/common/IOData$Input;", "INPUT_DATA", "Laii/r;", "OUTPUT_DATA", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lno/k;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class PluginRecyclerViewScreen<UI_STATE extends n, INPUT_DATA extends IOData$Input, OUTPUT_DATA extends r> extends BaseRecyclerViewScreen<UI_STATE, INPUT_DATA, OUTPUT_DATA> implements k {
    public AnalyticsContext U;

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.U = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getU() {
        return this.U;
    }
}
