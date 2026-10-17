package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
final class Track {
    public final Format format;
    public boolean hadKeyframe;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final int f7646id;
    public byte[] parsedCsd;
    private final boolean sampleCopyEnabled;
    public final int sortKey;
    public final List<BufferInfo> writtenSamples = new ArrayList();
    public final List<Long> writtenChunkOffsets = new ArrayList();
    public final List<Integer> writtenChunkSampleCounts = new ArrayList();
    public final Deque<BufferInfo> pendingSamplesBufferInfo = new ArrayDeque();
    public final Deque<ByteBuffer> pendingSamplesByteBuffer = new ArrayDeque();
    public long endOfStreamTimestampUs = -9223372036854775807L;

    public Track(int i, Format format, int i2, boolean z) {
        this.f7646id = i;
        this.format = format;
        this.sortKey = i2;
        this.sampleCopyEnabled = z;
    }

    public int videoUnitTimebase() {
        if (MimeTypes.isAudio(this.format.sampleMimeType)) {
            return this.format.sampleRate;
        }
        return 90000;
    }

    public void writeSampleData(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        Preconditions.checkArgument(this.endOfStreamTimestampUs == -9223372036854775807L, "Samples can not be written after writing a sample with MediaCodec.BUFFER_FLAG_END_OF_STREAM flag");
        if (bufferInfo.size == 0 || byteBuffer.remaining() == 0) {
            if ((bufferInfo.flags & 4) != 0) {
                this.endOfStreamTimestampUs = bufferInfo.presentationTimeUs;
                return;
            }
            return;
        }
        if ((bufferInfo.flags & 1) > 0) {
            this.hadKeyframe = true;
        }
        if (this.hadKeyframe || !MimeTypes.isVideo(this.format.sampleMimeType)) {
            if (this.sampleCopyEnabled) {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
                byteBufferAllocateDirect.put(byteBuffer);
                byteBufferAllocateDirect.rewind();
                byteBuffer = byteBufferAllocateDirect;
            }
            this.pendingSamplesBufferInfo.addLast(new BufferInfo(bufferInfo.presentationTimeUs, byteBuffer.remaining(), bufferInfo.flags));
            this.pendingSamplesByteBuffer.addLast(byteBuffer);
        }
    }
}
