package pnh;

import dfl.i0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f237789a;

    public k(i0 trade) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        this.f237789a = trade;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f237789a, ((k) obj2).f237789a);
    }

    public final int hashCode() {
        return this.f237789a.hashCode();
    }
}
