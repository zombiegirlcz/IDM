package com.google.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class u0 extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f49797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f49798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d2 f49799c;
    public final t0 d;

    public u0(d2 d2Var, Object obj2, d2 d2Var2, t0 t0Var) {
        if (d2Var == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (t0Var.f49793c == k4.MESSAGE && d2Var2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f49797a = d2Var;
        this.f49798b = obj2;
        this.f49799c = d2Var2;
        this.d = t0Var;
    }

    public final Object a(Object obj2) {
        t0 t0Var = this.d;
        if (!t0Var.d) {
            return g(obj2);
        }
        if (t0Var.f49793c.a() != l4.ENUM) {
            return obj2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = ((List) obj2).iterator();
        while (it8.hasNext()) {
            arrayList.add(g(it8.next()));
        }
        return arrayList;
    }

    public final d2 b() {
        return this.f49797a;
    }

    public final k4 c() {
        return this.d.f49793c;
    }

    public final d2 d() {
        return this.f49799c;
    }

    public final int e() {
        return this.d.f49792b;
    }

    public final boolean f() {
        return this.d.d;
    }

    public final Object g(Object obj2) {
        t0 t0Var = this.d;
        return t0Var.f49793c.a() == l4.ENUM ? t0Var.f49791a.findValueByNumber(((Integer) obj2).intValue()) : obj2;
    }

    public final Object h(Object obj2) {
        return this.d.f49793c.a() == l4.ENUM ? Integer.valueOf(((a1) obj2).getNumber()) : obj2;
    }
}
