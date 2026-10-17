package x15;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes22.dex */
public interface h0 extends p {
    @Override // x15.p
    default boolean a() {
        if (this instanceof e0) {
            return true;
        }
        if ((this instanceof g0) || (this instanceof f0)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
