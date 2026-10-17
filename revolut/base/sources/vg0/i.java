package vg0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f288695b;

    public i(String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f288694a = id10;
        this.f288695b = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f288694a, iVar.f288694a) && Intrinsics.f(this.f288695b, iVar.f288695b);
    }

    public final int hashCode() {
        return this.f288695b.hashCode() + (this.f288694a.hashCode() * 31);
    }
}
