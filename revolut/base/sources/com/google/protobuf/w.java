package com.google.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;

/* JADX INFO: loaded from: classes.dex */
public final class w extends y {
    public final byte[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f49815h;

    public w(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i3 = i + i2;
        if ((i | i2 | (bArr.length - i3)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.f = bArr;
        this.f49815h = i;
        this.f49814g = i3;
    }

    @Override // com.google.protobuf.y
    public final void A(int i, d2 d2Var, t2 t2Var) throws CodedOutputStream$OutOfSpaceException {
        G(i, 2);
        I(((b) d2Var).getSerializedSize(t2Var));
        t2Var.a(d2Var, this.f49835c);
    }

    @Override // com.google.protobuf.y
    public final void B(d2 d2Var) throws CodedOutputStream$OutOfSpaceException {
        I(d2Var.getSerializedSize());
        d2Var.writeTo(this);
    }

    @Override // com.google.protobuf.y
    public final void C(int i, d2 d2Var) throws CodedOutputStream$OutOfSpaceException {
        G(1, 3);
        H(2, i);
        G(3, 2);
        B(d2Var);
        G(1, 4);
    }

    @Override // com.google.protobuf.y
    public final void D(int i, p pVar) throws CodedOutputStream$OutOfSpaceException {
        G(1, 3);
        H(2, i);
        s(3, pVar);
        G(1, 4);
    }

    @Override // com.google.protobuf.y
    public final void E(int i, String str) throws CodedOutputStream$OutOfSpaceException {
        G(i, 2);
        F(str);
    }

    @Override // com.google.protobuf.y
    public final void F(String str) throws CodedOutputStream$OutOfSpaceException {
        int i = this.f49815h;
        try {
            int iM = y.m(str.length() * 3);
            int iM2 = y.m(str.length());
            byte[] bArr = this.f;
            if (iM2 != iM) {
                I(z3.b(str));
                this.f49815h = z3.f49840a.d(str, bArr, this.f49815h, L());
                return;
            }
            int i2 = i + iM2;
            this.f49815h = i2;
            int iD = z3.f49840a.d(str, bArr, i2, L());
            this.f49815h = i;
            I((iD - i) - iM2);
            this.f49815h = iD;
        } catch (y3 e) {
            this.f49815h = i;
            o(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(e2);
        }
    }

    @Override // com.google.protobuf.y
    public final void G(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        I((i << 3) | i2);
    }

    @Override // com.google.protobuf.y
    public final void H(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        G(i, 0);
        I(i2);
    }

    @Override // com.google.protobuf.y
    public final void I(int i) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i2 = i & RangingPosition.RSSI_UNKNOWN;
            byte[] bArr = this.f;
            if (i2 == 0) {
                int i3 = this.f49815h;
                this.f49815h = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i5 = this.f49815h;
                    this.f49815h = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49815h), Integer.valueOf(this.f49814g), 1), e);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49815h), Integer.valueOf(this.f49814g), 1), e);
        }
    }

    @Override // com.google.protobuf.y
    public final void J(int i, long j2) throws CodedOutputStream$OutOfSpaceException {
        G(i, 0);
        K(j2);
    }

    @Override // com.google.protobuf.y
    public final void K(long j2) throws CodedOutputStream$OutOfSpaceException {
        boolean z = y.e;
        byte[] bArr = this.f;
        if (z && L() >= 10) {
            while ((j2 & (-128)) != 0) {
                int i = this.f49815h;
                this.f49815h = i + 1;
                w3.k(bArr, i, (byte) ((((int) j2) | 128) & 255));
                j2 >>>= 7;
            }
            int i2 = this.f49815h;
            this.f49815h = i2 + 1;
            w3.k(bArr, i2, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                int i3 = this.f49815h;
                this.f49815h = i3 + 1;
                bArr[i3] = (byte) ((((int) j2) | 128) & 255);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49815h), Integer.valueOf(this.f49814g), 1), e);
            }
        }
        int i5 = this.f49815h;
        this.f49815h = i5 + 1;
        bArr[i5] = (byte) j2;
    }

    public final int L() {
        return this.f49814g - this.f49815h;
    }

    public final void M(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i, this.f, this.f49815h, i2);
            this.f49815h += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49815h), Integer.valueOf(this.f49814g), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.protobuf.a3
    public final void i(byte[] bArr, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        M(bArr, i, i2);
    }

    @Override // com.google.protobuf.y
    public final void p(byte b4) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f;
            int i = this.f49815h;
            this.f49815h = i + 1;
            bArr[i] = b4;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49815h), Integer.valueOf(this.f49814g), 1), e);
        }
    }

    @Override // com.google.protobuf.y
    public final void q(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        G(i, 0);
        p(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.y
    public final void r(int i, byte[] bArr) throws CodedOutputStream$OutOfSpaceException {
        I(i);
        M(bArr, 0, i);
    }

    @Override // com.google.protobuf.y
    public final void s(int i, p pVar) throws CodedOutputStream$OutOfSpaceException {
        G(i, 2);
        t(pVar);
    }

    @Override // com.google.protobuf.y
    public final void t(p pVar) throws CodedOutputStream$OutOfSpaceException {
        I(pVar.size());
        pVar.n(this);
    }

    @Override // com.google.protobuf.y
    public final void u(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        G(i, 5);
        v(i2);
    }

    @Override // com.google.protobuf.y
    public final void v(int i) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f;
            int i2 = this.f49815h;
            int i3 = i2 + 1;
            this.f49815h = i3;
            bArr[i2] = (byte) (i & 255);
            int i5 = i2 + 2;
            this.f49815h = i5;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i6 = i2 + 3;
            this.f49815h = i6;
            bArr[i5] = (byte) ((i >> 16) & 255);
            this.f49815h = i2 + 4;
            bArr[i6] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49815h), Integer.valueOf(this.f49814g), 1), e);
        }
    }

    @Override // com.google.protobuf.y
    public final void w(int i, long j2) throws CodedOutputStream$OutOfSpaceException {
        G(i, 1);
        x(j2);
    }

    @Override // com.google.protobuf.y
    public final void x(long j2) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f;
            int i = this.f49815h;
            int i2 = i + 1;
            this.f49815h = i2;
            bArr[i] = (byte) (((int) j2) & 255);
            int i3 = i + 2;
            this.f49815h = i3;
            bArr[i2] = (byte) (((int) (j2 >> 8)) & 255);
            int i5 = i + 3;
            this.f49815h = i5;
            bArr[i3] = (byte) (((int) (j2 >> 16)) & 255);
            int i6 = i + 4;
            this.f49815h = i6;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
            int i21 = i + 5;
            this.f49815h = i21;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i22 = i + 6;
            this.f49815h = i22;
            bArr[i21] = (byte) (((int) (j2 >> 40)) & 255);
            int i32 = i + 7;
            this.f49815h = i32;
            bArr[i22] = (byte) (((int) (j2 >> 48)) & 255);
            this.f49815h = i + 8;
            bArr[i32] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f49815h), Integer.valueOf(this.f49814g), 1), e);
        }
    }

    @Override // com.google.protobuf.y
    public final void y(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        G(i, 0);
        z(i2);
    }

    @Override // com.google.protobuf.y
    public final void z(int i) throws CodedOutputStream$OutOfSpaceException {
        if (i >= 0) {
            I(i);
        } else {
            K(i);
        }
    }
}
