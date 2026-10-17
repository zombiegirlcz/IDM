package vw4;

import android.content.Context;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f292634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.rev_points.api.navigation.a f292635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wu4.a f292636c;
    public final sri.m d;
    public final a0 e;
    public final m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f292637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f292638h;

    public g(i creditCardRevPointsWidgetMapper, com.revolut.feature.rev_points.api.navigation.a revPointsNavigationFactory, wu4.a creditCardRevPointsWidgetInteractor, sri.m navigator, a0 widgetsUiInteractor, m creditCardRevPointsWidgetVisibilityProvider, b creditCardRevPointsWidgetAvailabilityProvider, Context context) {
        Intrinsics.checkNotNullParameter(creditCardRevPointsWidgetMapper, "creditCardRevPointsWidgetMapper");
        Intrinsics.checkNotNullParameter(revPointsNavigationFactory, "revPointsNavigationFactory");
        Intrinsics.checkNotNullParameter(creditCardRevPointsWidgetInteractor, "creditCardRevPointsWidgetInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(creditCardRevPointsWidgetVisibilityProvider, "creditCardRevPointsWidgetVisibilityProvider");
        Intrinsics.checkNotNullParameter(creditCardRevPointsWidgetAvailabilityProvider, "creditCardRevPointsWidgetAvailabilityProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f292634a = creditCardRevPointsWidgetMapper;
        this.f292635b = revPointsNavigationFactory;
        this.f292636c = creditCardRevPointsWidgetInteractor;
        this.d = navigator;
        this.e = widgetsUiInteractor;
        this.f = creditCardRevPointsWidgetVisibilityProvider;
        this.f292637g = creditCardRevPointsWidgetAvailabilityProvider;
        this.f292638h = context;
    }
}
