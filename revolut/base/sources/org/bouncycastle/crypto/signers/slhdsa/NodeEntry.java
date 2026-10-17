package org.bouncycastle.crypto.signers.slhdsa;

/* JADX INFO: loaded from: classes14.dex */
class NodeEntry {
    final int nodeHeight;
    final byte[] nodeValue;

    public NodeEntry(byte[] bArr, int i) {
        this.nodeValue = bArr;
        this.nodeHeight = i;
    }
}
