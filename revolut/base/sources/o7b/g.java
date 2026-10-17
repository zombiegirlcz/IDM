package o7b;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f222741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f222742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f222743c;

    public g(TextLocalisedClause textLocalisedClause, List items, lw0.a aVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f222741a = items;
        this.f222742b = aVar;
        this.f222743c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f222741a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f222741a, gVar.f222741a) && Intrinsics.f(this.f222742b, gVar.f222742b) && Intrinsics.f(this.f222743c, gVar.f222743c);
    }

    public final int hashCode() {
        int iHashCode = this.f222741a.hashCode() * 31;
        m mVar = this.f222742b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Clause clause = this.f222743c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
