package com.revolut.feature.wealth.ui.impl.actions.handler;

import aii.q;
import com.revolut.kompot.navigable.vc.flow.SimpleFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yki.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/actions/handler/WealthTransferFlow;", "Lcom/revolut/kompot/navigable/vc/flow/SimpleFlow;", "Lcom/revolut/feature/wealth/ui/impl/actions/handler/WealthTransferFlowControllerFactory$Step;", "Laii/q;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class WealthTransferFlow extends SimpleFlow<WealthTransferFlowControllerFactory$Step, q> {
    public final a M;

    public WealthTransferFlow(WealthTransferFlowControllerFactory$Descriptor descriptor, iih.a transferDestinationProvider) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(transferDestinationProvider, "transferDestinationProvider");
        this.M = new a(descriptor, transferDestinationProvider);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.vc.flow.SimpleFlow
    public final k d3() {
        return this.M;
    }
}
