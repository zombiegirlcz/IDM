package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ToFloatPcmAudioProcessor extends BaseAudioProcessor {
    private static final int FLOAT_NAN_AS_INT = Float.floatToIntBits(Float.NaN);

    private static void writePcm32BitFloat(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == FLOAT_NAN_AS_INT) {
            iFloatToIntBits = Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i = audioFormat.encoding;
        if (Util.isEncodingHighResolutionPcm(i) || i == 2) {
            return i != 4 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 4) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferReplaceOutputBuffer;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.inputAudioFormat.encoding;
        if (i2 == 2) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i * 2);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 2;
            }
        } else if (i2 == 1342177280) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer((i / 3) * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 3;
            }
        } else if (i2 == 1610612736) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i);
            while (iPosition < iLimit) {
                writePcm32BitFloat((byteBuffer.get(iPosition + 3) & UnsignedBytes.MAX_VALUE) | ((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 4;
            }
        } else if (i2 == 21) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer((i / 3) * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 3;
            }
        } else {
            if (i2 != 22) {
                throw new IllegalStateException();
            }
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i);
            while (iPosition < iLimit) {
                writePcm32BitFloat((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 3) & UnsignedBytes.MAX_VALUE) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }
}
