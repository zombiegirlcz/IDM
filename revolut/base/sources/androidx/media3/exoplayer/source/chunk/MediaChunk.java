package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.Format;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MediaChunk extends Chunk {
    public final long chunkIndex;

    public MediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj2, long j2, long j3, long j5) {
        super(dataSource, dataSpec, 1, format, i, obj2, j2, j3);
        Preconditions.checkNotNull(format);
        this.chunkIndex = j5;
    }

    public long getNextChunkIndex() {
        long j2 = this.chunkIndex;
        if (j2 != -1) {
            return j2 + 1;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}
