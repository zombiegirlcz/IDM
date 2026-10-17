package ds6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f117230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117231b;

    public c0(dj0.d currencyPocketBalance, List transactions) {
        Intrinsics.checkNotNullParameter(currencyPocketBalance, "currencyPocketBalance");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f117230a = currencyPocketBalance;
        this.f117231b = transactions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f117230a, c0Var.f117230a) && Intrinsics.f(this.f117231b, c0Var.f117231b);
    }

    public final int hashCode() {
        return this.f117231b.hashCode() + (this.f117230a.hashCode() * 31);
    }
}
