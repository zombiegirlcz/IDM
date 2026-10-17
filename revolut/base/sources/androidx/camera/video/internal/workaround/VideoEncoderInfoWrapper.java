package androidx.camera.video.internal.workaround;

import a0.d;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0014¨\u0006("}, d2 = {"Landroidx/camera/video/internal/workaround/VideoEncoderInfoWrapper;", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo;", "videoEncoderInfo", "<init>", "(Landroidx/camera/video/internal/encoder/VideoEncoderInfo;)V", "Landroid/util/Size;", "size", "", "addExtraSupportedSize", "(Landroid/util/Size;)V", "", "canSwapWidthHeight", "()Z", "", "width", "height", "isSizeSupported", "(II)Z", "Landroid/util/Range;", "getSupportedWidths", "()Landroid/util/Range;", "getSupportedHeights", "getSupportedWidthsFor", "(I)Landroid/util/Range;", "getSupportedHeightsFor", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo;", "_supportedWidths", "Landroid/util/Range;", "_supportedHeights", "", "extraSupportedSizes", "Ljava/util/Set;", "getWidthAlignment", "()I", "widthAlignment", "getHeightAlignment", "heightAlignment", "getSupportedBitrateRange", "supportedBitrateRange", "Companion", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoEncoderInfoWrapper implements VideoEncoderInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Range<Integer> _supportedHeights;

    @NotNull
    private final Range<Integer> _supportedWidths;

    @NotNull
    private final Set<Size> extraSupportedSizes;

    @NotNull
    private final VideoEncoderInfo videoEncoderInfo;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/camera/video/internal/workaround/VideoEncoderInfoWrapper$Companion;", "", "<init>", "()V", "TAG", "", "WIDTH_4KDCI", "", "HEIGHT_4KDCI", "from", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo;", "videoEncoderInfo", "validSizeToCheck", "Landroid/util/Size;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VideoEncoderInfo from(@NotNull VideoEncoderInfo videoEncoderInfo, Size validSizeToCheck) {
            Intrinsics.checkNotNullParameter(videoEncoderInfo, "videoEncoderInfo");
            if (!(videoEncoderInfo instanceof VideoEncoderInfoWrapper)) {
                if (DeviceQuirks.get(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                    videoEncoderInfo = new VideoEncoderInfoWrapper(videoEncoderInfo, null);
                } else if (validSizeToCheck != null && !videoEncoderInfo.isSizeSupportedAllowSwapping(validSizeToCheck.getWidth(), validSizeToCheck.getHeight())) {
                    Logger.w("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + validSizeToCheck + " that should be valid in widths/heights = " + videoEncoderInfo.getSupportedWidths() + '/' + videoEncoderInfo.getSupportedHeights());
                    videoEncoderInfo = new VideoEncoderInfoWrapper(videoEncoderInfo, null);
                }
            }
            if (validSizeToCheck != null && (videoEncoderInfo instanceof VideoEncoderInfoWrapper)) {
                ((VideoEncoderInfoWrapper) videoEncoderInfo).addExtraSupportedSize(validSizeToCheck);
            }
            return videoEncoderInfo;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VideoEncoderInfoWrapper(VideoEncoderInfo videoEncoderInfo, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoEncoderInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraSupportedSize(Size size) {
        this.extraSupportedSizes.add(size);
    }

    @NotNull
    public static final VideoEncoderInfo from(@NotNull VideoEncoderInfo videoEncoderInfo, Size size) {
        return INSTANCE.from(videoEncoderInfo, size);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean canSwapWidthHeight() {
        return this.videoEncoderInfo.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getHeightAlignment() {
        return this.videoEncoderInfo.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NotNull
    public Range<Integer> getSupportedBitrateRange() {
        return this.videoEncoderInfo.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NotNull
    public Range<Integer> getSupportedHeights() {
        return this._supportedHeights;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NotNull
    public Range<Integer> getSupportedHeightsFor(int width) {
        if (this._supportedWidths.contains(Integer.valueOf(width)) && width % this.videoEncoderInfo.getWidthAlignment() == 0) {
            return this._supportedHeights;
        }
        StringBuilder sbW = d.w(width, "Not supported width: ", " which is not in ");
        sbW.append(this._supportedWidths);
        sbW.append(" or can not be divided by alignment ");
        sbW.append(this.videoEncoderInfo.getWidthAlignment());
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NotNull
    public Range<Integer> getSupportedWidths() {
        return this._supportedWidths;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    @NotNull
    public Range<Integer> getSupportedWidthsFor(int height) {
        if (this._supportedHeights.contains(Integer.valueOf(height)) && height % this.videoEncoderInfo.getHeightAlignment() == 0) {
            return this._supportedWidths;
        }
        StringBuilder sbW = d.w(height, "Not supported height: ", " which is not in ");
        sbW.append(this._supportedHeights);
        sbW.append(" or can not be divided by alignment ");
        sbW.append(this.videoEncoderInfo.getHeightAlignment());
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getWidthAlignment() {
        return this.videoEncoderInfo.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupported(int width, int height) {
        if (this.videoEncoderInfo.isSizeSupported(width, height)) {
            return true;
        }
        Set<Size> set = this.extraSupportedSizes;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (Size size : set) {
                if (size.getWidth() == width && size.getHeight() == height) {
                    return true;
                }
            }
        }
        return this._supportedWidths.contains(Integer.valueOf(width)) && this._supportedHeights.contains(Integer.valueOf(height)) && width % this.videoEncoderInfo.getWidthAlignment() == 0 && height % this.videoEncoderInfo.getHeightAlignment() == 0;
    }

    private VideoEncoderInfoWrapper(VideoEncoderInfo videoEncoderInfo) {
        this.videoEncoderInfo = videoEncoderInfo;
        HashSet hashSet = new HashSet();
        this.extraSupportedSizes = hashSet;
        int widthAlignment = videoEncoderInfo.getWidthAlignment();
        Range<Integer> rangeCreate = Range.create(Integer.valueOf(widthAlignment), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) widthAlignment))) * widthAlignment));
        Intrinsics.checkNotNullExpressionValue(rangeCreate, "create(...)");
        this._supportedWidths = rangeCreate;
        int heightAlignment = videoEncoderInfo.getHeightAlignment();
        Range<Integer> rangeCreate2 = Range.create(Integer.valueOf(heightAlignment), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) heightAlignment))) * heightAlignment));
        Intrinsics.checkNotNullExpressionValue(rangeCreate2, "create(...)");
        this._supportedHeights = rangeCreate2;
        Set<Size> extraSupportedSizes = MediaCodecInfoReportIncorrectInfoQuirk.getExtraSupportedSizes();
        Intrinsics.checkNotNullExpressionValue(extraSupportedSizes, "getExtraSupportedSizes(...)");
        hashSet.addAll(extraSupportedSizes);
    }
}
