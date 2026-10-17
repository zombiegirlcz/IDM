package snf;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public interface f0 {
    default String a() {
        if (this instanceof e0) {
            return "Personal(migratedFromYouth=" + ((e0) this).f264578a + ")";
        }
        if (equals(b0.f264574a)) {
            return "Joint";
        }
        if (!(this instanceof d0)) {
            throw new NoWhenBranchMatchedException();
        }
        d0 d0Var = (d0) this;
        return j6.a.s("Junior(name=", d0Var.f264576a, ", juniorId=", d0Var.f264577b, ")");
    }
}
