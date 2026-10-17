package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6 f272803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f272804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f272805c;

    public i6(h6 id10, a3 transaction, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f272803a = id10;
        this.f272804b = transaction;
        this.f272805c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj2;
        return Intrinsics.f(this.f272803a, i6Var.f272803a) && Intrinsics.f(this.f272804b, i6Var.f272804b) && this.f272805c == i6Var.f272805c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f272805c) + wp5.y.f(this.f272804b, this.f272803a.hashCode() * 31, 31);
    }
}
