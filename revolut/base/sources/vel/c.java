package vel;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lel.b f288349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentTicker f288350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f288351c;

    public c(lel.b index, InstrumentTicker ticker, g entry) {
        Intrinsics.checkNotNullParameter(index, "index");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f288349a = index;
        this.f288350b = ticker;
        this.f288351c = entry;
    }

    @Override // vel.f
    public final g b() {
        return this.f288351c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f288349a, cVar.f288349a) && Intrinsics.f(this.f288350b, cVar.f288350b) && Intrinsics.f(this.f288351c, cVar.f288351c);
    }

    public final int hashCode() {
        return this.f288351c.hashCode() + ((this.f288350b.hashCode() + (this.f288349a.hashCode() * 31)) * 31);
    }
}
