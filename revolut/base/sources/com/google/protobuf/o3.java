package com.google.protobuf;

import java.util.ListIterator;
import kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList;

/* JADX INFO: loaded from: classes17.dex */
public final class o3 implements ListIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49755a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListIterator f49756b;

    public /* synthetic */ o3() {
    }

    @Override // java.util.ListIterator
    public final void add(Object obj2) {
        switch (this.f49755a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f49755a) {
        }
        return this.f49756b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f49755a) {
        }
        return this.f49756b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f49755a) {
        }
        return (String) this.f49756b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f49755a) {
        }
        return this.f49756b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f49755a) {
        }
        return (String) this.f49756b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f49755a) {
        }
        return this.f49756b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f49755a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj2) {
        switch (this.f49755a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public o3(UnmodifiableLazyStringList unmodifiableLazyStringList, int i) {
        this.f49756b = unmodifiableLazyStringList.f187514a.listIterator(i);
    }
}
