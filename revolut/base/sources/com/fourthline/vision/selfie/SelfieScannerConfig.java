package com.fourthline.vision.selfie;

import com.fourthline.core.VideoDuration;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.selfie.compose.SelfieScannerInternalConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJR\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010\u0011R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001aR\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerConfig;", "", "", "debugModeEnabled", "Lcom/fourthline/vision/RecordingType;", "recordingType", "Lcom/fourthline/core/VideoDuration;", "videoDuration", "Lcom/fourthline/vision/selfie/LivenessCheckType;", "livenessCheckType", "includeMotionData", "", "Lcom/fourthline/vision/selfie/SelfieScannerStep;", "steps", "<init>", "(ZLcom/fourthline/vision/RecordingType;Lcom/fourthline/core/VideoDuration;Lcom/fourthline/vision/selfie/LivenessCheckType;ZLjava/util/List;)V", "component1", "()Z", "component2", "()Lcom/fourthline/vision/RecordingType;", "component3", "()Lcom/fourthline/core/VideoDuration;", "component4", "()Lcom/fourthline/vision/selfie/LivenessCheckType;", "component5", "component6", "()Ljava/util/List;", "copy", "(ZLcom/fourthline/vision/RecordingType;Lcom/fourthline/core/VideoDuration;Lcom/fourthline/vision/selfie/LivenessCheckType;ZLjava/util/List;)Lcom/fourthline/vision/selfie/SelfieScannerConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getDebugModeEnabled", "b", "Lcom/fourthline/vision/RecordingType;", "getRecordingType", "c", "Lcom/fourthline/core/VideoDuration;", "getVideoDuration", "d", "Lcom/fourthline/vision/selfie/LivenessCheckType;", "getLivenessCheckType", "e", "getIncludeMotionData", "f", "Ljava/util/List;", "getSteps", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig;", "g", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig;", "getInternalConfig", "()Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig;", "setInternalConfig", "(Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig;)V", "internalConfig", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelfieScannerConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean debugModeEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RecordingType recordingType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final VideoDuration videoDuration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LivenessCheckType livenessCheckType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean includeMotionData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List steps;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private SelfieScannerInternalConfig internalConfig;

    public SelfieScannerConfig() {
        this(false, null, null, null, false, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelfieScannerConfig copy$default(SelfieScannerConfig selfieScannerConfig, boolean z, RecordingType recordingType, VideoDuration videoDuration, LivenessCheckType livenessCheckType, boolean z3, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = selfieScannerConfig.debugModeEnabled;
        }
        if ((i & 2) != 0) {
            recordingType = selfieScannerConfig.recordingType;
        }
        if ((i & 4) != 0) {
            videoDuration = selfieScannerConfig.videoDuration;
        }
        if ((i & 8) != 0) {
            livenessCheckType = selfieScannerConfig.livenessCheckType;
        }
        if ((i & 16) != 0) {
            z3 = selfieScannerConfig.includeMotionData;
        }
        if ((i & 32) != 0) {
            list = selfieScannerConfig.steps;
        }
        boolean z4 = z3;
        List list2 = list;
        return selfieScannerConfig.copy(z, recordingType, videoDuration, livenessCheckType, z4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDebugModeEnabled() {
        return this.debugModeEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecordingType getRecordingType() {
        return this.recordingType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VideoDuration getVideoDuration() {
        return this.videoDuration;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LivenessCheckType getLivenessCheckType() {
        return this.livenessCheckType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIncludeMotionData() {
        return this.includeMotionData;
    }

    @NotNull
    public final List<SelfieScannerStep> component6() {
        return this.steps;
    }

    @NotNull
    public final SelfieScannerConfig copy(boolean debugModeEnabled, @NotNull RecordingType recordingType, @NotNull VideoDuration videoDuration, @NotNull LivenessCheckType livenessCheckType, boolean includeMotionData, @NotNull List<? extends SelfieScannerStep> steps) {
        Intrinsics.checkNotNullParameter(recordingType, "recordingType");
        Intrinsics.checkNotNullParameter(videoDuration, "videoDuration");
        Intrinsics.checkNotNullParameter(livenessCheckType, "livenessCheckType");
        Intrinsics.checkNotNullParameter(steps, "steps");
        return new SelfieScannerConfig(debugModeEnabled, recordingType, videoDuration, livenessCheckType, includeMotionData, steps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieScannerConfig)) {
            return false;
        }
        SelfieScannerConfig selfieScannerConfig = (SelfieScannerConfig) other;
        return this.debugModeEnabled == selfieScannerConfig.debugModeEnabled && this.recordingType == selfieScannerConfig.recordingType && Intrinsics.f(this.videoDuration, selfieScannerConfig.videoDuration) && this.livenessCheckType == selfieScannerConfig.livenessCheckType && this.includeMotionData == selfieScannerConfig.includeMotionData && Intrinsics.f(this.steps, selfieScannerConfig.steps);
    }

    public final boolean getDebugModeEnabled() {
        return this.debugModeEnabled;
    }

    public final boolean getIncludeMotionData() {
        return this.includeMotionData;
    }

    @NotNull
    public final SelfieScannerInternalConfig getInternalConfig() {
        return this.internalConfig;
    }

    @NotNull
    public final LivenessCheckType getLivenessCheckType() {
        return this.livenessCheckType;
    }

    @NotNull
    public final RecordingType getRecordingType() {
        return this.recordingType;
    }

    @NotNull
    public final List<SelfieScannerStep> getSteps() {
        return this.steps;
    }

    @NotNull
    public final VideoDuration getVideoDuration() {
        return this.videoDuration;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.debugModeEnabled) * 31) + this.recordingType.hashCode()) * 31) + this.videoDuration.hashCode()) * 31) + this.livenessCheckType.hashCode()) * 31) + Boolean.hashCode(this.includeMotionData)) * 31) + this.steps.hashCode();
    }

    public final void setInternalConfig(@NotNull SelfieScannerInternalConfig selfieScannerInternalConfig) {
        Intrinsics.checkNotNullParameter(selfieScannerInternalConfig, "<set-?>");
        this.internalConfig = selfieScannerInternalConfig;
    }

    @NotNull
    public String toString() {
        return "SelfieScannerConfig(debugModeEnabled=" + this.debugModeEnabled + ", recordingType=" + this.recordingType + ", videoDuration=" + this.videoDuration + ", livenessCheckType=" + this.livenessCheckType + ", includeMotionData=" + this.includeMotionData + ", steps=" + this.steps + ")";
    }

    public SelfieScannerConfig(boolean z, @NotNull RecordingType recordingType, @NotNull VideoDuration videoDuration, @NotNull LivenessCheckType livenessCheckType, boolean z3, @NotNull List<? extends SelfieScannerStep> steps) {
        Intrinsics.checkNotNullParameter(recordingType, "recordingType");
        Intrinsics.checkNotNullParameter(videoDuration, "videoDuration");
        Intrinsics.checkNotNullParameter(livenessCheckType, "livenessCheckType");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.debugModeEnabled = z;
        this.recordingType = recordingType;
        this.videoDuration = videoDuration;
        this.livenessCheckType = livenessCheckType;
        this.includeMotionData = z3;
        this.steps = steps;
        this.internalConfig = new SelfieScannerInternalConfig(null, false, null, null, 15, null);
    }

    public SelfieScannerConfig(boolean z, RecordingType recordingType, VideoDuration videoDuration, LivenessCheckType livenessCheckType, boolean z3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? RecordingType.VIDEO_ONLY : recordingType, (i & 4) != 0 ? VideoDuration.DEFAULT.INSTANCE : videoDuration, (i & 8) != 0 ? LivenessCheckType.HEAD_TURN : livenessCheckType, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? f0.f322471a : list);
    }
}
