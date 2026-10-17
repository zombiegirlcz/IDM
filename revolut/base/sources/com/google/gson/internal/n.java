package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f49646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f49647b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49648c;
    public final /* synthetic */ LinkedTreeMap d;
    public final /* synthetic */ int e;

    public n(LinkedTreeMap linkedTreeMap, int i) {
        this.e = i;
        this.d = linkedTreeMap;
        this.f49646a = linkedTreeMap.header.d;
        this.f49648c = linkedTreeMap.modCount;
    }

    public final Object a() {
        return b();
    }

    public final q b() {
        q qVar = this.f49646a;
        LinkedTreeMap linkedTreeMap = this.d;
        if (qVar == linkedTreeMap.header) {
            throw new NoSuchElementException();
        }
        if (linkedTreeMap.modCount != this.f49648c) {
            throw new ConcurrentModificationException();
        }
        this.f49646a = qVar.d;
        this.f49647b = qVar;
        return qVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49646a != this.d.header;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        q qVar = this.f49647b;
        if (qVar == null) {
            throw new IllegalStateException();
        }
        LinkedTreeMap linkedTreeMap = this.d;
        linkedTreeMap.removeInternal(qVar, true);
        this.f49647b = null;
        this.f49648c = linkedTreeMap.modCount;
    }
}
