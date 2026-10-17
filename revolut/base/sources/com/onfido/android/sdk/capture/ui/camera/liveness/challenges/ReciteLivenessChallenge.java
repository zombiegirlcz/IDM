package com.onfido.android.sdk.capture.ui.camera.liveness.challenges;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/ReciteLivenessChallenge;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;", "query", "", "([I)V", "getQuery", "()[I", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ReciteLivenessChallenge extends LivenessChallenge {

    @NotNull
    private final int[] query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReciteLivenessChallenge(@NotNull int[] query) {
        super(LivenessChallengeType.RECITE, null);
        Intrinsics.checkNotNullParameter(query, "query");
        this.query = query;
    }

    public static /* synthetic */ ReciteLivenessChallenge copy$default(ReciteLivenessChallenge reciteLivenessChallenge, int[] iArr, int i, Object obj2) {
        if ((i & 1) != 0) {
            iArr = reciteLivenessChallenge.query;
        }
        return reciteLivenessChallenge.copy(iArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int[] getQuery() {
        return this.query;
    }

    @NotNull
    public final ReciteLivenessChallenge copy(@NotNull int[] query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new ReciteLivenessChallenge(query);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReciteLivenessChallenge) && Arrays.equals(this.query, ((ReciteLivenessChallenge) other).query);
    }

    @NotNull
    public final int[] getQuery() {
        return this.query;
    }

    public int hashCode() {
        return Arrays.hashCode(this.query);
    }

    @NotNull
    public String toString() {
        return "ReciteLivenessChallenge(query=" + Arrays.toString(this.query) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
