package tzb;

import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingPrompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPersonalisationTargetingOnboardingPrompt f275902a;

    public d(RevPointsPersonalisationTargetingOnboardingPrompt prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f275902a = prompt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f275902a, ((d) obj2).f275902a);
    }

    public final int hashCode() {
        return this.f275902a.hashCode();
    }
}
