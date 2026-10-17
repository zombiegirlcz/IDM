package hx4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yy0.j;
import yy0.l;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f156382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f156383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f156384c;
    public final List d;

    public a(TextLocalisedClause title, Clause clause, j jVar, List filters) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f156382a = title;
        this.f156383b = clause;
        this.f156384c = jVar;
        this.d = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f156382a.equals(aVar.f156382a) && Intrinsics.f(this.f156383b, aVar.f156383b) && Intrinsics.f(this.f156384c, aVar.f156384c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f156382a.hashCode() * 31;
        Clause clause = this.f156383b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        l lVar = this.f156384c;
        return this.d.hashCode() + ((iHashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31);
    }
}
