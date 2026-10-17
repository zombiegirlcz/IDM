package del;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import java.math.BigDecimal;
import kel.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ej0.b f113705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ej0.b f113706c;
    public final BigDecimal d;
    public final n e;
    public final InstrumentTicker f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ej0.b f113707g;

    public a(String symbol, ej0.b bVar, ej0.b bVar2, BigDecimal bigDecimal, n holding, InstrumentTicker instrumentTicker, ej0.b bVar3) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(holding, "holding");
        this.f113704a = symbol;
        this.f113705b = bVar;
        this.f113706c = bVar2;
        this.d = bigDecimal;
        this.e = holding;
        this.f = instrumentTicker;
        this.f113707g = bVar3;
    }

    public final dj0.d a() {
        ej0.b bVar = this.f113706c;
        if (bVar != null) {
            return mif.a.Q(bVar);
        }
        return null;
    }

    public final dj0.d b() {
        ej0.b bVar = this.f113705b;
        if (bVar != null) {
            return mif.a.Q(bVar);
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f113704a, aVar.f113704a) && Intrinsics.f(this.f113705b, aVar.f113705b) && Intrinsics.f(this.f113706c, aVar.f113706c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f113707g, aVar.f113707g);
    }

    public final int hashCode() {
        int iHashCode = this.f113704a.hashCode() * 31;
        ej0.b bVar = this.f113705b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ej0.b bVar2 = this.f113706c;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        BigDecimal bigDecimal = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31)) * 31;
        InstrumentTicker instrumentTicker = this.f;
        int iHashCode5 = (iHashCode4 + (instrumentTicker == null ? 0 : instrumentTicker.hashCode())) * 31;
        ej0.b bVar3 = this.f113707g;
        return iHashCode5 + (bVar3 != null ? bVar3.hashCode() : 0);
    }
}
