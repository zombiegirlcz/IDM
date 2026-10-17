package pdh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235237b;

    public f(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f235236a = title;
        this.f235237b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f235236a, fVar.f235236a) && Intrinsics.f(this.f235237b, fVar.f235237b);
    }

    public final int hashCode() {
        return this.f235237b.hashCode() + (this.f235236a.hashCode() * 31);
    }
}
