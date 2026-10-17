package ard;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f8650a;

    public g(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f8650a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f8650a, ((g) obj2).f8650a);
    }

    public final int hashCode() {
        return this.f8650a.hashCode();
    }
}
