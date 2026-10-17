package nhm;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements s, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f215601b = new l(e.f215587a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f215602a;

    public l(b bVar) {
        this.f215602a = bVar;
    }

    public final boolean equals(Object obj2) {
        return mra.d.m(this, obj2);
    }

    public final int hashCode() {
        return mra.d.A(this);
    }

    @Override // mhm.e
    public final boolean isEmpty() {
        return this.f215602a.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f215602a.d().map(new com.google.android.material.color.utilities.f(7));
    }

    public final String toString() {
        return V5("HashMap(");
    }

    @Override // mhm.e, java.lang.Iterable
    public final p iterator() {
        return this.f215602a.d().map(new com.google.android.material.color.utilities.f(7));
    }
}
