package com.google.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0 f49816b = new n0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f49817a;

    public w1(y yVar) {
        j1.a(yVar, "output");
        this.f49817a = yVar;
        yVar.f49835c = this;
    }

    public void a(int i, p pVar) {
        ((y) this.f49817a).s(i, pVar);
    }

    public void b(int i, int i2) {
        ((y) this.f49817a).u(i, i2);
    }

    public void c(int i, long j2) {
        ((y) this.f49817a).w(i, j2);
    }

    public void d(int i, Object obj2, t2 t2Var) {
        y yVar = (y) this.f49817a;
        yVar.G(i, 3);
        t2Var.a((d2) obj2, yVar.f49835c);
        yVar.G(i, 4);
    }

    public void e(int i, int i2) {
        ((y) this.f49817a).y(i, i2);
    }

    public void f(int i, long j2) {
        ((y) this.f49817a).J(i, j2);
    }

    public void g(int i, Object obj2, t2 t2Var) {
        ((y) this.f49817a).A(i, (d2) obj2, t2Var);
    }

    public void h(int i, Object obj2) {
        y yVar = (y) this.f49817a;
        if (obj2 instanceof p) {
            yVar.D(i, (p) obj2);
        } else {
            yVar.C(i, (d2) obj2);
        }
    }

    public w1() {
        b2 b2Var;
        try {
            b2Var = (b2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            b2Var = f49816b;
        }
        b2[] b2VarArr = {n0.f49751b, b2Var};
        v1 v1Var = new v1();
        v1Var.f49807a = b2VarArr;
        Charset charset = j1.f49738a;
        this.f49817a = v1Var;
    }
}
