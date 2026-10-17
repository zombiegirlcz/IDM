package gjh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ejh.b f144299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f144300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jlh.f f144301c;
    public final j d;

    public f(ejh.b onboardingNavigationCommandFactory, g mapper, jlh.f accountWidgetsPersonalisationInteractor, j investInWidgetPopupMenuMapper) {
        Intrinsics.checkNotNullParameter(onboardingNavigationCommandFactory, "onboardingNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(accountWidgetsPersonalisationInteractor, "accountWidgetsPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(investInWidgetPopupMenuMapper, "investInWidgetPopupMenuMapper");
        this.f144299a = onboardingNavigationCommandFactory;
        this.f144300b = mapper;
        this.f144301c = accountWidgetsPersonalisationInteractor;
        this.d = investInWidgetPopupMenuMapper;
    }
}
