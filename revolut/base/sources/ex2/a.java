package ex2;

import h93.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f130334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f130335b;

    public a(n contactlessCounter, dj0.d limit) {
        Intrinsics.checkNotNullParameter(contactlessCounter, "contactlessCounter");
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f130334a = contactlessCounter;
        this.f130335b = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f130334a, aVar.f130334a) && Intrinsics.f(this.f130335b, aVar.f130335b);
    }

    public final int hashCode() {
        return this.f130335b.hashCode() + (this.f130334a.hashCode() * 31);
    }
}
