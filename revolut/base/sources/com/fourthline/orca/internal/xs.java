package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final us f35082a;

    public xs(us flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f35082a = flowConfig;
    }

    public final us a() {
        return this.f35082a;
    }

    public final ts b() {
        return new ts();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ws a(o80 navigationChannel, bq0 popupHandlerBuilder, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new ws(navigationChannel, popupHandlerBuilder.a(new q9(null, imageServiceLocator, 1, 0 == true ? 1 : 0)));
    }
}
