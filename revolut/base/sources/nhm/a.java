package nhm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a implements p {
    public abstract Object a();

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            return a();
        }
        throw new NoSuchElementException("next() on empty iterator");
    }

    public final String toString() {
        return v0.a.i(new StringBuilder("Iterator("), isEmpty() ? "" : "?", ")");
    }
}
