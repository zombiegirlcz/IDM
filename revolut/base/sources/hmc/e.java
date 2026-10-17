package hmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zjh.f f153635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tul.b f153636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f153637n;
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final clc.b f153638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f153639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f153640r;

    public e(zjh.f portfolioInteractor, tul.b portfolioMetricsInteractor, j60.a bottomExpandableDialogControllerExtension, g roboSettingsWidgetDialogFactory, clc.b roboOnboardingEntryCommandFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(portfolioMetricsInteractor, "portfolioMetricsInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(roboSettingsWidgetDialogFactory, "roboSettingsWidgetDialogFactory");
        Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f153635l = portfolioInteractor;
        this.f153636m = portfolioMetricsInteractor;
        this.f153637n = bottomExpandableDialogControllerExtension;
        this.o = roboSettingsWidgetDialogFactory;
        this.f153638p = roboOnboardingEntryCommandFactory;
        this.f153639q = featureToggleInteractor;
        this.f153640r = te0.w.y0(new h1g.a(this, 23));
    }
}
