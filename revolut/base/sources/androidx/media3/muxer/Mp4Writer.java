package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import com.google.common.base.Preconditions;
import com.google.common.collect.Range;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes15.dex */
final class Mp4Writer {
    private final AnnexBToAvccConverter annexBToAvccConverter;
    private final List<Track> auxiliaryTracks;
    private boolean canWriteMoovAtStart;
    private final int freeSpaceAfterFtypInBytes;
    private final AtomicBoolean hasWrittenSamples;
    private Range<Long> lastMoovWritten;
    private long lastMoovWrittenAtSampleTimestampUs;
    private final int lastSampleDurationBehavior;
    private final LinearByteBufferAllocator linearByteBufferAllocator;
    private long mdatDataEnd;
    private long mdatEnd;
    private long mdatStart;
    private final MetadataCollector metadataCollector;
    private final SeekableMuxerOutput muxerOutput;
    private long reservedMoovSpaceEnd;
    private long reservedMoovSpaceStart;
    private final boolean sampleBatchingEnabled;
    private final boolean sampleCopyEnabled;
    private final List<Track> tracks;

    public Mp4Writer(SeekableMuxerOutput seekableMuxerOutput, MetadataCollector metadataCollector, AnnexBToAvccConverter annexBToAvccConverter, int i, boolean z, boolean z3, boolean z4, int i2) {
        this.muxerOutput = seekableMuxerOutput;
        this.metadataCollector = metadataCollector;
        this.annexBToAvccConverter = annexBToAvccConverter;
        this.lastSampleDurationBehavior = i;
        this.sampleCopyEnabled = z;
        this.sampleBatchingEnabled = z3;
        this.freeSpaceAfterFtypInBytes = i2 <= 0 ? z4 ? 400000 : 0 : i2;
        this.tracks = new ArrayList();
        this.auxiliaryTracks = new ArrayList();
        this.hasWrittenSamples = new AtomicBoolean(false);
        this.canWriteMoovAtStart = z4;
        this.lastMoovWritten = Range.closed(0L, 0L);
        this.lastMoovWrittenAtSampleTimestampUs = 0L;
        this.linearByteBufferAllocator = new LinearByteBufferAllocator(0);
    }

    private ByteBuffer assembleCurrentMoovData() {
        return Boxes.moov(this.tracks, this.metadataCollector, false, this.lastSampleDurationBehavior);
    }

    private void doInterleave() throws IOException {
        boolean zMaybeWritePendingTrackSamples = maybeWritePendingTrackSamples(this.tracks);
        maybeWritePendingTrackSamples(this.auxiliaryTracks);
        if (zMaybeWritePendingTrackSamples && this.canWriteMoovAtStart) {
            maybeWriteMoovAtStart();
        }
    }

    private ByteBuffer getAxteBox() {
        ByteBuffer byteBufferFtyp = Boxes.ftyp();
        MetadataCollector metadataCollector = new MetadataCollector();
        MuxerUtil.populateAuxiliaryTracksMetadata(metadataCollector, this.metadataCollector.timestampData, true, this.auxiliaryTracks);
        return BoxUtils.concatenateBuffers(Boxes.getAxteBoxHeader(r1.remaining() + byteBufferFtyp.remaining()), byteBufferFtyp, Boxes.moov(this.auxiliaryTracks, metadataCollector, false, this.lastSampleDurationBehavior));
    }

