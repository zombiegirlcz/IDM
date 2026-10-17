package com.fasterxml.jackson.dataformat.cbor;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.i;
import com.fasterxml.jackson.core.n;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import j9.h;
import j9.j;
import j9.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes16.dex */
public final class e extends e9.b {
    public static final Charset H = StandardCharsets.UTF_8;
    public static final int[] I = a.f26196a;
    public static final double J = Math.pow(2.0d, 10.0d);
    public static final double K = Math.pow(2.0d, -14.0d);
    public static final BigInteger L;
    public static final BigInteger M;
    public static final BigInteger N;
    public static final BigInteger O;
    public static final BigDecimal P;
    public static final BigDecimal Q;
    public static final BigDecimal R;
    public static final BigDecimal S;
    public static final BigInteger T;
    public int B;
    public long C;
    public float D;
    public double E;
    public BigInteger F;
    public BigDecimal G;
    public final f9.d d;
    public boolean e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26197g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f26199j;
    public final j k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f26201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26202n;
    public int o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f26205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f26206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f26207t;
    public final h9.b u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f26208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f26209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f26210y;
    public final boolean z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f26198h = 0;
    public long i = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j9.c f26200l = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f26203p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f26204q = false;
    public int[] v = e9.b.f123819c;
    public int A = 0;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        L = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        M = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        N = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        O = bigIntegerValueOf4;
        P = new BigDecimal(bigIntegerValueOf3);
        Q = new BigDecimal(bigIntegerValueOf4);
        R = new BigDecimal(bigIntegerValueOf);
        S = new BigDecimal(bigIntegerValueOf2);
        T = BigInteger.ONE.shiftLeft(63);
    }

    public e(f9.d dVar, int i, h9.b bVar, byte[] bArr, int i2, boolean z) {
        this.f = 0;
        this.f26197g = 0;
        this.d = dVar;
        this.u = bVar;
        this.z = bVar.f150069a != null;
        this.f26206s = bArr;
        this.f = 0;
        this.f26197g = i2;
        this.f26207t = z;
        this.k = new j((j9.a) dVar.d);
        this.f26199j = new f(null, com.fasterxml.jackson.core.j.STRICT_DUPLICATE_DETECTION.b(i) ? new twg.c(this) : null, 0, -1);
    }

    public final void A(int i) throws JsonParseException {
        int i2;
        int iG;
        int i3;
        j jVar = this.k;
        char[] cArrD = jVar.d();
        int length = cArrD.length;
        int i5 = 0;
        while (true) {
            i--;
            if (i < 0) {
                jVar.f172268g = i5;
                return;
            }
            int iG2 = G();
            int i6 = iG2 & 255;
            int i21 = I[i6];
            if (i21 != 0 || i5 >= length) {
                i -= i21;
                if (i < 0) {
                    throw new JsonParseException(this, "Malformed UTF-8 character at the end of a (non-chunked) text segment");
                }
                if (i21 != 0) {
                    if (i21 == 1) {
                        iG = G();
                        if ((iG & 192) != 128) {
                            N(iG & 255, this.f);
                            throw null;
                        }
                        i3 = iG2 & 31;
                    } else if (i21 == 2) {
                        int i22 = iG2 & 15;
                        int iG3 = G();
                        if ((iG3 & 192) != 128) {
                            N(iG3 & 255, this.f);
                            throw null;
                        }
                        i3 = (i22 << 6) | (iG3 & 63);
                        iG = G();
                        if ((iG & 192) != 128) {
                            N(iG & 255, this.f);
                            throw null;
                        }
                    } else {
                        if (i21 != 3) {
                            M(i6);
                            throw null;
                        }
                        int iG4 = G();
                        if ((iG4 & 192) != 128) {
                            N(iG4 & 255, this.f);
                            throw null;
                        }
                        int i32 = ((iG2 & 7) << 6) | (iG4 & 63);
                        int iG5 = G();
                        if ((iG5 & 192) != 128) {
                            N(iG5 & 255, this.f);
                            throw null;
                        }
                        int i33 = (i32 << 6) | (iG5 & 63);
                        int iG6 = G();
                        if ((iG6 & 192) != 128) {
                            N(iG6 & 255, this.f);
                            throw null;
                        }
                        int i43 = ((i33 << 6) | (iG6 & 63)) - 65536;
                        if (i5 >= cArrD.length) {
                            cArrD = jVar.f();
                            length = cArrD.length;
                            i5 = 0;
                        }
                        cArrD[i5] = (char) ((i43 >> 10) | 55296);
                        i6 = (i43 & 1023) | 56320;
                        i5++;
                    }
                    i6 = (iG & 63) | (i3 << 6);
                }
                if (i5 >= length) {
                    cArrD = jVar.f();
                    length = cArrD.length;
                    i5 = 0;
                }
                i2 = i5 + 1;
                cArrD[i5] = (char) i6;
            } else {
                i2 = i5 + 1;
                cArrD[i5] = (char) i6;
            }
            i5 = i2;
        }
    }

    public final String B(int i) {
        j jVar = this.k;
        char[] cArrD = jVar.d();
        if (cArrD.length < i) {
            cArrD = jVar.f;
            if (cArrD.length < i) {
                cArrD = Arrays.copyOf(cArrD, i);
                jVar.f = cArrD;
            }
        }
        int i2 = this.f;
        int i3 = i + i2;
        this.f = i3;
        byte[] bArr = this.f26206s;
        int i5 = 0;
        while (true) {
            byte b4 = bArr[i2];
            if (b4 >= 0) {
                int i6 = i5 + 1;
                cArrD[i5] = (char) b4;
                i2++;
                if (i2 == i3) {
                    return jVar.h(i6);
                }
                i5 = i6;
            } else {
                while (true) {
                    int i21 = i2 + 1;
                    byte b5 = bArr[i2];
                    int i22 = b5 & UnsignedBytes.MAX_VALUE;
                    int i32 = I[i22];
                    if (i32 == 0) {
                        i2 = i21;
                    } else if (i32 == 1) {
                        i2 += 2;
                        byte b7 = bArr[i21];
                        if ((b7 & ISO7816.INS_GET_RESPONSE) != 128) {
                            N(b7 & UnsignedBytes.MAX_VALUE, i2);
                            throw null;
                        }
                        i22 = ((b5 & Ascii.US) << 6) | (b7 & 63);
                    } else if (i32 == 2) {
                        int i33 = i2 + 2;
                        byte b13 = bArr[i21];
                        if ((b13 & ISO7816.INS_GET_RESPONSE) != 128) {
                            N(b13 & UnsignedBytes.MAX_VALUE, i33);
                            throw null;
                        }
                        i2 += 3;
                        byte b15 = bArr[i33];
                        if ((b15 & ISO7816.INS_GET_RESPONSE) != 128) {
                            N(b15 & UnsignedBytes.MAX_VALUE, i2);
                            throw null;
                        }
                        i22 = ((b13 & 63) << 6) | ((b5 & 15) << 12) | (b15 & 63);
                    } else {
                        if (i32 != 3) {
                            g("Invalid UTF-8 start byte 0x" + Integer.toHexString(i22));
                            throw null;
                        }
                        int i43 = ((bArr[i21] & 63) << 12) | ((b5 & 7) << 18);
                        int i59 = i2 + 3;
                        int i66 = i43 | ((bArr[i2 + 2] & 63) << 6);
                        i2 += 4;
                        int i74 = (i66 | (bArr[i59] & 63)) - 65536;
                        cArrD[i5] = (char) ((i74 >> 10) | 55296);
                        i22 = (i74 & 1023) | 56320;
                        i5++;
                    }
                    int i92 = i5 + 1;
                    cArrD[i5] = (char) i22;
                    if (i2 >= i3) {
                        return jVar.h(i92);
                    }
                    i5 = i92;
                }
            }
        }
    }

    public final void C() throws JsonParseException {
        this.f26204q = false;
        int i = this.f26205r;
        int i2 = (i >> 5) & 7;
        int i3 = i & 31;
        if (i2 != 3) {
            if (i2 == 2) {
                this.f26201m = y(u(i3));
                return;
            } else {
                l.a();
                throw null;
            }
        }
        int iU = u(i3);
        if (iU > 0) {
            if (this.f26197g - this.f >= iU + 3) {
                B(iU);
                return;
            } else {
                int length = this.f26206s.length;
                A(iU);
                return;
            }
        }
        if (iU < 0) {
            z();
            return;
        }
        j jVar = this.k;
        jVar.f172266b = -1;
        jVar.f172268g = 0;
        jVar.f172269h = null;
        jVar.i = null;
        if (jVar.d) {
            jVar.d = false;
            jVar.f172267c.clear();
            jVar.e = 0;
            jVar.f172268g = 0;
        }
    }

    public final n D(int i) throws JsonParseException {
        boolean z;
        if (i == 2) {
            z = false;
        } else {
            if (i != 3) {
                n nVar = n.VALUE_EMBEDDED_OBJECT;
                this.f123820a = nVar;
                return nVar;
            }
            z = true;
        }
        C();
        if (this.f26201m.length == 0) {
            this.F = BigInteger.ZERO;
        } else {
            BigInteger bigInteger = new BigInteger(this.f26201m);
            if (z) {
                bigInteger = bigInteger.negate();
            }
            this.F = bigInteger;
        }
        this.A = 4;
        this.f26203p = -1;
        n nVar2 = n.VALUE_NUMBER_INT;
        this.f123820a = nVar2;
        return nVar2;
    }

    public final void E(int i) throws JsonParseException {
        int i2 = i & 255;
        if (i2 != 255) {
            throw new JsonParseException(this, j6.a.n(i2, new StringBuilder("Invalid CBOR value token (first byte): 0x")));
        }
        throw new JsonParseException(this, "Mismatched BREAK byte (0xFF): encountered where value expected");
    }

    public final void F(int i) throws JsonParseException {
        throw new JsonParseException(this, j6.a.l(i, "Needed to read ", " bytes, reached end-of-input"));
    }

    public final int G() {
        int i = this.f;
        if (i >= this.f26197g) {
            R();
            throw null;
        }
        byte b4 = this.f26206s[i];
        this.f = i + 1;
        return b4;
    }

    public final int H() throws JsonParseException {
        int i = this.f;
        if (i < this.o) {
            byte b4 = this.f26206s[i];
            this.f = i + 1;
            return b4;
        }
        int i2 = this.f26197g;
        if (i >= i2) {
            R();
            throw null;
        }
        int iS = s(3);
        if (iS <= 0) {
            n nVar = n.NOT_AVAILABLE;
            h(": chunked Text ends with partial UTF-8 character");
            throw null;
        }
        int i3 = this.f;
        if (i3 >= i2) {
            R();
            throw null;
        }
        int i5 = iS + i3;
        if (i5 <= i2) {
            this.f26202n = 0;
            this.o = i5;
        } else {
            this.f26202n = i5 - i2;
            this.o = i2;
        }
        byte[] bArr = this.f26206s;
        this.f = i3 + 1;
        return bArr[i3];
    }

    public final String I(int i, boolean z) throws JsonParseException {
        int iR = i & 31;
        if (iR > 23) {
            switch (iR) {
                case 24:
                    iR = r();
                    break;
                case 25:
                    iR = o();
                    break;
                case 26:
                    iR = p();
                    if (iR < 0) {
                        return String.valueOf(z ? (-(((long) iR) & BodyPartID.bodyIdMax)) - 1 : ((long) iR) & BodyPartID.bodyIdMax);
                    }
                    break;
                case 27:
                    long jQ = q();
                    if (z) {
                        jQ = (-jQ) - 1;
                    }
                    return String.valueOf(jQ);
                default:
                    throw new JsonParseException(this, String.format("Invalid length indicator for ints (%d), token 0x%s", Integer.valueOf(iR), Integer.toHexString(i)));
            }
        }
        if (z) {
            iR = (-iR) - 1;
        }
        return String.valueOf(iR);
    }

    public final void K(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        int i2 = i;
        while (i2 > 0) {
            int i3 = this.f;
            int i5 = this.f26197g;
            int i6 = i5 - i3;
            if (i3 >= i5) {
                L(i, i - i2);
                throw null;
            }
            int iMin = Math.min(i6, i2);
            byteArrayOutputStream.write(this.f26206s, this.f, iMin);
            this.f += iMin;
            i2 -= iMin;
        }
        this.f26204q = false;
    }

    public final void L(int i, int i2) {
        h(String.format(" for Binary value: expected %d bytes, only found %d", Integer.valueOf(i), Integer.valueOf(i2)));
        throw null;
    }

    public final void M(int i) {
        String strL;
        if (i >= 32) {
            g("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
            throw null;
        }
        char c2 = (char) i;
        StringBuilder sb6 = new StringBuilder("Illegal character (");
        char c3 = c2;
        if (Character.isISOControl(c3)) {
            strL = j6.a.l(c2, "(CTRL-CHAR, code ", ")");
        } else if (c2 > 255) {
            strL = "'" + c3 + "' (code " + ((int) c2) + " / 0x" + Integer.toHexString(c2) + ")";
        } else {
            strL = "'" + c3 + "' (code " + ((int) c2) + ")";
        }
        sb6.append(strL);
        sb6.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        g(sb6.toString());
        throw null;
    }

    public final void N(int i, int i2) {
        this.f = i2;
        g("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
        throw null;
    }

    public final void O() throws JsonParseException {
        if (this.f26199j.f26179b == 0) {
            throw new JsonParseException(this, "Unexpected Break (0xFF) token in Root context");
        }
        StringBuilder sb6 = new StringBuilder("Unexpected Break (0xFF) token in definite length (");
        sb6.append(this.f26199j.f);
        sb6.append(") ");
        sb6.append(this.f26199j.f26179b == 2 ? "Object" : "Array");
        throw new JsonParseException(this, sb6.toString());
    }

    public final void P(int i) {
        int iMin = Math.min(i, this.f26197g - this.f);
        this.f += iMin;
        if (i - iMin <= 0) {
            return;
        }
        R();
        throw null;
    }

    public final long Q() {
        int i = this.A;
        if ((i & 2) == 0) {
            if (i == 0) {
                n();
            }
            int i2 = this.A;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) != 0) {
                    this.C = this.B;
                } else if ((i2 & 4) != 0) {
                    if (N.compareTo(this.F) > 0 || O.compareTo(this.F) < 0) {
                        k();
                        throw null;
                    }
                    this.C = this.F.longValue();
                } else if ((i2 & 8) != 0) {
                    double d = this.E;
                    if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                        k();
                        throw null;
                    }
                    this.C = (long) d;
                } else if ((i2 & 32) != 0) {
                    float f = this.D;
                    double d5 = f;
                    if (d5 < -9.223372036854776E18d || d5 > 9.223372036854776E18d) {
                        j();
                        throw null;
                    }
                    this.C = (long) f;
                } else {
                    if ((i2 & 16) == 0) {
                        l.a();
                        throw null;
                    }
                    if (P.compareTo(this.G) > 0 || Q.compareTo(this.G) < 0) {
                        k();
                        throw null;
                    }
                    this.C = this.G.longValue();
                }
                this.A |= 2;
            }
        }
        return this.C;
    }

    public final void R() {
        h(" in " + this.f123820a);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:347:0x05ba, code lost:
    
        if (S() == com.fasterxml.jackson.core.n.END_ARRAY) goto L348;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02fe A[PHI: r1
      0x02fe: PHI (r1v93 float) = (r1v87 float), (r1v98 float) binds: [B:185:0x031f, B:176:0x02fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x049f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.core.n S() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instruction units count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.dataformat.cbor.e.S():com.fasterxml.jackson.core.n");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr;
        if (this.e) {
            return;
        }
        this.e = true;
        h9.b bVar = this.u;
        h9.b bVar2 = bVar.f150069a;
        if (bVar2 != null && !bVar.o) {
            h9.a aVar = new h9.a(bVar);
            AtomicReference atomicReference = bVar2.f150070b;
            h9.a aVar2 = (h9.a) atomicReference.get();
            int i = aVar2.f150066b;
            int i2 = aVar.f150066b;
            if (i2 != i) {
                if (i2 > 6000) {
                    aVar = new h9.a(64, 4, new int[512], new String[128], CaptureActivity.RESULT_EXIT_USER_FLOW, 512);
                }
                while (!atomicReference.compareAndSet(aVar2, aVar) && atomicReference.get() == aVar2) {
                }
            }
            bVar.o = true;
        }
        if (this.f26207t && (bArr = this.f26206s) != null) {
            this.f26206s = null;
            f9.d dVar = this.d;
            byte[] bArr2 = (byte[]) dVar.e;
            if (bArr != bArr2 && bArr.length < bArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            dVar.e = null;
            ((j9.a) dVar.d).f172246a.set(0, bArr);
        }
        this.k.g();
    }

    @Override // e9.b
    public final String i() throws JsonParseException {
        Object objValueOf;
        n nVar = this.f123820a;
        boolean z = this.f26204q;
        j jVar = this.k;
        if (!z || nVar != n.VALUE_STRING) {
            if (nVar == n.VALUE_STRING) {
                return jVar.c();
            }
            if (nVar == null) {
                return null;
            }
            if (nVar == n.FIELD_NAME) {
                return this.f26199j.f26211g;
            }
            if (!nVar.b()) {
                return this.f123820a.a();
            }
            if (this.A == 0) {
                n();
            }
            if (this.f123820a == n.VALUE_NUMBER_INT) {
                int i = this.A;
                objValueOf = (i & 1) != 0 ? Integer.valueOf(this.B) : (i & 2) != 0 ? Long.valueOf(this.C) : (i & 4) != 0 ? this.F : this.G;
            } else {
                int i2 = this.A;
                if ((i2 & 16) != 0) {
                    objValueOf = this.G;
                } else if ((i2 & 8) != 0) {
                    objValueOf = Double.valueOf(this.E);
                } else {
                    if ((i2 & 32) == 0) {
                        l.a();
                        throw null;
                    }
                    objValueOf = Float.valueOf(this.D);
                }
            }
            return objValueOf.toString();
        }
        int i3 = this.f26205r;
        this.f26204q = false;
        int i5 = (i3 >> 5) & 7;
        int i6 = i3 & 31;
        if (i5 != 3) {
            l.a();
            throw null;
        }
        int iU = u(i6);
        if (iU > 0) {
            if (this.f26197g - this.f >= Math.max(iU + 3, iU)) {
                return B(iU);
            }
            int length = this.f26206s.length;
            A(iU);
            return jVar.c();
        }
        if (iU != 0) {
            z();
            return jVar.c();
        }
        jVar.f172266b = -1;
        jVar.f172268g = 0;
        jVar.f172269h = null;
        jVar.i = null;
        if (!jVar.d) {
            return "";
        }
        jVar.d = false;
        jVar.f172267c.clear();
        jVar.e = 0;
        jVar.f172268g = 0;
        return "";
    }

    public final String l(int i, String str) {
        h9.b bVar = this.u;
        if (i < 5) {
            int i2 = this.f26208w;
            bVar.f();
            if (bVar.d) {
                str = h.f172262b.a(str);
            }
            int iB = bVar.b(bVar.h(i2));
            int[] iArr = bVar.f;
            iArr[iB] = i2;
            iArr[iB + 3] = 1;
            bVar.f150075l[iB >> 2] = str;
            bVar.k++;
            return str;
        }
        if (i < 9) {
            int i3 = this.f26208w;
            int i5 = this.f26209x;
            bVar.f();
            if (bVar.d) {
                str = h.f172262b.a(str);
            }
            int iB2 = bVar.b(bVar.i(i3, i5));
            int[] iArr2 = bVar.f;
            iArr2[iB2] = i3;
            iArr2[iB2 + 1] = i5;
            iArr2[iB2 + 3] = 2;
            bVar.f150075l[iB2 >> 2] = str;
            bVar.k++;
            return str;
        }
        if (i >= 13) {
            return bVar.g(this.v, (i + 3) >> 2, str);
        }
        int i6 = this.f26208w;
        int i21 = this.f26209x;
        int i22 = this.f26210y;
        bVar.f();
        if (bVar.d) {
            str = h.f172262b.a(str);
        }
        int iB3 = bVar.b(bVar.j(i6, i21, i22));
        int[] iArr3 = bVar.f;
        iArr3[iB3] = i6;
        iArr3[iB3 + 1] = i21;
        iArr3[iB3 + 2] = i22;
        iArr3[iB3 + 3] = 3;
        bVar.f150075l[iB3 >> 2] = str;
        bVar.k++;
        return str;
    }

    public final boolean m() throws JsonParseException {
        int iV = -1;
        if (!this.f26199j.e()) {
            this.f26203p = -1;
            this.f26199j = this.f26199j.d;
            this.f123820a = n.END_ARRAY;
            return false;
        }
        int i = this.f;
        if (i >= this.f26197g) {
            w();
            return false;
        }
        byte[] bArr = this.f26206s;
        this.f = i + 1;
        byte b4 = bArr[i];
        int i2 = b4 & UnsignedBytes.MAX_VALUE;
        int i3 = i2 >> 5;
        int i5 = b4 & Ascii.US;
        if (i3 == 6) {
            iV = v(i5);
            int i6 = this.f;
            if (i6 >= this.f26197g) {
                w();
                return false;
            }
            byte[] bArr2 = this.f26206s;
            this.f = i6 + 1;
            byte b5 = bArr2[i6];
            i2 = b5 & UnsignedBytes.MAX_VALUE;
            i3 = i2 >> 5;
            i5 = b5 & Ascii.US;
        }
        BigInteger bigInteger = T;
        if (i3 == 0) {
            this.A = 1;
            if (i5 <= 23) {
                this.B = i5;
            } else {
                int i21 = i5 - 24;
                if (i21 == 0) {
                    this.B = r();
                } else if (i21 == 1) {
                    this.B = o();
                } else if (i21 == 2) {
                    int iP = p();
                    if (iP >= 0) {
                        this.B = iP;
                    } else {
                        this.C = ((long) iP) & BodyPartID.bodyIdMax;
                        this.A = 2;
                    }
                } else {
                    if (i21 != 3) {
                        E(i2);
                        throw null;
                    }
                    long jQ = q();
                    if (jQ >= 0) {
                        this.C = jQ;
                        this.A = 2;
                    } else {
                        this.F = BigInteger.valueOf((jQ << 1) >>> 1).or(bigInteger);
                        this.A = 4;
                    }
                }
            }
            this.f123820a = n.VALUE_NUMBER_INT;
            return true;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 6) {
                    g("Multiple tags not allowed per value (first tag: " + iV + ")");
                    throw null;
                }
            } else if (iV >= 0) {
                this.f26205r = i2;
                this.f26204q = true;
                n nVarD = D(iV);
                this.f123820a = nVarD;
                return nVarD == n.VALUE_NUMBER_INT;
            }
            this.f--;
            S();
            return false;
        }
        this.A = 1;
        if (i5 <= 23) {
            this.B = (-i5) - 1;
        } else {
            int i22 = i5 - 24;
            if (i22 == 0) {
                this.B = (-r()) - 1;
            } else if (i22 == 1) {
                this.B = (-o()) - 1;
            } else if (i22 == 2) {
                int iP2 = p();
                if (iP2 < 0) {
                    this.C = (-(((long) iP2) & BodyPartID.bodyIdMax)) - 1;
                    this.A = 2;
                } else {
                    this.B = (-iP2) - 1;
                }
            } else {
                if (i22 != 3) {
                    E(i2);
                    throw null;
                }
                long jQ2 = q();
                if (jQ2 >= 0) {
                    this.C = (-jQ2) - 1;
                    this.A = 2;
                } else {
                    this.F = BigInteger.valueOf((jQ2 << 1) >>> 1).or(bigInteger).negate().subtract(BigInteger.ONE);
                    this.A = 4;
                }
            }
        }
        this.f123820a = n.VALUE_NUMBER_INT;
        return true;
    }

    public final void n() {
        n nVar = this.f123820a;
        if (nVar == n.VALUE_NUMBER_INT || nVar == n.VALUE_NUMBER_FLOAT) {
            return;
        }
        g("Current token (" + this.f123820a + ") not numeric, can not use numeric value accessors");
        throw null;
    }

    public final int o() {
        int i = this.f;
        int i2 = i + 1;
        int i3 = this.f26197g;
        if (i2 < i3) {
            byte[] bArr = this.f26206s;
            int i5 = ((bArr[i] & UnsignedBytes.MAX_VALUE) << 8) + (bArr[i2] & UnsignedBytes.MAX_VALUE);
            this.f = i + 2;
            return i5;
        }
        if (i >= i3) {
            R();
            throw null;
        }
        byte[] bArr2 = this.f26206s;
        int i6 = i + 1;
        this.f = i6;
        int i21 = bArr2[i] & UnsignedBytes.MAX_VALUE;
        if (i6 < i3) {
            this.f = i + 2;
            return (i21 << 8) + (bArr2[i6] & UnsignedBytes.MAX_VALUE);
        }
        R();
        throw null;
    }

    public final int p() {
        int i = this.f;
        int i2 = i + 3;
        int i3 = this.f26197g;
        if (i2 < i3) {
            byte[] bArr = this.f26206s;
            int i5 = (bArr[i] << Ascii.CAN) + ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) + ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8) + (bArr[i2] & UnsignedBytes.MAX_VALUE);
            this.f = i + 4;
            return i5;
        }
        if (i >= i3) {
            R();
            throw null;
        }
        byte[] bArr2 = this.f26206s;
        int i6 = i + 1;
        this.f = i6;
        byte b4 = bArr2[i];
        if (i6 >= i3) {
            R();
            throw null;
        }
        int i21 = i + 2;
        this.f = i21;
        int i22 = (b4 << 8) + (bArr2[i6] & UnsignedBytes.MAX_VALUE);
        if (i21 >= i3) {
            R();
            throw null;
        }
        int i32 = i22 << 8;
        int i33 = i + 3;
        this.f = i33;
        int i43 = i32 + (bArr2[i21] & UnsignedBytes.MAX_VALUE);
        if (i33 < i3) {
            this.f = i + 4;
            return (i43 << 8) + (bArr2[i33] & UnsignedBytes.MAX_VALUE);
        }
        R();
        throw null;
    }

    public final long q() {
        int i = this.f;
        int i2 = i + 7;
        if (i2 >= this.f26197g) {
            return (((long) p()) << 32) + ((((long) p()) << 32) >>> 32);
        }
        byte[] bArr = this.f26206s;
        int i3 = (bArr[i] << Ascii.CAN) + ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) + ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8) + (bArr[i + 3] & UnsignedBytes.MAX_VALUE);
        int i5 = (bArr[i + 4] << Ascii.CAN) + ((bArr[i + 5] & UnsignedBytes.MAX_VALUE) << 16) + ((bArr[i + 6] & UnsignedBytes.MAX_VALUE) << 8) + (bArr[i2] & UnsignedBytes.MAX_VALUE);
        this.f = i + 8;
        return (((long) i3) << 32) + ((((long) i5) << 32) >>> 32);
    }

    public final int r() {
        int i = this.f;
        if (i >= this.f26197g) {
            R();
            throw null;
        }
        byte[] bArr = this.f26206s;
        this.f = i + 1;
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    public final int s(int i) throws JsonParseException {
        int i2 = this.f;
        if (i2 >= this.f26197g) {
            R();
            throw null;
        }
        byte[] bArr = this.f26206s;
        this.f = i2 + 1;
        byte b4 = bArr[i2];
        int i3 = b4 & UnsignedBytes.MAX_VALUE;
        if (i3 == 255) {
            return -1;
        }
        int i5 = i3 >> 5;
        if (i5 != i) {
            throw new JsonParseException(this, String.format("Mismatched chunk in chunked content: expected major type %d but encountered %d (byte 0x%02X)", Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i3)));
        }
        int iU = u(b4 & Ascii.US);
        if (iU >= 0) {
            return iU;
        }
        throw d(Integer.valueOf(i), "Illegal chunked-length indicator within chunked-length value (major type %d)");
    }

    public final String t(int i) throws JsonParseException {
        j jVar = this.k;
        char[] cArrD = jVar.d();
        if (cArrD.length < i) {
            cArrD = jVar.f;
            if (cArrD.length < i) {
                cArrD = Arrays.copyOf(cArrD, i);
                jVar.f = cArrD;
            }
        }
        int i2 = this.f;
        int i3 = i2 + i;
        this.f = i3;
        byte[] bArr = this.f26206s;
        int i5 = 0;
        while (true) {
            int i6 = bArr[i2] & UnsignedBytes.MAX_VALUE;
            int[] iArr = I;
            if (iArr[i6] != 0) {
                while (i2 < i3) {
                    int i21 = i2 + 1;
                    byte b4 = bArr[i2];
                    int i22 = b4 & UnsignedBytes.MAX_VALUE;
                    int i32 = iArr[i22];
                    if (i32 == 0) {
                        i2 = i21;
                    } else {
                        if (i21 + i32 > i3) {
                            throw new JsonParseException(this, String.format("Truncated UTF-8 character in Map key (%d bytes): byte 0x%02X at offset #%d indicated %d more bytes needed", Integer.valueOf(i), Integer.valueOf(i22), Integer.valueOf((i - (i3 - i21)) - 1), Integer.valueOf(i32)));
                        }
                        if (i32 == 1) {
                            i2 += 2;
                            byte b5 = bArr[i21];
                            if ((b5 & ISO7816.INS_GET_RESPONSE) != 128) {
                                N(b5 & UnsignedBytes.MAX_VALUE, i2);
                                throw null;
                            }
                            i22 = ((b4 & Ascii.US) << 6) | (b5 & 63);
                        } else if (i32 == 2) {
                            int i33 = i2 + 2;
                            byte b7 = bArr[i21];
                            if ((b7 & ISO7816.INS_GET_RESPONSE) != 128) {
                                N(b7 & UnsignedBytes.MAX_VALUE, i33);
                                throw null;
                            }
                            i2 += 3;
                            byte b13 = bArr[i33];
                            if ((b13 & ISO7816.INS_GET_RESPONSE) != 128) {
                                N(b13 & UnsignedBytes.MAX_VALUE, i2);
                                throw null;
                            }
                            i22 = ((b7 & 63) << 6) | ((b4 & 15) << 12) | (b13 & 63);
                        } else {
                            if (i32 != 3) {
                                throw d(Integer.toHexString(i22), "Invalid UTF-8 byte 0x%s in Object property name");
                            }
                            int i43 = ((bArr[i21] & 63) << 12) | ((b4 & 7) << 18);
                            int i59 = i2 + 3;
                            int i66 = i43 | ((bArr[i2 + 2] & 63) << 6);
                            i2 += 4;
                            int i74 = (i66 | (bArr[i59] & 63)) - 65536;
                            cArrD[i5] = (char) ((i74 >> 10) | 55296);
                            i22 = (i74 & 1023) | 56320;
                            i5++;
                        }
                    }
                    cArrD[i5] = (char) i22;
                    i5++;
                }
                return jVar.h(i5);
            }
            int i92 = i5 + 1;
            cArrD[i5] = (char) i6;
            i2++;
            if (i2 == i3) {
                return jVar.h(i92);
            }
            i5 = i92;
        }
    }

    public final int u(int i) throws JsonParseException {
        if (i == 31) {
            return -1;
        }
        if (i <= 23) {
            return i;
        }
        int i2 = i - 24;
        if (i2 == 0) {
            return r();
        }
        if (i2 == 1) {
            return o();
        }
        if (i2 == 2) {
            return p();
        }
        if (i2 != 3) {
            throw new JsonParseException(this, String.format("Invalid length for %s: 0x%02X,", this.f123820a, Integer.valueOf(i)));
        }
        long jQ = q();
        if (jQ >= 0 && jQ <= 2147483647L) {
            return (int) jQ;
        }
        throw new JsonParseException(this, "Illegal length for " + this.f123820a + ": " + jQ);
    }

    public final int v(int i) throws JsonParseException {
        if (i <= 23) {
            return i;
        }
        int i2 = i - 24;
        if (i2 == 0) {
            return r();
        }
        if (i2 == 1) {
            return o();
        }
        if (i2 == 2) {
            return p();
        }
        if (i2 != 3) {
            throw d(Integer.toHexString(i), "Invalid low bits for Tag token: 0x%s");
        }
        long jQ = q();
        if (jQ < -2147483648L || jQ > 2147483647L) {
            throw d(Long.valueOf(jQ), "Illegal Tag value: %d");
        }
        return (int) jQ;
    }

    public final void w() {
        this.f26203p = -1;
        close();
        f fVar = this.f26199j;
        if (fVar.f26179b == 0) {
            this.f123820a = null;
            return;
        }
        f9.c cVar = (f9.c) this.d.f132797c;
        fVar.getClass();
        String strA = new i(cVar, -1L, 1L, -1).a();
        f fVar2 = this.f26199j;
        int i = fVar2.f;
        if (i >= 0) {
            int iMax = Math.max(0, i - fVar2.f26180c);
            if (this.f26199j.c()) {
                h(String.format(" in Array value: expected %d more elements (start token at %s)", Integer.valueOf(iMax), strA));
                throw null;
            }
            h(String.format(" in Object value: expected %d more properties (start token at %s)", Integer.valueOf(iMax), strA));
            throw null;
        }
        if (fVar2.c()) {
            h(" in Array value: expected an element or close marker (0xFF) (start token at " + strA + ")");
            throw null;
        }
        h(" in Object value: expected a property or close marker (0xFF) (start token at " + strA + ")");
        throw null;
    }

    public final String x(int i) {
        int i2;
        int[] iArr;
        int i3;
        h9.b bVar = this.u;
        if (i < 5) {
            int i5 = this.f;
            byte[] bArr = this.f26206s;
            int i6 = bArr[i5] & UnsignedBytes.MAX_VALUE;
            if (i > 1) {
                i6 = (bArr[i5 + 1] & UnsignedBytes.MAX_VALUE) + (i6 << 8);
                if (i > 2) {
                    i6 = (i6 << 8) + (bArr[i5 + 2] & UnsignedBytes.MAX_VALUE);
                    if (i > 3) {
                        i6 = (i6 << 8) + (bArr[i5 + 3] & UnsignedBytes.MAX_VALUE);
                    }
                }
            }
            this.f26208w = i6;
            return bVar.l(i6);
        }
        byte[] bArr2 = this.f26206s;
        int i21 = this.f;
        int i22 = i21 + 4;
        int i32 = (((((bArr2[i21 + 1] & UnsignedBytes.MAX_VALUE) | ((bArr2[i21] & UnsignedBytes.MAX_VALUE) << 8)) << 8) | (bArr2[i21 + 2] & UnsignedBytes.MAX_VALUE)) << 8) | (bArr2[i21 + 3] & UnsignedBytes.MAX_VALUE);
        if (i < 9) {
            int i33 = i21 + 5;
            int i43 = bArr2[i22] & UnsignedBytes.MAX_VALUE;
            int i59 = i - 5;
            if (i59 > 0) {
                int i66 = i43 << 8;
                int i74 = i21 + 6;
                int i92 = (bArr2[i33] & UnsignedBytes.MAX_VALUE) + i66;
                if (i59 > 1) {
                    int i96 = i21 + 7;
                    i43 = (i92 << 8) + (bArr2[i74] & UnsignedBytes.MAX_VALUE);
                    if (i59 > 2) {
                        i43 = (i43 << 8) + (bArr2[i96] & UnsignedBytes.MAX_VALUE);
                    }
                } else {
                    i43 = i92;
                }
            }
            this.f26208w = i32;
            this.f26209x = i43;
            return bVar.m(i32, i43);
        }
        int i99 = i21 + 8;
        int i100 = (((((bArr2[i21 + 5] & UnsignedBytes.MAX_VALUE) | ((bArr2[i22] & UnsignedBytes.MAX_VALUE) << 8)) << 8) | (bArr2[i21 + 6] & UnsignedBytes.MAX_VALUE)) << 8) | (bArr2[i21 + 7] & UnsignedBytes.MAX_VALUE);
        if (i < 13) {
            int i101 = i21 + 9;
            int i102 = bArr2[i99] & UnsignedBytes.MAX_VALUE;
            int i103 = i - 9;
            if (i103 > 0) {
                int i104 = i102 << 8;
                int i105 = i21 + 10;
                int i106 = (bArr2[i101] & UnsignedBytes.MAX_VALUE) + i104;
                if (i103 > 1) {
                    int i107 = i21 + 11;
                    i102 = (i106 << 8) + (bArr2[i105] & UnsignedBytes.MAX_VALUE);
                    if (i103 > 2) {
                        i102 = (i102 << 8) + (bArr2[i107] & UnsignedBytes.MAX_VALUE);
                    }
                } else {
                    i102 = i106;
                }
            }
            this.f26208w = i32;
            this.f26209x = i100;
            this.f26210y = i102;
            return bVar.n(i32, i100, i102);
        }
        int i108 = (i + 3) >> 2;
        int[] iArr2 = this.v;
        if (i108 > iArr2.length) {
            this.v = Arrays.copyOf(iArr2, i108 + 4);
        }
        int[] iArr3 = this.v;
        iArr3[0] = i32;
        iArr3[1] = i100;
        int i109 = this.f + 8;
        int i110 = i - 8;
        byte[] bArr3 = this.f26206s;
        int i111 = 2;
        while (true) {
            i2 = i109 + 4;
            int i112 = (((((bArr3[i109 + 1] & UnsignedBytes.MAX_VALUE) | ((bArr3[i109] & UnsignedBytes.MAX_VALUE) << 8)) << 8) | (bArr3[i109 + 2] & UnsignedBytes.MAX_VALUE)) << 8) | (bArr3[i109 + 3] & UnsignedBytes.MAX_VALUE);
            iArr = this.v;
            i3 = i111 + 1;
            iArr[i111] = i112;
            i110 -= 4;
            if (i110 <= 3) {
                break;
            }
            i109 = i2;
            i111 = i3;
        }
        if (i110 > 0) {
            int i113 = bArr3[i2] & UnsignedBytes.MAX_VALUE;
            if (i110 > 1) {
                i113 = (i113 << 8) + (bArr3[i109 + 5] & UnsignedBytes.MAX_VALUE);
                if (i110 > 2) {
                    i113 = (i113 << 8) + (bArr3[i109 + 6] & UnsignedBytes.MAX_VALUE);
                }
            }
            iArr[i3] = i113;
            i3 = i111 + 2;
        }
        if (i3 < 4) {
            bVar.getClass();
            return i3 != 1 ? i3 != 2 ? i3 != 3 ? "" : bVar.n(iArr[0], iArr[1], iArr[2]) : bVar.m(iArr[0], iArr[1]) : bVar.l(iArr[0]);
        }
        int iK = bVar.k(i3, iArr);
        int iA = bVar.a(iK);
        int[] iArr4 = bVar.f;
        int i114 = iArr4[iA + 3];
        if (iK == iArr4[iA] && i114 == i3 && bVar.e(iArr, i3, iArr4[iA + 1])) {
            return bVar.f150075l[iA >> 2];
        }
        if (i114 == 0) {
            return null;
        }
        int i115 = bVar.f150073h + ((iA >> 3) << 2);
        int i116 = iArr4[i115 + 3];
        if (iK == iArr4[i115] && i116 == i3 && bVar.e(iArr, i3, iArr4[i115 + 1])) {
            return bVar.f150075l[i115 >> 2];
        }
        int i117 = bVar.i;
        int i118 = bVar.f150074j;
        int i119 = i117 + ((iA >> (i118 + 2)) << i118);
        int[] iArr5 = bVar.f;
        int i120 = (1 << i118) + i119;
        while (i119 < i120) {
            int i121 = iArr5[i119 + 3];
            if (iK == iArr5[i119] && i3 == i121 && bVar.e(iArr, i3, iArr5[i119 + 1])) {
                return bVar.f150075l[i119 >> 2];
            }
            if (i121 == 0) {
                return null;
            }
            i119 += 4;
        }
        for (int iD = bVar.d(); iD < bVar.f150076m; iD += 4) {
            if (iK == iArr5[iD] && i3 == iArr5[iD + 3] && bVar.e(iArr, i3, iArr5[iD + 1])) {
                return bVar.f150075l[iD >> 2];
            }
        }
        return null;
    }

    public final byte[] y(int i) throws JsonParseException {
        if (i > 0) {
            if (i > 250000) {
                j9.c cVar = new j9.c(125000);
                int i2 = i;
                while (i2 > 0) {
                    int i3 = this.f26197g - this.f;
                    if (i3 <= 0) {
                        L(i, i - i2);
                        throw null;
                    }
                    int iMin = Math.min(i3, i2);
                    cVar.write(this.f26206s, this.f, iMin);
                    this.f += iMin;
                    i2 -= iMin;
                }
                return cVar.h();
            }
            byte[] bArr = new byte[i];
            int i5 = this.f;
            int i6 = this.f26197g;
            if (i5 >= i6) {
                L(i, 0);
                throw null;
            }
            int iMin2 = Math.min(i, i6 - i5);
            System.arraycopy(this.f26206s, this.f, bArr, 0, iMin2);
            this.f += iMin2;
            if (i - iMin2 <= 0) {
                return bArr;
            }
            L(i, iMin2);
            throw null;
        }
        if (i == 0) {
            return e9.b.f123818b;
        }
        j9.c cVar2 = this.f26200l;
        if (cVar2 == null) {
            this.f26200l = new j9.c(500);
        } else {
            cVar2.f172251b = 0;
            cVar2.d = 0;
            LinkedList linkedList = cVar2.f172250a;
            if (!linkedList.isEmpty()) {
                linkedList.clear();
            }
        }
        j9.c cVar3 = this.f26200l;
        while (true) {
            int i21 = this.f;
            if (i21 >= this.f26197g) {
                R();
                throw null;
            }
            byte[] bArr2 = this.f26206s;
            this.f = i21 + 1;
            byte b4 = bArr2[i21];
            int i22 = b4 & UnsignedBytes.MAX_VALUE;
            if (i22 == 255) {
                return cVar3.h();
            }
            int i32 = i22 >> 5;
            if (i32 != 2) {
                throw new JsonParseException(this, String.format("Mismatched chunk in chunked content: expected %d but encountered %d", 2, Integer.valueOf(i32)));
            }
            int iU = u(b4 & Ascii.US);
            if (iU < 0) {
                throw d(2, "Illegal chunked-length indicator within chunked-length value (type %d)");
            }
            int i33 = iU;
            while (i33 > 0) {
                int i43 = this.f;
                int i59 = this.f26197g;
                int i66 = i59 - i43;
                if (i43 >= i59) {
                    L(iU, iU - i33);
                    throw null;
                }
                int iMin3 = Math.min(i66, i33);
                cVar3.write(this.f26206s, this.f, iMin3);
                this.f += iMin3;
                i33 -= iMin3;
            }
        }
    }

    public final void z() throws JsonParseException {
        int i;
        int iH;
        int i2;
        j jVar = this.k;
        char[] cArrD = jVar.d();
        int length = cArrD.length;
        byte[] bArr = this.f26206s;
        this.o = this.f;
        this.f26202n = 0;
        int i3 = 0;
        while (true) {
            if (this.f >= this.o) {
                if (this.f26202n == 0) {
                    int iS = s(3);
                    if (iS > 0) {
                        this.f26202n = iS;
                        int i5 = this.f + iS;
                        int i6 = this.f26197g;
                        if (i5 <= i6) {
                            this.f26202n = 0;
                            this.o = i5;
                        } else {
                            this.f26202n = i5 - i6;
                            this.o = i6;
                        }
                    } else if (iS != 0) {
                        jVar.f172268g = i3;
                        return;
                    }
                }
                if (this.f >= this.f26197g) {
                    R();
                    throw null;
                }
            }
            int i21 = this.f;
            this.f = i21 + 1;
            byte b4 = bArr[i21];
            int i22 = b4 & UnsignedBytes.MAX_VALUE;
            int i32 = I[i22];
            if (i32 != 0 || i3 >= length) {
                if (i32 != 0) {
                    if (i32 == 1) {
                        iH = H();
                        if ((iH & 192) != 128) {
                            N(iH & 255, this.f);
                            throw null;
                        }
                        i2 = b4 & Ascii.US;
                    } else if (i32 == 2) {
                        int i33 = b4 & 15;
                        int iH2 = H();
                        if ((iH2 & 192) != 128) {
                            N(iH2 & 255, this.f);
                            throw null;
                        }
                        i2 = (i33 << 6) | (iH2 & 63);
                        iH = H();
                        if ((iH & 192) != 128) {
                            N(iH & 255, this.f);
                            throw null;
                        }
                    } else {
                        if (i32 != 3) {
                            M(i22);
                            throw null;
                        }
                        int iH3 = H();
                        if ((iH3 & 192) != 128) {
                            N(iH3 & 255, this.f);
                            throw null;
                        }
                        int i43 = ((b4 & 7) << 6) | (iH3 & 63);
                        int iH4 = H();
                        if ((iH4 & 192) != 128) {
                            N(iH4 & 255, this.f);
                            throw null;
                        }
                        int i59 = (i43 << 6) | (iH4 & 63);
                        int iH5 = H();
                        if ((iH5 & 192) != 128) {
                            N(iH5 & 255, this.f);
                            throw null;
                        }
                        int i66 = ((i59 << 6) | (iH5 & 63)) - 65536;
                        if (i3 >= cArrD.length) {
                            cArrD = jVar.f();
                            length = cArrD.length;
                            i3 = 0;
                        }
                        cArrD[i3] = (char) ((i66 >> 10) | 55296);
                        i22 = (i66 & 1023) | 56320;
                        i3++;
                    }
                    i22 = (iH & 63) | (i2 << 6);
                }
                if (i3 >= length) {
                    cArrD = jVar.f();
                    length = cArrD.length;
                    i3 = 0;
                }
                i = i3 + 1;
                cArrD[i3] = (char) i22;
            } else {
                i = i3 + 1;
                cArrD[i3] = (char) i22;
            }
            i3 = i;
        }
    }
}
