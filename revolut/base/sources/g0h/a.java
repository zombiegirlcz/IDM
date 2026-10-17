package g0h;

import com.revolut.shared.feature.wealth.models.screener.ScreenerInstrument;
import kotlin.jvm.internal.Intrinsics;
import vel.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerInstrument f139492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f139493b;

    public a(ScreenerInstrument instrument, f performanceAsset) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
        this.f139492a = instrument;
        this.f139493b = performanceAsset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f139492a, aVar.f139492a) && Intrinsics.f(this.f139493b, aVar.f139493b);
    }

    public final int hashCode() {
        return this.f139493b.hashCode() + (this.f139492a.hashCode() * 31);
    }
}
