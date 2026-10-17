package com.fourthline.vision.document.compose;

import com.fourthline.vision.internal.VisionDocumentScannerFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lcom/fourthline/vision/document/compose/DocumentScannerInternalConfig;", "", "", "cameraX", "", "preferredVideoRecordingBitrate", "Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig;", "featureConfig", "<init>", "(ZLjava/lang/Integer;Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig;)V", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig;", "copy", "(ZLjava/lang/Integer;Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig;)Lcom/fourthline/vision/document/compose/DocumentScannerInternalConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getCameraX", "b", "Ljava/lang/Integer;", "getPreferredVideoRecordingBitrate", "c", "Lcom/fourthline/vision/internal/VisionDocumentScannerFeatureConfig;", "getFeatureConfig", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DocumentScannerInternalConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean cameraX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Integer preferredVideoRecordingBitrate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final VisionDocumentScannerFeatureConfig featureConfig;

    public DocumentScannerInternalConfig() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ DocumentScannerInternalConfig copy$default(DocumentScannerInternalConfig documentScannerInternalConfig, boolean z, Integer num, VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = documentScannerInternalConfig.cameraX;
        }
        if ((i & 2) != 0) {
            num = documentScannerInternalConfig.preferredVideoRecordingBitrate;
        }
        if ((i & 4) != 0) {
            visionDocumentScannerFeatureConfig = documentScannerInternalConfig.featureConfig;
        }
        return documentScannerInternalConfig.copy(z, num, visionDocumentScannerFeatureConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCameraX() {
        return this.cameraX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPreferredVideoRecordingBitrate() {
        return this.preferredVideoRecordingBitrate;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VisionDocumentScannerFeatureConfig getFeatureConfig() {
        return this.featureConfig;
    }

    @NotNull
    public final DocumentScannerInternalConfig copy(boolean cameraX, Integer preferredVideoRecordingBitrate, @NotNull VisionDocumentScannerFeatureConfig featureConfig) {
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        return new DocumentScannerInternalConfig(cameraX, preferredVideoRecordingBitrate, featureConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentScannerInternalConfig)) {
            return false;
        }
        DocumentScannerInternalConfig documentScannerInternalConfig = (DocumentScannerInternalConfig) other;
        return this.cameraX == documentScannerInternalConfig.cameraX && Intrinsics.f(this.preferredVideoRecordingBitrate, documentScannerInternalConfig.preferredVideoRecordingBitrate) && Intrinsics.f(this.featureConfig, documentScannerInternalConfig.featureConfig);
    }

    public final boolean getCameraX() {
        return this.cameraX;
    }

    @NotNull
    public final VisionDocumentScannerFeatureConfig getFeatureConfig() {
        return this.featureConfig;
    }

    public final Integer getPreferredVideoRecordingBitrate() {
        return this.preferredVideoRecordingBitrate;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.cameraX) * 31;
        Integer num = this.preferredVideoRecordingBitrate;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.featureConfig.hashCode();
    }

    @NotNull
    public String toString() {
        return "DocumentScannerInternalConfig(cameraX=" + this.cameraX + ", preferredVideoRecordingBitrate=" + this.preferredVideoRecordingBitrate + ", featureConfig=" + this.featureConfig + ")";
    }

    public DocumentScannerInternalConfig(boolean z, Integer num, @NotNull VisionDocumentScannerFeatureConfig featureConfig) {
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        this.cameraX = z;
        this.preferredVideoRecordingBitrate = num;
        this.featureConfig = featureConfig;
    }

    public /* synthetic */ DocumentScannerInternalConfig(boolean z, Integer num, VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? new VisionDocumentScannerFeatureConfig(false, false, VisionDocumentScannerFeatureConfig.AutoDetectMode.DirectCapture, null, 11, null) : visionDocumentScannerFeatureConfig);
    }
}
