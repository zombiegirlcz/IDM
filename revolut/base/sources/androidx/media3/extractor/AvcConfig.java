package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AvcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderFrames;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private AvcConfig(List<byte[]> list, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, float f, String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.width = i2;
        this.height = i3;
        this.bitdepthLuma = i5;
        this.bitdepthChroma = i6;
        this.colorSpace = i21;
        this.colorRange = i22;
        this.colorTransfer = i32;
        this.maxNumReorderFrames = i33;
        this.pixelWidthHeightRatio = f;
        this.codecs = str;
    }

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(unsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(parsableByteArray.getData(), position, unsignedShort);
    }

    public static AvcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        String strBuildAvcCodecString;
        int i;
        int i2;
        int i3;
        int i5;
        int i6;
        int i21;
        float f;
        int i22;
        int i32;
        try {
            parsableByteArray.skipBytes(4);
            int unsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
            for (int i33 = 0; i33 < unsignedByte2; i33++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            for (int i43 = 0; i43 < unsignedByte3; i43++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            if (unsignedByte2 > 0) {
                NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), NalUnitUtil.NAL_START_CODE.length, ((byte[]) arrayList.get(0)).length);
                int i59 = spsNalUnit.width;
                int i66 = spsNalUnit.height;
                int i74 = spsNalUnit.bitDepthLumaMinus8 + 8;
                int i92 = spsNalUnit.bitDepthChromaMinus8 + 8;
                int i96 = spsNalUnit.colorSpace;
                int i99 = spsNalUnit.colorRange;
                int i100 = spsNalUnit.colorTransfer;
                int i101 = spsNalUnit.maxNumReorderFrames;
                float f4 = spsNalUnit.pixelWidthHeightRatio;
                strBuildAvcCodecString = CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc);
                i6 = i100;
                i21 = i101;
                f = f4;
                i5 = i92;
                i22 = i96;
                i32 = i99;
                i = i59;
                i2 = i66;
                i3 = i74;
            } else {
                strBuildAvcCodecString = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i5 = -1;
                i6 = -1;
                i21 = 16;
                f = 1.0f;
                i22 = -1;
                i32 = -1;
            }
            return new AvcConfig(arrayList, unsignedByte, i, i2, i3, i5, i22, i32, i6, i21, f, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e);
        }
    }
}
