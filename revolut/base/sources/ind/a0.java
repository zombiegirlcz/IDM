package ind;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final he3.j f162788b;

    public a0(he3.j jVar, List categoryGroups) {
        Intrinsics.checkNotNullParameter(categoryGroups, "categoryGroups");
        this.f162787a = categoryGroups;
        this.f162788b = jVar;
    }

    public static a0 a(a0 a0Var, List categoryGroups) {
        he3.j jVar = a0Var.f162788b;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(categoryGroups, "categoryGroups");
        return new a0(jVar, categoryGroups);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f162787a, a0Var.f162787a) && Intrinsics.f(this.f162788b, a0Var.f162788b);
    }

    public final int hashCode() {
        int iHashCode = this.f162787a.hashCode() * 31;
        he3.j jVar = this.f162788b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    @Override // ind.b0
    public final boolean isEmpty() {
        return this.f162787a.isEmpty() && this.f162788b == null;
    }
}
