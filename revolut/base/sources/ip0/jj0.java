package ip0;

import com.revolut.core.ui_kit.delegates.SwipeableCardsHeaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jj0 implements koi.j, qv0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f164850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f164851c;
    public final TextClause d;
    public p31.c e;
    public p31.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p31.c f164852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p31.c f164853h;

    public jj0(String listId, Clause smallTitleStart, Clause clause, TextClause bigTitle) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(smallTitleStart, "smallTitleStart");
        Intrinsics.checkNotNullParameter(bigTitle, "bigTitle");
        this.f164849a = listId;
        this.f164850b = smallTitleStart;
        this.f164851c = clause;
        this.d = bigTitle;
        this.e = null;
        this.f = null;
        this.f164852g = null;
        this.f164853h = null;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SwipeableCardsHeaderDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF54961b() {
        return this.f164849a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jj0)) {
            return false;
        }
        jj0 jj0Var = (jj0) obj2;
        return Intrinsics.f(this.f164849a, jj0Var.f164849a) && this.f164850b.equals(jj0Var.f164850b) && Intrinsics.f(this.f164851c, jj0Var.f164851c) && this.d.equals(jj0Var.d) && Intrinsics.f(this.e, jj0Var.e) && Intrinsics.f(this.f, jj0Var.f) && Intrinsics.f(this.f164852g, jj0Var.f164852g) && Intrinsics.f(this.f164853h, jj0Var.f164853h);
    }

    public final int hashCode() {
        int iB = p.a.b(this.f164849a.hashCode() * 31, 31, this.f164850b);
        Clause clause = this.f164851c;
        int iB2 = v7.b((iB + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        p31.c cVar = this.e;
        int iHashCode = (iB2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        p31.c cVar3 = this.f164852g;
        int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        p31.c cVar4 = this.f164853h;
        return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF51630l() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF51631m() {
        return this.f;
    }

    @Override // qv0.n
    public final void l(p31.c cVar) {
        this.f164852g = cVar;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getO() {
        return this.f164853h;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getF51632n() {
        return this.f164852g;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }

    @Override // qv0.n
    public final void w(p31.c cVar) {
        this.f164853h = cVar;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof jj0)) {
            return null;
        }
        jj0 jj0Var = (jj0) oldItem;
        return new ij0(!jj0Var.f164850b.equals(this.f164850b), !Intrinsics.f(jj0Var.f164851c, this.f164851c), !jj0Var.d.equals(this.d));
    }
}
