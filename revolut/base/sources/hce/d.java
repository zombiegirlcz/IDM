package hce;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f150889b;

    public d(List transactions, dj0.d totalPaid) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(totalPaid, "totalPaid");
        this.f150888a = transactions;
        this.f150889b = totalPaid;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f150888a, dVar.f150888a) && Intrinsics.f(this.f150889b, dVar.f150889b);
    }

    public final int hashCode() {
        return this.f150889b.hashCode() + (this.f150888a.hashCode() * 31);
    }
}
