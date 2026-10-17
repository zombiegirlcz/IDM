package com.github.devnied.emvnfccard.iso7816emv;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public class TagAndLength {
    private int length;

    /* JADX INFO: renamed from: tag, reason: collision with root package name */
    private ITag f37244tag;

    public TagAndLength(ITag iTag, int i) {
        this.f37244tag = iTag;
        this.length = i;
    }

    public byte[] getBytes() {
        byte[] tagBytes = this.f37244tag.getTagBytes();
        byte[] bArrCopyOf = Arrays.copyOf(tagBytes, tagBytes.length + 1);
        bArrCopyOf[bArrCopyOf.length - 1] = (byte) this.length;
        return bArrCopyOf;
    }

    public int getLength() {
        return this.length;
    }

    public ITag getTag() {
        return this.f37244tag;
    }

    public String toString() {
        return this.f37244tag.toString() + " length: " + this.length;
    }
}
