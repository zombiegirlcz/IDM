package androidx.media3.extractor.mp4;

import a0.d;
import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.DolbyVisionConfig;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4AlternateGroupData;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BoxParser {
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    public static final class BtrtData {
        private final long avgBitrate;
        private final long maxBitrate;

        public BtrtData(long j2, long j3) {
            this.avgBitrate = j2;
            this.maxBitrate = j3;
        }
    }

    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    public static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j2, long j3) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j2;
            this.peakBitrate = j3;
        }
    }

    public static final class EyesData {
        private final StriData striData;

        public EyesData(StriData striData) {
            this.striData = striData;
        }
    }

    public static final class MdhdData {
        private final String language;
        private final long mediaDurationUs;
        private final long timescale;

        public MdhdData(long j2, long j3, String str) {
            this.timescale = j2;
            this.mediaDurationUs = j3;
            this.language = str;
        }
    }

    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    public static final class StriData {
        private final boolean eyeViewsReversed;
        private final boolean hasLeftEyeView;
        private final boolean hasRightEyeView;

        public StriData(boolean z, boolean z3, boolean z4) {
            this.hasLeftEyeView = z;
            this.hasRightEyeView = z3;
            this.eyeViewsReversed = z4;
        }
    }

    public static final class StsdData {
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Mp4Box.LeafBox leafBox, Format format) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    Log.w("BoxParsers", "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == -1 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Mp4Box.LeafBox leafBox) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 != 0) {
                return this.currentByte & 15;
            }
            int unsignedByte = this.data.readUnsignedByte();
            this.currentByte = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }
    }

    public static final class TkhdData {
        private final int alternateGroup;
        private final long duration;
        private final int height;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f7626id;
        private final int rotationDegrees;
        private final int width;

        public TkhdData(int i, long j2, int i2, int i3, int i5, int i6) {
            this.f7626id = i;
            this.duration = j2;
            this.alternateGroup = i2;
            this.rotationDegrees = i3;
            this.width = i5;
            this.height = i6;
        }
    }

    public static final class VexuData {
        private final EyesData eyesData;

        public VexuData(EyesData eyesData) {
            this.eyesData = eyesData;
        }

        public boolean hasBothEyeViews() {
            EyesData eyesData = this.eyesData;
            return eyesData != null && eyesData.striData.hasLeftEyeView && this.eyesData.striData.hasRightEyeView;
        }
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j2, long j3, long j5) {
        int length = jArr.length - 1;
        return jArr[0] <= j3 && j3 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j5 && j5 <= j2 + 2;
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i, int i2, int i3) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i2, null);
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i5 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i5 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i) {
                return position;
            }
            position += i5;
        }
        return -1;
    }

    private static String formatVobsubIdx(byte[] bArr, int i, int i2) {
        Preconditions.checkState(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(vobsubYuvToRgb(Ints.fromBytes(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3])))));
        }
        StringBuilder sbW = a.w("size: ", i, i2, "x", "\npalette: ");
        sbW.append(Joiner.on(", ").join(arrayList));
        sbW.append("\n");
        return sbW.toString();
    }

    private static String getLanguageFromCode(int i) {
        char[] cArr = {(char) (((i >> 10) & 31) + 96), (char) (((i >> 5) & 31) + 96), (char) ((i & 31) + 96)};
        for (int i2 = 0; i2 < 3; i2++) {
            char c2 = cArr[i2];
            if (c2 < 'a' || c2 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728 || i == 1937072752) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static ColorInfo parseApvc(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(8);
        for (int i = 0; i < bits; i++) {
            parsableBitArray.skipBytes(1);
            int bits2 = parsableBitArray.readBits(8);
            for (int i2 = 0; i2 < bits2; i2++) {
                parsableBitArray.skipBits(6);
                boolean bit = parsableBitArray.readBit();
                parsableBitArray.skipBit();
                parsableBitArray.skipBytes(11);
                parsableBitArray.skipBits(4);
                int bits3 = parsableBitArray.readBits(4) + 8;
                builder.setLumaBitdepth(bits3);
                builder.setChromaBitdepth(bits3);
                parsableBitArray.skipBytes(1);
                if (bit) {
                    int bits4 = parsableBitArray.readBits(8);
                    int bits5 = parsableBitArray.readBits(8);
                    parsableBitArray.skipBytes(1);
                    builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(bits4)).setColorRange(parsableBitArray.readBit() ? 1 : 2).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(bits5));
                }
            }
        }
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03aa A[PHI: r2 r8 r9 r11 r16 r23
      0x03aa: PHI (r2v17 java.util.List<byte[]>) = 
      (r2v2 java.util.List<byte[]>)
      (r2v2 java.util.List<byte[]>)
      (r2v16 java.util.List<byte[]>)
      (r2v2 java.util.List<byte[]>)
      (r2v26 java.util.List<byte[]>)
     binds: [B:240:0x045c, B:242:0x046a, B:245:0x0474, B:233:0x0420, B:206:0x037a] A[DONT_GENERATE, DONT_INLINE]
      0x03aa: PHI (r8v11 int) = (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v15 int) binds: [B:240:0x045c, B:242:0x046a, B:245:0x0474, B:233:0x0420, B:206:0x037a] A[DONT_GENERATE, DONT_INLINE]
      0x03aa: PHI (r9v8 int) = (r9v5 int), (r9v5 int), (r9v5 int), (r9v5 int), (r9v10 int) binds: [B:240:0x045c, B:242:0x046a, B:245:0x0474, B:233:0x0420, B:206:0x037a] A[DONT_GENERATE, DONT_INLINE]
      0x03aa: PHI (r11v11 java.lang.String) = 
      (r11v9 java.lang.String)
      (r11v10 java.lang.String)
      (r11v10 java.lang.String)
      (r11v12 java.lang.String)
      (r11v9 java.lang.String)
     binds: [B:240:0x045c, B:242:0x046a, B:245:0x0474, B:233:0x0420, B:206:0x037a] A[DONT_GENERATE, DONT_INLINE]
      0x03aa: PHI (r16v3 androidx.media3.extractor.mp4.BoxParser$EsdsData) = 
      (r16v1 androidx.media3.extractor.mp4.BoxParser$EsdsData)
      (r16v2 androidx.media3.extractor.mp4.BoxParser$EsdsData)
      (r16v2 androidx.media3.extractor.mp4.BoxParser$EsdsData)
      (r16v1 androidx.media3.extractor.mp4.BoxParser$EsdsData)
      (r16v1 androidx.media3.extractor.mp4.BoxParser$EsdsData)
     binds: [B:240:0x045c, B:242:0x046a, B:245:0x0474, B:233:0x0420, B:206:0x037a] A[DONT_GENERATE, DONT_INLINE]
      0x03aa: PHI (r23v2 int) = (r23v1 int), (r23v1 int), (r23v1 int), (r23v3 int), (r23v4 int) binds: [B:240:0x045c, B:242:0x046a, B:245:0x0474, B:233:0x0420, B:206:0x037a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseAudioSampleEntry(androidx.media3.common.util.ParsableByteArray r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, androidx.media3.common.DrmInitData r33, androidx.media3.extractor.mp4.BoxParser.StsdData r34, int r35) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.parseAudioSampleEntry(androidx.media3.common.util.ParsableByteArray, int, int, int, int, java.lang.String, boolean, androidx.media3.common.DrmInitData, androidx.media3.extractor.mp4.BoxParser$StsdData, int):void");
    }

    private static ColorInfo parseAv1c(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(3);
        parsableBitArray.skipBits(6);
        boolean bit = parsableBitArray.readBit();
        boolean bit2 = parsableBitArray.readBit();
        if (bits == 2 && bit) {
            builder.setLumaBitdepth(bit2 ? 12 : 10);
            builder.setChromaBitdepth(bit2 ? 12 : 10);
        } else if (bits <= 2) {
            builder.setLumaBitdepth(bit ? 10 : 8);
            builder.setChromaBitdepth(bit ? 10 : 8);
        }
        parsableBitArray.skipBits(13);
        parsableBitArray.skipBit();
        int bits2 = parsableBitArray.readBits(4);
        if (bits2 != 1) {
            Log.i("BoxParsers", "Unsupported obu_type: " + bits2);
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i("BoxParsers", "Unsupported obu_extension_flag");
            return builder.build();
        }
        boolean bit3 = parsableBitArray.readBit();
        parsableBitArray.skipBit();
        if (bit3 && parsableBitArray.readBits(8) > 127) {
            Log.i("BoxParsers", "Excessive obu_size");
            return builder.build();
        }
        int bits3 = parsableBitArray.readBits(3);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            Log.i("BoxParsers", "Unsupported reduced_still_picture_header");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i("BoxParsers", "Unsupported timing_info_present_flag");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return builder.build();
        }
        int bits4 = parsableBitArray.readBits(5);
        boolean z = false;
        for (int i = 0; i <= bits4; i++) {
            parsableBitArray.skipBits(12);
            if (parsableBitArray.readBits(5) > 7) {
                parsableBitArray.skipBit();
            }
        }
        int bits5 = parsableBitArray.readBits(4);
        int bits6 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(bits5 + 1);
        parsableBitArray.skipBits(bits6 + 1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(7);
        }
        parsableBitArray.skipBits(7);
        boolean bit4 = parsableBitArray.readBit();
        if (bit4) {
            parsableBitArray.skipBits(2);
        }
        if ((parsableBitArray.readBit() ? 2 : parsableBitArray.readBits(1)) > 0 && !parsableBitArray.readBit()) {
            parsableBitArray.skipBits(1);
        }
        if (bit4) {
            parsableBitArray.skipBits(3);
        }
        parsableBitArray.skipBits(3);
        boolean bit5 = parsableBitArray.readBit();
        if (bits3 == 2 && bit5) {
            parsableBitArray.skipBit();
        }
        if (bits3 != 1 && parsableBitArray.readBit()) {
            z = true;
        }
        if (parsableBitArray.readBit()) {
            int bits7 = parsableBitArray.readBits(8);
            int bits8 = parsableBitArray.readBits(8);
            builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(bits7)).setColorRange(((z || bits7 != 1 || bits8 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8));
        }
        return builder.build();
    }

    private static BtrtData parseBtrtFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        parsableByteArray.skipBytes(4);
        return new BtrtData(parsableByteArray.readUnsignedInt(), parsableByteArray.readUnsignedInt());
    }

    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        int i3 = i + 8;
        int i5 = -1;
        int i6 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i21 = parsableByteArray.readInt();
            int i22 = parsableByteArray.readInt();
            if (i22 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i22 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i22 == 1935894633) {
                i5 = i3;
                i6 = i21;
            }
            i3 += i21;
        }
        if (!"cenc".equals(string) && !"cbc1".equals(string) && !"cens".equals(string) && !"cbcs".equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i5 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i5, i6, string);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(schiFromParent));
    }

    private static Pair<long[], long[]> parseEdts(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(1701606260);
        if (leafBoxOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType.data;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i = 0; i < unsignedIntToInt; i++) {
            jArr[i] = fullBoxVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = fullBoxVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j2 = unsignedInt2;
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        if (j2 <= 0) {
            j2 = -1;
        }
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, j2, unsignedInt > 0 ? unsignedInt : -1L);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = unsignedByte & CertificateBody.profileType;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (unsignedByte & CertificateBody.profileType);
        }
        return i;
    }

    public static int parseFullBoxFlags(int i) {
        return i & 16777215;
    }

    public static int parseFullBoxVersion(int i) {
        return (i >> 24) & 255;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static MdhdData parseMdhd(ParsableByteArray parsableByteArray) {
        long j2;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullBoxVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int position = parsableByteArray.getPosition();
        int i = fullBoxVersion == 0 ? 4 : 8;
        int i2 = 0;
        while (true) {
            j2 = -9223372036854775807L;
            if (i2 >= i) {
                parsableByteArray.skipBytes(i);
                break;
            }
            if (parsableByteArray.getData()[position + i2] != -1) {
                long unsignedInt2 = fullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt2 != 0) {
                    long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedInt2, 1000000L, unsignedInt);
                    unsignedInt = unsignedInt;
                    j2 = jScaleLargeTimestamp;
                }
            } else {
                i2++;
            }
        }
        return new MdhdData(unsignedInt, j2, getLanguageFromCode(parsableByteArray.readUnsignedShort()));
    }

    public static Metadata parseMdtaFromMeta(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(1751411826);
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(1801812339);
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(1768715124);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null || parseHdlr(leafBoxOfType.data) != 1835299937) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType2.data;
        parsableByteArray.setPosition(12);
        int i = parsableByteArray.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i2] = parsableByteArray.readString(i3 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafBoxOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i5 = parsableByteArray2.readInt();
            int i6 = parsableByteArray2.readInt() - 1;
            if (i6 < 0 || i6 >= i) {
                a.z(i6, "Skipped metadata with unknown key index: ", "BoxParsers");
            } else {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i5, strArr[i6]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position + i5);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        if (i == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i3).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long unsignedInt;
        long unsignedInt2;
        parsableByteArray.setPosition(8);
        if (parseFullBoxVersion(parsableByteArray.readInt()) == 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
            unsignedInt2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = parsableByteArray.readLong();
            unsignedInt2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(unsignedInt, unsignedInt2, parsableByteArray.readUnsignedInt());
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i5 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i3, i5 + i3);
            }
            i3 += i5;
        }
        return null;
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i3)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i3;
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i5;
        int i6 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i6);
            int i21 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullBoxVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i5 = 0;
                    i3 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = unsignedByte & 15;
                    i5 = (unsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z, str, unsignedByte2, bArr2, i5, i3, bArr);
            }
            i6 += i21;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0187  */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.extractor.mp4.TrackSampleTable parseStbl(androidx.media3.extractor.mp4.Track r43, androidx.media3.container.Mp4Box.ContainerBox r44, androidx.media3.extractor.GaplessInfoHolder r45, boolean r46) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.BoxParser.parseStbl(androidx.media3.extractor.mp4.Track, androidx.media3.container.Mp4Box$ContainerBox, androidx.media3.extractor.GaplessInfoHolder, boolean):androidx.media3.extractor.mp4.TrackSampleTable");
    }

    private static EyesData parseStereoViewBox(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        parsableByteArray.setPosition(i + 8);
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1937011305) {
                parsableByteArray.skipBytes(4);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                return new EyesData(new StriData((unsignedByte & 1) == 1, (unsignedByte & 2) == 2, (unsignedByte & 8) == 8));
            }
            position += i3;
        }
        return null;
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, TkhdData tkhdData, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        parsableByteArray.setPosition(12);
        int i = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i);
        for (int i2 = 0; i2 < i; i2++) {
            int position = parsableByteArray.getPosition();
            int i3 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            int i5 = parsableByteArray.readInt();
            if (i5 == 1635148593 || i5 == 1635148595 || i5 == 1701733238 || i5 == 1831958048 || i5 == 1836070006 || i5 == 1752589105 || i5 == 1751479857 || i5 == 1932670515 || i5 == 1211250227 || i5 == 1748121139 || i5 == 1987063864 || i5 == 1987063865 || i5 == 1635135537 || i5 == 1685479798 || i5 == 1685479729 || i5 == 1685481573 || i5 == 1685481521 || i5 == 1634760241) {
                parseVideoSampleEntry(parsableByteArray, i5, position, i3, tkhdData.f7626id, str, tkhdData.rotationDegrees, drmInitData, stsdData, i2);
            } else if (i5 == 1836069985 || i5 == 1701733217 || i5 == 1633889587 || i5 == 1700998451 || i5 == 1633889588 || i5 == 1835823201 || i5 == 1685353315 || i5 == 1685353317 || i5 == 1685353320 || i5 == 1685353324 || i5 == 1685353336 || i5 == 1935764850 || i5 == 1935767394 || i5 == 1819304813 || i5 == 1936684916 || i5 == 1953984371 || i5 == 778924082 || i5 == 778924083 || i5 == 1835557169 || i5 == 1835560241 || i5 == 1634492771 || i5 == 1634492791 || i5 == 1970037111 || i5 == 1332770163 || i5 == 1716281667 || i5 == 1767992678 || i5 == 1768973165 || i5 == 1718641517) {
                parseAudioSampleEntry(parsableByteArray, i5, position, i3, tkhdData.f7626id, str, z, drmInitData, stsdData, i2);
            } else if (i5 == 1414810956 || i5 == 1954034535 || i5 == 2004251764 || i5 == 1937010800 || i5 == 1664495672 || i5 == 1836070003) {
                StsdData stsdData2 = stsdData;
                parseTextSampleEntry(parsableByteArray, i5, position, i3, tkhdData, str, stsdData2);
                stsdData = stsdData2;
            } else if (i5 == 1835365492) {
                parseMetaDataSampleEntry(parsableByteArray, i5, position, tkhdData.f7626id, stsdData);
            } else if (i5 == 1667329389) {
                stsdData.format = new Format.Builder().setId(tkhdData.f7626id).setSampleMimeType("application/x-camera-motion").build();
            }
            parsableByteArray.setPosition(position + i3);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, TkhdData tkhdData, String str, StsdData stsdData) {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableListOf = null;
        long j2 = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                immutableListOf = ImmutableList.of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j2 = 0;
            } else if (i == 1664495672) {
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                if (i != 1836070003) {
                    throw new IllegalStateException();
                }
                int position = parsableByteArray.getPosition();
                parsableByteArray.skipBytes(4);
                if (parsableByteArray.readInt() == 1702061171) {
                    EsdsData esdsFromParent = parseEsdsFromParent(parsableByteArray, position);
                    if (esdsFromParent.initializationData == null || esdsFromParent.initializationData.length != 64) {
                        return;
                    }
                    immutableListOf = ImmutableList.of(Util.getUtf8Bytes(formatVobsubIdx(esdsFromParent.initializationData, tkhdData.width, tkhdData.height)));
                    str2 = "application/vobsub";
                } else {
                    str2 = null;
                }
            }
        }
        if (str2 != null) {
            stsdData.format = new Format.Builder().setId(tkhdData.f7626id).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j2).setInitializationData(immutableListOf).build();
        }
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j2;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullBoxVersion == 0 ? 8 : 16);
        int i = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i2 = fullBoxVersion == 0 ? 4 : 8;
        int i3 = 0;
        while (true) {
            j2 = -9223372036854775807L;
            if (i3 >= i2) {
                parsableByteArray.skipBytes(i2);
                break;
            }
            if (parsableByteArray.getData()[position + i3] != -1) {
                long unsignedInt = fullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt != 0) {
                    j2 = unsignedInt;
                }
            } else {
                i3++;
            }
        }
        parsableByteArray.skipBytes(10);
        int i5 = 0;
        long j3 = j2;
        int unsignedShort = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(4);
        int i6 = parsableByteArray.readInt();
        int i21 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i22 = parsableByteArray.readInt();
        int i32 = parsableByteArray.readInt();
        if (i6 == 0 && i21 == 65536 && ((i22 == -65536 || i22 == 65536) && i32 == 0)) {
            i5 = 90;
        } else if (i6 == 0 && i21 == -65536 && ((i22 == 65536 || i22 == -65536) && i32 == 0)) {
            i5 = 270;
        } else if ((i6 == -65536 || i6 == 65536) && i21 == 0 && i22 == 0 && i32 == -65536) {
            i5 = 180;
        }
        int i33 = i5;
        parsableByteArray.skipBytes(16);
        short s2 = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        return new TkhdData(i, j3, unsignedShort, i33, s2, parsableByteArray.readShort());
    }

    public static Track parseTrak(Mp4Box.ContainerBox containerBox, Mp4Box.LeafBox leafBox, long j2, DrmInitData drmInitData, boolean z, boolean z3) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Format formatBuild;
        Mp4Box.ContainerBox containerBoxOfType;
        Pair<long[], long[]> edts;
        Mp4Box.ContainerBox containerBox2 = (Mp4Box.ContainerBox) Preconditions.checkNotNull(containerBox.getContainerBoxOfType(1835297121));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Mp4Box.LeafBox) Preconditions.checkNotNull(containerBox2.getLeafBoxOfType(1751411826))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(((Mp4Box.LeafBox) Preconditions.checkNotNull(containerBox.getLeafBoxOfType(1953196132))).data);
        long j3 = j2 == -9223372036854775807L ? tkhd.duration : j2;
        long j5 = parseMvhd(leafBox.data).timescale;
        long jScaleLargeTimestamp = j3 != -9223372036854775807L ? Util.scaleLargeTimestamp(j3, 1000000L, j5) : -9223372036854775807L;
        Mp4Box.ContainerBox containerBox3 = (Mp4Box.ContainerBox) Preconditions.checkNotNull(((Mp4Box.ContainerBox) Preconditions.checkNotNull(containerBox2.getContainerBoxOfType(1835626086))).getContainerBoxOfType(1937007212));
        MdhdData mdhd = parseMdhd(((Mp4Box.LeafBox) Preconditions.checkNotNull(containerBox2.getLeafBoxOfType(1835296868))).data);
        Mp4Box.LeafBox leafBoxOfType = containerBox3.getLeafBoxOfType(1937011556);
        if (leafBoxOfType == null) {
            Log.w("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
            return null;
        }
        StsdData stsd = parseStsd(leafBoxOfType.data, tkhd, mdhd.language, drmInitData, z3);
        if (z || (containerBoxOfType = containerBox.getContainerBoxOfType(1701082227)) == null || (edts = parseEdts(containerBoxOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        if (tkhd.alternateGroup != 0) {
            Mp4AlternateGroupData mp4AlternateGroupData = new Mp4AlternateGroupData(tkhd.alternateGroup);
            Format.Builder builderBuildUpon = stsd.format.buildUpon();
            Metadata metadata = stsd.format.metadata;
            formatBuild = builderBuildUpon.setMetadata(metadata != null ? metadata.copyWithAppendedEntries(mp4AlternateGroupData) : new Metadata(mp4AlternateGroupData)).build();
        } else {
            formatBuild = stsd.format;
        }
        return new Track(tkhd.f7626id, trackTypeForHdlr, mdhd.timescale, j5, jScaleLargeTimestamp, mdhd.mediaDurationUs, formatBuild, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static List<TrackSampleTable> parseTraks(Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder, long j2, DrmInitData drmInitData, boolean z, boolean z3, Function<Track, Track> function, boolean z4) throws ParserException {
        Track trackApply;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < containerBox.containerChildren.size(); i++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i);
            if (containerBox2.type == 1953653099 && (trackApply = function.apply(parseTrak(containerBox2, (Mp4Box.LeafBox) Preconditions.checkNotNull(containerBox.getLeafBoxOfType(1836476516)), j2, drmInitData, z, z3))) != null) {
                arrayList.add(parseStbl(trackApply, (Mp4Box.ContainerBox) Preconditions.checkNotNull(((Mp4Box.ContainerBox) Preconditions.checkNotNull(((Mp4Box.ContainerBox) Preconditions.checkNotNull(containerBox2.getContainerBoxOfType(1835297121))).getContainerBoxOfType(1835626086))).getContainerBoxOfType(1937007212)), gaplessInfoHolder, z4));
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Mp4Box.LeafBox leafBox) {
        ParsableByteArray parsableByteArray = leafBox.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i = parsableByteArray.readInt();
            int i2 = parsableByteArray.readInt();
            if (i2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + i));
            } else if (i2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, position + i));
            } else if (i2 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + i);
        }
        return metadata;
    }

    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i2);
            }
            parsableByteArray.setPosition(position + i2);
        }
        return null;
    }

    public static VexuData parseVideoExtendedUsageBox(ParsableByteArray parsableByteArray, int i, int i2) throws ParserException {
        parsableByteArray.setPosition(i + 8);
        int position = parsableByteArray.getPosition();
        EyesData stereoViewBox = null;
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i3 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1702454643) {
                stereoViewBox = parseStereoViewBox(parsableByteArray, position, i3);
            }
            position += i3;
        }
        if (stereoViewBox == null) {
            return null;
        }
        return new VexuData(stereoViewBox);
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i5, String str, int i6, DrmInitData drmInitData, StsdData stsdData, int i21) throws ParserException {
        int i22;
        String str2;
        int iIsoColorPrimariesToColorSpace;
        int i32;
        DrmInitData drmInitData2;
        int i33;
        int i43;
        int i59;
        int i66;
        NalUnitUtil.H265VpsData h265VpsData;
        int i74;
        int i92;
        int i96;
        int i99 = i2;
        int i100 = i3;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i99 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i99, i100);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i21] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str3 = "video/3gpp";
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float paspFromParent = 1.0f;
        int i101 = 8;
        int i102 = 8;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        List<byte[]> listBuild = null;
        String strBuildApvCodecString = null;
        byte[] projFromParent = null;
        int i103 = -1;
        int i104 = -1;
        int i105 = -1;
        int i106 = -1;
        int i107 = -1;
        int i108 = -1;
        int i109 = -1;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        BtrtData btrtFromParent = null;
        EsdsData esdsFromParent = null;
        NalUnitUtil.H265VpsData h265VpsData2 = null;
        boolean z = false;
        while (position - i99 < i100) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i110 = parsableByteArray.readInt();
            if (i110 == 0 && parsableByteArray.getPosition() - i2 == i100) {
                break;
            }
            ExtractorUtil.checkContainerInput(i110 > 0, "childAtomSize must be positive");
            int i111 = parsableByteArray.readInt();
            if (i111 == 1635148611) {
                ExtractorUtil.checkContainerInput(str4 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                List<byte[]> list = avcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                String str5 = avcConfig.codecs;
                int i112 = avcConfig.maxNumReorderFrames;
                int i113 = avcConfig.colorSpace;
                int i114 = avcConfig.colorRange;
                listBuild = list;
                int i115 = avcConfig.colorTransfer;
                int i116 = avcConfig.bitdepthLuma;
                NalUnitUtil.H265VpsData h265VpsData3 = h265VpsData2;
                drmInitData2 = drmInitDataCopyWithSchemeType;
                h265VpsData = h265VpsData3;
                i59 = avcConfig.bitdepthChroma;
                i22 = position;
                i33 = iIntValue;
                str2 = str3;
                iIsoColorPrimariesToColorSpace = i113;
                i32 = i114;
                iIsoTransferCharacteristicsToColorTransfer = i115;
                i101 = i116;
                strBuildApvCodecString = str5;
                str4 = "video/avc";
                i104 = i112;
            } else {
                i22 = position;
                if (i111 == 1752589123) {
                    ExtractorUtil.checkContainerInput(str4 == null, null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                    List<byte[]> list2 = hevcConfig.initializationData;
                    stsdData2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    if (!z) {
                        paspFromParent = hevcConfig.pixelWidthHeightRatio;
                    }
                    int i117 = hevcConfig.maxNumReorderPics;
                    int i118 = hevcConfig.maxSubLayers;
                    String str6 = hevcConfig.codecs;
                    int i119 = hevcConfig.stereoMode;
                    listBuild = list2;
                    if (i119 != -1) {
                        i103 = i119;
                    }
                    int i120 = hevcConfig.decodedWidth;
                    int i121 = hevcConfig.decodedHeight;
                    int i122 = hevcConfig.colorSpace;
                    int i123 = hevcConfig.colorRange;
                    int i124 = hevcConfig.colorTransfer;
                    i107 = i121;
                    i101 = hevcConfig.bitdepthLuma;
                    i59 = hevcConfig.bitdepthChroma;
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i33 = iIntValue;
                    str2 = str3;
                    iIsoColorPrimariesToColorSpace = i122;
                    i32 = i123;
                    iIsoTransferCharacteristicsToColorTransfer = i124;
                    h265VpsData = hevcConfig.vpsData;
                    i104 = i117;
                    i105 = i118;
                    i106 = i120;
                    str4 = "video/hevc";
                    strBuildApvCodecString = str6;
                } else {
                    str2 = str3;
                    if (i111 == 1818785347) {
                        ExtractorUtil.checkContainerInput("video/hevc".equals(str4), "lhvC must follow hvcC atom");
                        NalUnitUtil.H265VpsData h265VpsData4 = h265VpsData2;
                        ExtractorUtil.checkContainerInput(h265VpsData4 != null && h265VpsData4.layerInfos.size() >= 2, "must have at least two layers");
                        parsableByteArray.setPosition(position2 + 8);
                        HevcConfig layered = HevcConfig.parseLayered(parsableByteArray, (NalUnitUtil.H265VpsData) Preconditions.checkNotNull(h265VpsData4));
                        ExtractorUtil.checkContainerInput(stsdData2.nalUnitLengthFieldLength == layered.nalUnitLengthFieldLength, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i125 = layered.colorSpace;
                        int i126 = i108;
                        if (i125 != -1) {
                            ExtractorUtil.checkContainerInput(i126 == i125, "colorSpace must be the same for both views");
                        }
                        int i127 = layered.colorRange;
                        int i128 = i109;
                        if (i127 != -1) {
                            ExtractorUtil.checkContainerInput(i128 == i127, "colorRange must be the same for both views");
                        }
                        int i129 = layered.colorTransfer;
                        if (i129 != -1) {
                            int i130 = iIsoTransferCharacteristicsToColorTransfer;
                            i92 = i130;
                            ExtractorUtil.checkContainerInput(i130 == i129, "colorTransfer must be the same for both views");
                        } else {
                            i92 = iIsoTransferCharacteristicsToColorTransfer;
                        }
                        ExtractorUtil.checkContainerInput(i101 == layered.bitdepthLuma, "bitdepthLuma must be the same for both views");
                        ExtractorUtil.checkContainerInput(i102 == layered.bitdepthChroma, "bitdepthChroma must be the same for both views");
                        List<byte[]> listBuild2 = listBuild;
                        if (listBuild2 != null) {
                            listBuild2 = ImmutableList.builder().addAll((Iterable) listBuild2).addAll((Iterable) layered.initializationData).build();
                            i96 = i126;
                        } else {
                            i96 = i126;
                            ExtractorUtil.checkContainerInput(false, "initializationData must be already set from hvcC atom");
                        }
                        str4 = "video/mv-hevc";
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                        i33 = iIntValue;
                        i32 = i128;
                        i59 = i102;
                        iIsoColorPrimariesToColorSpace = i96;
                        iIsoTransferCharacteristicsToColorTransfer = i92;
                        strBuildApvCodecString = layered.codecs;
                        h265VpsData = h265VpsData4;
                        listBuild = listBuild2;
                    } else {
                        List<byte[]> listBuildVp9CodecPrivateInitializationData = listBuild;
                        iIsoColorPrimariesToColorSpace = i108;
                        i32 = i109;
                        int i131 = iIsoTransferCharacteristicsToColorTransfer;
                        NalUnitUtil.H265VpsData h265VpsData5 = h265VpsData2;
                        if (i111 == 1986361461) {
                            VexuData videoExtendedUsageBox = parseVideoExtendedUsageBox(parsableByteArray, position2, i110);
                            if (videoExtendedUsageBox == null || videoExtendedUsageBox.eyesData == null) {
                                i74 = i103;
                                i103 = i74;
                                drmInitData2 = drmInitDataCopyWithSchemeType;
                                listBuild = listBuildVp9CodecPrivateInitializationData;
                                i33 = iIntValue;
                                i59 = i102;
                                iIsoTransferCharacteristicsToColorTransfer = i131;
                                h265VpsData = h265VpsData5;
                            } else if (h265VpsData5 == null || h265VpsData5.layerInfos.size() < 2) {
                                i74 = i103;
                                if (i74 == -1) {
                                    i103 = videoExtendedUsageBox.eyesData.striData.eyeViewsReversed ? 5 : 4;
                                } else {
                                    i103 = i74;
                                }
                                drmInitData2 = drmInitDataCopyWithSchemeType;
                                listBuild = listBuildVp9CodecPrivateInitializationData;
                                i33 = iIntValue;
                                i59 = i102;
                                iIsoTransferCharacteristicsToColorTransfer = i131;
                                h265VpsData = h265VpsData5;
                            } else {
                                ExtractorUtil.checkContainerInput(videoExtendedUsageBox.hasBothEyeViews(), "both eye views must be marked as available");
                                ExtractorUtil.checkContainerInput(!videoExtendedUsageBox.eyesData.striData.eyeViewsReversed, "for MV-HEVC, eye_views_reversed must be set to false");
                                i74 = i103;
                                i103 = i74;
                                drmInitData2 = drmInitDataCopyWithSchemeType;
                                listBuild = listBuildVp9CodecPrivateInitializationData;
                                i33 = iIntValue;
                                i59 = i102;
                                iIsoTransferCharacteristicsToColorTransfer = i131;
                                h265VpsData = h265VpsData5;
                            }
                        } else {
                            int i132 = i103;
                            if (i111 == 1685480259 || i111 == 1685485123 || i111 == 1685485379) {
                                drmInitData2 = drmInitDataCopyWithSchemeType;
                                i33 = iIntValue;
                                i43 = i132;
                                i59 = i102;
                                float f = paspFromParent;
                                int i133 = i101;
                                i66 = i131;
                                int i134 = i110 - 8;
                                byte[] bArr = new byte[i134];
                                parsableByteArray.readBytes(bArr, 0, i134);
                                if (listBuildVp9CodecPrivateInitializationData != null) {
                                    listBuild = ImmutableList.builder().addAll((Iterable) listBuildVp9CodecPrivateInitializationData).add(bArr).build();
                                } else {
                                    ExtractorUtil.checkContainerInput(false, "initializationData must already be set from hvcC or avcC atom");
                                    listBuild = listBuildVp9CodecPrivateInitializationData;
                                }
                                parsableByteArray.setPosition(position2 + 8);
                                DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                                if (dolbyVisionConfig != null) {
                                    str4 = "video/dolby-vision";
                                    strBuildApvCodecString = dolbyVisionConfig.codecs;
                                }
                                iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                                i101 = i133;
                                paspFromParent = f;
                            } else if (i111 == 1987076931) {
                                ExtractorUtil.checkContainerInput(str4 == null, null);
                                String str7 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                parsableByteArray.setPosition(position2 + 12);
                                byte unsignedByte = (byte) parsableByteArray.readUnsignedByte();
                                byte unsignedByte2 = (byte) parsableByteArray.readUnsignedByte();
                                int unsignedByte3 = parsableByteArray.readUnsignedByte();
                                i101 = unsignedByte3 >> 4;
                                i33 = iIntValue;
                                byte b4 = (byte) ((unsignedByte3 >> 1) & 7);
                                if (str7.equals("video/x-vnd.on2.vp9")) {
                                    listBuildVp9CodecPrivateInitializationData = CodecSpecificDataUtil.buildVp9CodecPrivateInitializationData(unsignedByte, unsignedByte2, (byte) i101, b4);
                                }
                                boolean z3 = (unsignedByte3 & 1) != 0;
                                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                                int unsignedByte5 = parsableByteArray.readUnsignedByte();
                                int iIsoColorPrimariesToColorSpace2 = ColorInfo.isoColorPrimariesToColorSpace(unsignedByte4);
                                int i135 = z3 ? 1 : 2;
                                iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedByte5);
                                str4 = str7;
                                drmInitData2 = drmInitDataCopyWithSchemeType;
                                i32 = i135;
                                h265VpsData = h265VpsData5;
                                iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace2;
                                listBuild = listBuildVp9CodecPrivateInitializationData;
                                i103 = i132;
                                i59 = i101;
                            } else {
                                i33 = iIntValue;
                                if (i111 == 1635135811) {
                                    int i136 = i110 - 8;
                                    byte[] bArr2 = new byte[i136];
                                    parsableByteArray.readBytes(bArr2, 0, i136);
                                    listBuild = ImmutableList.of(bArr2);
                                    parsableByteArray.setPosition(position2 + 8);
                                    ColorInfo av1c = parseAv1c(parsableByteArray);
                                    int i137 = av1c.lumaBitdepth;
                                    int i138 = av1c.chromaBitdepth;
                                    int i139 = av1c.colorSpace;
                                    int i140 = av1c.colorRange;
                                    iIsoTransferCharacteristicsToColorTransfer = av1c.colorTransfer;
                                    i101 = i137;
                                    drmInitData2 = drmInitDataCopyWithSchemeType;
                                    i59 = i138;
                                    iIsoColorPrimariesToColorSpace = i139;
                                    i32 = i140;
                                    str4 = "video/av01";
                                    h265VpsData = h265VpsData5;
                                } else if (i111 == 1668050025) {
                                    if (byteBufferAllocateHdrStaticInfo == null) {
                                        byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                    }
                                    ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(parsableByteArray.readShort());
                                    byteBuffer.putShort(parsableByteArray.readShort());
                                    byteBufferAllocateHdrStaticInfo = byteBuffer;
                                    drmInitData2 = drmInitDataCopyWithSchemeType;
                                    listBuild = listBuildVp9CodecPrivateInitializationData;
                                    i59 = i102;
                                    h265VpsData = h265VpsData5;
                                    iIsoTransferCharacteristicsToColorTransfer = i131;
                                } else if (i111 == 1835295606) {
                                    if (byteBufferAllocateHdrStaticInfo == null) {
                                        byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                                    short s2 = parsableByteArray.readShort();
                                    short s3 = parsableByteArray.readShort();
                                    short s4 = parsableByteArray.readShort();
                                    short s6 = parsableByteArray.readShort();
                                    i59 = i102;
                                    short s11 = parsableByteArray.readShort();
                                    int i141 = i101;
                                    short s27 = parsableByteArray.readShort();
                                    drmInitData2 = drmInitDataCopyWithSchemeType;
                                    short s37 = parsableByteArray.readShort();
                                    short s51 = parsableByteArray.readShort();
                                    long unsignedInt = parsableByteArray.readUnsignedInt();
                                    long unsignedInt2 = parsableByteArray.readUnsignedInt();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(s11);
                                    byteBuffer2.putShort(s27);
                                    byteBuffer2.putShort(s2);
                                    byteBuffer2.putShort(s3);
                                    byteBuffer2.putShort(s4);
                                    byteBuffer2.putShort(s6);
                                    byteBuffer2.putShort(s37);
                                    byteBuffer2.putShort(s51);
                                    byteBuffer2.putShort((short) (unsignedInt / 10000));
                                    byteBuffer2.putShort((short) (unsignedInt2 / 10000));
                                    byteBufferAllocateHdrStaticInfo = byteBuffer2;
                                    listBuild = listBuildVp9CodecPrivateInitializationData;
                                    h265VpsData = h265VpsData5;
                                    i101 = i141;
                                    iIsoTransferCharacteristicsToColorTransfer = i131;
                                    i103 = i132;
                                    paspFromParent = paspFromParent;
                                } else {
                                    drmInitData2 = drmInitDataCopyWithSchemeType;
                                    i43 = i132;
                                    i59 = i102;
                                    float f4 = paspFromParent;
                                    int i142 = i101;
                                    if (i111 == 1681012275) {
                                        ExtractorUtil.checkContainerInput(str4 == null, null);
                                        listBuild = listBuildVp9CodecPrivateInitializationData;
                                        h265VpsData = h265VpsData5;
                                        i101 = i142;
                                        str4 = str2;
                                    } else {
                                        if (i111 == 1702061171) {
                                            ExtractorUtil.checkContainerInput(str4 == null, null);
                                            esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                                            String str8 = esdsFromParent.mimeType;
                                            byte[] bArr3 = esdsFromParent.initializationData;
                                            listBuild = bArr3 != null ? ImmutableList.of(bArr3) : listBuildVp9CodecPrivateInitializationData;
                                            str4 = str8;
                                        } else {
                                            if (i111 == 1651798644) {
                                                btrtFromParent = parseBtrtFromParent(parsableByteArray, position2);
                                            } else if (i111 == 1885434736) {
                                                paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                                                listBuild = listBuildVp9CodecPrivateInitializationData;
                                                h265VpsData = h265VpsData5;
                                                i101 = i142;
                                                iIsoTransferCharacteristicsToColorTransfer = i131;
                                                i103 = i43;
                                                z = true;
                                            } else if (i111 == 1937126244) {
                                                projFromParent = parseProjFromParent(parsableByteArray, position2, i110);
                                            } else if (i111 == 1936995172) {
                                                int unsignedByte6 = parsableByteArray.readUnsignedByte();
                                                parsableByteArray.skipBytes(3);
                                                if (unsignedByte6 == 0) {
                                                    int unsignedByte7 = parsableByteArray.readUnsignedByte();
                                                    if (unsignedByte7 == 0) {
                                                        i43 = 0;
                                                    } else if (unsignedByte7 == 1) {
                                                        i43 = 1;
                                                    } else if (unsignedByte7 == 2) {
                                                        i43 = 2;
                                                    } else if (unsignedByte7 == 3) {
                                                        i43 = 3;
                                                    }
                                                }
                                            } else if (i111 == 1634760259) {
                                                int i143 = i110 - 12;
                                                byte[] bArr4 = new byte[i143];
                                                parsableByteArray.setPosition(position2 + 12);
                                                parsableByteArray.readBytes(bArr4, 0, i143);
                                                strBuildApvCodecString = CodecSpecificDataUtil.buildApvCodecString(bArr4);
                                                listBuild = ImmutableList.of(bArr4);
                                                ColorInfo apvc = parseApvc(new ParsableByteArray(bArr4));
                                                int i144 = apvc.lumaBitdepth;
                                                int i145 = apvc.chromaBitdepth;
                                                int i146 = apvc.colorSpace;
                                                int i147 = apvc.colorRange;
                                                iIsoTransferCharacteristicsToColorTransfer = apvc.colorTransfer;
                                                i101 = i144;
                                                i59 = i145;
                                                iIsoColorPrimariesToColorSpace = i146;
                                                i32 = i147;
                                                str4 = "video/apv";
                                                h265VpsData = h265VpsData5;
                                                i103 = i43;
                                                paspFromParent = f4;
                                            } else {
                                                if (i111 == 1668246642) {
                                                    i66 = i131;
                                                    if (iIsoColorPrimariesToColorSpace == -1 && i66 == -1) {
                                                        int i148 = parsableByteArray.readInt();
                                                        if (i148 == 1852009592 || i148 == 1852009571) {
                                                            int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                                            int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                                            parsableByteArray.skipBytes(2);
                                                            boolean z4 = i110 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                                            iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                                            listBuild = listBuildVp9CodecPrivateInitializationData;
                                                            i32 = z4 ? 1 : 2;
                                                            h265VpsData = h265VpsData5;
                                                            i101 = i142;
                                                            i103 = i43;
                                                            paspFromParent = f4;
                                                            iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                                        } else {
                                                            Log.w("BoxParsers", "Unsupported color type: " + Mp4Box.getBoxTypeString(i148));
                                                        }
                                                    }
                                                } else {
                                                    i66 = i131;
                                                }
                                                listBuild = listBuildVp9CodecPrivateInitializationData;
                                                iIsoColorPrimariesToColorSpace = iIsoColorPrimariesToColorSpace;
                                                i101 = i142;
                                                paspFromParent = f4;
                                            }
                                            listBuild = listBuildVp9CodecPrivateInitializationData;
                                        }
                                        h265VpsData = h265VpsData5;
                                        i101 = i142;
                                    }
                                    iIsoTransferCharacteristicsToColorTransfer = i131;
                                    i103 = i43;
                                    paspFromParent = f4;
                                }
                                i103 = i132;
                            }
                            iIsoTransferCharacteristicsToColorTransfer = i66;
                            h265VpsData = h265VpsData5;
                            i103 = i43;
                        }
                    }
                }
            }
            position = i22 + i110;
            DrmInitData drmInitData3 = drmInitData2;
            h265VpsData2 = h265VpsData;
            drmInitDataCopyWithSchemeType = drmInitData3;
            i99 = i2;
            i100 = i3;
            stsdData2 = stsdData;
            i102 = i59;
            iIntValue = i33;
            str3 = str2;
            i108 = iIsoColorPrimariesToColorSpace;
            i109 = i32;
        }
        DrmInitData drmInitData4 = drmInitDataCopyWithSchemeType;
        float f5 = paspFromParent;
        List<byte[]> list3 = listBuild;
        int i149 = i103;
        int i150 = i108;
        int i151 = i109;
        int i152 = iIsoTransferCharacteristicsToColorTransfer;
        int i153 = i102;
        int i154 = i101;
        if (str4 == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(i5).setSampleMimeType(str4).setCodecs(strBuildApvCodecString).setWidth(unsignedShort).setHeight(unsignedShort2).setDecodedWidth(i106).setDecodedHeight(i107).setPixelWidthHeightRatio(f5).setRotationDegrees(i6).setProjectionData(projFromParent).setStereoMode(i149).setInitializationData(list3).setMaxNumReorderSamples(i104).setMaxSubLayers(i105).setDrmInitData(drmInitData4).setLanguage(str).setColorInfo(new ColorInfo.Builder().setColorSpace(i150).setColorRange(i151).setColorTransfer(i152).setHdrStaticInfo(byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null).setLumaBitdepth(i154).setChromaBitdepth(i153).build());
        if (btrtFromParent != null) {
            colorInfo.setAverageBitrate(Ints.saturatedCast(btrtFromParent.avgBitrate)).setPeakBitrate(Ints.saturatedCast(btrtFromParent.maxBitrate));
        } else if (esdsFromParent != null) {
            colorInfo.setAverageBitrate(Ints.saturatedCast(esdsFromParent.bitrate)).setPeakBitrate(Ints.saturatedCast(esdsFromParent.peakBitrate));
        }
        stsdData.format = colorInfo.build();
    }

    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short s2 = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String string = parsableByteArray.readString(s2);
        int iMax = Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(string.substring(0, iMax)), Float.parseFloat(string.substring(iMax, string.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int vobsubYuvToRgb(int i) {
        int i2 = (i >> 16) & 255;
        int i3 = ((i >> 8) & 255) + RangingPosition.RSSI_UNKNOWN;
        int iD = d.D(i3, 14075, 10000, i2);
        int i5 = (i & 255) + RangingPosition.RSSI_UNKNOWN;
        int i6 = (i2 - ((i5 * 3455) / 10000)) - ((i3 * 7169) / 10000);
        int iD2 = d.D(i5, 17790, 10000, i2);
        return Util.constrainValue(iD2, 0, 255) | (Util.constrainValue(iD, 0, 255) << 16) | (Util.constrainValue(i6, 0, 255) << 8);
    }
}
