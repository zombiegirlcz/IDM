package aw0;

import aw0.i6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h6 extends i6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f10342c;
    public final CompositeClause d;
    public final g6 e;

    public h6(TextClause textClause, TextClause textClause2, TimeClause dateClause, CompositeClause compositeClause, g6 destinationIconGravity) {
        Intrinsics.checkNotNullParameter(dateClause, "dateClause");
        Intrinsics.checkNotNullParameter(destinationIconGravity, "destinationIconGravity");
        this.f10340a = textClause;
        this.f10341b = textClause2;
        this.f10342c = dateClause;
        this.d = compositeClause;
        this.e = destinationIconGravity;
    }

    @Override // aw0.i6.a
    public final Clause a() {
        return this.f10342c;
    }

    @Override // aw0.i6.a
    public final Clause b() {
        return this.d;
    }

    @Override // aw0.i6.a
    public final Clause c() {
        return this.f10341b;
    }

    @Override // aw0.i6.a
    public final g6 d() {
        return this.e;
    }

    @Override // aw0.i6.a
    public final Clause e() {
        return this.f10340a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj2;
        return Intrinsics.f(this.f10340a, h6Var.f10340a) && Intrinsics.f(this.f10341b, h6Var.f10341b) && this.f10342c.equals(h6Var.f10342c) && this.d.equals(h6Var.d) && this.e == h6Var.e;
    }

    public final int hashCode() {
        Clause clause = this.f10340a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f10341b;
        return this.e.hashCode() + h30.l.c(this.d, h30.l.d(this.f10342c, (iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31), 31);
    }
}
