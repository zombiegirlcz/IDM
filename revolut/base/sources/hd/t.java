package hd;

import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f151368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od.a f151369b;

    public t(Class cls, od.a aVar) {
        this.f151368a = cls;
        this.f151369b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return tVar.f151368a.equals(this.f151368a) && tVar.f151369b.equals(this.f151369b);
    }

    public final int hashCode() {
        return Objects.hash(this.f151368a, this.f151369b);
    }

    public final String toString() {
        return this.f151368a.getSimpleName() + ", object identifier: " + this.f151369b;
    }
}
