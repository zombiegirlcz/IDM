package isl;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jel.c f168308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentTicker f168309b;

    public e(jel.c instrumentDetails, InstrumentTicker ticker) {
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        this.f168308a = instrumentDetails;
        this.f168309b = ticker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f168308a, eVar.f168308a) && Intrinsics.f(this.f168309b, eVar.f168309b);
    }

    public final int hashCode() {
        return this.f168309b.hashCode() + (this.f168308a.hashCode() * 31);
    }
}
