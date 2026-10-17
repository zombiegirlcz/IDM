package x15;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes22.dex */
public interface d0 extends p {
    @Override // x15.p
    default boolean a() {
        if (this instanceof c0) {
            return ((c0) this).f302248a instanceof z;
        }
        if (this instanceof y) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
