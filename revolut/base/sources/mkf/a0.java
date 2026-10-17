package mkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f206221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ibd.i f206222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f206223c;

    public a0(boolean z, ibd.i standingOrder, Long l2) {
        Intrinsics.checkNotNullParameter(standingOrder, "standingOrder");
        this.f206221a = z;
        this.f206222b = standingOrder;
        this.f206223c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f206221a == a0Var.f206221a && Intrinsics.f(this.f206222b, a0Var.f206222b) && Intrinsics.f(this.f206223c, a0Var.f206223c);
    }

    public final int hashCode() {
        int iHashCode = (this.f206222b.hashCode() + (Boolean.hashCode(this.f206221a) * 31)) * 31;
        Long l2 = this.f206223c;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
