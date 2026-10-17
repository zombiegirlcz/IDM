package ccb;

import ccb.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l.a f23009a;

    public o(l.a moneyTransferTarget) {
        Intrinsics.checkNotNullParameter(moneyTransferTarget, "moneyTransferTarget");
        this.f23009a = moneyTransferTarget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f23009a, ((o) obj2).f23009a);
    }

    public final int hashCode() {
        return this.f23009a.hashCode();
    }
}
