package xm4;

import dx4.g2;
import dx4.z2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f307082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f307083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f307084c;
    public final g2 d;
    public final z2 e;

    public e(dj0.d statementBalance, f fVar, List discounts, g2 g2Var, z2 z2Var) {
        Intrinsics.checkNotNullParameter(statementBalance, "statementBalance");
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        this.f307082a = statementBalance;
        this.f307083b = fVar;
        this.f307084c = discounts;
        this.d = g2Var;
        this.e = z2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f307082a, eVar.f307082a) && Intrinsics.f(this.f307083b, eVar.f307083b) && Intrinsics.f(this.f307084c, eVar.f307084c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f307082a.hashCode() * 31;
        f fVar = this.f307083b;
        int iD = p.a.d((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f307084c);
        g2 g2Var = this.d;
        int iHashCode2 = (iD + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        z2 z2Var = this.e;
        return iHashCode2 + (z2Var != null ? z2Var.hashCode() : 0);
    }
}
