package com.onfido.android.sdk.capture.ui.camera.liveness.video_view;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallenge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/video_view/LivenessReviewChallenge;", "", "livenessChallenge", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;", "endTimestamp", "", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;J)V", "getEndTimestamp", "()J", "getLivenessChallenge", "()Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LivenessReviewChallenge {
    private final long endTimestamp;

    @NotNull
    private final LivenessChallenge livenessChallenge;

    public LivenessReviewChallenge(@NotNull LivenessChallenge livenessChallenge, long j2) {
        Intrinsics.checkNotNullParameter(livenessChallenge, "livenessChallenge");
        this.livenessChallenge = livenessChallenge;
        this.endTimestamp = j2;
    }

    public static /* synthetic */ LivenessReviewChallenge copy$default(LivenessReviewChallenge livenessReviewChallenge, LivenessChallenge livenessChallenge, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            livenessChallenge = livenessReviewChallenge.livenessChallenge;
        }
        if ((i & 2) != 0) {
            j2 = livenessReviewChallenge.endTimestamp;
        }
        return livenessReviewChallenge.copy(livenessChallenge, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LivenessChallenge getLivenessChallenge() {
        return this.livenessChallenge;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @NotNull
    public final LivenessReviewChallenge copy(@NotNull LivenessChallenge livenessChallenge, long endTimestamp) {
        Intrinsics.checkNotNullParameter(livenessChallenge, "livenessChallenge");
        return new LivenessReviewChallenge(livenessChallenge, endTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivenessReviewChallenge)) {
            return false;
        }
        LivenessReviewChallenge livenessReviewChallenge = (LivenessReviewChallenge) other;
        return Intrinsics.f(this.livenessChallenge, livenessReviewChallenge.livenessChallenge) && this.endTimestamp == livenessReviewChallenge.endTimestamp;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @NotNull
    public final LivenessChallenge getLivenessChallenge() {
        return this.livenessChallenge;
    }

    public int hashCode() {
        return Long.hashCode(this.endTimestamp) + (this.livenessChallenge.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("LivenessReviewChallenge(livenessChallenge=");
        sb6.append(this.livenessChallenge);
        sb6.append(", endTimestamp=");
        return a0.d.t(sb6, this.endTimestamp, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
