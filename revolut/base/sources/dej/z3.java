package dej;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3 f113701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4 f113702c;
    public final b4 d;
    public final n3 e;
    public final ArrayList f;

    public z3(String id10, j3 state, a4 mobilePlan, b4 simProfile, n3 n3Var, ArrayList roamingAllowances) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
        Intrinsics.checkNotNullParameter(simProfile, "simProfile");
        Intrinsics.checkNotNullParameter(roamingAllowances, "roamingAllowances");
        this.f113700a = id10;
        this.f113701b = state;
        this.f113702c = mobilePlan;
        this.d = simProfile;
        this.e = n3Var;
        this.f = roamingAllowances;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj2;
        return Intrinsics.f(this.f113700a, z3Var.f113700a) && this.f113701b == z3Var.f113701b && this.f113702c.equals(z3Var.f113702c) && this.d.equals(z3Var.d) && Intrinsics.f(this.e, z3Var.e) && this.f.equals(z3Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f113702c.hashCode() + ((this.f113701b.hashCode() + (this.f113700a.hashCode() * 31)) * 31)) * 31)) * 31;
        n3 n3Var = this.e;
        return this.f.hashCode() + ((iHashCode + (n3Var == null ? 0 : n3Var.hashCode())) * 31);
    }
}
