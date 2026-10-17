package com.fourthline.orca.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class cu {
    public final yt a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new yt(tracker);
    }

    public final lu a() {
        return new lu();
    }

    public final hu a(bs eidBundle) {
        Intrinsics.checkNotNullParameter(eidBundle, "eidBundle");
        return new iu(eidBundle);
    }

    public final mu a(Context context, lu stateProvider, ws flowCoordinator, hu repository, yt analytics, v10 imageServiceLocator, bq0 popupHandlerBuilder, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new mu(context, new f80(stateProvider), new wr(coroutineScope), flowCoordinator, stateProvider, repository, analytics, popupHandlerBuilder.a(new ju(imageServiceLocator)), coroutineScope);
    }
}
