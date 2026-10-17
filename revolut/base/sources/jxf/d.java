package jxf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ffi.a f179199c;
    public final c d;

    public d(String id10, String name, ffi.a type, c product) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f179197a = id10;
        this.f179198b = name;
        this.f179199c = type;
        this.d = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f179197a, dVar.f179197a) && Intrinsics.f(this.f179198b, dVar.f179198b) && this.f179199c == dVar.f179199c && this.d == dVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f179199c.hashCode() + p.a.c(this.f179197a.hashCode() * 31, 31, this.f179198b)) * 31);
    }
}
