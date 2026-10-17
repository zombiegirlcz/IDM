package aw0;

import aw0.i6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f6 extends i6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10310c;
    public final Clause d;
    public final g6 e;
    public final Object f;

    public f6(Clause clause, Clause clause2, Clause dateClause, TextLocalisedClause textLocalisedClause, g6 destinationIconGravity, Clause travelersClause) {
        Intrinsics.checkNotNullParameter(dateClause, "dateClause");
        Intrinsics.checkNotNullParameter(destinationIconGravity, "destinationIconGravity");
        Intrinsics.checkNotNullParameter(travelersClause, "travelersClause");
        this.f10308a = clause;
        this.f10309b = clause2;
        this.f10310c = dateClause;
        this.d = textLocalisedClause;
        this.e = destinationIconGravity;
        this.f = travelersClause;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // aw0.i6.a
    public final Clause a() {
        return this.f10310c;
    }

    @Override // aw0.i6.a
    public final Clause b() {
        return this.d;
    }

    @Override // aw0.i6.a
    public final Clause c() {
        return this.f10309b;
    }

    @Override // aw0.i6.a
    public final g6 d() {
        return this.e;
    }

    @Override // aw0.i6.a
    public final Clause e() {
        return this.f10308a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj2;
        return Intrinsics.f(this.f10308a, f6Var.f10308a) && Intrinsics.f(this.f10309b, f6Var.f10309b) && this.f10310c.equals(f6Var.f10310c) && Intrinsics.f(this.d, f6Var.d) && this.e == f6Var.e && this.f.equals(f6Var.f);
    }

    public final int hashCode() {
        Clause clause = this.f10308a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f10309b;
        int iB = p.a.b((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f10310c);
        Clause clause3 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iB + (clause3 != null ? clause3.hashCode() : 0)) * 31)) * 31);
    }
}
