package nnh;

import com.revolut.shared.feature.wealth.models.screener.ScreenerInstrument;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerInstrument f217681a;

    public b(ScreenerInstrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f217681a = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f217681a, ((b) obj2).f217681a);
    }

    public final int hashCode() {
        return this.f217681a.hashCode();
    }
}
