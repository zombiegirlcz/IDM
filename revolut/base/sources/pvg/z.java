package pvg;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.Duration;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240258c;
    public final String d;
    public final Duration e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f240259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ZonedDateTime f240260h;

    public z(iwg.a analyticsProductType, eel.c timeSpan, String currency, String portfolioId, Duration interval, DateTime start, DateTime end2, ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f240256a = analyticsProductType;
        this.f240257b = timeSpan;
        this.f240258c = currency;
        this.d = portfolioId;
        this.e = interval;
        this.f = start;
        this.f240259g = end2;
        this.f240260h = zonedDateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f240256a == zVar.f240256a && this.f240257b == zVar.f240257b && Intrinsics.f(this.f240258c, zVar.f240258c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && Intrinsics.f(this.f240259g, zVar.f240259g) && Intrinsics.f(this.f240260h, zVar.f240260h);
    }

    public final int hashCode() {
        int iF = m72.b.f(this.f240259g, m72.b.f(this.f, (this.e.hashCode() + p.a.c(p.a.c(prk.o.c(this.f240257b, this.f240256a.hashCode() * 31, 31), 31, this.f240258c), 31, this.d)) * 31, 31), 31);
        ZonedDateTime zonedDateTime = this.f240260h;
        return iF + (zonedDateTime == null ? 0 : zonedDateTime.hashCode());
    }
}
