package k5e;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import jel.v2;
import kotlin.jvm.internal.Intrinsics;
import mel.j0;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2 f181479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f181480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InstrumentTicker f181481c;

    public f(v2 info, j0 suggestion, InstrumentTicker instrumentTicker) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        this.f181479a = info;
        this.f181480b = suggestion;
        this.f181481c = instrumentTicker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f181479a, fVar.f181479a) && this.f181480b == fVar.f181480b && Intrinsics.f(this.f181481c, fVar.f181481c);
    }

    public final int hashCode() {
        int iHashCode = (this.f181480b.hashCode() + (this.f181479a.hashCode() * 31)) * 31;
        InstrumentTicker instrumentTicker = this.f181481c;
        return iHashCode + (instrumentTicker == null ? 0 : instrumentTicker.hashCode());
    }
}
