package mkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ibd.i f206282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qua.p f206283b;

    public y(ibd.i standingOrder, qua.p pVar) {
        Intrinsics.checkNotNullParameter(standingOrder, "standingOrder");
        this.f206282a = standingOrder;
        this.f206283b = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f206282a, yVar.f206282a) && Intrinsics.f(this.f206283b, yVar.f206283b);
    }

    public final int hashCode() {
        int iHashCode = this.f206282a.hashCode() * 31;
        qua.p pVar = this.f206283b;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }
}
