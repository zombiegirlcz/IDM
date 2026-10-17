package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes17.dex */
public final class k extends cd.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f49376c;
    public int d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f49378h;
    public int i = Integer.MAX_VALUE;

    public k(byte[] bArr, int i, int i2, boolean z) {
        this.f49376c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.f49377g = i;
    }

    @Override // cd.e
    public final String A() throws InvalidProtocolBufferException {
        int iH = H();
        if (iH > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iH <= i - i2) {
                String str = new String(this.f49376c, i2, iH, g0.f49364a);
                this.f += iH;
                return str;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH < 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.h();
    }

    @Override // cd.e
    public final String B() throws InvalidProtocolBufferException {
        int iH = H();
        if (iH > 0) {
            int i = this.d;
            int i2 = this.f;
            if (iH <= i - i2) {
                String strI = v1.f49419a.i(this.f49376c, i2, iH);
                this.f += iH;
                return strI;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH <= 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.h();
    }

    @Override // cd.e
    public final int C() throws InvalidProtocolBufferException {
        if (h()) {
            this.f49378h = 0;
            return 0;
        }
        int iH = H();
        this.f49378h = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw InvalidProtocolBufferException.a();
    }

    @Override // cd.e
    public final int D() {
        return H();
    }

    @Override // cd.e
    public final long E() {
        return I();
    }

    public final int F() throws InvalidProtocolBufferException {
        int i = this.f;
        if (this.d - i < 4) {
            throw InvalidProtocolBufferException.h();
        }
        this.f = i + 4;
        byte[] bArr = this.f49376c;
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public final long G() throws InvalidProtocolBufferException {
        int i = this.f;
        if (this.d - i < 8) {
            throw InvalidProtocolBufferException.h();
        }
        this.f = i + 8;
        byte[] bArr = this.f49376c;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int H() {
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i5 = i2 + 1;
            byte[] bArr = this.f49376c;
            byte b4 = bArr[i2];
            if (b4 >= 0) {
                this.f = i5;
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
                this.f = i6;
                return i;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j2;
        long j3;
        long j5;
        long j16;
        int i = this.f;
        int i2 = this.d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f49376c;
            byte b4 = bArr[i];
            if (b4 >= 0) {
                this.f = i3;
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
                this.f = i5;
                return j2;
            }
        }
        return J();
    }

    public final long J() throws InvalidProtocolBufferException {
        long j2 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw InvalidProtocolBufferException.h();
            }
            this.f = i2 + 1;
            byte b4 = this.f49376c[i2];
            j2 |= ((long) (b4 & Ascii.DEL)) << i;
            if ((b4 & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void K() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = i - this.f49377g;
        int i3 = this.i;
        if (i2 <= i3) {
            this.e = 0;
            return;
        }
        int i5 = i2 - i3;
        this.e = i5;
        this.d = i - i5;
    }

    @Override // cd.e
    public final void b(int i) throws InvalidProtocolBufferException {
        if (this.f49378h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // cd.e
    public final int g() {
        return this.f - this.f49377g;
    }

    @Override // cd.e
    public final boolean h() {
        return this.f == this.d;
    }

    @Override // cd.e
    public final void k(int i) {
        this.i = i;
        K();
    }

    @Override // cd.e
    public final int m(int i) {
        if (i < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int iG = g() + i;
        if (iG < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i2 = this.i;
        if (iG > i2) {
            throw InvalidProtocolBufferException.h();
        }
        this.i = iG;
        K();
        return i2;
    }

    @Override // cd.e
    public final boolean n() {
        return I() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // cd.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.crypto.tink.shaded.protobuf.i o() throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            r4 = this;
            int r0 = r4.H()
            byte[] r1 = r4.f49376c
            if (r0 <= 0) goto L19
            int r2 = r4.d
            int r3 = r4.f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            com.google.crypto.tink.shaded.protobuf.i r1 = com.google.crypto.tink.shaded.protobuf.j.c(r3, r0, r1)
            int r2 = r4.f
            int r2 = r2 + r0
            r4.f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.crypto.tink.shaded.protobuf.i r0 = com.google.crypto.tink.shaded.protobuf.j.f49370b
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.d
            int r3 = r4.f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = com.google.crypto.tink.shaded.protobuf.g0.f49365b
        L35:
            com.google.crypto.tink.shaded.protobuf.i r1 = com.google.crypto.tink.shaded.protobuf.j.f49370b
            com.google.crypto.tink.shaded.protobuf.i r1 = new com.google.crypto.tink.shaded.protobuf.i
            r1.<init>(r0)
            return r1
        L3d:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.e()
            throw r0
        L42:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.k.o():com.google.crypto.tink.shaded.protobuf.i");
    }

    @Override // cd.e
    public final double p() {
        return Double.longBitsToDouble(G());
    }

    @Override // cd.e
    public final int q() {
        return H();
    }

    @Override // cd.e
    public final int r() {
        return F();
    }

    @Override // cd.e
    public final long s() {
        return G();
    }

    @Override // cd.e
    public final float t() {
        return Float.intBitsToFloat(F());
    }

    @Override // cd.e
    public final int u() {
        return H();
    }

    @Override // cd.e
    public final long v() {
        return I();
    }

    @Override // cd.e
    public final int w() {
        return F();
    }

    @Override // cd.e
    public final long x() {
        return G();
    }

    @Override // cd.e
    public final int y() {
        return cd.e.d(H());
    }

    @Override // cd.e
    public final long z() {
        return cd.e.e(I());
    }
}
