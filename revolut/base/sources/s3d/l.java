package s3d;

import ihd.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f259657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f259658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ugd.b f259659c;

    public l(xoj.a featuresInteractor, w customisationScreenProvider, ugd.b multipleWatchlistCustomisationScreenProvider) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(customisationScreenProvider, "customisationScreenProvider");
        Intrinsics.checkNotNullParameter(multipleWatchlistCustomisationScreenProvider, "multipleWatchlistCustomisationScreenProvider");
        this.f259657a = featuresInteractor;
        this.f259658b = customisationScreenProvider;
        this.f259659c = multipleWatchlistCustomisationScreenProvider;
    }

    public final d a(jpc.e widgetDataProvider, v1d.b widgetConfigProvider) {
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        return new d(widgetDataProvider, this.f259657a, this.f259658b, this.f259659c, widgetConfigProvider);
    }
}
