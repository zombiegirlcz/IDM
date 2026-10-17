package qt7;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f249008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f249009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f249010c;
    public final ArrayList d;

    public g(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f249008a = title;
        this.f249009b = textLocalisedClause;
        this.f249010c = textLocalisedClause2;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f249008a.equals(gVar.f249008a) && Intrinsics.f(this.f249009b, gVar.f249009b) && Intrinsics.f(this.f249010c, gVar.f249010c) && this.d.equals(gVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f249008a.hashCode() * 31;
        Clause clause = this.f249009b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f249010c;
        return this.d.hashCode() + ((iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
