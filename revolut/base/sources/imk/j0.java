package imk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.j2;
import mx0.k2;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f162520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k2 f162521c;

    public j0(List items, y yVar, j2 j2Var) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f162519a = items;
        this.f162520b = yVar;
        this.f162521c = j2Var;
    }

    @Override // cli.p
    public final List c() {
        return this.f162519a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f162519a, j0Var.f162519a) && Intrinsics.f(this.f162520b, j0Var.f162520b) && Intrinsics.f(this.f162521c, j0Var.f162521c);
    }

    public final int hashCode() {
        int iHashCode = this.f162519a.hashCode() * 31;
        y yVar = this.f162520b;
        int iHashCode2 = (iHashCode + (yVar == null ? 0 : yVar.hashCode())) * 31;
        k2 k2Var = this.f162521c;
        return iHashCode2 + (k2Var != null ? k2Var.hashCode() : 0);
    }
}
