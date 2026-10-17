package wtc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k71.q f299883b;

    public l0(List transactions, k71.q transactionsExtra) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(transactionsExtra, "transactionsExtra");
        this.f299882a = transactions;
        this.f299883b = transactionsExtra;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f299882a, l0Var.f299882a) && Intrinsics.f(this.f299883b, l0Var.f299883b);
    }

    public final int hashCode() {
        return this.f299883b.hashCode() + (this.f299882a.hashCode() * 31);
    }
}
