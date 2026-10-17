package nl4;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f216992a;

    public b(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f216992a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f216992a, ((b) obj2).f216992a);
    }

    public final int hashCode() {
        return this.f216992a.hashCode();
    }
}
