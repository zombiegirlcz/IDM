package tl;

import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LivenessPerformedChallenges f271987b;

    public i(String videoPath, LivenessPerformedChallenges livenessChallenges) {
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        Intrinsics.checkNotNullParameter(livenessChallenges, "livenessChallenges");
        this.f271986a = videoPath;
        this.f271987b = livenessChallenges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f271986a, iVar.f271986a) && Intrinsics.f(this.f271987b, iVar.f271987b);
    }

    public final int hashCode() {
        return this.f271987b.hashCode() + (this.f271986a.hashCode() * 31);
    }

    public final String toString() {
        return "FaceUploadVideo(videoPath=" + this.f271986a + ", livenessChallenges=" + this.f271987b + ")";
    }
}
