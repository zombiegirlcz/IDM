package x08;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f301530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InstrumentTicker f301531c;
    public final b d;

    public d(String ref2, String ticker, InstrumentTicker instrumentTicker, b bVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        this.f301529a = ref2;
        this.f301530b = ticker;
        this.f301531c = instrumentTicker;
        this.d = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f301529a, dVar.f301529a) && Intrinsics.f(this.f301530b, dVar.f301530b) && Intrinsics.f(this.f301531c, dVar.f301531c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f301529a.hashCode() * 31, 31, this.f301530b);
        InstrumentTicker instrumentTicker = this.f301531c;
        int iHashCode = (iC + (instrumentTicker == null ? 0 : instrumentTicker.hashCode())) * 31;
        b bVar = this.d;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
