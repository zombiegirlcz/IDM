package eq2;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f128230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f128231c;

    public g(TextLocalisedClause headerTitle, TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        this.f128229a = items;
        this.f128230b = headerTitle;
        this.f128231c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f128229a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f128229a.equals(gVar.f128229a) && this.f128230b.equals(gVar.f128230b) && Intrinsics.f(this.f128231c, gVar.f128231c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f128229a.hashCode() * 31, 31, this.f128230b);
        Clause clause = this.f128231c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
