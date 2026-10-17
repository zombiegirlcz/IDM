package tw4;

import ish.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f274909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f274910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f274911c;
    public final bm4.b d;
    public final j e;

    public f(g creditCardInstalmentWidgetMapper, a creditCardInstalmentWidgetAvailabilityProvider, a0 widgetsUiInteractor, bm4.b creditCardInstalmentWidgetUiInteractor, j creditCardInstalmentWidgetVisibilityProvider) {
        Intrinsics.checkNotNullParameter(creditCardInstalmentWidgetMapper, "creditCardInstalmentWidgetMapper");
        Intrinsics.checkNotNullParameter(creditCardInstalmentWidgetAvailabilityProvider, "creditCardInstalmentWidgetAvailabilityProvider");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentWidgetUiInteractor, "creditCardInstalmentWidgetUiInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentWidgetVisibilityProvider, "creditCardInstalmentWidgetVisibilityProvider");
        this.f274909a = creditCardInstalmentWidgetMapper;
        this.f274910b = creditCardInstalmentWidgetAvailabilityProvider;
        this.f274911c = widgetsUiInteractor;
        this.d = creditCardInstalmentWidgetUiInteractor;
        this.e = creditCardInstalmentWidgetVisibilityProvider;
    }
}
