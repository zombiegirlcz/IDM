package qmm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f247851a = new a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException("Iterator contains no elements");
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("Iterator contains no elements");
    }
}
