package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes17.dex */
public final class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f49397b = new x(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f49398a;

    public p0(n nVar) {
        g0.a(nVar, "output");
        this.f49398a = nVar;
        nVar.f49391a = this;
    }

    public void a(int i, boolean z) throws CodedOutputStream$OutOfSpaceException {
        n nVar = (n) this.f49398a;
        nVar.d0(i, 0);
        nVar.W(z ? (byte) 1 : (byte) 0);
    }

    public void b(int i, j jVar) {
        n nVar = (n) this.f49398a;
        nVar.d0(i, 2);
        nVar.e0(jVar.size());
        i iVar = (i) jVar;
        nVar.X(iVar.d, iVar.f(), iVar.size());
    }

    public void c(int i, double d) throws CodedOutputStream$OutOfSpaceException {
        n nVar = (n) this.f49398a;
        nVar.getClass();
        nVar.a0(i, Double.doubleToRawLongBits(d));
    }

    public void d(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        n nVar = (n) this.f49398a;
        nVar.d0(i, 0);
        nVar.c0(i2);
    }

    public void e(int i, int i2) {
        ((n) this.f49398a).Y(i, i2);
    }

    public void f(int i, long j2) {
        ((n) this.f49398a).a0(i, j2);
    }

    public void g(int i, float f) throws CodedOutputStream$OutOfSpaceException {
        n nVar = (n) this.f49398a;
        nVar.getClass();
        nVar.Y(i, Float.floatToRawIntBits(f));
    }

    public void h(int i, Object obj2, g1 g1Var) {
        n nVar = (n) this.f49398a;
        nVar.d0(i, 3);
        g1Var.f((a) obj2, nVar.f49391a);
        nVar.d0(i, 4);
    }

    public void i(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        n nVar = (n) this.f49398a;
        nVar.d0(i, 0);
        nVar.c0(i2);
    }

    public void j(int i, long j2) {
        ((n) this.f49398a).f0(i, j2);
    }

    public void k(int i, Object obj2, g1 g1Var) throws CodedOutputStream$OutOfSpaceException {
        n nVar = (n) this.f49398a;
        a aVar = (a) obj2;
        nVar.d0(i, 2);
        nVar.e0(aVar.a(g1Var));
        g1Var.f(aVar, nVar.f49391a);
    }

    public void l(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        ((n) this.f49398a).Y(i, i2);
    }

    public void m(int i, long j2) throws CodedOutputStream$OutOfSpaceException {
        ((n) this.f49398a).a0(i, j2);
    }

    public void n(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        n nVar = (n) this.f49398a;
        nVar.d0(i, 0);
        nVar.e0((i2 >> 31) ^ (i2 << 1));
    }

    public void o(int i, long j2) throws CodedOutputStream$OutOfSpaceException {
        ((n) this.f49398a).f0(i, (j2 >> 63) ^ (j2 << 1));
    }

    public void p(int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        n nVar = (n) this.f49398a;
        nVar.d0(i, 0);
        nVar.e0(i2);
    }

    public void q(int i, long j2) throws CodedOutputStream$OutOfSpaceException {
        ((n) this.f49398a).f0(i, j2);
    }

    public p0() {
        t0 t0Var;
        try {
            t0Var = (t0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            t0Var = f49397b;
        }
        t0[] t0VarArr = {x.f49430b, t0Var};
        o0 o0Var = new o0();
        o0Var.f49395a = t0VarArr;
        Charset charset = g0.f49364a;
        this.f49398a = o0Var;
    }
}
