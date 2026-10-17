package jkg;

import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedTransactionsFilter f175167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f175168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f175169c;

    public f(UnifiedTransactionsFilter filter, int i, String searchQuery) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f175167a = filter;
        this.f175168b = i;
        this.f175169c = searchQuery;
    }

    public final UnifiedTransactionsFilter a() {
        return this.f175167a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f175167a, fVar.f175167a) && this.f175168b == fVar.f175168b && Intrinsics.f(this.f175169c, fVar.f175169c);
    }

    public final int hashCode() {
        return this.f175169c.hashCode() + j6.a.b(this.f175168b, this.f175167a.hashCode() * 31, 31);
    }
}
