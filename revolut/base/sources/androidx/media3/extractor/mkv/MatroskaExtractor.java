package androidx.media3.extractor.mkv;

import a5.b;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ChunkIndexProvider;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.metadata.ThumbnailMetadata;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.BERTags;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes.dex */
public class MatroskaExtractor implements Extractor {
    private static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private long blockGroupDiscardPaddingNs;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;
    private long cuesContentPosition;
    private long currentCueClusterPosition;
    private long currentCueRelativePosition;
    private long currentCueTimeUs;
    private int currentCueTrackNumber;
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private boolean inCuesElement;
    private boolean isWebm;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final boolean parseSubtitlesDuringExtraction;
    private boolean pendingEndTracks;
    private final SparseArray<List<MatroskaSeekMap.CuePointData>> perTrackCues;
    private int primarySeekTrackNumber;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final ParsableByteArray subtitleSample;
    private final ParsableByteArray supplementalData;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new b(4);
    private static final byte[] SUBRIP_PREFIX = {Constants.INQUIRY, 10, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, ISO7816.INS_UNBLOCK_CHV, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 32, 45, 45, 62, 32, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, ISO7816.INS_UNBLOCK_CHV, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {ISO7816.INS_REHABILITATE_CHV, 105, 97, 108, ISOFileInfo.FCI_BYTE, 103, 117, 101, 58, 32, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, ISO7816.INS_UNBLOCK_CHV, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, ISO7816.INS_UNBLOCK_CHV};
    private static final byte[] VTT_PREFIX = {87, 69, CVCAFile.CAR_TAG, 86, 84, 84, 10, 10, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 46, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 32, 45, 45, 62, 32, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 58, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 46, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, ISO7816.INS_DECREASE, 10};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    public final class InnerEbmlProcessor implements EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException {
            MatroskaExtractor.this.binaryElement(i, i2, extractorInput);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void floatElement(int i, double d) throws ParserException {
            MatroskaExtractor.this.floatElement(i, d);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public int getElementType(int i) {
            return MatroskaExtractor.this.getElementType(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void integerElement(int i, long j2) throws ParserException {
            MatroskaExtractor.this.integerElement(i, j2);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i) {
            return MatroskaExtractor.this.isLevel1Element(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i, long j2, long j3) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i, j2, j3);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void stringElement(int i, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i, str);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class MatroskaSeekMap implements SeekMap, ChunkIndexProvider {
        private final ChunkIndex chunkIndex;
        private final long durationUs;
        private final SparseArray<List<CuePointData>> perTrackCues;
        private final int primarySeekTrackNumber;

        public static final class CuePointData implements Comparable<CuePointData> {
            private final long clusterPosition;
            private final long relativePosition;
            private final long timeUs;

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CuePointData)) {
                    return false;
                }
                CuePointData cuePointData = (CuePointData) obj2;
                return this.timeUs == cuePointData.timeUs && this.clusterPosition == cuePointData.clusterPosition && this.relativePosition == cuePointData.relativePosition;
            }

            public int hashCode() {
                return Objects.hash(Long.valueOf(this.timeUs), Long.valueOf(this.clusterPosition), Long.valueOf(this.relativePosition));
            }

            private CuePointData(long j2, long j3, long j5) {
                this.timeUs = j2;
                this.clusterPosition = j3;
                this.relativePosition = j5;
            }

            @Override // java.lang.Comparable
            public int compareTo(CuePointData cuePointData) {
                return Long.compare(this.timeUs, cuePointData.timeUs);
            }
        }

        public MatroskaSeekMap(SparseArray<List<CuePointData>> sparseArray, long j2, int i, long j3, long j5) {
            this.perTrackCues = sparseArray;
            this.durationUs = j2;
            this.primarySeekTrackNumber = i;
            this.chunkIndex = buildChunkIndex(sparseArray, j2, i, j3, j5);
        }

        private static ChunkIndex buildChunkIndex(SparseArray<List<CuePointData>> sparseArray, long j2, int i, long j3, long j5) {
            int i2;
            List<CuePointData> list = sparseArray.get(i);
            if (list == null || list.isEmpty()) {
                return null;
            }
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i3 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                CuePointData cuePointData = list.get(i5);
                jArrCopyOf3[i5] = cuePointData.timeUs;
                jArrCopyOf[i5] = cuePointData.clusterPosition;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i6 = i3 + 1;
                iArrCopyOf[i3] = (int) (jArrCopyOf[i6] - jArrCopyOf[i3]);
                jArrCopyOf2[i3] = jArrCopyOf3[i6] - jArrCopyOf3[i3];
                i3 = i6;
            }
            int i21 = i2;
            while (i21 > 0 && jArrCopyOf3[i21] >= j2) {
                i21--;
            }
            iArrCopyOf[i21] = (int) ((j3 + j5) - jArrCopyOf[i21]);
            jArrCopyOf2[i21] = j2 - jArrCopyOf3[i21];
            if (i21 < i2) {
                Log.w("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i22 = i21 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i22);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i22);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i22);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i22);
            }
            return new ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }

        @Override // androidx.media3.extractor.ChunkIndexProvider
        public ChunkIndex getChunkIndex() {
            return this.chunkIndex;
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j2) {
            ChunkIndex chunkIndex = this.chunkIndex;
            return chunkIndex != null ? chunkIndex.getSeekPoints(j2) : new SeekMap.SeekPoints(SeekPoint.START);
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return isSeekable(this.primarySeekTrackNumber);
        }

        public boolean isSeekable(int i) {
            List<CuePointData> list = this.perTrackCues.get(i);
            return (list == null || list.isEmpty()) ? false : true;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Track {
        private int blockAddIdType;
        public String codecId;
        public byte[] codecPrivate;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagForced;
        public Format format;
        public boolean hasContentEncryption;
        public boolean isWebm;
        public int maxBlockAdditionId;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public byte[] sampleStrippedBytes;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public int width = -1;
        public int height = -1;
        public int bitsPerChannel = -1;
        public int displayWidth = -1;
        public int displayHeight = -1;
        public int displayUnit = 0;
        public int projectionType = -1;
        public float projectionPoseYaw = BitmapDescriptorFactory.HUE_RED;
        public float projectionPosePitch = BitmapDescriptorFactory.HUE_RED;
        public float projectionPoseRoll = BitmapDescriptorFactory.HUE_RED;
        public byte[] projectionData = null;
        public int stereoMode = -1;
        public boolean hasColorInfo = false;
        public int colorSpace = -1;
        public int colorTransfer = -1;
        public int colorRange = -1;
        public int maxContentLuminance = 1000;
        public int maxFrameAverageLuminance = 200;
        public float primaryRChromaticityX = -1.0f;
        public float primaryRChromaticityY = -1.0f;
        public float primaryGChromaticityX = -1.0f;
        public float primaryGChromaticityY = -1.0f;
        public float primaryBChromaticityX = -1.0f;
        public float primaryBChromaticityY = -1.0f;
        public float whitePointChromaticityX = -1.0f;
        public float whitePointChromaticityY = -1.0f;
        public float maxMasteringLuminance = -1.0f;
        public float minMasteringLuminance = -1.0f;
        public int channelCount = 1;
        public int audioBitDepth = -1;
        public int sampleRate = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
        public long codecDelayNs = 0;
        public long seekPreRollNs = 0;
        public boolean waitingForDtsAnalysis = false;
        public boolean flagDefault = true;
        private String language = "eng";

        /* JADX INFO: Access modifiers changed from: private */
        public void assertOutputInitialized() {
            Preconditions.checkNotNull(this.output);
        }

        private static long findBestThumbnailPresentationTimeUs(List<MatroskaSeekMap.CuePointData> list, long j2, long j3, long j5) {
            long j16;
            long j22;
            if (list.isEmpty()) {
                return -9223372036854775807L;
            }
            int iMin = Math.min(list.size(), 20);
            double d = 0.0d;
            int i = -1;
            for (int i2 = 0; i2 < iMin; i2++) {
                MatroskaSeekMap.CuePointData cuePointData = list.get(i2);
                if (cuePointData.timeUs > 10000000) {
                    break;
                }
                if (i2 < list.size() - 1) {
                    MatroskaSeekMap.CuePointData cuePointData2 = list.get(i2 + 1);
                    j16 = (cuePointData2.clusterPosition + cuePointData2.relativePosition) - (cuePointData.clusterPosition + cuePointData.relativePosition);
                    j22 = cuePointData2.timeUs - cuePointData.timeUs;
                } else {
                    j16 = (j3 + j5) - (cuePointData.clusterPosition + cuePointData.relativePosition);
                    j22 = j2 - cuePointData.timeUs;
                }
                if (j22 > 0) {
                    double d5 = j16 / j22;
                    if (d5 > d) {
                        i = i2;
                        d = d5;
                    }
                }
            }
            if (i == -1) {
                return -9223372036854775807L;
            }
            return list.get(i).timeUs;
        }

        private byte[] getCodecPrivate(String str) throws ParserException {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.maxMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) (this.minMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) this.maxContentLuminance);
            byteBufferOrder.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void maybeAddThumbnailMetadata(SparseArray<List<MatroskaSeekMap.CuePointData>> sparseArray, long j2, long j3, long j5) {
            List<MatroskaSeekMap.CuePointData> list;
            if (this.type != 2 || (list = sparseArray.get(this.number)) == null || list.isEmpty()) {
                return;
            }
            long jFindBestThumbnailPresentationTimeUs = findBestThumbnailPresentationTimeUs(list, j2, j3, j5);
            if (jFindBestThumbnailPresentationTimeUs != -9223372036854775807L) {
                Metadata metadata = ((Format) Preconditions.checkNotNull(this.format)).metadata;
                ThumbnailMetadata thumbnailMetadata = new ThumbnailMetadata(jFindBestThumbnailPresentationTimeUs);
                this.format = this.format.buildUpon().setMetadata(metadata == null ? new Metadata(thumbnailMetadata) : metadata.copyWithAppendedEntries(thumbnailMetadata)).build();
            }
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (littleEndianUnsignedInt != 826496599) {
                    Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] data = parsableByteArray.getData();
                for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                    if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort == 65534) {
                    parsableByteArray.setPosition(24);
                    if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits()) {
                        if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i3 = 0;
                int i5 = 1;
                while (true) {
                    i = bArr[i5];
                    if ((i & 255) != 255) {
                        break;
                    }
                    i3 += 255;
                    i5++;
                }
                int i6 = i5 + 1;
                int i21 = i3 + (i & 255);
                int i22 = 0;
                while (true) {
                    i2 = bArr[i6];
                    if ((i2 & 255) != 255) {
                        break;
                    }
                    i22 += 255;
                    i6++;
                }
                int i32 = i6 + 1;
                int i33 = i22 + (i2 & 255);
                if (bArr[i32] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i21];
                System.arraycopy(bArr, i32, bArr2, 0, i21);
                int i43 = i32 + i21;
                if (bArr[i43] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i59 = i43 + i33;
                if (bArr[i59] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i59];
                System.arraycopy(bArr, i59, bArr3, 0, bArr.length - i59);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z) {
            return "A_OPUS".equals(this.codecId) ? z : this.maxBlockAdditionId > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:221:0x043a  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x0454  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x0457  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0466  */
        /* JADX WARN: Removed duplicated region for block: B:231:0x0477  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x054e  */
        /* JADX WARN: Removed duplicated region for block: B:298:0x05a3  */
        /* JADX WARN: Removed duplicated region for block: B:303:0x05be  */
        /* JADX WARN: Removed duplicated region for block: B:304:0x05c2  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void initializeFormat(int r21) throws androidx.media3.common.ParserException {
            /*
                Method dump skipped, instruction units count: 1730
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.Track.initializeFormat(int):void");
        }

        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        a.A(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        a.A(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(map);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory, int i) {
        this(new DefaultEbmlReader(), i, factory);
    }

    private void assertInCues(int i) throws ParserException {
        if (this.inCuesElement) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i + " must be in a Cues", null);
    }

    private void assertInTrackEntry(int i) throws ParserException {
        if (this.currentTrack != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i + " must be in a TrackEntry", null);
    }

    private void assertInitialized() {
        Preconditions.checkNotNull(this.extractorOutput);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void commitSampleToOutput(androidx.media3.extractor.mkv.MatroskaExtractor.Track r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.commitSampleToOutput(androidx.media3.extractor.mkv.MatroskaExtractor$Track, long, int, int, int):void");
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    private int finishWriteSampleData() {
        int i = this.sampleBytesWritten;
        resetWriteSampleData();
        return i;
    }

    private static byte[] formatSubtitleTimecode(long j2, String str, long j3) {
        Preconditions.checkArgument(j2 != -9223372036854775807L);
        int i = (int) (j2 / 3600000000L);
        long j5 = j2 - (((long) i) * 3600000000L);
        int i2 = (int) (j5 / 60000000);
        long j16 = j5 - (((long) i2) * 60000000);
        int i3 = (int) (j16 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j16 - (((long) i3) * 1000000)) / j3))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean isCodecSupported(String str) {
        str.getClass();
        byte b4 = -1;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    b4 = 0;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    b4 = 1;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    b4 = 2;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    b4 = 3;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    b4 = 4;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    b4 = 5;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    b4 = 6;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    b4 = 7;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    b4 = 8;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    b4 = 9;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    b4 = 10;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    b4 = 11;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    b4 = 12;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    b4 = 13;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    b4 = 14;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    b4 = 15;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    b4 = 16;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    b4 = 17;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    b4 = 18;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    b4 = 19;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    b4 = Ascii.DC4;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    b4 = Ascii.NAK;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    b4 = Ascii.SYN;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    b4 = Ascii.ETB;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    b4 = Ascii.CAN;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    b4 = Ascii.EM;
                }
                break;
            case 738614379:
                if (str.equals("S_TEXT/SSA")) {
                    b4 = Ascii.SUB;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    b4 = Ascii.ESC;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    b4 = 28;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    b4 = 29;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    b4 = 30;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    b4 = Ascii.US;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    b4 = 32;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    b4 = Constants.NFC_READER;
                }
                break;
        }
        switch (b4) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$1() {
        return new Extractor[]{new MatroskaExtractor(SubtitleParser.Factory.UNSUPPORTED, 2)};
    }

    private void maybeEndTracks() {
        if (this.pendingEndTracks) {
            for (int i = 0; i < this.tracks.size(); i++) {
                if (this.tracks.valueAt(i).waitingForDtsAnalysis) {
                    return;
                }
            }
            ((ExtractorOutput) Preconditions.checkNotNull(this.extractorOutput)).endTracks();
            this.pendingEndTracks = false;
        }
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j2) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j2;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j3 = this.seekPositionAfterBuildingCues;
            if (j3 != -1) {
                positionHolder.position = j3;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    private void readScratch(ExtractorInput extractorInput, int i) throws IOException {
        if (this.scratch.limit() >= i) {
            return;
        }
        if (this.scratch.capacity() < i) {
            ParsableByteArray parsableByteArray = this.scratch;
            parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i));
        }
        extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i - this.scratch.limit());
        this.scratch.setLimit(i);
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private long scaleTimecodeToUs(long j2) throws ParserException {
        long j3 = this.timecodeScale;
        if (j3 != -9223372036854775807L) {
            return Util.scaleLargeTimestamp(j2, j3, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void setSubtitleEndTime(String str, long j2, byte[] bArr) {
        byte[] subtitleTimecode;
        int i;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
                subtitleTimecode = formatSubtitleTimecode(j2, "%01d:%02d:%02d:%02d", 10000L);
                i = 21;
                break;
            case "S_TEXT/WEBVTT":
                subtitleTimecode = formatSubtitleTimecode(j2, "%02d:%02d:%02d.%03d", 1000L);
                i = 25;
                break;
            case "S_TEXT/UTF8":
                subtitleTimecode = formatSubtitleTimecode(j2, "%02d:%02d:%02d,%03d", 1000L);
                i = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(subtitleTimecode, 0, bArr, i, subtitleTimecode.length);
    }

    private int writeSampleData(ExtractorInput extractorInput, Track track, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i);
            return finishWriteSampleData();
        }
        if ("S_TEXT/ASS".equals(track.codecId) || "S_TEXT/SSA".equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i);
            return finishWriteSampleData();
        }
        if ("S_TEXT/WEBVTT".equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i);
            return finishWriteSampleData();
        }
        if (track.waitingForDtsAnalysis) {
            Preconditions.checkNotNull(track.format);
            if (DtsUtil.isSampleDtsHd(extractorInput, i)) {
                track.format = track.format.buildUpon().setSampleMimeType("audio/vnd.dts.hd").build();
            }
            track.output.format(track.format);
            track.waitingForDtsAnalysis = false;
            maybeEndTracks();
        }
        TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.getData(), 0, 1);
                    this.sampleBytesRead++;
                    if ((this.scratch.getData()[0] & 128) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.sampleSignalByte = this.scratch.getData()[0];
                    this.sampleSignalByteRead = true;
                }
                byte b4 = this.sampleSignalByte;
                if ((b4 & 1) == 1) {
                    boolean z3 = (b4 & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        this.scratch.getData()[0] = (byte) ((z3 ? 128 : 0) | 8);
                        this.scratch.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (z3) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.getData(), 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i3 = this.samplePartitionCount * 4;
                        this.scratch.reset(i3);
                        extractorInput.readFully(this.scratch.getData(), 0, i3);
                        this.sampleBytesRead += i3;
                        short s2 = (short) ((this.samplePartitionCount / 2) + 1);
                        int i5 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i5);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s2);
                        int i6 = 0;
                        int i21 = 0;
                        while (true) {
                            i2 = this.samplePartitionCount;
                            if (i6 >= i2) {
                                break;
                            }
                            int unsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            if (i6 % 2 == 0) {
                                this.encryptionSubsampleDataBuffer.putShort((short) (unsignedIntToInt - i21));
                            } else {
                                this.encryptionSubsampleDataBuffer.putInt(unsignedIntToInt - i21);
                            }
                            i6++;
                            i21 = unsignedIntToInt;
                        }
                        int i22 = (i - this.sampleBytesRead) - i21;
                        if (i2 % 2 == 1) {
                            this.encryptionSubsampleDataBuffer.putInt(i22);
                        } else {
                            this.encryptionSubsampleDataBuffer.putShort((short) i22);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i5);
                        trackOutput.sampleData(this.encryptionSubsampleData, i5, 1);
                        this.sampleBytesWritten += i5;
                    }
                }
            } else {
                byte[] bArr = track.sampleStrippedBytes;
                if (bArr != null) {
                    this.sampleStrippedBytes.reset(bArr, bArr.length);
                }
            }
            if (track.samplesHaveSupplementalData(z)) {
                this.blockFlags |= 268435456;
                this.supplementalData.reset(0);
                int iLimit = (this.sampleStrippedBytes.limit() + i) - this.sampleBytesRead;
                this.scratch.reset(4);
                this.scratch.getData()[0] = (byte) ((iLimit >> 24) & 255);
                this.scratch.getData()[1] = (byte) ((iLimit >> 16) & 255);
                this.scratch.getData()[2] = (byte) ((iLimit >> 8) & 255);
                this.scratch.getData()[3] = (byte) (iLimit & 255);
                trackOutput.sampleData(this.scratch, 4, 2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int iLimit2 = this.sampleStrippedBytes.limit() + i;
        if (!"V_MPEG4/ISO/AVC".equals(track.codecId) && !"V_MPEGH/ISO/HEVC".equals(track.codecId)) {
            if (track.trueHdSampleRechunker != null) {
                Preconditions.checkState(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i32 = this.sampleBytesRead;
                if (i32 >= iLimit2) {
                    break;
                }
                int iWriteToOutput = writeToOutput(extractorInput, trackOutput, iLimit2 - i32);
                this.sampleBytesRead += iWriteToOutput;
                this.sampleBytesWritten += iWriteToOutput;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i33 = track.nalUnitLengthFieldLength;
            int i43 = 4 - i33;
            while (this.sampleBytesRead < iLimit2) {
                int i59 = this.sampleCurrentNalBytesRemaining;
                if (i59 == 0) {
                    writeToTarget(extractorInput, data, i43, i33);
                    this.sampleBytesRead += i33;
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    int iWriteToOutput2 = writeToOutput(extractorInput, trackOutput, i59);
                    this.sampleBytesRead += iWriteToOutput2;
                    this.sampleBytesWritten += iWriteToOutput2;
                    this.sampleCurrentNalBytesRemaining -= iWriteToOutput2;
                }
            }
        }
        if ("A_VORBIS".equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
        return finishWriteSampleData();
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.reset(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i) throws IOException {
        int iBytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (iBytesLeft <= 0) {
            return trackOutput.sampleData((DataReader) extractorInput, i, false);
        }
        int iMin = Math.min(i, iBytesLeft);
        trackOutput.sampleData(this.sampleStrippedBytes, iMin);
        return iMin;
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws IOException {
        int iMin = Math.min(i2, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i, iMin);
        }
    }

    public void binaryElement(int i, int i2, ExtractorInput extractorInput) throws IOException {
        int i3;
        int i5;
        int i6;
        int i21;
        int i22;
        int i32;
        long j2;
        int i33;
        int i43;
        int i59;
        int i66 = 2;
        int i74 = 0;
        int i92 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.blockState != 2) {
                    return;
                }
                handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput, i2);
                return;
            }
            if (i == 16877) {
                handleBlockAddIDExtraData(getCurrentTrack(i), extractorInput, i2);
                return;
            }
            if (i == 16981) {
                assertInTrackEntry(i);
                byte[] bArr = new byte[i2];
                this.currentTrack.sampleStrippedBytes = bArr;
                extractorInput.readFully(bArr, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr2 = new byte[i2];
                extractorInput.readFully(bArr2, 0, i2);
                getCurrentTrack(i).cryptoData = new TrackOutput.CryptoData(1, bArr2, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(this.seekEntryIdBytes.getData(), (byte) 0);
                extractorInput.readFully(this.seekEntryIdBytes.getData(), 4 - i2, i2);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            }
            if (i == 25506) {
                assertInTrackEntry(i);
                byte[] bArr3 = new byte[i2];
                this.currentTrack.codecPrivate = bArr3;
                extractorInput.readFully(bArr3, 0, i2);
                return;
            }
            if (i != 30322) {
                throw ParserException.createForMalformedContainer("Unexpected id: " + i, null);
            }
            assertInTrackEntry(i);
            byte[] bArr4 = new byte[i2];
            this.currentTrack.projectionData = bArr4;
            extractorInput.readFully(bArr4, 0, i2);
            return;
        }
        int i96 = 8;
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = -9223372036854775807L;
            this.blockState = 1;
            this.scratch.reset(0);
        }
        Track track = this.tracks.get(this.blockTrackNumber);
        if (track == null) {
            extractorInput.skipFully(i2 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        track.assertOutputInitialized();
        if (this.blockState == 1) {
            readScratch(extractorInput, 3);
            int i99 = (this.scratch.getData()[2] & 6) >> 1;
            byte b4 = UnsignedBytes.MAX_VALUE;
            if (i99 == 0) {
                this.blockSampleCount = 1;
                int[] iArrEnsureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                this.blockSampleSizes = iArrEnsureArrayCapacity;
                iArrEnsureArrayCapacity[0] = (i2 - this.blockTrackNumberLength) - 3;
            } else {
                readScratch(extractorInput, 4);
                int i100 = (this.scratch.getData()[3] & UnsignedBytes.MAX_VALUE) + 1;
                this.blockSampleCount = i100;
                int[] iArrEnsureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i100);
                this.blockSampleSizes = iArrEnsureArrayCapacity2;
                if (i99 == 2) {
                    int i101 = (i2 - this.blockTrackNumberLength) - 4;
                    int i102 = this.blockSampleCount;
                    Arrays.fill(iArrEnsureArrayCapacity2, 0, i102, i101 / i102);
                } else {
                    if (i99 != 1) {
                        if (i99 != 3) {
                            throw ParserException.createForMalformedContainer("Unexpected lacing value: " + i99, null);
                        }
                        int i103 = 0;
                        int i104 = 0;
                        int i105 = 4;
                        while (true) {
                            int i106 = this.blockSampleCount;
                            i3 = i74;
                            if (i103 >= i106 - 1) {
                                i5 = i66;
                                i6 = i92;
                                this.blockSampleSizes[i106 - 1] = ((i2 - this.blockTrackNumberLength) - i105) - i104;
                                break;
                            }
                            this.blockSampleSizes[i103] = i3;
                            int i107 = i105 + 1;
                            readScratch(extractorInput, i107);
                            if (this.scratch.getData()[i105] == 0) {
                                throw ParserException.createForMalformedContainer("No valid varint length mask found", null);
                            }
                            int i108 = i3;
                            while (true) {
                                if (i108 >= i96) {
                                    i21 = i66;
                                    i22 = i92;
                                    i32 = i96;
                                    j2 = 0;
                                    break;
                                }
                                i32 = i96;
                                int i109 = i92 << (7 - i108);
                                i21 = i66;
                                if ((this.scratch.getData()[i105] & i109) != 0) {
                                    i107 += i108;
                                    readScratch(extractorInput, i107);
                                    int i110 = i105 + 1;
                                    i22 = i92;
                                    j2 = this.scratch.getData()[i105] & b4 & (~i109);
                                    while (true) {
                                        int i111 = i110;
                                        if (i111 >= i107) {
                                            break;
                                        }
                                        i110 = i111 + 1;
                                        j2 = (j2 << i32) | ((long) (this.scratch.getData()[i111] & b4));
                                        b4 = UnsignedBytes.MAX_VALUE;
                                    }
                                    if (i103 > 0) {
                                        j2 -= (1 << ((i108 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i108++;
                                    i66 = i21;
                                    i96 = i32;
                                    b4 = UnsignedBytes.MAX_VALUE;
                                }
                            }
                            i105 = i107;
                            if (j2 < -2147483648L || j2 > 2147483647L) {
                                break;
                            }
                            int i112 = (int) j2;
                            int[] iArr = this.blockSampleSizes;
                            if (i103 != 0) {
                                i112 += iArr[i103 - 1];
                            }
                            iArr[i103] = i112;
                            i104 += i112;
                            i103++;
                            i74 = i3;
                            i66 = i21;
                            i96 = i32;
                            i92 = i22;
                            b4 = UnsignedBytes.MAX_VALUE;
                        }
                        throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                    }
                    int i113 = 0;
                    int i114 = 0;
                    int i115 = 4;
                    while (true) {
                        i33 = this.blockSampleCount;
                        if (i113 >= i33 - 1) {
                            break;
                        }
                        this.blockSampleSizes[i113] = 0;
                        while (true) {
                            i43 = i115 + 1;
                            readScratch(extractorInput, i43);
                            int i116 = this.scratch.getData()[i115] & UnsignedBytes.MAX_VALUE;
                            int[] iArr2 = this.blockSampleSizes;
                            i59 = iArr2[i113] + i116;
                            iArr2[i113] = i59;
                            if (i116 != 255) {
                                break;
                            } else {
                                i115 = i43;
                            }
                        }
                        i114 += i59;
                        i113++;
                        i115 = i43;
                    }
                    this.blockSampleSizes[i33 - 1] = ((i2 - this.blockTrackNumberLength) - i115) - i114;
                }
            }
            i5 = 2;
            i3 = 0;
            i6 = 1;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[i3] << 8) | (this.scratch.getData()[i6] & UnsignedBytes.MAX_VALUE));
            this.blockFlags = (track.type == i6 || (i == 163 && (this.scratch.getData()[i5] & 128) == 128)) ? 1 : i3;
            this.blockState = i5;
            this.blockSampleIndex = i3;
        }
        if (i == 163) {
            while (true) {
                int i117 = this.blockSampleIndex;
                if (i117 >= this.blockSampleCount) {
                    this.blockState = 0;
                    return;
                }
                int iWriteSampleData = writeSampleData(extractorInput, track, this.blockSampleSizes[i117], false);
                Track track2 = track;
                commitSampleToOutput(track2, this.blockTimeUs + ((long) ((this.blockSampleIndex * track.defaultSampleDurationNs) / 1000)), this.blockFlags, iWriteSampleData, 0);
                this.blockSampleIndex++;
                track = track2;
            }
        } else {
            while (true) {
                int i118 = this.blockSampleIndex;
                if (i118 >= this.blockSampleCount) {
                    return;
                }
                int[] iArr3 = this.blockSampleSizes;
                iArr3[i118] = writeSampleData(extractorInput, track, iArr3[i118], true);
                this.blockSampleIndex++;
            }
        }
    }

    public void endMasterElement(int i) throws ParserException {
        int i2;
        assertInitialized();
        if (i == 160) {
            if (this.blockState != 2) {
                return;
            }
            Track track = this.tracks.get(this.blockTrackNumber);
            track.assertOutputInitialized();
            if (this.blockGroupDiscardPaddingNs > 0 && "A_OPUS".equals(track.codecId)) {
                this.supplementalData.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.blockGroupDiscardPaddingNs).array());
            }
            int i3 = 0;
            for (int i5 = 0; i5 < this.blockSampleCount; i5++) {
                i3 += this.blockSampleSizes[i5];
            }
            int i6 = 0;
            while (i6 < this.blockSampleCount) {
                long j2 = this.blockTimeUs + ((long) ((track.defaultSampleDurationNs * i6) / 1000));
                int i21 = this.blockFlags;
                if (i6 == 0 && !this.blockHasReferenceBlock) {
                    i21 |= 1;
                }
                int i22 = this.blockSampleSizes[i6];
                int i32 = i3 - i22;
                commitSampleToOutput(track, j2, i21, i22, i32);
                i6++;
                i3 = i32;
            }
            this.blockState = 0;
            return;
        }
        if (i == 174) {
            Track track2 = (Track) Preconditions.checkNotNull(this.currentTrack);
            String str = track2.codecId;
            if (str == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (isCodecSupported(str)) {
                track2.initializeFormat(track2.number);
                track2.output = this.extractorOutput.track(track2.number, track2.type);
                this.tracks.put(track2.number, track2);
            }
            this.currentTrack = null;
            return;
        }
        if (i == 183) {
            if (this.sentSeekMap) {
                return;
            }
            assertInCues(i);
            if (this.currentCueTimeUs == -9223372036854775807L || (i2 = this.currentCueTrackNumber) == -1 || this.currentCueClusterPosition == -1) {
                return;
            }
            List<MatroskaSeekMap.CuePointData> arrayList = this.perTrackCues.get(i2);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.perTrackCues.put(this.currentCueTrackNumber, arrayList);
            }
            arrayList.add(new MatroskaSeekMap.CuePointData(this.currentCueTimeUs, this.segmentContentPosition + this.currentCueClusterPosition, this.currentCueRelativePosition));
            return;
        }
        if (i == 19899) {
            int i33 = this.seekEntryId;
            if (i33 != -1) {
                long j3 = this.seekEntryPosition;
                if (j3 != -1) {
                    if (i33 == 475249515) {
                        this.cuesContentPosition = j3;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            assertInTrackEntry(i);
            Track track3 = this.currentTrack;
            if (track3.hasContentEncryption) {
                if (track3.cryptoData == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                track3.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, "video/webm", this.currentTrack.cryptoData.encryptionKey));
                return;
            }
            return;
        }
        if (i == 28032) {
            assertInTrackEntry(i);
            Track track4 = this.currentTrack;
            if (track4.hasContentEncryption && track4.sampleStrippedBytes != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.timecodeScale == -9223372036854775807L) {
                this.timecodeScale = 1000000L;
            }
            long j5 = this.durationTimecode;
            if (j5 != -9223372036854775807L) {
                this.durationUs = scaleTimecodeToUs(j5);
                return;
            }
            return;
        }
        if (i != 374648427) {
            if (i == 475249515 && !this.sentSeekMap) {
                int i43 = 0;
                while (true) {
                    if (i43 >= this.perTrackCues.size()) {
                        break;
                    }
                    if (this.perTrackCues.valueAt(i43).isEmpty()) {
                        i43++;
                    } else {
                        if (this.durationUs == -9223372036854775807L) {
                            break;
                        }
                        for (int i59 = 0; i59 < this.perTrackCues.size(); i59++) {
                            Collections.sort(this.perTrackCues.valueAt(i59));
                        }
                        this.extractorOutput.seekMap(new MatroskaSeekMap(this.perTrackCues, this.durationUs, this.primarySeekTrackNumber, this.segmentContentPosition, this.segmentContentSize));
                    }
                }
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
                this.inCuesElement = false;
                for (int i66 = 0; i66 < this.tracks.size(); i66++) {
                    Track trackValueAt = this.tracks.valueAt(i66);
                    trackValueAt.maybeAddThumbnailMetadata(this.perTrackCues, this.durationUs, this.segmentContentPosition, this.segmentContentSize);
                    if (!trackValueAt.waitingForDtsAnalysis) {
                        trackValueAt.assertOutputInitialized();
                        trackValueAt.output.format((Format) Preconditions.checkNotNull(trackValueAt.format));
                    }
                }
                maybeEndTracks();
                return;
            }
            return;
        }
        if (this.tracks.size() == 0) {
            throw ParserException.createForMalformedContainer("No valid tracks were found", null);
        }
        boolean z = !this.seekForCuesEnabled || this.cuesContentPosition == -1;
        int i74 = -1;
        int i92 = -1;
        int i96 = -1;
        int i99 = -1;
        for (int i100 = 0; i100 < this.tracks.size(); i100++) {
            Track trackValueAt2 = this.tracks.valueAt(i100);
            int i101 = trackValueAt2.type;
            if (i101 == 2) {
                if (trackValueAt2.flagDefault) {
                    i74 = trackValueAt2.number;
                }
                if (i92 == -1) {
                    i92 = trackValueAt2.number;
                }
            } else if (i101 == 1) {
                if (trackValueAt2.flagDefault) {
                    i96 = trackValueAt2.number;
                }
                if (i99 == -1) {
                    i99 = trackValueAt2.number;
                }
            }
            if (z) {
                trackValueAt2.assertOutputInitialized();
                if (!trackValueAt2.waitingForDtsAnalysis) {
                    trackValueAt2.output.format((Format) Preconditions.checkNotNull(trackValueAt2.format));
                }
            }
        }
        if (i74 != -1) {
            this.primarySeekTrackNumber = i74;
        } else if (i92 != -1) {
            this.primarySeekTrackNumber = i92;
        } else if (i96 != -1) {
            this.primarySeekTrackNumber = i96;
        } else if (i99 != -1) {
            this.primarySeekTrackNumber = i99;
        } else {
            this.primarySeekTrackNumber = this.tracks.size() > 0 ? this.tracks.valueAt(0).number : -1;
        }
        if (z) {
            maybeEndTracks();
        }
    }

    public void floatElement(int i, double d) throws ParserException {
        if (i == 181) {
            getCurrentTrack(i).sampleRate = (int) d;
            return;
        }
        if (i == 17545) {
            this.durationTimecode = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                getCurrentTrack(i).primaryRChromaticityX = (float) d;
                break;
            case 21970:
                getCurrentTrack(i).primaryRChromaticityY = (float) d;
                break;
            case 21971:
                getCurrentTrack(i).primaryGChromaticityX = (float) d;
                break;
            case 21972:
                getCurrentTrack(i).primaryGChromaticityY = (float) d;
                break;
            case 21973:
                getCurrentTrack(i).primaryBChromaticityX = (float) d;
                break;
            case 21974:
                getCurrentTrack(i).primaryBChromaticityY = (float) d;
                break;
            case 21975:
                getCurrentTrack(i).whitePointChromaticityX = (float) d;
                break;
            case 21976:
                getCurrentTrack(i).whitePointChromaticityY = (float) d;
                break;
            case 21977:
                getCurrentTrack(i).maxMasteringLuminance = (float) d;
                break;
            case 21978:
                getCurrentTrack(i).minMasteringLuminance = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        getCurrentTrack(i).projectionPoseYaw = (float) d;
                        break;
                    case 30324:
                        getCurrentTrack(i).projectionPosePitch = (float) d;
                        break;
                    case 30325:
                        getCurrentTrack(i).projectionPoseRoll = (float) d;
                        break;
                }
                break;
        }
    }

    public Track getCurrentTrack(int i) throws ParserException {
        assertInTrackEntry(i);
        return this.currentTrack;
    }

    public int getElementType(int i) {
        switch (i) {
            case ISO781611.CREATION_DATE_AND_TIME_TAG /* 131 */:
            case 136:
            case 155:
            case 159:
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
            case 179:
            case 186:
            case Constants.TAG_EMV_L2_VERSION /* 215 */:
            case Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION /* 231 */:
            case Constants.TAG_EE_SUPPORTED_RPC_ID_LIST /* 238 */:
            case 240:
            case Constants.TAG_TRANSACTION_DATA /* 241 */:
            case Constants.TAG_BLE_FIRMWARE_VERSION /* 247 */:
            case Constants.TAG_FB_CHARGING_STATUS /* 251 */:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA /* 134 */:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case Constants.TAG_PAYMENT_APP_CLESS_VERSION /* 166 */:
            case 174:
            case 183:
            case 187:
            case BERTags.FLAGS /* 224 */:
            case Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE /* 225 */:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case Constants.TAG_ACE_LAYER_VERSION /* 163 */:
            case Constants.TAG_EMVL3_VERSION /* 165 */:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i) throws IOException {
        if (track.blockAddIdType != 1685485123 && track.blockAddIdType != 1685480259) {
            extractorInput.skipFully(i);
            return;
        }
        byte[] bArr = new byte[i];
        track.dolbyVisionConfigBytes = bArr;
        extractorInput.readFully(bArr, 0, i);
    }

    public void handleBlockAdditionalData(Track track, int i, ExtractorInput extractorInput, int i2) throws IOException {
        if (i != 4 || !"V_VP9".equals(track.codecId)) {
            extractorInput.skipFully(i2);
        } else {
            this.supplementalData.reset(i2);
            extractorInput.readFully(this.supplementalData.getData(), 0, i2);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    public void integerElement(int i, long j2) throws ParserException {
        if (i == 240) {
            if (this.sentSeekMap) {
                return;
            }
            assertInCues(i);
            if (this.currentCueRelativePosition == -1) {
                this.currentCueRelativePosition = j2;
                return;
            }
            return;
        }
        if (i == 241) {
            if (this.sentSeekMap) {
                return;
            }
            assertInCues(i);
            if (this.currentCueClusterPosition == -1) {
                this.currentCueClusterPosition = j2;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j2 == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j2 + " not supported", null);
        }
        if (i == 20530) {
            if (j2 == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j2 + " not supported", null);
        }
        switch (i) {
            case ISO781611.CREATION_DATE_AND_TIME_TAG /* 131 */:
                int i2 = (int) j2;
                if (i2 == 1) {
                    getCurrentTrack(i).type = 2;
                    return;
                }
                if (i2 == 2) {
                    getCurrentTrack(i).type = 1;
                    return;
                }
                if (i2 == 17) {
                    getCurrentTrack(i).type = 3;
                    return;
                } else if (i2 != 33) {
                    getCurrentTrack(i).type = -1;
                    return;
                } else {
                    getCurrentTrack(i).type = 5;
                    return;
                }
            case 136:
                getCurrentTrack(i).flagDefault = j2 == 1;
                return;
            case 155:
                this.blockDurationUs = scaleTimecodeToUs(j2);
                return;
            case 159:
                getCurrentTrack(i).channelCount = (int) j2;
                return;
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                getCurrentTrack(i).width = (int) j2;
                return;
            case 179:
                if (this.sentSeekMap) {
                    return;
                }
                assertInCues(i);
                this.currentCueTimeUs = scaleTimecodeToUs(j2);
                return;
            case 186:
                getCurrentTrack(i).height = (int) j2;
                return;
            case Constants.TAG_EMV_L2_VERSION /* 215 */:
                getCurrentTrack(i).number = (int) j2;
                return;
            case Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION /* 231 */:
                this.clusterTimecodeUs = scaleTimecodeToUs(j2);
                return;
            case Constants.TAG_EE_SUPPORTED_RPC_ID_LIST /* 238 */:
                this.blockAdditionalId = (int) j2;
                return;
            case Constants.TAG_BLE_FIRMWARE_VERSION /* 247 */:
                if (this.sentSeekMap) {
                    return;
                }
                assertInCues(i);
                this.currentCueTrackNumber = (int) j2;
                return;
            case Constants.TAG_FB_CHARGING_STATUS /* 251 */:
                this.blockHasReferenceBlock = true;
                return;
            case 16871:
                getCurrentTrack(i).blockAddIdType = (int) j2;
                return;
            case 16980:
                if (j2 == 3) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentCompAlgo " + j2 + " not supported", null);
            case 17029:
                if (j2 < 1 || j2 > 2) {
                    throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j2 + " not supported", null);
                }
                return;
            case 17143:
                if (j2 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("EBMLReadVersion " + j2 + " not supported", null);
            case 18401:
                if (j2 == 5) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncAlgo " + j2 + " not supported", null);
            case 18408:
                if (j2 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j2 + " not supported", null);
            case 21420:
                this.seekEntryPosition = j2 + this.segmentContentPosition;
                return;
            case 21432:
                int i3 = (int) j2;
                assertInTrackEntry(i);
                if (i3 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i3 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i3 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case 21680:
                getCurrentTrack(i).displayWidth = (int) j2;
                return;
            case 21682:
                getCurrentTrack(i).displayUnit = (int) j2;
                return;
            case 21690:
                getCurrentTrack(i).displayHeight = (int) j2;
                return;
            case 21930:
                getCurrentTrack(i).flagForced = j2 == 1;
                return;
            case 21938:
                assertInTrackEntry(i);
                Track track = this.currentTrack;
                track.hasColorInfo = true;
                track.bitsPerChannel = (int) j2;
                return;
            case 21998:
                getCurrentTrack(i).maxBlockAdditionId = (int) j2;
                return;
            case 22186:
                getCurrentTrack(i).codecDelayNs = j2;
                return;
            case 22203:
                getCurrentTrack(i).seekPreRollNs = j2;
                return;
            case 25188:
                getCurrentTrack(i).audioBitDepth = (int) j2;
                return;
            case 30114:
                this.blockGroupDiscardPaddingNs = j2;
                return;
            case 30321:
                assertInTrackEntry(i);
                int i5 = (int) j2;
                if (i5 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i5 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i5 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case 2352003:
                getCurrentTrack(i).defaultSampleDurationNs = (int) j2;
                return;
            case 2807729:
                this.timecodeScale = j2;
                return;
            default:
                switch (i) {
                    case 21945:
                        assertInTrackEntry(i);
                        int i6 = (int) j2;
                        if (i6 == 1) {
                            this.currentTrack.colorRange = 2;
                            return;
                        } else {
                            if (i6 != 2) {
                                return;
                            }
                            this.currentTrack.colorRange = 1;
                            return;
                        }
                    case 21946:
                        assertInTrackEntry(i);
                        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j2);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.currentTrack.colorTransfer = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case 21947:
                        assertInTrackEntry(i);
                        this.currentTrack.hasColorInfo = true;
                        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j2);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.currentTrack.colorSpace = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case 21948:
                        getCurrentTrack(i).maxContentLuminance = (int) j2;
                        return;
                    case 21949:
                        getCurrentTrack(i).maxFrameAverageLuminance = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    public boolean isLevel1Element(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        this.haveOutputSample = false;
        boolean z = true;
        while (z && !this.haveOutputSample) {
            z = this.reader.read(extractorInput);
            if (z && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            Track trackValueAt = this.tracks.valueAt(i);
            trackValueAt.assertOutputInitialized();
            trackValueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j2, long j3) {
        this.clusterTimecodeUs = -9223372036854775807L;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        this.inCuesElement = false;
        this.currentCueTimeUs = -9223372036854775807L;
        this.currentCueTrackNumber = -1;
        this.currentCueClusterPosition = -1L;
        this.currentCueRelativePosition = -1L;
        if (!this.sentSeekMap) {
            this.perTrackCues.clear();
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).reset();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException {
        return new Sniffer().sniff(extractorInput);
    }

    public void startMasterElement(int i, long j2, long j3) throws ParserException {
        assertInitialized();
        if (i == 160) {
            this.blockHasReferenceBlock = false;
            this.blockGroupDiscardPaddingNs = 0L;
            return;
        }
        if (i == 174) {
            Track track = new Track();
            this.currentTrack = track;
            track.isWebm = this.isWebm;
            return;
        }
        if (i == 183) {
            if (this.sentSeekMap) {
                return;
            }
            assertInCues(i);
            this.currentCueTrackNumber = -1;
            this.currentCueClusterPosition = -1L;
            this.currentCueRelativePosition = -1L;
            return;
        }
        if (i == 187) {
            if (this.sentSeekMap) {
                return;
            }
            assertInCues(i);
            this.currentCueTimeUs = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1L;
            return;
        }
        if (i == 20533) {
            getCurrentTrack(i).hasContentEncryption = true;
            return;
        }
        if (i == 21968) {
            getCurrentTrack(i).hasColorInfo = true;
            return;
        }
        if (i == 408125543) {
            long j5 = this.segmentContentPosition;
            if (j5 != -1 && j5 != j2) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.segmentContentPosition = j2;
            this.segmentContentSize = j3;
            return;
        }
        if (i == 475249515) {
            if (this.sentSeekMap) {
                return;
            }
            this.inCuesElement = true;
        } else if (i == 524531317 && !this.sentSeekMap) {
            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                this.seekForCues = true;
            } else {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
            }
        }
    }

    public void stringElement(int i, String str) throws ParserException {
        if (i == 134) {
            getCurrentTrack(i).codecId = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                getCurrentTrack(i).name = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                getCurrentTrack(i).language = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.isWebm = Objects.equals(str, "webm");
            return;
        }
        throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    public MatroskaExtractor(EbmlReader ebmlReader, int i, SubtitleParser.Factory factory) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = -9223372036854775807L;
        this.durationTimecode = -9223372036854775807L;
        this.durationUs = -9223372036854775807L;
        this.currentCueTimeUs = -9223372036854775807L;
        this.currentCueTrackNumber = -1;
        this.currentCueClusterPosition = -1L;
        this.currentCueRelativePosition = -1L;
        this.primarySeekTrackNumber = -1;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = -9223372036854775807L;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.subtitleParserFactory = factory;
        this.perTrackCues = new SparseArray<>();
        this.seekForCuesEnabled = (i & 1) == 0;
        this.parseSubtitlesDuringExtraction = (i & 2) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.supplementalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
        this.pendingEndTracks = true;
    }
}
