package n6h;

import cli.j;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingInterest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthMarginBorrowingInterest f212786a;

    public d(WealthMarginBorrowingInterest wealthMarginBorrowingInterest) {
        Intrinsics.checkNotNullParameter(wealthMarginBorrowingInterest, "wealthMarginBorrowingInterest");
        this.f212786a = wealthMarginBorrowingInterest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f212786a, ((d) obj2).f212786a);
    }

    public final int hashCode() {
        return this.f212786a.hashCode();
    }
}
