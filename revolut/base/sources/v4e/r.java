package v4e;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import jel.v2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f286061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2 f286062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f286063c;
    public final eel.e d;
    public final InstrumentTicker e;

    public r(i id10, v2 info, ej0.b initialBuyPrice, eel.e historicalData, InstrumentTicker ticker) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(initialBuyPrice, "initialBuyPrice");
        Intrinsics.checkNotNullParameter(historicalData, "historicalData");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        this.f286061a = id10;
        this.f286062b = info;
        this.f286063c = initialBuyPrice;
        this.d = historicalData;
        this.e = ticker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f286061a, rVar.f286061a) && Intrinsics.f(this.f286062b, rVar.f286062b) && Intrinsics.f(this.f286063c, rVar.f286063c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + org.bouncycastle.jcajce.provider.digest.a.d(this.f286063c, (this.f286062b.hashCode() + (this.f286061a.f286053a.hashCode() * 31)) * 31, 31)) * 31);
    }
}
