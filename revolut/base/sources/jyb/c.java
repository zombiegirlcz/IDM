package jyb;

import eub.k;
import kotlin.jvm.internal.Intrinsics;
import nyb.d0;
import nyb.e0;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k f179359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f179360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e0 f179361n;

    public c(k revPointsPersonalisationAvailabilityInteractor, d0 revPointsPersonalisationTargetingOnboardingInteractor, e0 revPointsPersonalisationTargetingSettingsInteractor) {
        Intrinsics.checkNotNullParameter(revPointsPersonalisationAvailabilityInteractor, "revPointsPersonalisationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsPersonalisationTargetingOnboardingInteractor, "revPointsPersonalisationTargetingOnboardingInteractor");
        Intrinsics.checkNotNullParameter(revPointsPersonalisationTargetingSettingsInteractor, "revPointsPersonalisationTargetingSettingsInteractor");
        this.f179359l = revPointsPersonalisationAvailabilityInteractor;
        this.f179360m = revPointsPersonalisationTargetingOnboardingInteractor;
        this.f179361n = revPointsPersonalisationTargetingSettingsInteractor;
    }
}
