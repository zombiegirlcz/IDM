package x15;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes22.dex */
public interface x extends p {
    @Override // x15.p
    default boolean a() {
        if (this instanceof w) {
            return ((w) this).f302305b instanceof t;
        }
        if (this instanceof r) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
