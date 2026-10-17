package p26;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f232082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qta.f f232083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TrendViewDelegate.a f232084c;
    public final Data d;
    public final Data e;

    public g(Data plot, qta.f chartPeriod, TrendViewDelegate.a trendState, Data transactions, Data currentRate) {
        Intrinsics.checkNotNullParameter(plot, "plot");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(trendState, "trendState");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        this.f232082a = plot;
        this.f232083b = chartPeriod;
        this.f232084c = trendState;
        this.d = transactions;
        this.e = currentRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f232082a, gVar.f232082a) && this.f232083b == gVar.f232083b && Intrinsics.f(this.f232084c, gVar.f232084c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, (this.f232084c.hashCode() + ((this.f232083b.hashCode() + (this.f232082a.hashCode() * 31)) * 31)) * 31, 31);
    }
}
