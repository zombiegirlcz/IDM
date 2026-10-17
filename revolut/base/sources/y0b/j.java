package y0b;

import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f310183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f310184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0b.e f310185c;
    public final List d;
    public final List e;
    public final List f;

    public j(Clause chartTitle, Clause clause, j0b.e formState, List orderFormItems, List bottomItems, List items) {
        Intrinsics.checkNotNullParameter(chartTitle, "chartTitle");
        Intrinsics.checkNotNullParameter(formState, "formState");
        Intrinsics.checkNotNullParameter(orderFormItems, "orderFormItems");
        Intrinsics.checkNotNullParameter(bottomItems, "bottomItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f310183a = chartTitle;
        this.f310184b = clause;
        this.f310185c = formState;
        this.d = orderFormItems;
        this.e = bottomItems;
        this.f = items;
    }

    @Override // cli.o
    public final q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        j jVar = oldState instanceof j ? (j) oldState : null;
        if (jVar == null) {
            return null;
        }
        return new i(!Intrinsics.f(jVar.f310183a, this.f310183a), !Intrinsics.f(jVar.f310184b, this.f310184b), jVar.f310185c != this.f310185c, !Intrinsics.f(jVar.d, this.d), !Intrinsics.f(jVar.e, this.e));
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f310183a, jVar.f310183a) && Intrinsics.f(this.f310184b, jVar.f310184b) && this.f310185c == jVar.f310185c && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f310183a.hashCode() * 31;
        Clause clause = this.f310184b;
        return this.f.hashCode() + p.a.d(p.a.d((this.f310185c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
    }
}
