package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public interface h3 {
    default void dispose() {
    }

    default t2 n() {
        return null;
    }

    default h3 o() {
        return this;
    }

    default h3 p(boolean z, u2 sharedState) {
        Intrinsics.checkNotNullParameter(sharedState, "sharedState");
        return this;
    }

    h3 q(t2 t2Var, u2 u2Var);

    default h3 r(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return this;
    }
}
