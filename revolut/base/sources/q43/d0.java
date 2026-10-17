package q43;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d0 extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f242012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f242013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f242014c;
    public final boolean d;
    public final Clause e;

    public d0(Clause clause, TextLocalisedClause textLocalisedClause, List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f242012a = items;
        this.f242013b = clause;
        this.f242014c = z;
        this.d = z3;
        this.e = textLocalisedClause;
    }

    @Override // q43.e0
    public final Clause a() {
        return this.f242013b;
    }

    @Override // jki.n
    public final List c() {
        return this.f242012a;
    }

    @Override // q43.e0
    public final Clause d() {
        return this.e;
    }

    @Override // q43.e0
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f242012a, d0Var.f242012a) && Intrinsics.f(this.f242013b, d0Var.f242013b) && this.f242014c == d0Var.f242014c && this.d == d0Var.d && Intrinsics.f(this.e, d0Var.e);
    }

    @Override // q43.e0
    public final boolean f() {
        return this.f242014c;
    }

    public final int hashCode() {
        int iHashCode = this.f242012a.hashCode() * 31;
        Clause clause = this.f242013b;
        int iC = j6.a.c(j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f242014c), 31, this.d);
        Clause clause2 = this.e;
        return iC + (clause2 != null ? clause2.hashCode() : 0);
    }
}
