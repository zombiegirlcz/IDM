package ab4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f2880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f2881c;
    public final aw0.i d;

    public o(List items, TextLocalisedClause navBarTitle, TextClause textClause, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f2879a = items;
        this.f2880b = navBarTitle;
        this.f2881c = textClause;
        this.d = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f2879a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f2879a, oVar.f2879a) && this.f2880b.equals(oVar.f2880b) && Intrinsics.f(this.f2881c, oVar.f2881c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f2879a.hashCode() * 31, 31, this.f2880b);
        Clause clause = this.f2881c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        aw0.i iVar = this.d;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }
}
