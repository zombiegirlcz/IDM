package ft4;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f137924a;

    public o(Set transactionIds) {
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        this.f137924a = transactionIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f137924a, ((o) obj2).f137924a);
    }

    public final int hashCode() {
        return this.f137924a.hashCode();
    }

    @Override // ft4.p
    public final Set v0() {
        return this.f137924a;
    }
}
