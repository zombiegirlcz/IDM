package androidx.media3.common;

import a0.d;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.mlkit_vision_face.a;
import ehe.n;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ColorInfo {
    public final int chromaBitdepth;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    public final byte[] hdrStaticInfo;
    public final int lumaBitdepth;
    public static final ColorInfo SDR_BT709_LIMITED = new Builder().setColorSpace(1).setColorRange(2).setColorTransfer(3).build();
    public static final ColorInfo SRGB_BT709_FULL = new Builder().setColorSpace(1).setColorRange(1).setColorTransfer(2).build();
    private static final String FIELD_COLOR_SPACE = Util.intToStringMaxRadix(0);
    private static final String FIELD_COLOR_RANGE = Util.intToStringMaxRadix(1);
    private static final String FIELD_COLOR_TRANSFER = Util.intToStringMaxRadix(2);
    private static final String FIELD_HDR_STATIC_INFO = Util.intToStringMaxRadix(3);
    private static final String FIELD_LUMA_BITDEPTH = Util.intToStringMaxRadix(4);
    private static final String FIELD_CHROMA_BITDEPTH = Util.intToStringMaxRadix(5);

    public static final class Builder {
        private int chromaBitdepth;
        private int colorRange;
        private int colorSpace;
        private int colorTransfer;
        private byte[] hdrStaticInfo;
        private int lumaBitdepth;

        public ColorInfo build() {
            return new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, this.hdrStaticInfo, this.lumaBitdepth, this.chromaBitdepth);
        }

        public Builder setChromaBitdepth(int i) {
            this.chromaBitdepth = i;
            return this;
        }

        public Builder setColorRange(int i) {
            this.colorRange = i;
            return this;
        }

        public Builder setColorSpace(int i) {
            this.colorSpace = i;
            return this;
        }

        public Builder setColorTransfer(int i) {
            this.colorTransfer = i;
            return this;
        }

        public Builder setHdrStaticInfo(byte[] bArr) {
            this.hdrStaticInfo = bArr;
            return this;
        }

        public Builder setLumaBitdepth(int i) {
            this.lumaBitdepth = i;
            return this;
        }

        public Builder() {
            this.colorSpace = -1;
            this.colorRange = -1;
            this.colorTransfer = -1;
            this.lumaBitdepth = -1;
            this.chromaBitdepth = -1;
        }

        private Builder(ColorInfo colorInfo) {
            this.colorSpace = colorInfo.colorSpace;
            this.colorRange = colorInfo.colorRange;
            this.colorTransfer = colorInfo.colorTransfer;
            this.hdrStaticInfo = colorInfo.hdrStaticInfo;
            this.lumaBitdepth = colorInfo.lumaBitdepth;
            this.chromaBitdepth = colorInfo.chromaBitdepth;
        }
    }

    private static String chromaBitdepthToString(int i) {
        return i != -1 ? d.h(i, "bit Chroma") : "NA";
    }

    private static String colorRangeToString(int i) {
        return i != -1 ? i != 1 ? i != 2 ? d.n("Undefined color range ", i) : "Limited range" : "Full range" : "Unset color range";
    }

    public static int colorSpaceToIsoColorPrimaries(int i) {
        if (i != 2) {
            return i != 6 ? 1 : 9;
        }
        return 5;
    }

    public static int colorSpaceToIsoMatrixCoefficients(int i) {
        if (i != 2) {
            return i != 6 ? 1 : 9;
        }
        return 6;
    }

    private static String colorSpaceToString(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? d.n("Undefined color space ", i) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static int colorTransferToIsoTransferCharacteristics(int i) {
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 13;
        }
        if (i == 6) {
            return 16;
        }
        if (i != 7) {
            return i != 10 ? 1 : 4;
        }
        return 18;
    }

    private static String colorTransferToString(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? d.n("Undefined color transfer ", i) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean isEquivalentToAssumedSdrDefault(ColorInfo colorInfo) {
        if (colorInfo == null) {
            return true;
        }
        int i = colorInfo.colorSpace;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = colorInfo.colorRange;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = colorInfo.colorTransfer;
        if ((i3 != -1 && i3 != 3) || colorInfo.hdrStaticInfo != null) {
            return false;
        }
        int i5 = colorInfo.chromaBitdepth;
        if (i5 != -1 && i5 != 8) {
            return false;
        }
        int i6 = colorInfo.lumaBitdepth;
        return i6 == -1 || i6 == 8;
    }

    public static int isoColorPrimariesToColorSpace(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int isoTransferCharacteristicsToColorTransfer(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String lumaBitdepthToString(int i) {
        return i != -1 ? d.h(i, "bit Luma") : "NA";
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && ColorInfo.class == obj2.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj2;
            if (this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo) && this.lumaBitdepth == colorInfo.lumaBitdepth && this.chromaBitdepth == colorInfo.chromaBitdepth) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((n.b((((((527 + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31, 31, this.hdrStaticInfo) + this.lumaBitdepth) * 31) + this.chromaBitdepth;
        }
        return this.hashCode;
    }

    public boolean isBitdepthValid() {
        return (this.lumaBitdepth == -1 || this.chromaBitdepth == -1) ? false : true;
    }

    public boolean isDataSpaceValid() {
        return (this.colorSpace == -1 || this.colorRange == -1 || this.colorTransfer == -1) ? false : true;
    }

    public boolean isValid() {
        return isBitdepthValid() || isDataSpaceValid();
    }

    public String toLogString() {
        String str;
        String invariant = isDataSpaceValid() ? Util.formatInvariant("%s/%s/%s", colorSpaceToString(this.colorSpace), colorRangeToString(this.colorRange), colorTransferToString(this.colorTransfer)) : "NA/NA/NA";
        if (isBitdepthValid()) {
            str = this.lumaBitdepth + "/" + this.chromaBitdepth;
        } else {
            str = "NA/NA";
        }
        return a.o(invariant, "/", str);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("ColorInfo(");
        sb6.append(colorSpaceToString(this.colorSpace));
        sb6.append(", ");
        sb6.append(colorRangeToString(this.colorRange));
        sb6.append(", ");
        sb6.append(colorTransferToString(this.colorTransfer));
        sb6.append(", ");
        sb6.append(this.hdrStaticInfo != null);
        sb6.append(", ");
        sb6.append(lumaBitdepthToString(this.lumaBitdepth));
        sb6.append(", ");
        return v0.a.i(sb6, chromaBitdepthToString(this.chromaBitdepth), ")");
    }

    private ColorInfo(int i, int i2, int i3, byte[] bArr, int i5, int i6) {
        this.colorSpace = i;
        this.colorRange = i2;
        this.colorTransfer = i3;
        this.hdrStaticInfo = bArr;
        this.lumaBitdepth = i5;
        this.chromaBitdepth = i6;
    }
}
