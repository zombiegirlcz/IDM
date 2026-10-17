package qp5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f248255b;

    public b(dj0.d moneyAmount, String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(moneyAmount, "moneyAmount");
        this.f248254a = transactionId;
        this.f248255b = moneyAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f248254a, bVar.f248254a) && Intrinsics.f(this.f248255b, bVar.f248255b);
    }

    public final int hashCode() {
        return this.f248255b.hashCode() + (this.f248254a.hashCode() * 31);
    }
}
