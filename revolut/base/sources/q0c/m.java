package q0c;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f241239a;

    public m(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f241239a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f241239a, ((m) obj2).f241239a);
    }

    public final int hashCode() {
        return this.f241239a.hashCode();
    }
}
