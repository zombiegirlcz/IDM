package tfd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.shared_separate_favourites.domain.chart.ChartRatePoint;
import dj0.d;
import h30.l;
import ip0.v7;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f270292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f270293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f270294c;
    public final xi0.b d;
    public final double e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChartRatePoint f270295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ngd.b f270296h;
    public final ngd.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f270297j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f270298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f270299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Throwable f270300n;
    public final Clause o;

    public b(BigDecimal rate, BigDecimal bigDecimal, boolean z, xi0.b baseCurrency, double d, d growthAbsolute, ChartRatePoint chartRatePoint, ngd.b rateType, ngd.a rateRange, List ratePoints, List rateRanges, boolean z3, boolean z4, Throwable th10, Clause clause) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(growthAbsolute, "growthAbsolute");
        Intrinsics.checkNotNullParameter(rateType, "rateType");
        Intrinsics.checkNotNullParameter(rateRange, "rateRange");
        Intrinsics.checkNotNullParameter(ratePoints, "ratePoints");
        Intrinsics.checkNotNullParameter(rateRanges, "rateRanges");
        this.f270292a = rate;
        this.f270293b = bigDecimal;
        this.f270294c = z;
        this.d = baseCurrency;
        this.e = d;
        this.f = growthAbsolute;
        this.f270295g = chartRatePoint;
        this.f270296h = rateType;
        this.i = rateRange;
        this.f270297j = ratePoints;
        this.k = rateRanges;
        this.f270298l = z3;
        this.f270299m = z4;
        this.f270300n = th10;
        this.o = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f270292a, bVar.f270292a) && Intrinsics.f(this.f270293b, bVar.f270293b) && this.f270294c == bVar.f270294c && Intrinsics.f(this.d, bVar.d) && Double.compare(this.e, bVar.e) == 0 && this.f.equals(bVar.f) && Intrinsics.f(this.f270295g, bVar.f270295g) && this.f270296h == bVar.f270296h && this.i == bVar.i && Intrinsics.f(this.f270297j, bVar.f270297j) && Intrinsics.f(this.k, bVar.k) && this.f270298l == bVar.f270298l && this.f270299m == bVar.f270299m && Intrinsics.f(this.f270300n, bVar.f270300n) && Intrinsics.f(this.o, bVar.o);
    }

    public final int hashCode() {
        int iHashCode = this.f270292a.hashCode() * 31;
        BigDecimal bigDecimal = this.f270293b;
        int iC = v7.c(m72.b.c(l.j(this.d, j6.a.c((iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31, this.f270294c), 31), this.e, 31), 31, this.f);
        ChartRatePoint chartRatePoint = this.f270295g;
        int iC2 = j6.a.c(j6.a.c(p.a.d(p.a.d((this.i.hashCode() + ((this.f270296h.hashCode() + ((iC + (chartRatePoint == null ? 0 : chartRatePoint.hashCode())) * 31)) * 31)) * 31, 31, this.f270297j), 31, this.k), 31, this.f270298l), 31, this.f270299m);
        Throwable th10 = this.f270300n;
        int iHashCode2 = (iC2 + (th10 == null ? 0 : th10.hashCode())) * 31;
        Clause clause = this.o;
        return Boolean.hashCode(false) + ((iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
