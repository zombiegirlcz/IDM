package fo1;

import aw0.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f136771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f136772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f136773c;
    public final boolean d;
    public final Clause e;

    public u(aim.e items, j8 navBarModel, boolean z, boolean z3, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f136771a = items;
        this.f136772b = navBarModel;
        this.f136773c = z;
        this.d = z3;
        this.e = compositeClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f136771a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f136771a, uVar.f136771a) && Intrinsics.f(this.f136772b, uVar.f136772b) && this.f136773c == uVar.f136773c && this.d == uVar.d && Intrinsics.f(this.e, uVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f136772b.hashCode() + (this.f136771a.hashCode() * 31)) * 31, 31, this.f136773c), 31, this.d);
        Clause clause = this.e;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
