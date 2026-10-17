package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class y extends a3 {
    public static final Logger d = Logger.getLogger(y.class.getName());
    public static final boolean e = w3.e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w1 f49835c;

    public static int j(int i, p pVar) {
        int iL = l(i);
        int size = pVar.size();
        return m(size) + size + iL;
    }

    public static int k(String str) {
        int length;
        try {
            length = z3.b(str);
        } catch (y3 unused) {
            length = str.getBytes(j1.f49738a).length;
        }
        return m(length) + length;
    }

    public static int l(int i) {
        return m(i << 3);
    }

    public static int m(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int n(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public abstract void A(int i, d2 d2Var, t2 t2Var);

    public abstract void B(d2 d2Var);

    public abstract void C(int i, d2 d2Var);

    public abstract void D(int i, p pVar);

    public abstract void E(int i, String str);

    public abstract void F(String str);

    public abstract void G(int i, int i2);

    public abstract void H(int i, int i2);

    public abstract void I(int i);

    public abstract void J(int i, long j2);

    public abstract void K(long j2);

    public final void o(String str, y3 y3Var) throws CodedOutputStream$OutOfSpaceException {
        d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) y3Var);
        byte[] bytes = str.getBytes(j1.f49738a);
        try {
            I(bytes.length);
            i(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new CodedOutputStream$OutOfSpaceException(e2);
        }
    }

    public abstract void p(byte b4);

    public abstract void q(int i, boolean z);

    public abstract void r(int i, byte[] bArr);

    public abstract void s(int i, p pVar);

    public abstract void t(p pVar);

    public abstract void u(int i, int i2);

    public abstract void v(int i);

    public abstract void w(int i, long j2);

    public abstract void x(long j2);

    public abstract void y(int i, int i2);

    public abstract void z(int i);
}
