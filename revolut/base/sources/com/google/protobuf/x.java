package com.google.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class x extends y {
    public final byte[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f49827h;
    public final OutputStream i;

    public x(OutputStream outputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.f = new byte[iMax];
        this.f49826g = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.i = outputStream;
    }

    @Override // com.google.protobuf.y
    public final void A(int i, d2 d2Var, t2 t2Var) {
        G(i, 2);
        I(((b) d2Var).getSerializedSize(t2Var));
        t2Var.a(d2Var, this.f49835c);
    }

    @Override // com.google.protobuf.y
    public final void B(d2 d2Var) {
        I(d2Var.getSerializedSize());
        d2Var.writeTo(this);
    }

    @Override // com.google.protobuf.y
    public final void C(int i, d2 d2Var) {
        G(1, 3);
        H(2, i);
        G(3, 2);
        B(d2Var);
        G(1, 4);
    }

    @Override // com.google.protobuf.y
    public final void D(int i, p pVar) {
        G(1, 3);
        H(2, i);
        s(3, pVar);
        G(1, 4);
    }

    @Override // com.google.protobuf.y
    public final void E(int i, String str) throws IOException {
        G(i, 2);
        F(str);
    }

    @Override // com.google.protobuf.y
    public final void F(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM = y.m(length);
            int i = iM + length;
            int i2 = this.f49826g;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iD = z3.f49840a.d(str, bArr, 0, length);
                I(iD);
                S(bArr, 0, iD);
                return;
            }
            if (i > i2 - this.f49827h) {
                Q();
            }
            int iM2 = y.m(str.length());
            int i3 = this.f49827h;
            byte[] bArr2 = this.f;
            try {
                try {
                    if (iM2 == iM) {
                        int i5 = i3 + iM2;
                        this.f49827h = i5;
                        int iD2 = z3.f49840a.d(str, bArr2, i5, i2 - i5);
                        this.f49827h = i3;
                        O((iD2 - i3) - iM2);
                        this.f49827h = iD2;
                    } else {
                        int iB = z3.b(str);
                        O(iB);
                        this.f49827h = z3.f49840a.d(str, bArr2, this.f49827h, iB);
                    }
                } catch (y3 e) {
                    this.f49827h = i3;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (y3 e4) {
            o(str, e4);
        }
    }

    @Override // com.google.protobuf.y
    public final void G(int i, int i2) {
        I((i << 3) | i2);
    }

    @Override // com.google.protobuf.y
    public final void H(int i, int i2) {
        R(20);
        N(i, 0);
        O(i2);
    }

    @Override // com.google.protobuf.y
    public final void I(int i) {
        R(5);
        O(i);
    }

    @Override // com.google.protobuf.y
    public final void J(int i, long j2) {
        R(20);
        N(i, 0);
        P(j2);
    }

    @Override // com.google.protobuf.y
    public final void K(long j2) {
        R(10);
        P(j2);
    }

    public final void L(int i) {
        int i2 = this.f49827h;
        int i3 = i2 + 1;
        this.f49827h = i3;
        byte[] bArr = this.f;
        bArr[i2] = (byte) (i & 255);
        int i5 = i2 + 2;
        this.f49827h = i5;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i6 = i2 + 3;
        this.f49827h = i6;
        bArr[i5] = (byte) ((i >> 16) & 255);
        this.f49827h = i2 + 4;
        bArr[i6] = (byte) ((i >> 24) & 255);
    }

    public final void M(long j2) {
        int i = this.f49827h;
        int i2 = i + 1;
        this.f49827h = i2;
        byte[] bArr = this.f;
        bArr[i] = (byte) (j2 & 255);
        int i3 = i + 2;
        this.f49827h = i3;
        bArr[i2] = (byte) ((j2 >> 8) & 255);
        int i5 = i + 3;
        this.f49827h = i5;
        bArr[i3] = (byte) ((j2 >> 16) & 255);
        int i6 = i + 4;
        this.f49827h = i6;
        bArr[i5] = (byte) (255 & (j2 >> 24));
        int i21 = i + 5;
        this.f49827h = i21;
        bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
        int i22 = i + 6;
        this.f49827h = i22;
        bArr[i21] = (byte) (((int) (j2 >> 40)) & 255);
        int i32 = i + 7;
        this.f49827h = i32;
        bArr[i22] = (byte) (((int) (j2 >> 48)) & 255);
        this.f49827h = i + 8;
        bArr[i32] = (byte) (((int) (j2 >> 56)) & 255);
    }

    public final void N(int i, int i2) {
        O((i << 3) | i2);
    }

    public final void O(int i) {
        boolean z = y.e;
        byte[] bArr = this.f;
        if (z) {
            while ((i & RangingPosition.RSSI_UNKNOWN) != 0) {
                int i2 = this.f49827h;
                this.f49827h = i2 + 1;
                w3.k(bArr, i2, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i3 = this.f49827h;
            this.f49827h = i3 + 1;
            w3.k(bArr, i3, (byte) i);
            return;
        }
        while ((i & RangingPosition.RSSI_UNKNOWN) != 0) {
            int i5 = this.f49827h;
            this.f49827h = i5 + 1;
            bArr[i5] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i6 = this.f49827h;
        this.f49827h = i6 + 1;
        bArr[i6] = (byte) i;
    }

    public final void P(long j2) {
        boolean z = y.e;
        byte[] bArr = this.f;
        if (z) {
            while ((j2 & (-128)) != 0) {
                int i = this.f49827h;
                this.f49827h = i + 1;
                w3.k(bArr, i, (byte) ((((int) j2) | 128) & 255));
                j2 >>>= 7;
            }
            int i2 = this.f49827h;
            this.f49827h = i2 + 1;
            w3.k(bArr, i2, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            int i3 = this.f49827h;
            this.f49827h = i3 + 1;
            bArr[i3] = (byte) ((((int) j2) | 128) & 255);
            j2 >>>= 7;
        }
        int i5 = this.f49827h;
        this.f49827h = i5 + 1;
        bArr[i5] = (byte) j2;
    }

    public final void Q() {
        this.i.write(this.f, 0, this.f49827h);
        this.f49827h = 0;
    }

    public final void R(int i) {
        if (this.f49826g - this.f49827h < i) {
            Q();
        }
    }

    public final void S(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f49827h;
        int i5 = this.f49826g;
        int i6 = i5 - i3;
        byte[] bArr2 = this.f;
        if (i6 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f49827h += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i6);
        int i21 = i + i6;
        int i22 = i2 - i6;
        this.f49827h = i5;
        Q();
        if (i22 > i5) {
            this.i.write(bArr, i21, i22);
        } else {
            System.arraycopy(bArr, i21, bArr2, 0, i22);
            this.f49827h = i22;
        }
    }

    @Override // com.google.protobuf.a3
    public final void i(byte[] bArr, int i, int i2) throws IOException {
        S(bArr, i, i2);
    }

    @Override // com.google.protobuf.y
    public final void p(byte b4) {
        if (this.f49827h == this.f49826g) {
            Q();
        }
        int i = this.f49827h;
        this.f49827h = i + 1;
        this.f[i] = b4;
    }

    @Override // com.google.protobuf.y
    public final void q(int i, boolean z) {
        R(11);
        N(i, 0);
        byte b4 = z ? (byte) 1 : (byte) 0;
        int i2 = this.f49827h;
        this.f49827h = i2 + 1;
        this.f[i2] = b4;
    }

    @Override // com.google.protobuf.y
    public final void r(int i, byte[] bArr) throws IOException {
        I(i);
        S(bArr, 0, i);
    }

    @Override // com.google.protobuf.y
    public final void s(int i, p pVar) {
        G(i, 2);
        t(pVar);
    }

    @Override // com.google.protobuf.y
    public final void t(p pVar) {
        I(pVar.size());
        pVar.n(this);
    }

    @Override // com.google.protobuf.y
    public final void u(int i, int i2) {
        R(14);
        N(i, 5);
        L(i2);
    }

    @Override // com.google.protobuf.y
    public final void v(int i) {
        R(4);
        L(i);
    }

    @Override // com.google.protobuf.y
    public final void w(int i, long j2) {
        R(18);
        N(i, 1);
        M(j2);
    }

    @Override // com.google.protobuf.y
    public final void x(long j2) {
        R(8);
        M(j2);
    }

    @Override // com.google.protobuf.y
    public final void y(int i, int i2) {
        R(20);
        N(i, 0);
        if (i2 >= 0) {
            O(i2);
        } else {
            P(i2);
        }
    }

    @Override // com.google.protobuf.y
    public final void z(int i) {
        if (i >= 0) {
            I(i);
        } else {
            K(i);
        }
    }
}
