package zsd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements amd.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f324892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f324893b;

    public g(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f324892a = title;
        this.f324893b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f324892a.equals(gVar.f324892a) && Intrinsics.f(this.f324893b, gVar.f324893b);
    }

    public final int hashCode() {
        int iHashCode = this.f324892a.hashCode() * 31;
        Clause clause = this.f324893b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
