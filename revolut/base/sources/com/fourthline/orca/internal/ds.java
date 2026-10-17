package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ds {
    public final l9 a(bs eidBundle) {
        Intrinsics.checkNotNullParameter(eidBundle, "eidBundle");
        return new ls(eidBundle);
    }

    public final n9 b(bs eidBundle) {
        Intrinsics.checkNotNullParameter(eidBundle, "eidBundle");
        return new ms(eidBundle);
    }

    public final xc0 a(l9 repository, sg0 tracker, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new xc0(repository, imageServiceLocator, new p20(tracker), imageServiceLocator.a(r10.e));
    }

    public final qc0 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new qc0(tracker);
    }

    public final ns a(xc0 nfcCanStateHandler, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(nfcCanStateHandler, "nfcCanStateHandler");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new ns(nfcCanStateHandler, imageServiceLocator);
    }

    public final os a(ns stateProvider, n9 resultRepository, qc0 analytics, ws flowCoordinator, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new os(new f80(stateProvider), stateProvider, resultRepository, flowCoordinator, analytics, coroutineScope);
    }
}
