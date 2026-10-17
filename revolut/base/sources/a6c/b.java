package a6c;

import kotlin.jvm.internal.Intrinsics;
import q6c.n;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f1599b;

    public b(String paymentId, n state) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f1598a = paymentId;
        this.f1599b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f1598a, bVar.f1598a) && this.f1599b == bVar.f1599b;
    }

    public final int hashCode() {
        return this.f1599b.hashCode() + (this.f1598a.hashCode() * 31);
    }
}
