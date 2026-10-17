package yhm;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes13.dex */
public final class a0 implements Collection, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short[] f314182a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj2) {
        if (!(obj2 instanceof z)) {
            return false;
        }
        short s2 = ((z) obj2).f314211a;
        short[] sArr = this.f314182a;
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (s2 == sArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj2 : collection) {
                if (obj2 instanceof z) {
                    short s2 = ((z) obj2).f314211a;
                    short[] sArr = this.f314182a;
                    Intrinsics.checkNotNullParameter(sArr, "<this>");
                    Intrinsics.checkNotNullParameter(sArr, "<this>");
                    int length = sArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        }
                        if (s2 == sArr[i]) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj2) {
        if (obj2 instanceof a0) {
            return Intrinsics.f(this.f314182a, ((a0) obj2).f314182a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f314182a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f314182a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new olm.h(this.f314182a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f314182a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return u0.j(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f314182a) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return u0.k(this, array);
    }
}
