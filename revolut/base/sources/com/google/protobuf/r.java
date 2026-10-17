package com.google.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public final class r extends t {
    public final InputStream d;
    public final byte[] e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f49779h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49780j;
    public int k = Integer.MAX_VALUE;

    public r(InputStream inputStream) {
        j1.a(inputStream, "input");
        this.d = inputStream;
        this.e = new byte[4096];
        this.f = 0;
        this.f49779h = 0;
        this.f49780j = 0;
    }

    @Override // com.google.protobuf.t
    public final int A() {
        return t.c(w());
    }

    @Override // com.google.protobuf.t
    public final long B() {
        return t.d(N());
    }

    @Override // com.google.protobuf.t
    public final String C() throws InvalidProtocolBufferException {
        int iW = w();
        byte[] bArr = this.e;
        if (iW > 0) {
            int i = this.f;
            int i2 = this.f49779h;
            if (iW <= i - i2) {
                String str = new String(bArr, i2, iW, j1.f49738a);
                this.f49779h += iW;
                return str;
            }
        }
        if (iW == 0) {
            return "";
        }
        if (iW > this.f) {
            return new String(I(iW), j1.f49738a);
        }
        Q(iW);
        String str2 = new String(bArr, this.f49779h, iW, j1.f49738a);
        this.f49779h += iW;
        return str2;
    }

    @Override // com.google.protobuf.t
    public final String D() throws IOException {
        int iW = w();
        int i = this.f49779h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArrI = this.e;
        if (iW <= i3 && iW > 0) {
            this.f49779h = i + iW;
        } else {
            if (iW == 0) {
                return "";
            }
            i = 0;
            if (iW <= i2) {
                Q(iW);
                this.f49779h = iW;
            } else {
                bArrI = I(iW);
            }
        }
        return z3.f49840a.a(bArrI, i, iW);
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
        return N();
    }

    @Override // com.google.protobuf.t
    public final boolean H(int i) throws InvalidProtocolBufferException {
        int iE;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i5 = this.f - this.f49779h;
            byte[] bArr = this.e;
            if (i5 >= 10) {
                while (i3 < 10) {
                    int i6 = this.f49779h;
                    this.f49779h = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.d();
            }
            while (i3 < 10) {
                if (this.f49779h == this.f) {
                    Q(1);
                }
                int i21 = this.f49779h;
                this.f49779h = i21 + 1;
                if (bArr[i21] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.d();
            return true;
        }
        if (i2 == 1) {
            R(8);
            return true;
        }
        if (i2 == 2) {
            R(w());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            R(4);
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

    public final byte[] I(int i) throws IOException {
        byte[] bArrJ = J(i);
        if (bArrJ != null) {
            return bArrJ;
        }
        int i2 = this.f49779h;
        int i3 = this.f;
        int length = i3 - i2;
        this.f49780j += i3;
        this.f49779h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListK = K(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListK) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] J(int i) throws IOException {
        if (i == 0) {
            return j1.f49739b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i2 = this.f49780j;
        int i3 = this.f49779h;
        int i5 = i2 + i3 + i;
        if (i5 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i6 = this.k;
        if (i5 > i6) {
            R((i6 - i2) - i3);
            throw InvalidProtocolBufferException.h();
        }
        int i21 = this.f - i3;
        int i22 = i - i21;
        InputStream inputStream = this.d;
        if (i22 >= 4096) {
            try {
                if (i22 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.f49676a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.f49779h, bArr, 0, i21);
        this.f49780j += this.f;
        this.f49779h = 0;
        this.f = 0;
        while (i21 < i) {
            try {
                int i32 = inputStream.read(bArr, i21, i - i21);
                if (i32 == -1) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f49780j += i32;
                i21 += i32;
            } catch (InvalidProtocolBufferException e2) {
                e2.f49676a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList K(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.d.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.h();
                }
                this.f49780j += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int L() throws InvalidProtocolBufferException {
        int i = this.f49779h;
        if (this.f - i < 4) {
            Q(4);
            i = this.f49779h;
        }
        this.f49779h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public final long M() throws InvalidProtocolBufferException {
        int i = this.f49779h;
        if (this.f - i < 8) {
            Q(8);
            i = this.f49779h;
        }
        this.f49779h = i + 8;
        byte[] bArr = this.e;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final long N() {
        long j2;
        long j3;
        long j5;
        long j16;
        int i = this.f49779h;
        int i2 = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.e;
            byte b4 = bArr[i];
            if (b4 >= 0) {
                this.f49779h = i3;
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
                this.f49779h = i5;
                return j2;
            }
        }
        return O();
    }

    public final long O() throws InvalidProtocolBufferException {
        long j2 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f49779h == this.f) {
                Q(1);
            }
            int i2 = this.f49779h;
            this.f49779h = i2 + 1;
            byte b4 = this.e[i2];
            j2 |= ((long) (b4 & Ascii.DEL)) << i;
            if ((b4 & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void P() {
        int i = this.f + this.f49778g;
        this.f = i;
        int i2 = this.f49780j + i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.f49778g = 0;
            return;
        }
        int i5 = i2 - i3;
        this.f49778g = i5;
        this.f = i - i5;
    }

    public final void Q(int i) throws InvalidProtocolBufferException {
        if (S(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f49780j) - this.f49779h) {
            throw InvalidProtocolBufferException.h();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void R(int i) throws InvalidProtocolBufferException {
        int i2 = this.f;
        int i3 = this.f49779h;
        if (i <= i2 - i3 && i >= 0) {
            this.f49779h = i3 + i;
            return;
        }
        InputStream inputStream = this.d;
        if (i < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i5 = this.f49780j;
        int i6 = i5 + i3;
        int i21 = i6 + i;
        int i22 = this.k;
        if (i21 > i22) {
            R((i22 - i5) - i3);
            throw InvalidProtocolBufferException.h();
        }
        this.f49780j = i6;
        int i32 = i2 - i3;
        this.f = 0;
        this.f49779h = 0;
        while (i32 < i) {
            long j2 = i - i32;
            try {
                try {
                    long jSkip = inputStream.skip(j2);
                    if (jSkip < 0 || jSkip > j2) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i32 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.f49676a = true;
                    throw e;
                }
            } catch (Throwable th10) {
                this.f49780j += i32;
                P();
                throw th10;
            }
        }
        this.f49780j += i32;
        P();
        if (i32 >= i) {
            return;
        }
        int i33 = this.f;
        int i43 = i33 - this.f49779h;
        this.f49779h = i33;
        Q(1);
        while (true) {
            int i59 = i - i43;
            int i66 = this.f;
            if (i59 <= i66) {
                this.f49779h = i59;
                return;
            } else {
                i43 += i66;
                this.f49779h = i66;
                Q(1);
            }
        }
    }

    public final boolean S(int i) throws IOException {
        InputStream inputStream = this.d;
        int i2 = this.f49779h;
        int i3 = i2 + i;
        int i5 = this.f;
        if (i3 <= i5) {
            throw new IllegalStateException(j6.a.l(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i6 = this.f49780j;
        if (i <= (Integer.MAX_VALUE - i6) - i2 && i6 + i2 + i <= this.k) {
            byte[] bArr = this.e;
            if (i2 > 0) {
                if (i5 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i5 - i2);
                }
                this.f49780j += i2;
                this.f -= i2;
                this.f49779h = 0;
            }
            int i21 = this.f;
            try {
                int i22 = inputStream.read(bArr, i21, Math.min(bArr.length - i21, (Integer.MAX_VALUE - this.f49780j) - i21));
                if (i22 == 0 || i22 < -1 || i22 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i22 + "\nThe InputStream implementation is buggy.");
                }
                if (i22 > 0) {
                    this.f += i22;
                    P();
                    if (this.f >= i) {
                        return true;
                    }
                    return S(i);
                }
            } catch (InvalidProtocolBufferException e) {
                e.f49676a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.t
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.i != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.protobuf.t
    public final int e() {
        int i = this.k;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f49780j + this.f49779h);
    }

    @Override // com.google.protobuf.t
    public final int f() {
        return this.f49780j + this.f49779h;
    }

    @Override // com.google.protobuf.t
    public final boolean g() {
        return this.f49779h == this.f && !S(1);
    }

    @Override // com.google.protobuf.t
    public final void j(int i) {
        this.k = i;
        P();
    }

    @Override // com.google.protobuf.t
    public final int k(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i2 = this.f49780j + this.f49779h + i;
        int i3 = this.k;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.h();
        }
        this.k = i2;
        P();
        return i3;
    }

    @Override // com.google.protobuf.t
    public final boolean l() {
        return N() != 0;
    }

    @Override // com.google.protobuf.t
    public final n m() throws IOException {
        int iW = w();
        int i = this.f;
        int i2 = this.f49779h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (iW <= i3 && iW > 0) {
            n nVarC = p.c(i2, iW, bArr);
            this.f49779h += iW;
            return nVarC;
        }
        if (iW == 0) {
            return p.f49757b;
        }
        byte[] bArrJ = J(iW);
        if (bArrJ != null) {
            return p.c(0, bArrJ.length, bArrJ);
        }
        int i5 = this.f49779h;
        int i6 = this.f;
        int length = i6 - i5;
        this.f49780j += i6;
        this.f49779h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListK = K(iW - length);
        byte[] bArr2 = new byte[iW];
        System.arraycopy(bArr, i5, bArr2, 0, length);
        for (byte[] bArr3 : arrayListK) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        n nVar = p.f49757b;
        return new n(bArr2);
    }

    @Override // com.google.protobuf.t
    public final double n() {
        return Double.longBitsToDouble(M());
    }

    @Override // com.google.protobuf.t
    public final int o() {
        return w();
    }

    @Override // com.google.protobuf.t
    public final int p() {
        return L();
    }

    @Override // com.google.protobuf.t
    public final long q() {
        return M();
    }

    @Override // com.google.protobuf.t
    public final float r() {
        return Float.intBitsToFloat(L());
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
        return N();
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
        int i2 = this.f49779h;
        int i3 = this.f;
        if (i3 != i2) {
            int i5 = i2 + 1;
            byte[] bArr = this.e;
            byte b4 = bArr[i2];
            if (b4 >= 0) {
                this.f49779h = i5;
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
                this.f49779h = i6;
                return i;
            }
        }
        return (int) O();
    }

    @Override // com.google.protobuf.t
    public final int y() {
        return L();
    }

    @Override // com.google.protobuf.t
    public final long z() {
        return M();
    }
}
