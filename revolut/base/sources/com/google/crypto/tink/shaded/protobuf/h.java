package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends i {
    public final int e;
    public final int f;

    public h(byte[] bArr, int i, int i2) {
        super(bArr);
        j.b(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i, com.google.crypto.tink.shaded.protobuf.j
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

    @Override // com.google.crypto.tink.shaded.protobuf.i, com.google.crypto.tink.shaded.protobuf.j
    public final void d(int i, byte[] bArr) {
        System.arraycopy(this.d, this.e, bArr, 0, i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final int f() {
        return this.e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public final byte h(int i) {
        return this.d[this.e + i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i, com.google.crypto.tink.shaded.protobuf.j
    public final int size() {
        return this.f;
    }
}
