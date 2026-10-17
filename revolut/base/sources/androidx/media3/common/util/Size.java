package androidx.media3.common.util;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class Size {
    private final int height;
    private final int width;
    public static final Size UNKNOWN = new Size(-1, -1);
    public static final Size ZERO = new Size(0, 0);
    private static final String FIELD_WIDTH = Util.intToStringMaxRadix(0);
    private static final String FIELD_HEIGHT = Util.intToStringMaxRadix(1);

    public Size(int i, int i2) {
        Preconditions.checkArgument((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.width = i;
        this.height = i2;
    }

    public boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof Size) {
            Size size = (Size) obj2;
            if (this.width == size.width && this.height == size.height) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i = this.height;
        int i2 = this.width;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
