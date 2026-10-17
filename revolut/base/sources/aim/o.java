package aim;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class o extends zhm.j implements Set, Serializable {

    @NotNull
    private static final n Companion = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f5337b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5338a;

    static {
        f.INSTANCE.getClass();
        f5337b = new o(f.f5319n);
    }

    public o(f backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f5338a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj2) {
        return this.f5338a.a(obj2) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f5338a.c();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f5338a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        return this.f5338a.containsKey(obj2);
    }

    @Override // zhm.j
    public final int getSize() {
        return this.f5338a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5338a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f map = this.f5338a;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new j(map);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        f fVar = this.f5338a;
        fVar.c();
        int i = fVar.i(obj2);
        if (i < 0) {
            return false;
        }
        fVar.n(i);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f5338a.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f5338a.c();
        return super.retainAll(elements);
    }

    public o() {
        this(new f());
    }
}
