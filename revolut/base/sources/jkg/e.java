package jkg;

import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedTransactionsFilter f175164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f175165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f175166c;
    public final long d;
    public final skg.c e;

    public e(UnifiedTransactionsFilter filter, int i, String searchQuery, long j2, skg.c cVar) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f175164a = filter;
        this.f175165b = i;
        this.f175166c = searchQuery;
        this.d = j2;
        this.e = cVar;
    }

    public final UnifiedTransactionsFilter a() {
        return this.f175164a;
    }

    public final int b() {
        return this.f175165b;
    }

    public final String c() {
        return this.f175166c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f175164a, eVar.f175164a) && this.f175165b == eVar.f175165b && Intrinsics.f(this.f175166c, eVar.f175166c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(j6.a.b(this.f175165b, this.f175164a.hashCode() * 31, 31), 31, this.f175166c), 31, this.d);
        skg.c cVar = this.e;
        return iC + (cVar == null ? 0 : cVar.hashCode());
    }
}
