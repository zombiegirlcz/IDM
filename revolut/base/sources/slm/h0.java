package slm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class h0 extends a {
    public final String e;

    public h0(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.e = source;
    }

    @Override // slm.a
    public boolean c() {
        int i = this.f264232a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.f264232a = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f264232a = i;
                return a.u(cCharAt);
            }
            i++;
        }
    }

    @Override // slm.a
    public final String e() {
        h(CoreConstants.DOUBLE_QUOTE_CHAR);
        int i = this.f264232a;
        String str = this.e;
        int iS = kotlin.text.d0.S(str, CoreConstants.DOUBLE_QUOTE_CHAR, i, 4);
        if (iS == -1) {
            l();
            int i2 = this.f264232a;
            a.r(this, p.a.p("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < iS; i3++) {
            if (str.charAt(i3) == '\\') {
                return k(str, this.f264232a, i3);
            }
        }
        this.f264232a = iS + 1;
        String strSubstring = str.substring(i, iS);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.f264232a = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return 10;
     */
    @Override // slm.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte f() {
        /*
            r4 = this;
            int r0 = r4.f264232a
        L2:
            r1 = -1
            r2 = 10
            java.lang.String r3 = r4.e
            if (r0 == r1) goto L2d
            int r1 = r3.length()
            if (r0 >= r1) goto L2d
            int r1 = r0 + 1
            char r0 = r3.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L2b
            r2 = 13
            if (r0 == r2) goto L2b
            r2 = 9
            if (r0 != r2) goto L24
            goto L2b
        L24:
            r4.f264232a = r1
            byte r0 = slm.q.h(r0)
            return r0
        L2b:
            r0 = r1
            goto L2
        L2d:
            int r0 = r3.length()
            r4.f264232a = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: slm.h0.f():byte");
    }

    @Override // slm.a
    public void h(char c2) {
        int i = this.f264232a;
        if (i == -1) {
            D(c2);
            throw null;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.f264232a = -1;
                D(c2);
                throw null;
            }
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f264232a = i2;
                if (cCharAt == c2) {
                    return;
                }
                D(c2);
                throw null;
            }
            i = i2;
        }
    }

    @Override // slm.a
    public final CharSequence t() {
        return this.e;
    }

    @Override // slm.a
    public final String v(String keyToMatch, boolean z) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i = this.f264232a;
        try {
            if (f() == 6 && Intrinsics.f(x(z), keyToMatch)) {
                this.f264234c = null;
                if (f() == 5) {
                    return x(z);
                }
            }
            return null;
        } finally {
            this.f264232a = i;
            this.f264234c = null;
        }
    }

    @Override // slm.a
    public final int y(int i) {
        if (i < this.e.length()) {
            return i;
        }
        return -1;
    }

    @Override // slm.a
    public int z() {
        char cCharAt;
        int i = this.f264232a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.f264232a = i;
        return i;
    }
}
