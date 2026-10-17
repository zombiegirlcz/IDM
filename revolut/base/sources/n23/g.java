package n23;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f211433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f211434b;

    public g(Clause clause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f211433a = items;
        this.f211434b = clause;
    }

    public static g a(g gVar, List items, Clause clause, int i) {
        if ((i & 1) != 0) {
            items = gVar.f211433a;
        }
        if ((i & 2) != 0) {
            clause = gVar.f211434b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        return new g(clause, items);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f211433a, gVar.f211433a) && Intrinsics.f(this.f211434b, gVar.f211434b);
    }

    public final int hashCode() {
        int iHashCode = this.f211433a.hashCode() * 31;
        Clause clause = this.f211434b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
