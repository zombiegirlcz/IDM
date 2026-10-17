package w3c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f294277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f294278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f294279c;
    public final boolean d;
    public final boolean e;
    public final Clause f;

    public k() {
        this(null, 63);
    }

    @Override // cli.p
    public final List c() {
        return this.f294277a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f294277a, kVar.f294277a) && Intrinsics.f(this.f294278b, kVar.f294278b) && this.f294279c == kVar.f294279c && this.d == kVar.d && this.e == kVar.e && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f294277a.hashCode() * 31;
        Clause clause = this.f294278b;
        int iC = j6.a.c(j6.a.c(j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f294279c), 31, this.d), 31, this.e);
        Clause clause2 = this.f;
        return iC + (clause2 != null ? clause2.hashCode() : 0);
    }

    public k(List items, TextLocalisedClause textLocalisedClause, boolean z, boolean z3, boolean z4, TextLocalisedClause textLocalisedClause2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f294277a = items;
        this.f294278b = textLocalisedClause;
        this.f294279c = z;
        this.d = z3;
        this.e = z4;
        this.f = textLocalisedClause2;
    }

    public k(List list, int i) {
        this((i & 1) != 0 ? f0.f322471a : list, null, false, false, false, null);
    }
}
