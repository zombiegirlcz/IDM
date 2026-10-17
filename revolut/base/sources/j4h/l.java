package j4h;

import com.google.crypto.tink.shaded.protobuf.t1;
import iyg.b0;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import vkm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends y50.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f171390m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zhl.k f171391n;
    public final ybl.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f171392p;

    public l(p stateMapper, zhl.k instrumentHistoricalPricesInteractor, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(instrumentHistoricalPricesInteractor, "instrumentHistoricalPricesInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f171390m = stateMapper;
        this.f171391n = instrumentHistoricalPricesInteractor;
        this.o = instrumentTickerInteractor;
        this.f171392p = yhm.j.b(new iv0.p(this, 13));
    }

    @Override // yji.n
    public final void H2() {
        yji.n.l2(this, t1.e(nim.a.v(this.f171391n.e(q.q(new b0(d3().B(new y4b.b(14)), 1)), new go.g(eel.i.PRICE, 2), ((h) c3().f310975b).f171388c, vgl.b.TICKER_PERIODICALLY), new j3f.d(7)), new j3f.d(8)), null, new j(this, null), 3);
        yji.n.l2(this, ((ael.k) this.o).g(((h) c3().f310975b).f171388c), null, new k(this, null), 3);
    }

    @Override // y50.d
    public final y50.a Z2() {
        return new fn2.c(this);
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.f171392p.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        rlm.b bVar = Json.d;
        bVar.getClass();
        return (h) bVar.b(h.Companion.serializer(), rawData);
    }
}
