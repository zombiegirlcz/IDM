package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes17.dex */
public final class q3 extends AbstractList implements m1, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f49777a;

    public q3(l1 l1Var) {
        this.f49777a = l1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f49777a.get(i);
    }

    @Override // com.google.protobuf.m1
    public final Object getRaw(int i) {
        return this.f49777a.f49745b.get(i);
    }

    @Override // com.google.protobuf.m1
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f49777a.f49745b);
    }

    @Override // com.google.protobuf.m1
    public final m1 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        p3 p3Var = new p3();
        p3Var.f49768b = this.f49777a.iterator();
        return p3Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        o3 o3Var = new o3();
        o3Var.f49756b = this.f49777a.listIterator(i);
        return o3Var;
    }

    @Override // com.google.protobuf.m1
    public final void p1(p pVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49777a.f49745b.size();
    }
}
