package pvg;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iwg.a f240192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.c f240193c;
    public final String d;
    public final String e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo3.b f240194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f240195h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ko3.b f240196j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f240197l;

    public o(eel.c timeSpan, iwg.a itemAnalyticsProductType, String requestedProductTypes, String currency, String asset, String str, String str2, jo3.b pnlFifo, jo3.b pnlAverage, ko3.b bVar, LocalDate sellDate) {
        Intrinsics.checkNotNullParameter(requestedProductTypes, "requestedProductTypes");
        Intrinsics.checkNotNullParameter(itemAnalyticsProductType, "itemAnalyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(sellDate, "sellDate");
        Intrinsics.checkNotNullParameter(pnlFifo, "pnlFifo");
        Intrinsics.checkNotNullParameter(pnlAverage, "pnlAverage");
        this.f240191a = requestedProductTypes;
        this.f240192b = itemAnalyticsProductType;
        this.f240193c = timeSpan;
        this.d = currency;
        this.e = asset;
        this.f = sellDate;
        this.f240194g = pnlFifo;
        this.f240195h = pnlAverage;
        this.i = str;
        this.f240196j = bVar;
        this.k = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f240191a, oVar.f240191a) && this.f240192b == oVar.f240192b && this.f240193c == oVar.f240193c && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f240194g, oVar.f240194g) && Intrinsics.f(this.f240195h, oVar.f240195h) && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f240196j, oVar.f240196j) && Intrinsics.f(this.k, oVar.k);
    }

    public final int hashCode() {
        int iE = wp5.y.e(this.f240195h, wp5.y.e(this.f240194g, com.revolut.data.database.models.openbanking.d.g(this.f, p.a.c(p.a.c(prk.o.c(this.f240193c, (this.f240192b.hashCode() + (this.f240191a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31), 31), 31);
        String str = this.i;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        ko3.b bVar = this.f240196j;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.k;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
