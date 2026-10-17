package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes17.dex */
public final class n1 extends AbstractList implements j0, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f49394a;

    public n1(i0 i0Var) {
        this.f49394a = i0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public final void U4(j jVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f49394a.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public final Object getRaw(int i) {
        return this.f49394a.f49369b.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f49394a.f49369b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public final j0 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m1 m1Var = new m1();
        m1Var.f49390a = this.f49394a.iterator();
        return m1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        l1 l1Var = new l1();
        l1Var.f49384a = this.f49394a.listIterator(i);
        return l1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49394a.size();
    }
}
