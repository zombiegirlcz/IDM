package mkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f206279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ibd.i f206280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f206281c;

    public x(boolean z, ibd.i standingOrder, Long l2) {
        Intrinsics.checkNotNullParameter(standingOrder, "standingOrder");
        this.f206279a = z;
        this.f206280b = standingOrder;
        this.f206281c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f206279a == xVar.f206279a && Intrinsics.f(this.f206280b, xVar.f206280b) && Intrinsics.f(this.f206281c, xVar.f206281c);
    }

    public final int hashCode() {
        int iHashCode = (this.f206280b.hashCode() + (Boolean.hashCode(this.f206279a) * 31)) * 31;
        Long l2 = this.f206281c;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
