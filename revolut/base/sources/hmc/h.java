package hmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.f f153643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tul.b f153644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final clc.b f153645c;
    public final g d;
    public final dlc.g e;
    public final dlc.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f153646g;

    public h(zjh.f portfolioInteractor, tul.b portfolioMetricsInteractor, clc.b roboOnboardingEntryCommandFactory, g roboSettingsWidgetDialogFactory, dlc.g provider, dlc.f mapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(portfolioMetricsInteractor, "portfolioMetricsInteractor");
        Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
        Intrinsics.checkNotNullParameter(roboSettingsWidgetDialogFactory, "roboSettingsWidgetDialogFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f153643a = portfolioInteractor;
        this.f153644b = portfolioMetricsInteractor;
        this.f153645c = roboOnboardingEntryCommandFactory;
        this.d = roboSettingsWidgetDialogFactory;
        this.e = provider;
        this.f = mapper;
        this.f153646g = featureToggleInteractor;
    }

    public final dlc.e a(dlc.d delegatesProvider, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        e eVar = new e(this.f153643a, this.f153644b, bottomExpandableDialogControllerExtension, this.d, this.f153645c, this.f153646g);
        return new dlc.e(new c(delegatesProvider.Y1(), eVar), eVar);
    }
}
