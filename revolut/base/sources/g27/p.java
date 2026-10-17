package g27;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f139922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f139923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f139924c;
    public final Clause d;
    public final List e;

    public p(List items, TextClause textClause, Clause clause, TimeClause timeClause, List actions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f139922a = items;
        this.f139923b = textClause;
        this.f139924c = clause;
        this.d = timeClause;
        this.e = actions;
    }

    @Override // cli.p
    public final List c() {
        return this.f139922a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f139922a, pVar.f139922a) && Intrinsics.f(this.f139923b, pVar.f139923b) && Intrinsics.f(this.f139924c, pVar.f139924c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f139922a.hashCode() * 31;
        Clause clause = this.f139923b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f139924c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (clause3 != null ? clause3.hashCode() : 0)) * 31);
    }

    public p(List list) {
        this(list, null, null, null, f0.f322471a);
    }
}
