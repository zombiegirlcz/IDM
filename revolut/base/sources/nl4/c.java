package nl4;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f216993a;

    public c(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f216993a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f216993a, ((c) obj2).f216993a);
    }

    public final int hashCode() {
        return this.f216993a.hashCode();
    }
}
