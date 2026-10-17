package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.d implements ListIterator {
    public final /* synthetic */ a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, int i) {
        super(aVar);
        this.d = aVar;
        a.Companion companion = a.INSTANCE;
        int size = aVar.size();
        companion.getClass();
        a.Companion.c(i, size);
        this.f186415b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f186415b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f186415b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f186415b - 1;
        this.f186415b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f186415b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
