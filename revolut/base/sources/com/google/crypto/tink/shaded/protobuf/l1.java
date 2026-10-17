package com.google.crypto.tink.shaded.protobuf;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes17.dex */
public final class l1 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ListIterator f49384a;

    @Override // java.util.ListIterator
    public final void add(Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f49384a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f49384a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f49384a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f49384a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f49384a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f49384a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj2) {
        throw new UnsupportedOperationException();
    }
}
