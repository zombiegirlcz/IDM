package tqh;

import klf.w1;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import th9.t;
import tpl.o;
import vkm.q;
import vkm.t0;
import vkm.y;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends y50.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fkg.a f273586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d9h.a f273587n;
    public final x8h.m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ooh.d f273588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f273589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f273590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f273591s;

    public i(fkg.a screenerInstrumentProvider, d9h.a performanceProvider, x8h.m etpProductAvailabilityInteractor, ooh.d screenerInstrumentGroupMapper, g mapper) {
        Intrinsics.checkNotNullParameter(screenerInstrumentProvider, "screenerInstrumentProvider");
        Intrinsics.checkNotNullParameter(performanceProvider, "performanceProvider");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(screenerInstrumentGroupMapper, "screenerInstrumentGroupMapper");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f273586m = screenerInstrumentProvider;
        this.f273587n = performanceProvider;
        this.o = etpProductAvailabilityInteractor;
        this.f273588p = screenerInstrumentGroupMapper;
        this.f273589q = mapper;
        this.f273590r = q.b(1, 5, null);
        this.f273591s = yhm.j.b(new t(this, 14));
    }

    @Override // yji.n
    public final void H2() {
        e eVar = (e) c3().f310975b;
        Continuation continuation = null;
        yji.n.l2(this, this.o.a(), null, new rf9.h(this, continuation, 7), 3);
        wkm.l lVarQ = q.Q(new y(new w1(2, 25, continuation), this.f273590r), new sdi.a(continuation, this, eVar, 10));
        yji.n.l2(this, lVarQ, null, new h(this, null, 0), 3);
        yji.n.l2(this, rd0.e.n(boh.f.e(new t0(lVarQ, 1), new o(this, 4)), h0.f322473a), null, new h(this, null, 1), 3);
    }

    @Override // y50.d
    public final y50.a Z2() {
        return new n(this);
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.f273591s.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Object objC = new kg.o().c(rawData, e.class);
        Intrinsics.checkNotNullExpressionValue(objC, "fromJson(...)");
        return (e) objC;
    }
}
