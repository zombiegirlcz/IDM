package ui7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f280315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f280316b;

    public b(a amounts, List transactions) {
        Intrinsics.checkNotNullParameter(amounts, "amounts");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f280315a = amounts;
        this.f280316b = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f280315a, bVar.f280315a) && Intrinsics.f(this.f280316b, bVar.f280316b);
    }

    public final int hashCode() {
        return this.f280316b.hashCode() + (this.f280315a.hashCode() * 31);
    }
}
