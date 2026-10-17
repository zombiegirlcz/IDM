package aim;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements ListIterator, pim.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5310a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5312c;
    public int d;
    public final zhm.h e;

    public b(e list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.e = list;
        this.f5311b = i;
        this.f5312c = -1;
        this.d = ((AbstractList) list).modCount;
    }

    public void a() {
        if (((AbstractList) ((c) this.e).e).modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj2) {
        switch (this.f5310a) {
            case 0:
                a();
                c cVar = (c) this.e;
                int i = this.f5311b;
                this.f5311b = i + 1;
                cVar.add(i, obj2);
                this.f5312c = -1;
                this.d = ((AbstractList) cVar).modCount;
                break;
            default:
                b();
                e eVar = (e) this.e;
                int i2 = this.f5311b;
                this.f5311b = i2 + 1;
                eVar.add(i2, obj2);
                this.f5312c = -1;
                this.d = ((AbstractList) eVar).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((e) this.e)).modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5310a) {
            case 0:
                if (this.f5311b < ((c) this.e).f5315c) {
                }
                break;
            default:
                if (this.f5311b < ((e) this.e).f5317b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f5310a) {
            case 0:
                if (this.f5311b > 0) {
                }
                break;
            default:
                if (this.f5311b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f5310a) {
            case 0:
                a();
                int i = this.f5311b;
                c cVar = (c) this.e;
                if (i >= cVar.f5315c) {
                    throw new NoSuchElementException();
                }
                this.f5311b = i + 1;
                this.f5312c = i;
                return cVar.f5313a[cVar.f5314b + i];
            default:
                b();
                int i2 = this.f5311b;
                e eVar = (e) this.e;
                if (i2 >= eVar.f5317b) {
                    throw new NoSuchElementException();
                }
                this.f5311b = i2 + 1;
                this.f5312c = i2;
                return eVar.f5316a[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f5310a) {
        }
        return this.f5311b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f5310a) {
            case 0:
                a();
                int i = this.f5311b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f5311b = i2;
                this.f5312c = i2;
                c cVar = (c) this.e;
                return cVar.f5313a[cVar.f5314b + i2];
            default:
                b();
                int i3 = this.f5311b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i3 - 1;
                this.f5311b = i5;
                this.f5312c = i5;
                return ((e) this.e).f5316a[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f5310a) {
            case 0:
                i = this.f5311b;
                break;
            default:
                i = this.f5311b;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f5310a) {
            case 0:
                c cVar = (c) this.e;
                a();
                int i = this.f5312c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.removeAt(i);
                this.f5311b = this.f5312c;
                this.f5312c = -1;
                this.d = ((AbstractList) cVar).modCount;
                return;
            default:
                e eVar = (e) this.e;
                b();
                int i2 = this.f5312c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                eVar.removeAt(i2);
                this.f5311b = this.f5312c;
                this.f5312c = -1;
                this.d = ((AbstractList) eVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj2) {
        switch (this.f5310a) {
            case 0:
                a();
                int i = this.f5312c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.e).set(i, obj2);
                return;
            default:
                b();
                int i2 = this.f5312c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((e) this.e).set(i2, obj2);
                return;
        }
    }

    public b(c list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.e = list;
        this.f5311b = i;
        this.f5312c = -1;
        this.d = ((AbstractList) list).modCount;
    }
}
