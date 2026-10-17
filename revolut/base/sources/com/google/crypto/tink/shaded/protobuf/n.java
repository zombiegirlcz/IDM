package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;
import java.util.logging.Logger;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes17.dex */
public final class n extends pw5.a {
    public static final Logger e = Logger.getLogger(n.class.getName());
    public static final boolean f = s1.e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p0 f49391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f49392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49393c;
    public int d;

    public n(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f49392b = bArr;
        this.d = 0;
        this.f49393c = i;
    }

    public static int M(int i, j jVar) {
        return N(jVar) + T(i);
    }

    public static int N(j jVar) {
        int size = jVar.size();
        return U(size) + size;
    }

    public static int O(int i) {
        return T(i) + 4;
    }

    public static int P(int i) {
        return T(i) + 8;
    }

    public static int Q(int i, a aVar, g1 g1Var) {
        return aVar.a(g1Var) + (T(i) * 2);
    }

    public static int R(int i) {
        if (i >= 0) {
            return U(i);
        }
        return 10;
    }

    public static int S(String str) {
        int length;
        try {
            length = v1.b(str);
        } catch (u1 unused) {
            length = str.getBytes(g0.f49364a).length;
        }
        return U(length) + length;
    }

    public static int T(int i) {
        return U(i << 3);
    }

    public static int U(int i) {
        if ((i & RangingPosition.RSSI_UNKNOWN) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int V(long j2) {
        int i;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j2) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i + 1 : i;
    }

    public final void W(byte b4) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f49392b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b4;
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f49393c), 1), e2);
        }
    }

    public final void X(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.f49392b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f49393c), Integer.valueOf(i2)), e2);
        }
    }

    public final void Y(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        d0(i, 5);
        Z(i2);
    }

    public final void Z(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f49392b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & 255);
            int i5 = i2 + 2;
            this.d = i5;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i6 = i2 + 3;
            this.d = i6;
            bArr[i5] = (byte) ((i >> 16) & 255);
            this.d = i2 + 4;
            bArr[i6] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f49393c), 1), e2);
        }
    }

    public final void a0(int i, long j2) throws CodedOutputStream$OutOfSpaceException {
        d0(i, 1);
        b0(j2);
    }

    public final void b0(long j2) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f49392b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j2) & 255);
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j2 >> 8)) & 255);
            int i5 = i + 3;
            this.d = i5;
            bArr[i3] = (byte) (((int) (j2 >> 16)) & 255);
            int i6 = i + 4;
            this.d = i6;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
            int i21 = i + 5;
            this.d = i21;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i22 = i + 6;
            this.d = i22;
            bArr[i21] = (byte) (((int) (j2 >> 40)) & 255);
            int i32 = i + 7;
            this.d = i32;
            bArr[i22] = (byte) (((int) (j2 >> 48)) & 255);
            this.d = i + 8;
            bArr[i32] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f49393c), 1), e2);
        }
    }

    public final void c0(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            e0(i);
        } else {
            g0(i);
        }
    }

    public final void d0(int i, int i2) {
        e0((i << 3) | i2);
    }

    public final void e0(int i) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i2 = i & RangingPosition.RSSI_UNKNOWN;
            byte[] bArr = this.f49392b;
            if (i2 == 0) {
                int i3 = this.d;
                this.d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i5 = this.d;
                    this.d = i5 + 1;
                    bArr[i5] = (byte) ((i & CertificateBody.profileType) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f49393c), 1), e2);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f49393c), 1), e2);
        }
    }

    public final void f0(int i, long j2) throws CodedOutputStream$OutOfSpaceException {
        d0(i, 0);
        g0(j2);
    }

    public final void g0(long j2) throws CodedOutputStream$OutOfSpaceException {
        boolean z = f;
        int i = this.f49393c;
        byte[] bArr = this.f49392b;
        if (z && i - this.d >= 10) {
            while ((j2 & (-128)) != 0) {
                int i2 = this.d;
                this.d = i2 + 1;
                s1.k(bArr, i2, (byte) ((((int) j2) & CertificateBody.profileType) | 128));
                j2 >>>= 7;
            }
            int i3 = this.d;
            this.d = i3 + 1;
            s1.k(bArr, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                int i5 = this.d;
                this.d = i5 + 1;
                bArr[i5] = (byte) ((((int) j2) & CertificateBody.profileType) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
            }
        }
        int i6 = this.d;
        this.d = i6 + 1;
        bArr[i6] = (byte) j2;
    }
}
