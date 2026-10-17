package qba;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f244151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f244152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f244153c;
    public final Clause d;

    public g(boolean z, boolean z3, boolean z4, CompositeClause compositeClause) {
        this.f244151a = z;
        this.f244152b = z3;
        this.f244153c = z4;
        this.d = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f244151a == gVar.f244151a && this.f244152b == gVar.f244152b && this.f244153c == gVar.f244153c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(Boolean.hashCode(this.f244151a) * 31, 31, this.f244152b), 31, this.f244153c);
        Clause clause = this.d;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
