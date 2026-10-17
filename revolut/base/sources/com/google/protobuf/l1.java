package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes17.dex */
public final class l1 extends c implements m1, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f49745b;

    static {
        new l1();
    }

    public l1(ArrayList arrayList) {
        super(true);
        this.f49745b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        a();
        this.f49745b.add(i, (String) obj2);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f49745b.size(), collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f49745b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f49745b;
        Object obj2 = list.get(i);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof p) {
            p pVar = (p) obj2;
            String strM = pVar.m();
            if (pVar.f()) {
                list.set(i, strM);
            }
            return strM;
        }
        byte[] bArr = (byte[]) obj2;
        String str = new String(bArr, j1.f49738a);
        if (z3.f49840a.f(bArr, 0, bArr.length)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // com.google.protobuf.m1
    public final Object getRaw(int i) {
        return this.f49745b.get(i);
    }

    @Override // com.google.protobuf.m1
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f49745b);
    }

    @Override // com.google.protobuf.m1
    public final m1 getUnmodifiableView() {
        return this.f49688a ? new q3(this) : this;
    }

    @Override // com.google.protobuf.i1
    public final i1 mutableCopyWithCapacity(int i) {
        List list = this.f49745b;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new l1(arrayList);
    }

    @Override // com.google.protobuf.m1
    public final void p1(p pVar) {
        a();
        this.f49745b.add(pVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.f49745b.remove(i);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof p ? ((p) objRemove).m() : new String((byte[]) objRemove, j1.f49738a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        a();
        Object obj3 = this.f49745b.set(i, (String) obj2);
        return obj3 instanceof String ? (String) obj3 : obj3 instanceof p ? ((p) obj3).m() : new String((byte[]) obj3, j1.f49738a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49745b.size();
    }

    public l1() {
        super(false);
        this.f49745b = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof m1) {
            collection = ((m1) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f49745b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public l1(int i) {
        this(new ArrayList(i));
    }
}
