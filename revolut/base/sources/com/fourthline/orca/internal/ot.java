package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import com.fourthline.orca.internal.e40;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ot {
    public final j30 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new j30("eid", tracker);
    }

    public final d40 a(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        return new xt(lottieServiceLocator.a(k70.k));
    }

    public final vt a(mb.d networkEnvironment, us eidFlowConfig) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(eidFlowConfig, "eidFlowConfig");
        return new wt(eidFlowConfig, networkEnvironment);
    }

    public final e40.e a(vt eidIntroRepository, bs eidBundle, CoroutineScope coroutineScope, EidServiceProvider eidServiceProvider) {
        Intrinsics.checkNotNullParameter(eidIntroRepository, "eidIntroRepository");
        Intrinsics.checkNotNullParameter(eidBundle, "eidBundle");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(eidServiceProvider, "eidServiceProvider");
        return new mv(eidIntroRepository, eidBundle, coroutineScope, eidServiceProvider);
    }

    public final e40 a(j30 analytics, ws flowCoordinator, e40.e startScreenHandler, d40 stateProvider) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(startScreenHandler, "startScreenHandler");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new e40(analytics, new f80(stateProvider), stateProvider, flowCoordinator, ut.f34177a, startScreenHandler, null, 64, null);
    }
}
