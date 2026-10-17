package jt7;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f178420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f178421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f178422c;
    public final List d;

    public g(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, aw0.i iVar, aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f178420a = textLocalisedClause;
        this.f178421b = textLocalisedClause2;
        this.f178422c = iVar;
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
        return Intrinsics.f(this.f178420a, gVar.f178420a) && Intrinsics.f(this.f178421b, gVar.f178421b) && Intrinsics.f(this.f178422c, gVar.f178422c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f178420a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f178421b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        aw0.i iVar = this.f178422c;
        return this.d.hashCode() + ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
