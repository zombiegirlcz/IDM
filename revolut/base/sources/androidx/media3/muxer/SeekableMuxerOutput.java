package androidx.media3.muxer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes15.dex */
public interface SeekableMuxerOutput extends WritableByteChannel {
    static SeekableMuxerOutput of(FileOutputStream fileOutputStream) {
        return new FileOutputStreamSeekableMuxerOutput(fileOutputStream);
    }

    long getPosition() throws IOException;

    long getSize() throws IOException;

    void setPosition(long j2) throws IOException;

    void truncate(long j2) throws IOException;
}
