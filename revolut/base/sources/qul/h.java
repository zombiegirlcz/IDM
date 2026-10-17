package qul;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import vrl.a0;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TargetPriceInputValue f249497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f249498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InstrumentTicker f249499c;
    public final oel.l d;
    public final a0 e;
    public final bfl.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0 f249500g;

    public h(TargetPriceInputValue inputValue, n instrument, InstrumentTicker instrumentTicker, oel.l lVar, a0 validation, bfl.g tradeSide, r0 orderType) {
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(validation, "validation");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f249497a = inputValue;
        this.f249498b = instrument;
        this.f249499c = instrumentTicker;
        this.d = lVar;
        this.e = validation;
        this.f = tradeSide;
        this.f249500g = orderType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f249497a, hVar.f249497a) && Intrinsics.f(this.f249498b, hVar.f249498b) && Intrinsics.f(this.f249499c, hVar.f249499c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f && this.f249500g == hVar.f249500g;
    }

    public final int hashCode() {
        int iHashCode = (this.f249499c.hashCode() + a10.b.d(this.f249498b, this.f249497a.hashCode() * 31, 31)) * 31;
        oel.l lVar = this.d;
        return this.f249500g.hashCode() + y.b(this.f, (this.e.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31, 31);
    }
}
