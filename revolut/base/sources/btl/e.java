package btl;

import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2h.b f18651a;

    public e(x2h.b actionsPanelState) {
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        this.f18651a = actionsPanelState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f18651a, ((e) obj2).f18651a);
    }

    public final int hashCode() {
        return this.f18651a.hashCode();
    }
}
