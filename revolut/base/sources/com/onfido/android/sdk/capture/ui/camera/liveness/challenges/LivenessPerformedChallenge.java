package com.onfido.android.sdk.capture.ui.camera.liveness.challenges;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenge;", "Ljava/io/Serializable;", "livenessChallenge", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;", "endChallengeTimestamp", "", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;J)V", "getEndChallengeTimestamp", "()J", "getLivenessChallenge", "()Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LivenessPerformedChallenge implements Serializable {
    private final long endChallengeTimestamp;

    @NotNull
    private final LivenessChallenge livenessChallenge;

    public LivenessPerformedChallenge(@NotNull LivenessChallenge livenessChallenge, long j2) {
        Intrinsics.checkNotNullParameter(livenessChallenge, "livenessChallenge");
        this.livenessChallenge = livenessChallenge;
        this.endChallengeTimestamp = j2;
    }

    public static /* synthetic */ LivenessPerformedChallenge copy$default(LivenessPerformedChallenge livenessPerformedChallenge, LivenessChallenge livenessChallenge, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            livenessChallenge = livenessPerformedChallenge.livenessChallenge;
        }
        if ((i & 2) != 0) {
            j2 = livenessPerformedChallenge.endChallengeTimestamp;
        }
        return livenessPerformedChallenge.copy(livenessChallenge, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LivenessChallenge getLivenessChallenge() {
        return this.livenessChallenge;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndChallengeTimestamp() {
        return this.endChallengeTimestamp;
    }

    @NotNull
    public final LivenessPerformedChallenge copy(@NotNull LivenessChallenge livenessChallenge, long endChallengeTimestamp) {
        Intrinsics.checkNotNullParameter(livenessChallenge, "livenessChallenge");
        return new LivenessPerformedChallenge(livenessChallenge, endChallengeTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivenessPerformedChallenge)) {
            return false;
        }
        LivenessPerformedChallenge livenessPerformedChallenge = (LivenessPerformedChallenge) other;
        return Intrinsics.f(this.livenessChallenge, livenessPerformedChallenge.livenessChallenge) && this.endChallengeTimestamp == livenessPerformedChallenge.endChallengeTimestamp;
    }

    public final long getEndChallengeTimestamp() {
        return this.endChallengeTimestamp;
    }

    @NotNull
    public final LivenessChallenge getLivenessChallenge() {
        return this.livenessChallenge;
    }

    public int hashCode() {
        return Long.hashCode(this.endChallengeTimestamp) + (this.livenessChallenge.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("LivenessPerformedChallenge(livenessChallenge=");
        sb6.append(this.livenessChallenge);
        sb6.append(", endChallengeTimestamp=");
        return d.t(sb6, this.endChallengeTimestamp, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ LivenessPerformedChallenge(LivenessChallenge livenessChallenge, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(livenessChallenge, (i & 2) != 0 ? 0L : j2);
    }
}
