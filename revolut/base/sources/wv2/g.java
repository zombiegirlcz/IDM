package wv2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f300275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f300276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f300277c;

    public g() {
        this(7, (TextLocalisedClause) null, (List) null);
    }

    @Override // cli.p
    public final List c() {
        return this.f300275a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f300275a, gVar.f300275a) && Intrinsics.f(this.f300276b, gVar.f300276b) && Intrinsics.f(this.f300277c, gVar.f300277c);
    }

    public final int hashCode() {
        int iHashCode = this.f300275a.hashCode() * 31;
        Clause clause = this.f300276b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f300277c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }

    public g(List items, Clause clause, TextLocalisedQuantityClause textLocalisedQuantityClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f300275a = items;
        this.f300276b = clause;
        this.f300277c = textLocalisedQuantityClause;
    }

    public g(int i, TextLocalisedClause textLocalisedClause, List list) {
        this((i & 1) != 0 ? f0.f322471a : list, (i & 2) != 0 ? null : textLocalisedClause, (TextLocalisedQuantityClause) null);
    }
}
