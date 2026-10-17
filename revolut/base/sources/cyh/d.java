package cyh;

import kotlin.jvm.internal.Intrinsics;
import whf.p;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f110098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f110100c;

    public d(dj0.d totalPaid, boolean z, p transactionsContent) {
        Intrinsics.checkNotNullParameter(totalPaid, "totalPaid");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        this.f110098a = totalPaid;
        this.f110099b = z;
        this.f110100c = transactionsContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f110098a, dVar.f110098a) && this.f110099b == dVar.f110099b && Intrinsics.f(this.f110100c, dVar.f110100c);
    }

    public final int hashCode() {
        return this.f110100c.hashCode() + j6.a.c(this.f110098a.hashCode() * 31, 31, this.f110099b);
    }
}
