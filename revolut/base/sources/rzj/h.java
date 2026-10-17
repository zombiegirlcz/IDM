package rzj;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentTicker f258695a;

    public h(InstrumentTicker instrumentTicker) {
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        this.f258695a = instrumentTicker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f258695a, ((h) obj2).f258695a);
    }

    public final int hashCode() {
        return this.f258695a.hashCode();
    }
}
