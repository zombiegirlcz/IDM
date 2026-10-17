package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class c3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49691a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f49692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f49693c;
    public final /* synthetic */ v2 d;

    public c3(v2 v2Var) {
        this.d = v2Var;
    }

    public final Iterator a() {
        if (this.f49693c == null) {
            this.f49693c = this.d.f49811c.entrySet().iterator();
        }
        return this.f49693c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f49691a + 1;
        v2 v2Var = this.d;
        return i < v2Var.f49810b.size() || (!v2Var.f49811c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f49692b = true;
        int i = this.f49691a + 1;
        this.f49691a = i;
        v2 v2Var = this.d;
        return i < v2Var.f49810b.size() ? (Map.Entry) v2Var.f49810b.get(this.f49691a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f49692b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f49692b = false;
        int i = v2.f49808h;
        v2 v2Var = this.d;
        v2Var.b();
        if (this.f49691a >= v2Var.f49810b.size()) {
            a().remove();
            return;
        }
        int i2 = this.f49691a;
        this.f49691a = i2 - 1;
        v2Var.g(i2);
    }
}
