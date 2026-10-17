package qll;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes12.dex */
public interface p {
    default boolean a() {
        if ((this instanceof n) || (this instanceof m) || (this instanceof l)) {
            return false;
        }
        if ((this instanceof o) || (this instanceof k)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
