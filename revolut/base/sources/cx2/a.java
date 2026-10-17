package cx2;

import h93.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f109884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f109885b;

    public a(n contactlessCounter, dj0.d limit) {
        Intrinsics.checkNotNullParameter(contactlessCounter, "contactlessCounter");
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f109884a = contactlessCounter;
        this.f109885b = limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f109884a, aVar.f109884a) && Intrinsics.f(this.f109885b, aVar.f109885b);
    }

    public final int hashCode() {
        return this.f109885b.hashCode() + (this.f109884a.hashCode() * 31);
    }
}
