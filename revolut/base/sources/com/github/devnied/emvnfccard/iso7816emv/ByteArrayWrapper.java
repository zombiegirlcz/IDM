package com.github.devnied.emvnfccard.iso7816emv;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class ByteArrayWrapper {
    private final byte[] data;
    private final int hashcode;

    private ByteArrayWrapper(byte[] bArr) {
        this.data = bArr;
        this.hashcode = Arrays.hashCode(bArr);
    }

    public static ByteArrayWrapper wrapperAround(byte[] bArr) {
        bArr.getClass();
        return new ByteArrayWrapper(bArr);
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof ByteArrayWrapper) {
            return Arrays.equals(this.data, ((ByteArrayWrapper) obj2).data);
        }
        return false;
    }

    public int hashCode() {
        return this.hashcode;
    }
}
