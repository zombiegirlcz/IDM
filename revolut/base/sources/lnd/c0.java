package lnd;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f197160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f197161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f197162c;
    public final boolean d;
    public final boolean e;

    public c0(Clause fullLabel, Clause clause, int i, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(fullLabel, "fullLabel");
        this.f197160a = fullLabel;
        this.f197161b = clause;
        this.f197162c = i;
        this.d = z;
        this.e = z3;
    }

    public static c0 a(c0 c0Var, int i) {
        Clause fullLabel = c0Var.f197160a;
        int i2 = c0Var.f197162c;
        boolean z = (i & 8) != 0 ? c0Var.d : false;
        boolean z3 = (i & 16) != 0 ? c0Var.e : false;
        Intrinsics.checkNotNullParameter(fullLabel, "fullLabel");
        return new c0(fullLabel, null, i2, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f197160a, c0Var.f197160a) && Intrinsics.f(this.f197161b, c0Var.f197161b) && this.f197162c == c0Var.f197162c && this.d == c0Var.d && this.e == c0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.f197160a.hashCode() * 31;
        Clause clause = this.f197161b;
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.b(this.f197162c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31, this.d);
    }

    public /* synthetic */ c0(Clause clause, Clause clause2, int i, boolean z, boolean z3, int i2) {
        this(clause, clause2, i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z3);
    }
}
