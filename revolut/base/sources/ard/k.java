package ard;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8660c;
    public final boolean d;
    public final Boolean e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f8661g;

    public k(List items, boolean z, int i, boolean z3, Boolean bool, CompositeClause compositeClause, Clause clause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f8658a = items;
        this.f8659b = z;
        this.f8660c = i;
        this.d = z3;
        this.e = bool;
        this.f = compositeClause;
        this.f8661g = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f8658a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f8658a, kVar.f8658a) && this.f8659b == kVar.f8659b && this.f8660c == kVar.f8660c && this.d == kVar.d && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f8661g, kVar.f8661g);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.b(this.f8660c, j6.a.c(this.f8658a.hashCode() * 31, 31, this.f8659b), 31), 31, this.d);
        Boolean bool = this.e;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Clause clause = this.f;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f8661g;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
