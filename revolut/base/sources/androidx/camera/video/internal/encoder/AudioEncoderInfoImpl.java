package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/camera/video/internal/encoder/AudioEncoderInfoImpl;", "Landroidx/camera/video/internal/encoder/EncoderInfoImpl;", "", "Landroid/media/MediaCodecInfo;", "codecInfo", "", "mime", "<init>", "(Landroid/media/MediaCodecInfo;Ljava/lang/String;)V", "Landroid/media/MediaCodecInfo$AudioCapabilities;", "audioCapabilities", "Landroid/media/MediaCodecInfo$AudioCapabilities;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioEncoderInfoImpl extends EncoderInfoImpl implements EncoderInfo {

    @NotNull
    private final MediaCodecInfo.AudioCapabilities audioCapabilities;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioEncoderInfoImpl(@NotNull MediaCodecInfo codecInfo, @NotNull String mime) throws InvalidConfigException {
        super(codecInfo, mime);
        Intrinsics.checkNotNullParameter(codecInfo, "codecInfo");
        Intrinsics.checkNotNullParameter(mime, "mime");
        MediaCodecInfo.AudioCapabilities audioCapabilities = getCodecCapabilities().getAudioCapabilities();
        Intrinsics.h(audioCapabilities);
        this.audioCapabilities = audioCapabilities;
    }
}
