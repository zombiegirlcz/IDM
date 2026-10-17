package snk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f264641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f264642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f264643c;
    public final List d;
    public final boolean e;

    public l(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List list, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f264641a = textLocalisedClause;
        this.f264642b = list;
        this.f264643c = textLocalisedClause2;
        this.d = items;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f264641a, lVar.f264641a) && Intrinsics.f(this.f264642b, lVar.f264642b) && this.f264643c.equals(lVar.f264643c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e;
    }

    public final int hashCode() {
        Clause clause = this.f264641a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        List list = this.f264642b;
        return Boolean.hashCode(this.e) + p.a.d(t61.a.a((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.f264643c), 31, this.d);
    }
}
