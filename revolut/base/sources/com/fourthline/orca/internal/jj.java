package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jj {
    public final b50 a(fj scannerCoordinator) {
        Intrinsics.checkNotNullParameter(scannerCoordinator, "scannerCoordinator");
        return new b50(scannerCoordinator);
    }

    public final a50 c(fj flowCoordinator) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        return new a50(flowCoordinator);
    }

    public final rm a(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new rm(imageServiceLocator);
    }

    public final z40 b(fj flowCoordinator) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        return new z40(flowCoordinator);
    }

    public final tm a(qo flowConfig, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new tm(true, new ul1(flowConfig, 27), imageServiceLocator);
    }

    public final no b(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new no(false, imageServiceLocator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(qo qoVar) {
        return qoVar.f();
    }

    public final aq0 a(bq0 popupHandlerBuilder, l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        return popupHandlerBuilder.a(new i9(lottieServiceLocator));
    }
}
