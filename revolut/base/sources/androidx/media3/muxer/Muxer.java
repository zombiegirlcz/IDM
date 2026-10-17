package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes15.dex */
public interface Muxer extends AutoCloseable {
    void addMetadataEntry(Metadata.Entry entry);

    int addTrack(Format format) throws MuxerException;

    @Override // java.lang.AutoCloseable
    void close() throws MuxerException;

    void writeSampleData(int i, ByteBuffer byteBuffer, BufferInfo bufferInfo) throws MuxerException;
}
