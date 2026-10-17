package mwg;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwg.a f209469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f209470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f209471c;
    public final dj0.d d;
    public final dj0.d e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ej0.b f209472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BigDecimal f209473h;

    public k(iwg.a analyticsProductType, String asset, LocalDate sellDate, dj0.d pnlFifo, dj0.d pnlAverage, String str, ej0.b bVar, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(sellDate, "sellDate");
        Intrinsics.checkNotNullParameter(pnlFifo, "pnlFifo");
        Intrinsics.checkNotNullParameter(pnlAverage, "pnlAverage");
        this.f209469a = analyticsProductType;
        this.f209470b = asset;
        this.f209471c = sellDate;
        this.d = pnlFifo;
        this.e = pnlAverage;
        this.f = str;
        this.f209472g = bVar;
        this.f209473h = bigDecimal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f209469a == kVar.f209469a && Intrinsics.f(this.f209470b, kVar.f209470b) && Intrinsics.f(this.f209471c, kVar.f209471c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f209472g, kVar.f209472g) && Intrinsics.f(this.f209473h, kVar.f209473h);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(com.revolut.data.database.models.openbanking.d.g(this.f209471c, p.a.c(this.f209469a.hashCode() * 31, 31, this.f209470b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        ej0.b bVar = this.f209472g;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        BigDecimal bigDecimal = this.f209473h;
        return iHashCode2 + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }
}
