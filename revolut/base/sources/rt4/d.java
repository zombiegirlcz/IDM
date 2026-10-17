package rt4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f257167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f257168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f257169c;
    public final xp3.c d;

    public d(boolean z, List limits, boolean z3, xp3.c cVar) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f257167a = z;
        this.f257168b = limits;
        this.f257169c = z3;
        this.d = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f257167a == dVar.f257167a && Intrinsics.f(this.f257168b, dVar.f257168b) && this.f257169c == dVar.f257169c && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.d(Boolean.hashCode(this.f257167a) * 31, 31, this.f257168b), 31, this.f257169c);
        xp3.c cVar = this.d;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }
}
