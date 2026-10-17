package po7;

import java.util.List;
import kl7.o0;
import kotlin.jvm.internal.Intrinsics;
import zhm.p;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f237893b;

    public d() {
        this(null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f237892a, dVar.f237892a) && this.f237893b == dVar.f237893b;
    }

    public final int hashCode() {
        int iHashCode = this.f237892a.hashCode() * 31;
        o0 o0Var = this.f237893b;
        return iHashCode + (o0Var == null ? 0 : o0Var.hashCode());
    }

    public d(o0 o0Var, int i) {
        List values = p.c(o0.values());
        o0Var = (i & 2) != 0 ? null : o0Var;
        Intrinsics.checkNotNullParameter(values, "values");
        this.f237892a = values;
        this.f237893b = o0Var;
    }
}
