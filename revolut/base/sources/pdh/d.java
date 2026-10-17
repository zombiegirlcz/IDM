package pdh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f235234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f235235c;

    public d(String title, e value, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f235233a = title;
        this.f235234b = value;
        this.f235235c = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f235233a, dVar.f235233a) && this.f235234b == dVar.f235234b && Intrinsics.f(this.f235235c, dVar.f235235c);
    }

    public final int hashCode() {
        return this.f235235c.hashCode() + ((this.f235234b.hashCode() + (this.f235233a.hashCode() * 31)) * 31);
    }
}
