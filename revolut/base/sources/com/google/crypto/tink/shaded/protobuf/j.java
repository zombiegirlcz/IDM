package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public abstract class j implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f49370b = new i(g0.f49365b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f49371c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49372a;

    static {
        f49371c = c.a() ? new g(1) : new g(0);
    }

    public static int b(int i, int i2, int i3) {
        int i5 = i2 - i;
        if ((i | i2 | i5 | (i3 - i2)) >= 0) {
            return i5;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(j6.a.l(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(a0.d.g(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a0.d.g(i2, i3, "End index: ", " >= "));
    }

    public static i c(int i, int i2, byte[] bArr) {
        byte[] bArrCopyOfRange;
        b(i, i + i2, bArr.length);
        switch (f49371c.f49363a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
                break;
            default:
                bArrCopyOfRange = new byte[i2];
                System.arraycopy(bArr, i, bArrCopyOfRange, 0, i2);
                break;
        }
        return new i(bArrCopyOfRange);
    }

    public abstract byte a(int i);

    public abstract void d(int i, byte[] bArr);

    public final byte[] e() {
        int size = size();
        if (size == 0) {
            return g0.f49365b;
        }
        byte[] bArr = new byte[size];
        d(size, bArr);
        return bArr;
    }

    public final int hashCode() {
        int i = this.f49372a;
        if (i != 0) {
            return i;
        }
        int size = size();
        i iVar = (i) this;
        int iF = iVar.f();
        int i2 = size;
        for (int i3 = iF; i3 < iF + size; i3++) {
            i2 = (i2 * 31) + iVar.d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f49372a = i2;
        return i2;
    }

    public abstract int size();

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = pyd.c.l(this);
        } else {
            StringBuilder sb6 = new StringBuilder();
            i iVar = (i) this;
            int iB = b(0, 47, iVar.size());
            sb6.append(pyd.c.l(iB == 0 ? f49370b : new h(iVar.d, iVar.f(), iB)));
            sb6.append("...");
            string = sb6.toString();
        }
        return v0.a.i(v0.a.k(size, "<ByteString@", hexString, " size=", " contents=\""), string, "\">");
    }
}
