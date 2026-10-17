package androidx.camera.video.internal.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
public interface AudioStream {

    public interface AudioStreamCallback {
        void onSilenceStateChanged(boolean z);
    }

    public static class AudioStreamException extends Exception {
        public AudioStreamException(String str) {
            super(str);
        }

        public AudioStreamException(Throwable th10) {
            super(th10);
        }
    }

    public static abstract class PacketInfo {
        public static PacketInfo of(int i, long j2) {
            return new AutoValue_AudioStream_PacketInfo(i, j2);
        }

        public abstract int getSizeInBytes();

        public abstract long getTimestampNs();
    }

    PacketInfo read(ByteBuffer byteBuffer);

    void release();

    void setCallback(AudioStreamCallback audioStreamCallback, Executor executor);

    void start() throws IllegalStateException, AudioStreamException;

    void stop() throws IllegalStateException;
}
