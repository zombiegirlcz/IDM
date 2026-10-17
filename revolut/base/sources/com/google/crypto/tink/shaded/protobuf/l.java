package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public final class l extends cd.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteArrayInputStream f49380c;
    public final byte[] d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f49382h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49383j = Integer.MAX_VALUE;

    public l(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = g0.f49364a;
        this.f49380c = byteArrayInputStream;
        this.d = new byte[4096];
        this.e = 0;
        this.f49381g = 0;
        this.i = 0;
    }

    @Override // cd.e
    public final String A() throws InvalidProtocolBufferException {
        int iK = K();
        byte[] bArr = this.d;
        if (iK > 0) {
            int i = this.e;
            int i2 = this.f49381g;
            if (iK <= i - i2) {
                String str = new String(bArr, i2, iK, g0.f49364a);
                this.f49381g += iK;
                return str;
            }
        }
        if (iK == 0) {
            return "";
        }
        if (iK > this.e) {
            return new String(F(iK), g0.f49364a);
        }
        O(iK);
        String str2 = new String(bArr, this.f49381g, iK, g0.f49364a);
        this.f49381g += iK;
        return str2;
    }

    @Override // cd.e
    public final String B() throws IOException {
        int iK = K();
        int i = this.f49381g;
        int i2 = this.e;
        int i3 = i2 - i;
        byte[] bArrF = this.d;
        if (iK <= i3 && iK > 0) {
            this.f49381g = i + iK;
        } else {
            if (iK == 0) {
                return "";
            }
            i = 0;
            if (iK <= i2) {
                O(iK);
                this.f49381g = iK;
            } else {
                bArrF = F(iK);
            }
        }
        return v1.f49419a.i(bArrF, i, iK);
    }

    @Override // cd.e
    public final int C() throws InvalidProtocolBufferException {
        if (h()) {
            this.f49382h = 0;
            return 0;
        }
        int iK = K();
        this.f49382h = iK;
        if ((iK >>> 3) != 0) {
            return iK;
        }
        throw InvalidProtocolBufferException.a();
    }

    @Override // cd.e
    public final int D() {
        return K();
    }

    @Override // cd.e
    public final long E() {
        return L();
    }

    public final byte[] F(int i) throws IOException {
        byte[] bArrG = G(i);
        if (bArrG != null) {
            return bArrG;
        }
        int i2 = this.f49381g;
        int i3 = this.e;
        int length = i3 - i2;
        this.i += i3;
        this.f49381g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListH = H(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListH) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] G(int i) throws IOException {
        if (i == 0) {
            return g0.f49365b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i2 = this.i;
        int i3 = this.f49381g;
        int i5 = i2 + i3 + i;
        if (i5 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i6 = this.f49383j;
        if (i5 > i6) {
            P((i6 - i2) - i3);
            throw InvalidProtocolBufferException.h();
        }
        int i21 = this.e - i3;
        int i22 = i - i21;
        ByteArrayInputStream byteArrayInputStream = this.f49380c;
        if (i22 >= 4096) {
            try {
                if (i22 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.f49345a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.f49381g, bArr, 0, i21);
        this.i += this.e;
        this.f49381g = 0;
        this.e = 0;
        while (i21 < i) {
            try {
                int i32 = byteArrayInputStream.read(bArr, i21, i - i21);
                if (i32 == -1) {
                    throw InvalidProtocolBufferException.h();
                }
                this.i += i32;
                i21 += i32;
            } catch (InvalidProtocolBufferException e2) {
                e2.f49345a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList H(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f49380c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.h();
                }
                this.i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int I() throws InvalidProtocolBufferException {
        int i = this.f49381g;
        if (this.e - i < 4) {
            O(4);
            i = this.f49381g;
        }
        this.f49381g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public final long J() throws InvalidProtocolBufferException {
        int i = this.f49381g;
        if (this.e - i < 8) {
            O(8);
            i = this.f49381g;
        }
        this.f49381g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final int K() {
        int i;
        int i2 = this.f49381g;
        int i3 = this.e;
        if (i3 != i2) {
            int i5 = i2 + 1;
            byte[] bArr = this.d;
            byte b4 = bArr[i2];
            if (b4 >= 0) {
                this.f49381g = i5;
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
                this.f49381g = i6;
                return i;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j2;
        long j3;
        long j5;
        long j16;
        int i = this.f49381g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b4 = bArr[i];
            if (b4 >= 0) {
                this.f49381g = i3;
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
                this.f49381g = i5;
                return j2;
            }
        }
        return M();
    }

    public final long M() throws InvalidProtocolBufferException {
        long j2 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f49381g == this.e) {
                O(1);
            }
            int i2 = this.f49381g;
            this.f49381g = i2 + 1;
            byte b4 = this.d[i2];
            j2 |= ((long) (b4 & Ascii.DEL)) << i;
            if ((b4 & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void N() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.f49383j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i5 = i2 - i3;
        this.f = i5;
        this.e = i - i5;
    }

    public final void O(int i) throws InvalidProtocolBufferException {
        if (Q(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.f49381g) {
            throw InvalidProtocolBufferException.h();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void P(int i) throws InvalidProtocolBufferException {
        int i2 = this.e;
        int i3 = this.f49381g;
        int i5 = i2 - i3;
        if (i <= i5 && i >= 0) {
            this.f49381g = i3 + i;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f49380c;
        if (i < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i6 = this.i;
        int i21 = i6 + i3;
        int i22 = i21 + i;
        int i32 = this.f49383j;
        if (i22 > i32) {
            P((i32 - i6) - i3);
            throw InvalidProtocolBufferException.h();
        }
        this.i = i21;
        this.e = 0;
        this.f49381g = 0;
        while (i5 < i) {
            long j2 = i - i5;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j2);
                    if (jSkip < 0 || jSkip > j2) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i5 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.f49345a = true;
                    throw e;
                }
            } catch (Throwable th10) {
                this.i += i5;
                N();
                throw th10;
            }
        }
        this.i += i5;
        N();
        if (i5 >= i) {
            return;
        }
        int i33 = this.e;
        int i43 = i33 - this.f49381g;
        this.f49381g = i33;
        O(1);
        while (true) {
            int i59 = i - i43;
            int i66 = this.e;
            if (i59 <= i66) {
                this.f49381g = i59;
                return;
            } else {
                i43 += i66;
                this.f49381g = i66;
                O(1);
            }
        }
    }

    public final boolean Q(int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f49380c;
        int i2 = this.f49381g;
        int i3 = i2 + i;
        int i5 = this.e;
        if (i3 <= i5) {
            throw new IllegalStateException(j6.a.l(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i6 = this.i;
        if (i <= (Integer.MAX_VALUE - i6) - i2 && i6 + i2 + i <= this.f49383j) {
            byte[] bArr = this.d;
            if (i2 > 0) {
                if (i5 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i5 - i2);
                }
                this.i += i2;
                this.e -= i2;
                this.f49381g = 0;
            }
            int i21 = this.e;
            try {
                int i22 = byteArrayInputStream.read(bArr, i21, Math.min(bArr.length - i21, (Integer.MAX_VALUE - this.i) - i21));
                if (i22 == 0 || i22 < -1 || i22 > bArr.length) {
                    throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + i22 + "\nThe InputStream implementation is buggy.");
                }
                if (i22 > 0) {
                    this.e += i22;
                    N();
                    if (this.e >= i) {
                        return true;
                    }
                    return Q(i);
                }
            } catch (InvalidProtocolBufferException e) {
                e.f49345a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // cd.e
    public final void b(int i) throws InvalidProtocolBufferException {
        if (this.f49382h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // cd.e
    public final int g() {
        return this.i + this.f49381g;
    }

    @Override // cd.e
    public final boolean h() {
        return this.f49381g == this.e && !Q(1);
    }

    @Override // cd.e
    public final void k(int i) {
        this.f49383j = i;
        N();
    }

    @Override // cd.e
    public final int m(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i2 = this.i + this.f49381g + i;
        int i3 = this.f49383j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.h();
        }
        this.f49383j = i2;
        N();
        return i3;
    }

    @Override // cd.e
    public final boolean n() {
        return L() != 0;
    }

    @Override // cd.e
    public final i o() throws IOException {
        int iK = K();
        int i = this.e;
        int i2 = this.f49381g;
        int i3 = i - i2;
        byte[] bArr = this.d;
        if (iK <= i3 && iK > 0) {
            i iVarC = j.c(i2, iK, bArr);
            this.f49381g += iK;
            return iVarC;
        }
        if (iK == 0) {
            return j.f49370b;
        }
        byte[] bArrG = G(iK);
        if (bArrG != null) {
            return j.c(0, bArrG.length, bArrG);
        }
        int i5 = this.f49381g;
        int i6 = this.e;
        int length = i6 - i5;
        this.i += i6;
        this.f49381g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListH = H(iK - length);
        byte[] bArr2 = new byte[iK];
        System.arraycopy(bArr, i5, bArr2, 0, length);
        for (byte[] bArr3 : arrayListH) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        i iVar = j.f49370b;
        return new i(bArr2);
    }

    @Override // cd.e
    public final double p() {
        return Double.longBitsToDouble(J());
    }

    @Override // cd.e
    public final int q() {
        return K();
    }

    @Override // cd.e
    public final int r() {
        return I();
    }

    @Override // cd.e
    public final long s() {
        return J();
    }

    @Override // cd.e
    public final float t() {
        return Float.intBitsToFloat(I());
    }

    @Override // cd.e
    public final int u() {
        return K();
    }

    @Override // cd.e
    public final long v() {
        return L();
    }

    @Override // cd.e
    public final int w() {
        return I();
    }

    @Override // cd.e
    public final long x() {
        return J();
    }

    @Override // cd.e
    public final int y() {
        return cd.e.d(K());
    }

    @Override // cd.e
    public final long z() {
        return cd.e.e(L());
    }
}
