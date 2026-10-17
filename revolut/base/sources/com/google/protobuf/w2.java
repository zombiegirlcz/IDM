package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class w2 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f49819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v2 f49820c;

    public w2(v2 v2Var) {
        this.f49820c = v2Var;
        this.f49818a = v2Var.f49810b.size();
    }

    public final Iterator a() {
        if (this.f49819b == null) {
            this.f49819b = this.f49820c.f.entrySet().iterator();
        }
        return this.f49819b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f49818a;
        return (i > 0 && i <= this.f49820c.f49810b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.f49820c.f49810b;
        int i = this.f49818a - 1;
        this.f49818a = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
