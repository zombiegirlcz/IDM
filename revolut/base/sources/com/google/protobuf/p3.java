package com.google.protobuf;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList;

/* JADX INFO: loaded from: classes17.dex */
public final class p3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49767a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f49768b;

    public /* synthetic */ p3() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f49767a) {
        }
        return this.f49768b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f49767a) {
        }
        return (String) this.f49768b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f49767a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public p3(UnmodifiableLazyStringList unmodifiableLazyStringList) {
        this.f49768b = unmodifiableLazyStringList.f187514a.iterator();
    }
}
