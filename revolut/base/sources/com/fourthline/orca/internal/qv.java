package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class qv {
    public final kc1 a(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        return new kc1(false, lottieServiceLocator.a(k70.f30153h));
    }

    public final qs a(r70 mainRepository, ib0 networkService, us eidFlowConfig, mb.d networkEnvironment) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(eidFlowConfig, "eidFlowConfig");
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        if (mainRepository.c()) {
            return new w51();
        }
        return new ca0(networkService, !Intrinsics.f(networkEnvironment, mb.b.f204053a) && eidFlowConfig.getBoxCardSimulation());
    }

    public final wd1 a(ts flowActionProvider, ry dataWorkManager, lz whatsNextWorker) {
        Intrinsics.checkNotNullParameter(flowActionProvider, "flowActionProvider");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(flowActionProvider, new z51(), dataWorkManager, whatsNextWorker);
    }

    public final yv a(bs eidBundle) {
        Intrinsics.checkNotNullParameter(eidBundle, "eidBundle");
        return new xv(eidBundle);
    }

    public final aw a(kc1 stateProvider, ws flowCoordinator, yv resultRepository, qs eidFinishWorker, Function0 workflowIdProvider, bq0 popupHandlerBuilder, v10 imageServiceLocator, wd1 viewCompletionHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(eidFinishWorker, "eidFinishWorker");
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new aw(new f80(stateProvider), flowCoordinator, resultRepository, eidFinishWorker, workflowIdProvider, viewCompletionHandler, popupHandlerBuilder.a(new bw(flowCoordinator, imageServiceLocator), new qu(flowCoordinator, imageServiceLocator), new ps(imageServiceLocator), new zv(flowCoordinator, imageServiceLocator), new pv(flowCoordinator, imageServiceLocator)), coroutineScope);
    }
}
