package q3d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f241953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f241954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1d.j f241955c;

    public h(m3d.j navigationProvider, g presentationModel, xoj.a featuresInteractor, e watchlistWidgetMapper, v1d.j widgetCatalogueDataProvider) {
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(watchlistWidgetMapper, "watchlistWidgetMapper");
        Intrinsics.checkNotNullParameter(widgetCatalogueDataProvider, "widgetCatalogueDataProvider");
        this.f241953a = presentationModel;
        this.f241954b = watchlistWidgetMapper;
        this.f241955c = widgetCatalogueDataProvider;
    }

    public final jpc.e a(v1d.j widgetCatalogueDataProvider) {
        Intrinsics.checkNotNullParameter(widgetCatalogueDataProvider, "widgetCatalogueDataProvider");
        return new jpc.e(this.f241954b, this.f241953a, widgetCatalogueDataProvider);
    }
}
