package com.onfido.android.sdk.capture.ui.camera.liveness;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import com.onfido.android.sdk.capture.ui.options.BaseOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessConfirmationOptions;", "Lcom/onfido/android/sdk/capture/ui/options/BaseOptions;", "videoFilePath", "", "livenessPerformedChallenges", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "showConfirmationVideo", "", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;Z)V", "getLivenessPerformedChallenges", "()Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "getShowConfirmationVideo", "()Z", "getVideoFilePath", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LivenessConfirmationOptions extends BaseOptions {

    @NotNull
    private final LivenessPerformedChallenges livenessPerformedChallenges;
    private final boolean showConfirmationVideo;

    @NotNull
    private final String videoFilePath;

    public LivenessConfirmationOptions(@NotNull String videoFilePath, @NotNull LivenessPerformedChallenges livenessPerformedChallenges, boolean z) {
        Intrinsics.checkNotNullParameter(videoFilePath, "videoFilePath");
        Intrinsics.checkNotNullParameter(livenessPerformedChallenges, "livenessPerformedChallenges");
        this.videoFilePath = videoFilePath;
        this.livenessPerformedChallenges = livenessPerformedChallenges;
        this.showConfirmationVideo = z;
    }

    public static /* synthetic */ LivenessConfirmationOptions copy$default(LivenessConfirmationOptions livenessConfirmationOptions, String str, LivenessPerformedChallenges livenessPerformedChallenges, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = livenessConfirmationOptions.videoFilePath;
        }
        if ((i & 2) != 0) {
            livenessPerformedChallenges = livenessConfirmationOptions.livenessPerformedChallenges;
        }
        if ((i & 4) != 0) {
            z = livenessConfirmationOptions.showConfirmationVideo;
        }
        return livenessConfirmationOptions.copy(str, livenessPerformedChallenges, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVideoFilePath() {
        return this.videoFilePath;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LivenessPerformedChallenges getLivenessPerformedChallenges() {
        return this.livenessPerformedChallenges;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowConfirmationVideo() {
        return this.showConfirmationVideo;
    }

    @NotNull
    public final LivenessConfirmationOptions copy(@NotNull String videoFilePath, @NotNull LivenessPerformedChallenges livenessPerformedChallenges, boolean showConfirmationVideo) {
        Intrinsics.checkNotNullParameter(videoFilePath, "videoFilePath");
        Intrinsics.checkNotNullParameter(livenessPerformedChallenges, "livenessPerformedChallenges");
        return new LivenessConfirmationOptions(videoFilePath, livenessPerformedChallenges, showConfirmationVideo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivenessConfirmationOptions)) {
            return false;
        }
        LivenessConfirmationOptions livenessConfirmationOptions = (LivenessConfirmationOptions) other;
        return Intrinsics.f(this.videoFilePath, livenessConfirmationOptions.videoFilePath) && Intrinsics.f(this.livenessPerformedChallenges, livenessConfirmationOptions.livenessPerformedChallenges) && this.showConfirmationVideo == livenessConfirmationOptions.showConfirmationVideo;
    }

    @NotNull
    public final LivenessPerformedChallenges getLivenessPerformedChallenges() {
        return this.livenessPerformedChallenges;
    }

    public final boolean getShowConfirmationVideo() {
        return this.showConfirmationVideo;
    }

    @NotNull
    public final String getVideoFilePath() {
        return this.videoFilePath;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showConfirmationVideo) + ((this.livenessPerformedChallenges.hashCode() + (this.videoFilePath.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("LivenessConfirmationOptions(videoFilePath=");
        sb6.append(this.videoFilePath);
        sb6.append(", livenessPerformedChallenges=");
        sb6.append(this.livenessPerformedChallenges);
        sb6.append(", showConfirmationVideo=");
        return j6.a.x(sb6, this.showConfirmationVideo, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
