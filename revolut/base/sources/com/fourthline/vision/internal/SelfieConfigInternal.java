package com.fourthline.vision.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/internal/SelfieConfigInternal;", "", "useCameraX", "", "preferredVideoRecordingBitrate", "", "<init>", "(ZLjava/lang/Integer;)V", "getUseCameraX", "()Z", "getPreferredVideoRecordingBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ZLjava/lang/Integer;)Lcom/fourthline/vision/internal/SelfieConfigInternal;", "equals", "other", "hashCode", "toString", "", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelfieConfigInternal {
    public static final int $stable = 0;
    private final Integer preferredVideoRecordingBitrate;
    private final boolean useCameraX;

    public SelfieConfigInternal(boolean z, Integer num) {
        this.useCameraX = z;
        this.preferredVideoRecordingBitrate = num;
    }

    public static /* synthetic */ SelfieConfigInternal copy$default(SelfieConfigInternal selfieConfigInternal, boolean z, Integer num, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = selfieConfigInternal.useCameraX;
        }
        if ((i & 2) != 0) {
            num = selfieConfigInternal.preferredVideoRecordingBitrate;
        }
        return selfieConfigInternal.copy(z, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getUseCameraX() {
        return this.useCameraX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPreferredVideoRecordingBitrate() {
        return this.preferredVideoRecordingBitrate;
    }

    @NotNull
    public final SelfieConfigInternal copy(boolean useCameraX, Integer preferredVideoRecordingBitrate) {
        return new SelfieConfigInternal(useCameraX, preferredVideoRecordingBitrate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieConfigInternal)) {
            return false;
        }
        SelfieConfigInternal selfieConfigInternal = (SelfieConfigInternal) other;
        return this.useCameraX == selfieConfigInternal.useCameraX && Intrinsics.f(this.preferredVideoRecordingBitrate, selfieConfigInternal.preferredVideoRecordingBitrate);
    }

    public final Integer getPreferredVideoRecordingBitrate() {
        return this.preferredVideoRecordingBitrate;
    }

    public final boolean getUseCameraX() {
        return this.useCameraX;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.useCameraX) * 31;
        Integer num = this.preferredVideoRecordingBitrate;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "SelfieConfigInternal(useCameraX=" + this.useCameraX + ", preferredVideoRecordingBitrate=" + this.preferredVideoRecordingBitrate + ")";
    }
}
