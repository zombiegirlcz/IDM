package mem;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e implements CharSequence, Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xem.c f204793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f204794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char[] f204795c;
    public String d;
    public boolean e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f204796g;

    public e() {
        xem.c pool = g.f204797a;
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.f204793a = pool;
    }

    public final char[] a(int i) {
        ArrayList arrayList = this.f204794b;
        if (arrayList != null) {
            char[] cArr = this.f204795c;
            Intrinsics.h(cArr);
            return (char[]) arrayList.get(i / cArr.length);
        }
        if (i >= 2048) {
            e(i);
            throw null;
        }
        char[] cArr2 = this.f204795c;
        if (cArr2 != null) {
            return cArr2;
        }
        e(i);
        throw null;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) {
        char[] cArrD = d();
        char[] cArr = this.f204795c;
        Intrinsics.h(cArr);
        int length = cArr.length;
        int i = this.f;
        cArrD[length - i] = c2;
        this.d = null;
        this.f = i - 1;
        this.f204796g++;
        return this;
    }

    public final CharSequence b(int i, int i2) {
        if (i == i2) {
            return "";
        }
        StringBuilder sb6 = new StringBuilder(i2 - i);
        for (int i3 = i - (i % 2048); i3 < i2; i3 += 2048) {
            char[] cArrA = a(i3);
            int iMin = Math.min(i2 - i3, 2048);
            for (int iMax = Math.max(0, i - i3); iMax < iMin; iMax++) {
                sb6.append(cArrA[iMax]);
            }
        }
        return sb6;
    }

    public final char c(int i) {
        char[] cArrA = a(i);
        char[] cArr = this.f204795c;
        Intrinsics.h(cArr);
        return cArrA[i % cArr.length];
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("index is negative: " + i).toString());
        }
        if (i < this.f204796g) {
            return c(i);
        }
        throw new IllegalArgumentException(("index " + i + " is not in range [0, " + this.f204796g + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final char[] d() {
        if (this.f != 0) {
            char[] cArr = this.f204795c;
            Intrinsics.h(cArr);
            return cArr;
        }
        char[] cArr2 = (char[]) this.f204793a.n8();
        char[] cArr3 = this.f204795c;
        this.f204795c = cArr2;
        this.f = cArr2.length;
        this.e = false;
        if (cArr3 != null) {
            ArrayList arrayList = this.f204794b;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f204794b = arrayList;
                arrayList.add(cArr3);
            }
            arrayList.add(cArr2);
        }
        return cArr2;
    }

    public final void e(int i) {
        if (this.e) {
            throw new IllegalStateException("Buffer is already released");
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(i);
        sb6.append(" is not in range [0; ");
        char[] cArr = this.f204795c;
        Intrinsics.h(cArr);
        sb6.append(cArr.length - this.f);
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        throw new IndexOutOfBoundsException(sb6.toString());
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj2;
            if (this.f204796g == charSequence.length()) {
                int i = this.f204796g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (c(i2) != charSequence.charAt(i2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        int i = this.f204796g;
        int iC = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iC = (iC * 31) + c(i2);
        }
        return iC;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f204796g;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException(("startIndex (" + i + ") should be less or equal to endIndex (" + i2 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(("startIndex is negative: " + i).toString());
        }
        if (i2 <= this.f204796g) {
            return new d(this, i, i2);
        }
        throw new IllegalArgumentException(("endIndex (" + i2 + ") is greater than length (" + this.f204796g + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String string = b(0, this.f204796g).toString();
        this.d = string;
        return string;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            return this;
        }
        int i3 = i;
        while (i3 < i2) {
            char[] cArrD = d();
            int length = cArrD.length;
            int i5 = this.f;
            int i6 = length - i5;
            int iMin = Math.min(i2 - i3, i5);
            for (int i21 = 0; i21 < iMin; i21++) {
                cArrD[i6 + i21] = charSequence.charAt(i3 + i21);
            }
            i3 += iMin;
            this.f -= iMin;
        }
        this.d = null;
        this.f204796g += i2 - i;
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            return this;
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }
}
