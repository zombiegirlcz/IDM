package rxg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import ip0.v7;
import jel.a3;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f258177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.c f258178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WidgetisedAnalyticsType f258179c;
    public final eel.c d;
    public final dj0.d e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f258180g;

    public h(a3 sector, iwg.c calculationMethod, WidgetisedAnalyticsType analyticsType, eel.c timeSpan, dj0.d pnl2, float f, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(calculationMethod, "calculationMethod");
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f258177a = sector;
        this.f258178b = calculationMethod;
        this.f258179c = analyticsType;
        this.d = timeSpan;
        this.e = pnl2;
        this.f = f;
        this.f258180g = localDate;
    }

    @Override // rxg.j
    public final LocalDate b() {
        return this.f258180g;
    }

    @Override // rxg.j
    public final float c() {
        return this.f;
    }

    @Override // rxg.j
    public final dj0.d d() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f258177a == hVar.f258177a && this.f258178b == hVar.f258178b && Intrinsics.f(this.f258179c, hVar.f258179c) && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && Float.compare(this.f, hVar.f) == 0 && Intrinsics.f(this.f258180g, hVar.f258180g);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f, v7.c(o.c(this.d, (this.f258179c.hashCode() + o.d(this.f258178b, this.f258177a.hashCode() * 31, 31)) * 31, 31), 31, this.e), 31);
        LocalDate localDate = this.f258180g;
        return iB + (localDate == null ? 0 : localDate.hashCode());
    }
}
