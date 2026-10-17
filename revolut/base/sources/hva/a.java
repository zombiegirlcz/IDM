package hva;

import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import whf.p;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f155791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f155792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f155793c;

    public a(d totalPaid, boolean z, p transactionsContent) {
        Intrinsics.checkNotNullParameter(totalPaid, "totalPaid");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        this.f155791a = totalPaid;
        this.f155792b = z;
        this.f155793c = transactionsContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f155791a, aVar.f155791a) && this.f155792b == aVar.f155792b && Intrinsics.f(this.f155793c, aVar.f155793c);
    }

    public final int hashCode() {
        return this.f155793c.hashCode() + j6.a.c(this.f155791a.hashCode() * 31, 31, this.f155792b);
    }
}
