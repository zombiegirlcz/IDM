package androidx.media3.container;

import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.util.CodecSpecificDataUtil;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.math.DoubleMath;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class NalUnitUtil {
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    /* JADX INFO: loaded from: classes15.dex */
    public static final class H265LayerInfo {
        public final int layerIdInVps;
        public final int viewId;

        public H265LayerInfo(int i, int i2) {
            this.layerIdInVps = i;
            this.viewId = i2;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class H265NalHeader {
        public final int layerId;
        public final int nalUnitType;
        public final int temporalId;

        public H265NalHeader(int i, int i2, int i3) {
            this.nalUnitType = i;
            this.layerId = i2;
            this.temporalId = i3;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class H265ProfileTierLevel {
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;

        public H265ProfileTierLevel(int i, boolean z, int i2, int i3, int[] iArr, int i5) {
            this.generalProfileSpace = i;
            this.generalTierFlag = z;
            this.generalProfileIdc = i2;
            this.generalProfileCompatibilityFlags = i3;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i5;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class H265ProfileTierLevelsAndIndices {
        public final int[] indices;
        public final ImmutableList<H265ProfileTierLevel> profileTierLevels;

        public H265ProfileTierLevelsAndIndices(List<H265ProfileTierLevel> list, int[] iArr) {
            this.profileTierLevels = ImmutableList.copyOf((Collection) list);
            this.indices = iArr;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class H265RepFormat {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int height;
        public final int width;

        public H265RepFormat(int i, int i2, int i3, int i5, int i6) {
            this.chromaFormatIdc = i;
            this.bitDepthLumaMinus8 = i2;
            this.bitDepthChromaMinus8 = i3;
            this.width = i5;
            this.height = i6;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class H265RepFormatsAndIndices {
        public final int[] indices;
        public final ImmutableList<H265RepFormat> repFormats;

        public H265RepFormatsAndIndices(List<H265RepFormat> list, int[] iArr) {
            this.repFormats = ImmutableList.copyOf((Collection) list);
            this.indices = iArr;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class H265Sei3dRefDisplayInfoData {
        public final int exponentRefDisplayWidth;
        public final int exponentRefViewingDist;
        public final int leftViewId;
        public final int mantissaRefDisplayWidth;
        public final int mantissaRefViewingDist;
        public final int numRefDisplays;
        public final int precRefDisplayWidth;
        public final int precRefViewingDist;
        public final int rightViewId;

        public H265Sei3dRefDisplayInfoData(int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33) {
            this.precRefDisplayWidth = i;
            this.precRefViewingDist = i2;
            this.numRefDisplays = i3;
            this.leftViewId = i5;
            this.rightViewId = i6;
            this.exponentRefDisplayWidth = i21;
            this.mantissaRefDisplayWidth = i22;
            this.exponentRefViewingDist = i32;
            this.mantissaRefViewingDist = i33;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int decodedHeight;
        public final int decodedWidth;
        public final int height;
        public final int maxNumReorderPics;
        public final int maxSubLayersMinus1;
        public final H265NalHeader nalHeader;
        public final float pixelWidthHeightRatio;
        public final H265ProfileTierLevel profileTierLevel;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(H265NalHeader h265NalHeader, int i, H265ProfileTierLevel h265ProfileTierLevel, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, float f, int i43, int i59, int i66, int i74) {
            this.nalHeader = h265NalHeader;
            this.maxSubLayersMinus1 = i;
            this.profileTierLevel = h265ProfileTierLevel;
            this.chromaFormatIdc = i2;
            this.bitDepthLumaMinus8 = i3;
            this.bitDepthChromaMinus8 = i5;
            this.seqParameterSetId = i6;
            this.width = i21;
            this.height = i22;
            this.pixelWidthHeightRatio = f;
            this.maxNumReorderPics = i43;
            this.colorSpace = i59;
            this.colorRange = i66;
            this.colorTransfer = i74;
            this.decodedWidth = i32;
            this.decodedHeight = i33;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class H265VideoSignalInfo {
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;

        public H265VideoSignalInfo(int i, int i2, int i3) {
            this.colorSpace = i;
            this.colorRange = i2;
            this.colorTransfer = i3;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class H265VideoSignalInfosAndIndices {
        public final int[] indices;
        public final ImmutableList<H265VideoSignalInfo> videoSignalInfos;

        public H265VideoSignalInfosAndIndices(List<H265VideoSignalInfo> list, int[] iArr) {
            this.videoSignalInfos = ImmutableList.copyOf((Collection) list);
            this.indices = iArr;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class H265VpsData {
        public final ImmutableList<H265LayerInfo> layerInfos;
        public final H265NalHeader nalHeader;
        public final H265ProfileTierLevelsAndIndices profileTierLevelsAndIndices;
        public final H265RepFormatsAndIndices repFormatsAndIndices;
        public final H265VideoSignalInfosAndIndices videoSignalInfosAndIndices;

        public H265VpsData(H265NalHeader h265NalHeader, List<H265LayerInfo> list, H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices, H265RepFormatsAndIndices h265RepFormatsAndIndices, H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices) {
            this.nalHeader = h265NalHeader;
            this.layerInfos = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
            this.profileTierLevelsAndIndices = h265ProfileTierLevelsAndIndices;
            this.repFormatsAndIndices = h265RepFormatsAndIndices;
            this.videoSignalInfosAndIndices = h265VideoSignalInfosAndIndices;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i, int i2, boolean z) {
            this.picParameterSetId = i;
            this.seqParameterSetId = i2;
            this.bottomFieldPicOrderInFramePresentFlag = z;
        }
    }

    public static final class SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int maxNumReorderFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i, int i2, int i3, int i5, int i6, int i21, int i22, float f, int i32, int i33, boolean z, boolean z3, int i43, int i59, int i66, boolean z4, int i74, int i92, int i96, int i99) {
            this.profileIdc = i;
            this.constraintsFlagsAndReservedZero2Bits = i2;
            this.levelIdc = i3;
            this.seqParameterSetId = i5;
            this.maxNumRefFrames = i6;
            this.width = i21;
            this.height = i22;
            this.pixelWidthHeightRatio = f;
            this.bitDepthLumaMinus8 = i32;
            this.bitDepthChromaMinus8 = i33;
            this.separateColorPlaneFlag = z;
            this.frameMbsOnlyFlag = z3;
            this.frameNumLength = i43;
            this.picOrderCountType = i59;
            this.picOrderCntLsbLength = i66;
            this.deltaPicOrderAlwaysZeroFlag = z4;
            this.colorSpace = i74;
            this.colorRange = i92;
            this.colorTransfer = i96;
            this.maxNumReorderFrames = i99;
        }
    }

    private static int applyConformanceWindowToHeight(int i, int i2, int i3, int i5) {
        return i - ((i3 + i5) * (i2 == 1 ? 2 : 1));
    }

    private static int applyConformanceWindowToWidth(int i, int i2, int i3, int i5) {
        int i6 = 2;
        if (i2 != 1 && i2 != 2) {
            i6 = 1;
        }
        return i - ((i3 + i5) * i6);
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static String createCodecStringFromH265SpsPalyoad(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(4);
        int bits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        H265ProfileTierLevel h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, bits, null);
        return CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc);
    }

    public static int findNalUnit(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        Preconditions.checkState(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            clearPrefixFlags(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            clearPrefixFlags(zArr);
            return i - 1;
        }
        int i5 = i2 - 1;
        int i6 = i + 2;
        while (i6 < i5) {
            byte b4 = bArr[i6];
            if ((b4 & 254) == 0) {
                int i21 = i6 - 2;
                if (bArr[i21] == 0 && bArr[i6 - 1] == 0 && b4 == 1) {
                    clearPrefixFlags(zArr);
                    return i21;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i2 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i2;
    }

    private static ImmutableList<Integer> findNalUnitPositions(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        while (i < bArr.length) {
            int iFindNalUnit = findNalUnit(bArr, i, bArr.length, zArr);
            if (iFindNalUnit != bArr.length) {
                builder.add(Integer.valueOf(iFindNalUnit));
            }
            i = iFindNalUnit + 3;
        }
        return builder.build();
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static String getH265BaseLayerCodecsString(List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = list.get(i);
            int length = bArr.length;
            if (length > 3) {
                ImmutableList<Integer> immutableListFindNalUnitPositions = findNalUnitPositions(bArr);
                for (int i2 = 0; i2 < immutableListFindNalUnitPositions.size(); i2++) {
                    if (immutableListFindNalUnitPositions.get(i2).intValue() + 3 < length) {
                        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, immutableListFindNalUnitPositions.get(i2).intValue() + 3, length);
                        H265NalHeader h265NalHeader = parseH265NalHeader(parsableNalUnitBitArray);
                        if (h265NalHeader.nalUnitType == 33 && h265NalHeader.layerId == 0) {
                            return createCodecStringFromH265SpsPalyoad(parsableNalUnitBitArray);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int getH265NalUnitType(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    private static String getNalStructureMimeType(Format format) {
        String str;
        if (Objects.equals(format.sampleMimeType, "video/dolby-vision") && (str = format.codecs) != null) {
            if (str.startsWith("dva1") || format.codecs.startsWith("dvav")) {
                return "video/avc";
            }
            if (format.codecs.startsWith("dvh1") || format.codecs.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return format.sampleMimeType;
    }

    public static int getNalUnitType(byte[] bArr, int i) {
        return bArr[i + 3] & Ascii.US;
    }

    public static boolean isDependedOn(byte[] bArr, int i, int i2, Format format) {
        if (Objects.equals(format.sampleMimeType, "video/avc")) {
            return isH264NalUnitDependedOn(bArr[i]);
        }
        if (Objects.equals(format.sampleMimeType, "video/hevc")) {
            return isH265NalUnitDependedOn(bArr, i, i2, format);
        }
        return true;
    }

    public static boolean isH264NalUnitDependedOn(byte b4) {
        if (((b4 & 96) >> 5) != 0) {
            return true;
        }
        int i = b4 & Ascii.US;
        return (i == 1 || i == 9 || i == 14) ? false : true;
    }

    private static boolean isH265NalUnitDependedOn(byte[] bArr, int i, int i2, Format format) {
        H265NalHeader h265NalHeader = parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i, i2 + i));
        int i3 = h265NalHeader.nalUnitType;
        if (i3 == 35) {
            return false;
        }
        return (i3 <= 14 && i3 % 2 == 0 && h265NalHeader.temporalId == format.maxSubLayers - 1) ? false : true;
    }

    public static boolean isNalUnitSei(Format format, byte b4) {
        String nalStructureMimeType = getNalStructureMimeType(format);
        return (Objects.equals(nalStructureMimeType, "video/avc") && (b4 & Ascii.US) == 6) || (Objects.equals(nalStructureMimeType, "video/hevc") && ((b4 & 126) >> 1) == 39);
    }

    public static int numberOfBytesInNalUnitHeader(Format format) {
        String nalStructureMimeType = getNalStructureMimeType(format);
        if (Objects.equals(nalStructureMimeType, "video/avc")) {
            return 1;
        }
        return Objects.equals(nalStructureMimeType, "video/hevc") ? 2 : 0;
    }

    private static H265NalHeader parseH265NalHeader(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBit();
        return new H265NalHeader(parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.container.NalUnitUtil.H265ProfileTierLevel parseH265ProfileTierLevel(androidx.media3.container.ParsableNalUnitBitArray r19, boolean r20, int r21, androidx.media3.container.NalUnitUtil.H265ProfileTierLevel r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.readBits(r5)
            boolean r8 = r0.readBit()
            r9 = 5
            int r9 = r0.readBits(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.readBit()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.readBits(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.generalProfileSpace
            boolean r8 = r2.generalTierFlag
            int r9 = r2.generalProfileIdc
            int r11 = r2.generalProfileCompatibilityFlags
            int[] r4 = r2.constraintBytes
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.readBits(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.skipBits(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.skipBits(r6)
        L7b:
            androidx.media3.container.NalUnitUtil$H265ProfileTierLevel r12 = new androidx.media3.container.NalUnitUtil$H265ProfileTierLevel
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseH265ProfileTierLevel(androidx.media3.container.ParsableNalUnitBitArray, boolean, int, androidx.media3.container.NalUnitUtil$H265ProfileTierLevel):androidx.media3.container.NalUnitUtil$H265ProfileTierLevel");
    }

    private static H265RepFormat parseH265RepFormat(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int i;
        int i2;
        int bits;
        int bits2 = parsableNalUnitBitArray.readBits(16);
        int bits3 = parsableNalUnitBitArray.readBits(16);
        if (parsableNalUnitBitArray.readBit()) {
            int bits4 = parsableNalUnitBitArray.readBits(2);
            if (bits4 == 3) {
                parsableNalUnitBitArray.skipBit();
            }
            int bits5 = parsableNalUnitBitArray.readBits(4);
            bits = parsableNalUnitBitArray.readBits(4);
            i2 = bits5;
            i = bits4;
        } else {
            i = 0;
            i2 = 0;
            bits = 0;
        }
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            bits2 = applyConformanceWindowToWidth(bits2, i, unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2);
            bits3 = applyConformanceWindowToHeight(bits3, i, unsignedExpGolombCodedInt3, unsignedExpGolombCodedInt4);
        }
        return new H265RepFormat(i, i2, bits, bits2, bits3);
    }

    private static H265RepFormatsAndIndices parseH265RepFormatsAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int i2 = unsignedExpGolombCodedInt + 1;
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(i2);
        int[] iArr = new int[i];
        for (int i3 = 0; i3 < i2; i3++) {
            builderBuilderWithExpectedSize.add(parseH265RepFormat(parsableNalUnitBitArray));
        }
        int i5 = 1;
        if (i2 <= 1 || !parsableNalUnitBitArray.readBit()) {
            while (i5 < i) {
                iArr[i5] = Math.min(i5, unsignedExpGolombCodedInt);
                i5++;
            }
        } else {
            int iLog2 = DoubleMath.log2(i2, RoundingMode.CEILING);
            while (i5 < i) {
                iArr[i5] = parsableNalUnitBitArray.readBits(iLog2);
                i5++;
            }
        }
        return new H265RepFormatsAndIndices(builderBuilderWithExpectedSize.build(), iArr);
    }

    public static H265Sei3dRefDisplayInfoData parseH265Sei3dRefDisplayInfo(byte[] bArr, int i, int i2) {
        byte b4;
        int i3 = i + 2;
        int i5 = i2 - 1;
        while (true) {
            b4 = bArr[i5];
            if (b4 != 0 || i5 <= i3) {
                break;
            }
            i5--;
        }
        if (b4 != 0 && i5 > i3) {
            ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i3, i5 + 1);
            while (parsableNalUnitBitArray.canReadBits(16)) {
                int bits = parsableNalUnitBitArray.readBits(8);
                int i6 = 0;
                while (bits == 255) {
                    i6 += 255;
                    bits = parsableNalUnitBitArray.readBits(8);
                }
                int i21 = i6 + bits;
                int bits2 = parsableNalUnitBitArray.readBits(8);
                int i22 = 0;
                while (bits2 == 255) {
                    i22 += 255;
                    bits2 = parsableNalUnitBitArray.readBits(8);
                }
                int i32 = i22 + bits2;
                if (i32 == 0 || !parsableNalUnitBitArray.canReadBits(i32)) {
                    break;
                }
                if (i21 == 176) {
                    int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    boolean bit = parsableNalUnitBitArray.readBit();
                    int unsignedExpGolombCodedInt2 = bit ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
                    int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    int unsignedExpGolombCodedInt4 = -1;
                    int unsignedExpGolombCodedInt5 = -1;
                    int bits3 = -1;
                    int bits4 = -1;
                    int i33 = -1;
                    int bits5 = -1;
                    for (int i43 = 0; i43 <= unsignedExpGolombCodedInt3; i43++) {
                        unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        bits3 = parsableNalUnitBitArray.readBits(6);
                        if (bits3 == 63) {
                            return null;
                        }
                        bits4 = parsableNalUnitBitArray.readBits(bits3 == 0 ? Math.max(0, unsignedExpGolombCodedInt - 30) : Math.max(0, (bits3 + unsignedExpGolombCodedInt) - 31));
                        if (bit) {
                            int bits6 = parsableNalUnitBitArray.readBits(6);
                            if (bits6 == 63) {
                                return null;
                            }
                            i33 = bits6;
                            bits5 = parsableNalUnitBitArray.readBits(bits6 == 0 ? Math.max(0, unsignedExpGolombCodedInt2 - 30) : Math.max(0, (bits6 + unsignedExpGolombCodedInt2) - 31));
                        }
                        if (parsableNalUnitBitArray.readBit()) {
                            parsableNalUnitBitArray.skipBits(10);
                        }
                    }
                    return new H265Sei3dRefDisplayInfoData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt3 + 1, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, bits3, bits4, i33, bits5);
                }
                parsableNalUnitBitArray.skipBits(i32 * 8);
            }
        }
        return null;
    }

    public static H265SpsData parseH265SpsNalUnit(byte[] bArr, int i, int i2, H265VpsData h265VpsData) {
        return parseH265SpsNalUnitPayload(bArr, i + 2, i2, parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i, i2)), h265VpsData);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.container.NalUnitUtil.H265SpsData parseH265SpsNalUnitPayload(byte[] r20, int r21, int r22, androidx.media3.container.NalUnitUtil.H265NalHeader r23, androidx.media3.container.NalUnitUtil.H265VpsData r24) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseH265SpsNalUnitPayload(byte[], int, int, androidx.media3.container.NalUnitUtil$H265NalHeader, androidx.media3.container.NalUnitUtil$H265VpsData):androidx.media3.container.NalUnitUtil$H265SpsData");
    }

    private static H265VideoSignalInfo parseH265VideoSignalInfo(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(3);
        int i = parsableNalUnitBitArray.readBit() ? 1 : 2;
        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(parsableNalUnitBitArray.readBits(8));
        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(parsableNalUnitBitArray.readBits(8));
        parsableNalUnitBitArray.skipBits(8);
        return new H265VideoSignalInfo(iIsoColorPrimariesToColorSpace, i, iIsoTransferCharacteristicsToColorTransfer);
    }

    private static H265VideoSignalInfosAndIndices parseH265VideoSignalInfosAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i, int i2, int[] iArr) {
        if (!parsableNalUnitBitArray.readBit() ? parsableNalUnitBitArray.readBit() : true) {
            parsableNalUnitBitArray.skipBit();
        }
        boolean bit = parsableNalUnitBitArray.readBit();
        boolean bit2 = parsableNalUnitBitArray.readBit();
        if (bit || bit2) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i5 = 0; i5 < iArr[i3]; i5++) {
                    boolean bit3 = bit ? parsableNalUnitBitArray.readBit() : false;
                    boolean bit4 = bit2 ? parsableNalUnitBitArray.readBit() : false;
                    if (bit3) {
                        parsableNalUnitBitArray.skipBits(32);
                    }
                    if (bit4) {
                        parsableNalUnitBitArray.skipBits(18);
                    }
                }
            }
        }
        boolean bit5 = parsableNalUnitBitArray.readBit();
        int bits = bit5 ? parsableNalUnitBitArray.readBits(4) + 1 : i;
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(bits);
        int[] iArr2 = new int[i];
        for (int i6 = 0; i6 < bits; i6++) {
            builderBuilderWithExpectedSize.add(parseH265VideoSignalInfo(parsableNalUnitBitArray));
        }
        if (bit5 && bits > 1) {
            for (int i21 = 0; i21 < i; i21++) {
                iArr2[i21] = parsableNalUnitBitArray.readBits(4);
            }
        }
        return new H265VideoSignalInfosAndIndices(builderBuilderWithExpectedSize.build(), iArr2);
    }

    public static H265VpsData parseH265VpsNalUnit(byte[] bArr, int i, int i2) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i2);
        return parseH265VpsNalUnitPayload(parsableNalUnitBitArray, parseH265NalHeader(parsableNalUnitBitArray));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static H265VpsData parseH265VpsNalUnitPayload(ParsableNalUnitBitArray parsableNalUnitBitArray, H265NalHeader h265NalHeader) {
        int[] iArr;
        int i;
        int i2;
        int[] iArr2;
        H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i3;
        int i5;
        int i6;
        int[] iArr3;
        ImmutableList immutableList;
        int i21;
        boolean[][] zArr;
        int[] iArr4;
        int i22;
        int i32;
        parsableNalUnitBitArray.skipBits(4);
        boolean bit = parsableNalUnitBitArray.readBit();
        boolean bit2 = parsableNalUnitBitArray.readBit();
        int bits = parsableNalUnitBitArray.readBits(6);
        int i33 = bits + 1;
        int bits2 = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBits(17);
        H265ProfileTierLevel h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, bits2, null);
        boolean z = false;
        for (int i43 = parsableNalUnitBitArray.readBit() ? 0 : bits2; i43 <= bits2; i43++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        int bits3 = parsableNalUnitBitArray.readBits(6);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = new H265ProfileTierLevelsAndIndices(ImmutableList.of(h265ProfileTierLevel), new int[1]);
        Object[] objArr = i33 >= 2 && unsignedExpGolombCodedInt >= 2;
        Object[] objArr2 = bit && bit2;
        int i59 = bits3 + 1;
        Object[] objArr3 = i59 >= i33;
        if (objArr != true || objArr2 != true || objArr3 != true) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, unsignedExpGolombCodedInt, i59);
        int i66 = 1;
        int[] iArr6 = new int[unsignedExpGolombCodedInt];
        int[] iArr7 = new int[unsignedExpGolombCodedInt];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i74 = 1; i74 < unsignedExpGolombCodedInt; i74++) {
            int i92 = 0;
            for (int i96 = 0; i96 <= bits3; i96++) {
                if (parsableNalUnitBitArray.readBit()) {
                    iArr5[i74][i92] = i96;
                    iArr7[i74] = i96;
                    i92++;
                }
                iArr6[i74] = i92;
            }
        }
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(64);
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int i99 = 0;
            while (i99 < unsignedExpGolombCodedInt2) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (i99 == 0 || parsableNalUnitBitArray.readBit()) {
                    z = true;
                }
                skipH265HrdParameters(parsableNalUnitBitArray, z, bits2);
                i99++;
                z = false;
            }
        }
        if (!parsableNalUnitBitArray.readBit()) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        parsableNalUnitBitArray.byteAlign();
        H265ProfileTierLevel h265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, false, bits2, h265ProfileTierLevel);
        boolean bit3 = parsableNalUnitBitArray.readBit();
        int i100 = 6;
        boolean[] zArr2 = new boolean[16];
        int i101 = 0;
        for (int i102 = 0; i102 < 16; i102++) {
            boolean bit4 = parsableNalUnitBitArray.readBit();
            zArr2[i102] = bit4;
            if (bit4) {
                i101++;
            }
        }
        if (i101 == 0 || !zArr2[1]) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr8 = new int[i101];
        for (int i103 = 0; i103 < i101 - (bit3 ? 1 : 0); i103++) {
            iArr8[i103] = parsableNalUnitBitArray.readBits(3);
        }
        int[] iArr9 = new int[i101 + 1];
        if (bit3) {
            int i104 = 1;
            while (i104 < i101) {
                int[] iArr10 = iArr9;
                for (int i105 = 0; i105 < i104; i105++) {
                    iArr10[i104] = iArr8[i105] + 1 + iArr10[i104];
                }
                i104++;
                iArr9 = iArr10;
            }
            iArr = iArr9;
            iArr[i101] = 6;
        } else {
            iArr = iArr9;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) cls, i33, i101);
        int[] iArr12 = new int[i33];
        iArr12[0] = 0;
        boolean bit5 = parsableNalUnitBitArray.readBit();
        int i106 = 1;
        while (i106 < i33) {
            if (bit5) {
                i32 = i106;
                iArr12[i32] = parsableNalUnitBitArray.readBits(i100);
            } else {
                i32 = i106;
                iArr12[i32] = i32;
            }
            if (bit3) {
                for (int i107 = 0; i107 < i101; i107++) {
                    iArr11[i32][i107] = (iArr12[i32] & ((1 << iArr[r33]) - 1)) >> iArr[i107];
                }
            } else {
                int i108 = 0;
                while (i108 < i101) {
                    int i109 = i108;
                    iArr11[i32][i109] = parsableNalUnitBitArray.readBits(iArr8[i108] + 1);
                    i108 = i109 + 1;
                }
            }
            i106 = i32 + 1;
            i100 = 6;
        }
        int[] iArr13 = new int[i59];
        int i110 = 1;
        int i111 = 0;
        while (i111 < i33) {
            iArr13[iArr12[i111]] = -1;
            int[] iArr14 = iArr13;
            int i112 = 0;
            int i113 = 0;
            while (i112 < 16) {
                if (zArr2[i112]) {
                    if (i112 == i66) {
                        iArr14[iArr12[i111]] = iArr11[i111][i113];
                    }
                    i113++;
                }
                i112++;
                i66 = 1;
            }
            if (i111 > 0) {
                int i114 = 0;
                while (true) {
                    if (i114 >= i111) {
                        i110++;
                        break;
                    }
                    int i115 = i114;
                    if (iArr14[iArr12[i111]] == iArr14[iArr12[i114]]) {
                        break;
                    }
                    i114 = i115 + 1;
                }
            }
            i111++;
            iArr13 = iArr14;
            i66 = 1;
        }
        int[] iArr15 = iArr13;
        int bits4 = parsableNalUnitBitArray.readBits(4);
        if (i110 < 2 || bits4 == 0) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr16 = new int[i110];
        for (int i116 = 0; i116 < i110; i116++) {
            iArr16[i116] = parsableNalUnitBitArray.readBits(bits4);
        }
        int[] iArr17 = new int[i59];
        int i117 = 0;
        while (i117 < i33) {
            int[] iArr18 = iArr17;
            iArr18[Math.min(iArr12[i117], bits3)] = i117;
            i117++;
            iArr17 = iArr18;
        }
        int[] iArr19 = iArr17;
        ImmutableList.Builder builder = ImmutableList.builder();
        int i118 = 0;
        while (i118 <= bits3) {
            int i119 = i110;
            int[] iArr20 = iArr7;
            int iMin = Math.min(iArr15[i118], i119 - 1);
            builder.add(new H265LayerInfo(iArr19[i118], iMin >= 0 ? iArr16[iMin] : -1));
            i118++;
            i110 = i119;
            iArr7 = iArr20;
            iArr16 = iArr16;
        }
        int[] iArr21 = iArr7;
        ImmutableList immutableListBuild = builder.build();
        if (((H265LayerInfo) immutableListBuild.get(0)).viewId == -1) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int i120 = 1;
        while (true) {
            if (i120 > bits3) {
                i = -1;
                i2 = -1;
                break;
            }
            i = -1;
            if (((H265LayerInfo) immutableListBuild.get(i120)).viewId != -1) {
                i2 = i120;
                break;
            }
            i120++;
        }
        if (i2 == i) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i33, i33);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i33, i33);
        int i121 = 1;
        while (i121 < i33) {
            boolean[][] zArr5 = zArr4;
            for (int i122 = 0; i122 < i121; i122++) {
                boolean[] zArr6 = zArr3[i121];
                boolean[] zArr7 = zArr5[i121];
                boolean bit6 = parsableNalUnitBitArray.readBit();
                zArr7[i122] = bit6;
                zArr6[i122] = bit6;
            }
            i121++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i123 = 1; i123 < i33; i123++) {
            int i124 = 0;
            while (i124 < bits) {
                int[] iArr22 = iArr12;
                int i125 = 0;
                while (true) {
                    if (i125 < i123) {
                        boolean[] zArr9 = zArr8[i123];
                        if (zArr9[i125] && zArr8[i125][i124]) {
                            zArr9[i124] = true;
                            break;
                        }
                        i125++;
                    }
                }
                i124++;
                iArr12 = iArr22;
            }
        }
        int[] iArr23 = iArr12;
        int[] iArr24 = new int[i59];
        for (int i126 = 0; i126 < i33; i126++) {
            int i127 = 0;
            for (int i128 = 0; i128 < i126; i128++) {
                i127 += zArr3[i126][i128] ? 1 : 0;
            }
            iArr24[iArr23[i126]] = i127;
        }
        int i129 = 0;
        for (int i130 = 0; i130 < i33; i130++) {
            if (iArr24[iArr23[i130]] == 0) {
                i129++;
            }
        }
        if (i129 > 1) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr25 = new int[i33];
        int[] iArr26 = new int[unsignedExpGolombCodedInt];
        if (parsableNalUnitBitArray.readBit()) {
            iArr2 = iArr24;
            int i131 = 0;
            while (i131 < i33) {
                int i132 = i131;
                iArr25[i132] = parsableNalUnitBitArray.readBits(3);
                i131 = i132 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i33, bits2);
        }
        int i133 = 0;
        while (i133 < unsignedExpGolombCodedInt) {
            int i134 = i133;
            boolean[][] zArr10 = zArr3;
            int[] iArr27 = iArr25;
            int iMax = 0;
            for (int i135 = 0; i135 < iArr6[i134]; i135++) {
                iMax = Math.max(iMax, iArr27[((H265LayerInfo) immutableListBuild.get(iArr5[i134][i135])).layerIdInVps]);
            }
            iArr26[i134] = iMax + 1;
            i133 = i134 + 1;
            iArr25 = iArr27;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (parsableNalUnitBitArray.readBit()) {
            int i136 = 0;
            while (i136 < bits) {
                int i137 = i136 + 1;
                int i138 = i137;
                while (i138 < i33) {
                    if (zArr11[i138][i136]) {
                        i22 = i136;
                        parsableNalUnitBitArray.skipBits(3);
                    } else {
                        i22 = i136;
                    }
                    i138++;
                    i136 = i22;
                }
                i136 = i137;
            }
        }
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        ImmutableList.Builder builder2 = ImmutableList.builder();
        builder2.add(h265ProfileTierLevel);
        if (unsignedExpGolombCodedInt3 > 1) {
            builder2.add(h265ProfileTierLevel2);
            for (int i139 = 2; i139 < unsignedExpGolombCodedInt3; i139++) {
                h265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, parsableNalUnitBitArray.readBit(), bits2, h265ProfileTierLevel2);
                builder2.add(h265ProfileTierLevel2);
            }
        }
        ImmutableList immutableListBuild2 = builder2.build();
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + unsignedExpGolombCodedInt;
        if (unsignedExpGolombCodedInt4 > unsignedExpGolombCodedInt) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int bits5 = parsableNalUnitBitArray.readBits(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, unsignedExpGolombCodedInt4, i59);
        int[] iArr28 = new int[unsignedExpGolombCodedInt4];
        int i140 = 0;
        int[] iArr29 = new int[unsignedExpGolombCodedInt4];
        int i141 = 0;
        while (i141 < unsignedExpGolombCodedInt) {
            iArr28[i141] = i140;
            iArr29[i141] = iArr21[i141];
            if (bits5 == 0) {
                i21 = i141;
                zArr = zArr12;
                immutableList = immutableListBuild2;
                iArr4 = iArr28;
                Arrays.fill(zArr12[i21], i140, iArr6[i21], true);
                iArr4[i21] = iArr6[i21];
            } else {
                immutableList = immutableListBuild2;
                i21 = i141;
                zArr = zArr12;
                iArr4 = iArr28;
                if (bits5 == 1) {
                    int i142 = iArr21[i21];
                    for (int i143 = 0; i143 < iArr6[i21]; i143++) {
                        zArr[i21][i143] = iArr5[i21][i143] == i142;
                    }
                    iArr4[i21] = 1;
                } else {
                    i140 = 0;
                    zArr[0][0] = true;
                    iArr4[0] = 1;
                    i141 = i21 + 1;
                    zArr12 = zArr;
                    iArr28 = iArr4;
                    immutableListBuild2 = immutableList;
                }
            }
            i140 = 0;
            i141 = i21 + 1;
            zArr12 = zArr;
            iArr28 = iArr4;
            immutableListBuild2 = immutableList;
        }
        ImmutableList immutableList2 = immutableListBuild2;
        boolean[][] zArr13 = zArr12;
        int[] iArr30 = iArr28;
        int[] iArr31 = new int[i59];
        int i144 = 2;
        int[] iArr32 = new int[2];
        iArr32[1] = i59;
        iArr32[i140] = unsignedExpGolombCodedInt4;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr32);
        int i145 = 1;
        int i146 = 0;
        while (i145 < unsignedExpGolombCodedInt4) {
            if (bits5 == i144) {
                for (int i147 = 0; i147 < iArr6[i145]; i147++) {
                    zArr13[i145][i147] = parsableNalUnitBitArray.readBit();
                    int i148 = iArr30[i145];
                    boolean z3 = zArr13[i145][i147];
                    iArr30[i145] = i148 + (z3 ? 1 : 0);
                    if (z3) {
                        iArr29[i145] = iArr5[i145][i147];
                    }
                }
            }
            if (i146 == 0) {
                i3 = 0;
                if (iArr5[i145][0] == 0 && zArr13[i145][0]) {
                    for (int i149 = 1; i149 < iArr6[i145]; i149++) {
                        if (iArr5[i145][i149] == i2 && zArr13[i145][i2]) {
                            i146 = i145;
                        }
                    }
                }
            } else {
                i3 = 0;
            }
            int i150 = i3;
            while (i150 < iArr6[i145]) {
                if (unsignedExpGolombCodedInt3 > 1) {
                    zArr14[i145][i150] = zArr13[i145][i150];
                    i6 = i2;
                    iArr3 = iArr31;
                    i5 = unsignedExpGolombCodedInt3;
                    int iLog2 = DoubleMath.log2(unsignedExpGolombCodedInt3, RoundingMode.CEILING);
                    if (!zArr14[i145][i150]) {
                        int i151 = ((H265LayerInfo) immutableListBuild.get(iArr5[i145][i150])).layerIdInVps;
                        int i152 = i3;
                        while (true) {
                            if (i152 >= i150) {
                                break;
                            }
                            int i153 = i151;
                            if (zArr8[i153][((H265LayerInfo) immutableListBuild.get(iArr5[i145][i152])).layerIdInVps]) {
                                zArr14[i145][i150] = true;
                                break;
                            }
                            i152++;
                            i151 = i153;
                        }
                    }
                    if (zArr14[i145][i150]) {
                        if (i146 <= 0 || i145 != i146) {
                            parsableNalUnitBitArray.skipBits(iLog2);
                        } else {
                            iArr3[i150] = parsableNalUnitBitArray.readBits(iLog2);
                        }
                    }
                } else {
                    i5 = unsignedExpGolombCodedInt3;
                    i6 = i2;
                    iArr3 = iArr31;
                }
                i150++;
                i2 = i6;
                iArr31 = iArr3;
                unsignedExpGolombCodedInt3 = i5;
            }
            int i154 = unsignedExpGolombCodedInt3;
            int i155 = i2;
            int[] iArr33 = iArr31;
            if (iArr30[i145] == 1 && iArr2[iArr29[i145]] > 0) {
                parsableNalUnitBitArray.skipBit();
            }
            i145++;
            i2 = i155;
            iArr31 = iArr33;
            unsignedExpGolombCodedInt3 = i154;
            i144 = 2;
        }
        int[] iArr34 = iArr31;
        if (i146 == 0) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        H265RepFormatsAndIndices h265RepFormatsAndIndices = parseH265RepFormatsAndIndices(parsableNalUnitBitArray, i33);
        parsableNalUnitBitArray.skipBits(2);
        for (int i156 = 1; i156 < i33; i156++) {
            if (iArr2[iArr23[i156]] == 0) {
                parsableNalUnitBitArray.skipBit();
            }
        }
        skipH265DpbSize(parsableNalUnitBitArray, unsignedExpGolombCodedInt4, iArr26, iArr6, zArr14);
        skipToH265VuiPresentFlagAfterDpbSize(parsableNalUnitBitArray, i33, zArr11);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.byteAlign();
            h265VideoSignalInfosAndIndices = parseH265VideoSignalInfosAndIndices(parsableNalUnitBitArray, i33, unsignedExpGolombCodedInt, iArr26);
        } else {
            h265VideoSignalInfosAndIndices = null;
        }
        return new H265VpsData(h265NalHeader, immutableListBuild, new H265ProfileTierLevelsAndIndices(immutableList2, iArr34), h265RepFormatsAndIndices, h265VideoSignalInfosAndIndices);
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i, int i2) {
        return parsePpsNalUnitPayload(bArr, i + 1, i2);
    }

    public static PpsData parsePpsNalUnitPayload(byte[] bArr, int i, int i2) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i2);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static SpsData parseSpsNalUnit(byte[] bArr, int i, int i2) {
        return parseSpsNalUnitPayload(bArr, i + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnitPayload(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseSpsNalUnitPayload(byte[], int, int):androidx.media3.container.NalUnitUtil$SpsData");
    }

    private static void skipH265DpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i2 = 1; i2 < i; i2++) {
            boolean bit = parsableNalUnitBitArray.readBit();
            int i3 = 0;
            while (i3 < iArr[i2]) {
                if ((i3 <= 0 || !bit) ? i3 == 0 : parsableNalUnitBitArray.readBit()) {
                    for (int i5 = 0; i5 < iArr2[i2]; i5++) {
                        if (zArr[i2][i5]) {
                            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        }
                    }
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                i3++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void skipH265HrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z, int i) {
        ?? r92;
        ?? r110;
        boolean bit;
        boolean bit2;
        if (z) {
            boolean bit3 = parsableNalUnitBitArray.readBit();
            boolean bit4 = parsableNalUnitBitArray.readBit();
            if (bit3 || bit4) {
                bit = parsableNalUnitBitArray.readBit();
                if (bit) {
                    parsableNalUnitBitArray.skipBits(19);
                }
                parsableNalUnitBitArray.skipBits(8);
                if (bit) {
                    parsableNalUnitBitArray.skipBits(4);
                }
                parsableNalUnitBitArray.skipBits(15);
                r110 = bit4;
                r92 = bit3;
            } else {
                bit = false;
                r110 = bit4;
                r92 = bit3;
            }
        } else {
            r92 = 0;
            r110 = 0;
            bit = false;
        }
        for (int i2 = 0; i2 <= i; i2++) {
            boolean bit5 = parsableNalUnitBitArray.readBit();
            if (!bit5) {
                bit5 = parsableNalUnitBitArray.readBit();
            }
            if (bit5) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                bit2 = false;
            } else {
                bit2 = parsableNalUnitBitArray.readBit();
            }
            int unsignedExpGolombCodedInt = !bit2 ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
            int i3 = r92 + r110;
            for (int i5 = 0; i5 < i3; i5++) {
                for (int i6 = 0; i6 <= unsignedExpGolombCodedInt; i6++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    if (bit) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    parsableNalUnitBitArray.skipBit();
                }
            }
        }
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i5 = 0; i5 < iMin; i5++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    private static void skipH265ShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < unsignedExpGolombCodedInt; i3++) {
            if (i3 == 0 || !parsableNalUnitBitArray.readBit()) {
                int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr2 = new int[unsignedExpGolombCodedInt2];
                int i5 = 0;
                while (i5 < unsignedExpGolombCodedInt2) {
                    iArr2[i5] = (i5 > 0 ? iArr2[i5 - 1] : 0) - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                    i5++;
                }
                int[] iArr3 = new int[unsignedExpGolombCodedInt3];
                int i6 = 0;
                while (i6 < unsignedExpGolombCodedInt3) {
                    iArr3[i6] = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1 + (i6 > 0 ? iArr3[i6 - 1] : 0);
                    parsableNalUnitBitArray.skipBit();
                    i6++;
                }
                i = unsignedExpGolombCodedInt2;
                iArr = iArr2;
                i2 = unsignedExpGolombCodedInt3;
                iArrCopyOf = iArr3;
            } else {
                int i21 = i + i2;
                int unsignedExpGolombCodedInt4 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                int i22 = i21 + 1;
                boolean[] zArr = new boolean[i22];
                for (int i32 = 0; i32 <= i21; i32++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        zArr[i32] = true;
                    } else {
                        zArr[i32] = parsableNalUnitBitArray.readBit();
                    }
                }
                int[] iArr4 = new int[i22];
                int[] iArr5 = new int[i22];
                int i33 = 0;
                for (int i43 = i2 - 1; i43 >= 0; i43--) {
                    int i59 = iArrCopyOf[i43] + unsignedExpGolombCodedInt4;
                    if (i59 < 0 && zArr[i + i43]) {
                        iArr4[i33] = i59;
                        i33++;
                    }
                }
                if (unsignedExpGolombCodedInt4 < 0 && zArr[i21]) {
                    iArr4[i33] = unsignedExpGolombCodedInt4;
                    i33++;
                }
                for (int i66 = 0; i66 < i; i66++) {
                    int i74 = iArr[i66] + unsignedExpGolombCodedInt4;
                    if (i74 < 0 && zArr[i66]) {
                        iArr4[i33] = i74;
                        i33++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i33);
                int i92 = 0;
                for (int i96 = i - 1; i96 >= 0; i96--) {
                    int i99 = iArr[i96] + unsignedExpGolombCodedInt4;
                    if (i99 > 0 && zArr[i96]) {
                        iArr5[i92] = i99;
                        i92++;
                    }
                }
                if (unsignedExpGolombCodedInt4 > 0 && zArr[i21]) {
                    iArr5[i92] = unsignedExpGolombCodedInt4;
                    i92++;
                }
                for (int i100 = 0; i100 < i2; i100++) {
                    int i101 = iArrCopyOf[i100] + unsignedExpGolombCodedInt4;
                    if (i101 > 0 && zArr[i + i100]) {
                        iArr5[i92] = i101;
                        i92++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i92);
                iArr = iArrCopyOf2;
                i = i33;
                i2 = i92;
            }
        }
    }

    private static void skipHrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        parsableNalUnitBitArray.skipBits(8);
        for (int i = 0; i < unsignedExpGolombCodedInt; i++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBits(20);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i) {
        int signedExpGolombCodedInt = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i2) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i2 = signedExpGolombCodedInt;
            }
        }
    }

    private static void skipToH265VuiPresentFlagAfterDpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i, boolean[][] zArr) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 2;
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt);
        } else {
            for (int i2 = 1; i2 < i; i2++) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (zArr[i2][i3]) {
                        parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt);
                    }
                }
            }
        }
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i5 = 1; i5 <= unsignedExpGolombCodedInt2; i5++) {
            parsableNalUnitBitArray.skipBits(8);
        }
    }

    public static int unescapeStream(byte[] bArr, int i) {
        int i2;
        synchronized (scratchEscapePositionsLock) {
            int iFindNextUnescapeIndex = 0;
            int i3 = 0;
            while (iFindNextUnescapeIndex < i) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i);
                    if (iFindNextUnescapeIndex < i) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i3) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i3] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i3++;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            i2 = i - i3;
            int i5 = 0;
            int i6 = 0;
            for (int i21 = 0; i21 < i3; i21++) {
                int i22 = scratchEscapePositions[i21] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i22);
                int i32 = i5 + i22;
                int i33 = i32 + 1;
                bArr[i32] = 0;
                i5 = i32 + 2;
                bArr[i33] = 0;
                i6 += i22 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
