package vg0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f288699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f288700c;

    public j(String id10, String displayName, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f288698a = id10;
        this.f288699b = displayName;
        this.f288700c = name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f288698a, jVar.f288698a) && Intrinsics.f(this.f288699b, jVar.f288699b) && Intrinsics.f(this.f288700c, jVar.f288700c);
    }

    public final int hashCode() {
        return this.f288700c.hashCode() + p.a.c(this.f288698a.hashCode() * 31, 31, this.f288699b);
    }
}
