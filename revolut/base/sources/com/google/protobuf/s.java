package com.google.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class s extends t {
    public final ByteBuffer d;
    public final long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f49785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f49786h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49787j;
    public int k = Integer.MAX_VALUE;

    public s(ByteBuffer byteBuffer, boolean z) {
        this.d = byteBuffer;
        long j2 = w3.f49823c.j(byteBuffer, w3.f49824g);
        this.e = j2;
        this.f = ((long) byteBuffer.limit()) + j2;
        long jPosition = j2 + ((long) byteBuffer.position());
        this.f49785g = jPosition;
        this.f49786h = jPosition;
    }

    public static boolean I() {
        return w3.d;
    }

    @Override // com.google.protobuf.t
    public final int A() {
        return t.c(w());
    }

    @Override // com.google.protobuf.t
    public final long B() {
        return t.d(L());
    }

    @Override // com.google.protobuf.t
    public final String C() throws InvalidProtocolBufferException {
        int iW = w();
        if (iW > 0) {
            long j2 = this.f;
            long j3 = this.f49785g;
            if (iW <= ((int) (j2 - j3))) {
                byte[] bArr = new byte[iW];
                long j5 = iW;
                w3.f49823c.c(j3, bArr, j5);
                String str = new String(bArr, j1.f49738a);
                this.f49785g += j5;
                return str;
            }
        }
        if (iW == 0) {
            return "";
        }
        if (iW < 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.h();
    }

    @Override // com.google.protobuf.t
    public final String D() throws InvalidProtocolBufferException {
        int iW = w();
        if (iW > 0) {
            long j2 = this.f;
            long j3 = this.f49785g;
            if (iW <= ((int) (j2 - j3))) {
                int i = (int) (j3 - this.e);
                a3 a3Var = z3.f49840a;
                a3Var.getClass();
                ByteBuffer byteBuffer = this.d;
                String strA = byteBuffer.hasArray() ? a3Var.a(byteBuffer.array(), byteBuffer.arrayOffset() + i, iW) : byteBuffer.isDirect() ? a3Var.c(byteBuffer, i, iW) : a3.b(byteBuffer, i, iW);
                this.f49785g += (long) iW;
                return strA;
            }
        }
        if (iW == 0) {
            return "";
        }
        if (iW <= 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.h();
    }

    @Override // com.google.protobuf.t
    public final int E() throws InvalidProtocolBufferException {
        if (g()) {
            this.f49787j = 0;
            return 0;
        }
        int iW = w();
        this.f49787j = iW;
        if ((iW >>> 3) != 0) {
            return iW;
        }
        throw InvalidProtocolBufferException.a();
    }

    @Override // com.google.protobuf.t
    public final int F() {
        return w();
    }

    @Override // com.google.protobuf.t
    public final long G() {
        return L();
    }

    @Override // com.google.protobuf.t
    public final boolean H(int i) throws InvalidProtocolBufferException {
        int iE;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (((int) (this.f - this.f49785g)) >= 10) {
                while (i3 < 10) {
                    long j2 = this.f49785g;
                    this.f49785g = j2 + 1;
                    if (w3.f49823c.e(j2) < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.d();
            }
            while (i3 < 10) {
                long j3 = this.f49785g;
                if (j3 == this.f) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f49785g = j3 + 1;
                if (w3.f49823c.e(j3) < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.d();
            return true;
        }
        if (i2 == 1) {
            O(8);
            return true;
        }
        if (i2 == 2) {
            O(w());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            O(4);
            return true;
        }
        do {
            iE = E();
            if (iE == 0) {
                break;
            }
        } while (H(iE));
        a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int J() throws InvalidProtocolBufferException {
        long j2 = this.f49785g;
        if (this.f - j2 < 4) {
            throw InvalidProtocolBufferException.h();
        }
        this.f49785g = 4 + j2;
        v3 v3Var = w3.f49823c;
        return ((v3Var.e(j2 + 3) & UnsignedBytes.MAX_VALUE) << 24) | (v3Var.e(j2) & UnsignedBytes.MAX_VALUE) | ((v3Var.e(1 + j2) & UnsignedBytes.MAX_VALUE) << 8) | ((v3Var.e(2 + j2) & UnsignedBytes.MAX_VALUE) << 16);
    }

    public final long K() throws InvalidProtocolBufferException {
        long j2 = this.f49785g;
        if (this.f - j2 < 8) {
            throw InvalidProtocolBufferException.h();
        }
        this.f49785g = 8 + j2;
        v3 v3Var = w3.f49823c;
        return ((((long) v3Var.e(j2 + 7)) & 255) << 56) | (((long) v3Var.e(j2)) & 255) | ((((long) v3Var.e(1 + j2)) & 255) << 8) | ((((long) v3Var.e(2 + j2)) & 255) << 16) | ((((long) v3Var.e(3 + j2)) & 255) << 24) | ((((long) v3Var.e(4 + j2)) & 255) << 32) | ((((long) v3Var.e(5 + j2)) & 255) << 40) | ((((long) v3Var.e(6 + j2)) & 255) << 48);
    }

    public final long L() {
        long j2;
        long j3;
        long j5;
        int i;
        long j16 = this.f49785g;
        if (this.f != j16) {
            long j22 = 1 + j16;
            v3 v3Var = w3.f49823c;
            byte bE = v3Var.e(j16);
            if (bE >= 0) {
                this.f49785g = j22;
                return bE;
            }
            if (this.f - j22 >= 9) {
                long j42 = 2 + j16;
                int iE = (v3Var.e(j22) << 7) ^ bE;
                if (iE >= 0) {
                    long j46 = 3 + j16;
                    int iE2 = iE ^ (v3Var.e(j42) << 14);
                    if (iE2 >= 0) {
                        j2 = iE2 ^ 16256;
                    } else {
                        j42 = j16 + 4;
                        int iE3 = iE2 ^ (v3Var.e(j46) << Ascii.NAK);
                        if (iE3 < 0) {
                            i = (-2080896) ^ iE3;
                        } else {
                            j46 = 5 + j16;
                            long jE = ((long) iE3) ^ (((long) v3Var.e(j42)) << 28);
                            if (jE < 0) {
                                long j47 = 6 + j16;
                                long jE2 = jE ^ (((long) v3Var.e(j46)) << 35);
                                if (jE2 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j46 = 7 + j16;
                                    jE = jE2 ^ (((long) v3Var.e(j47)) << 42);
                                    if (jE >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        j47 = 8 + j16;
                                        jE2 = jE ^ (((long) v3Var.e(j46)) << 49);
                                        if (jE2 >= 0) {
                                            long j57 = j16 + 9;
                                            long jE3 = (jE2 ^ (((long) v3Var.e(j47)) << 56)) ^ 71499008037633920L;
                                            if (jE3 < 0) {
                                                long j58 = j16 + 10;
                                                if (v3Var.e(j57) >= 0) {
                                                    j42 = j58;
                                                    j2 = jE3;
                                                }
                                            } else {
                                                j2 = jE3;
                                                j42 = j57;
                                            }
                                            this.f49785g = j42;
                                            return j2;
                                        }
                                        j3 = -558586000294016L;
                                    }
                                }
                                j2 = j3 ^ jE2;
                                j42 = j47;
                                this.f49785g = j42;
                                return j2;
                            }
                            j5 = 266354560;
                            j2 = j5 ^ jE;
                        }
                    }
                    j42 = j46;
                    this.f49785g = j42;
                    return j2;
                }
                i = iE ^ RangingPosition.RSSI_UNKNOWN;
                j2 = i;
                this.f49785g = j42;
                return j2;
            }
        }
        return M();
    }

    public final long M() throws InvalidProtocolBufferException {
        long j2 = 0;
        for (int i = 0; i < 64; i += 7) {
            long j3 = this.f49785g;
            if (j3 == this.f) {
                throw InvalidProtocolBufferException.h();
            }
            this.f49785g = 1 + j3;
            byte bE = w3.f49823c.e(j3);
            j2 |= ((long) (bE & Ascii.DEL)) << i;
            if ((bE & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void N() {
        long j2 = this.f + ((long) this.i);
        this.f = j2;
        int i = (int) (j2 - this.f49786h);
        int i2 = this.k;
        if (i <= i2) {
            this.i = 0;
            return;
        }
        int i3 = i - i2;
        this.i = i3;
        this.f = j2 - ((long) i3);
    }

    public final void O(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            long j2 = this.f;
            long j3 = this.f49785g;
            if (i <= ((int) (j2 - j3))) {
                this.f49785g = j3 + ((long) i);
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.h();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // com.google.protobuf.t
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.f49787j != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.t
    public final int e() {
        int i = this.k;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - f();
    }

    @Override // com.google.protobuf.t
    public final int f() {
        return (int) (this.f49785g - this.f49786h);
    }

    @Override // com.google.protobuf.t
    public final boolean g() {
        return this.f49785g == this.f;
    }

    @Override // com.google.protobuf.t
    public final void j(int i) {
        this.k = i;
        N();
    }

    @Override // com.google.protobuf.t
    public final int k(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int iF = f() + i;
        int i2 = this.k;
        if (iF > i2) {
            throw InvalidProtocolBufferException.h();
        }
        this.k = iF;
        N();
        return i2;
    }

    @Override // com.google.protobuf.t
    public final boolean l() {
        return L() != 0;
    }

    @Override // com.google.protobuf.t
    public final n m() throws InvalidProtocolBufferException {
        int iW = w();
        if (iW > 0) {
            long j2 = this.f;
            long j3 = this.f49785g;
            if (iW <= ((int) (j2 - j3))) {
                byte[] bArr = new byte[iW];
                long j5 = iW;
                w3.f49823c.c(j3, bArr, j5);
                this.f49785g += j5;
                n nVar = p.f49757b;
                return new n(bArr);
            }
        }
        if (iW == 0) {
            return p.f49757b;
        }
        if (iW < 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.h();
    }

    @Override // com.google.protobuf.t
    public final double n() {
        return Double.longBitsToDouble(K());
    }

    @Override // com.google.protobuf.t
    public final int o() {
        return w();
    }

    @Override // com.google.protobuf.t
    public final int p() {
        return J();
    }

    @Override // com.google.protobuf.t
    public final long q() {
        return K();
    }

    @Override // com.google.protobuf.t
    public final float r() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.protobuf.t
    public final void s(int i, c2 c2Var, d0 d0Var) throws InvalidProtocolBufferException {
        b();
        this.f49788a++;
        ((p0) c2Var).e(this, d0Var);
        a((i << 3) | 4);
        this.f49788a--;
    }

    @Override // com.google.protobuf.t
    public final int t() {
        return w();
    }

    @Override // com.google.protobuf.t
    public final long u() {
        return L();
    }

    @Override // com.google.protobuf.t
    public final void v(c2 c2Var, d0 d0Var) throws InvalidProtocolBufferException {
        int iW = w();
        b();
        int iK = k(iW);
        this.f49788a++;
        ((p0) c2Var).e(this, d0Var);
        a(0);
        this.f49788a--;
        if (e() != 0) {
            throw InvalidProtocolBufferException.h();
        }
        j(iK);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.e(r8) < 0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[PHI: r6
      0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w() {
        /*
            r12 = this;
            long r0 = r12.f49785g
            long r2 = r12.f
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L93
        La:
            r2 = 1
            long r2 = r2 + r0
            com.google.protobuf.v3 r4 = com.google.protobuf.w3.f49823c
            byte r5 = r4.e(r0)
            if (r5 < 0) goto L18
            r12.f49785g = r2
            return r5
        L18:
            long r6 = r12.f
            long r6 = r6 - r2
            r8 = 9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L93
        L23:
            r6 = 2
            long r6 = r6 + r0
            byte r2 = r4.e(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L33
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La0
        L33:
            r10 = 3
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            int r3 = r3 << 14
            r2 = r2 ^ r3
            if (r2 < 0) goto L43
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L41:
            r6 = r10
            goto La0
        L43:
            r5 = 4
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L55
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto La0
        L55:
            r10 = 5
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            int r5 = r3 << 28
            r2 = r2 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r5
            if (r3 >= 0) goto L9e
            r5 = 6
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            if (r3 >= 0) goto L99
            r10 = 7
            long r10 = r10 + r0
            byte r3 = r4.e(r6)
            if (r3 >= 0) goto L9e
            r5 = 8
            long r6 = r0 + r5
            byte r3 = r4.e(r10)
            if (r3 >= 0) goto L99
            long r8 = r8 + r0
            byte r3 = r4.e(r6)
            if (r3 >= 0) goto L9b
            r5 = 10
            long r6 = r0 + r5
            byte r0 = r4.e(r8)
            if (r0 >= 0) goto L99
        L93:
            long r0 = r12.M()
            int r0 = (int) r0
            return r0
        L99:
            r0 = r2
            goto La0
        L9b:
            r0 = r2
            r6 = r8
            goto La0
        L9e:
            r0 = r2
            goto L41
        La0:
            r12.f49785g = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s.w():int");
    }

    @Override // com.google.protobuf.t
    public final int y() {
        return J();
    }

    @Override // com.google.protobuf.t
    public final long z() {
        return K();
    }
}
