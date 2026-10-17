package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class i extends j {
    public final byte[] d;

    public i(byte[] bArr) {
        this.f49372a = 0;
        bArr.getClass();
        this.d = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j
    public byte a(int i) {
        return this.d[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j
    public void d(int i, byte[] bArr) {
        System.arraycopy(this.d, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof j) || size() != ((j) obj2).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return obj2.equals(this);
        }
        i iVar = (i) obj2;
        int i = this.f49372a;
        int i2 = iVar.f49372a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > iVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > iVar.size()) {
            StringBuilder sbW = a0.d.w(size, "Ran off end of other: 0, ", ", ");
            sbW.append(iVar.size());
            throw new IllegalArgumentException(sbW.toString());
        }
        byte[] bArr = iVar.d;
        int iF = f() + size;
        int iF2 = f();
        int iF3 = iVar.f();
        while (iF2 < iF) {
            if (this.d[iF2] != bArr[iF3]) {
                return false;
            }
            iF2++;
            iF3++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte h(int i) {
        return this.d[i];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j
    public int size() {
        return this.d.length;
    }
}
