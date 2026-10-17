package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ja0 extends com.fasterxml.jackson.core.m {
    public final jp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(jp state) {
        super(0, state.f164899a, 1);
        Intrinsics.checkNotNullParameter(state, "state");
        this.d = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ja0) && Intrinsics.f(this.d, ((ja0) obj2).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
