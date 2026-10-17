package nn3;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f217451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f217452c;
    public boolean d;
    public final List e;

    public g(List items, Clause clause, TextLocalisedClause textLocalisedClause, boolean z, List labels) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(labels, "labels");
        this.f217450a = items;
        this.f217451b = clause;
        this.f217452c = textLocalisedClause;
        this.d = z;
        this.e = labels;
    }

    @Override // cli.p
    public final List c() {
        return this.f217450a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f217450a, gVar.f217450a) && Intrinsics.f(this.f217451b, gVar.f217451b) && Intrinsics.f(this.f217452c, gVar.f217452c) && this.d == gVar.d && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f217450a.hashCode() * 31;
        Clause clause = this.f217451b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f217452c;
        return this.e.hashCode() + j6.a.c((iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.d);
    }
}