    private long getMdatExtensionAmount(long j2) {
        return Math.min(1000000000L, Math.max(500000L, (long) (j2 * 0.2f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$addTrack$0(Track track, Track track2) {
        return Integer.compare(track.sortKey, track2.sortKey);
    }

    private void maybeExtendMdatAndRewriteMoov(long j2) throws IOException {
        if (this.canWriteMoovAtStart) {
            return;
        }
        long j3 = this.mdatDataEnd;
        if (j3 + j2 >= this.mdatEnd) {
            rewriteMoovWithMdatEmptySpace(getMdatExtensionAmount(j3) + j2);
        }
    }

    private void maybeWriteMoovAtStart() throws IOException {
        ByteBuffer byteBufferAssembleCurrentMoovData = assembleCurrentMoovData();
        int iRemaining = byteBufferAssembleCurrentMoovData.remaining();
        long jRemaining = byteBufferAssembleCurrentMoovData.remaining() + 8;
        long j2 = this.reservedMoovSpaceEnd;
        long j3 = this.reservedMoovSpaceStart;
        if (jRemaining <= j2 - j3) {
            this.muxerOutput.setPosition(j3);
            this.muxerOutput.write(byteBufferAssembleCurrentMoovData);
            this.muxerOutput.write(BoxUtils.wrapIntoBox("free", ByteBuffer.allocate((int) ((this.reservedMoovSpaceEnd - this.muxerOutput.getPosition()) - 8))));
        } else {
            this.canWriteMoovAtStart = false;
            long j5 = this.mdatDataEnd;
            this.mdatEnd = j5;
            this.muxerOutput.setPosition(j5);
            this.muxerOutput.write(byteBufferAssembleCurrentMoovData);
            this.lastMoovWritten = Range.closed(Long.valueOf(this.mdatEnd), Long.valueOf(this.mdatEnd + ((long) iRemaining)));
            ByteBuffer byteBufferWrapIntoBox = BoxUtils.wrapIntoBox("free", ByteBuffer.allocate((int) ((this.reservedMoovSpaceEnd - this.reservedMoovSpaceStart) - 8)));
            this.muxerOutput.setPosition(this.reservedMoovSpaceStart);
            this.muxerOutput.write(byteBufferWrapIntoBox);
        }
        updateMdatSize(this.mdatDataEnd - this.mdatStart);
    }

    private boolean maybeWritePendingTrackSamples(List<Track> list) throws IOException {
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            Track track = list.get(i);
            if (track.pendingSamplesBufferInfo.size() > 2) {
                if (((BufferInfo) Preconditions.checkNotNull(track.pendingSamplesBufferInfo.peekLast())).presentationTimeUs - ((BufferInfo) Preconditions.checkNotNull(track.pendingSamplesBufferInfo.peekFirst())).presentationTimeUs > 1000000) {
                    writePendingTrackSamples(track);
                    z = true;
                }
            }
        }
        return z;
    }

    private void rewriteMoovWithMdatEmptySpace(long j2) throws IOException {
        safelyReplaceMoovAtEnd(Math.max(this.mdatEnd + j2, ((Long) this.lastMoovWritten.upperEndpoint()).longValue()), assembleCurrentMoovData());
    }

    private void safelyReplaceMoovAtEnd(long j2, ByteBuffer byteBuffer) throws IOException {
        Preconditions.checkState(j2 >= ((Long) this.lastMoovWritten.upperEndpoint()).longValue());
        Preconditions.checkState(j2 >= this.mdatEnd);
        this.muxerOutput.setPosition(j2);
        this.muxerOutput.write(BoxUtils.wrapIntoBox("free", byteBuffer.duplicate()));
        long j3 = 8 + j2;
        this.mdatEnd = j3;
        updateMdatSize(j3 - this.mdatStart);
        this.lastMoovWritten = Range.closed(Long.valueOf(j2), Long.valueOf(j2 + ((long) byteBuffer.remaining())));
    }

    private void updateMdatSize(long j2) throws IOException {
        this.muxerOutput.setPosition(this.mdatStart + 8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(j2);
        byteBufferAllocate.flip();
        this.muxerOutput.write(byteBufferAllocate);
    }

    private void writeAxteBox() throws IOException {
        MdtaMetadataEntry auxiliaryTracksOffsetMetadata = MuxerUtil.getAuxiliaryTracksOffsetMetadata(0L);
        this.metadataCollector.addMetadata(auxiliaryTracksOffsetMetadata);
        ByteBuffer axteBox = getAxteBox();
        this.metadataCollector.addMetadata(MuxerUtil.getAuxiliaryTracksLengthMetadata(axteBox.remaining()));
        finalizeMoovBox();
        this.metadataCollector.removeMdtaMetadataEntry(auxiliaryTracksOffsetMetadata);
        this.metadataCollector.addMetadata(MuxerUtil.getAuxiliaryTracksOffsetMetadata(this.muxerOutput.getSize()));
        long size = this.muxerOutput.getSize();
        finalizeMoovBox();
        Preconditions.checkState(size == this.muxerOutput.getSize());
        SeekableMuxerOutput seekableMuxerOutput = this.muxerOutput;
        seekableMuxerOutput.setPosition(seekableMuxerOutput.getSize());
        this.muxerOutput.write(axteBox);
    }

    private void writeHeader() throws IOException {
        this.muxerOutput.setPosition(0L);
        this.muxerOutput.write(Boxes.ftyp());
        if (this.freeSpaceAfterFtypInBytes > 0) {
            this.reservedMoovSpaceStart = this.muxerOutput.getPosition();
            this.muxerOutput.write(BoxUtils.wrapIntoBox("free", ByteBuffer.allocate(this.freeSpaceAfterFtypInBytes)));
            this.reservedMoovSpaceEnd = this.muxerOutput.getPosition();
        }
        this.mdatStart = this.muxerOutput.getPosition();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(Util.getUtf8Bytes("mdat"));
        byteBufferAllocate.putLong(16L);
        byteBufferAllocate.flip();
        this.muxerOutput.write(byteBufferAllocate);
        long j2 = this.mdatStart + 16;
        this.mdatDataEnd = j2;
        if (this.canWriteMoovAtStart) {
            j2 = Long.MAX_VALUE;
        }
        this.mdatEnd = j2;
    }

    private void writePendingTrackSamples(Track track) throws IOException {
        Preconditions.checkState(track.pendingSamplesByteBuffer.size() == track.pendingSamplesBufferInfo.size());
        if (track.pendingSamplesBufferInfo.isEmpty()) {
            return;
        }
        if (!this.hasWrittenSamples.getAndSet(true)) {
            writeHeader();
        }
        Iterator<ByteBuffer> it8 = track.pendingSamplesByteBuffer.iterator();
        long jLimit = 0;
        while (it8.hasNext()) {
            jLimit += (long) it8.next().limit();
        }
        maybeExtendMdatAndRewriteMoov(jLimit);
        track.writtenChunkOffsets.add(Long.valueOf(this.mdatDataEnd));
        track.writtenChunkSampleCounts.add(Integer.valueOf(track.pendingSamplesBufferInfo.size()));
        do {
            BufferInfo bufferInfoRemoveFirst = track.pendingSamplesBufferInfo.removeFirst();
            ByteBuffer byteBufferRemoveFirst = track.pendingSamplesByteBuffer.removeFirst();
            if (AnnexBUtils.doesSampleContainAnnexBNalUnits(track.format)) {
                byteBufferRemoveFirst = this.annexBToAvccConverter.process(byteBufferRemoveFirst, this.linearByteBufferAllocator);
                bufferInfoRemoveFirst = new BufferInfo(bufferInfoRemoveFirst.presentationTimeUs, byteBufferRemoveFirst.remaining(), bufferInfoRemoveFirst.flags);
            }
            maybeExtendMdatAndRewriteMoov(byteBufferRemoveFirst.remaining());
            this.muxerOutput.setPosition(this.mdatDataEnd);
            this.mdatDataEnd += (long) this.muxerOutput.write(byteBufferRemoveFirst);
            this.linearByteBufferAllocator.reset();
            track.writtenSamples.add(bufferInfoRemoveFirst);
        } while (!track.pendingSamplesBufferInfo.isEmpty());
        Preconditions.checkState(this.mdatDataEnd <= this.mdatEnd);
    }

    public Track addTrack(int i, int i2, Format format) {
        Track track = new Track(i, format, i2, this.sampleCopyEnabled);
        this.tracks.add(track);
        Collections.sort(this.tracks, new a());
        return track;
    }

    public void finalizeMoovBox() throws IOException {
        if (this.canWriteMoovAtStart) {
            maybeWriteMoovAtStart();
            return;
        }
        ByteBuffer byteBufferAssembleCurrentMoovData = assembleCurrentMoovData();
        int iRemaining = byteBufferAssembleCurrentMoovData.remaining();
        long j2 = iRemaining + 8;
        if (this.mdatEnd - this.mdatDataEnd < j2) {
            safelyReplaceMoovAtEnd(((Long) this.lastMoovWritten.upperEndpoint()).longValue() + j2, byteBufferAssembleCurrentMoovData);
            Preconditions.checkState(this.mdatEnd - this.mdatDataEnd >= j2);
        }
        long j3 = this.mdatDataEnd;
        this.muxerOutput.setPosition(j3);
        this.muxerOutput.write(byteBufferAssembleCurrentMoovData);
        long j5 = ((long) iRemaining) + j3;
        long jLongValue = ((Long) this.lastMoovWritten.upperEndpoint()).longValue() - j5;
        Preconditions.checkState(jLongValue < 2147483647L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt((int) jLongValue);
        byteBufferAllocate.put(Util.getUtf8Bytes("free"));
        byteBufferAllocate.flip();
        this.muxerOutput.write(byteBufferAllocate);
        this.mdatEnd = j3;
        updateMdatSize(j3 - this.mdatStart);
        this.lastMoovWritten = Range.closed(Long.valueOf(j3), Long.valueOf(j3 + ((long) byteBufferAssembleCurrentMoovData.limit())));
        this.muxerOutput.truncate(j5);
    }

    public void finishWritingSamplesAndFinalizeMoovBox() throws IOException {
        for (int i = 0; i < this.tracks.size(); i++) {
            writePendingTrackSamples(this.tracks.get(i));
        }
        for (int i2 = 0; i2 < this.auxiliaryTracks.size(); i2++) {
            writePendingTrackSamples(this.auxiliaryTracks.get(i2));
        }
        if (this.hasWrittenSamples.get()) {
            finalizeMoovBox();
            if (this.auxiliaryTracks.isEmpty()) {
                return;
            }
            writeAxteBox();
        }
    }

    public void writeSampleData(Track track, ByteBuffer byteBuffer, BufferInfo bufferInfo) throws IOException {
        if (Objects.equals(track.format.sampleMimeType, "video/av01") && track.format.initializationData.isEmpty() && track.parsedCsd == null) {
            track.parsedCsd = Av1ConfigUtil.createAv1CodecConfigurationRecord(byteBuffer.duplicate());
        }
        track.writeSampleData(byteBuffer, bufferInfo);
        if (this.sampleBatchingEnabled) {
            doInterleave();
            return;
        }
        writePendingTrackSamples(track);
        boolean zContains = this.tracks.contains(track);
        long j2 = bufferInfo.presentationTimeUs;
        if (zContains && this.canWriteMoovAtStart && j2 - this.lastMoovWrittenAtSampleTimestampUs >= 1000000) {
            maybeWriteMoovAtStart();
            this.lastMoovWrittenAtSampleTimestampUs = j2;
        }
    }
}
