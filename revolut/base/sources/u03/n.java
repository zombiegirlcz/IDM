package u03;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e03.c f276051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y70.a f276052b;

    public n(e03.c uiConfigurationProvider, l securityItemViewFactory, y70.a appInstalledChecker) {
        Intrinsics.checkNotNullParameter(uiConfigurationProvider, "uiConfigurationProvider");
        Intrinsics.checkNotNullParameter(securityItemViewFactory, "securityItemViewFactory");
        Intrinsics.checkNotNullParameter(appInstalledChecker, "appInstalledChecker");
        this.f276051a = uiConfigurationProvider;
        this.f276052b = appInstalledChecker;
    }
}
