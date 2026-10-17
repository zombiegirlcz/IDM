package com.onfido.android.sdk.capture.ui.camera.capture;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConstants;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001f\b\u0080\b\u0018\u0000 +2\u00020\u0001:\u0001+B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010'\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0007HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006,"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "", "fileNamePrefix", "", "hasAudio", "", "maxDuration", "", "qualityProfile", "aspectRatio", "bitrate", "maxFps", "outOfStorageThreshold", "", "maxSize", "(Ljava/lang/String;ZIIIIIJJ)V", "getAspectRatio", "()I", "getBitrate", "getFileNamePrefix", "()Ljava/lang/String;", "getHasAudio", "()Z", "getMaxDuration", "getMaxFps", "getMaxSize", "()J", "getOutOfStorageThreshold", "getQualityProfile", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VideoCaptureConfig {
    private final int aspectRatio;
    private final int bitrate;

    @NotNull
    private final String fileNamePrefix;
    private final boolean hasAudio;
    private final int maxDuration;
    private final int maxFps;
    private final long maxSize;
    private final long outOfStorageThreshold;
    private final int qualityProfile;

    @NotNull
    public static final String DEFAULT_FILE_NAME_PREFIX = "onfido-video";

    public VideoCaptureConfig() {
        this(null, false, 0, 0, 0, 0, 0, 0L, 0L, 511, null);
    }

    public static /* synthetic */ VideoCaptureConfig copy$default(VideoCaptureConfig videoCaptureConfig, String str, boolean z, int i, int i2, int i3, int i5, int i6, long j2, long j3, int i21, Object obj2) {
        if ((i21 & 1) != 0) {
            str = videoCaptureConfig.fileNamePrefix;
        }
        if ((i21 & 2) != 0) {
            z = videoCaptureConfig.hasAudio;
        }
        if ((i21 & 4) != 0) {
            i = videoCaptureConfig.maxDuration;
        }
        if ((i21 & 8) != 0) {
            i2 = videoCaptureConfig.qualityProfile;
        }
        if ((i21 & 16) != 0) {
            i3 = videoCaptureConfig.aspectRatio;
        }
        if ((i21 & 32) != 0) {
            i5 = videoCaptureConfig.bitrate;
        }
        if ((i21 & 64) != 0) {
            i6 = videoCaptureConfig.maxFps;
        }
        if ((i21 & 128) != 0) {
            j2 = videoCaptureConfig.outOfStorageThreshold;
        }
        if ((i21 & 256) != 0) {
            j3 = videoCaptureConfig.maxSize;
        }
        long j5 = j3;
        long j16 = j2;
        int i22 = i5;
        int i32 = i6;
        int i33 = i3;
        int i43 = i;
        return videoCaptureConfig.copy(str, z, i43, i2, i33, i22, i32, j16, j5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileNamePrefix() {
        return this.fileNamePrefix;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasAudio() {
        return this.hasAudio;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxDuration() {
        return this.maxDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getQualityProfile() {
        return this.qualityProfile;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAspectRatio() {
        return this.aspectRatio;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBitrate() {
        return this.bitrate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMaxFps() {
        return this.maxFps;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getOutOfStorageThreshold() {
        return this.outOfStorageThreshold;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getMaxSize() {
        return this.maxSize;
    }

    @NotNull
    public final VideoCaptureConfig copy(@NotNull String fileNamePrefix, boolean hasAudio, int maxDuration, int qualityProfile, int aspectRatio, int bitrate, int maxFps, long outOfStorageThreshold, long maxSize) {
        Intrinsics.checkNotNullParameter(fileNamePrefix, "fileNamePrefix");
        return new VideoCaptureConfig(fileNamePrefix, hasAudio, maxDuration, qualityProfile, aspectRatio, bitrate, maxFps, outOfStorageThreshold, maxSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCaptureConfig)) {
            return false;
        }
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) other;
        return Intrinsics.f(this.fileNamePrefix, videoCaptureConfig.fileNamePrefix) && this.hasAudio == videoCaptureConfig.hasAudio && this.maxDuration == videoCaptureConfig.maxDuration && this.qualityProfile == videoCaptureConfig.qualityProfile && this.aspectRatio == videoCaptureConfig.aspectRatio && this.bitrate == videoCaptureConfig.bitrate && this.maxFps == videoCaptureConfig.maxFps && this.outOfStorageThreshold == videoCaptureConfig.outOfStorageThreshold && this.maxSize == videoCaptureConfig.maxSize;
    }

    public final int getAspectRatio() {
        return this.aspectRatio;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    @NotNull
    public final String getFileNamePrefix() {
        return this.fileNamePrefix;
    }

    public final boolean getHasAudio() {
        return this.hasAudio;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getMaxFps() {
        return this.maxFps;
    }

    public final long getMaxSize() {
        return this.maxSize;
    }

    public final long getOutOfStorageThreshold() {
        return this.outOfStorageThreshold;
    }

    public final int getQualityProfile() {
        return this.qualityProfile;
    }

    public int hashCode() {
        return Long.hashCode(this.maxSize) + d.c(a.b(this.maxFps, a.b(this.bitrate, a.b(this.aspectRatio, a.b(this.qualityProfile, a.b(this.maxDuration, a.c(this.fileNamePrefix.hashCode() * 31, 31, this.hasAudio), 31), 31), 31), 31), 31), 31, this.outOfStorageThreshold);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("VideoCaptureConfig(fileNamePrefix=");
        sb6.append(this.fileNamePrefix);
        sb6.append(", hasAudio=");
        sb6.append(this.hasAudio);
        sb6.append(", maxDuration=");
        sb6.append(this.maxDuration);
        sb6.append(", qualityProfile=");
        sb6.append(this.qualityProfile);
        sb6.append(", aspectRatio=");
        sb6.append(this.aspectRatio);
        sb6.append(", bitrate=");
        sb6.append(this.bitrate);
        sb6.append(", maxFps=");
        sb6.append(this.maxFps);
        sb6.append(", outOfStorageThreshold=");
        sb6.append(this.outOfStorageThreshold);
        sb6.append(", maxSize=");
        return d.t(sb6, this.maxSize, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public VideoCaptureConfig(@NotNull String fileNamePrefix, boolean z, int i, int i2, int i3, int i5, int i6, long j2, long j3) {
        Intrinsics.checkNotNullParameter(fileNamePrefix, "fileNamePrefix");
        this.fileNamePrefix = fileNamePrefix;
        this.hasAudio = z;
        this.maxDuration = i;
        this.qualityProfile = i2;
        this.aspectRatio = i3;
        this.bitrate = i5;
        this.maxFps = i6;
        this.outOfStorageThreshold = j2;
        this.maxSize = j3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VideoCaptureConfig(String str, boolean z, int i, int i2, int i3, int i5, int i6, long j2, long j3, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i21 & 1) != 0 ? "onfido-video" : str;
        z = (i21 & 2) != 0 ? true : z;
        i = (i21 & 4) != 0 ? LivenessConstants.LIVE_VIDEO_MAX_DURATION_MS : i;
        i2 = (i21 & 8) != 0 ? 6 : i2;
        i3 = (i21 & 16) != 0 ? -1 : i3;
        i5 = (i21 & 32) != 0 ? LivenessConstants.LIVE_VIDEO_ENCODING_BIT_RATE : i5;
        this(str, z, i, i2, i3, i5, (i21 & 64) != 0 ? -1 : i6, (i21 & 128) != 0 ? 500000L : j2, (i21 & 256) != 0 ? (((long) (i / 1000)) * ((long) i5)) / ((long) 8) : j3);
    }
}
