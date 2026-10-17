package rv6;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f257705a;

    public n(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f257705a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f257705a, ((n) obj2).f257705a);
    }

    public final int hashCode() {
        return this.f257705a.hashCode();
    }
}
