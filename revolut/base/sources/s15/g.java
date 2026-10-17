package s15;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f259087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f259088c;
    public final TextLocalisedClause d;

    public g(List items, TextLocalisedClause textLocalisedClause, boolean z, TextLocalisedClause screenTitle, int i) {
        textLocalisedClause = (i & 2) != 0 ? null : textLocalisedClause;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        this.f259086a = items;
        this.f259087b = textLocalisedClause;
        this.f259088c = z;
        this.d = screenTitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f259086a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f259086a, gVar.f259086a) && Intrinsics.f(this.f259087b, gVar.f259087b) && this.f259088c == gVar.f259088c && this.d.equals(gVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f259086a.hashCode() * 31;
        Clause clause = this.f259087b;
        return this.d.hashCode() + j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 961, this.f259088c);
    }
}
