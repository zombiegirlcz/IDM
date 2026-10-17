package tzg;

import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransactionsFilter f275962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f275963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InvestTransaction f275964c;

    public e(InvestTransactionsFilter filter, int i, InvestTransaction transaction) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f275962a = filter;
        this.f275963b = i;
        this.f275964c = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f275962a, eVar.f275962a) && this.f275963b == eVar.f275963b && Intrinsics.f(this.f275964c, eVar.f275964c);
    }

    public final int hashCode() {
        return this.f275964c.hashCode() + j6.a.b(this.f275963b, this.f275962a.hashCode() * 31, 31);
    }
}
