package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ct {
    public final uy a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new uy(tracker);
    }

    public final zr b(bs bundle, EidServiceProvider eidServiceProvider) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(eidServiceProvider, "eidServiceProvider");
        return new hr0(bundle, eidServiceProvider);
    }

    public final ov c(bs bundle, EidServiceProvider eidServiceProvider) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(eidServiceProvider, "eidServiceProvider");
        return new ir0(bundle, eidServiceProvider);
    }

    public final ez a(bs bundle, Function0 workflowIdProvider, us eidFlowConfig) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(eidFlowConfig, "eidFlowConfig");
        return new dz(workflowIdProvider, bundle, eidFlowConfig);
    }

    public final gz a(v10 imageServiceLocator, ez repository) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        return new gz(imageServiceLocator, repository);
    }

    public final cw a(r70 mainRepository, ib0 networkService) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        if (mainRepository.c()) {
            return new x51();
        }
        return new da0(networkService);
    }

    public final xr a(bs bundle, EidServiceProvider eidServiceProvider) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(eidServiceProvider, "eidServiceProvider");
        return new gr0(bundle, eidServiceProvider);
    }

    public final pu a(cw eidWorkflowTokenUrlWorker, ov eidSdkConnectedWorker, zr eidAccessRightsWorker) {
        Intrinsics.checkNotNullParameter(eidWorkflowTokenUrlWorker, "eidWorkflowTokenUrlWorker");
        Intrinsics.checkNotNullParameter(eidSdkConnectedWorker, "eidSdkConnectedWorker");
        Intrinsics.checkNotNullParameter(eidAccessRightsWorker, "eidAccessRightsWorker");
        return new bb(eidWorkflowTokenUrlWorker, eidSdkConnectedWorker, eidAccessRightsWorker);
    }

    public final hz a(ws flowCoordinator, ez repository, uy analytics, pu eidReadyWorker, jz flowVariantWorker, xr eidAcceptAccessRightsWorker, gz stateProvider, v10 imageServiceLocator, l70 lottieServiceLocator, bq0 popupHandlerBuilder, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(eidReadyWorker, "eidReadyWorker");
        Intrinsics.checkNotNullParameter(flowVariantWorker, "flowVariantWorker");
        Intrinsics.checkNotNullParameter(eidAcceptAccessRightsWorker, "eidAcceptAccessRightsWorker");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new hz(new f80(stateProvider), flowCoordinator, stateProvider, repository, eidReadyWorker, flowVariantWorker, analytics, popupHandlerBuilder.a(new bz(repository, eidAcceptAccessRightsWorker, flowCoordinator, analytics, imageServiceLocator, lottieServiceLocator, coroutineScope), new cz(flowCoordinator, analytics, imageServiceLocator), new qu(flowCoordinator, imageServiceLocator), new ps(imageServiceLocator), new vy(imageServiceLocator)), coroutineScope);
    }
}
