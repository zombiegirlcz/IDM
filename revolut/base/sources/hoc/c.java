package hoc;

import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalValueChart f154270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final del.b f154271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f154272c;
    public final Lazy d;

    public c(TotalValueChart totalValueChart, del.b portfolioBalance, List performanceParameters) {
        Intrinsics.checkNotNullParameter(totalValueChart, "totalValueChart");
        Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
        Intrinsics.checkNotNullParameter(performanceParameters, "performanceParameters");
        this.f154270a = totalValueChart;
        this.f154271b = portfolioBalance;
        this.f154272c = performanceParameters;
        this.d = j.b(new h1g.a(this, 27));
    }

    @Override // hoc.d
    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f154270a, cVar.f154270a) && Intrinsics.f(this.f154271b, cVar.f154271b) && Intrinsics.f(this.f154272c, cVar.f154272c);
    }

    @Override // hoc.d
    public final long getEndMillis() {
        return this.f154270a.f95003b.getMillis();
    }

    @Override // hoc.d
    public final long getStartMillis() {
        return this.f154270a.f95002a.getMillis();
    }

    public final int hashCode() {
        return this.f154272c.hashCode() + ((this.f154271b.hashCode() + (this.f154270a.hashCode() * 31)) * 31);
    }
}
