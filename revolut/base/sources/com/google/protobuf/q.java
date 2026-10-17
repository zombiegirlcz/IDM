package com.google.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes.dex */
public final class q extends t {
    public final byte[] d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f49770h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49771j = Integer.MAX_VALUE;

    public q(byte[] bArr, int i, int i2, boolean z) {
        this.d = bArr;
        this.e = i2 + i;
        this.f49769g = i;
        this.f49770h = i;
    }

    @Override // com.google.protobuf.t
    public final int A() {
        return t.c(w());
    }

    @Override // com.google.protobuf.t
    public final long B() {
        return t.d(K());
    }

    @Override // com.google.protobuf.t
    public final String C() throws InvalidProtocolBufferException {
        int iW = w();
        if (iW > 0) {
            int i = this.e;
            int i2 = this.f49769g;
            if (iW <= i - i2) {
                String str = new String(this.d, i2, iW, j1.f49738a);
                this.f49769g += iW;
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
            int i = this.e;
            int i2 = this.f49769g;
            if (iW <= i - i2) {
                String strA = z3.f49840a.a(this.d, i2, iW);
                this.f49769g += iW;
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
            this.i = 0;
            return 0;
        }
        int iW = w();
        this.i = iW;
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
        return K();
    }

    @Override // com.google.protobuf.t
    public final boolean H(int i) throws InvalidProtocolBufferException {
        int iE;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i5 = this.e - this.f49769g;
            byte[] bArr = this.d;
            if (i5 >= 10) {
                while (i3 < 10) {
                    int i6 = this.f49769g;
                    this.f49769g = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.d();
            }
            while (i3 < 10) {
                int i21 = this.f49769g;
                if (i21 == this.e) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f49769g = i21 + 1;
                if (bArr[i21] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.d();
            return true;
        }
        if (i2 == 1) {
            N(8);
            return true;
        }
        if (i2 == 2) {
            N(w());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            N(4);
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

    public final int I() throws InvalidProtocolBufferException {
        int i = this.f49769g;
        if (this.e - i < 4) {
            throw InvalidProtocolBufferException.h();
        }
        this.f49769g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public final long J() throws InvalidProtocolBufferException {
        int i = this.f49769g;
        if (this.e - i < 8) {
            throw InvalidProtocolBufferException.h();
        }
        this.f49769g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final long K() {
        long j2;
        long j3;
        long j5;
        long j16;
        int i = this.f49769g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b4 = bArr[i];
            if (b4 >= 0) {
                this.f49769g = i3;
                return b4;
            }
            if (i2 - i3 >= 9) {
                int i5 = i + 2;
                int i6 = (bArr[i3] << 7) ^ b4;
                if (i6 < 0) {
                    j2 = i6 ^ RangingPosition.RSSI_UNKNOWN;
                } else {
                    int i21 = i + 3;
                    int i22 = (bArr[i5] << 14) ^ i6;
                    if (i22 >= 0) {
                        j2 = i22 ^ 16256;
                        i5 = i21;
                    } else {
                        int i32 = i + 4;
                        int i33 = i22 ^ (bArr[i21] << Ascii.NAK);
                        if (i33 < 0) {
                            j16 = (-2080896) ^ i33;
                        } else {
                            long j22 = i33;
                            i5 = i + 5;
                            long j42 = j22 ^ (((long) bArr[i32]) << 28);
                            if (j42 >= 0) {
                                j5 = 266354560;
                            } else {
                                i32 = i + 6;
                                long j46 = j42 ^ (((long) bArr[i5]) << 35);
                                if (j46 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i + 7;
                                    j42 = j46 ^ (((long) bArr[i32]) << 42);
                                    if (j42 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i32 = i + 8;
                                        j46 = j42 ^ (((long) bArr[i5]) << 49);
                                        if (j46 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i + 9;
                                            long j47 = (j46 ^ (((long) bArr[i32]) << 56)) ^ 71499008037633920L;
                                            if (j47 < 0) {
                                                int i43 = i + 10;
                                                if (bArr[i5] >= 0) {
                                                    i5 = i43;
                                                }
                                            }
                                            j2 = j47;
                                        }
                                    }
                                }
                                j16 = j3 ^ j46;
                            }
                            j2 = j5 ^ j42;
                        }
                        i5 = i32;
                        j2 = j16;
                    }
                }
                this.f49769g = i5;
                return j2;
            }
        }
        return L();
    }

    public final long L() throws InvalidProtocolBufferException {
        long j2 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f49769g;
            if (i2 == this.e) {
                throw InvalidProtocolBufferException.h();
            }
            this.f49769g = i2 + 1;
            byte b4 = this.d[i2];
            j2 |= ((long) (b4 & Ascii.DEL)) << i;
            if ((b4 & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void M() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = i - this.f49770h;
        int i3 = this.f49771j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i5 = i2 - i3;
        this.f = i5;
        this.e = i - i5;
    }

    public final void N(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.f49769g;
            if (i <= i2 - i3) {
                this.f49769g = i3 + i;
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
        if (this.i != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.t
    public final int e() {
        int i = this.f49771j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - f();
    }

    @Override // com.google.protobuf.t
    public final int f() {
        return this.f49769g - this.f49770h;
    }

    @Override // com.google.protobuf.t
    public final boolean g() {
        return this.f49769g == this.e;
    }

    @Override // com.google.protobuf.t
    public final void j(int i) {
        this.f49771j = i;
        M();
    }

    @Override // com.google.protobuf.t
    public final int k(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int iF = f() + i;
        if (iF < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i2 = this.f49771j;
        if (iF > i2) {
            throw InvalidProtocolBufferException.h();
        }
        this.f49771j = iF;
        M();
        return i2;
    }

    @Override // com.google.protobuf.t
    public final boolean l() {
        return K() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // com.google.protobuf.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.protobuf.n m() throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            r4 = this;
            int r0 = r4.w()
            byte[] r1 = r4.d
            if (r0 <= 0) goto L19
            int r2 = r4.e
            int r3 = r4.f49769g
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            com.google.protobuf.n r1 = com.google.protobuf.p.c(r3, r0, r1)
            int r2 = r4.f49769g
            int r2 = r2 + r0
            r4.f49769g = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.protobuf.n r0 = com.google.protobuf.p.f49757b
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.e
            int r3 = r4.f49769g
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f49769g = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = com.google.protobuf.j1.f49739b
        L35:
            com.google.protobuf.n r1 = com.google.protobuf.p.f49757b
            com.google.protobuf.n r1 = new com.google.protobuf.n
            r1.<init>(r0)
            return r1
        L3d:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.e()
            throw r0
        L42:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q.m():com.google.protobuf.n");
    }

    @Override // com.google.protobuf.t
    public final double n() {
        return Double.longBitsToDouble(J());
    }

    @Override // com.google.protobuf.t
    public final int o() {
        return w();
    }

    @Override // com.google.protobuf.t
    public final int p() {
        return I();
    }

    @Override // com.google.protobuf.t
    public final long q() {
        return J();
    }

    @Override // com.google.protobuf.t
    public final float r() {
        return Float.intBitsToFloat(I());
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
        return K();
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

    @Override // com.google.protobuf.t
    public final int w() {
        int i;
        int i2 = this.f49769g;
        int i3 = this.e;
        if (i3 != i2) {
            int i5 = i2 + 1;
            byte[] bArr = this.d;
            byte b4 = bArr[i2];
            if (b4 >= 0) {
                this.f49769g = i5;
                return b4;
            }
            if (i3 - i5 >= 9) {
                int i6 = i2 + 2;
                int i21 = (bArr[i5] << 7) ^ b4;
                if (i21 < 0) {
                    i = i21 ^ RangingPosition.RSSI_UNKNOWN;
                } else {
                    int i22 = i2 + 3;
                    int i32 = (bArr[i6] << 14) ^ i21;
                    if (i32 >= 0) {
                        i = i32 ^ 16256;
                    } else {
                        int i33 = i2 + 4;
                        int i43 = i32 ^ (bArr[i22] << Ascii.NAK);
                        if (i43 < 0) {
                            i = (-2080896) ^ i43;
                        } else {
                            i22 = i2 + 5;
                            byte b5 = bArr[i33];
                            int i59 = (i43 ^ (b5 << 28)) ^ 266354560;
                            if (b5 < 0) {
                                i33 = i2 + 6;
                                if (bArr[i22] < 0) {
                                    i22 = i2 + 7;
                                    if (bArr[i33] < 0) {
                                        i33 = i2 + 8;
                                        if (bArr[i22] < 0) {
                                            i22 = i2 + 9;
                                            if (bArr[i33] < 0) {
                                                int i66 = i2 + 10;
                                                if (bArr[i22] >= 0) {
                                                    i6 = i66;
                                                    i = i59;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i59;
                            }
                            i = i59;
                        }
                        i6 = i33;
                    }
                    i6 = i22;
                }
                this.f49769g = i6;
                return i;
            }
        }
        return (int) L();
    }

    @Override // com.google.protobuf.t
    public final int y() {
        return I();
    }

    @Override // com.google.protobuf.t
    public final long z() {
        return J();
    }
}
