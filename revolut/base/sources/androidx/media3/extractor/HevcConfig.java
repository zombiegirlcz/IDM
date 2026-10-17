package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class HevcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int decodedHeight;
    public final int decodedWidth;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int maxSubLayers;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int stereoMode;
    public final NalUnitUtil.H265VpsData vpsData;
    public final int width;

    private HevcConfig(List<byte[]> list, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, int i43, int i59, int i66, float f, int i74, String str, NalUnitUtil.H265VpsData h265VpsData) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.maxSubLayers = i2;
        this.width = i3;
        this.height = i5;
        this.decodedWidth = i6;
        this.decodedHeight = i21;
        this.bitdepthLuma = i22;
        this.bitdepthChroma = i32;
        this.colorSpace = i33;
        this.colorRange = i43;
        this.colorTransfer = i59;
        this.stereoMode = i66;
        this.pixelWidthHeightRatio = f;
        this.maxNumReorderPics = i74;
        this.codecs = str;
        this.vpsData = h265VpsData;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        return parseImpl(parsableByteArray, false, null);
    }

    private static HevcConfig parseImpl(ParsableByteArray parsableByteArray, boolean z, NalUnitUtil.H265VpsData h265VpsData) throws ParserException {
        boolean z3;
        int i;
        NalUnitUtil.H265Sei3dRefDisplayInfoData h265Sei3dRefDisplayInfo;
        int i2;
        try {
            if (z) {
                parsableByteArray.skipBytes(4);
            } else {
                parsableByteArray.skipBytes(21);
            }
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i3 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                z3 = true;
                if (i5 >= unsignedByte2) {
                    break;
                }
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i21 = 0; i21 < unsignedShort; i21++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i6 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
                i5++;
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i6];
            NalUnitUtil.H265VpsData h265VpsData2 = h265VpsData;
            int i22 = -1;
            int i32 = -1;
            int i33 = -1;
            int i43 = -1;
            int i59 = -1;
            int i66 = -1;
            int i74 = -1;
            int i92 = -1;
            int i96 = -1;
            int i99 = -1;
            int i100 = -1;
            int i101 = -1;
            float f = 1.0f;
            String strBuildHevcCodecString = null;
            int i102 = 0;
            int i103 = 0;
            while (i102 < unsignedByte2) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                int i104 = i3;
                NalUnitUtil.H265VpsData h265VpsNalUnit = h265VpsData2;
                while (i104 < unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    boolean z4 = z3;
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i105 = unsignedByte;
                    System.arraycopy(bArr2, i3, bArr, i103, bArr2.length);
                    int length = i103 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 32 && i104 == 0) {
                        h265VpsNalUnit = NalUnitUtil.parseH265VpsNalUnit(bArr, length, length + unsignedShort4);
                        i = unsignedByte2;
                    } else {
                        if (unsignedByte3 == 33 && i104 == 0) {
                            NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4, h265VpsNalUnit);
                            i22 = h265SpsNalUnit.maxSubLayersMinus1 + 1;
                            i32 = h265SpsNalUnit.width;
                            int i106 = h265SpsNalUnit.height;
                            int i107 = h265SpsNalUnit.decodedWidth;
                            i = unsignedByte2;
                            int i108 = h265SpsNalUnit.decodedHeight;
                            i66 = h265SpsNalUnit.bitDepthLumaMinus8 + 8;
                            i74 = h265SpsNalUnit.bitDepthChromaMinus8 + 8;
                            int i109 = h265SpsNalUnit.colorSpace;
                            int i110 = h265SpsNalUnit.colorRange;
                            int i111 = h265SpsNalUnit.colorTransfer;
                            float f4 = h265SpsNalUnit.pixelWidthHeightRatio;
                            int i112 = h265SpsNalUnit.maxNumReorderPics;
                            NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = h265SpsNalUnit.profileTierLevel;
                            if (h265ProfileTierLevel != null) {
                                i2 = i112;
                                strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc);
                            } else {
                                i2 = i112;
                            }
                            f = f4;
                            i101 = i2;
                            i96 = i110;
                            i99 = i111;
                            i59 = i108;
                            i92 = i109;
                            i43 = i107;
                            i33 = i106;
                        } else {
                            i = unsignedByte2;
                            if (unsignedByte3 == 39 && i104 == 0 && (h265Sei3dRefDisplayInfo = NalUnitUtil.parseH265Sei3dRefDisplayInfo(bArr, length, length + unsignedShort4)) != null && h265VpsNalUnit != null) {
                                i3 = 0;
                                i100 = h265Sei3dRefDisplayInfo.leftViewId == h265VpsNalUnit.layerInfos.get(0).viewId ? 4 : 5;
                            }
                        }
                        i3 = 0;
                    }
                    i103 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i104++;
                    z3 = z4;
                    unsignedByte = i105;
                    unsignedByte2 = i;
                }
                i102++;
                h265VpsData2 = h265VpsNalUnit;
            }
            return new HevcConfig(i6 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), unsignedByte + 1, i22, i32, i33, i43, i59, i66, i74, i92, i96, i99, i100, f, i101, strBuildHevcCodecString, h265VpsData2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing".concat(z ? "L-HEVC config" : "HEVC config"), e);
        }
    }

    public static HevcConfig parseLayered(ParsableByteArray parsableByteArray, NalUnitUtil.H265VpsData h265VpsData) throws ParserException {
        return parseImpl(parsableByteArray, true, h265VpsData);
    }
}
