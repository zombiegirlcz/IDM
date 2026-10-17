package usa;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f282844a;

    public a(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f282844a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f282844a, ((a) obj2).f282844a);
    }

    public final int hashCode() {
        return this.f282844a.hashCode();
    }
}
