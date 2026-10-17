package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.utils.EncoderProfilesUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import w0.f;

/* JADX INFO: loaded from: classes15.dex */
public class ExtraSupportedQualityQuirk implements Quirk {
    private Map<Integer, EncoderProfilesProxy> getExtraEncoderProfilesForMotoC(CameraInfoInternal cameraInfoInternal, EncoderProfilesProvider encoderProfilesProvider, VideoEncoderInfo.Finder finder) {
        EncoderProfilesProxy all2;
        EncoderProfilesProxy.VideoProfileProxy firstVideoProfile;
        if (!"1".equals(cameraInfoInternal.getCameraId()) || encoderProfilesProvider.hasProfile(4) || (firstVideoProfile = EncoderProfilesUtil.getFirstVideoProfile((all2 = encoderProfilesProvider.getAll(1)))) == null) {
            return null;
        }
        Range<Integer> supportedBitrateRange = getSupportedBitrateRange(firstVideoProfile, finder);
        Size size = SizeUtil.RESOLUTION_480P;
        EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxyCreate = EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(all2.getDefaultDurationSeconds(), all2.getRecommendedFileFormat(), all2.getAudioProfiles(), Collections.singletonList(EncoderProfilesUtil.deriveVideoProfile(firstVideoProfile, size, supportedBitrateRange)));
        HashMap map = new HashMap();
        map.put(4, immutableEncoderProfilesProxyCreate);
        if (SizeUtil.getArea(size) > SizeUtil.getArea(firstVideoProfile.getResolution())) {
            map.put(1, immutableEncoderProfilesProxyCreate);
        }
        return map;
    }

    private static Range<Integer> getSupportedBitrateRange(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, VideoEncoderInfo.Finder finder) {
        String mediaType = videoProfileProxy.getMediaType();
        ((f) finder).getClass();
        VideoEncoderInfo videoEncoderInfoFINDER$lambda$0 = VideoEncoderInfoImpl.FINDER$lambda$0(mediaType);
        return videoEncoderInfoFINDER$lambda$0 != null ? videoEncoderInfoFINDER$lambda$0.getSupportedBitrateRange() : Range.create(0, Integer.MAX_VALUE);
    }

    private static boolean isMotoC() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isMotoC();
    }

    public Map<Integer, EncoderProfilesProxy> getExtraEncoderProfiles(CameraInfoInternal cameraInfoInternal, EncoderProfilesProvider encoderProfilesProvider, VideoEncoderInfo.Finder finder) {
        return isMotoC() ? getExtraEncoderProfilesForMotoC(cameraInfoInternal, encoderProfilesProvider, finder) : Collections.EMPTY_MAP;
    }
}
