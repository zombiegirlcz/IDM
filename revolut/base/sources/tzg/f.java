package tzg;

import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransactionsFilter f275965a;

    public f(InvestTransactionsFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f275965a = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f275965a, ((f) obj2).f275965a);
    }

    public final int hashCode() {
        return Integer.hashCode(100) + (this.f275965a.hashCode() * 31);
    }
}
