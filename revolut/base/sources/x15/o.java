package x15;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes22.dex */
public interface o extends p {
    @Override // x15.p
    default boolean a() {
        if (this instanceof n) {
            return ((n) this).f302295b instanceof j;
        }
        if (this instanceof i) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
