package e4k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f122632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f122633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f122634c;
    public final boolean d;
    public final Clause e;

    public s(TextLocalisedClause submitButtonClause, boolean z, boolean z3, boolean z4, Clause clause) {
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f122632a = submitButtonClause;
        this.f122633b = z;
        this.f122634c = z3;
        this.d = z4;
        this.e = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f122632a.equals(sVar.f122632a) && this.f122633b == sVar.f122633b && this.f122634c == sVar.f122634c && this.d == sVar.d && Intrinsics.f(this.e, sVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(this.f122632a.hashCode() * 31, 31, this.f122633b), 31, this.f122634c), 31, this.d);
        Clause clause = this.e;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
