package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public final class m1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f49390a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49390a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f49390a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
