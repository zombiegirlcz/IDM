package androidx.camera.core;

/* JADX INFO: loaded from: classes15.dex */
public final class DynamicRange {
    private final int mBitDepth;
    private final int mEncoding;
    public static final DynamicRange UNSPECIFIED = new DynamicRange(0, 0);
    public static final DynamicRange SDR = new DynamicRange(1, 8);
    public static final DynamicRange HDR_UNSPECIFIED_10_BIT = new DynamicRange(2, 10);
    public static final DynamicRange HLG_10_BIT = new DynamicRange(3, 10);
    public static final DynamicRange HDR10_10_BIT = new DynamicRange(4, 10);
    public static final DynamicRange HDR10_PLUS_10_BIT = new DynamicRange(5, 10);
    public static final DynamicRange DOLBY_VISION_10_BIT = new DynamicRange(6, 10);
    public static final DynamicRange DOLBY_VISION_8_BIT = new DynamicRange(6, 8);

    public DynamicRange(int i, int i2) {
        this.mEncoding = i;
        this.mBitDepth = i2;
    }

    private static String getEncodingLabel(int i) {
        switch (i) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof DynamicRange) {
            DynamicRange dynamicRange = (DynamicRange) obj2;
            if (this.mEncoding == dynamicRange.getEncoding() && this.mBitDepth == dynamicRange.getBitDepth()) {
                return true;
            }
        }
        return false;
    }

    public int getBitDepth() {
        return this.mBitDepth;
    }

    public int getEncoding() {
        return this.mEncoding;
    }

    public int hashCode() {
        return ((this.mEncoding ^ 1000003) * 1000003) ^ this.mBitDepth;
    }

    public boolean is10BitHdr() {
        return isFullySpecified() && getEncoding() != 1 && getBitDepth() == 10;
    }

    public boolean isFullySpecified() {
        return (getEncoding() == 0 || getEncoding() == 2 || getBitDepth() == 0) ? false : true;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("DynamicRange@");
        sb6.append(Integer.toHexString(System.identityHashCode(this)));
        sb6.append("{encoding=");
        sb6.append(getEncodingLabel(this.mEncoding));
        sb6.append(", bitDepth=");
        return j6.a.v(sb6, "}", this.mBitDepth);
    }
}
