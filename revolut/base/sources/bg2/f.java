package bg2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15051c;
    public final Clause d;

    public f(boolean z, boolean z3, boolean z4, CompositeClause compositeClause) {
        this.f15049a = z;
        this.f15050b = z3;
        this.f15051c = z4;
        this.d = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f15049a == fVar.f15049a && this.f15050b == fVar.f15050b && this.f15051c == fVar.f15051c && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(Boolean.hashCode(this.f15049a) * 31, 31, this.f15050b), 31, this.f15051c);
        Clause clause = this.d;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
