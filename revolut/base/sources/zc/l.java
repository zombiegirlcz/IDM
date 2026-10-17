package zc;

import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public final class l extends j {
    public static final Object[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f320989g;
    public final transient Object[] d;
    public final transient Object[] e;

    static {
        Object[] objArr = new Object[0];
        f = objArr;
        f320989g = new l(objArr, objArr);
    }

    public l(Object[] objArr, Object[] objArr2) {
        this.d = objArr;
        this.e = objArr2;
    }

    @Override // zc.f
    public final int a(Object[] objArr) {
        System.arraycopy(this.d, 0, objArr, 0, 0);
        return 0;
    }

    @Override // zc.f
    public final int b() {
        return 0;
    }

    @Override // zc.f
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        int length = this.e.length;
        return false;
    }

    @Override // zc.f
    public final Object[] d() {
        return this.d;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        k kVar = this.f320987b;
        if (kVar == null) {
            g gVar = i.f320985b;
            kVar = k.d;
            this.f320987b = kVar;
        }
        return kVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
