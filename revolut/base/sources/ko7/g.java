package ko7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f186257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f186258c;
    public final boolean d;
    public final Clause e;

    public g(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f186256a = items;
        this.f186257b = z;
        this.f186258c = textLocalisedClause;
        this.d = z3;
        this.e = textLocalisedClause2;
    }

    @Override // jki.n
    public final List c() {
        return this.f186256a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f186256a, gVar.f186256a) && this.f186257b == gVar.f186257b && Intrinsics.f(this.f186258c, gVar.f186258c) && this.d == gVar.d && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f186256a.hashCode() * 31, 31, this.f186257b);
        Clause clause = this.f186258c;
        int iC2 = j6.a.c((iC + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        Clause clause2 = this.e;
        return iC2 + (clause2 != null ? clause2.hashCode() : 0);
    }

    public /* synthetic */ g(List list) {
        this(null, null, list, false, false);
    }
}
