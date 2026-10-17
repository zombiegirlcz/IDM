package com.github.devnied.emvnfccard.iso7816emv;

/* JADX INFO: loaded from: classes16.dex */
public class TLV {
    private int length;
    private byte[] rawEncodedLengthBytes;

    /* JADX INFO: renamed from: tag, reason: collision with root package name */
    private ITag f37243tag;
    private byte[] valueBytes;

    public TLV(ITag iTag, int i, byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || i != bArr2.length) {
            throw new IllegalArgumentException("length != bytes.length");
        }
        this.f37243tag = iTag;
        this.rawEncodedLengthBytes = bArr;
        this.valueBytes = bArr2;
        this.length = i;
    }

    public int getLength() {
        return this.length;
    }

    public byte[] getRawEncodedLengthBytes() {
        return this.rawEncodedLengthBytes;
    }

    public ITag getTag() {
        return this.f37243tag;
    }

    public byte[] getTagBytes() {
        return this.f37243tag.getTagBytes();
    }

    public byte[] getValueBytes() {
        return this.valueBytes;
    }

    public void setLength(int i) {
        this.length = i;
    }

    public void setRawEncodedLengthBytes(byte[] bArr) {
        this.rawEncodedLengthBytes = bArr;
    }

    public void setTag(ITag iTag) {
        this.f37243tag = iTag;
    }

    public void setValueBytes(byte[] bArr) {
        this.valueBytes = bArr;
    }
}
