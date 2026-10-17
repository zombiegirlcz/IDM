package x9h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f303743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g9h.e f303744b;

    public g(ln.a navigationCommandsDispatcher, ugh.a navigationProvider, g9h.c assetDetailsNotAvailableProvider, g9h.e topMoversDestinationProvider) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(assetDetailsNotAvailableProvider, "assetDetailsNotAvailableProvider");
        Intrinsics.checkNotNullParameter(topMoversDestinationProvider, "topMoversDestinationProvider");
        this.f303743a = navigationCommandsDispatcher;
        this.f303744b = topMoversDestinationProvider;
    }
}
