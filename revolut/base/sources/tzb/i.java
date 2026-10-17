package tzb;

import cli.y;
import com.revolut.feature.rev_points.impl.ui.personalisation_targeting_onboarding.RevPointsPersonalisationTargetingOnboardingScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import nyb.e0;
import q06.l;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends oki.h implements dli.b {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e0 f275910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f275911q;

    public i(k stateMapper, RevPointsPersonalisationTargetingOnboardingScreenContract$InputData inputData, l deeplinkRouter, e0 personalisationTargetingSettingsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(personalisationTargetingSettingsInteractor, "personalisationTargetingSettingsInteractor");
        this.o = deeplinkRouter;
        this.f275910p = personalisationTargetingSettingsInteractor;
        this.f275911q = mra.d.b(this, new d(inputData.f83827a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f275911q;
    }
}
