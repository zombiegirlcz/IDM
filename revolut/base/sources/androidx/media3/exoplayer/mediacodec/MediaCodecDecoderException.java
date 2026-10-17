package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;

/* JADX INFO: loaded from: classes15.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final MediaCodecInfo codecInfo;
    public final String diagnosticInfo;
    public final int errorCode;

    public MediaCodecDecoderException(Throwable th10, MediaCodecInfo mediaCodecInfo) {
        StringBuilder sb6 = new StringBuilder("Decoder failed: ");
        sb6.append(mediaCodecInfo == null ? null : mediaCodecInfo.name);
        super(sb6.toString(), th10);
        this.codecInfo = mediaCodecInfo;
        this.diagnosticInfo = th10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th10).getDiagnosticInfo() : null;
        this.errorCode = getErrorCode(th10);
    }

    private static int getErrorCode(Throwable th10) {
        if (th10 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th10).getErrorCode();
        }
        return 0;
    }
}
