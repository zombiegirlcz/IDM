package zq5;

import java.time.Instant;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {
    public static final Long a(j0 j0Var, i0 i0Var) {
        if (i0Var instanceof f0) {
            f0 f0Var = (f0) i0Var;
            jq9.k kVar = f0Var.f324379b;
            return Long.valueOf(kVar != null ? kVar.b() : f0Var.f324378a.o.toEpochMilli());
        }
        if (!(i0Var instanceof e0)) {
            if (i0Var instanceof g0) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        e0 e0Var = (e0) i0Var;
        jq9.k kVar2 = e0Var.f324375b;
        if (kVar2 != null) {
            return Long.valueOf(kVar2.b());
        }
        Instant instant = e0Var.f324374a.D;
        if (instant != null) {
            return Long.valueOf(instant.toEpochMilli());
        }
        return null;
    }

    public static final String b(j0 j0Var, i0 i0Var) {
        if (i0Var instanceof f0) {
            return ((f0) i0Var).f324378a.f71059a;
        }
        if (i0Var instanceof e0) {
            return ((e0) i0Var).f324374a.f132329a;
        }
        if (i0Var instanceof g0) {
            return ((g0) i0Var).f324382a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
