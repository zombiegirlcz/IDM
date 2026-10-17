package zhm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f322461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f322462b;

    public abstract void a();

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.f322461a;
        if (i == 0) {
            this.f322461a = 3;
            a();
            return this.f322461a == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.f322461a;
        if (i == 1) {
            this.f322461a = 0;
            return this.f322462b;
        }
        if (i != 2) {
            this.f322461a = 3;
            a();
            if (this.f322461a == 1) {
                this.f322461a = 0;
                return this.f322462b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
