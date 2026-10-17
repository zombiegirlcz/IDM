package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f49760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w0 f49761b;

    public p0(w0 w0Var) {
        this.f49760a = w0Var;
        if (w0Var.isMutable()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f49761b = w0Var.newMutableInstance();
    }

    public static void g(Object obj2, Object obj3) {
        p2 p2Var = p2.f49764c;
        p2Var.getClass();
        p2Var.a(obj2.getClass()).mergeFrom(obj2, obj3);
    }

    public final w0 a() {
        w0 w0VarB = b();
        if (w0VarB.isInitialized()) {
            return w0VarB;
        }
        throw new UninitializedMessageException();
    }

    public final w0 b() {
        if (!this.f49761b.isMutable()) {
            return this.f49761b;
        }
        this.f49761b.makeImmutable();
        return this.f49761b;
    }

    public final void c() {
        if (this.f49761b.isMutable()) {
            return;
        }
        w0 w0VarNewMutableInstance = this.f49760a.newMutableInstance();
        g(w0VarNewMutableInstance, this.f49761b);
        this.f49761b = w0VarNewMutableInstance;
    }

    public final Object clone() {
        p0 p0VarNewBuilderForType = this.f49760a.newBuilderForType();
        p0VarNewBuilderForType.f49761b = b();
        return p0VarNewBuilderForType;
    }

    public final void e(t tVar, d0 d0Var) {
        c();
        try {
            p2 p2Var = p2.f49764c;
            w0 w0Var = this.f49761b;
            p2Var.getClass();
            t2 t2VarA = p2Var.a(w0Var.getClass());
            w0 w0Var2 = this.f49761b;
            v vVar = tVar.f49790c;
            if (vVar == null) {
                vVar = new v(tVar);
            }
            t2VarA.e(w0Var2, vVar, d0Var);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof IOException)) {
                throw e;
            }
            throw ((IOException) e.getCause());
        }
    }

    public final void f(w0 w0Var) {
        if (this.f49760a.equals(w0Var)) {
            return;
        }
        c();
        g(this.f49761b, w0Var);
    }

    @Override // com.google.protobuf.e2
    public final boolean isInitialized() {
        return w0.isInitialized(this.f49761b, false);
    }
}
