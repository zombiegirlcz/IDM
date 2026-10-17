package a9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2575c;
    public final String d;
    public final int e;

    public r1(String id10, String name, String description, String image, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f2573a = id10;
        this.f2574b = name;
        this.f2575c = description;
        this.d = image;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f2573a, r1Var.f2573a) && Intrinsics.f(this.f2574b, r1Var.f2574b) && Intrinsics.f(this.f2575c, r1Var.f2575c) && Intrinsics.f(this.d, r1Var.d) && this.e == r1Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + p.a.c(p.a.c(p.a.c(this.f2573a.hashCode() * 31, 31, this.f2574b), 31, this.f2575c), 31, this.d);
    }
}
