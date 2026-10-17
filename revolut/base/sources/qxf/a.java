package qxf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f250086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f250087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f250088c;

    public a(String product, String type, String uri2) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        this.f250086a = product;
        this.f250087b = type;
        this.f250088c = uri2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f250086a, aVar.f250086a) && Intrinsics.f(this.f250087b, aVar.f250087b) && Intrinsics.f(this.f250088c, aVar.f250088c);
    }

    public final int hashCode() {
        return this.f250088c.hashCode() + p.a.c(this.f250086a.hashCode() * 31, 31, this.f250087b);
    }
}
