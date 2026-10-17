package z8k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f320200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f320201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f320202c;
    public final boolean d;
    public final Clause e;

    public r(TextLocalisedClause submitButtonClause, boolean z, boolean z3, boolean z4, Clause clause) {
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f320200a = submitButtonClause;
        this.f320201b = z;
        this.f320202c = z3;
        this.d = z4;
        this.e = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f320200a.equals(rVar.f320200a) && this.f320201b == rVar.f320201b && this.f320202c == rVar.f320202c && this.d == rVar.d && Intrinsics.f(this.e, rVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(this.f320200a.hashCode() * 31, 31, this.f320201b), 31, this.f320202c), 31, this.d);
        Clause clause = this.e;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
