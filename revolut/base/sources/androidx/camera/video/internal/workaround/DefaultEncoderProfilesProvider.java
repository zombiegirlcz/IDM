package androidx.camera.video.internal.workaround;

import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.MicAvailabilityHelper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w0.f;
import xge.h;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 F2\u00020\u0001:\u0001FB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJm\u0010(\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010)JK\u0010-\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000b2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\u000b*\u00020\u0005H\u0002¢\u0006\u0004\b/\u00100J#\u00102\u001a\u0004\u0018\u000101*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00108R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R=\u0010B\u001a$\u0012\f\u0012\n =*\u0004\u0018\u00010<0< =*\u0010\u0012\f\u0012\n =*\u0004\u0018\u00010<0<0\u00040;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, d2 = {"Landroidx/camera/video/internal/workaround/DefaultEncoderProfilesProvider;", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfo", "", "Landroidx/camera/video/Quality;", "targetQualities", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "videoEncoderInfoFinder", "<init>", "(Landroidx/camera/core/impl/CameraInfoInternal;Ljava/util/List;Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;)V", "", "quality", "Landroidx/camera/core/impl/EncoderProfilesProxy;", "getProfileInternal", "(I)Landroidx/camera/core/impl/EncoderProfilesProxy;", "generateEncoderProfiles", "Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "generateVideoProfiles", "(I)Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "width", "height", "bitrate", "resolveVideoProfile", "(III)Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "defaultDurationSeconds", "recommendedFileFormat", "videoProfile", "Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "audioProfile", "createDefaultEncoderProfiles", "(IILandroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;)Landroidx/camera/core/impl/EncoderProfilesProxy;", "codec", "", "mimeType", "frameRate", "profile", "bitDepth", "chromaSubsampling", "hdrFormat", "createDefaultVideoProfile", "(ILjava/lang/String;IIIIIIII)Landroidx/camera/core/impl/EncoderProfilesProxy$VideoProfileProxy;", "bitRate", "sampleRate", "channels", "createDefaultAudioProfile", "(ILjava/lang/String;IIII)Landroidx/camera/core/impl/EncoderProfilesProxy$AudioProfileProxy;", "getTypicalBitrate", "(Landroidx/camera/video/Quality;)I", "Landroidx/camera/video/Quality$ConstantQuality;", "find", "(Ljava/util/List;I)Landroidx/camera/video/Quality$ConstantQuality;", "", "hasProfile", "(I)Z", "getAll", "Landroidx/camera/core/impl/CameraInfoInternal;", "Ljava/util/List;", "Landroidx/camera/video/internal/encoder/VideoEncoderInfo$Finder;", "", "Landroid/util/Size;", "kotlin.jvm.PlatformType", "supportedSizes$delegate", "Lkotlin/Lazy;", "getSupportedSizes", "()Ljava/util/List;", "supportedSizes", "", "encoderProfilesMap", "Ljava/util/Map;", "Companion", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultEncoderProfilesProvider implements EncoderProfilesProvider {

    @NotNull
    private final CameraInfoInternal cameraInfo;

    @NotNull
    private final Map<Integer, EncoderProfilesProxy> encoderProfilesMap;

    /* JADX INFO: renamed from: supportedSizes$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy supportedSizes;

    @NotNull
    private final List<Quality> targetQualities;

    @NotNull
    private final VideoEncoderInfo.Finder videoEncoderInfoFinder;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultEncoderProfilesProvider(@NotNull CameraInfoInternal cameraInfo, @NotNull List<? extends Quality> targetQualities, @NotNull VideoEncoderInfo.Finder videoEncoderInfoFinder) {
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        Intrinsics.checkNotNullParameter(targetQualities, "targetQualities");
        Intrinsics.checkNotNullParameter(videoEncoderInfoFinder, "videoEncoderInfoFinder");
        this.cameraInfo = cameraInfo;
        this.targetQualities = targetQualities;
        this.videoEncoderInfoFinder = videoEncoderInfoFinder;
        this.supportedSizes = j.b(new h(this, 20));
        this.encoderProfilesMap = new LinkedHashMap();
    }

    private final EncoderProfilesProxy.AudioProfileProxy createDefaultAudioProfile(int codec, String mimeType, int bitRate, int sampleRate, int channels, int profile) {
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxyCreate = EncoderProfilesProxy.AudioProfileProxy.create(codec, mimeType, bitRate, sampleRate, channels, profile);
        Intrinsics.checkNotNullExpressionValue(audioProfileProxyCreate, "create(...)");
        return audioProfileProxyCreate;
    }

    public static /* synthetic */ EncoderProfilesProxy.AudioProfileProxy createDefaultAudioProfile$default(DefaultEncoderProfilesProvider defaultEncoderProfilesProvider, int i, String str, int i2, int i3, int i5, int i6, int i21, Object obj2) {
        if ((i21 & 1) != 0) {
            i = 3;
        }
        if ((i21 & 2) != 0) {
            str = "audio/mp4a-latm";
        }
        if ((i21 & 4) != 0) {
            i2 = 96000;
        }
        if ((i21 & 8) != 0) {
            i3 = MicAvailabilityHelper.SAMPLE_RATE_HZ;
        }
        if ((i21 & 16) != 0) {
            i5 = 1;
        }
        if ((i21 & 32) != 0) {
            i6 = 2;
        }
        int i22 = i5;
        int i32 = i6;
        return defaultEncoderProfilesProvider.createDefaultAudioProfile(i, str, i2, i3, i22, i32);
    }

    private final EncoderProfilesProxy createDefaultEncoderProfiles(int defaultDurationSeconds, int recommendedFileFormat, EncoderProfilesProxy.VideoProfileProxy videoProfile, EncoderProfilesProxy.AudioProfileProxy audioProfile) {
        EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxyCreate = EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(defaultDurationSeconds, recommendedFileFormat, u.c(audioProfile), u.c(videoProfile));
        Intrinsics.checkNotNullExpressionValue(immutableEncoderProfilesProxyCreate, "create(...)");
        return immutableEncoderProfilesProxyCreate;
    }

    public static /* synthetic */ EncoderProfilesProxy createDefaultEncoderProfiles$default(DefaultEncoderProfilesProvider defaultEncoderProfilesProvider, int i, int i2, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i = 60;
        }
        if ((i3 & 2) != 0) {
            i2 = 2;
        }
        return defaultEncoderProfilesProvider.createDefaultEncoderProfiles(i, i2, videoProfileProxy, audioProfileProxy);
    }

    private final EncoderProfilesProxy.VideoProfileProxy createDefaultVideoProfile(int codec, String mimeType, int width, int height, int bitrate, int frameRate, int profile, int bitDepth, int chromaSubsampling, int hdrFormat) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyCreate = EncoderProfilesProxy.VideoProfileProxy.create(codec, mimeType, bitrate, frameRate, width, height, profile, bitDepth, chromaSubsampling, hdrFormat);
        Intrinsics.checkNotNullExpressionValue(videoProfileProxyCreate, "create(...)");
        return videoProfileProxyCreate;
    }

    public static /* synthetic */ EncoderProfilesProxy.VideoProfileProxy createDefaultVideoProfile$default(DefaultEncoderProfilesProvider defaultEncoderProfilesProvider, int i, String str, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, int i43, Object obj2) {
        int i59;
        int i66;
        int i74;
        int i92;
        int i96;
        int i99;
        int i100;
        int i101;
        int i102;
        String str2;
        DefaultEncoderProfilesProvider defaultEncoderProfilesProvider2;
        if ((i43 & 1) != 0) {
            i = 2;
        }
        if ((i43 & 2) != 0) {
            str = "video/avc";
        }
        if ((i43 & 32) != 0) {
            i6 = 30;
        }
        if ((i43 & 64) != 0) {
            i21 = -1;
        }
        if ((i43 & 128) != 0) {
            i22 = 8;
        }
        if ((i43 & 256) != 0) {
            i32 = 0;
        }
        if ((i43 & 512) != 0) {
            i59 = 0;
            i92 = i22;
            i66 = i32;
            i99 = i6;
            i74 = i21;
            i101 = i3;
            i96 = i5;
            str2 = str;
            i100 = i2;
            defaultEncoderProfilesProvider2 = defaultEncoderProfilesProvider;
            i102 = i;
        } else {
            i59 = i33;
            i66 = i32;
            i74 = i21;
            i92 = i22;
            i96 = i5;
            i99 = i6;
            i100 = i2;
            i101 = i3;
            i102 = i;
            str2 = str;
            defaultEncoderProfilesProvider2 = defaultEncoderProfilesProvider;
        }
        return defaultEncoderProfilesProvider2.createDefaultVideoProfile(i102, str2, i100, i101, i96, i99, i74, i92, i66, i59);
    }

    private final Quality.ConstantQuality find(List<? extends Quality> list, int i) {
        Object next;
        Iterator<T> it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            Quality quality = (Quality) next;
            Intrinsics.i(quality, "null cannot be cast to non-null type androidx.camera.video.Quality.ConstantQuality");
            if (((Quality.ConstantQuality) quality).getQualityValue(1) == i) {
                break;
            }
        }
        if (next instanceof Quality.ConstantQuality) {
            return (Quality.ConstantQuality) next;
        }
        return null;
    }

    private final EncoderProfilesProxy generateEncoderProfiles(int quality) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyGenerateVideoProfiles = generateVideoProfiles(quality);
        if (videoProfileProxyGenerateVideoProfiles == null) {
            return null;
        }
        return createDefaultEncoderProfiles$default(this, 0, 0, videoProfileProxyGenerateVideoProfiles, createDefaultAudioProfile$default(this, 0, null, 0, 0, 0, 0, 63, null), 3, null);
    }

    private final EncoderProfilesProxy.VideoProfileProxy generateVideoProfiles(int quality) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyResolveVideoProfile;
        Quality.ConstantQuality constantQualityFind = find(this.targetQualities, quality);
        if (constantQualityFind == null) {
            return null;
        }
        for (Size size : constantQualityFind.getTypicalSizes()) {
            if (getSupportedSizes().contains(size) && (videoProfileProxyResolveVideoProfile = resolveVideoProfile(size.getWidth(), size.getHeight(), getTypicalBitrate(constantQualityFind))) != null) {
                return videoProfileProxyResolveVideoProfile;
            }
        }
        return null;
    }

    private final EncoderProfilesProxy getProfileInternal(int quality) {
        if (this.encoderProfilesMap.containsKey(Integer.valueOf(quality))) {
            return this.encoderProfilesMap.get(Integer.valueOf(quality));
        }
        EncoderProfilesProxy encoderProfilesProxyGenerateEncoderProfiles = generateEncoderProfiles(quality);
        this.encoderProfilesMap.put(Integer.valueOf(quality), encoderProfilesProxyGenerateEncoderProfiles);
        return encoderProfilesProxyGenerateEncoderProfiles;
    }

    private final List<Size> getSupportedSizes() {
        return (List) this.supportedSizes.getValue();
    }

    private final int getTypicalBitrate(Quality quality) {
        if (Intrinsics.f(quality, Quality.UHD)) {
            return 40000000;
        }
        if (Intrinsics.f(quality, Quality.FHD)) {
            return 10000000;
        }
        if (Intrinsics.f(quality, Quality.HD)) {
            return 4000000;
        }
        if (Intrinsics.f(quality, Quality.SD)) {
            return 2000000;
        }
        throw new IllegalArgumentException("Undefined bitrate for quality: " + quality);
    }

    private final EncoderProfilesProxy.VideoProfileProxy resolveVideoProfile(int width, int height, int bitrate) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyCreateDefaultVideoProfile$default = createDefaultVideoProfile$default(this, 0, null, width, height, bitrate, 0, 0, 0, 0, 0, 995, null);
        VideoEncoderInfo.Finder finder = this.videoEncoderInfoFinder;
        String mediaType = videoProfileProxyCreateDefaultVideoProfile$default.getMediaType();
        Intrinsics.checkNotNullExpressionValue(mediaType, "getMediaType(...)");
        ((f) finder).getClass();
        VideoEncoderInfo videoEncoderInfoFINDER$lambda$0 = VideoEncoderInfoImpl.FINDER$lambda$0(mediaType);
        if (videoEncoderInfoFINDER$lambda$0 == null || !videoEncoderInfoFINDER$lambda$0.isSizeSupportedAllowSwapping(width, height)) {
            return null;
        }
        Integer num = (Integer) videoEncoderInfoFINDER$lambda$0.getSupportedBitrateRange().clamp(Integer.valueOf(bitrate));
        if (num != null && num.intValue() == bitrate) {
            return videoProfileProxyCreateDefaultVideoProfile$default;
        }
        Intrinsics.h(num);
        return createDefaultVideoProfile$default(this, 0, null, width, height, num.intValue(), 0, 0, 0, 0, 0, 995, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List supportedSizes_delegate$lambda$0(DefaultEncoderProfilesProvider defaultEncoderProfilesProvider) {
        return defaultEncoderProfilesProvider.cameraInfo.getSupportedResolutions(34);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int quality) {
        return getProfileInternal(quality);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int quality) {
        return getProfileInternal(quality) != null;
    }
}
