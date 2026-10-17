package t6e;

import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f268309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f268310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f268311c;
    public final dj0.d d;
    public final ArrayList e;

    public a(boolean z, dj0.d balance, dj0.d upcomingPaymentsSum, dj0.d upcomingFundingSum, ArrayList chartData) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(upcomingPaymentsSum, "upcomingPaymentsSum");
        Intrinsics.checkNotNullParameter(upcomingFundingSum, "upcomingFundingSum");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        this.f268309a = z;
        this.f268310b = balance;
        this.f268311c = upcomingPaymentsSum;
        this.d = upcomingFundingSum;
        this.e = chartData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f268309a == aVar.f268309a && this.f268310b.equals(aVar.f268310b) && this.f268311c.equals(aVar.f268311c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(v7.c(Boolean.hashCode(this.f268309a) * 31, 31, this.f268310b), 31, this.f268311c), 31, this.d);
    }
}
