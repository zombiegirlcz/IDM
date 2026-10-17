package com.google.protobuf;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class g1 extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f49708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f49709b;

    public g1(List list, f1 f1Var) {
        this.f49708a = list;
        this.f49709b = f1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object obj2 = this.f49708a.get(i);
        ((xf.l) this.f49709b).getClass();
        xf.o0 o0VarA = xf.o0.a(((Integer) obj2).intValue());
        return o0VarA == null ? xf.o0.SESSION_VERBOSITY_NONE : o0VarA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49708a.size();
    }
}
