package mkm;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Iterator, pim.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.d f206509a;

    public e(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f206509a = u0.h(array);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f206509a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f206509a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
