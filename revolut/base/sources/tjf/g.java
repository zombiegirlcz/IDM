package tjf;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f271655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId.Joint f271657c;

    public g(i7 filter, String query, AccountId.Joint accountId) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f271655a = filter;
        this.f271656b = query;
        this.f271657c = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f271655a, gVar.f271655a) && this.f271656b.equals(gVar.f271656b) && this.f271657c.equals(gVar.f271657c);
    }

    public final int hashCode() {
        return this.f271657c.hashCode() + p.a.c(this.f271655a.hashCode() * 31, 31, this.f271656b);
    }
}
