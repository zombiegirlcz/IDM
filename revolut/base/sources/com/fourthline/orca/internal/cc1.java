package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class cc1 {
    public final bc1 a(o80 navigationChannel, bq0 popupHandlerBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new bc1(navigationChannel, popupHandlerBuilder.a(new q9(null, imageServiceLocator, 1, null)));
    }

    public final kc1 a(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        return new kc1(false, lottieServiceLocator.a(k70.f30153h));
    }

    public final ub1 a() {
        return new ub1();
    }

    public final lc1 a(kc1 stateProvider, aq0 popupHandler, ub1 analytics, bc1 flowCoordinator, ic1 requestsBuilder, ry dataWorkManager, lz whatsNextWorker, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(requestsBuilder, "requestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new lc1(new f80(stateProvider), stateProvider, popupHandler, flowCoordinator, analytics, requestsBuilder, dataWorkManager, whatsNextWorker, coroutineScope);
    }
}
