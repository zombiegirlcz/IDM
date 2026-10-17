package lyf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200825c;

    public f(String id10, String name, String image) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f200823a = id10;
        this.f200824b = name;
        this.f200825c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f200823a, fVar.f200823a) && Intrinsics.f(this.f200824b, fVar.f200824b) && Intrinsics.f(this.f200825c, fVar.f200825c);
    }

    public final int hashCode() {
        return this.f200825c.hashCode() + p.a.c(this.f200823a.hashCode() * 31, 31, this.f200824b);
    }
}
