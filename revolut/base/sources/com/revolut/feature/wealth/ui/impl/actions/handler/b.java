package com.revolut.feature.wealth.ui.impl.actions.handler;

import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iih.a f95945a;

    public b(iih.a transferDestinationProvider) {
        Intrinsics.checkNotNullParameter(transferDestinationProvider, "transferDestinationProvider");
        this.f95945a = transferDestinationProvider;
    }

    public final ViewController a(WealthTransferFlowControllerFactory$Descriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return new WealthTransferFlow(descriptor, this.f95945a);
    }
}
