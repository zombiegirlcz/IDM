package w83;

import com.revolut.domain.models.transactions.ThreeDSTransaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreeDSTransaction f295582a;

    public g(ThreeDSTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f295582a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f295582a, ((g) obj2).f295582a);
    }

    public final int hashCode() {
        return this.f295582a.hashCode();
    }
}
