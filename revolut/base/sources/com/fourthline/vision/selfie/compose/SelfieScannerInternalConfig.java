package com.fourthline.vision.selfie.compose;

import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B9\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0014¨\u0006+"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig;", "", "", "", "strategies", "", "cameraX", "", "preferredVideoRecordingBitrate", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;", "randomnessLiveness", "<init>", "(Ljava/util/List;ZLjava/lang/Integer;Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;", "copy", "(Ljava/util/List;ZLjava/lang/Integer;Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;)Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getStrategies", "b", "Z", "getCameraX", "c", "Ljava/lang/Integer;", "getPreferredVideoRecordingBitrate", "d", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;", "getRandomnessLiveness", "RandomnessLiveness", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelfieScannerInternalConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List strategies;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean cameraX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Integer preferredVideoRecordingBitrate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final RandomnessLiveness randomnessLiveness;

    public SelfieScannerInternalConfig() {
        this(null, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelfieScannerInternalConfig copy$default(SelfieScannerInternalConfig selfieScannerInternalConfig, List list, boolean z, Integer num, RandomnessLiveness randomnessLiveness, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = selfieScannerInternalConfig.strategies;
        }
        if ((i & 2) != 0) {
            z = selfieScannerInternalConfig.cameraX;
        }
        if ((i & 4) != 0) {
            num = selfieScannerInternalConfig.preferredVideoRecordingBitrate;
        }
        if ((i & 8) != 0) {
            randomnessLiveness = selfieScannerInternalConfig.randomnessLiveness;
        }
        return selfieScannerInternalConfig.copy(list, z, num, randomnessLiveness);
    }

    @NotNull
    public final List<String> component1() {
        return this.strategies;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCameraX() {
        return this.cameraX;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPreferredVideoRecordingBitrate() {
        return this.preferredVideoRecordingBitrate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RandomnessLiveness getRandomnessLiveness() {
        return this.randomnessLiveness;
    }

    @NotNull
    public final SelfieScannerInternalConfig copy(@NotNull List<String> strategies, boolean cameraX, Integer preferredVideoRecordingBitrate, RandomnessLiveness randomnessLiveness) {
        Intrinsics.checkNotNullParameter(strategies, "strategies");
        return new SelfieScannerInternalConfig(strategies, cameraX, preferredVideoRecordingBitrate, randomnessLiveness);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieScannerInternalConfig)) {
            return false;
        }
        SelfieScannerInternalConfig selfieScannerInternalConfig = (SelfieScannerInternalConfig) other;
        return Intrinsics.f(this.strategies, selfieScannerInternalConfig.strategies) && this.cameraX == selfieScannerInternalConfig.cameraX && Intrinsics.f(this.preferredVideoRecordingBitrate, selfieScannerInternalConfig.preferredVideoRecordingBitrate) && Intrinsics.f(this.randomnessLiveness, selfieScannerInternalConfig.randomnessLiveness);
    }

    public final boolean getCameraX() {
        return this.cameraX;
    }

    public final Integer getPreferredVideoRecordingBitrate() {
        return this.preferredVideoRecordingBitrate;
    }

    public final RandomnessLiveness getRandomnessLiveness() {
        return this.randomnessLiveness;
    }

    @NotNull
    public final List<String> getStrategies() {
        return this.strategies;
    }

    public int hashCode() {
        int iHashCode = ((this.strategies.hashCode() * 31) + Boolean.hashCode(this.cameraX)) * 31;
        Integer num = this.preferredVideoRecordingBitrate;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        RandomnessLiveness randomnessLiveness = this.randomnessLiveness;
        return iHashCode2 + (randomnessLiveness != null ? randomnessLiveness.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SelfieScannerInternalConfig(strategies=" + this.strategies + ", cameraX=" + this.cameraX + ", preferredVideoRecordingBitrate=" + this.preferredVideoRecordingBitrate + ", randomnessLiveness=" + this.randomnessLiveness + ")";
    }

    public SelfieScannerInternalConfig(@NotNull List<String> strategies, boolean z, Integer num, RandomnessLiveness randomnessLiveness) {
        Intrinsics.checkNotNullParameter(strategies, "strategies");
        this.strategies = strategies;
        this.cameraX = z;
        this.preferredVideoRecordingBitrate = num;
        this.randomnessLiveness = randomnessLiveness;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B-\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000e¨\u0006!"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;", "", "", "", "sessionRandomnessLivenessSteps", "Lkotlin/Function1;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;", "", "callback", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "component1", "()Ljava/util/List;", "component2", "()Lkotlin/jvm/functions/Function1;", "copy", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getSessionRandomnessLivenessSteps", "b", "Lkotlin/jvm/functions/Function1;", "getCallback", "RandomnessLivenessEvent", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RandomnessLiveness {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List sessionRandomnessLivenessSteps;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Function1 callback;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;", "", "OnLivenessStepCountUpdate", "OnLivenessStepSuccess", "OnLivenessStepUpdate", "OnHeadMoved", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnHeadMoved;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepCountUpdate;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepSuccess;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepUpdate;", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface RandomnessLivenessEvent {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnHeadMoved;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;", "Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;", "metadata", "<init>", "(Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;)V", "component1", "()Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;", "copy", "(Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;)Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnHeadMoved;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/selfie/internal/domain/steps/HeadMetadata;", "getMetadata", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class OnHeadMoved implements RandomnessLivenessEvent {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final HeadMetadata metadata;

                public OnHeadMoved(@NotNull HeadMetadata metadata) {
                    Intrinsics.checkNotNullParameter(metadata, "metadata");
                    this.metadata = metadata;
                }

                public static /* synthetic */ OnHeadMoved copy$default(OnHeadMoved onHeadMoved, HeadMetadata headMetadata, int i, Object obj2) {
                    if ((i & 1) != 0) {
                        headMetadata = onHeadMoved.metadata;
                    }
                    return onHeadMoved.copy(headMetadata);
                }

                @NotNull
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final HeadMetadata getMetadata() {
                    return this.metadata;
                }

                @NotNull
                public final OnHeadMoved copy(@NotNull HeadMetadata metadata) {
                    Intrinsics.checkNotNullParameter(metadata, "metadata");
                    return new OnHeadMoved(metadata);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof OnHeadMoved) && Intrinsics.f(this.metadata, ((OnHeadMoved) other).metadata);
                }

                @NotNull
                public final HeadMetadata getMetadata() {
                    return this.metadata;
                }

                public int hashCode() {
                    return this.metadata.hashCode();
                }

                @NotNull
                public String toString() {
                    return "OnHeadMoved(metadata=" + this.metadata + ")";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepCountUpdate;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;", "", "count", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepCountUpdate;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCount", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class OnLivenessStepCountUpdate implements RandomnessLivenessEvent {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final int count;

                public OnLivenessStepCountUpdate(int i) {
                    this.count = i;
                }

                public static /* synthetic */ OnLivenessStepCountUpdate copy$default(OnLivenessStepCountUpdate onLivenessStepCountUpdate, int i, int i2, Object obj2) {
                    if ((i2 & 1) != 0) {
                        i = onLivenessStepCountUpdate.count;
                    }
                    return onLivenessStepCountUpdate.copy(i);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final int getCount() {
                    return this.count;
                }

                @NotNull
                public final OnLivenessStepCountUpdate copy(int count) {
                    return new OnLivenessStepCountUpdate(count);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof OnLivenessStepCountUpdate) && this.count == ((OnLivenessStepCountUpdate) other).count;
                }

                public final int getCount() {
                    return this.count;
                }

                public int hashCode() {
                    return Integer.hashCode(this.count);
                }

                @NotNull
                public String toString() {
                    return "OnLivenessStepCountUpdate(count=" + this.count + ")";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepSuccess;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;", "", "index", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepSuccess;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIndex", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class OnLivenessStepSuccess implements RandomnessLivenessEvent {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final int index;

                public OnLivenessStepSuccess(int i) {
                    this.index = i;
                }

                public static /* synthetic */ OnLivenessStepSuccess copy$default(OnLivenessStepSuccess onLivenessStepSuccess, int i, int i2, Object obj2) {
                    if ((i2 & 1) != 0) {
                        i = onLivenessStepSuccess.index;
                    }
                    return onLivenessStepSuccess.copy(i);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final int getIndex() {
                    return this.index;
                }

                @NotNull
                public final OnLivenessStepSuccess copy(int index) {
                    return new OnLivenessStepSuccess(index);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof OnLivenessStepSuccess) && this.index == ((OnLivenessStepSuccess) other).index;
                }

                public final int getIndex() {
                    return this.index;
                }

                public int hashCode() {
                    return Integer.hashCode(this.index);
                }

                @NotNull
                public String toString() {
                    return "OnLivenessStepSuccess(index=" + this.index + ")";
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepUpdate;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent;", "", "direction", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/vision/selfie/compose/SelfieScannerInternalConfig$RandomnessLiveness$RandomnessLivenessEvent$OnLivenessStepUpdate;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getDirection", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class OnLivenessStepUpdate implements RandomnessLivenessEvent {
                public static final int $stable = 0;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final int direction;

                public OnLivenessStepUpdate(int i) {
                    this.direction = i;
                }

                public static /* synthetic */ OnLivenessStepUpdate copy$default(OnLivenessStepUpdate onLivenessStepUpdate, int i, int i2, Object obj2) {
                    if ((i2 & 1) != 0) {
                        i = onLivenessStepUpdate.direction;
                    }
                    return onLivenessStepUpdate.copy(i);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final int getDirection() {
                    return this.direction;
                }

                @NotNull
                public final OnLivenessStepUpdate copy(int direction) {
                    return new OnLivenessStepUpdate(direction);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof OnLivenessStepUpdate) && this.direction == ((OnLivenessStepUpdate) other).direction;
                }

                public final int getDirection() {
                    return this.direction;
                }

                public int hashCode() {
                    return Integer.hashCode(this.direction);
                }

                @NotNull
                public String toString() {
                    return "OnLivenessStepUpdate(direction=" + this.direction + ")";
                }
            }
        }

        public RandomnessLiveness(List<Integer> list, @NotNull Function1<? super RandomnessLivenessEvent, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.sessionRandomnessLivenessSteps = list;
            this.callback = callback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RandomnessLiveness copy$default(RandomnessLiveness randomnessLiveness, List list, Function1 function1, int i, Object obj2) {
            if ((i & 1) != 0) {
                list = randomnessLiveness.sessionRandomnessLivenessSteps;
            }
            if ((i & 2) != 0) {
                function1 = randomnessLiveness.callback;
            }
            return randomnessLiveness.copy(list, function1);
        }

        public final List<Integer> component1() {
            return this.sessionRandomnessLivenessSteps;
        }

        @NotNull
        public final Function1<RandomnessLivenessEvent, Unit> component2() {
            return this.callback;
        }

        @NotNull
        public final RandomnessLiveness copy(List<Integer> sessionRandomnessLivenessSteps, @NotNull Function1<? super RandomnessLivenessEvent, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            return new RandomnessLiveness(sessionRandomnessLivenessSteps, callback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RandomnessLiveness)) {
                return false;
            }
            RandomnessLiveness randomnessLiveness = (RandomnessLiveness) other;
            return Intrinsics.f(this.sessionRandomnessLivenessSteps, randomnessLiveness.sessionRandomnessLivenessSteps) && Intrinsics.f(this.callback, randomnessLiveness.callback);
        }

        @NotNull
        public final Function1<RandomnessLivenessEvent, Unit> getCallback() {
            return this.callback;
        }

        public final List<Integer> getSessionRandomnessLivenessSteps() {
            return this.sessionRandomnessLivenessSteps;
        }

        public int hashCode() {
            List list = this.sessionRandomnessLivenessSteps;
            return ((list == null ? 0 : list.hashCode()) * 31) + this.callback.hashCode();
        }

        @NotNull
        public String toString() {
            return "RandomnessLiveness(sessionRandomnessLivenessSteps=" + this.sessionRandomnessLivenessSteps + ", callback=" + this.callback + ")";
        }

        public /* synthetic */ RandomnessLiveness(List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, function1);
        }
    }

    public SelfieScannerInternalConfig(List list, boolean z, Integer num, RandomnessLiveness randomnessLiveness, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? f0.f322471a : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : randomnessLiveness);
    }
}
