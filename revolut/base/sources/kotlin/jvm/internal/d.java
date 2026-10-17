package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes13.dex */
public class d implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186414a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f186415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f186416c;

    public d(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f186416c = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f186414a) {
            case 0:
                return this.f186415b < ((Object[]) this.f186416c).length;
            case 1:
                return this.f186415b < ((kotlin.collections.a) this.f186416c).size();
            default:
                return ((Iterator) this.f186416c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f186414a) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f186416c;
                    int i = this.f186415b;
                    this.f186415b = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f186415b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                kotlin.collections.a aVar = (kotlin.collections.a) this.f186416c;
                int i2 = this.f186415b;
                this.f186415b = i2 + 1;
                return aVar.get(i2);
            default:
                int i3 = this.f186415b;
                this.f186415b = i3 + 1;
                if (i3 >= 0) {
                    return new IndexedValue(i3, ((Iterator) this.f186416c).next());
                }
                zhm.v.s();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f186414a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(Iterator iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f186416c = iterator;
    }

    public d(kotlin.collections.a aVar) {
        this.f186416c = aVar;
    }
}
