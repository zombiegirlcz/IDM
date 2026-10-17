package ch.qos.logback.core.pattern;

import p.a;

/* JADX INFO: loaded from: classes.dex */
public class FormatInfo {
    private boolean leftPad;
    private boolean leftTruncate;
    private int max;
    private int min;

    public FormatInfo() {
        this.min = Integer.MIN_VALUE;
        this.max = Integer.MAX_VALUE;
        this.leftPad = true;
        this.leftTruncate = true;
    }

    public static FormatInfo valueOf(String str) throws IllegalArgumentException {
        String strSubstring;
        if (str == null) {
            throw new NullPointerException("Argument cannot be null");
        }
        FormatInfo formatInfo = new FormatInfo();
        int iIndexOf = str.indexOf(46);
        if (iIndexOf != -1) {
            String strSubstring2 = str.substring(0, iIndexOf);
            int i = iIndexOf + 1;
            if (i == str.length()) {
                throw new IllegalArgumentException(a.p("Formatting string [", str, "] should not end with '.'"));
            }
            strSubstring = str.substring(i);
            str = strSubstring2;
        } else {
            strSubstring = null;
        }
        if (str != null && str.length() > 0) {
            int i2 = Integer.parseInt(str);
            if (i2 >= 0) {
                formatInfo.min = i2;
            } else {
                formatInfo.min = -i2;
                formatInfo.leftPad = false;
            }
        }
        if (strSubstring != null && strSubstring.length() > 0) {
            int i3 = Integer.parseInt(strSubstring);
            if (i3 >= 0) {
                formatInfo.max = i3;
                return formatInfo;
            }
            formatInfo.max = -i3;
            formatInfo.leftTruncate = false;
        }
        return formatInfo;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FormatInfo)) {
            return false;
        }
        FormatInfo formatInfo = (FormatInfo) obj2;
        return this.min == formatInfo.min && this.max == formatInfo.max && this.leftPad == formatInfo.leftPad && this.leftTruncate == formatInfo.leftTruncate;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public int hashCode() {
        return (((((this.min * 31) + this.max) * 31) + (this.leftPad ? 1 : 0)) * 31) + (this.leftTruncate ? 1 : 0);
    }

    public boolean isLeftPad() {
        return this.leftPad;
    }

    public boolean isLeftTruncate() {
        return this.leftTruncate;
    }

    public void setLeftPad(boolean z) {
        this.leftPad = z;
    }

    public void setLeftTruncate(boolean z) {
        this.leftTruncate = z;
    }

    public void setMax(int i) {
        this.max = i;
    }

    public void setMin(int i) {
        this.min = i;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("FormatInfo(");
        sb6.append(this.min);
        sb6.append(", ");
        sb6.append(this.max);
        sb6.append(", ");
        sb6.append(this.leftPad);
        sb6.append(", ");
        return com.google.android.gms.internal.mlkit_vision_face.a.t(sb6, this.leftTruncate, ")");
    }

    public FormatInfo(int i, int i2) {
        this.leftPad = true;
        this.leftTruncate = true;
        this.min = i;
        this.max = i2;
    }

    public FormatInfo(int i, int i2, boolean z, boolean z3) {
        this.min = i;
        this.max = i2;
        this.leftPad = z;
        this.leftTruncate = z3;
    }
}
