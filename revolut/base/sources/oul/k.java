package oul;

import com.revolut.data.model.Data;
import com.revolut.trading.orders.ui.invest.placement.models.TargetPriceInputValue;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f229905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f229906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TargetPriceInputValue f229907c;
    public final boolean d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f229908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f229909h;

    public k(bfl.g tradeSide, r0 orderType, TargetPriceInputValue inputValue, boolean z, Data validation, Data instrument, Data instrumentTicker, Data ipoInstrumentSummary) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(validation, "validation");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(ipoInstrumentSummary, "ipoInstrumentSummary");
        this.f229905a = tradeSide;
        this.f229906b = orderType;
        this.f229907c = inputValue;
        this.d = z;
        this.e = validation;
        this.f = instrument;
        this.f229908g = instrumentTicker;
        this.f229909h = ipoInstrumentSummary;
    }

    public static k a(k kVar, TargetPriceInputValue targetPriceInputValue, Data data, Data data2, Data data3, Data data4, int i) {
        bfl.g tradeSide = kVar.f229905a;
        r0 orderType = kVar.f229906b;
        if ((i & 4) != 0) {
            targetPriceInputValue = kVar.f229907c;
        }
        TargetPriceInputValue inputValue = targetPriceInputValue;
        boolean z = (i & 8) != 0 ? kVar.d : false;
        if ((i & 16) != 0) {
            data = kVar.e;
        }
        Data validation = data;
        if ((i & 32) != 0) {
            data2 = kVar.f;
        }
        Data instrument = data2;
        if ((i & 64) != 0) {
            data3 = kVar.f229908g;
        }
        Data instrumentTicker = data3;
        if ((i & 128) != 0) {
            data4 = kVar.f229909h;
        }
        Data ipoInstrumentSummary = data4;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(validation, "validation");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(ipoInstrumentSummary, "ipoInstrumentSummary");
        return new k(tradeSide, orderType, inputValue, z, validation, instrument, instrumentTicker, ipoInstrumentSummary);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f229905a == kVar.f229905a && this.f229906b == kVar.f229906b && Intrinsics.f(this.f229907c, kVar.f229907c) && this.d == kVar.d && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f229908g, kVar.f229908g) && Intrinsics.f(this.f229909h, kVar.f229909h);
    }

    public final int hashCode() {
        return this.f229909h.hashCode() + kii.e.c(this.f229908g, kii.e.c(this.f, kii.e.c(this.e, j6.a.c((this.f229907c.hashCode() + com.revolut.data.database.models.openbanking.d.f(this.f229906b, this.f229905a.hashCode() * 31, 31)) * 31, 31, this.d), 31), 31), 31);
    }
}
