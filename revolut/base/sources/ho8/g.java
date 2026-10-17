package ho8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f154246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f154247b;

    public g(TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f154246a = textLocalisedClause;
        this.f154247b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f154247b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f154246a, gVar.f154246a) && Intrinsics.f(this.f154247b, gVar.f154247b);
    }

    public final int hashCode() {
        Clause clause = this.f154246a;
        return this.f154247b.hashCode() + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
