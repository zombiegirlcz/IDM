package org.bouncycastle.pqc.legacy.sphincsplus;

/* JADX INFO: loaded from: classes14.dex */
class PK {
    final byte[] root;
    final byte[] seed;

    public PK(byte[] bArr, byte[] bArr2) {
        this.seed = bArr;
        this.root = bArr2;
    }
}
