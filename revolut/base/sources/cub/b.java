package cub;

import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingPrompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPersonalisationTargetingOnboardingPrompt f108938a;

    public b(RevPointsPersonalisationTargetingOnboardingPrompt prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f108938a = prompt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f108938a, ((b) obj2).f108938a);
    }

    public final int hashCode() {
        return this.f108938a.hashCode();
    }
}
