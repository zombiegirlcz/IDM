package org.bouncycastle.crypto.signers.slhdsa;

/* JADX INFO: loaded from: classes14.dex */
class IndexedDigest {
    final byte[] digest;
    final int idx_leaf;
    final long idx_tree;

    public IndexedDigest(long j2, int i, byte[] bArr) {
        this.idx_tree = j2;
        this.idx_leaf = i;
        this.digest = bArr;
    }
}
