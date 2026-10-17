package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f240162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f240163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240164c;
    public final String d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f240166h;
    public final String i;

    public i0(iwg.a analyticsProductType, eel.c timeSpan, String currency, String portfolioId, DateTime start, DateTime end2, jo3.b bVar, jo3.b bVar2, String chartDetailsType) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(chartDetailsType, "chartDetailsType");
        this.f240162a = analyticsProductType;
        this.f240163b = timeSpan;
        this.f240164c = currency;
        this.d = portfolioId;
        this.e = start;
        this.f = end2;
        this.f240165g = bVar;
        this.f240166h = bVar2;
        this.i = chartDetailsType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return this.f240162a == i0Var.f240162a && this.f240163b == i0Var.f240163b && Intrinsics.f(this.f240164c, i0Var.f240164c) && Intrinsics.f(this.d, i0Var.d) && Intrinsics.f(this.e, i0Var.e) && Intrinsics.f(this.f, i0Var.f) && Intrinsics.f(this.f240165g, i0Var.f240165g) && Intrinsics.f(this.f240166h, i0Var.f240166h) && Intrinsics.f(this.i, i0Var.i);
    }

    public final int hashCode() {
        int iF = m72.b.f(this.f, m72.b.f(this.e, p.a.c(p.a.c(prk.o.c(this.f240163b, this.f240162a.hashCode() * 31, 31), 31, this.f240164c), 31, this.d), 31), 31);
        jo3.b bVar = this.f240165g;
        int iHashCode = (iF + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.f240166h;
        return this.i.hashCode() + ((iHashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31);
    }
}
