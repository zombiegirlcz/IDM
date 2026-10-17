package ip0;

import com.revolut.core.ui_kit.delegates.SwipeableCardCoverHeaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ci0 implements koi.j, qv0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f163740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f163741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f163742c;
    public p31.c d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f163743g;

    public ci0(TextClause smallTitle, TextClause bigTitle, TextClause textClause) {
        Intrinsics.checkNotNullParameter("HEADER_ITEM_ID", "listId");
        Intrinsics.checkNotNullParameter(smallTitle, "smallTitle");
        Intrinsics.checkNotNullParameter(bigTitle, "bigTitle");
        this.f163740a = smallTitle;
        this.f163741b = bigTitle;
        this.f163742c = textClause;
        this.d = null;
        this.e = null;
        this.f = null;
        this.f163743g = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SwipeableCardCoverHeaderDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF51752a() {
        return "HEADER_ITEM_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ci0)) {
            return false;
        }
        ci0 ci0Var = (ci0) obj2;
        return this.f163740a.equals(ci0Var.f163740a) && this.f163741b.equals(ci0Var.f163741b) && Intrinsics.f(this.f163742c, ci0Var.f163742c) && Intrinsics.f(this.d, ci0Var.d) && Intrinsics.f(this.e, ci0Var.e) && Intrinsics.f(this.f, ci0Var.f) && Intrinsics.f(this.f163743g, ci0Var.f163743g);
    }

    public final int hashCode() {
        int iB = v7.b(v7.b(-1670749045, 31, this.f163740a), 31, this.f163741b);
        Clause clause = this.f163742c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        p31.c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.e;
        int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f;
        int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f163743g;
        return iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51761p() {
        return this.d;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51759m() {
        return this.e;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f163743g;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51760n() {
        return this.f;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.d = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.e = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f163743g = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof ci0 ? (ci0) oldItem : null) == null) {
            return null;
        }
        ci0 ci0Var = (ci0) oldItem;
        return new di0(!ci0Var.f163740a.equals(this.f163740a), !ci0Var.f163741b.equals(this.f163741b), !Intrinsics.f(ci0Var.f163742c, this.f163742c));
    }
}
