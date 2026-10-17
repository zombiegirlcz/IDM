package k3k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f180800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f180801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f180802c;
    public final boolean d;
    public final Clause e;

    public v(TextLocalisedClause submitButtonClause, boolean z, boolean z3, boolean z4, Clause clause) {
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f180800a = submitButtonClause;
        this.f180801b = z;
        this.f180802c = z3;
        this.d = z4;
        this.e = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f180800a.equals(vVar.f180800a) && this.f180801b == vVar.f180801b && this.f180802c == vVar.f180802c && this.d == vVar.d && Intrinsics.f(this.e, vVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(this.f180800a.hashCode() * 31, 31, this.f180801b), 31, this.f180802c), 31, this.d);
        Clause clause = this.e;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
