package k1j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f180282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f180283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f180284c;

    public b(c type, Clause clause, List balances) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(balances, "balances");
        this.f180282a = type;
        this.f180283b = clause;
        this.f180284c = balances;
    }

    public static b a(b bVar, List balances) {
        c type = bVar.f180282a;
        Clause clause = bVar.f180283b;
        bVar.getClass();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(balances, "balances");
        return new b(type, clause, balances);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f180282a == bVar.f180282a && Intrinsics.f(this.f180283b, bVar.f180283b) && Intrinsics.f(this.f180284c, bVar.f180284c);
    }

    public final int hashCode() {
        int iHashCode = this.f180282a.hashCode() * 31;
        Clause clause = this.f180283b;
        return this.f180284c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 961);
    }

    public /* synthetic */ b(c cVar, TextLocalisedClause textLocalisedClause, List list, int i) {
        this(cVar, (i & 2) != 0 ? null : textLocalisedClause, list);
    }
}
