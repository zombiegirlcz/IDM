package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes17.dex */
public final class i0 extends b implements j0, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f49369b;

    static {
        new i0(10).f49346a = false;
    }

    public i0(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public final void U4(j jVar) {
        a();
        this.f49369b.add(jVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        a();
        this.f49369b.add(i, (String) obj2);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f49369b.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f49369b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f49369b;
        Object obj2 = arrayList.get(i);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof j)) {
            byte[] bArr = (byte[]) obj2;
            String str2 = new String(bArr, g0.f49364a);
            if (v1.f49419a.r(bArr, 0, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        j jVar = (j) obj2;
        Charset charset = g0.f49364a;
        if (jVar.size() == 0) {
            str = "";
        } else {
            i iVar = (i) jVar;
            str = new String(iVar.d, iVar.f(), iVar.size(), charset);
        }
        i iVar2 = (i) jVar;
        int iF = iVar2.f();
        if (v1.f49419a.r(iVar2.d, iF, iVar2.size() + iF)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public final Object getRaw(int i) {
        return this.f49369b.get(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f49369b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public final j0 getUnmodifiableView() {
        return this.f49346a ? new n1(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final f0 mutableCopyWithCapacity(int i) {
        ArrayList arrayList = this.f49369b;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new i0(arrayList2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.f49369b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof j)) {
            return new String((byte[]) objRemove, g0.f49364a);
        }
        j jVar = (j) objRemove;
        Charset charset = g0.f49364a;
        if (jVar.size() == 0) {
            return "";
        }
        i iVar = (i) jVar;
        return new String(iVar.d, iVar.f(), iVar.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        a();
        Object obj3 = this.f49369b.set(i, (String) obj2);
        if (obj3 instanceof String) {
            return (String) obj3;
        }
        if (!(obj3 instanceof j)) {
            return new String((byte[]) obj3, g0.f49364a);
        }
        j jVar = (j) obj3;
        Charset charset = g0.f49364a;
        if (jVar.size() == 0) {
            return "";
        }
        i iVar = (i) jVar;
        return new String(iVar.d, iVar.f(), iVar.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49369b.size();
    }

    public i0(ArrayList arrayList) {
        this.f49369b = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof j0) {
            collection = ((j0) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f49369b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
