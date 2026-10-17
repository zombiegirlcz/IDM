package androidx.camera.video.internal.config;

import android.util.Rational;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.MicAvailabilityHelper;
import g6f.f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v0.a;
import zhm.z;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001bJ%\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J5\u0010'\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J1\u0010-\u001a\u00020*2\u0006\u0010)\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/camera/video/internal/config/AudioConfigUtil;", "", "<init>", "()V", "Landroidx/camera/video/MediaSpec;", "mediaSpec", "Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;", "encoderProfiles", "Landroidx/camera/video/internal/config/AudioMimeInfo;", "resolveAudioMimeInfo", "(Landroidx/camera/video/MediaSpec;Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;)Landroidx/camera/video/internal/config/AudioMimeInfo;", "audioMimeInfo", "Landroidx/camera/video/AudioSpec;", "audioSpec", "Landroid/util/Rational;", "captureToEncodeRatio", "Landroidx/camera/video/internal/audio/AudioSettings;", "resolveAudioSettings", "(Landroidx/camera/video/internal/config/AudioMimeInfo;Landroidx/camera/video/AudioSpec;Landroid/util/Rational;)Landroidx/camera/video/internal/audio/AudioSettings;", "Landroidx/camera/core/impl/Timebase;", "inputTimebase", "audioSettings", "Landroidx/camera/video/internal/encoder/AudioEncoderConfig;", "resolveAudioEncoderConfig", "(Landroidx/camera/video/internal/config/AudioMimeInfo;Landroidx/camera/core/impl/Timebase;Landroidx/camera/video/internal/audio/AudioSettings;Landroidx/camera/video/AudioSpec;)Landroidx/camera/video/internal/encoder/AudioEncoderConfig;", "", "resolveAudioSource", "(Landroidx/camera/video/AudioSpec;)I", "resolveAudioSourceFormat", "channelCount", "sourceFormat", "initialTargetSampleRate", "selectSampleRateOrNearestSupported", "(III)I", "baseBitrate", "actualChannelCount", "baseChannelCount", "actualSampleRate", "baseSampleRate", "scaleBitrate", "(IIIII)I", "targetEncodeSampleRate", "Landroidx/camera/video/internal/config/CaptureEncodeRates;", "resolveSampleRates$camera_video", "(IIILandroid/util/Rational;)Landroidx/camera/video/internal/config/CaptureEncodeRates;", "resolveSampleRates", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioConfigUtil {

    @NotNull
    public static final AudioConfigUtil INSTANCE = new AudioConfigUtil();

    private AudioConfigUtil() {
    }

    @NotNull
    public static final AudioEncoderConfig resolveAudioEncoderConfig(@NotNull AudioMimeInfo audioMimeInfo, @NotNull Timebase inputTimebase, @NotNull AudioSettings audioSettings, @NotNull AudioSpec audioSpec) {
        Intrinsics.checkNotNullParameter(audioMimeInfo, "audioMimeInfo");
        Intrinsics.checkNotNullParameter(inputTimebase, "inputTimebase");
        Intrinsics.checkNotNullParameter(audioSettings, "audioSettings");
        Intrinsics.checkNotNullParameter(audioSpec, "audioSpec");
        Object obj2 = (audioMimeInfo.getCompatibleAudioProfile() != null ? new AudioEncoderConfigAudioProfileResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), inputTimebase, audioSpec, audioSettings, audioMimeInfo.getCompatibleAudioProfile()) : new AudioEncoderConfigDefaultResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), inputTimebase, audioSpec, audioSettings)).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (AudioEncoderConfig) obj2;
    }

    @NotNull
    public static final AudioMimeInfo resolveAudioMimeInfo(@NotNull MediaSpec mediaSpec, VideoValidatedEncoderProfilesProxy encoderProfiles) {
        EncoderProfilesProxy.AudioProfileProxy defaultAudioProfile;
        Intrinsics.checkNotNullParameter(mediaSpec, "mediaSpec");
        MediaSpec.Companion companion = MediaSpec.INSTANCE;
        String strOutputFormatToAudioMime = companion.outputFormatToAudioMime(mediaSpec.getOutputFormat());
        int iOutputFormatToAudioProfile = companion.outputFormatToAudioProfile(mediaSpec.getOutputFormat());
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = null;
        if (encoderProfiles != null && (defaultAudioProfile = encoderProfiles.getDefaultAudioProfile()) != null) {
            String mediaType = defaultAudioProfile.getMediaType();
            Intrinsics.checkNotNullExpressionValue(mediaType, "getMediaType(...)");
            int profile = defaultAudioProfile.getProfile();
            if (Intrinsics.f(mediaType, "audio/none")) {
                Logger.d("AudioConfigUtil", "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + strOutputFormatToAudioMime + "(profile: " + iOutputFormatToAudioProfile + ")]");
            } else if (mediaSpec.getOutputFormat() == -1) {
                Logger.d("AudioConfigUtil", "MediaSpec contains OUTPUT_FORMAT_UNSPECIFIED. Using EncoderProfiles to derive AUDIO settings [mime type: " + mediaType + "(profile: " + profile + ")]");
                audioProfileProxy = defaultAudioProfile;
                strOutputFormatToAudioMime = mediaType;
                iOutputFormatToAudioProfile = profile;
            } else if (Intrinsics.f(strOutputFormatToAudioMime, mediaType) && iOutputFormatToAudioProfile == profile) {
                Logger.d("AudioConfigUtil", "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + mediaType + "(profile: " + iOutputFormatToAudioProfile + ")]");
                audioProfileProxy = defaultAudioProfile;
                strOutputFormatToAudioMime = mediaType;
            } else {
                StringBuilder sbK = a.k(profile, "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: ", mediaType, "(profile: ", "), chosen mime type: ");
                sbK.append(strOutputFormatToAudioMime);
                sbK.append("(profile: ");
                sbK.append(iOutputFormatToAudioProfile);
                sbK.append(")]");
                Logger.d("AudioConfigUtil", sbK.toString());
            }
        }
        return new AudioMimeInfo(strOutputFormatToAudioMime, iOutputFormatToAudioProfile, audioProfileProxy);
    }

    @NotNull
    public static final AudioSettings resolveAudioSettings(@NotNull AudioMimeInfo audioMimeInfo, @NotNull AudioSpec audioSpec, Rational captureToEncodeRatio) {
        Intrinsics.checkNotNullParameter(audioMimeInfo, "audioMimeInfo");
        Intrinsics.checkNotNullParameter(audioSpec, "audioSpec");
        Object obj2 = (audioMimeInfo.getCompatibleAudioProfile() != null ? new AudioSettingsAudioProfileResolver(audioSpec, audioMimeInfo.getCompatibleAudioProfile(), captureToEncodeRatio) : new AudioSettingsDefaultResolver(audioSpec, captureToEncodeRatio)).get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (AudioSettings) obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int selectSampleRateOrNearestSupported$lambda$0(int i, int i2, int i3) {
        int iAbs = Math.abs(i2 - i) - Math.abs(i3 - i);
        return iAbs == 0 ? Integer.signum(i2 - i3) : Integer.signum(iAbs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int selectSampleRateOrNearestSupported$lambda$1(Function2 function2, Object obj2, Object obj3) {
        return ((Number) function2.invoke(obj2, obj3)).intValue();
    }

    public final int resolveAudioSource(@NotNull AudioSpec audioSpec) {
        Intrinsics.checkNotNullParameter(audioSpec, "audioSpec");
        int source = audioSpec.getSource();
        if (source == -1) {
            Logger.d("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        Logger.d("AudioConfigUtil", "Using provided AUDIO source: " + source);
        return source;
    }

    public final int resolveAudioSourceFormat(@NotNull AudioSpec audioSpec) {
        Intrinsics.checkNotNullParameter(audioSpec, "audioSpec");
        int sourceFormat = audioSpec.getSourceFormat();
        if (sourceFormat == -1) {
            Logger.d("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        Logger.d("AudioConfigUtil", "Using provided AUDIO source format: " + sourceFormat);
        return sourceFormat;
    }

    @NotNull
    public final CaptureEncodeRates resolveSampleRates$camera_video(int targetEncodeSampleRate, int channelCount, int sourceFormat, Rational captureToEncodeRatio) {
        int iSelectSampleRateOrNearestSupported;
        int encodeRate;
        if (captureToEncodeRatio == null) {
            iSelectSampleRateOrNearestSupported = selectSampleRateOrNearestSupported(channelCount, sourceFormat, targetEncodeSampleRate);
            encodeRate = iSelectSampleRateOrNearestSupported;
        } else {
            iSelectSampleRateOrNearestSupported = selectSampleRateOrNearestSupported(channelCount, sourceFormat, CaptureEncodeRatesKt.toCaptureRate(targetEncodeSampleRate, captureToEncodeRatio));
            encodeRate = CaptureEncodeRatesKt.toEncodeRate(iSelectSampleRateOrNearestSupported, captureToEncodeRatio);
        }
        StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("Resolved capture/encode sample rate ", iSelectSampleRateOrNearestSupported, encodeRate, "Hz/", "Hz, [target sample rate: ");
        t61.a.x(sbW, targetEncodeSampleRate, ", channel count: ", channelCount, ", source format: ");
        sbW.append(sourceFormat);
        sbW.append(", capture to encode sample rate ratio: ");
        sbW.append(captureToEncodeRatio);
        sbW.append(']');
        Logger.d("AudioConfigUtil", sbW.toString());
        return new CaptureEncodeRates(iSelectSampleRateOrNearestSupported, encodeRate);
    }

    public final int scaleBitrate(int baseBitrate, int actualChannelCount, int baseChannelCount, int actualSampleRate, int baseSampleRate) {
        String string;
        Rational rational = new Rational(actualChannelCount, baseChannelCount);
        Rational rational2 = new Rational(actualSampleRate, baseSampleRate);
        double dDoubleValue = rational.doubleValue();
        int iDoubleValue = (int) (rational2.doubleValue() * dDoubleValue * ((double) baseBitrate));
        if (Logger.isDebugEnabled("AudioConfigUtil")) {
            StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("Base Bitrate(", baseBitrate, actualChannelCount, "bps) * Channel Count Ratio(", " / ");
            t61.a.x(sbW, baseChannelCount, ") * Sample Rate Ratio(", actualSampleRate, " / ");
            sbW.append(baseSampleRate);
            sbW.append(") = ");
            sbW.append(iDoubleValue);
            string = sbW.toString();
        } else {
            string = "";
        }
        Logger.d("AudioConfigUtil", string);
        return iDoubleValue;
    }

    public final int selectSampleRateOrNearestSupported(int channelCount, int sourceFormat, int initialTargetSampleRate) {
        ArrayList arrayList = null;
        int i = 0;
        int iIntValue = initialTargetSampleRate;
        while (!AudioSource.isSettingsSupported(iIntValue, channelCount, sourceFormat)) {
            StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("Sample rate ", iIntValue, channelCount, " Hz is not supported by audio source with channel count ", " and source format ");
            sbW.append(sourceFormat);
            Logger.d("AudioConfigUtil", sbW.toString());
            if (arrayList == null) {
                Logger.d("AudioConfigUtil", "Trying common sample rates in proximity order to target " + initialTargetSampleRate + " Hz");
                arrayList = new ArrayList(AudioSettings.COMMON_SAMPLE_RATES);
                z.w(arrayList, new afa.a(new f(initialTargetSampleRate, 1), 8));
            }
            if (i >= arrayList.size()) {
                Logger.d("AudioConfigUtil", "No sample rate found or supported by audio source. Falling back to default sample rate of 44100 Hz");
                return MicAvailabilityHelper.SAMPLE_RATE_HZ;
            }
            iIntValue = ((Number) arrayList.get(i)).intValue();
            i++;
        }
        return iIntValue;
    }
}
