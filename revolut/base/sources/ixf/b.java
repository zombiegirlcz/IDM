package ixf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169566c;
    public final a d;

    public b(String id10, String name, String image, a type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f169564a = id10;
        this.f169565b = name;
        this.f169566c = image;
        this.d = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f169564a, bVar.f169564a) && Intrinsics.f(this.f169565b, bVar.f169565b) && Intrinsics.f(this.f169566c, bVar.f169566c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f169564a.hashCode() * 31, 31, this.f169565b), 31, this.f169566c);
    }
}
