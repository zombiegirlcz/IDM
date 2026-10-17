package mem;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes23.dex */
public final class d implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f204790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f204791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f204792c;
    public final /* synthetic */ e d;

    public d(e eVar, int i, int i2) {
        this.d = eVar;
        this.f204790a = i;
        this.f204791b = i2;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f204790a + i;
        if (i < 0) {
            throw new IllegalArgumentException(("index is negative: " + i).toString());
        }
        if (i2 < this.f204791b) {
            return this.d.c(i2);
        }
        throw new IllegalArgumentException(("index (" + i + ") should be less than length (" + length() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj2;
            if (charSequence.length() == length()) {
                int length = length();
                for (int i = 0; i < length; i++) {
                    if (this.d.c(this.f204790a + i) != charSequence.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f204792c;
        if (str != null) {
            return str.hashCode();
        }
        int iC = 0;
        for (int i = this.f204790a; i < this.f204791b; i++) {
            iC = (iC * 31) + this.d.c(i);
        }
        return iC;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f204791b - this.f204790a;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(("start is negative: " + i).toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        int i3 = this.f204791b;
        int i5 = this.f204790a;
        if (i2 > i3 - i5) {
            throw new IllegalArgumentException(("end should be less than length (" + length() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        if (i == i2) {
            return "";
        }
        return new d(this.d, i + i5, i5 + i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f204792c;
        if (str != null) {
            return str;
        }
        String string = this.d.b(this.f204790a, this.f204791b).toString();
        this.f204792c = string;
        return string;
    }
}
