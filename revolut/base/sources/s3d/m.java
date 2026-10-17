package s3d;

import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import l3d.h0;
import l3d.r;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f259660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f259661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f259662c;

    public m(a0 widgetsUiInteractor, h0 singleWatchlistInteractor, r multipleWatchlistInteractor) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(singleWatchlistInteractor, "singleWatchlistInteractor");
        Intrinsics.checkNotNullParameter(multipleWatchlistInteractor, "multipleWatchlistInteractor");
        this.f259660a = widgetsUiInteractor;
        this.f259661b = singleWatchlistInteractor;
        this.f259662c = multipleWatchlistInteractor;
    }

    public final k a(v1d.b widgetConfigProvider, ash.d widgetsCommonEventDispatcher, m3d.j navigationProvider, boolean z, csh.f fVar) {
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        return new k(this.f259660a, widgetConfigProvider, widgetsCommonEventDispatcher, navigationProvider, z, fVar, this.f259661b, this.f259662c);
    }
}
