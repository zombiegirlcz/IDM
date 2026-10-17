package zh9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f322356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f322357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k71.q f322358c;

    public v0(r0 plan, List relatedRepaymentTransactions, k71.q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(relatedRepaymentTransactions, "relatedRepaymentTransactions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f322356a = plan;
        this.f322357b = relatedRepaymentTransactions;
        this.f322358c = transactionsExtraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f322356a, v0Var.f322356a) && Intrinsics.f(this.f322357b, v0Var.f322357b) && Intrinsics.f(this.f322358c, v0Var.f322358c);
    }

    public final int hashCode() {
        return this.f322358c.hashCode() + p.a.d(this.f322356a.hashCode() * 31, 31, this.f322357b);
    }
}
