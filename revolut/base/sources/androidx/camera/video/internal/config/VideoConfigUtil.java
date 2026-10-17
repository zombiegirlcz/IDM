package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderDataSpace;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!JW\u0010+\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u0018H\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b-\u0010\u000fJ\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060/2\u0006\u0010.\u001a\u00020\r¢\u0006\u0004\b0\u00101J\u001d\u00105\u001a\u0002042\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\u0018¢\u0006\u0004\b5\u00106J%\u0010;\u001a\u0002082\u0006\u0010\u0014\u001a\u00020\u00132\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0000¢\u0006\u0004\b9\u0010:R,\u0010>\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u0002040=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Landroidx/camera/video/internal/config/VideoConfigUtil;", "", "<init>", "()V", "Landroidx/camera/video/MediaSpec;", "mediaSpec", "Landroidx/camera/core/DynamicRange;", "dynamicRange", "Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;", "encoderProfiles", "Landroidx/camera/video/internal/config/VideoMimeInfo;", "resolveVideoMimeInfo", "(Landroidx/camera/video/MediaSpec;Landroidx/camera/core/DynamicRange;Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;)Landroidx/camera/video/internal/config/VideoMimeInfo;", "", "getDynamicRangeDefaultMimeOrThrow", "(Landroidx/camera/core/DynamicRange;)Ljava/lang/String;", "videoMimeInfo", "Landroidx/camera/core/impl/Timebase;", "inputTimebase", "Landroidx/camera/video/VideoSpec;", "videoSpec", "Landroid/util/Size;", "surfaceSize", "Landroid/util/Range;", "", "expectedFrameRateRange", "Landroidx/camera/video/internal/encoder/VideoEncoderConfig;", "resolveVideoEncoderConfig", "(Landroidx/camera/video/internal/config/VideoMimeInfo;Landroidx/camera/core/impl/Timebase;Landroidx/camera/video/VideoSpec;Landroid/util/Size;Landroidx/camera/core/DynamicRange;Landroid/util/Range;)Landroidx/camera/video/internal/encoder/VideoEncoderConfig;", "config", "", "hasGlProcessing", "workaroundDataSpaceIfRequired", "(Landroidx/camera/video/internal/encoder/VideoEncoderConfig;Z)Landroidx/camera/video/internal/encoder/VideoEncoderConfig;", "baseBitrate", "actualBitDepth", "baseBitDepth", "actualFrameRate", "baseFrameRate", "actualWidth", "baseWidth", "actualHeight", "baseHeight", "scaleBitrate", "(IIIIIIIII)I", "getDynamicRangeDefaultMime", "mime", "", "getDynamicRangesForMime", "(Ljava/lang/String;)Ljava/util/Set;", "mimeType", "codecProfileLevel", "Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;", "mimeAndProfileToEncoderDataSpace", "(Ljava/lang/String;I)Landroidx/camera/video/internal/encoder/VideoEncoderDataSpace;", "expectedCaptureFrameRateRange", "Landroidx/camera/video/internal/config/CaptureEncodeRates;", "resolveFrameRates$camera_video", "(Landroidx/camera/video/VideoSpec;Landroid/util/Range;)Landroidx/camera/video/internal/config/CaptureEncodeRates;", "resolveFrameRates", "", "", "MIME_TO_DATA_SPACE_MAP", "Ljava/util/Map;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoConfigUtil {

    @NotNull
    public static final VideoConfigUtil INSTANCE = new VideoConfigUtil();

    @NotNull
    private static final Map<String, Map<Integer, VideoEncoderDataSpace>> MIME_TO_DATA_SPACE_MAP;

    static {
        VideoEncoderDataSpace videoEncoderDataSpace = VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED;
        Pair pair = new Pair(1, videoEncoderDataSpace);
        VideoEncoderDataSpace videoEncoderDataSpace2 = VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_HLG;
        Pair pair2 = new Pair(2, videoEncoderDataSpace2);
        VideoEncoderDataSpace videoEncoderDataSpace3 = VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ;
        MIME_TO_DATA_SPACE_MAP = r0.n(new Pair("video/hevc", r0.k(pair, pair2, new Pair(4096, videoEncoderDataSpace3), new Pair(8192, videoEncoderDataSpace3))), new Pair("video/av01", r0.k(new Pair(1, videoEncoderDataSpace), new Pair(2, videoEncoderDataSpace2), new Pair(4096, videoEncoderDataSpace3), new Pair(8192, videoEncoderDataSpace3))), new Pair("video/x-vnd.on2.vp9", r0.k(new Pair(1, videoEncoderDataSpace), new Pair(4, videoEncoderDataSpace2), new Pair(4096, videoEncoderDataSpace3), new Pair(16384, videoEncoderDataSpace3), new Pair(2, videoEncoderDataSpace), new Pair(8, videoEncoderDataSpace2), new Pair(8192, videoEncoderDataSpace3), new Pair(32768, videoEncoderDataSpace3))), new Pair("video/dolby-vision", r0.k(new Pair(256, videoEncoderDataSpace2), new Pair(512, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT709))));
    }

    private VideoConfigUtil() {
    }

    private final String getDynamicRangeDefaultMimeOrThrow(DynamicRange dynamicRange) {
        String dynamicRangeDefaultMime = getDynamicRangeDefaultMime(dynamicRange);
        if (dynamicRangeDefaultMime != null) {
            return dynamicRangeDefaultMime;
        }
        throw new UnsupportedOperationException("Unsupported dynamic range: " + dynamicRange + "\nNo supported default mime type available.");
    }

    @NotNull
    public static final VideoEncoderConfig resolveVideoEncoderConfig(@NotNull VideoMimeInfo videoMimeInfo, @NotNull Timebase inputTimebase, @NotNull VideoSpec videoSpec, @NotNull Size surfaceSize, @NotNull DynamicRange dynamicRange, @NotNull Range<Integer> expectedFrameRateRange) {
        Intrinsics.checkNotNullParameter(videoMimeInfo, "videoMimeInfo");
        Intrinsics.checkNotNullParameter(inputTimebase, "inputTimebase");
        Intrinsics.checkNotNullParameter(videoSpec, "videoSpec");
        Intrinsics.checkNotNullParameter(surfaceSize, "surfaceSize");
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        Intrinsics.checkNotNullParameter(expectedFrameRateRange, "expectedFrameRateRange");
        Object obj2 = (videoMimeInfo.getCompatibleVideoProfile() != null ? new VideoEncoderConfigVideoProfileResolver(videoMimeInfo.getMimeType(), inputTimebase, videoSpec, surfaceSize, videoMimeInfo.getCompatibleVideoProfile(), dynamicRange, expectedFrameRateRange) : new VideoEncoderConfigDefaultResolver(videoMimeInfo.getMimeType(), inputTimebase, videoSpec, surfaceSize, dynamicRange, expectedFrameRateRange)).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (VideoEncoderConfig) obj2;
    }

    @NotNull
    public static final VideoMimeInfo resolveVideoMimeInfo(@NotNull MediaSpec mediaSpec, @NotNull DynamicRange dynamicRange, VideoValidatedEncoderProfilesProxy encoderProfiles) {
        EncoderProfilesProxy.VideoProfileProxy next;
        Intrinsics.checkNotNullParameter(mediaSpec, "mediaSpec");
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        if (!dynamicRange.isFullySpecified()) {
            throw new IllegalStateException(("Dynamic range must be a fully specified dynamic range [provided dynamic range: " + dynamicRange + ']').toString());
        }
        String strOutputFormatToVideoMime = MediaSpec.INSTANCE.outputFormatToVideoMime(mediaSpec.getOutputFormat());
        if (encoderProfiles != null) {
            Set<Integer> setDynamicRangeToVideoProfileHdrFormats = DynamicRangeUtil.dynamicRangeToVideoProfileHdrFormats(dynamicRange);
            Intrinsics.checkNotNullExpressionValue(setDynamicRangeToVideoProfileHdrFormats, "dynamicRangeToVideoProfileHdrFormats(...)");
            Set<Integer> setDynamicRangeToVideoProfileBitDepth = DynamicRangeUtil.dynamicRangeToVideoProfileBitDepth(dynamicRange);
            Intrinsics.checkNotNullExpressionValue(setDynamicRangeToVideoProfileBitDepth, "dynamicRangeToVideoProfileBitDepth(...)");
            Iterator<EncoderProfilesProxy.VideoProfileProxy> it8 = encoderProfiles.getVideoProfiles().iterator();
            while (it8.hasNext()) {
                next = it8.next();
                if (setDynamicRangeToVideoProfileHdrFormats.contains(Integer.valueOf(next.getHdrFormat())) && setDynamicRangeToVideoProfileBitDepth.contains(Integer.valueOf(next.getBitDepth()))) {
                    String mediaType = next.getMediaType();
                    Intrinsics.checkNotNullExpressionValue(mediaType, "getMediaType(...)");
                    if (Intrinsics.f(strOutputFormatToVideoMime, mediaType)) {
                        Logger.d("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + strOutputFormatToVideoMime + ']');
                    } else if (mediaSpec.getOutputFormat() == -1) {
                        Logger.d("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_UNSPECIFIED. Using CamcorderProfile to derive VIDEO settings [mime type: " + strOutputFormatToVideoMime + ", dynamic range: " + dynamicRange + ']');
                    }
                    strOutputFormatToVideoMime = mediaType;
                    break;
                }
            }
            next = null;
        } else {
            next = null;
        }
        if (next == null) {
            if (mediaSpec.getOutputFormat() == -1) {
                strOutputFormatToVideoMime = INSTANCE.getDynamicRangeDefaultMimeOrThrow(dynamicRange);
            }
            if (encoderProfiles == null) {
                Logger.d("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strOutputFormatToVideoMime + ", dynamic range: " + dynamicRange + ']');
            } else {
                Logger.d("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strOutputFormatToVideoMime + ", dynamic range: " + dynamicRange + ']');
            }
        }
        return new VideoMimeInfo(strOutputFormatToVideoMime, 0, next, 2, null);
    }

    public static final int scaleBitrate(int baseBitrate, int actualBitDepth, int baseBitDepth, int actualFrameRate, int baseFrameRate, int actualWidth, int baseWidth, int actualHeight, int baseHeight) {
        String string;
        Rational rational = new Rational(actualBitDepth, baseBitDepth);
        Rational rational2 = new Rational(actualFrameRate, baseFrameRate);
        Rational rational3 = new Rational(actualWidth, baseWidth);
        Rational rational4 = new Rational(actualHeight, baseHeight);
        double dDoubleValue = rational.doubleValue();
        int iDoubleValue = (int) (rational4.doubleValue() * rational3.doubleValue() * rational2.doubleValue() * dDoubleValue * ((double) baseBitrate));
        if (Logger.isDebugEnabled("VideoConfigUtil")) {
            StringBuilder sbW = a.w("Base Bitrate(", baseBitrate, actualBitDepth, "bps) * Bit Depth Ratio (", " / ");
            t61.a.x(sbW, baseBitDepth, ") * Frame Rate Ratio(", actualFrameRate, " / ");
            t61.a.x(sbW, baseFrameRate, ") * Width Ratio(", actualWidth, " / ");
            t61.a.x(sbW, baseWidth, ") * Height Ratio(", actualHeight, " / ");
            sbW.append(baseHeight);
            sbW.append(") = ");
            sbW.append(iDoubleValue);
            string = sbW.toString();
        } else {
            string = "";
        }
        Logger.d("VideoConfigUtil", string);
        return iDoubleValue;
    }

    @NotNull
    public static final VideoEncoderConfig workaroundDataSpaceIfRequired(@NotNull VideoEncoderConfig config, boolean hasGlProcessing) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (!Intrinsics.f(config.getDataSpace(), VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED)) {
            return config;
        }
        MediaCodecDefaultDataSpaceQuirk mediaCodecDefaultDataSpaceQuirk = (MediaCodecDefaultDataSpaceQuirk) DeviceQuirks.get(MediaCodecDefaultDataSpaceQuirk.class);
        if (!hasGlProcessing || mediaCodecDefaultDataSpaceQuirk == null) {
            return config;
        }
        VideoEncoderDataSpace suggestedDataSpace = mediaCodecDefaultDataSpaceQuirk.getSuggestedDataSpace();
        Intrinsics.checkNotNullExpressionValue(suggestedDataSpace, "getSuggestedDataSpace(...)");
        VideoEncoderConfig videoEncoderConfigBuild = config.toBuilder().setDataSpace(suggestedDataSpace).build();
        Intrinsics.checkNotNullExpressionValue(videoEncoderConfigBuild, "build(...)");
        return videoEncoderConfigBuild;
    }

    public final String getDynamicRangeDefaultMime(@NotNull DynamicRange dynamicRange) {
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        int encoding = dynamicRange.getEncoding();
        if (encoding == 1) {
            return "video/avc";
        }
        if (encoding == 3 || encoding == 4 || encoding == 5) {
            return "video/hevc";
        }
        if (encoding != 6) {
            return null;
        }
        return "video/dolby-vision";
    }

    @NotNull
    public final Set<DynamicRange> getDynamicRangesForMime(@NotNull String mime) {
        Intrinsics.checkNotNullParameter(mime, "mime");
        return DynamicRangeFormatComboRegistry.INSTANCE.getDynamicRangesForVideoMime(mime);
    }

    @NotNull
    public final VideoEncoderDataSpace mimeAndProfileToEncoderDataSpace(@NotNull String mimeType, int codecProfileLevel) {
        VideoEncoderDataSpace videoEncoderDataSpace;
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Map<Integer, VideoEncoderDataSpace> map = MIME_TO_DATA_SPACE_MAP.get(mimeType);
        if (map != null && (videoEncoderDataSpace = map.get(Integer.valueOf(codecProfileLevel))) != null) {
            return videoEncoderDataSpace;
        }
        Logger.w("VideoConfigUtil", "Unsupported mime type " + mimeType + " or profile level " + codecProfileLevel + ". Data space is unspecified.");
        VideoEncoderDataSpace ENCODER_DATA_SPACE_UNSPECIFIED = VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED;
        Intrinsics.checkNotNullExpressionValue(ENCODER_DATA_SPACE_UNSPECIFIED, "ENCODER_DATA_SPACE_UNSPECIFIED");
        return ENCODER_DATA_SPACE_UNSPECIFIED;
    }

    @NotNull
    public final CaptureEncodeRates resolveFrameRates$camera_video(@NotNull VideoSpec videoSpec, @NotNull Range<Integer> expectedCaptureFrameRateRange) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(videoSpec, "videoSpec");
        Intrinsics.checkNotNullParameter(expectedCaptureFrameRateRange, "expectedCaptureFrameRateRange");
        Range<Integer> range = SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED;
        if (Intrinsics.f(expectedCaptureFrameRateRange, range)) {
            iIntValue = 30;
        } else {
            Object upper = expectedCaptureFrameRateRange.getUpper();
            Intrinsics.h(upper);
            iIntValue = ((Number) upper).intValue();
        }
        int encodeFrameRate = videoSpec.getEncodeFrameRate() != 0 ? videoSpec.getEncodeFrameRate() : iIntValue;
        StringBuilder sbW = a.w("Resolved capture/encode frame rate ", iIntValue, encodeFrameRate, "fps/", "fps, [Expected operating range: ");
        sbW.append(Intrinsics.f(expectedCaptureFrameRateRange, range) ? "<UNSPECIFIED>" : String.valueOf(expectedCaptureFrameRateRange));
        sbW.append(']');
        Logger.d("VideoConfigUtil", sbW.toString());
        return new CaptureEncodeRates(iIntValue, encodeFrameRate);
    }
}
