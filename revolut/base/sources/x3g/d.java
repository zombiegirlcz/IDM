package x3g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302743b;

    public d(String light, String dark) {
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        this.f302742a = light;
        this.f302743b = dark;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f302742a, dVar.f302742a) && Intrinsics.f(this.f302743b, dVar.f302743b);
    }

    public final int hashCode() {
        return this.f302743b.hashCode() + (this.f302742a.hashCode() * 31);
    }
}
