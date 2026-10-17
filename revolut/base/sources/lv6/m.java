package lv6;

import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f200332a;

    public m(i7 transactionsFilter) {
        Intrinsics.checkNotNullParameter(transactionsFilter, "transactionsFilter");
        this.f200332a = transactionsFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f200332a, ((m) obj2).f200332a);
    }

    public final int hashCode() {
        return this.f200332a.hashCode();
    }
}
