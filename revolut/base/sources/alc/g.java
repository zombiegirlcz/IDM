package alc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f6196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f6197b;

    public g(f startingAmountRange, f monthlyContributionRange) {
        Intrinsics.checkNotNullParameter(startingAmountRange, "startingAmountRange");
        Intrinsics.checkNotNullParameter(monthlyContributionRange, "monthlyContributionRange");
        this.f6196a = startingAmountRange;
        this.f6197b = monthlyContributionRange;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f6196a, gVar.f6196a) && Intrinsics.f(this.f6197b, gVar.f6197b);
    }

    public final int hashCode() {
        return this.f6197b.hashCode() + (this.f6196a.hashCode() * 31);
    }
}
