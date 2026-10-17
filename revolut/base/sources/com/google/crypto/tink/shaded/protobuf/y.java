package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public abstract class y implements u0, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f49435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f49436b;

    public y(b0 b0Var) {
        this.f49435a = b0Var;
        if (b0Var.m()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f49436b = b0Var.p();
    }

    public static void f(Object obj2, Object obj3) {
        d1 d1Var = d1.f49352c;
        d1Var.getClass();
        d1Var.a(obj2.getClass()).mergeFrom(obj2, obj3);
    }

    public final b0 a() {
        b0 b0VarB = b();
        b0VarB.getClass();
        if (b0.l(b0VarB, true)) {
            return b0VarB;
        }
        throw new UninitializedMessageException();
    }

    public final b0 b() {
        if (!this.f49436b.m()) {
            return this.f49436b;
        }
        b0 b0Var = this.f49436b;
        b0Var.getClass();
        d1 d1Var = d1.f49352c;
        d1Var.getClass();
        d1Var.a(b0Var.getClass()).makeImmutable(b0Var);
        b0Var.n();
        return this.f49436b;
    }

    public final y c() {
        y yVarC = this.f49435a.c();
        yVarC.f49436b = b();
        return yVarC;
    }

    public final void e() {
        if (this.f49436b.m()) {
            return;
        }
        b0 b0VarP = this.f49435a.p();
        f(b0VarP, this.f49436b);
        this.f49436b = b0VarP;
    }
}
