package x6g;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f303095b;

    public b(d price, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f303094a = name;
        this.f303095b = price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f303094a, bVar.f303094a) && Intrinsics.f(this.f303095b, bVar.f303095b);
    }

    public final int hashCode() {
        return this.f303095b.hashCode() + (this.f303094a.hashCode() * 31);
    }
}
