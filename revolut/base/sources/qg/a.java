package qg;

import a0.d;
import af.f;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.internal.j;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kg.e0;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f245599a;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f245604j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f245605l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String[] f245607n;
    public int[] o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e0 f245600b = e0.LEGACY_STRICT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char[] f245601c = new char[1024];
    public int d = 0;
    public int e = 0;
    public int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f245602g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f245603h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f245606m = 1;

    static {
        f.f3814b = new f(12);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f245605l = iArr;
        iArr[0] = 6;
        this.f245607n = new String[32];
        this.o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f245599a = reader;
    }

    public b A() {
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        switch (iH) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void B(int i) throws MalformedJsonException {
        int i2 = this.f245606m;
        if (i2 - 1 >= 255) {
            throw new MalformedJsonException("Nesting limit 255 reached" + p());
        }
        int[] iArr = this.f245605l;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f245605l = Arrays.copyOf(iArr, i3);
            this.o = Arrays.copyOf(this.o, i3);
            this.f245607n = (String[]) Arrays.copyOf(this.f245607n, i3);
        }
        int[] iArr2 = this.f245605l;
        int i5 = this.f245606m;
        this.f245606m = i5 + 1;
        iArr2[i5] = i;
    }

    public final char C() throws MalformedJsonException {
        int i;
        if (this.d == this.e && !k(1)) {
            I("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.d;
        int i3 = i2 + 1;
        this.d = i3;
        char[] cArr = this.f245601c;
        char c2 = cArr[i2];
        if (c2 != '\n') {
            if (c2 != '\"') {
                if (c2 != '\'') {
                    if (c2 != '/' && c2 != '\\') {
                        if (c2 == 'b') {
                            return '\b';
                        }
                        if (c2 == 'f') {
                            return '\f';
                        }
                        if (c2 == 'n') {
                            return '\n';
                        }
                        if (c2 == 'r') {
                            return '\r';
                        }
                        if (c2 == 't') {
                            return '\t';
                        }
                        if (c2 != 'u') {
                            I("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.e && !k(4)) {
                            I("Unterminated escape sequence");
                            throw null;
                        }
                        int i5 = this.d;
                        int i6 = i5 + 4;
                        int i21 = 0;
                        while (i5 < i6) {
                            char c3 = cArr[i5];
                            int i22 = i21 << 4;
                            if (c3 >= '0' && c3 <= '9') {
                                i = c3 - '0';
                            } else if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'W';
                            } else {
                                if (c3 < 'A' || c3 > 'F') {
                                    I("Malformed Unicode escape \\u".concat(new String(cArr, this.d, 4)));
                                    throw null;
                                }
                                i = c3 - '7';
                            }
                            i21 = i + i22;
                            i5++;
                        }
                        this.d += 4;
                        return (char) i21;
                    }
                }
            }
            return c2;
        }
        if (this.f245600b == e0.STRICT) {
            I("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f++;
        this.f245602g = i3;
        if (this.f245600b == e0.STRICT) {
            I("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c2;
    }

    public final void D(e0 e0Var) {
        Objects.requireNonNull(e0Var);
        this.f245600b = e0Var;
    }

    public final void E(char c2) throws MalformedJsonException {
        do {
            int i = this.d;
            int i2 = this.e;
            while (i < i2) {
                int i3 = i + 1;
                char c3 = this.f245601c[i];
                if (c3 == c2) {
                    this.d = i3;
                    return;
                }
                if (c3 == '\\') {
                    this.d = i3;
                    C();
                    i = this.d;
                    i2 = this.e;
                } else {
                    if (c3 == '\n') {
                        this.f++;
                        this.f245602g = i3;
                    }
                    i = i3;
                }
            }
            this.d = i;
        } while (k(1));
        I("Unterminated string");
        throw null;
    }

    public final void F() {
        char c2;
        do {
            if (this.d >= this.e && !k(1)) {
                return;
            }
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            c2 = this.f245601c[i];
            if (c2 == '\n') {
                this.f++;
                this.f245602g = i2;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() throws com.google.gson.stream.MalformedJsonException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.d
            int r2 = r1 + r0
            int r3 = r4.e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f245601c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.g()
        L4b:
            int r1 = r4.d
            int r1 = r1 + r0
            r4.d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.d = r1
            r0 = 1
            boolean r0 = r4.k(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.a.G():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void H() {
        int i = 0;
        do {
            int iH = this.f245603h;
            if (iH == 0) {
                iH = h();
            }
            switch (iH) {
                case 1:
                    B(3);
                    i++;
                    this.f245603h = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f245607n[this.f245606m - 1] = null;
                    }
                    this.f245606m--;
                    i--;
                    this.f245603h = 0;
                    break;
                case 3:
                    B(1);
                    i++;
                    this.f245603h = 0;
                    break;
                case 4:
                    this.f245606m--;
                    i--;
                    this.f245603h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f245603h = 0;
                    break;
                case 8:
                    E(CoreConstants.SINGLE_QUOTE_CHAR);
                    this.f245603h = 0;
                    break;
                case 9:
                    E(CoreConstants.DOUBLE_QUOTE_CHAR);
                    this.f245603h = 0;
                    break;
                case 10:
                    G();
                    this.f245603h = 0;
                    break;
                case 12:
                    E(CoreConstants.SINGLE_QUOTE_CHAR);
                    if (i == 0) {
                        this.f245607n[this.f245606m - 1] = "<skipped>";
                    }
                    this.f245603h = 0;
                    break;
                case 13:
                    E(CoreConstants.DOUBLE_QUOTE_CHAR);
                    if (i == 0) {
                        this.f245607n[this.f245606m - 1] = "<skipped>";
                    }
                    this.f245603h = 0;
                    break;
                case 14:
                    G();
                    if (i == 0) {
                        this.f245607n[this.f245606m - 1] = "<skipped>";
                    }
                    this.f245603h = 0;
                    break;
                case 16:
                    this.d += this.f245604j;
                    this.f245603h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.o;
        int i2 = this.f245606m - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final void I(String str) throws MalformedJsonException {
        StringBuilder sbS = p.a.s(str);
        sbS.append(p());
        sbS.append("\nSee ");
        sbS.append(j.f("malformed-json"));
        throw new MalformedJsonException(sbS.toString());
    }

    public final IllegalStateException K(String str) {
        String str2 = A() == b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Expected ", str, " but was ");
        sbX.append(A());
        sbX.append(p());
        sbX.append("\nSee ");
        sbX.append(j.f(str2));
        return new IllegalStateException(sbX.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f245603h = 0;
        this.f245605l[0] = 8;
        this.f245606m = 1;
        this.f245599a.close();
    }

    public void d() throws IOException {
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 3) {
            throw K("BEGIN_ARRAY");
        }
        B(1);
        this.o[this.f245606m - 1] = 0;
        this.f245603h = 0;
    }

    public void f() {
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 1) {
            throw K("BEGIN_OBJECT");
        }
        B(3);
        this.f245603h = 0;
    }

    public final void g() throws MalformedJsonException {
        if (this.f245600b == e0.LENIENT) {
            return;
        }
        I("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public String getPath() {
        return l(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x021e, code lost:
    
        if (o(r12) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0276 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.a.h():int");
    }

    public void i() throws IOException {
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 4) {
            throw K("END_ARRAY");
        }
        int i = this.f245606m;
        this.f245606m = i - 1;
        int[] iArr = this.o;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f245603h = 0;
    }

    public void j() {
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 2) {
            throw K("END_OBJECT");
        }
        int i = this.f245606m;
        int i2 = i - 1;
        this.f245606m = i2;
        this.f245607n[i2] = null;
        int[] iArr = this.o;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f245603h = 0;
    }

    public final boolean k(int i) throws IOException {
        int i2;
        int i3;
        int i5 = this.f245602g;
        int i6 = this.d;
        this.f245602g = i5 - i6;
        int i21 = this.e;
        char[] cArr = this.f245601c;
        if (i21 != i6) {
            int i22 = i21 - i6;
            this.e = i22;
            System.arraycopy(cArr, i6, cArr, 0, i22);
        } else {
            this.e = 0;
        }
        this.d = 0;
        do {
            int i32 = this.e;
            int i33 = this.f245599a.read(cArr, i32, cArr.length - i32);
            if (i33 == -1) {
                return false;
            }
            i2 = this.e + i33;
            this.e = i2;
            if (this.f == 0 && (i3 = this.f245602g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.d++;
                this.f245602g = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final String l(boolean z) {
        StringBuilder sb6 = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f245606m;
            if (i >= i2) {
                return sb6.toString();
            }
            int i3 = this.f245605l[i];
            switch (i3) {
                case 1:
                case 2:
                    int i5 = this.o[i];
                    if (z && i5 > 0 && i == i2 - 1) {
                        i5--;
                    }
                    sb6.append('[');
                    sb6.append(i5);
                    sb6.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb6.append(CoreConstants.DOT);
                    String str = this.f245607n[i];
                    if (str != null) {
                        sb6.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(d.n("Unknown scope value: ", i3));
            }
            i++;
        }
    }

    public String m() {
        return l(true);
    }

    public boolean n() throws IOException {
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        return (iH == 2 || iH == 4 || iH == 17) ? false : true;
    }

    public final boolean o(char c2) throws MalformedJsonException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        g();
        return false;
    }

    final String p() {
        StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w(" at line ", this.f + 1, (this.d - this.f245602g) + 1, " column ", " path ");
        sbW.append(getPath());
        return sbW.toString();
    }

    public boolean q() throws IOException {
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 5) {
            this.f245603h = 0;
            int[] iArr = this.o;
            int i = this.f245606m - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iH != 6) {
            throw K("a boolean");
        }
        this.f245603h = 0;
        int[] iArr2 = this.o;
        int i2 = this.f245606m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public double r() throws IOException {
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.f245603h = 0;
            int[] iArr = this.o;
            int i = this.f245606m - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iH == 16) {
            this.k = new String(this.f245601c, this.d, this.f245604j);
            this.d += this.f245604j;
        } else if (iH == 8 || iH == 9) {
            this.k = x(iH == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (iH == 10) {
            this.k = z();
        } else if (iH != 11) {
            throw K("a double");
        }
        this.f245603h = 11;
        double d = Double.parseDouble(this.k);
        if (this.f245600b != e0.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            I("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.k = null;
        this.f245603h = 0;
        int[] iArr2 = this.o;
        int i2 = this.f245606m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public int s() throws IOException {
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            long j2 = this.i;
            int i = (int) j2;
            if (j2 != i) {
                throw new NumberFormatException("Expected an int but was " + this.i + p());
            }
            this.f245603h = 0;
            int[] iArr = this.o;
            int i2 = this.f245606m - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iH == 16) {
            this.k = new String(this.f245601c, this.d, this.f245604j);
            this.d += this.f245604j;
        } else {
            if (iH != 8 && iH != 9 && iH != 10) {
                throw K("an int");
            }
            if (iH == 10) {
                this.k = z();
            } else {
                this.k = x(iH == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                int i3 = Integer.parseInt(this.k);
                this.f245603h = 0;
                int[] iArr2 = this.o;
                int i5 = this.f245606m - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f245603h = 11;
        double d = Double.parseDouble(this.k);
        int i6 = (int) d;
        if (i6 != d) {
            throw new NumberFormatException("Expected an int but was " + this.k + p());
        }
        this.k = null;
        this.f245603h = 0;
        int[] iArr3 = this.o;
        int i21 = this.f245606m - 1;
        iArr3[i21] = iArr3[i21] + 1;
        return i6;
    }

    public long t() throws IOException {
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.f245603h = 0;
            int[] iArr = this.o;
            int i = this.f245606m - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iH == 16) {
            this.k = new String(this.f245601c, this.d, this.f245604j);
            this.d += this.f245604j;
        } else {
            if (iH != 8 && iH != 9 && iH != 10) {
                throw K("a long");
            }
            if (iH == 10) {
                this.k = z();
            } else {
                this.k = x(iH == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                long j2 = Long.parseLong(this.k);
                this.f245603h = 0;
                int[] iArr2 = this.o;
                int i2 = this.f245606m - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f245603h = 11;
        double d = Double.parseDouble(this.k);
        long j3 = (long) d;
        if (j3 != d) {
            throw new NumberFormatException("Expected a long but was " + this.k + p());
        }
        this.k = null;
        this.f245603h = 0;
        int[] iArr3 = this.o;
        int i3 = this.f245606m - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j3;
    }

    public String toString() {
        return getClass().getSimpleName() + p();
    }

    public String u() throws IOException {
        String strX;
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 14) {
            strX = z();
        } else if (iH == 12) {
            strX = x(CoreConstants.SINGLE_QUOTE_CHAR);
        } else {
            if (iH != 13) {
                throw K("a name");
            }
            strX = x(CoreConstants.DOUBLE_QUOTE_CHAR);
        }
        this.f245603h = 0;
        this.f245607n[this.f245606m - 1] = strX;
        return strX;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int v(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.a.v(boolean):int");
    }

    public void w() {
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 7) {
            throw K("null");
        }
        this.f245603h = 0;
        int[] iArr = this.o;
        int i = this.f245606m - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        r11.d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String x(char r12) throws com.google.gson.stream.MalformedJsonException {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.d
            int r3 = r11.e
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f245601c
            if (r2 >= r4) goto L6c
            int r8 = r2 + 1
            char r2 = r7[r2]
            kg.e0 r9 = r11.f245600b
            kg.e0 r10 = kg.e0.STRICT
            if (r9 != r10) goto L24
            r9 = 32
            if (r2 < r9) goto L1e
            goto L24
        L1e:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.I(r12)
            throw r0
        L24:
            if (r2 != r12) goto L3a
            r11.d = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L32
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L32:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L3a:
            r9 = 92
            if (r2 != r9) goto L5f
            r11.d = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L50
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L50:
            r1.append(r7, r3, r2)
            char r2 = r11.C()
            r1.append(r2)
            int r2 = r11.d
            int r3 = r11.e
            goto L6
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r11.f
            int r2 = r2 + r6
            r11.f = r2
            r11.f245602g = r8
        L6a:
            r2 = r8
            goto L8
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.d = r2
            boolean r2 = r11.k(r6)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.I(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.a.x(char):java.lang.String");
    }

    public String y() throws IOException {
        String str;
        int iH = this.f245603h;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 10) {
            str = z();
        } else if (iH == 8) {
            str = x(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (iH == 9) {
            str = x(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (iH == 11) {
            str = this.k;
            this.k = null;
        } else if (iH == 15) {
            str = Long.toString(this.i);
        } else {
            if (iH != 16) {
                throw K("a string");
            }
            str = new String(this.f245601c, this.d, this.f245604j);
            this.d += this.f245604j;
        }
        this.f245603h = 0;
        int[] iArr = this.o;
        int i = this.f245606m - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        g();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String z() throws com.google.gson.stream.MalformedJsonException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.d
            int r4 = r3 + r2
            int r5 = r7.e
            char[] r6 = r7.f245601c
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.g()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.k(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.d
            r0.append(r6, r3, r2)
            int r3 = r7.d
            int r3 = r3 + r2
            r7.d = r3
            r2 = 1
            boolean r2 = r7.k(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.d
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.d
            int r2 = r2 + r1
            r7.d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.a.z():java.lang.String");
    }
}
