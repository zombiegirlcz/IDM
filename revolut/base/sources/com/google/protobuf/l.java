package com.google.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public final class l extends n {
    public final int e;
    public final int f;

    public l(byte[] bArr, int i, int i2) {
        super(bArr);
        p.b(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // com.google.protobuf.n, com.google.protobuf.p
    public final byte a(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.d[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(a0.d.n("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(a0.d.g(i, i2, "Index > length: ", ", "));
    }

    @Override // com.google.protobuf.n, com.google.protobuf.p
    public final byte e(int i) {
        return this.d[this.e + i];
    }

    @Override // com.google.protobuf.n
    public final int o() {
        return this.e;
    }

    @Override // com.google.protobuf.n, com.google.protobuf.p
    public final int size() {
        return this.f;
    }
}
