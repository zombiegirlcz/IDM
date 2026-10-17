package slm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f264232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.q f264233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f264234c;
    public final StringBuilder d;

    public a() {
        e8.q qVar = new e8.q(3, (byte) 0);
        qVar.f123510c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        qVar.d = iArr;
        qVar.f123509b = -1;
        this.f264233b = qVar;
        this.d = new StringBuilder();
    }

    public static /* synthetic */ void r(a aVar, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = aVar.f264232a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        aVar.q(i, str, str2);
        throw null;
    }

    public static boolean u(char c2) {
        return (c2 == ',' || c2 == ':' || c2 == ']' || c2 == '}') ? false : true;
    }

    public String A(int i, int i2) {
        return t().subSequence(i, i2).toString();
    }

    public final boolean B() {
        int iZ = z();
        CharSequence charSequenceT = t();
        if (iZ >= charSequenceT.length() || iZ == -1 || charSequenceT.charAt(iZ) != ',') {
            return false;
        }
        this.f264232a++;
        return true;
    }

    public final boolean C(boolean z) {
        int iY = y(z());
        int length = t().length() - iY;
        if (length >= 4 && iY != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != t().charAt(iY + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || q.h(t().charAt(iY + 4)) != 0) {
                    if (z) {
                        this.f264232a = iY + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void D(char c2) {
        int i = this.f264232a;
        if (i > 0 && c2 == '\"') {
            try {
                this.f264232a = i - 1;
                String strL = l();
                this.f264232a = i;
                if (Intrinsics.f(strL, "null")) {
                    q(this.f264232a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th10) {
                this.f264232a = i;
                throw th10;
            }
        }
        String strT = q.t(q.h(c2));
        int i2 = this.f264232a;
        int i3 = i2 - 1;
        r(this, j6.a.s("Expected ", strT, ", but had '", (i2 == t().length() || i3 < 0) ? "EOF" : String.valueOf(t().charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public final int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.d.append((char) (s(i + 3, charSequence) + (s(i, charSequence) << 12) + (s(i + 1, charSequence) << 8) + (s(i + 2, charSequence) << 4)));
            return i2;
        }
        this.f264232a = i;
        o();
        if (this.f264232a + 4 < charSequence.length()) {
            return a(this.f264232a, charSequence);
        }
        r(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i, int i2) {
        this.d.append(t(), i, i2);
    }

    public abstract boolean c();

    public final void d(int i, String str) {
        if (t().length() - i < str.length()) {
            r(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (t().charAt(i + i2) | zsc.p.SPACE_CHAR)) {
                r(this, "Expected valid boolean literal prefix, but had '" + l() + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6);
                throw null;
            }
        }
        this.f264232a = str.length() + i;
    }

    public abstract String e();

    public abstract byte f();

    public final byte g(byte b4) {
        byte bF = f();
        if (bF == b4) {
            return bF;
        }
        String strT = q.t(b4);
        int i = this.f264232a;
        int i2 = i - 1;
        r(this, j6.a.s("Expected ", strT, ", but had '", (i == t().length() || i2 < 0) ? "EOF" : String.valueOf(t().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public abstract void h(char c2);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ab, code lost:
    
        r(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01b7, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b8, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ba, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bf, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        r(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ca, code lost:
    
        r(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010e, code lost:
    
        r(r21, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012c, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013f, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0141, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014d, code lost:
    
        if (t().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        r(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015b, code lost:
    
        r(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0162, code lost:
    
        r21.f264232a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0164, code lost:
    
        if (r20 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0166, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0169, code lost:
    
        if (r8 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016b, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0173, code lost:
    
        if (r8 != 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0175, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017a, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0185, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018f, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0191, code lost:
    
        r(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i() {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: slm.a.i():long");
    }

    public final String j() {
        String str = this.f264234c;
        if (str == null) {
            return e();
        }
        Intrinsics.h(str);
        this.f264234c = null;
        return str;
    }

    public final String k(CharSequence source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        char cCharAt = source.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                b(i, i2);
                int iY = y(i2 + 1);
                if (iY == -1) {
                    r(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iA = iY + 1;
                char cCharAt2 = t().charAt(iY);
                if (cCharAt2 == 'u') {
                    iA = a(iA, t());
                } else {
                    char c2 = cCharAt2 < 'u' ? j.f264267a[cCharAt2] : (char) 0;
                    if (c2 == 0) {
                        r(this, "Invalid escaped char '" + cCharAt2 + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6);
                        throw null;
                    }
                    this.d.append(c2);
                }
                i = y(iA);
                if (i == -1) {
                    r(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= source.length()) {
                    b(i, i2);
                    i = y(i2);
                    if (i == -1) {
                        r(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    cCharAt = source.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            cCharAt = source.charAt(i2);
        }
        String strA = !z ? A(i, i2) : n(i, i2);
        this.f264232a = i2 + 1;
        return strA;
    }

    public final String l() {
        String str = this.f264234c;
        if (str != null) {
            Intrinsics.h(str);
            this.f264234c = null;
            return str;
        }
        int iZ = z();
        if (iZ >= t().length() || iZ == -1) {
            r(this, "EOF", iZ, null, 4);
            throw null;
        }
        byte bH = q.h(t().charAt(iZ));
        if (bH == 1) {
            return j();
        }
        if (bH != 0) {
            r(this, "Expected beginning of the string, but got " + t().charAt(iZ), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (q.h(t().charAt(iZ)) == 0) {
            iZ++;
            if (iZ >= t().length()) {
                b(this.f264232a, iZ);
                int iY = y(iZ);
                if (iY == -1) {
                    this.f264232a = iZ;
                    return n(0, 0);
                }
                iZ = iY;
                z = true;
            }
        }
        String strA = !z ? A(this.f264232a, iZ) : n(this.f264232a, iZ);
        this.f264232a = iZ;
        return strA;
    }

    public final String m() {
        String strL = l();
        if (!Intrinsics.f(strL, "null") || t().charAt(this.f264232a - 1) == '\"') {
            return strL;
        }
        r(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final String n(int i, int i2) {
        b(i, i2);
        StringBuilder sb6 = this.d;
        String string = sb6.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb6.setLength(0);
        return string;
    }

    public void o() {
    }

    public final void p() {
        if (f() == 10) {
            return;
        }
        r(this, "Expected EOF after parsing, but had " + t().charAt(this.f264232a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final void q(int i, String message, String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbL = v0.a.l(message, " at path: ");
        sbL.append(this.f264233b.e());
        sbL.append(strConcat);
        throw q.d(t(), i, sbL.toString());
    }

    public final int s(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        r(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence t();

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("JsonReader(source='");
        sb6.append((Object) t());
        sb6.append("', currentPosition=");
        return j6.a.t(sb6, this.f264232a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public abstract String v(String str, boolean z);

    public byte w() {
        CharSequence charSequenceT = t();
        int i = this.f264232a;
        while (true) {
            int iY = y(i);
            if (iY == -1) {
                this.f264232a = iY;
                return (byte) 10;
            }
            char cCharAt = charSequenceT.charAt(iY);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f264232a = iY;
                return q.h(cCharAt);
            }
            i = iY + 1;
        }
    }

    public final String x(boolean z) {
        String strJ;
        byte bW = w();
        if (z) {
            if (bW != 1 && bW != 0) {
                return null;
            }
            strJ = l();
        } else {
            if (bW != 1) {
                return null;
            }
            strJ = j();
        }
        this.f264234c = strJ;
        return strJ;
    }

    public abstract int y(int i);

    public abstract int z();
}
