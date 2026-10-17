package ogd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f225114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f225115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f225116c;
    public final List d;

    public g(List assetDetails, List rates, List plots, f0 tickers) {
        Intrinsics.checkNotNullParameter(assetDetails, "assetDetails");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(plots, "plots");
        Intrinsics.checkNotNullParameter(tickers, "tickers");
        this.f225114a = assetDetails;
        this.f225115b = rates;
        this.f225116c = plots;
        this.d = tickers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f225114a, gVar.f225114a) && Intrinsics.f(this.f225115b, gVar.f225115b) && Intrinsics.f(this.f225116c, gVar.f225116c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f225114a.hashCode() * 31, 31, this.f225115b), 31, this.f225116c);
    }
}
