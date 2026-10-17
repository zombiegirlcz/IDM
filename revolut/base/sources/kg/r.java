package kg;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public final class r extends u implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f183889a;

    public r() {
        this.f183889a = new ArrayList();
    }

    @Override // kg.u
    public final byte a() {
        return h().a();
    }

    @Override // kg.u
    public final long e() {
        return h().e();
    }

    public final boolean equals(Object obj2) {
        if (obj2 != this) {
            return (obj2 instanceof r) && ((r) obj2).f183889a.equals(this.f183889a);
        }
        return true;
    }

    @Override // kg.u
    public final String f() {
        return h().f();
    }

    public final void g(u uVar) {
        this.f183889a.add(uVar);
    }

    public final u h() {
        ArrayList arrayList = this.f183889a;
        int size = arrayList.size();
        if (size == 1) {
            return (u) arrayList.get(0);
        }
        throw new IllegalStateException(a0.d.n("Array must have size 1, but has size ", size));
    }

    public final int hashCode() {
        return this.f183889a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f183889a.iterator();
    }

    public r(int i) {
        this.f183889a = new ArrayList(i);
    }
}
