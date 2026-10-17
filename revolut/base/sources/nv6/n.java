package nv6;

import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f219526a;

    public n(i7 transactionsFilter) {
        Intrinsics.checkNotNullParameter(transactionsFilter, "transactionsFilter");
        this.f219526a = transactionsFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f219526a, ((n) obj2).f219526a);
    }

    public final int hashCode() {
        return this.f219526a.hashCode();
    }
}
