package egi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f125664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125666c;
    public final String d;
    public final int e;

    public b(a id10, String name, String description, String image, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f125664a = id10;
        this.f125665b = name;
        this.f125666c = description;
        this.d = image;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f125664a == bVar.f125664a && Intrinsics.f(this.f125665b, bVar.f125665b) && Intrinsics.f(this.f125666c, bVar.f125666c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + p.a.c(p.a.c(p.a.c(this.f125664a.hashCode() * 31, 31, this.f125665b), 31, this.f125666c), 31, this.d);
    }
}
