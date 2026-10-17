package trb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273774b;

    public b(String symbol, String interval) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.f273773a = symbol;
        this.f273774b = interval;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f273773a, bVar.f273773a) && Intrinsics.f(this.f273774b, bVar.f273774b);
    }

    public final int hashCode() {
        return this.f273774b.hashCode() + (this.f273773a.hashCode() * 31);
    }
}
