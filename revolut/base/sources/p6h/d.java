package p6h;

import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingInterest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthMarginBorrowingInterest f233313a;

    public d(WealthMarginBorrowingInterest wealthMarginBorrowingInterest) {
        Intrinsics.checkNotNullParameter(wealthMarginBorrowingInterest, "wealthMarginBorrowingInterest");
        this.f233313a = wealthMarginBorrowingInterest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f233313a, ((d) obj2).f233313a);
    }

    public final int hashCode() {
        return this.f233313a.hashCode();
    }
}
