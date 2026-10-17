package aw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10738c;

    public f(String id10, int i, String title) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f10736a = id10;
        this.f10737b = i;
        this.f10738c = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f10736a, fVar.f10736a) && this.f10737b == fVar.f10737b && Intrinsics.f(this.f10738c, fVar.f10738c);
    }

    public final int hashCode() {
        return this.f10738c.hashCode() + j6.a.b(this.f10737b, this.f10736a.hashCode() * 31, 31);
    }
}
