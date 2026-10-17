package hug;

import cli.j;
import com.revolut.retail.trading.core.domain.account_closure.AccountClosureBackendRequestedDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosureBackendRequestedDetails f155647a;

    public d(AccountClosureBackendRequestedDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f155647a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f155647a, ((d) obj2).f155647a);
    }

    public final int hashCode() {
        return this.f155647a.hashCode();
    }
}
