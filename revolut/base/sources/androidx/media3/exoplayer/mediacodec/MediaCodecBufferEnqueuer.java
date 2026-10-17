package androidx.media3.exoplayer.mediacodec;

import android.os.Bundle;
import androidx.media3.decoder.CryptoInfo;

/* JADX INFO: loaded from: classes.dex */
interface MediaCodecBufferEnqueuer {
    void flush();

    void maybeThrowException();

    void queueInputBuffer(int i, int i2, int i3, long j2, int i5);

    void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j2, int i3);

    void setParameters(Bundle bundle);

    void shutdown();

    void start();
}
