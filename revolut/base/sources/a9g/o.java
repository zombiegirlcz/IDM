package a9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2548c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2549g;

    public o(String id10, int i, String image, String startDate, String endDate, String name, String discount) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(discount, "discount");
        this.f2546a = id10;
        this.f2547b = image;
        this.f2548c = startDate;
        this.d = endDate;
        this.e = name;
        this.f = discount;
        this.f2549g = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f2546a, oVar.f2546a) && Intrinsics.f(this.f2547b, oVar.f2547b) && Intrinsics.f(this.f2548c, oVar.f2548c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && this.f2549g == oVar.f2549g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2549g) + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f2546a.hashCode() * 31, 31, this.f2547b), 31, this.f2548c), 31, this.d), 31, this.e), 31, this.f);
    }
}
