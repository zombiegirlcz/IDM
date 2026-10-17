package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class o implements m, b1 {
    @Override // com.google.protobuf.m
    public byte[] copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // com.google.protobuf.b1
    public a1 findValueByNumber(int i) {
        if (i != 0) {
            return null;
        }
        return l2.NULL_VALUE;
    }
}
