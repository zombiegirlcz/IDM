package androidx.media3.muxer;

import a0.d;
import android.util.Pair;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.DolbyVisionConfig;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.NalUnitUtil;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.internal.ViewUtils;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import com.youTransactor.uCube.rpc.Constants;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes15.dex */
abstract class Boxes {
    public static final ImmutableList<Byte> XMP_UUID = ImmutableList.of((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, Byte.valueOf(CVCAFile.CAR_TAG), (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);

    private static ByteBuffer apvCBox(Format format) {
        Preconditions.checkArgument(!format.initializationData.isEmpty(), "csd-0 is not found in the format for apvC box");
        byte[] bArr = format.initializationData.get(0);
        Preconditions.checkArgument(bArr.length > 0, "csd-0 is empty for apvC box.");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 4);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("apvC", byteBufferAllocate);
    }

    public static ByteBuffer audioSampleEntry(Format format) {
        String strCodecSpecificFourcc = codecSpecificFourcc(format);
        ByteBuffer byteBufferCodecSpecificBox = codecSpecificBox(format);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferCodecSpecificBox.remaining() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) format.channelCount);
        byteBufferAllocate.putShort((short) 16);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putInt(format.sampleRate << 16);
        byteBufferAllocate.put(byteBufferCodecSpecificBox);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox(strCodecSpecificFourcc, byteBufferAllocate);
    }

    private static ByteBuffer av1CBox(Format format) {
        return BoxUtils.wrapIntoBox("av1C", ByteBuffer.wrap(format.initializationData.get(0)));
    }

    private static ByteBuffer avcCBox(Format format) {
        Preconditions.checkArgument(format.initializationData.size() >= 2, "csd-0 and/or csd-1 not found in the format for avcC box.");
        byte[] bArr = format.initializationData.get(0);
        Preconditions.checkArgument(bArr.length > 0, "csd-0 is empty for avcC box.");
        byte[] bArr2 = format.initializationData.get(1);
        Preconditions.checkArgument(bArr2.length > 0, "csd-1 is empty for avcC box.");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap2.limit() + byteBufferWrap.limit() + 200);
        byteBufferAllocate.put((byte) 1);
        ImmutableList<ByteBuffer> immutableListFindNalUnits = AnnexBUtils.findNalUnits(byteBufferWrap);
        Preconditions.checkArgument(!immutableListFindNalUnits.isEmpty(), "SPS data not found in csd0 for avcC box.");
        ByteBuffer byteBuffer = immutableListFindNalUnits.get(0);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr3 = new byte[iRemaining];
        byteBuffer.get(bArr3);
        byteBuffer.rewind();
        NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(bArr3, 0, iRemaining);
        byteBufferAllocate.put((byte) spsNalUnit.profileIdc);
        byteBufferAllocate.put((byte) spsNalUnit.constraintsFlagsAndReservedZero2Bits);
        byteBufferAllocate.put((byte) spsNalUnit.levelIdc);
        byteBufferAllocate.put((byte) -1);
        byteBufferAllocate.put((byte) -31);
        byteBufferAllocate.putShort((short) byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer);
        byteBuffer.rewind();
        ImmutableList<ByteBuffer> immutableListFindNalUnits2 = AnnexBUtils.findNalUnits(byteBufferWrap2);
        Preconditions.checkState(!immutableListFindNalUnits2.isEmpty(), "PPS data not found in csd1 for avcC box.");
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer2 = immutableListFindNalUnits2.get(0);
        byteBufferAllocate.putShort((short) byteBuffer2.remaining());
        byteBufferAllocate.put(byteBuffer2);
        byteBuffer2.rewind();
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("avcC", byteBufferAllocate);
    }

    private static String bcp47LanguageTagToIso3(String str) {
        if (str == null) {
            return null;
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        return localeForLanguageTag.getISO3Language().isEmpty() ? str : localeForLanguageTag.getISO3Language();
    }

    public static List<Integer> calculateSampleCompositionTimeOffsets(List<BufferInfo> list, List<Integer> list2, int i) {
        List<BufferInfo> list3 = list;
        ArrayList arrayList = new ArrayList(list3.size());
        if (!list3.isEmpty()) {
            boolean z = false;
            long j2 = list3.get(0).presentationTimeUs;
            long jIntValue = 0;
            int i2 = 0;
            boolean z3 = false;
            long j3 = 0;
            while (i2 < list3.size()) {
                long j5 = list3.get(i2).presentationTimeUs - j2;
                long jVuFromUs = vuFromUs(j5, i) - jIntValue;
                if (jVuFromUs <= 2147483647L) {
                    z = true;
                }
                Preconditions.checkState(z, "Only 32-bit composition offset is allowed");
                long j16 = j2;
                jIntValue += (long) list2.get(i2).intValue();
                arrayList.add(Integer.valueOf((int) jVuFromUs));
                if (j5 < j3) {
                    z3 = true;
                }
                i2++;
                list3 = list;
                j3 = j5;
                j2 = j16;
                z = false;
            }
            if (!z3) {
                arrayList.clear();
            }
        }
        return arrayList;
    }

    public static ByteBuffer co64(List<Long> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 8) + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            byteBufferAllocate.putLong(list.get(i).longValue());
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("co64", byteBufferAllocate);
    }

    public static ByteBuffer codecSpecificBox(Format format) {
        String str;
        str = (String) Preconditions.checkNotNull(format.sampleMimeType);
        str.getClass();
        switch (str) {
            case "video/dolby-vision":
                return doviSpecificBox(format);
            case "video/3gpp":
                return d263Box(format);
            case "video/av01":
                return av1CBox(format);
            case "video/hevc":
                return hvcCBox(format);
            case "audio/amr-wb":
                return damrBox((short) -31745);
            case "audio/vorbis":
            case "audio/mp4a-latm":
                return esdsBox(format);
            case "audio/raw":
                return ByteBuffer.allocate(0);
            case "video/mp4v-es":
                return esdsBox(format);
            case "video/apv":
                return apvCBox(format);
            case "video/avc":
                return avcCBox(format);
            case "audio/3gpp":
                return damrBox((short) -32257);
            case "audio/opus":
                return dOpsBox(format);
            case "video/x-vnd.on2.vp9":
                return vpcCBox(format);
            default:
                throw new IllegalArgumentException("Unsupported format: ".concat(str));
        }
    }

    private static String codecSpecificFourcc(Format format) {
        String str;
        str = (String) Preconditions.checkNotNull(format.sampleMimeType);
        str.getClass();
        switch (str) {
            case "video/dolby-vision":
                return getDoviFourcc(format);
            case "video/3gpp":
                return "s263";
            case "video/av01":
                return "av01";
            case "video/hevc":
                return "hvc1";
            case "audio/amr-wb":
                return "sawb";
            case "audio/vorbis":
            case "audio/mp4a-latm":
                return "mp4a";
            case "audio/raw":
                int i = format.pcmEncoding;
                if (i == 2) {
                    return "sowt";
                }
                if (i == 268435456) {
                    return "twos";
                }
                throw new IllegalArgumentException("Unsupported PCM encoding: " + format.pcmEncoding);
            case "video/mp4v-es":
                return "mp4v-es";
            case "video/apv":
                return "apv1";
            case "video/avc":
                return "avc1";
            case "audio/3gpp":
                return "samr";
            case "audio/opus":
                return "Opus";
            case "video/x-vnd.on2.vp9":
                return "vp09";
            default:
                throw new IllegalArgumentException("Unsupported format: ".concat(str));
        }
    }

    private static ByteBuffer colrBox(ColorInfo colorInfo) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        byteBufferAllocate.put((byte) 110);
        byteBufferAllocate.put((byte) 99);
        byteBufferAllocate.put((byte) 108);
        byteBufferAllocate.put((byte) 120);
        short sColorSpaceToIsoColorPrimaries = (short) ColorInfo.colorSpaceToIsoColorPrimaries(colorInfo.colorSpace);
        short sColorTransferToIsoTransferCharacteristics = (short) ColorInfo.colorTransferToIsoTransferCharacteristics(colorInfo.colorTransfer);
        short sColorSpaceToIsoMatrixCoefficients = (short) ColorInfo.colorSpaceToIsoMatrixCoefficients(colorInfo.colorSpace);
        byte b4 = colorInfo.colorRange == 1 ? (byte) -128 : (byte) 0;
        byteBufferAllocate.putShort(sColorSpaceToIsoColorPrimaries);
        byteBufferAllocate.putShort(sColorTransferToIsoTransferCharacteristics);
        byteBufferAllocate.putShort(sColorSpaceToIsoMatrixCoefficients);
        byteBufferAllocate.put(b4);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("colr", byteBufferAllocate);
    }

    public static List<Integer> convertPresentationTimestampsToDurationsVu(List<BufferInfo> list, int i, int i2, long j2) {
        long jVuFromUs;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        if (list.isEmpty()) {
            return arrayList2;
        }
        long j3 = 0;
        int i3 = 0;
        boolean z = false;
        while (i3 < list.size()) {
            long j5 = list.get(i3).presentationTimeUs;
            arrayList.add(Long.valueOf(j5));
            if (j5 < j3) {
                z = true;
            }
            i3++;
            j3 = j5;
        }
        if (z) {
            Collections.sort(arrayList);
        }
        long jLongValue = ((Long) arrayList.get(0)).longValue();
        int i5 = 1;
        while (i5 < arrayList.size()) {
            long jLongValue2 = ((Long) arrayList.get(i5)).longValue();
            long jVuFromUs2 = vuFromUs(jLongValue2 - jLongValue, i);
            Preconditions.checkState(jVuFromUs2 <= 2147483647L, "Only 32-bit sample duration is allowed");
            arrayList2.add(Integer.valueOf((int) jVuFromUs2));
            i5++;
            jLongValue = jLongValue2;
        }
        if (j2 != -9223372036854775807L) {
            long j16 = i;
            jVuFromUs = vuFromUs(j2, j16) - vuFromUs(jLongValue, j16);
            Preconditions.checkState(jVuFromUs <= 2147483647L, "Only 32-bit sample duration is allowed");
        } else {
            jVuFromUs = -1;
        }
        arrayList2.add(Integer.valueOf(getLastSampleDurationVu(arrayList2, i2, (int) jVuFromUs)));
        return arrayList2;
    }

    public static ByteBuffer ctts(List<BufferInfo> list, List<Integer> list2, int i) {
        List<Integer> listCalculateSampleCompositionTimeOffsets = calculateSampleCompositionTimeOffsets(list, list2, i);
        if (listCalculateSampleCompositionTimeOffsets.isEmpty()) {
            return ByteBuffer.allocate(0);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((listCalculateSampleCompositionTimeOffsets.size() * 8) + 8);
        byteBufferAllocate.putInt(16777216);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(0);
        int i2 = -1;
        int i3 = -1;
        int i5 = 0;
        for (int i6 = 0; i6 < listCalculateSampleCompositionTimeOffsets.size(); i6++) {
            int iIntValue = listCalculateSampleCompositionTimeOffsets.get(i6).intValue();
            if (i2 != iIntValue) {
                int iPosition2 = byteBufferAllocate.position();
                byteBufferAllocate.putInt(1);
                byteBufferAllocate.putInt(iIntValue);
                i5++;
                i3 = iPosition2;
                i2 = iIntValue;
            } else {
                byteBufferAllocate.putInt(i3, byteBufferAllocate.getInt(i3) + 1);
            }
        }
        byteBufferAllocate.putInt(iPosition, i5);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("ctts", byteBufferAllocate);
    }

    private static ByteBuffer d263Box(Format format) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(7);
        byteBufferAllocate.put("    ".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.put((byte) 0);
        Pair<Integer, Integer> codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format);
        if (codecProfileAndLevel == null) {
            codecProfileAndLevel = new Pair<>(1, 1);
        }
        byteBufferAllocate.put(((Integer) codecProfileAndLevel.second).byteValue());
        byteBufferAllocate.put(((Integer) codecProfileAndLevel.first).byteValue());
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("d263", byteBufferAllocate);
    }

    private static ByteBuffer dOpsBox(Format format) {
        Preconditions.checkArgument(!format.initializationData.isEmpty(), "csd-0 not found in the format for dOps box.");
        byte[] bArr = format.initializationData.get(0);
        Preconditions.checkArgument(bArr.length >= 8, "As csd0 contains 'OpusHead' in first 8 bytes, csd0 length should be greater than 8");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
        byteBufferAllocate.put(bArr, 8, bArr.length - 8);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("dOps", byteBufferAllocate);
    }

    private static ByteBuffer damrBox(short s2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.put("    ".getBytes(StandardCharsets.UTF_8));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putShort(s2);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("damr", byteBufferAllocate);
    }

    public static ByteBuffer dinf(ByteBuffer byteBuffer) {
        return BoxUtils.wrapIntoBox("dinf", byteBuffer);
    }

    private static ByteBuffer doviBox(int i, byte[] bArr) {
        Preconditions.checkArgument(bArr.length > 0, "csd is empty for dovi box.");
        if (i <= 7) {
            return BoxUtils.wrapIntoBox("dvcC", ByteBuffer.wrap(bArr));
        }
        if (i <= 10) {
            return BoxUtils.wrapIntoBox("dvvC", ByteBuffer.wrap(bArr));
        }
        if (i > 19 && i == 20) {
            return BoxUtils.wrapIntoBox("dvcC", ByteBuffer.wrap(bArr));
        }
        return BoxUtils.wrapIntoBox("dvwC", ByteBuffer.wrap(bArr));
    }

    private static ByteBuffer doviSpecificBox(Format format) {
        Preconditions.checkArgument(!format.initializationData.isEmpty(), "csd is not found in the format for dolby vision");
        byte[] bArr = (byte[]) Iterables.getLast(format.initializationData);
        DolbyVisionConfig dolbyVisionConfig = getDolbyVisionConfig(format);
        Preconditions.checkNotNull(dolbyVisionConfig, "Dolby vision codec is not supported.");
        return BoxUtils.concatenateBuffers(dolbyVisionConfig.profile <= 8 ? hvcCBox(format) : avcCBox(format), doviBox(dolbyVisionConfig.profile, bArr));
    }

    public static ByteBuffer dref(ByteBuffer... byteBufferArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(byteBufferArr.length);
        byteBufferAllocate.flip();
        ArrayList arrayList = new ArrayList();
        arrayList.add(byteBufferAllocate);
        Collections.addAll(arrayList, byteBufferArr);
        return BoxUtils.wrapBoxesIntoBox("dref", arrayList);
    }

    public static ByteBuffer edts(long j2, long j3, long j5, long j16, long j22) {
        if (j3 > 0) {
            j2 -= j3;
        }
        long j42 = j2;
        return j42 != 0 ? BoxUtils.wrapIntoBox("edts", elst(j42, j5, j16, j22)) : ByteBuffer.allocate(0);
    }

    private static ByteBuffer elst(long j2, long j3, long j5, long j16) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(50);
        byteBufferAllocate.putInt(16777216);
        if (j2 > 0) {
            byteBufferAllocate.putInt(2);
            byteBufferAllocate.put(elstEntry(vuFromUs(j2, j5), -1L, 1, 0));
            byteBufferAllocate.put(elstEntry(vuFromUs(j3, j5), 0L, 1, 0));
        } else {
            byteBufferAllocate.putInt(1);
            byteBufferAllocate.put(elstEntry(vuFromUs(j3, j5), vuFromUs(Math.abs(j2), j16), 1, 0));
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("elst", byteBufferAllocate);
    }

    private static ByteBuffer elstEntry(long j2, long j3, int i, int i2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(20);
        byteBufferAllocate.putLong(j2);
        byteBufferAllocate.putLong(j3);
        byteBufferAllocate.putShort((short) i);
        byteBufferAllocate.putShort((short) i2);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static ByteBuffer esdsBox(Format format) {
        Preconditions.checkArgument(!format.initializationData.isEmpty(), "csd-0 not found in the format for esds box.");
        byte[] bArr = format.initializationData.get(0);
        Preconditions.checkArgument(bArr.length > 0, "csd-0 is empty for esds box.");
        String str = (String) Preconditions.checkNotNull(format.sampleMimeType);
        ByteBuffer vorbisInitializationData = str.equals("audio/vorbis") ? CodecSpecificDataUtil.getVorbisInitializationData(format) : ByteBuffer.wrap(bArr);
        int i = format.peakBitrate;
        int i2 = format.averageBitrate;
        boolean zIsVideo = MimeTypes.isVideo(str);
        int iRemaining = vorbisInitializationData.remaining();
        ByteBuffer sizeBuffer = getSizeBuffer(iRemaining);
        ByteBuffer sizeBuffer2 = getSizeBuffer(sizeBuffer.remaining() + iRemaining + 14);
        ByteBuffer sizeBuffer3 = getSizeBuffer(sizeBuffer2.remaining() + sizeBuffer.remaining() + iRemaining + 21);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put(sizeBuffer3);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put(zIsVideo ? Ascii.US : (byte) 0);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.put(sizeBuffer2);
        byteBufferAllocate.put(((Byte) Preconditions.checkNotNull(MimeTypes.getMp4ObjectTypeFromMimeType(str))).byteValue());
        byteBufferAllocate.put((byte) ((zIsVideo ? 16 : 20) | 1));
        byteBufferAllocate.putShort((short) (((zIsVideo ? 96000 : ViewUtils.EDGE_TO_EDGE_FLAGS) >> 8) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        byteBufferAllocate.put((byte) 0);
        if (i == -1) {
            i = 0;
        }
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt(i2 != -1 ? i2 : 0);
        byteBufferAllocate.put((byte) 5);
        byteBufferAllocate.put(sizeBuffer);
        byteBufferAllocate.put(vorbisInitializationData);
        vorbisInitializationData.rewind();
        byteBufferAllocate.put((byte) 6);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("esds", byteBufferAllocate);
    }

    private static long findMinimumPresentationTimestampUsAcrossTracks(List<Track> list) {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            Track track = list.get(i);
            if (!track.writtenSamples.isEmpty()) {
                jMin = Math.min(track.writtenSamples.get(0).presentationTimeUs, jMin);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            return jMin;
        }
        return -9223372036854775807L;
    }

    public static ByteBuffer ftyp() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ByteBuffer.wrap(Util.getUtf8Bytes("isom")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(131072);
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate);
        String[] strArr = {"isom", "iso2", "mp41"};
        for (int i = 0; i < 3; i++) {
            arrayList.add(ByteBuffer.wrap(Util.getUtf8Bytes(strArr[i])));
        }
        return BoxUtils.wrapBoxesIntoBox("ftyp", arrayList);
    }

    public static ByteBuffer getAxteBoxHeader(long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(Util.getUtf8Bytes("axte"));
        byteBufferAllocate.putLong(j2 + 16);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static DolbyVisionConfig getDolbyVisionConfig(Format format) {
        DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(new ParsableByteArray((byte[]) Iterables.getLast(format.initializationData)));
        if (dolbyVisionConfig != null || format.codecs == null) {
            return dolbyVisionConfig;
        }
        Pair<Integer, Integer> dolbyVisionProfileAndLevel = getDolbyVisionProfileAndLevel(format);
        Preconditions.checkNotNull(dolbyVisionProfileAndLevel, "Dolby Vision profile and level is not found.");
        return DolbyVisionConfig.parse(new ParsableByteArray(CodecSpecificDataUtil.buildDolbyVisionInitializationData(((Integer) dolbyVisionProfileAndLevel.first).intValue(), ((Integer) dolbyVisionProfileAndLevel.second).intValue())));
    }

    public static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(Format format) {
        Preconditions.checkNotNull(format.codecs, "Codec string is null for Dolby Vision format.");
        List<String> listSplitToList = Splitter.on(CoreConstants.DOT).splitToList(format.codecs);
        if (listSplitToList.size() >= 3) {
            return Pair.create(Integer.valueOf(Integer.parseInt(listSplitToList.get(1))), Integer.valueOf(Integer.parseInt(listSplitToList.get(2))));
        }
        Log.w("Boxes", "Invalid Dolby Vision codec string: " + format.codecs);
        return null;
    }

    private static String getDoviFourcc(Format format) {
        DolbyVisionConfig dolbyVisionConfig = getDolbyVisionConfig(format);
        Preconditions.checkNotNull(dolbyVisionConfig, "Dolby Vision Initialization data is not found for format: %s", format.sampleMimeType);
        int i = dolbyVisionConfig.profile;
        if (i == 5) {
            return "dvh1";
        }
        if (i == 8) {
            return "hvc1";
        }
        if (i == 9) {
            return "avc1";
        }
        throw new IllegalArgumentException("Unsupported profile " + dolbyVisionConfig.profile + " for format: " + format.sampleMimeType);
    }

    private static int getLastSampleDurationVu(List<Integer> list, int i, int i2) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            throw new IllegalArgumentException(d.n("Unexpected value for the last frame duration behavior ", i));
        }
        if (i2 != -1) {
            return i2;
        }
        if (list.size() < 2) {
            return 0;
        }
        return ((Integer) Iterables.getLast(list)).intValue();
    }

    private static ByteBuffer getSizeBuffer(int i) {
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        while (true) {
            arrayDeque.push(Byte.valueOf((byte) (i2 | (i & CertificateBody.profileType))));
            i >>= 7;
            if (i <= 0) {
                break;
            }
            i2 = 128;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(arrayDeque.size());
        while (!arrayDeque.isEmpty()) {
            byteBufferAllocate.put(((Byte) arrayDeque.removeFirst()).byteValue());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer hdlr(String str, String str2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(Util.getUtf8Bytes(str));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(Util.getUtf8Bytes(str2));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("hdlr", byteBufferAllocate);
    }

    private static ByteBuffer hvcCBox(Format format) {
        Preconditions.checkArgument(!format.initializationData.isEmpty(), "csd-0 not found in the format for hvcC box.");
        byte[] bArr = format.initializationData.get(0);
        Preconditions.checkArgument(bArr.length > 0, "csd-0 is empty for hvcC box.");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferWrap.limit() + 200);
        ImmutableList<ByteBuffer> immutableListFindNalUnits = AnnexBUtils.findNalUnits(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < immutableListFindNalUnits.size(); i++) {
            arrayList.add(AnnexBUtils.stripEmulationPrevention(immutableListFindNalUnits.get(i)));
        }
        byteBufferAllocate.put((byte) 1);
        ByteBuffer byteBuffer = (ByteBuffer) arrayList.get(0);
        if (byteBuffer.get(byteBuffer.position()) != 64) {
            throw new IllegalArgumentException("First NALU in csd-0 is not the VPS.");
        }
        byteBufferAllocate.put(byteBuffer.get(6));
        byteBufferAllocate.putInt(byteBuffer.getInt(7));
        byteBufferAllocate.putInt(byteBuffer.getInt(11));
        byteBufferAllocate.putShort(byteBuffer.getShort(15));
        byteBufferAllocate.put(byteBuffer.get(17));
        byteBufferAllocate.putShort((short) -4096);
        byteBufferAllocate.put((byte) -4);
        ByteBuffer byteBuffer2 = immutableListFindNalUnits.get(1);
        int iRemaining = byteBuffer2.remaining();
        byte[] bArr2 = new byte[iRemaining];
        byteBuffer2.get(bArr2);
        byteBuffer2.rewind();
        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr2, 0, iRemaining, null);
        byte b4 = (byte) (h265SpsNalUnit.chromaFormatIdc | Constants.TAG_FC_SPEED_MODE);
        byte b5 = (byte) (h265SpsNalUnit.bitDepthLumaMinus8 | Constants.TAG_FULL_SVPP_IDENTIFICATION);
        byte b7 = (byte) (h265SpsNalUnit.bitDepthChromaMinus8 | Constants.TAG_FULL_SVPP_IDENTIFICATION);
        byteBufferAllocate.put(b4);
        byteBufferAllocate.put(b5);
        byteBufferAllocate.put(b7);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put((byte) 15);
        byteBufferAllocate.put((byte) immutableListFindNalUnits.size());
        for (int i2 = 0; i2 < immutableListFindNalUnits.size(); i2++) {
            ByteBuffer byteBuffer3 = immutableListFindNalUnits.get(i2);
            byteBufferAllocate.put((byte) ((byteBuffer3.get(0) >> 1) & 63));
            byteBufferAllocate.putShort((short) 1);
            byteBufferAllocate.putShort((short) byteBuffer3.limit());
            byteBufferAllocate.put(byteBuffer3);
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("hvcC", byteBufferAllocate);
    }

    public static ByteBuffer ilst(List<MdtaMetadataEntry> list) {
        int i = 0;
        int length = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            length += list.get(i2).value.length + 24;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        while (i < list.size()) {
            int i3 = i + 1;
            MdtaMetadataEntry mdtaMetadataEntry = list.get(i);
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(mdtaMetadataEntry.value.length + 8);
            byteBufferAllocate2.putInt(mdtaMetadataEntry.typeIndicator);
            byteBufferAllocate2.putInt(mdtaMetadataEntry.localeIndicator);
            byteBufferAllocate2.put(mdtaMetadataEntry.value);
            byteBufferAllocate2.flip();
            ByteBuffer byteBufferWrapIntoBox = BoxUtils.wrapIntoBox("data", byteBufferAllocate2);
            byteBufferAllocate.putInt(byteBufferWrapIntoBox.remaining() + 8);
            byteBufferAllocate.putInt(i3);
            byteBufferAllocate.put(byteBufferWrapIntoBox);
            i = i3;
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("ilst", byteBufferAllocate);
    }

    public static ByteBuffer keys(List<MdtaMetadataEntry> list) {
        int length = 0;
        for (int i = 0; i < list.size(); i++) {
            length += list.get(i).key.length() + 8;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            byteBufferAllocate.put(BoxUtils.wrapIntoBox("mdta", ByteBuffer.wrap(Util.getUtf8Bytes(list.get(i2).key))));
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("keys", byteBufferAllocate);
    }

    private static short languageCodeFromString(String str) {
        if (str != null) {
            byte[] utf8Bytes = Util.getUtf8Bytes(str);
            if (utf8Bytes.length == 3) {
                return (short) (((utf8Bytes[2] & Ascii.US) + ((utf8Bytes[1] & Ascii.US) << 5) + ((utf8Bytes[0] & Ascii.US) << 10)) & 32767);
            }
        }
        return (short) 0;
    }

    public static ByteBuffer localUrl() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("url ", byteBufferAllocate);
    }

    public static ByteBuffer mdhd(long j2, int i, int i2, int i3, String str) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt((int) j2);
        byteBufferAllocate.putShort(languageCodeFromString(str));
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("mdhd", byteBufferAllocate);
    }

    public static ByteBuffer mdia(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("mdia", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer meta(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("meta", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer minf(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("minf", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer moov(List<Track> list, MetadataCollector metadataCollector, boolean z, int i) {
        long j2;
        ByteBuffer byteBufferStbl;
        String str;
        String str2;
        ByteBuffer byteBufferVmhd;
        int i2;
        long j3;
        ArrayList arrayList;
        Mp4TimestampData mp4TimestampData = metadataCollector.timestampData;
        int i3 = (int) mp4TimestampData.creationTimestampSeconds;
        int i5 = (int) mp4TimestampData.modificationTimestampSeconds;
        long jFindMinimumPresentationTimestampUsAcrossTracks = findMinimumPresentationTimestampUsAcrossTracks(list);
        if (!z && jFindMinimumPresentationTimestampUsAcrossTracks == -9223372036854775807L) {
            return ByteBuffer.allocate(0);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i6 = 0;
        long jMax = 0;
        int i21 = 1;
        while (i6 < list.size()) {
            Track track = list.get(i6);
            if (z || !track.writtenSamples.isEmpty()) {
                Format formatBuild = track.format;
                if (Objects.equals(formatBuild.sampleMimeType, "video/av01") && formatBuild.initializationData.isEmpty()) {
                    formatBuild = formatBuild.buildUpon().setInitializationData(ImmutableList.of((byte[]) Preconditions.checkNotNull(track.parsedCsd))).build();
                }
                String strBcp47LanguageTagToIso3 = bcp47LanguageTagToIso3(formatBuild.language);
                int i22 = i21;
                long j5 = jMax;
                List<Integer> listConvertPresentationTimestampsToDurationsVu = convertPresentationTimestampsToDurationsVu(track.writtenSamples, track.videoUnitTimebase(), i, track.endOfStreamTimestampUs);
                ArrayList arrayList4 = arrayList2;
                ArrayList arrayList5 = arrayList3;
                long jIntValue = 0;
                for (int i32 = 0; i32 < listConvertPresentationTimestampsToDurationsVu.size(); i32++) {
                    jIntValue += (long) listConvertPresentationTimestampsToDurationsVu.get(i32).intValue();
                }
                long j16 = track.writtenSamples.isEmpty() ? 0L : track.writtenSamples.get(0).presentationTimeUs;
                long jUsFromVu = usFromVu(jIntValue, track.videoUnitTimebase());
                if (j16 < 0) {
                    jUsFromVu -= Math.abs(j16);
                }
                int trackType = MimeTypes.getTrackType(formatBuild.sampleMimeType);
                ByteBuffer byteBufferStts = stts(listConvertPresentationTimestampsToDurationsVu);
                long j22 = jIntValue;
                ByteBuffer byteBufferCtts = MimeTypes.isVideo(formatBuild.sampleMimeType) ? ctts(track.writtenSamples, listConvertPresentationTimestampsToDurationsVu, track.videoUnitTimebase()) : ByteBuffer.allocate(0);
                ByteBuffer byteBufferStsz = stsz(track.writtenSamples);
                ByteBuffer byteBufferStsc = stsc(track.writtenChunkSampleCounts);
                List<Long> list2 = track.writtenChunkOffsets;
                ByteBuffer byteBufferStco = z ? stco(list2) : co64(list2);
                if (trackType == -1 || trackType == 5) {
                    j2 = jUsFromVu;
                    ByteBuffer byteBufferNmhd = nmhd();
                    byteBufferStbl = stbl(stsd(textMetaDataSampleEntry(formatBuild)), byteBufferStts, byteBufferStsz, byteBufferStsc, byteBufferStco);
                    str = "MetaHandle";
                    str2 = "meta";
                    byteBufferVmhd = byteBufferNmhd;
                } else if (trackType == 1) {
                    ByteBuffer byteBufferSmhd = smhd();
                    j2 = jUsFromVu;
                    byteBufferStbl = stbl(stsd(audioSampleEntry(formatBuild)), byteBufferStts, byteBufferStsz, byteBufferStsc, byteBufferStco);
                    str = "SoundHandle";
                    str2 = "soun";
                    byteBufferVmhd = byteBufferSmhd;
                } else {
                    if (trackType != 2) {
                        throw new IllegalArgumentException("Unsupported track type");
                    }
                    byteBufferVmhd = vmhd();
                    byteBufferStbl = stbl(stsd(videoSampleEntry(formatBuild)), byteBufferStts, byteBufferCtts, byteBufferStsz, byteBufferStsc, byteBufferStco, stss(track.writtenSamples));
                    j2 = jUsFromVu;
                    str2 = "vide";
                    str = "VideoHandle";
                }
                String str3 = str;
                i2 = i6;
                long j42 = j2;
                j3 = jFindMinimumPresentationTimestampUsAcrossTracks;
                ByteBuffer byteBufferTrak = trak(tkhd(i22, j2, i3, i5, metadataCollector.orientationData.orientation, formatBuild), edts(j16, jFindMinimumPresentationTimestampUsAcrossTracks, j42, 10000L, track.videoUnitTimebase()), mdia(mdhd(j22, track.videoUnitTimebase(), i3, i5, strBcp47LanguageTagToIso3), hdlr(str2, str3), minf(byteBufferVmhd, dinf(dref(localUrl())), byteBufferStbl)));
                arrayList2 = arrayList4;
                arrayList2.add(byteBufferTrak);
                jMax = Math.max(j5, j42);
                arrayList = arrayList5;
                arrayList.add(trex(i22));
                i21 = i22 + 1;
            } else {
                arrayList = arrayList3;
                j3 = jFindMinimumPresentationTimestampUsAcrossTracks;
                i2 = i6;
            }
            i6 = i2 + 1;
            arrayList3 = arrayList;
            jFindMinimumPresentationTimestampUsAcrossTracks = j3;
        }
        ArrayList arrayList6 = arrayList3;
        ByteBuffer byteBufferMvhd = mvhd(i21, i3, i5, jMax);
        ByteBuffer byteBufferUdta = udta(metadataCollector.locationData);
        ByteBuffer byteBufferAllocate = metadataCollector.metadataEntries.isEmpty() ? ByteBuffer.allocate(0) : meta(hdlr("mdta", ""), keys(Lists.newArrayList(metadataCollector.metadataEntries)), ilst(Lists.newArrayList(metadataCollector.metadataEntries)));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(byteBufferMvhd);
        arrayList7.add(byteBufferUdta);
        arrayList7.add(byteBufferAllocate);
        arrayList7.addAll(arrayList2);
        if (z) {
            arrayList7.add(mvex(arrayList6));
        }
        return BoxUtils.wrapBoxesIntoBox("moov", arrayList7);
    }

    public static ByteBuffer mvex(List<ByteBuffer> list) {
        return BoxUtils.wrapBoxesIntoBox("mvex", list);
    }

    public static ByteBuffer mvhd(int i, int i2, int i3, long j2) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putInt(10000);
        byteBufferAllocate.putInt((int) vuFromUs(j2, 10000L));
        byteBufferAllocate.putInt(65536);
        byteBufferAllocate.putShort((short) 256);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        int[] iArr = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824};
        for (int i5 = 0; i5 < 9; i5++) {
            byteBufferAllocate.putInt(iArr[i5]);
        }
        for (int i6 = 0; i6 < 6; i6++) {
            byteBufferAllocate.putInt(0);
        }
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("mvhd", byteBufferAllocate);
    }

    public static ByteBuffer nmhd() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("nmhd", byteBufferAllocate);
    }

    private static ByteBuffer parseVp9CodecPrivateFromCsd(byte[] bArr, int i) {
        byte b4 = 10;
        int i2 = 8;
        byte b5 = 0;
        int i3 = 0;
        for (int i5 = 0; i5 < bArr.length; i5 += 3) {
            byte b7 = bArr[i5];
            int i6 = i5 + 2;
            if (b7 == 1) {
                b5 = bArr[i6];
            } else if (b7 == 2) {
                b4 = bArr[i6];
            } else if (b7 == 3) {
                i2 = bArr[i6];
            } else if (b7 == 4) {
                i3 = bArr[i6];
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3);
        byteBufferAllocate.put(b5);
        byteBufferAllocate.put(b4);
        byteBufferAllocate.put((byte) (i | (i2 << 4) | (i3 << 1)));
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static ByteBuffer paspBox() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(65536);
        byteBufferAllocate.putInt(65536);
        byteBufferAllocate.rewind();
        return BoxUtils.wrapIntoBox("pasp", byteBufferAllocate);
    }

    private static byte[] rotationMatrixFromOrientation(int i) {
        if (i == 0) {
            return Util.toByteArray(65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824);
        }
        if (i == 90) {
            return Util.toByteArray(0, 65536, 0, -65536, 0, 0, 0, 0, 1073741824);
        }
        if (i == 180) {
            return Util.toByteArray(-65536, 0, 0, 0, -65536, 0, 0, 0, 1073741824);
        }
        if (i == 270) {
            return Util.toByteArray(0, -65536, 0, 65536, 0, 0, 0, 0, 1073741824);
        }
        throw new IllegalArgumentException(d.n("invalid orientation ", i));
    }

    private static ByteBuffer smDmBox(ColorInfo colorInfo) {
        byte[] bArr = colorInfo.hdrStaticInfo;
        if (bArr == null) {
            return ByteBuffer.allocate(0);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(bArr);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("SmDm", byteBufferAllocate);
    }

    public static ByteBuffer smhd() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("smhd", byteBufferAllocate);
    }

    public static ByteBuffer stbl(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("stbl", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer stco(List<Long> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 4) + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            long jLongValue = list.get(i).longValue();
            Preconditions.checkState(jLongValue <= BodyPartID.bodyIdMax, "Only 32-bit chunk offset is allowed");
            byteBufferAllocate.putInt((int) jLongValue);
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stco", byteBufferAllocate);
    }

    public static ByteBuffer stsc(List<Integer> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 12) + 200);
        byteBufferAllocate.putInt(0);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(0);
        int i = 1;
        int i2 = -1;
        int i3 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue = list.get(i5).intValue();
            if (iIntValue != i2) {
                byteBufferAllocate.putInt(i);
                byteBufferAllocate.putInt(iIntValue);
                byteBufferAllocate.putInt(1);
                i3++;
                i2 = iIntValue;
            }
            i++;
        }
        byteBufferAllocate.putInt(iPosition, i3);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stsc", byteBufferAllocate);
    }

    public static ByteBuffer stsd(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stsd", byteBufferAllocate);
    }

    public static ByteBuffer stss(List<BufferInfo> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 4) + 200);
        byteBufferAllocate.putInt(0);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(list.size());
        int i = 0;
        int i2 = 1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if ((list.get(i3).flags & 1) > 0) {
                byteBufferAllocate.putInt(i2);
                i++;
            }
            i2++;
        }
        byteBufferAllocate.putInt(iPosition, i);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stss", byteBufferAllocate);
    }

    public static ByteBuffer stsz(List<BufferInfo> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 4) + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            byteBufferAllocate.putInt(list.get(i).size);
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stsz", byteBufferAllocate);
    }

    public static ByteBuffer stts(List<Integer> list) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((list.size() * 8) + 200);
        byteBufferAllocate.putInt(0);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(0);
        int i = -1;
        long j2 = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue = list.get(i3).intValue();
            long j3 = iIntValue;
            if (j2 != j3) {
                int iPosition2 = byteBufferAllocate.position();
                byteBufferAllocate.putInt(1);
                byteBufferAllocate.putInt(iIntValue);
                i2++;
                i = iPosition2;
                j2 = j3;
            } else {
                byteBufferAllocate.putInt(i, byteBufferAllocate.getInt(i) + 1);
            }
        }
        byteBufferAllocate.putInt(iPosition, i2);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("stts", byteBufferAllocate);
    }

    public static ByteBuffer textMetaDataSampleEntry(Format format) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byte[] utf8Bytes = Util.getUtf8Bytes((String) Preconditions.checkNotNull(format.sampleMimeType));
        byteBufferAllocate.put(utf8Bytes);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put(utf8Bytes);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("mett", byteBufferAllocate);
    }

    public static ByteBuffer tkhd(int i, long j2, int i2, int i3, int i5, Format format) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(7);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt((int) vuFromUs(j2, 10000L));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort(MimeTypes.isAudio(format.sampleMimeType) ? (short) 256 : (short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put(rotationMatrixFromOrientation(i5));
        int i6 = format.width;
        if (i6 == -1) {
            i6 = 0;
        }
        int i21 = format.height;
        int i22 = i21 != -1 ? i21 : 0;
        byteBufferAllocate.putInt(i6 << 16);
        byteBufferAllocate.putInt(i22 << 16);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("tkhd", byteBufferAllocate);
    }

    public static ByteBuffer trak(ByteBuffer... byteBufferArr) {
        return BoxUtils.wrapBoxesIntoBox("trak", Arrays.asList(byteBufferArr));
    }

    public static ByteBuffer trex(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("trex", byteBufferAllocate);
    }

    public static ByteBuffer udta(Mp4LocationData mp4LocationData) {
        if (mp4LocationData == null) {
            return ByteBuffer.allocate(0);
        }
        String invariant = Util.formatInvariant("%+.4f%+.4f/", Float.valueOf(mp4LocationData.latitude), Float.valueOf(mp4LocationData.longitude));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(invariant.length() + 4);
        byteBufferAllocate.putShort((short) (byteBufferAllocate.capacity() - 4));
        byteBufferAllocate.putShort((short) 5575);
        byteBufferAllocate.put(Util.getUtf8Bytes(invariant));
        Preconditions.checkState(byteBufferAllocate.limit() == byteBufferAllocate.capacity());
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("udta", BoxUtils.wrapIntoBox(new byte[]{-87, 120, 121, 122}, byteBufferAllocate));
    }

    private static long usFromVu(long j2, long j3) {
        return Util.scaleLargeValue(j2, 1000000L, j3, RoundingMode.HALF_UP);
    }

    public static ByteBuffer videoSampleEntry(Format format) {
        ByteBuffer byteBufferCodecSpecificBox = codecSpecificBox(format);
        String strCodecSpecificFourcc = codecSpecificFourcc(format);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferCodecSpecificBox.limit() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        int i = format.width;
        byteBufferAllocate.putShort(i != -1 ? (short) i : (short) 0);
        int i2 = format.height;
        byteBufferAllocate.putShort(i2 != -1 ? (short) i2 : (short) 0);
        byteBufferAllocate.putInt(4718592);
        byteBufferAllocate.putInt(4718592);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putShort((short) 24);
        byteBufferAllocate.putShort((short) -1);
        byteBufferAllocate.put(byteBufferCodecSpecificBox);
        if (format.colorInfo != null && strCodecSpecificFourcc.equals("vp09")) {
            byteBufferAllocate.put(smDmBox(format.colorInfo));
        }
        byteBufferAllocate.put(paspBox());
        ColorInfo colorInfo = format.colorInfo;
        if (colorInfo != null) {
            byteBufferAllocate.put(colrBox(colorInfo));
        }
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox(strCodecSpecificFourcc, byteBufferAllocate);
    }

    public static ByteBuffer vmhd() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("vmhd", byteBufferAllocate);
    }

    private static ByteBuffer vpcCBox(Format format) {
        int i;
        int iColorSpaceToIsoMatrixCoefficients;
        int iColorTransferToIsoTransferCharacteristics;
        int iColorSpaceToIsoColorPrimaries = 1;
        Preconditions.checkArgument(!format.initializationData.isEmpty(), "csd-0 is not found in the format for vpcC box");
        byte[] bArr = format.initializationData.get(0);
        Preconditions.checkArgument(bArr.length > 3, "csd-0 for vp9 is invalid.");
        if (Ints.fromByteArray(bArr) == 16777216) {
            return BoxUtils.wrapIntoBox("vpcC", ByteBuffer.wrap(bArr));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(16777216);
        ColorInfo colorInfo = format.colorInfo;
        if (colorInfo == null || (i = colorInfo.colorRange) == -1) {
            i = 0;
        }
        byteBufferAllocate.put(parseVp9CodecPrivateFromCsd(bArr, i));
        ColorInfo colorInfo2 = format.colorInfo;
        if (colorInfo2 != null) {
            iColorSpaceToIsoColorPrimaries = ColorInfo.colorSpaceToIsoColorPrimaries(colorInfo2.colorSpace);
            iColorTransferToIsoTransferCharacteristics = ColorInfo.colorTransferToIsoTransferCharacteristics(format.colorInfo.colorTransfer);
            iColorSpaceToIsoMatrixCoefficients = ColorInfo.colorSpaceToIsoMatrixCoefficients(format.colorInfo.colorSpace);
        } else {
            iColorSpaceToIsoMatrixCoefficients = 1;
            iColorTransferToIsoTransferCharacteristics = 1;
        }
        byteBufferAllocate.put((byte) iColorSpaceToIsoColorPrimaries);
        byteBufferAllocate.put((byte) iColorTransferToIsoTransferCharacteristics);
        byteBufferAllocate.put((byte) iColorSpaceToIsoMatrixCoefficients);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return BoxUtils.wrapIntoBox("vpcC", byteBufferAllocate);
    }

    private static long vuFromUs(long j2, long j3) {
        return Util.scaleLargeValue(j2, j3, 1000000L, RoundingMode.HALF_UP);
    }
}
