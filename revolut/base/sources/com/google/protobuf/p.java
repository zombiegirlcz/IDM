package com.google.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f49757b = new n(j1.f49739b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f49758c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49759a;

    static {
        f49758c = d.a() ? new o() : new by5.a(7);
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

    public static n c(int i, int i2, byte[] bArr) {
        b(i, i + i2, bArr.length);
        return new n(f49758c.copyFrom(bArr, i, i2));
    }

    public static n d(String str) {
        return new n(str.getBytes(j1.f49738a));
    }

    public abstract byte a(int i);

    public abstract byte e(int i);

    public abstract boolean f();

    public abstract t h();

    public final int hashCode() {
        int i = this.f49759a;
        if (i == 0) {
            int size = size();
            i = i(size, size);
            if (i == 0) {
                i = 1;
            }
            this.f49759a = i;
        }
        return i;
    }

    public abstract int i(int i, int i2);

    public abstract p k(int i);

    public abstract String l(Charset charset);

    public final String m() {
        return size() == 0 ? "" : l(j1.f49738a);
    }

    public abstract void n(y yVar);

    public abstract int size();

    public final String toString() {
        String strE;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strE = a3.e(this);
        } else {
            strE = a3.e(k(47)) + "...";
        }
        return v0.a.i(v0.a.k(size, "<ByteString@", hexString, " size=", " contents=\""), strE, "\">");
    }
}
