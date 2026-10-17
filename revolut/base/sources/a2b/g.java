package a2b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dfl.b f725a;

    public g(dfl.b trade) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        this.f725a = trade;
    }

    public final dfl.b b() {
        return this.f725a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f725a, ((g) obj2).f725a);
    }

    public final int hashCode() {
        return this.f725a.hashCode();
    }
}
