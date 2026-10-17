package yr5;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends y50.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f316143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f61.a f316144n;
    public final xv5.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o9j.b f316145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f316146q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f316147r;

    public n(q stateMapper, f61.a ratesPlotInteractor, xv5.c baseCurrencyInteractor, o9j.b assetDetailsChartMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(ratesPlotInteractor, "ratesPlotInteractor");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(assetDetailsChartMapper, "assetDetailsChartMapper");
        this.f316143m = stateMapper;
        this.f316144n = ratesPlotInteractor;
        this.o = baseCurrencyInteractor;
        this.f316145p = assetDetailsChartMapper;
        this.f316146q = new vii.b();
        this.f316147r = yhm.j.b(new yq0.e(this, 4));
    }

    @Override // yji.n
    public final void H2() {
        if (((f) ((j2) d3().f22677a).getValue()).f316133b == null) {
            f3(new yo7.p(this, 12));
        }
        Continuation continuation = null;
        j jVar = new j(continuation, this, 0);
        vii.b bVar = this.f316146q;
        yji.n.l2(this, vkm.q.Q(bVar, jVar), null, new k(this, null), 3);
        yji.n.l2(this, vkm.q.Q(vkm.q.Q(bVar, new j(continuation, this, 1)), new j(continuation, this, 2)), null, new l(this, null), 3);
    }

    @Override // y50.d
    public final y50.a Z2() {
        return new e(this);
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.f316147r.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Json jsonA = af0.b.a();
        jsonA.getClass();
        return (i) jsonA.b(i.Companion.serializer(), rawData);
    }
}
