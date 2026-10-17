package mv3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f209122c;
    public final g d;

    public f(String id10, boolean z, boolean z3, g gVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f209120a = id10;
        this.f209121b = z;
        this.f209122c = z3;
        this.d = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f209120a, fVar.f209120a) && this.f209121b == fVar.f209121b && this.f209122c == fVar.f209122c && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f209120a.hashCode() * 31, 31, this.f209121b), 31, this.f209122c);
        g gVar = this.d;
        return iC + (gVar == null ? 0 : Long.hashCode(gVar.f209123a));
    }
}
