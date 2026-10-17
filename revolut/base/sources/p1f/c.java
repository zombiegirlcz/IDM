package p1f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f231914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f231915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f231916c;
    public final String d;

    public c(String id10, String name, String logoUrl, String product) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f231914a = id10;
        this.f231915b = name;
        this.f231916c = logoUrl;
        this.d = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f231914a, cVar.f231914a) && Intrinsics.f(this.f231915b, cVar.f231915b) && Intrinsics.f(this.f231916c, cVar.f231916c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f231914a.hashCode() * 31, 31, this.f231915b), 31, this.f231916c);
    }
}
