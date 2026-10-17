package nel;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f214560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentTicker f214561b;

    public a0(n instrument, InstrumentTicker instrumentTicker) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f214560a = instrument;
        this.f214561b = instrumentTicker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f214560a, a0Var.f214560a) && Intrinsics.f(this.f214561b, a0Var.f214561b);
    }

    public final int hashCode() {
        int iHashCode = this.f214560a.hashCode() * 31;
        InstrumentTicker instrumentTicker = this.f214561b;
        return iHashCode + (instrumentTicker == null ? 0 : instrumentTicker.hashCode());
    }
}
