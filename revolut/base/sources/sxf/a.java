package sxf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f266477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f266478c;
    public final String d;
    public final String e;

    public a(String id10, String tripId, String name, String type, String product) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(tripId, "tripId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f266476a = id10;
        this.f266477b = tripId;
        this.f266478c = name;
        this.d = type;
        this.e = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f266476a, aVar.f266476a) && Intrinsics.f(this.f266477b, aVar.f266477b) && Intrinsics.f(this.f266478c, aVar.f266478c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f266476a.hashCode() * 31, 31, this.f266477b), 31, this.f266478c), 31, this.d);
    }
}
