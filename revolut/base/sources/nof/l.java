package nof;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7 f218038b;

    public l(List transactions, i7 filter) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f218037a = transactions;
        this.f218038b = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f218037a, lVar.f218037a) && Intrinsics.f(this.f218038b, lVar.f218038b);
    }

    public final int hashCode() {
        return this.f218038b.hashCode() + (this.f218037a.hashCode() * 31);
    }
}
