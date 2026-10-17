package com.fourthline.vision.selfie;

import com.fourthline.core.VideoRecording;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.ScannerMetadata;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JJ\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0013R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0015¨\u0006-"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerResult;", "", "Lcom/fourthline/vision/ScannerImage;", "image", "Lcom/fourthline/vision/ScannerMetadata;", "Lcom/fourthline/vision/selfie/SelfieScannerMetadata;", "metadata", "Lcom/fourthline/core/VideoRecording;", "videoRecording", "", "", "extraData", "<init>", "(Lcom/fourthline/vision/ScannerImage;Lcom/fourthline/vision/ScannerMetadata;Lcom/fourthline/core/VideoRecording;Ljava/util/Map;)V", "component1", "()Lcom/fourthline/vision/ScannerImage;", "component2", "()Lcom/fourthline/vision/ScannerMetadata;", "component3", "()Lcom/fourthline/core/VideoRecording;", "component4", "()Ljava/util/Map;", "copy", "(Lcom/fourthline/vision/ScannerImage;Lcom/fourthline/vision/ScannerMetadata;Lcom/fourthline/core/VideoRecording;Ljava/util/Map;)Lcom/fourthline/vision/selfie/SelfieScannerResult;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/ScannerImage;", "getImage", "b", "Lcom/fourthline/vision/ScannerMetadata;", "getMetadata", "c", "Lcom/fourthline/core/VideoRecording;", "getVideoRecording", "d", "Ljava/util/Map;", "getExtraData", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelfieScannerResult {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ScannerImage image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ScannerMetadata metadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final VideoRecording videoRecording;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map extraData;

    public SelfieScannerResult(@NotNull ScannerImage image, @NotNull ScannerMetadata metadata, VideoRecording videoRecording, @NotNull Map<String, ? extends Object> extraData) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.image = image;
        this.metadata = metadata;
        this.videoRecording = videoRecording;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelfieScannerResult copy$default(SelfieScannerResult selfieScannerResult, ScannerImage scannerImage, ScannerMetadata scannerMetadata, VideoRecording videoRecording, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            scannerImage = selfieScannerResult.image;
        }
        if ((i & 2) != 0) {
            scannerMetadata = selfieScannerResult.metadata;
        }
        if ((i & 4) != 0) {
            videoRecording = selfieScannerResult.videoRecording;
        }
        if ((i & 8) != 0) {
            map = selfieScannerResult.extraData;
        }
        return selfieScannerResult.copy(scannerImage, scannerMetadata, videoRecording, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScannerImage getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ScannerMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    @NotNull
    public final Map<String, Object> component4() {
        return this.extraData;
    }

    @NotNull
    public final SelfieScannerResult copy(@NotNull ScannerImage image, @NotNull ScannerMetadata metadata, VideoRecording videoRecording, @NotNull Map<String, ? extends Object> extraData) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return new SelfieScannerResult(image, metadata, videoRecording, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieScannerResult)) {
            return false;
        }
        SelfieScannerResult selfieScannerResult = (SelfieScannerResult) other;
        return Intrinsics.f(this.image, selfieScannerResult.image) && Intrinsics.f(this.metadata, selfieScannerResult.metadata) && Intrinsics.f(this.videoRecording, selfieScannerResult.videoRecording) && Intrinsics.f(this.extraData, selfieScannerResult.extraData);
    }

    @NotNull
    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @NotNull
    public final ScannerImage getImage() {
        return this.image;
    }

    @NotNull
    public final ScannerMetadata getMetadata() {
        return this.metadata;
    }

    public final VideoRecording getVideoRecording() {
        return this.videoRecording;
    }

    public int hashCode() {
        int iHashCode = ((this.image.hashCode() * 31) + this.metadata.hashCode()) * 31;
        VideoRecording videoRecording = this.videoRecording;
        return ((iHashCode + (videoRecording == null ? 0 : videoRecording.hashCode())) * 31) + this.extraData.hashCode();
    }

    @NotNull
    public String toString() {
        return "SelfieScannerResult(image=" + this.image + ", metadata=" + this.metadata + ", videoRecording=" + this.videoRecording + ", extraData=" + this.extraData + ")";
    }

    public /* synthetic */ SelfieScannerResult(ScannerImage scannerImage, ScannerMetadata scannerMetadata, VideoRecording videoRecording, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(scannerImage, scannerMetadata, (i & 4) != 0 ? null : videoRecording, (i & 8) != 0 ? r0.g() : map);
    }
}
