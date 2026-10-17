package k1e;

import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1e.a f180218a;

    public d(c1e.a transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f180218a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f180218a, ((d) obj2).f180218a);
    }

    public final int hashCode() {
        return this.f180218a.hashCode();
    }
}
