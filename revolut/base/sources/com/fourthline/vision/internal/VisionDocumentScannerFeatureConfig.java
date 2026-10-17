package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.FeatureConfig;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig;", "Lcom/fourthline/core/FeatureConfig;", "isAutoDetectAvailable", "", "isAutoDetectFallbackEnabled", "autoDetectMode", "Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig$AutoDetectMode;", "dynamicStepsEvaluator", "Lcom/fourthline/vision/document/internal/domain/step/VisionDynamicStepsEvaluator;", "Lcom/fourthline/vision/document/DocumentScannerStep;", "<init>", "(ZZLcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig$AutoDetectMode;Lcom/fourthline/vision/document/internal/domain/step/VisionDynamicStepsEvaluator;)V", "()Z", "getAutoDetectMode", "()Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig$AutoDetectMode;", "getDynamicStepsEvaluator", "()Lcom/fourthline/vision/document/internal/domain/step/VisionDynamicStepsEvaluator;", "getSupportedAutoDetectMode", "documentType", "Lcom/fourthline/core/DocumentType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "AutoDetectMode", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VisionDocumentScannerFeatureConfig implements FeatureConfig {
    public static final int $stable = 8;

    @NotNull
    private final AutoDetectMode autoDetectMode;
    private final VisionDynamicStepsEvaluator<DocumentScannerStep> dynamicStepsEvaluator;
    private final boolean isAutoDetectAvailable;
    private final boolean isAutoDetectFallbackEnabled;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig$AutoDetectMode;", "", "<init>", "(Ljava/lang/String;I)V", "DirectCapture", "UserAssist", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AutoDetectMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AutoDetectMode[] $VALUES;
        public static final AutoDetectMode DirectCapture = new AutoDetectMode("DirectCapture", 0);
        public static final AutoDetectMode UserAssist = new AutoDetectMode("UserAssist", 1);

        private static final /* synthetic */ AutoDetectMode[] $values() {
            return new AutoDetectMode[]{DirectCapture, UserAssist};
        }

        static {
            AutoDetectMode[] autoDetectModeArr$values = $values();
            $VALUES = autoDetectModeArr$values;
            $ENTRIES = vc.s.n(autoDetectModeArr$values);
        }

        private AutoDetectMode(String str, int i) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static AutoDetectMode valueOf(String str) {
            return (AutoDetectMode) Enum.valueOf(AutoDetectMode.class, str);
        }

        public static AutoDetectMode[] values() {
            return (AutoDetectMode[]) $VALUES.clone();
        }
    }

    public VisionDocumentScannerFeatureConfig() {
        this(false, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisionDocumentScannerFeatureConfig copy$default(VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig, boolean z, boolean z3, AutoDetectMode autoDetectMode, VisionDynamicStepsEvaluator visionDynamicStepsEvaluator, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = visionDocumentScannerFeatureConfig.isAutoDetectAvailable;
        }
        if ((i & 2) != 0) {
            z3 = visionDocumentScannerFeatureConfig.isAutoDetectFallbackEnabled;
        }
        if ((i & 4) != 0) {
            autoDetectMode = visionDocumentScannerFeatureConfig.autoDetectMode;
        }
        if ((i & 8) != 0) {
            visionDynamicStepsEvaluator = visionDocumentScannerFeatureConfig.dynamicStepsEvaluator;
        }
        return visionDocumentScannerFeatureConfig.copy(z, z3, autoDetectMode, visionDynamicStepsEvaluator);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsAutoDetectAvailable() {
        return this.isAutoDetectAvailable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsAutoDetectFallbackEnabled() {
        return this.isAutoDetectFallbackEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AutoDetectMode getAutoDetectMode() {
        return this.autoDetectMode;
    }

    public final VisionDynamicStepsEvaluator<DocumentScannerStep> component4() {
        return this.dynamicStepsEvaluator;
    }

    @NotNull
    public final VisionDocumentScannerFeatureConfig copy(boolean isAutoDetectAvailable, boolean isAutoDetectFallbackEnabled, @NotNull AutoDetectMode autoDetectMode, VisionDynamicStepsEvaluator<DocumentScannerStep> dynamicStepsEvaluator) {
        Intrinsics.checkNotNullParameter(autoDetectMode, "autoDetectMode");
        return new VisionDocumentScannerFeatureConfig(isAutoDetectAvailable, isAutoDetectFallbackEnabled, autoDetectMode, dynamicStepsEvaluator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisionDocumentScannerFeatureConfig)) {
            return false;
        }
        VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig = (VisionDocumentScannerFeatureConfig) other;
        return this.isAutoDetectAvailable == visionDocumentScannerFeatureConfig.isAutoDetectAvailable && this.isAutoDetectFallbackEnabled == visionDocumentScannerFeatureConfig.isAutoDetectFallbackEnabled && this.autoDetectMode == visionDocumentScannerFeatureConfig.autoDetectMode && Intrinsics.f(this.dynamicStepsEvaluator, visionDocumentScannerFeatureConfig.dynamicStepsEvaluator);
    }

    @NotNull
    public final AutoDetectMode getAutoDetectMode() {
        return this.autoDetectMode;
    }

    public final VisionDynamicStepsEvaluator<DocumentScannerStep> getDynamicStepsEvaluator() {
        return this.dynamicStepsEvaluator;
    }

    @NotNull
    public final AutoDetectMode getSupportedAutoDetectMode(@NotNull DocumentType documentType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        return this.autoDetectMode;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isAutoDetectAvailable) * 31) + Boolean.hashCode(this.isAutoDetectFallbackEnabled)) * 31) + this.autoDetectMode.hashCode()) * 31;
        VisionDynamicStepsEvaluator<DocumentScannerStep> visionDynamicStepsEvaluator = this.dynamicStepsEvaluator;
        return iHashCode + (visionDynamicStepsEvaluator == null ? 0 : visionDynamicStepsEvaluator.hashCode());
    }

    public final boolean isAutoDetectAvailable() {
        return this.isAutoDetectAvailable;
    }

    public final boolean isAutoDetectFallbackEnabled() {
        return this.isAutoDetectFallbackEnabled;
    }

    @NotNull
    public String toString() {
        return "VisionDocumentScannerFeatureConfig(isAutoDetectAvailable=" + this.isAutoDetectAvailable + ", isAutoDetectFallbackEnabled=" + this.isAutoDetectFallbackEnabled + ", autoDetectMode=" + this.autoDetectMode + ", dynamicStepsEvaluator=" + this.dynamicStepsEvaluator + ")";
    }

    public VisionDocumentScannerFeatureConfig(boolean z, boolean z3, @NotNull AutoDetectMode autoDetectMode, VisionDynamicStepsEvaluator<DocumentScannerStep> visionDynamicStepsEvaluator) {
        Intrinsics.checkNotNullParameter(autoDetectMode, "autoDetectMode");
        this.isAutoDetectAvailable = z;
        this.isAutoDetectFallbackEnabled = z3;
        this.autoDetectMode = autoDetectMode;
        this.dynamicStepsEvaluator = visionDynamicStepsEvaluator;
    }

    public /* synthetic */ VisionDocumentScannerFeatureConfig(boolean z, boolean z3, AutoDetectMode autoDetectMode, VisionDynamicStepsEvaluator visionDynamicStepsEvaluator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z3, (i & 4) != 0 ? AutoDetectMode.UserAssist : autoDetectMode, (i & 8) != 0 ? null : visionDynamicStepsEvaluator);
    }
}
