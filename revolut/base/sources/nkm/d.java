package nkm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216832a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f216833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f216834c;

    public d(m mVar) {
        this.f216833b = mVar.f216857b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it8;
        switch (this.f216832a) {
            case 0:
                break;
            case 1:
                return this.f216833b.hasNext();
            default:
                return this.f216834c > 0 && this.f216833b.hasNext();
        }
        while (true) {
            int i = this.f216834c;
            it8 = this.f216833b;
            if (i > 0 && it8.hasNext()) {
                it8.next();
                this.f216834c--;
            }
        }
        return it8.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it8;
        switch (this.f216832a) {
            case 0:
                break;
            case 1:
                int i = this.f216834c;
                this.f216834c = i + 1;
                if (i >= 0) {
                    return new IndexedValue(i, this.f216833b.next());
                }
                zhm.v.s();
                throw null;
            default:
                int i2 = this.f216834c;
                if (i2 == 0) {
                    throw new NoSuchElementException();
                }
                this.f216834c = i2 - 1;
                return this.f216833b.next();
        }
        while (true) {
            int i3 = this.f216834c;
            it8 = this.f216833b;
            if (i3 > 0 && it8.hasNext()) {
                it8.next();
                this.f216834c--;
            }
        }
        return it8.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f216832a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(b0 b0Var) {
        this.f216834c = b0Var.f216826c;
        this.f216833b = b0Var.f216825b.iterator();
    }

    public d(b0 b0Var, byte b4) {
        this.f216833b = b0Var.f216825b.iterator();
        this.f216834c = b0Var.f216826c;
    }
}
