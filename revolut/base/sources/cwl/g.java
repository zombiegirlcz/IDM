package cwl;

import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import cu8.u0;
import fwj.p;
import ip0.v7;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import nii.t0;
import pfm.h;
import sri.m;
import ufm.i;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements w49.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.retail.feature.api.userauth.navigation.a f109865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9k.a f109866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa5.a f109867c;
    public final t70.g d;
    public final p e;
    public final qd0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f109868g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f109869h;
    public final Lazy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t0 f109870j;

    public g(BaseDelegatesActivity activity, com.revolut.retail.feature.api.userauth.navigation.a userOnboardingNavigationProvider, x9k.a pcwAuthInteractor, aa5.a pcwNavigationFactory, t70.g localization, v60.e serverErrorsProvider, rqi.c storeCommandFactory, p userOnboardingInteractor, qd0.b languageProvider, pwl.d navigatorFactory, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(userOnboardingNavigationProvider, "userOnboardingNavigationProvider");
        Intrinsics.checkNotNullParameter(pcwAuthInteractor, "pcwAuthInteractor");
        Intrinsics.checkNotNullParameter(pcwNavigationFactory, "pcwNavigationFactory");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(storeCommandFactory, "storeCommandFactory");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(navigatorFactory, "navigatorFactory");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f109865a = userOnboardingNavigationProvider;
        this.f109866b = pcwAuthInteractor;
        this.f109867c = pcwNavigationFactory;
        this.d = localization;
        this.e = userOnboardingInteractor;
        this.f = languageProvider;
        this.f109868g = featureToggleInteractor;
        this.f109869h = new WeakReference(activity);
        this.i = j.b(new co7.a(this, 15));
    }

    public final m a() {
        BaseDelegatesActivity baseDelegatesActivity = (BaseDelegatesActivity) this.f109869h.get();
        if (baseDelegatesActivity != null) {
            return pwl.d.a(baseDelegatesActivity);
        }
        return null;
    }

    public final h b(boolean z) {
        i iVar = new i(this.e.b(), new u0(14, new b(this, z, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return v7.x(new ufm.f(o70.a.i(iVar), new ag.j(new a(this, 0), 13), 3), "ignoreElement(...)");
    }
}
