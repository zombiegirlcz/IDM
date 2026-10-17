package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.Format;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseMediaChunk extends MediaChunk {
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;
    private int[] firstSampleIndices;
    private BaseMediaChunkOutput output;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj2, long j2, long j3, long j5, long j16, long j22) {
        super(dataSource, dataSpec, format, i, obj2, j2, j3, j22);
        this.clippedStartTimeUs = j5;
        this.clippedEndTimeUs = j16;
    }

    public final int getFirstSampleIndex(int i) {
        return ((int[]) Preconditions.checkNotNull(this.firstSampleIndices))[i];
    }

    public final BaseMediaChunkOutput getOutput() {
        return (BaseMediaChunkOutput) Preconditions.checkNotNull(this.output);
    }

    public void init(BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }
}
