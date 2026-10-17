package com.fasterxml.jackson.core;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes16.dex */
public abstract class h implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f26174a;

    static {
        r39.a.c(s.values());
        s.CAN_WRITE_FORMATTED_NUMBERS.getMask();
        s.CAN_WRITE_BINARY_NATIVELY.getMask();
    }

    public static void f(int i, int i2) {
        if (i2 > i) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", 0, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public abstract void A(Object obj2);

    public abstract void B(String str);

    public abstract void C(char[] cArr, int i, int i2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public final void d(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public abstract g9.a g(g gVar);

    public abstract boolean h(g gVar);

    public abstract void i(Object obj2);

    public abstract void j(b bVar, byte[] bArr, int i, int i2);

    public abstract void k(boolean z);

    public abstract void l();

    public abstract void m();

    public abstract void n(q qVar);

    public abstract void o(String str);

    public abstract void p();

    public abstract void q(double d);

    public abstract void r(float f);

    public abstract void s(int i);

    public abstract void t(long j2);

    public abstract void u(char c2);

    public abstract void v(String str);

    public abstract void w();

    public abstract void x(Object obj2);

    public abstract void y(Object obj2);

    public abstract void z();
}
