package androidx.camera.video;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider;
import androidx.camera.video.internal.QualityExploredEncoderProfilesProvider;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityAddedEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityResolutionModifiedEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u00020\u000e*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/camera/video/EncoderProfilesProviderResolver;", "", "<init>", "()V", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfo", "", "videoCapabilitiesSource", "qualitySource", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "videoEncoderInfoFinder", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "resolve", "(Landroidx/camera/core/impl/CameraInfoInternal;IILandroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;)Landroidx/camera/core/impl/EncoderProfilesProvider;", "", "isHlg10Supported", "(Landroidx/camera/core/impl/CameraInfoInternal;)Z", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EncoderProfilesProviderResolver {

    @NotNull
    public static final EncoderProfilesProviderResolver INSTANCE = new EncoderProfilesProviderResolver();

    private EncoderProfilesProviderResolver() {
    }

    private final boolean isHlg10Supported(CameraInfoInternal cameraInfoInternal) {
        Set<DynamicRange> supportedDynamicRanges = cameraInfoInternal.getSupportedDynamicRanges();
        Intrinsics.checkNotNullExpressionValue(supportedDynamicRanges, "getSupportedDynamicRanges(...)");
        Set<DynamicRange> set = supportedDynamicRanges;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (DynamicRange dynamicRange : set) {
            if (dynamicRange.getEncoding() == 3 && dynamicRange.getBitDepth() == 10) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final EncoderProfilesProvider resolve(@NotNull CameraInfoInternal cameraInfo, int videoCapabilitiesSource, int qualitySource, @NotNull VideoEncoderInfo.Finder videoEncoderInfoFinder) {
        VideoEncoderInfo.Finder finder;
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        Intrinsics.checkNotNullParameter(videoEncoderInfoFinder, "videoEncoderInfoFinder");
        if (videoCapabilitiesSource != 0 && videoCapabilitiesSource != 1) {
            throw new IllegalArgumentException(a0.d.n("Not a supported video capabilities source: ", videoCapabilitiesSource).toString());
        }
        EncoderProfilesProvider encoderProfilesProvider = cameraInfo.getEncoderProfilesProvider();
        Intrinsics.checkNotNullExpressionValue(encoderProfilesProvider, "getEncoderProfilesProvider(...)");
        if (qualitySource == 2) {
            if (cameraInfo.isHighSpeedSupported()) {
                return encoderProfilesProvider;
            }
            EncoderProfilesProvider EMPTY = EncoderProfilesProvider.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            return EMPTY;
        }
        if (!CapabilitiesByQuality.containsSupportedQuality(encoderProfilesProvider, qualitySource)) {
            Logger.w("EncoderProfilesResolver", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
            encoderProfilesProvider = new DefaultEncoderProfilesProvider(cameraInfo, v.k(Quality.FHD, Quality.HD, Quality.SD), videoEncoderInfoFinder);
        }
        Quirks all2 = DeviceQuirks.getAll();
        Intrinsics.checkNotNullExpressionValue(all2, "getAll(...)");
        EncoderProfilesProvider qualityAddedEncoderProfilesProvider = new QualityAddedEncoderProfilesProvider(encoderProfilesProvider, all2, cameraInfo, videoEncoderInfoFinder);
        if (videoCapabilitiesSource == 1) {
            finder = videoEncoderInfoFinder;
            qualityAddedEncoderProfilesProvider = new QualityExploredEncoderProfilesProvider(qualityAddedEncoderProfilesProvider, Quality.getSortedQualities(), Collections.singleton(DynamicRange.SDR), cameraInfo.getSupportedResolutions(34), finder);
        } else {
            finder = videoEncoderInfoFinder;
        }
        EncoderProfilesProvider qualityResolutionModifiedEncoderProfilesProvider = new QualityResolutionModifiedEncoderProfilesProvider(qualityAddedEncoderProfilesProvider, all2);
        if (isHlg10Supported(cameraInfo)) {
            qualityResolutionModifiedEncoderProfilesProvider = new BackupHdrProfileEncoderProfilesProvider(qualityResolutionModifiedEncoderProfilesProvider, finder);
        }
        return new QualityValidatedEncoderProfilesProvider(qualityResolutionModifiedEncoderProfilesProvider, cameraInfo, all2);
    }
}
