package z2f;

import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransactionsFilter f319064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f319065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f319066c;
    public final int d;

    public d(InvestTransactionsFilter filter, Instant from, Instant to6, int i) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f319064a = filter;
        this.f319065b = from;
        this.f319066c = to6;
        this.d = i;
    }

    @Override // z2f.g
    public final InvestTransactionsFilter a() {
        return this.f319064a;
    }

    @Override // z2f.g
    public final Instant b() {
        return this.f319065b;
    }

    @Override // z2f.g
    public final int c() {
        return this.d;
    }

    @Override // z2f.g
    public final Instant d() {
        return this.f319066c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f319064a, dVar.f319064a) && Intrinsics.f(this.f319065b, dVar.f319065b) && Intrinsics.f(this.f319066c, dVar.f319066c) && this.d == dVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + r6.b.c(r6.b.c(this.f319064a.hashCode() * 31, 31, this.f319065b), 31, this.f319066c);
    }
}
