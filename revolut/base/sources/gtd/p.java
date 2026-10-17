package gtd;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends oki.h implements dli.b {
    public final r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f0j.a f146592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n8b.a f146593q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ktd.c f146594r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fod.k f146595s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l80.e f146596t;
    public final y u;
    public final z1 v;

    public p(cli.n stateMapper, r travelNavigator, f0j.a travelInteractor, n8b.a countryInteractor, ktd.c travelToolsProvider, fod.k tripAnalyticsProvider, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(travelNavigator, "travelNavigator");
        Intrinsics.checkNotNullParameter(travelInteractor, "travelInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(travelToolsProvider, "travelToolsProvider");
        Intrinsics.checkNotNullParameter(tripAnalyticsProvider, "tripAnalyticsProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = travelNavigator;
        this.f146592p = travelInteractor;
        this.f146593q = countryInteractor;
        this.f146594r = travelToolsProvider;
        this.f146595s = tripAnalyticsProvider;
        this.f146596t = dateProvider;
        this.u = mra.d.b(this, new b(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.v = z1VarB;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.v, new g6f.l(continuation, this, 16)), null, new gii.b(this, continuation, 25), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
