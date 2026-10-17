package xy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309591b;

    public p(String id10, String title) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f309590a = id10;
        this.f309591b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f309590a, pVar.f309590a) && Intrinsics.f(this.f309591b, pVar.f309591b);
    }

    public final int hashCode() {
        return this.f309591b.hashCode() + (this.f309590a.hashCode() * 31);
    }
}
