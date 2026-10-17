package com.fourthline.orca.internal;

import com.fourthline.orca.internal.g11;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.q80;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class s01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n01 f32877a;

    public s01(n01 flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f32877a = flowConfig;
    }

    public final m01 a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new m01(s70.a(mainRepository));
    }

    public final a11 a(r01 selfieFlowDataBundle, ef deviceDataBundle, sg0 analyticsTracker, boolean z) {
        Intrinsics.checkNotNullParameter(selfieFlowDataBundle, "selfieFlowDataBundle");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        return new b11(this.f32877a, selfieFlowDataBundle, deviceDataBundle, analyticsTracker, z);
    }

    public final f11 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new f11(tracker);
    }

    public final l11 a(l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new l11(0, 0, lottieServiceLocator, imageServiceLocator, 3, null);
    }

    public final m11 a(q01 flowCoordinator, f11 analytics, l11 stateProvider, bq0 popupHandlerBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new m11(new f80(stateProvider), flowCoordinator, popupHandlerBuilder.a(new p30(new mp1(flowCoordinator, 26), imageServiceLocator)), analytics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(q01 q01Var, hq0.c it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        q01Var.b(g11.a.f28733a);
        return Unit.f186387a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j11 a(o80 navigationChannel, sj0 permissionChecker, bq0 popupHandlerBuilder, l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(permissionChecker, "permissionChecker");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new j11(navigationChannel, new on1(permissionChecker, 4), popupHandlerBuilder.a(new i9(lottieServiceLocator), new q9(null, imageServiceLocator, 1, 0 == true ? 1 : 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(sj0 sj0Var) {
        return !sj0Var.a();
    }

    public final p7 a(final o80 navigationChannel, l70 lottieServiceLocator, aq0 popupHandler, ic1 requestsBuilder, ry dataWorkManager, lz whatsNextWorker, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(requestsBuilder, "requestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kc1 kc1Var = new kc1(false, lottieServiceLocator.a(k70.f30153h));
        return new p7(new f80(kc1Var), kc1Var, popupHandler, new fe1() { // from class: com.fourthline.orca.internal.cs1
            @Override // com.fourthline.orca.internal.fe1
            public final void b(ee1 ee1Var) {
                s01.a(navigationChannel, ee1Var);
            }
        }, new ub1(), requestsBuilder, dataWorkManager, whatsNextWorker, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(o80 o80Var, ee1 it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        o80Var.mo3647trySendJP2dKIU(new q80.b(new p80(false, false, false, new sp0(q80.w.a.f32334b, false, false, 6, null), 7, null)));
    }
}
