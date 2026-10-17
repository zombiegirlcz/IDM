package com.onfido.android.sdk.capture.ui.camera.liveness.challenges;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;", "", "index", "", "challenge", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;", "isLastChallenge", "", "(ILcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;Z)V", "getChallenge", "()Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;", "getIndex", "()I", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LivenessChallengeViewModel {

    @NotNull
    private final LivenessChallenge challenge;
    private final int index;
    private final boolean isLastChallenge;

    public LivenessChallengeViewModel(int i, @NotNull LivenessChallenge challenge, boolean z) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.index = i;
        this.challenge = challenge;
        this.isLastChallenge = z;
    }

    public static /* synthetic */ LivenessChallengeViewModel copy$default(LivenessChallengeViewModel livenessChallengeViewModel, int i, LivenessChallenge livenessChallenge, boolean z, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = livenessChallengeViewModel.index;
        }
        if ((i2 & 2) != 0) {
            livenessChallenge = livenessChallengeViewModel.challenge;
        }
        if ((i2 & 4) != 0) {
            z = livenessChallengeViewModel.isLastChallenge;
        }
        return livenessChallengeViewModel.copy(i, livenessChallenge, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LivenessChallenge getChallenge() {
        return this.challenge;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsLastChallenge() {
        return this.isLastChallenge;
    }

    @NotNull
    public final LivenessChallengeViewModel copy(int index, @NotNull LivenessChallenge challenge, boolean isLastChallenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        return new LivenessChallengeViewModel(index, challenge, isLastChallenge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LivenessChallengeViewModel)) {
            return false;
        }
        LivenessChallengeViewModel livenessChallengeViewModel = (LivenessChallengeViewModel) other;
        return this.index == livenessChallengeViewModel.index && Intrinsics.f(this.challenge, livenessChallengeViewModel.challenge) && this.isLastChallenge == livenessChallengeViewModel.isLastChallenge;
    }

    @NotNull
    public final LivenessChallenge getChallenge() {
        return this.challenge;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLastChallenge) + ((this.challenge.hashCode() + (Integer.hashCode(this.index) * 31)) * 31);
    }

    public final boolean isLastChallenge() {
        return this.isLastChallenge;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("LivenessChallengeViewModel(index=");
        sb6.append(this.index);
        sb6.append(", challenge=");
        sb6.append(this.challenge);
        sb6.append(", isLastChallenge=");
        return a.x(sb6, this.isLastChallenge, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
