package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {
    public final byte[] d;

    public n(byte[] bArr) {
        this.f49759a = 0;
        bArr.getClass();
        this.d = bArr;
    }

    @Override // com.google.protobuf.p
    public byte a(int i) {
        return this.d[i];
    }

    @Override // com.google.protobuf.p
    public byte e(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof p) || size() != ((p) obj2).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return obj2.equals(this);
        }
        n nVar = (n) obj2;
        int i = this.f49759a;
        int i2 = nVar.f49759a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > nVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > nVar.size()) {
            StringBuilder sbW = a0.d.w(size, "Ran off end of other: 0, ", ", ");
            sbW.append(nVar.size());
            throw new IllegalArgumentException(sbW.toString());
        }
        byte[] bArr = nVar.d;
        int iO = o() + size;
        int iO2 = o();
        int iO3 = nVar.o();
        while (iO2 < iO) {
            if (this.d[iO2] != bArr[iO3]) {
                return false;
            }
            iO2++;
            iO3++;
        }
        return true;
    }

    @Override // com.google.protobuf.p
    public final boolean f() {
        int iO = o();
        return z3.f49840a.f(this.d, iO, size() + iO);
    }

    @Override // com.google.protobuf.p
    public final t h() {
        return t.h(this.d, o(), size(), true);
    }

    @Override // com.google.protobuf.p
    public final int i(int i, int i2) {
        int iO = o();
        Charset charset = j1.f49738a;
        for (int i3 = iO; i3 < iO + i2; i3++) {
            i = (i * 31) + this.d[i3];
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new com.google.crypto.tink.shaded.protobuf.f(this);
    }

    @Override // com.google.protobuf.p
    public final p k(int i) {
        int iB = p.b(0, i, size());
        return iB == 0 ? p.f49757b : new l(this.d, o(), iB);
    }

    @Override // com.google.protobuf.p
    public final String l(Charset charset) {
        return new String(this.d, o(), size(), charset);
    }

    @Override // com.google.protobuf.p
    public final void n(y yVar) {
        yVar.i(this.d, o(), size());
    }

    public int o() {
        return 0;
    }

    @Override // com.google.protobuf.p
    public int size() {
        return this.d.length;
    }
}
