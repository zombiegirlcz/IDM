package yhm;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes13.dex */
public final class v implements Collection, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f314207a;

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
        if (!(obj2 instanceof u)) {
            return false;
        }
        return kotlin.collections.d.G(this.f314207a, ((u) obj2).f314206a);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj2 : collection) {
            if (obj2 instanceof u) {
                if (kotlin.collections.d.G(this.f314207a, ((u) obj2).f314206a)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj2) {
        if (obj2 instanceof v) {
            return Intrinsics.f(this.f314207a, ((v) obj2).f314207a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f314207a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f314207a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new olm.h(this.f314207a);
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
        return this.f314207a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return u0.j(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f314207a) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return u0.k(this, array);
    }
}
