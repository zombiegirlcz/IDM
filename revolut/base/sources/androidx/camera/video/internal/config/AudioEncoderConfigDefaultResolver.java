package androidx.camera.video.internal.config;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.core.util.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/camera/video/internal/config/AudioEncoderConfigDefaultResolver;", "Landroidx/core/util/Supplier;", "Landroidx/camera/video/internal/encoder/AudioEncoderConfig;", "mimeType", "", "audioProfile", "", "inputTimeBase", "Landroidx/camera/core/impl/Timebase;", "audioSpec", "Landroidx/camera/video/AudioSpec;", "audioSettings", "Landroidx/camera/video/internal/audio/AudioSettings;", "<init>", "(Ljava/lang/String;ILandroidx/camera/core/impl/Timebase;Landroidx/camera/video/AudioSpec;Landroidx/camera/video/internal/audio/AudioSettings;)V", "get", "Companion", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioEncoderConfigDefaultResolver implements Supplier<AudioEncoderConfig> {
    private final int audioProfile;

    @NotNull
    private final AudioSettings audioSettings;

    @NotNull
    private final AudioSpec audioSpec;

    @NotNull
    private final Timebase inputTimeBase;

    @NotNull
    private final String mimeType;

    public AudioEncoderConfigDefaultResolver(@NotNull String mimeType, int i, @NotNull Timebase inputTimeBase, @NotNull AudioSpec audioSpec, @NotNull AudioSettings audioSettings) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(inputTimeBase, "inputTimeBase");
        Intrinsics.checkNotNullParameter(audioSpec, "audioSpec");
        Intrinsics.checkNotNullParameter(audioSettings, "audioSettings");
        this.mimeType = mimeType;
        this.audioProfile = i;
        this.inputTimeBase = inputTimeBase;
        this.audioSpec = audioSpec;
        this.audioSettings = audioSettings;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    @NotNull
    public AudioEncoderConfig get() {
        int bitrate = this.audioSpec.getBitrate();
        if (bitrate == 0) {
            Logger.d("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
            bitrate = AudioConfigUtil.INSTANCE.scaleBitrate(156000, this.audioSettings.getChannelCount(), 2, this.audioSettings.getEncodeSampleRate(), 48000);
        }
        AudioEncoderConfig audioEncoderConfigBuild = AudioEncoderConfig.builder().setMimeType(this.mimeType).setProfile(this.audioProfile).setInputTimebase(this.inputTimeBase).setChannelCount(this.audioSettings.getChannelCount()).setCaptureSampleRate(this.audioSettings.getCaptureSampleRate()).setEncodeSampleRate(this.audioSettings.getEncodeSampleRate()).setBitrate(bitrate).build();
        Intrinsics.checkNotNullExpressionValue(audioEncoderConfigBuild, "build(...)");
        return audioEncoderConfigBuild;
    }
}
