package usb;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f282877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f282878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f282879c;
    public final int d;

    public j(dj0.d amount, dj0.d balance, tsb.c cVar, int i) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f282877a = amount;
        this.f282878b = balance;
        this.f282879c = cVar;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f282877a, jVar.f282877a) && Intrinsics.f(this.f282878b, jVar.f282878b) && Intrinsics.f(this.f282879c, jVar.f282879c) && this.d == jVar.d;
    }

    public final int hashCode() {
        int iC = v7.c(this.f282877a.hashCode() * 31, 31, this.f282878b);
        Object obj2 = this.f282879c;
        return Integer.hashCode(this.d) + ((iC + (obj2 == null ? 0 : obj2.hashCode())) * 31);
    }
}
