package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/camera/video/internal/encoder/EncoderInfoImpl;", "Landroidx/camera/video/internal/encoder/EncoderInfo;", "Landroid/media/MediaCodecInfo;", "mediaCodecInfo", "", "mime", "<init>", "(Landroid/media/MediaCodecInfo;Ljava/lang/String;)V", "Landroid/media/MediaCodecInfo;", "Landroid/media/MediaCodecInfo$CodecCapabilities;", "codecCapabilities", "Landroid/media/MediaCodecInfo$CodecCapabilities;", "getCodecCapabilities", "()Landroid/media/MediaCodecInfo$CodecCapabilities;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class EncoderInfoImpl implements EncoderInfo {

    @NotNull
    private final MediaCodecInfo.CodecCapabilities codecCapabilities;

    @NotNull
    private final MediaCodecInfo mediaCodecInfo;

    public EncoderInfoImpl(@NotNull MediaCodecInfo mediaCodecInfo, @NotNull String mime) throws InvalidConfigException {
        Intrinsics.checkNotNullParameter(mediaCodecInfo, "mediaCodecInfo");
        Intrinsics.checkNotNullParameter(mime, "mime");
        this.mediaCodecInfo = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(mime);
            Intrinsics.checkNotNullExpressionValue(capabilitiesForType, "getCapabilitiesForType(...)");
            this.codecCapabilities = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(j6.a.q("Unable to get CodecCapabilities for mime: ", mime), e);
        }
    }

    @NotNull
    public final MediaCodecInfo.CodecCapabilities getCodecCapabilities() {
        return this.codecCapabilities;
    }
}
