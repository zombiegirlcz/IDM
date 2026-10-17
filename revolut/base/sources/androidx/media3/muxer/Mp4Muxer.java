package androidx.media3.muxer;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Log;
import androidx.media3.container.MdtaMetadataEntry;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class Mp4Muxer implements Muxer {
    private final AnnexBToAvccConverter annexBToAvccConverter;
    private final boolean attemptStreamableOutputEnabled;
    private final List<Track> auxiliaryTracks;
    private MetadataCollector auxiliaryTracksMetadataCollector;
    private Mp4Writer auxiliaryTracksMp4Writer;
    private String cacheFilePath;
    private final Supplier<String> cacheFileSupplier;
    private SeekableMuxerOutput cacheMuxerOutput;
    private final int freeSpaceAfterFtypInBytes;
    private final int lastSampleDurationBehavior;
    private final MetadataCollector metadataCollector;
    private final Mp4Writer mp4Writer;
    private final SeekableMuxerOutput muxerOutput;
    private int nextTrackId;
    private final int outputFileFormat;
    private final boolean sampleBatchingEnabled;
    private final boolean sampleCopyEnabled;
    private final List<Track> trackIdToTrack;
    public static final ImmutableList<String> SUPPORTED_VIDEO_SAMPLE_MIME_TYPES = ImmutableList.of("video/av01", "video/3gpp", "video/avc", "video/hevc", "video/mp4v-es", "video/x-vnd.on2.vp9", "video/apv", "video/dolby-vision");
    public static final ImmutableList<String> SUPPORTED_AUDIO_SAMPLE_MIME_TYPES = ImmutableList.of("audio/mp4a-latm", "audio/3gpp", "audio/amr-wb", "audio/opus", "audio/vorbis", "audio/raw");

    public static final class Builder {
        private AnnexBToAvccConverter annexBToAvccConverter;
        private Supplier<String> cacheFileSupplier;
        private int freeSpaceAfterFtypInBytes;
        private boolean sampleBatchingEnabled;
        private boolean sampleCopyEnabled;
        private final SeekableMuxerOutput seekableMuxerOutput;
        private int lastSampleDurationBehavior = 1;
        private boolean attemptStreamableOutputEnabled = true;
        private int outputFileFormat = 0;

        public Builder(SeekableMuxerOutput seekableMuxerOutput) {
            this.seekableMuxerOutput = seekableMuxerOutput;
        }

        public Mp4Muxer build() {
            if (this.outputFileFormat == 1) {
                Preconditions.checkArgument(false, "Mp4AtFileParameters must be set for FILE_FORMAT_MP4_WITH_AUXILIARY_TRACKS_EXTENSION");
                throw null;
            }
            SeekableMuxerOutput seekableMuxerOutput = this.seekableMuxerOutput;
            Supplier<String> supplier = this.cacheFileSupplier;
            int i = this.lastSampleDurationBehavior;
            AnnexBToAvccConverter annexBToAvccConverter = this.annexBToAvccConverter;
            if (annexBToAvccConverter == null) {
                annexBToAvccConverter = AnnexBToAvccConverter.DEFAULT;
            }
            return new Mp4Muxer(seekableMuxerOutput, supplier, i, annexBToAvccConverter, this.sampleCopyEnabled, this.sampleBatchingEnabled, this.attemptStreamableOutputEnabled, this.outputFileFormat, null, this.freeSpaceAfterFtypInBytes);
        }
    }

    public static final class Mp4AtFileParameters {
    }

    private void appendAuxiliaryTracksDataToTheOutputFile() throws IOException {
        if (this.auxiliaryTracksMp4Writer == null) {
            return;
        }
        SeekableMuxerOutput seekableMuxerOutput = this.muxerOutput;
        seekableMuxerOutput.setPosition(seekableMuxerOutput.getSize());
        FileInputStream fileInputStream = new FileInputStream((String) Preconditions.checkNotNull(this.cacheFilePath));
        try {
            FileChannel channel = fileInputStream.getChannel();
            long size = channel.size();
            this.muxerOutput.write(Boxes.getAxteBoxHeader(size));
            channel.transferTo(0L, size, this.muxerOutput);
            fileInputStream.close();
        } finally {
        }
    }

    private void finishWritingAuxiliaryTracks() throws IOException {
        if (this.auxiliaryTracksMp4Writer == null) {
            return;
        }
        MuxerUtil.populateAuxiliaryTracksMetadata((MetadataCollector) Preconditions.checkNotNull(this.auxiliaryTracksMetadataCollector), this.metadataCollector.timestampData, false, this.auxiliaryTracks);
        ((Mp4Writer) Preconditions.checkNotNull(this.auxiliaryTracksMp4Writer)).finishWritingSamplesAndFinalizeMoovBox();
    }

    private void finishWritingPrimaryVideoTracks() throws IOException {
        MdtaMetadataEntry auxiliaryTracksOffsetMetadata = MuxerUtil.getAuxiliaryTracksOffsetMetadata(0L);
        if (this.auxiliaryTracksMp4Writer != null) {
            this.metadataCollector.addMetadata(MuxerUtil.getAuxiliaryTracksLengthMetadata(((SeekableMuxerOutput) Preconditions.checkNotNull(this.cacheMuxerOutput)).getSize() + 16));
            this.metadataCollector.addMetadata(auxiliaryTracksOffsetMetadata);
        }
        this.mp4Writer.finishWritingSamplesAndFinalizeMoovBox();
        if (this.auxiliaryTracksMp4Writer != null) {
            long size = this.muxerOutput.getSize();
            this.metadataCollector.removeMdtaMetadataEntry(auxiliaryTracksOffsetMetadata);
            this.metadataCollector.addMetadata(MuxerUtil.getAuxiliaryTracksOffsetMetadata(size));
            this.mp4Writer.finalizeMoovBox();
            Preconditions.checkState(this.muxerOutput.getSize() == size, "The auxiliary tracks offset should remain the same");
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(Metadata.Entry entry) {
        Preconditions.checkArgument(MuxerUtil.isMetadataSupported(entry), "Unsupported metadata");
        this.metadataCollector.addMetadata(entry);
    }

    @Override // androidx.media3.muxer.Muxer
    public int addTrack(Format format) throws MuxerException {
        return addTrack(1, format);
    }

    @Override // androidx.media3.muxer.Muxer, java.lang.AutoCloseable
    public void close() throws MuxerException {
        MuxerException muxerException;
        try {
            finishWritingAuxiliaryTracks();
            finishWritingPrimaryVideoTracks();
            appendAuxiliaryTracksDataToTheOutputFile();
            muxerException = null;
        } catch (IOException e) {
            muxerException = new MuxerException("Failed to finish writing data", e);
        }
        try {
            this.muxerOutput.close();
        } catch (IOException e2) {
            if (muxerException == null) {
                muxerException = new MuxerException("Failed to close output stream", e2);
            } else {
                Log.e("Mp4Muxer", "Failed to close output stream", e2);
            }
        }
        SeekableMuxerOutput seekableMuxerOutput = this.cacheMuxerOutput;
        if (seekableMuxerOutput != null) {
            try {
                seekableMuxerOutput.close();
            } catch (IOException e4) {
                if (muxerException == null) {
                    muxerException = new MuxerException("Failed to close the cache file output stream", e4);
                } else {
                    Log.e("Mp4Muxer", "Failed to close cache file output stream", e4);
                }
            }
        }
        if (muxerException != null) {
            throw muxerException;
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(int i, ByteBuffer byteBuffer, BufferInfo bufferInfo) throws MuxerException {
        Preconditions.checkArgument(i < this.trackIdToTrack.size(), "Track id is invalid");
        Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkNotNull(bufferInfo);
        Preconditions.checkArgument(byteBuffer.remaining() == bufferInfo.size);
        Track track = this.trackIdToTrack.get(i);
        try {
            if (this.auxiliaryTracks.contains(track)) {
                ((Mp4Writer) Preconditions.checkNotNull(this.auxiliaryTracksMp4Writer)).writeSampleData(track, byteBuffer, bufferInfo);
            } else {
                this.mp4Writer.writeSampleData(track, byteBuffer, bufferInfo);
            }
        } catch (IOException e) {
            throw new MuxerException("Failed to write sample for presentationTimeUs=" + bufferInfo.presentationTimeUs + ", size=" + bufferInfo.size, e);
        }
    }

    private Mp4Muxer(SeekableMuxerOutput seekableMuxerOutput, Supplier<String> supplier, int i, AnnexBToAvccConverter annexBToAvccConverter, boolean z, boolean z3, boolean z4, int i2, Mp4AtFileParameters mp4AtFileParameters, int i3) {
        this.muxerOutput = seekableMuxerOutput;
        this.cacheFileSupplier = supplier;
        this.lastSampleDurationBehavior = i;
        this.annexBToAvccConverter = annexBToAvccConverter;
        this.sampleCopyEnabled = z3 && z;
        this.sampleBatchingEnabled = z3;
        this.attemptStreamableOutputEnabled = z4;
        this.outputFileFormat = i2;
        this.freeSpaceAfterFtypInBytes = i3;
        MetadataCollector metadataCollector = new MetadataCollector();
        this.metadataCollector = metadataCollector;
        this.mp4Writer = new Mp4Writer(seekableMuxerOutput, metadataCollector, annexBToAvccConverter, i, z, z3, z4, i3);
        this.trackIdToTrack = new ArrayList();
        this.auxiliaryTracks = new ArrayList();
    }

    public int addTrack(int i, Format format) throws MuxerException {
        if (this.outputFileFormat == 1 && MuxerUtil.isAuxiliaryTrack(format)) {
            Preconditions.checkNotNull(null).getClass();
            throw new ClassCastException();
        }
        Mp4Writer mp4Writer = this.mp4Writer;
        int i2 = this.nextTrackId;
        this.nextTrackId = i2 + 1;
        Track trackAddTrack = mp4Writer.addTrack(i2, i, format);
        this.trackIdToTrack.add(trackAddTrack);
        return trackAddTrack.f7646id;
    }
}
