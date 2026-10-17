package oqk;

import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 implements ssi.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedTransaction f227949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedTransactionsFilter f227950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f227951c;

    public h0(UnifiedTransaction transaction, UnifiedTransactionsFilter filter, List extraStandardActions) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(extraStandardActions, "extraStandardActions");
        this.f227949a = transaction;
        this.f227950b = filter;
        this.f227951c = extraStandardActions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f227949a, h0Var.f227949a) && Intrinsics.f(this.f227950b, h0Var.f227950b) && Intrinsics.f(this.f227951c, h0Var.f227951c);
    }

    public final int hashCode() {
        return this.f227951c.hashCode() + ((this.f227950b.hashCode() + (this.f227949a.hashCode() * 31)) * 31);
    }
}
