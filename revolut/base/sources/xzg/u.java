package xzg;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f310033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nel.n f310034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InstrumentTicker f310035c;

    public u(a0 entry, nel.n instrument, InstrumentTicker instrumentTicker) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f310033a = entry;
        this.f310034b = instrument;
        this.f310035c = instrumentTicker;
    }

    @Override // xzg.v
    public final a0 a() {
        return this.f310033a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f310033a, uVar.f310033a) && Intrinsics.f(this.f310034b, uVar.f310034b) && Intrinsics.f(this.f310035c, uVar.f310035c);
    }

    public final int hashCode() {
        int iD = a10.b.d(this.f310034b, this.f310033a.hashCode() * 31, 31);
        InstrumentTicker instrumentTicker = this.f310035c;
        return iD + (instrumentTicker == null ? 0 : instrumentTicker.hashCode());
    }
}
