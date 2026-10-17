package h02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148177b;

    public a(String id10, String brand) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.f148176a = id10;
        this.f148177b = brand;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f148176a, aVar.f148176a) && Intrinsics.f(this.f148177b, aVar.f148177b);
    }

    public final int hashCode() {
        return this.f148177b.hashCode() + (this.f148176a.hashCode() * 31);
    }
}
