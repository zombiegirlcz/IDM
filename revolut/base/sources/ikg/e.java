package ikg;

import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f161968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161970c;
    public final UnifiedTransactionsFilter d;

    public e(d pageAnchor, int i, String searchQuery, UnifiedTransactionsFilter filter) {
        Intrinsics.checkNotNullParameter(pageAnchor, "pageAnchor");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f161968a = pageAnchor;
        this.f161969b = i;
        this.f161970c = searchQuery;
        this.d = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f161968a, eVar.f161968a) && this.f161969b == eVar.f161969b && Intrinsics.f(this.f161970c, eVar.f161970c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(j6.a.b(this.f161969b, this.f161968a.hashCode() * 31, 31), 31, this.f161970c);
    }
}
