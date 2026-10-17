package rgc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f254072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f254073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f254074c;
    public final int d;
    public final String e;

    public d(int i, String id10, String name, String type, List perkIds) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(perkIds, "perkIds");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f254072a = id10;
        this.f254073b = name;
        this.f254074c = perkIds;
        this.d = i;
        this.e = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f254072a, dVar.f254072a) && Intrinsics.f(this.f254073b, dVar.f254073b) && Intrinsics.f(this.f254074c, dVar.f254074c) && this.d == dVar.d && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, p.a.d(p.a.c(this.f254072a.hashCode() * 31, 31, this.f254073b), 31, this.f254074c), 31);
    }
}
