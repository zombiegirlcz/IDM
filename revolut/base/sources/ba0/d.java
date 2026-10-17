package ba0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13865c;

    public d(long j2, List transactions, boolean z) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f13863a = z;
        this.f13864b = j2;
        this.f13865c = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f13863a == dVar.f13863a && this.f13864b == dVar.f13864b && Intrinsics.f(this.f13865c, dVar.f13865c);
    }

    public final int hashCode() {
        return this.f13865c.hashCode() + a0.d.c(Boolean.hashCode(this.f13863a) * 31, 31, this.f13864b);
    }
}
