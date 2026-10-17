package fee;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f134593a;

    public f(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f134593a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f134593a, ((f) obj2).f134593a);
    }

    public final int hashCode() {
        return this.f134593a.hashCode();
    }
}
