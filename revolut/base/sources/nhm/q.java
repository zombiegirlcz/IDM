package nhm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f215610a = new q();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException("EmptyIterator.next()");
    }

    public final String toString() {
        return "EmptyIterator()";
    }
}
