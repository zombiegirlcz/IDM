package q7;

import cpi.g;
import java.io.EOFException;
import java.io.IOException;
import kotlin.text.Charsets;
import mmm.f0;
import mmm.h;
import mmm.l;
import mmm.l0;
import mmm.m;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final m f242726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m f242727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m f242728n;
    public final l0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f242729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f242730h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f242731j;
    public String k;

    static {
        m.Companion.getClass();
        f242726l = l.c("'\\");
        f242727m = l.c("\"\\");
        f242728n = l.c("{}[]:, \n\t\r\f/\\;#=");
        l.c("\n\r");
        l.c("*/");
    }

    public e(l0 l0Var) {
        this.f242724b = new int[32];
        this.f242725c = new String[32];
        this.d = new int[32];
        this.f242730h = 0;
        this.f = l0Var;
        this.f242729g = l0Var.f207283b;
        o(6);
    }

    public final String A() {
        long jM7 = this.f.M7(f242728n);
        h hVar = this.f242729g;
        if (jM7 == -1) {
            return hVar.q();
        }
        hVar.getClass();
        return hVar.p(jM7, Charsets.UTF_8);
    }

    public final char B() throws EOFException, b {
        int i;
        l0 l0Var = this.f;
        if (!l0Var.a(1L)) {
            s("Unterminated escape sequence");
            throw null;
        }
        h hVar = this.f242729g;
        byte b4 = hVar.readByte();
        if (b4 == 10 || b4 == 34 || b4 == 39 || b4 == 47 || b4 == 92) {
            return (char) b4;
        }
        if (b4 == 98) {
            return '\b';
        }
        if (b4 == 102) {
            return '\f';
        }
        if (b4 == 110) {
            return '\n';
        }
        if (b4 == 114) {
            return '\r';
        }
        if (b4 == 116) {
            return '\t';
        }
        if (b4 != 117) {
            s("Invalid escape sequence: \\" + ((char) b4));
            throw null;
        }
        if (!l0Var.a(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c2 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bJ = hVar.j(i2);
            char c3 = (char) (c2 << 4);
            if (bJ >= 48 && bJ <= 57) {
                i = bJ + ISO7816.INS_WRITE_BINARY;
            } else if (bJ >= 97 && bJ <= 102) {
                i = bJ - 87;
            } else {
                if (bJ < 65 || bJ > 70) {
                    s("\\u".concat(hVar.p(4L, Charsets.UTF_8)));
                    throw null;
                }
                i = bJ - 55;
            }
            c2 = (char) (i + c3);
        }
        hVar.skip(4L);
        return c2;
    }

    public final void C(m mVar) throws EOFException, b {
        while (true) {
            long jM7 = this.f.M7(mVar);
            if (jM7 == -1) {
                s("Unterminated string");
                throw null;
            }
            h hVar = this.f242729g;
            if (hVar.j(jM7) != 92) {
                hVar.skip(jM7 + 1);
                return;
            } else {
                hVar.skip(jM7 + 1);
                B();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f242730h = 0;
        this.f242724b[0] = 8;
        this.f242723a = 1;
        this.f242729g.f();
        this.f.close();
    }

    @Override // q7.d
    public final void d() throws EOFException, b {
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 3) {
            o(1);
            this.d[this.f242723a - 1] = 0;
            this.f242730h = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + n() + " at path " + getPath());
        }
    }

    @Override // q7.d
    public final void f() {
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 1) {
            o(3);
            this.f242730h = 0;
        } else {
            throw new a("Expected BEGIN_OBJECT but was " + n() + " at path " + getPath());
        }
    }

    @Override // q7.d
    public final void g() throws EOFException, b {
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        if (iU != 4) {
            throw new a("Expected END_ARRAY but was " + n() + " at path " + getPath());
        }
        int i = this.f242723a;
        this.f242723a = i - 1;
        int[] iArr = this.d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f242730h = 0;
    }

    @Override // q7.d
    public final void h() {
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        if (iU != 2) {
            throw new a("Expected END_OBJECT but was " + n() + " at path " + getPath());
        }
        int i = this.f242723a;
        int i2 = i - 1;
        this.f242723a = i2;
        this.f242725c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f242730h = 0;
    }

    @Override // q7.d
    public final boolean i() throws EOFException, b {
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        return (iU == 2 || iU == 4 || iU == 18) ? false : true;
    }

    @Override // q7.d
    public final boolean j() {
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 5) {
            this.f242730h = 0;
            int[] iArr = this.d;
            int i = this.f242723a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iU == 6) {
            this.f242730h = 0;
            int[] iArr2 = this.d;
            int i2 = this.f242723a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + n() + " at path " + getPath());
    }

    @Override // q7.d
    public final double k() throws EOFException, b {
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 16) {
            this.f242730h = 0;
            int[] iArr = this.d;
            int i = this.f242723a - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iU == 17) {
            long j2 = this.f242731j;
            h hVar = this.f242729g;
            hVar.getClass();
            this.k = hVar.p(j2, Charsets.UTF_8);
        } else if (iU == 9) {
            this.k = z(f242727m);
        } else if (iU == 8) {
            this.k = z(f242726l);
        } else if (iU == 10) {
            this.k = A();
        } else if (iU != 11) {
            throw new a("Expected a double but was " + n() + " at path " + getPath());
        }
        this.f242730h = 11;
        try {
            double d = Double.parseDouble(this.k);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new b("JSON forbids NaN and infinities: " + d + " at path " + getPath());
            }
            this.k = null;
            this.f242730h = 0;
            int[] iArr2 = this.d;
            int i2 = this.f242723a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.k + " at path " + getPath());
        }
    }

    @Override // q7.d
    public final int l() throws EOFException, b {
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 16) {
            long j2 = this.i;
            int i = (int) j2;
            if (j2 == i) {
                this.f242730h = 0;
                int[] iArr = this.d;
                int i2 = this.f242723a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new a("Expected an int but was " + this.i + " at path " + getPath());
        }
        if (iU == 17) {
            long j3 = this.f242731j;
            h hVar = this.f242729g;
            hVar.getClass();
            this.k = hVar.p(j3, Charsets.UTF_8);
        } else if (iU == 9 || iU == 8) {
            String strZ = iU == 9 ? z(f242727m) : z(f242726l);
            this.k = strZ;
            try {
                int i3 = Integer.parseInt(strZ);
                this.f242730h = 0;
                int[] iArr2 = this.d;
                int i5 = this.f242723a - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iU != 11) {
            throw new a("Expected an int but was " + n() + " at path " + getPath());
        }
        this.f242730h = 11;
        try {
            double d = Double.parseDouble(this.k);
            int i6 = (int) d;
            if (i6 != d) {
                throw new a("Expected an int but was " + this.k + " at path " + getPath());
            }
            this.k = null;
            this.f242730h = 0;
            int[] iArr3 = this.d;
            int i21 = this.f242723a - 1;
            iArr3[i21] = iArr3[i21] + 1;
            return i6;
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.k + " at path " + getPath());
        }
    }

    @Override // q7.d
    public final String m() {
        String strP;
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 10) {
            strP = A();
        } else if (iU == 9) {
            strP = z(f242727m);
        } else if (iU == 8) {
            strP = z(f242726l);
        } else if (iU == 11) {
            strP = this.k;
            this.k = null;
        } else if (iU == 16) {
            strP = Long.toString(this.i);
        } else {
            if (iU != 17) {
                throw new a("Expected a string but was " + n() + " at path " + getPath());
            }
            long j2 = this.f242731j;
            h hVar = this.f242729g;
            hVar.getClass();
            strP = hVar.p(j2, Charsets.UTF_8);
        }
        this.f242730h = 0;
        int[] iArr = this.d;
        int i = this.f242723a - 1;
        iArr[i] = iArr[i] + 1;
        return strP;
    }

    @Override // q7.d
    public final c n() throws EOFException, b {
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        switch (iU) {
            case 1:
                return c.BEGIN_OBJECT;
            case 2:
                return c.END_OBJECT;
            case 3:
                return c.BEGIN_ARRAY;
            case 4:
                return c.END_ARRAY;
            case 5:
            case 6:
                return c.BOOLEAN;
            case 7:
                return c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.NAME;
            case 16:
            case 17:
                return c.NUMBER;
            case 18:
                return c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // q7.d
    public final int p(g gVar) throws EOFException, b {
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        if (iU < 12 || iU > 15) {
            return -1;
        }
        if (iU == 15) {
            return v(this.k, gVar);
        }
        int iG2 = this.f.G2((f0) gVar.f107955c);
        if (iG2 != -1) {
            this.f242730h = 0;
            this.f242725c[this.f242723a - 1] = ((String[]) gVar.f107954b)[iG2];
            return iG2;
        }
        String str = this.f242725c[this.f242723a - 1];
        String strX = x();
        int iV = v(strX, gVar);
        if (iV == -1) {
            this.f242730h = 15;
            this.k = strX;
            this.f242725c[this.f242723a - 1] = str;
        }
        return iV;
    }

    @Override // q7.d
    public final void q() throws EOFException, b {
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 14) {
            long jM7 = this.f.M7(f242728n);
            h hVar = this.f242729g;
            if (jM7 == -1) {
                jM7 = hVar.f207266b;
            }
            hVar.skip(jM7);
        } else if (iU == 13) {
            C(f242727m);
        } else if (iU == 12) {
            C(f242726l);
        } else if (iU != 15) {
            throw new a("Expected a name but was " + n() + " at path " + getPath());
        }
        this.f242730h = 0;
        this.f242725c[this.f242723a - 1] = "null";
    }

    @Override // q7.d
    public final void r() {
        int i = 0;
        do {
            int iU = this.f242730h;
            if (iU == 0) {
                iU = u();
            }
            if (iU == 3) {
                o(1);
            } else if (iU == 1) {
                o(3);
            } else {
                if (iU == 4) {
                    i--;
                    if (i < 0) {
                        throw new a("Expected a value but was " + n() + " at path " + getPath());
                    }
                    this.f242723a--;
                } else if (iU == 2) {
                    i--;
                    if (i < 0) {
                        throw new a("Expected a value but was " + n() + " at path " + getPath());
                    }
                    this.f242723a--;
                } else {
                    h hVar = this.f242729g;
                    if (iU == 14 || iU == 10) {
                        long jM7 = this.f.M7(f242728n);
                        if (jM7 == -1) {
                            jM7 = hVar.f207266b;
                        }
                        hVar.skip(jM7);
                    } else if (iU == 9 || iU == 13) {
                        C(f242727m);
                    } else if (iU == 8 || iU == 12) {
                        C(f242726l);
                    } else if (iU == 17) {
                        hVar.skip(this.f242731j);
                    } else if (iU == 18) {
                        throw new a("Expected a value but was " + n() + " at path " + getPath());
                    }
                }
                this.f242730h = 0;
            }
            i++;
            this.f242730h = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.f242723a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f242725c[i2] = "null";
    }

    public final void t() throws b {
        s("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public final String toString() {
        return "JsonReader(" + this.f + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0197, code lost:
    
        if (w(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0199, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x019b, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a1, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a3, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01a7, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a9, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ab, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01ae, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01af, code lost:
    
        r22.i = r8;
        r7.skip(r2);
        r9 = 16;
        r22.f242730h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ba, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01bd, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c0, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01c2, code lost:
    
        r22.f242731j = r2;
        r9 = 17;
        r22.f242730h = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int u() throws java.io.EOFException, q7.b {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.u():int");
    }

    public final int v(String str, g gVar) {
        int length = ((String[]) gVar.f107954b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) gVar.f107954b)[i])) {
                this.f242730h = 0;
                this.f242725c[this.f242723a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean w(int i) throws b {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        t();
        throw null;
    }

    public final String x() {
        String strZ;
        int iU = this.f242730h;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 14) {
            strZ = A();
        } else if (iU == 13) {
            strZ = z(f242727m);
        } else if (iU == 12) {
            strZ = z(f242726l);
        } else {
            if (iU != 15) {
                throw new a("Expected a name but was " + n() + " at path " + getPath());
            }
            strZ = this.k;
        }
        this.f242730h = 0;
        this.f242725c[this.f242723a - 1] = strZ;
        return strZ;
    }

    public final int y(boolean z) throws EOFException, b {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            l0 l0Var = this.f;
            if (!l0Var.a(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j2 = i;
            h hVar = this.f242729g;
            byte bJ = hVar.j(j2);
            if (bJ != 10 && bJ != 32 && bJ != 13 && bJ != 9) {
                hVar.skip(j2);
                if (bJ == 47) {
                    if (l0Var.a(2L)) {
                        t();
                        throw null;
                    }
                } else if (bJ == 35) {
                    t();
                    throw null;
                }
                return bJ;
            }
            i = i2;
        }
    }

    public final String z(m mVar) throws EOFException, b {
        StringBuilder sb6 = null;
        while (true) {
            long jM7 = this.f.M7(mVar);
            if (jM7 == -1) {
                s("Unterminated string");
                throw null;
            }
            h hVar = this.f242729g;
            if (hVar.j(jM7) != 92) {
                if (sb6 == null) {
                    String strP = hVar.p(jM7, Charsets.UTF_8);
                    hVar.readByte();
                    return strP;
                }
                sb6.append(hVar.p(jM7, Charsets.UTF_8));
                hVar.readByte();
                return sb6.toString();
            }
            if (sb6 == null) {
                sb6 = new StringBuilder();
            }
            sb6.append(hVar.p(jM7, Charsets.UTF_8));
            hVar.readByte();
            sb6.append(B());
        }
    }
}
