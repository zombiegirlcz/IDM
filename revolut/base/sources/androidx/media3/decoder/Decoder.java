package androidx.media3.decoder;

import androidx.media3.decoder.DecoderException;

/* JADX INFO: loaded from: classes15.dex */
public interface Decoder<I, O, E extends DecoderException> {
    I dequeueInputBuffer() throws DecoderException;

    O dequeueOutputBuffer() throws DecoderException;

    void flush();

    void queueInputBuffer(I i) throws DecoderException;

    void release();

    void setOutputStartTimeUs(long j2);
}
