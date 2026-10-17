package g9;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.g;
import com.fasterxml.jackson.core.p;
import com.fasterxml.jackson.core.q;
import com.fasterxml.jackson.core.t;
import com.google.common.primitives.UnsignedBytes;
import f9.d;
import f9.e;
import f9.h;
import f9.i;
import j9.f;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final char[] f141419s = (char[]) f9.b.f132789a.clone();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f141420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final char f141421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char[] f141422n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f141423p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f141424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public char[] f141425r;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Type inference failed for: r4v10, types: [char[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(f9.d r3, int r4, f9.h r5, char r6) {
        /*
            r2 = this;
            r2.<init>(r3, r4)
            r2.f141420l = r5
            java.io.Serializable r4 = r3.f132798g
            char[] r4 = (char[]) r4
            if (r4 != 0) goto L56
            java.lang.Object r4 = r3.d
            j9.a r4 = (j9.a) r4
            int[] r5 = j9.a.d
            r0 = 1
            r5 = r5[r0]
            if (r5 <= 0) goto L17
            goto L18
        L17:
            r5 = 0
        L18:
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r4.f172247b
            r1 = 0
            java.lang.Object r4 = r4.getAndSet(r0, r1)
            char[] r4 = (char[]) r4
            if (r4 == 0) goto L26
            int r0 = r4.length
            if (r0 >= r5) goto L28
        L26:
            char[] r4 = new char[r5]
        L28:
            r3.f132798g = r4
            r2.f141422n = r4
            int r3 = r4.length
            r2.f141424q = r3
            r2.f141421m = r6
            r3 = 34
            if (r6 == r3) goto L55
            int[] r4 = f9.b.d
            if (r6 != r3) goto L3a
            goto L53
        L3a:
            f9.a r3 = f9.a.f132787b
            int[][] r3 = r3.f132788a
            r5 = r3[r6]
            if (r5 != 0) goto L52
            r5 = 128(0x80, float:1.8E-43)
            int[] r4 = java.util.Arrays.copyOf(r4, r5)
            r5 = r4[r6]
            if (r5 != 0) goto L4f
            r5 = -1
            r4[r6] = r5
        L4f:
            r3[r6] = r4
            goto L53
        L52:
            r4 = r5
        L53:
            r2.f141414g = r4
        L55:
            return
        L56:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Trying to call same allocXxx() method second time"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.c.<init>(f9.d, int, f9.h, char):void");
    }

    public static int M(x9.c cVar, byte[] bArr, int i, int i2, int i3) {
        int i5;
        int i6 = 0;
        while (i < i2) {
            bArr[i6] = bArr[i];
            i6++;
            i++;
        }
        int iMin = Math.min(i3, bArr.length);
        do {
            int i21 = iMin - i6;
            if (i21 == 0 || (i5 = cVar.read(bArr, i6, i21)) < 0) {
                return i6;
            }
            i6 += i5;
        } while (i6 < 3);
        return i6;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void A(Object obj2) throws JsonGenerationException {
        E("start an object");
        b bVar = this.d;
        b bVar2 = bVar.f;
        if (bVar2 == null) {
            twg.c cVar = bVar.e;
            bVar2 = new b(2, bVar, cVar != null ? cVar.h() : null, obj2);
            bVar.f = bVar2;
        } else {
            bVar2.f26179b = 2;
            bVar2.f26180c = -1;
            bVar2.f141417g = null;
            bVar2.i = false;
            bVar2.f141418h = obj2;
            twg.c cVar2 = bVar2.e;
            if (cVar2 != null) {
                cVar2.f275018b = null;
                cVar2.f275019c = null;
                cVar2.d = null;
            }
        }
        this.d = bVar2;
        p pVar = this.f26174a;
        if (pVar != null) {
            f fVar = (f) pVar;
            u(CoreConstants.CURLY_LEFT);
            if (fVar.f172259b.a()) {
                return;
            }
            fVar.e++;
            return;
        }
        if (this.f141423p >= this.f141424q) {
            I();
        }
        char[] cArr = this.f141422n;
        int i = this.f141423p;
        this.f141423p = i + 1;
        cArr[i] = CoreConstants.CURLY_LEFT;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void B(String str) throws JsonGenerationException {
        E("write a string");
        if (str == null) {
            P();
            return;
        }
        int i = this.f141423p;
        int i2 = this.f141424q;
        if (i >= i2) {
            I();
        }
        char[] cArr = this.f141422n;
        int i3 = this.f141423p;
        this.f141423p = i3 + 1;
        char c2 = this.f141421m;
        cArr[i3] = c2;
        R(str);
        if (this.f141423p >= i2) {
            I();
        }
        char[] cArr2 = this.f141422n;
        int i5 = this.f141423p;
        this.f141423p = i5 + 1;
        cArr2[i5] = c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[PHI: r11
      0x0046: PHI (r11v6 int) = (r11v3 int), (r11v7 int) binds: [B:15:0x0042, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fasterxml.jackson.core.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(char[] r17, int r18, int r19) throws com.fasterxml.jackson.core.JsonGenerationException {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.c.C(char[], int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // e9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(java.lang.String r12) throws com.fasterxml.jackson.core.JsonGenerationException {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.c.E(java.lang.String):void");
    }

    public final char[] G() {
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 0, CoreConstants.ESCAPE_CHAR, 'u', '0', '0', 0, 0, CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
        this.f141425r = cArr;
        return cArr;
    }

    public final void H(char c2, int i) {
        int i2;
        int i3 = this.f141424q;
        if (i >= 0) {
            if (this.f141423p + 2 > i3) {
                I();
            }
            char[] cArr = this.f141422n;
            int i5 = this.f141423p;
            int i6 = i5 + 1;
            this.f141423p = i6;
            cArr[i5] = CoreConstants.ESCAPE_CHAR;
            this.f141423p = i5 + 2;
            cArr[i6] = (char) i;
            return;
        }
        if (i == -2) {
            throw null;
        }
        if (this.f141423p + 5 >= i3) {
            I();
        }
        int i21 = this.f141423p;
        char[] cArr2 = this.f141422n;
        cArr2[i21] = CoreConstants.ESCAPE_CHAR;
        int i22 = i21 + 2;
        cArr2[i21 + 1] = 'u';
        char[] cArr3 = f141419s;
        if (c2 > 255) {
            int i32 = c2 >> '\b';
            int i33 = i21 + 3;
            cArr2[i22] = cArr3[(i32 & 255) >> 4];
            i2 = i21 + 4;
            cArr2[i33] = cArr3[i32 & 15];
            c2 = (char) (c2 & 255);
        } else {
            int i43 = i21 + 3;
            cArr2[i22] = '0';
            i2 = i21 + 4;
            cArr2[i43] = '0';
        }
        cArr2[i2] = cArr3[c2 >> 4];
        cArr2[i2 + 1] = cArr3[c2 & 15];
        this.f141423p = i2 + 2;
    }

    public final void I() {
        int i = this.f141423p;
        int i2 = this.o;
        int i3 = i - i2;
        if (i3 > 0) {
            this.o = 0;
            this.f141423p = 0;
            this.f141420l.write(this.f141422n, i2, i3);
        }
    }

    public final int K(char[] cArr, int i, int i2, char c2, int i3) {
        int i5;
        h hVar = this.f141420l;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i6 = i - 2;
                cArr[i6] = CoreConstants.ESCAPE_CHAR;
                cArr[i - 1] = (char) i3;
                return i6;
            }
            char[] cArrG = this.f141425r;
            if (cArrG == null) {
                cArrG = G();
            }
            cArrG[1] = (char) i3;
            hVar.write(cArrG, 0, 2);
            return i;
        }
        if (i3 == -2) {
            throw null;
        }
        char[] cArr2 = f141419s;
        if (i <= 5 || i >= i2) {
            char[] cArrG2 = this.f141425r;
            if (cArrG2 == null) {
                cArrG2 = G();
            }
            this.o = this.f141423p;
            if (c2 <= 255) {
                cArrG2[6] = cArr2[c2 >> 4];
                cArrG2[7] = cArr2[c2 & 15];
                hVar.write(cArrG2, 2, 6);
                return i;
            }
            int i21 = c2 >> '\b';
            cArrG2[10] = cArr2[(i21 & 255) >> 4];
            cArrG2[11] = cArr2[i21 & 15];
            cArrG2[12] = cArr2[(c2 & 255) >> 4];
            cArrG2[13] = cArr2[c2 & 15];
            hVar.write(cArrG2, 8, 6);
            return i;
        }
        cArr[i - 6] = CoreConstants.ESCAPE_CHAR;
        int i22 = i - 4;
        cArr[i - 5] = 'u';
        if (c2 > 255) {
            int i32 = c2 >> '\b';
            int i33 = i - 3;
            cArr[i22] = cArr2[(i32 & 255) >> 4];
            i5 = i - 2;
            cArr[i33] = cArr2[i32 & 15];
            c2 = (char) (c2 & 255);
        } else {
            int i43 = i - 3;
            cArr[i22] = '0';
            i5 = i - 2;
            cArr[i43] = '0';
        }
        cArr[i5] = cArr2[c2 >> 4];
        cArr[i5 + 1] = cArr2[c2 & 15];
        return i5 - 4;
    }

    public final void L(char c2, int i) {
        int i2;
        h hVar = this.f141420l;
        if (i >= 0) {
            int i3 = this.f141423p;
            if (i3 >= 2) {
                int i5 = i3 - 2;
                this.o = i5;
                char[] cArr = this.f141422n;
                cArr[i5] = CoreConstants.ESCAPE_CHAR;
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArrG = this.f141425r;
            if (cArrG == null) {
                cArrG = G();
            }
            this.o = this.f141423p;
            cArrG[1] = (char) i;
            hVar.write(cArrG, 0, 2);
            return;
        }
        if (i == -2) {
            throw null;
        }
        int i6 = this.f141423p;
        char[] cArr2 = f141419s;
        if (i6 < 6) {
            char[] cArrG2 = this.f141425r;
            if (cArrG2 == null) {
                cArrG2 = G();
            }
            this.o = this.f141423p;
            if (c2 <= 255) {
                cArrG2[6] = cArr2[c2 >> 4];
                cArrG2[7] = cArr2[c2 & 15];
                hVar.write(cArrG2, 2, 6);
                return;
            } else {
                int i21 = c2 >> '\b';
                cArrG2[10] = cArr2[(i21 & 255) >> 4];
                cArrG2[11] = cArr2[i21 & 15];
                cArrG2[12] = cArr2[(c2 & 255) >> 4];
                cArrG2[13] = cArr2[c2 & 15];
                hVar.write(cArrG2, 8, 6);
                return;
            }
        }
        char[] cArr3 = this.f141422n;
        int i22 = i6 - 6;
        this.o = i22;
        cArr3[i22] = CoreConstants.ESCAPE_CHAR;
        cArr3[i6 - 5] = 'u';
        if (c2 > 255) {
            int i32 = c2 >> '\b';
            cArr3[i6 - 4] = cArr2[(i32 & 255) >> 4];
            i2 = i6 - 3;
            cArr3[i2] = cArr2[i32 & 15];
            c2 = (char) (c2 & 255);
        } else {
            cArr3[i6 - 4] = '0';
            i2 = i6 - 3;
            cArr3[i2] = '0';
        }
        cArr3[i2 + 1] = cArr2[c2 >> 4];
        cArr3[i2 + 2] = cArr2[c2 & 15];
    }

    public final int N(com.fasterxml.jackson.core.b bVar, x9.c cVar, byte[] bArr) {
        int i = this.f141424q - 6;
        int i2 = 2;
        int i3 = bVar.f >> 2;
        int i5 = -3;
        int i6 = 0;
        int iM = 0;
        int i21 = 0;
        while (true) {
            if (i6 > i5) {
                iM = M(cVar, bArr, i6, iM, bArr.length);
                if (iM < 3) {
                    break;
                }
                i5 = iM - 3;
                i6 = 0;
            }
            if (this.f141423p > i) {
                I();
            }
            int i22 = i6 + 2;
            int i32 = ((bArr[i6 + 1] & UnsignedBytes.MAX_VALUE) | (bArr[i6] << 8)) << 8;
            i6 += 3;
            i21 += 3;
            int iD = bVar.d(this.f141422n, (bArr[i22] & UnsignedBytes.MAX_VALUE) | i32, this.f141423p);
            this.f141423p = iD;
            i3--;
            if (i3 <= 0) {
                char[] cArr = this.f141422n;
                int i33 = iD + 1;
                this.f141423p = i33;
                cArr[iD] = CoreConstants.ESCAPE_CHAR;
                this.f141423p = iD + 2;
                cArr[i33] = 'n';
                i3 = bVar.f >> 2;
            }
        }
        if (iM <= 0) {
            return i21;
        }
        if (this.f141423p > i) {
            I();
        }
        int i43 = bArr[0] << 16;
        if (1 < iM) {
            i43 |= (bArr[1] & UnsignedBytes.MAX_VALUE) << 8;
        } else {
            i2 = 1;
        }
        int i59 = i21 + i2;
        this.f141423p = bVar.e(this.f141422n, i43, i2, this.f141423p);
        return i59;
    }

    public final int O(com.fasterxml.jackson.core.b bVar, x9.c cVar, byte[] bArr, int i) {
        int iM;
        int i2 = this.f141424q - 6;
        int i3 = 2;
        int i5 = bVar.f >> 2;
        int i6 = -3;
        int i21 = 0;
        int iM2 = 0;
        while (true) {
            if (i <= 2) {
                break;
            }
            if (i21 > i6) {
                iM2 = M(cVar, bArr, i21, iM2, i);
                if (iM2 < 3) {
                    i21 = 0;
                    break;
                }
                i6 = iM2 - 3;
                i21 = 0;
            }
            if (this.f141423p > i2) {
                I();
            }
            int i22 = i21 + 2;
            int i32 = ((bArr[i21 + 1] & UnsignedBytes.MAX_VALUE) | (bArr[i21] << 8)) << 8;
            i21 += 3;
            i -= 3;
            int iD = bVar.d(this.f141422n, (bArr[i22] & UnsignedBytes.MAX_VALUE) | i32, this.f141423p);
            this.f141423p = iD;
            i5--;
            if (i5 <= 0) {
                char[] cArr = this.f141422n;
                int i33 = iD + 1;
                this.f141423p = i33;
                cArr[iD] = CoreConstants.ESCAPE_CHAR;
                this.f141423p = iD + 2;
                cArr[i33] = 'n';
                i5 = bVar.f >> 2;
            }
        }
        if (i <= 0 || (iM = M(cVar, bArr, i21, iM2, i)) <= 0) {
            return i;
        }
        if (this.f141423p > i2) {
            I();
        }
        int i43 = bArr[0] << 16;
        if (1 < iM) {
            i43 |= (bArr[1] & UnsignedBytes.MAX_VALUE) << 8;
        } else {
            i3 = 1;
        }
        this.f141423p = bVar.e(this.f141422n, i43, i3, this.f141423p);
        return i - i3;
    }

    public final void P() {
        if (this.f141423p + 4 >= this.f141424q) {
            I();
        }
        int i = this.f141423p;
        char[] cArr = this.f141422n;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.f141423p = i + 4;
    }

    public final void Q(String str) {
        int i = this.f141423p;
        int i2 = this.f141424q;
        if (i >= i2) {
            I();
        }
        char[] cArr = this.f141422n;
        int i3 = this.f141423p;
        this.f141423p = i3 + 1;
        char c2 = this.f141421m;
        cArr[i3] = c2;
        v(str);
        if (this.f141423p >= i2) {
            I();
        }
        char[] cArr2 = this.f141422n;
        int i5 = this.f141423p;
        this.f141423p = i5 + 1;
        cArr2[i5] = c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[PHI: r16
      0x004b: PHI (r16v3 int) = (r16v0 int), (r16v4 int) binds: [B:18:0x0046, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.c.R(java.lang.String):void");
    }

    public final void S(char[] cArr, int i) {
        if (i >= 32) {
            I();
            this.f141420l.write(cArr, 0, i);
        } else {
            if (i > this.f141424q - this.f141423p) {
                I();
            }
            System.arraycopy(cArr, 0, this.f141422n, this.f141423p, i);
            this.f141423p += i;
        }
    }

    @Override // com.fasterxml.jackson.core.h, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws JsonGenerationException {
        if (this.f141422n != null && h(g.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                b bVar = this.d;
                if (!bVar.c()) {
                    if (bVar.f26179b != 2) {
                        break;
                    } else {
                        m();
                    }
                } else {
                    l();
                }
            }
        }
        I();
        this.o = 0;
        this.f141423p = 0;
        d dVar = this.f;
        if (this.f141420l != null && !dVar.f132796b && !h(g.AUTO_CLOSE_TARGET)) {
            h(g.FLUSH_PASSED_TO_STREAM);
        }
        char[] cArr = this.f141422n;
        if (cArr != null) {
            this.f141422n = null;
            char[] cArr2 = (char[]) dVar.f132798g;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            dVar.f132798g = null;
            ((j9.a) dVar.d).f172247b.set(1, cArr);
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        I();
        if (this.f141420l != null) {
            h(g.FLUSH_PASSED_TO_STREAM);
        }
    }

    @Override // com.fasterxml.jackson.core.h
    public final void j(com.fasterxml.jackson.core.b bVar, byte[] bArr, int i, int i2) throws JsonGenerationException {
        int iD;
        E("write a binary value");
        int i3 = this.f141423p;
        int i5 = this.f141424q;
        if (i3 >= i5) {
            I();
        }
        char[] cArr = this.f141422n;
        int i6 = this.f141423p;
        this.f141423p = i6 + 1;
        char c2 = this.f141421m;
        cArr[i6] = c2;
        int i21 = i2 + i;
        int i22 = i21 - 3;
        int i32 = i5 - 6;
        int i33 = bVar.f;
        loop0: while (true) {
            int i43 = i33 >> 2;
            while (i <= i22) {
                if (this.f141423p > i32) {
                    I();
                }
                int i59 = i + 2;
                int i66 = ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) | (bArr[i] << 8)) << 8;
                i += 3;
                iD = bVar.d(this.f141422n, i66 | (bArr[i59] & UnsignedBytes.MAX_VALUE), this.f141423p);
                this.f141423p = iD;
                i43--;
                if (i43 <= 0) {
                    break;
                }
            }
            char[] cArr2 = this.f141422n;
            int i74 = iD + 1;
            this.f141423p = i74;
            cArr2[iD] = CoreConstants.ESCAPE_CHAR;
            this.f141423p = iD + 2;
            cArr2[i74] = 'n';
            i33 = bVar.f;
        }
        int i92 = i21 - i;
        if (i92 > 0) {
            if (this.f141423p > i32) {
                I();
            }
            int i96 = i + 1;
            int i99 = bArr[i] << 16;
            if (i92 == 2) {
                i99 |= (bArr[i96] & UnsignedBytes.MAX_VALUE) << 8;
            }
            this.f141423p = bVar.e(this.f141422n, i99, i92, this.f141423p);
        }
        if (this.f141423p >= i5) {
            I();
        }
        char[] cArr3 = this.f141422n;
        int i100 = this.f141423p;
        this.f141423p = i100 + 1;
        cArr3[i100] = c2;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void k(boolean z) throws JsonGenerationException {
        int i;
        E("write a boolean value");
        if (this.f141423p + 5 >= this.f141424q) {
            I();
        }
        int i2 = this.f141423p;
        char[] cArr = this.f141422n;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.f141423p = i + 1;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void l() throws JsonGenerationException {
        if (!this.d.c()) {
            d("Current context not Array but ".concat(this.d.d()));
            throw null;
        }
        p pVar = this.f26174a;
        if (pVar != null) {
            int i = this.d.f26180c + 1;
            f fVar = (f) pVar;
            t tVar = fVar.f172258a;
            if (!tVar.a()) {
                fVar.e--;
            }
            if (i > 0) {
                tVar.b(this, fVar.e);
            } else {
                u(zsc.p.SPACE_CHAR);
            }
            u(']');
        } else {
            if (this.f141423p >= this.f141424q) {
                I();
            }
            char[] cArr = this.f141422n;
            int i2 = this.f141423p;
            this.f141423p = i2 + 1;
            cArr[i2] = ']';
        }
        this.d = this.d.d;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void m() throws JsonGenerationException {
        b bVar = this.d;
        if (bVar.f26179b != 2) {
            d("Current context not Object but ".concat(bVar.d()));
            throw null;
        }
        p pVar = this.f26174a;
        if (pVar != null) {
            int i = bVar.f26180c + 1;
            f fVar = (f) pVar;
            t tVar = fVar.f172259b;
            if (!tVar.a()) {
                fVar.e--;
            }
            if (i > 0) {
                tVar.b(this, fVar.e);
            } else {
                u(zsc.p.SPACE_CHAR);
            }
            u(CoreConstants.CURLY_RIGHT);
        } else {
            if (this.f141423p >= this.f141424q) {
                I();
            }
            char[] cArr = this.f141422n;
            int i2 = this.f141423p;
            this.f141423p = i2 + 1;
            cArr[i2] = CoreConstants.CURLY_RIGHT;
        }
        this.d = this.d.d;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void n(q qVar) throws JsonGenerationException {
        i iVar = (i) qVar;
        int iE = this.d.e(iVar.f132807a);
        if (iE == 4) {
            d("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z = iE == 1;
        p pVar = this.f26174a;
        int i = this.f141424q;
        char c2 = this.f141421m;
        if (pVar != null) {
            if (z) {
                f fVar = (f) pVar;
                fVar.f.getClass();
                u(CoreConstants.COMMA_CHAR);
                fVar.f172259b.b(this, fVar.e);
            } else {
                f fVar2 = (f) pVar;
                fVar2.f172259b.b(this, fVar2.e);
            }
            char[] cArrA = iVar.a();
            if (this.f141416j) {
                S(cArrA, cArrA.length);
                return;
            }
            if (this.f141423p >= i) {
                I();
            }
            char[] cArr = this.f141422n;
            int i2 = this.f141423p;
            this.f141423p = i2 + 1;
            cArr[i2] = c2;
            S(cArrA, cArrA.length);
            if (this.f141423p >= i) {
                I();
            }
            char[] cArr2 = this.f141422n;
            int i3 = this.f141423p;
            this.f141423p = i3 + 1;
            cArr2[i3] = c2;
            return;
        }
        if (this.f141423p + 1 >= i) {
            I();
        }
        if (z) {
            char[] cArr3 = this.f141422n;
            int i5 = this.f141423p;
            this.f141423p = i5 + 1;
            cArr3[i5] = CoreConstants.COMMA_CHAR;
        }
        if (this.f141416j) {
            char[] cArrA2 = iVar.a();
            S(cArrA2, cArrA2.length);
            return;
        }
        char[] cArr4 = this.f141422n;
        int i6 = this.f141423p;
        int i21 = i6 + 1;
        this.f141423p = i21;
        cArr4[i6] = c2;
        char[] cArrA3 = iVar.f132808b;
        if (cArrA3 == null) {
            e eVar = i.f132806c;
            String str = iVar.f132807a;
            eVar.getClass();
            cArrA3 = e.a(str);
            iVar.f132808b = cArrA3;
        }
        int length = cArrA3.length;
        if (i21 + length > cArr4.length) {
            length = -1;
        } else {
            System.arraycopy(cArrA3, 0, cArr4, i21, length);
        }
        if (length < 0) {
            char[] cArrA4 = iVar.a();
            S(cArrA4, cArrA4.length);
            if (this.f141423p >= i) {
                I();
            }
            char[] cArr5 = this.f141422n;
            int i22 = this.f141423p;
            this.f141423p = i22 + 1;
            cArr5[i22] = c2;
            return;
        }
        int i32 = this.f141423p + length;
        this.f141423p = i32;
        if (i32 >= i) {
            I();
        }
        char[] cArr6 = this.f141422n;
        int i33 = this.f141423p;
        this.f141423p = i33 + 1;
        cArr6[i33] = c2;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void o(String str) throws JsonGenerationException {
        int iE = this.d.e(str);
        if (iE == 4) {
            d("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z = iE == 1;
        p pVar = this.f26174a;
        int i = this.f141424q;
        char c2 = this.f141421m;
        if (pVar == null) {
            if (this.f141423p + 1 >= i) {
                I();
            }
            if (z) {
                char[] cArr = this.f141422n;
                int i2 = this.f141423p;
                this.f141423p = i2 + 1;
                cArr[i2] = CoreConstants.COMMA_CHAR;
            }
            if (this.f141416j) {
                R(str);
                return;
            }
            char[] cArr2 = this.f141422n;
            int i3 = this.f141423p;
            this.f141423p = i3 + 1;
            cArr2[i3] = c2;
            R(str);
            if (this.f141423p >= i) {
                I();
            }
            char[] cArr3 = this.f141422n;
            int i5 = this.f141423p;
            this.f141423p = i5 + 1;
            cArr3[i5] = c2;
            return;
        }
        if (z) {
            f fVar = (f) pVar;
            fVar.f.getClass();
            u(CoreConstants.COMMA_CHAR);
            fVar.f172259b.b(this, fVar.e);
        } else {
            f fVar2 = (f) pVar;
            fVar2.f172259b.b(this, fVar2.e);
        }
        if (this.f141416j) {
            R(str);
            return;
        }
        if (this.f141423p >= i) {
            I();
        }
        char[] cArr4 = this.f141422n;
        int i6 = this.f141423p;
        this.f141423p = i6 + 1;
        cArr4[i6] = c2;
        R(str);
        if (this.f141423p >= i) {
            I();
        }
        char[] cArr5 = this.f141422n;
        int i21 = this.f141423p;
        this.f141423p = i21 + 1;
        cArr5[i21] = c2;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void p() throws JsonGenerationException {
        E("write a null");
        P();
    }

    @Override // com.fasterxml.jackson.core.h
    public final void q(double d) throws JsonGenerationException {
        if (!this.f123817c) {
            String str = f9.g.f132802a;
            if ((!Double.isNaN(d) && !Double.isInfinite(d)) || !h(g.QUOTE_NON_NUMERIC_NUMBERS)) {
                E("write a number");
                v(String.valueOf(d));
                return;
            }
        }
        B(String.valueOf(d));
    }

    @Override // com.fasterxml.jackson.core.h
    public final void r(float f) throws JsonGenerationException {
        if (!this.f123817c) {
            String str = f9.g.f132802a;
            if ((!Float.isNaN(f) && !Float.isInfinite(f)) || !h(g.QUOTE_NON_NUMERIC_NUMBERS)) {
                E("write a number");
                v(String.valueOf(f));
                return;
            }
        }
        B(String.valueOf(f));
    }

    @Override // com.fasterxml.jackson.core.h
    public final void s(int i) throws JsonGenerationException {
        E("write a number");
        boolean z = this.f123817c;
        int i2 = this.f141424q;
        if (!z) {
            if (this.f141423p + 11 >= i2) {
                I();
            }
            this.f141423p = f9.g.d(this.f141422n, i, this.f141423p);
            return;
        }
        if (this.f141423p + 13 >= i2) {
            I();
        }
        char[] cArr = this.f141422n;
        int i3 = this.f141423p;
        int i5 = i3 + 1;
        this.f141423p = i5;
        char c2 = this.f141421m;
        cArr[i3] = c2;
        int iD = f9.g.d(cArr, i, i5);
        char[] cArr2 = this.f141422n;
        this.f141423p = iD + 1;
        cArr2[iD] = c2;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void t(long j2) throws JsonGenerationException {
        E("write a number");
        boolean z = this.f123817c;
        int i = this.f141424q;
        if (!z) {
            if (this.f141423p + 21 >= i) {
                I();
            }
            this.f141423p = f9.g.e(j2, this.f141422n, this.f141423p);
            return;
        }
        if (this.f141423p + 23 >= i) {
            I();
        }
        char[] cArr = this.f141422n;
        int i2 = this.f141423p;
        int i3 = i2 + 1;
        this.f141423p = i3;
        char c2 = this.f141421m;
        cArr[i2] = c2;
        int iE = f9.g.e(j2, cArr, i3);
        char[] cArr2 = this.f141422n;
        this.f141423p = iE + 1;
        cArr2[iE] = c2;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void u(char c2) {
        if (this.f141423p >= this.f141424q) {
            I();
        }
        char[] cArr = this.f141422n;
        int i = this.f141423p;
        this.f141423p = i + 1;
        cArr[i] = c2;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void v(String str) {
        int length = str.length();
        int i = this.f141423p;
        int i2 = this.f141424q;
        int i3 = i2 - i;
        if (i3 == 0) {
            I();
            i3 = i2 - this.f141423p;
        }
        if (i3 >= length) {
            str.getChars(0, length, this.f141422n, this.f141423p);
            this.f141423p += length;
            return;
        }
        int i5 = this.f141423p;
        int i6 = i2 - i5;
        str.getChars(0, i6, this.f141422n, i5);
        this.f141423p += i6;
        I();
        int length2 = str.length() - i6;
        while (length2 > i2) {
            int i21 = i6 + i2;
            str.getChars(i6, i21, this.f141422n, 0);
            this.o = 0;
            this.f141423p = i2;
            I();
            length2 -= i2;
            i6 = i21;
        }
        str.getChars(i6, i6 + length2, this.f141422n, 0);
        this.o = 0;
        this.f141423p = length2;
    }

    @Override // com.fasterxml.jackson.core.h
    public final void w() throws JsonGenerationException {
        E("start an array");
        b bVar = this.d;
        b bVar2 = bVar.f;
        if (bVar2 == null) {
            twg.c cVar = bVar.e;
            bVar2 = new b(1, bVar, cVar != null ? cVar.h() : null);
            bVar.f = bVar2;
        } else {
            bVar2.f26179b = 1;
            bVar2.f26180c = -1;
            bVar2.f141417g = null;
            bVar2.i = false;
            twg.c cVar2 = bVar2.e;
            if (cVar2 != null) {
                cVar2.f275018b = null;
                cVar2.f275019c = null;
                cVar2.d = null;
            }
        }
        this.d = bVar2;
        p pVar = this.f26174a;
        if (pVar != null) {
            ((f) pVar).a(this);
            return;
        }
        if (this.f141423p >= this.f141424q) {
            I();
        }
        char[] cArr = this.f141422n;
        int i = this.f141423p;
        this.f141423p = i + 1;
        cArr[i] = '[';
    }

    @Override // com.fasterxml.jackson.core.h
    public final void x(Object obj2) throws JsonGenerationException {
        E("start an array");
        b bVar = this.d;
        b bVar2 = bVar.f;
        if (bVar2 == null) {
            twg.c cVar = bVar.e;
            bVar2 = new b(1, bVar, cVar != null ? cVar.h() : null, obj2);
            bVar.f = bVar2;
        } else {
            bVar2.f26179b = 1;
            bVar2.f26180c = -1;
            bVar2.f141417g = null;
            bVar2.i = false;
            bVar2.f141418h = obj2;
            twg.c cVar2 = bVar2.e;
            if (cVar2 != null) {
                cVar2.f275018b = null;
                cVar2.f275019c = null;
                cVar2.d = null;
            }
        }
        this.d = bVar2;
        p pVar = this.f26174a;
        if (pVar != null) {
            ((f) pVar).a(this);
            return;
        }
        if (this.f141423p >= this.f141424q) {
            I();
        }
        char[] cArr = this.f141422n;
        int i = this.f141423p;
        this.f141423p = i + 1;
        cArr[i] = '[';
    }

    @Override // com.fasterxml.jackson.core.h
    public final void y(Object obj2) throws JsonGenerationException {
        E("start an array");
        b bVar = this.d;
        b bVar2 = bVar.f;
        if (bVar2 == null) {
            twg.c cVar = bVar.e;
            bVar2 = new b(1, bVar, cVar != null ? cVar.h() : null, obj2);
            bVar.f = bVar2;
        } else {
            bVar2.f26179b = 1;
            bVar2.f26180c = -1;
            bVar2.f141417g = null;
            bVar2.i = false;
            bVar2.f141418h = obj2;
            twg.c cVar2 = bVar2.e;
            if (cVar2 != null) {
                cVar2.f275018b = null;
                cVar2.f275019c = null;
                cVar2.d = null;
            }
        }
        this.d = bVar2;
        p pVar = this.f26174a;
        if (pVar != null) {
            ((f) pVar).a(this);
            return;
        }
        if (this.f141423p >= this.f141424q) {
            I();
        }
        char[] cArr = this.f141422n;
        int i = this.f141423p;
        this.f141423p = i + 1;
        cArr[i] = '[';
    }

    @Override // com.fasterxml.jackson.core.h
    public final void z() throws JsonGenerationException {
        E("start an object");
        b bVar = this.d;
        b bVar2 = bVar.f;
        if (bVar2 == null) {
            twg.c cVar = bVar.e;
            bVar2 = new b(2, bVar, cVar != null ? cVar.h() : null);
            bVar.f = bVar2;
        } else {
            bVar2.f26179b = 2;
            bVar2.f26180c = -1;
            bVar2.f141417g = null;
            bVar2.i = false;
            twg.c cVar2 = bVar2.e;
            if (cVar2 != null) {
                cVar2.f275018b = null;
                cVar2.f275019c = null;
                cVar2.d = null;
            }
        }
        this.d = bVar2;
        p pVar = this.f26174a;
        if (pVar != null) {
            f fVar = (f) pVar;
            u(CoreConstants.CURLY_LEFT);
            if (fVar.f172259b.a()) {
                return;
            }
            fVar.e++;
            return;
        }
        if (this.f141423p >= this.f141424q) {
            I();
        }
        char[] cArr = this.f141422n;
        int i = this.f141423p;
        this.f141423p = i + 1;
        cArr[i] = CoreConstants.CURLY_LEFT;
    }
}
