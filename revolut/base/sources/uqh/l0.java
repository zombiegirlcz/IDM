package uqh;

import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import java.util.List;
import kl.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.t0;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 extends u {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fkg.a f282157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d9h.a f282158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g0 f282159n;
    public final x8h.m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1 f282160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qr0.i f282161q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vki.a f282162r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f282163s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f282164t;
    public final j2 u;
    public final j2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f282165w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f282166x;

    public l0(fkg.a screenerInstrumentProvider, d9h.a performanceProvider, g0 searchProvider, x8h.m etpProductAvailabilityInteractor, t1 groupProvider, qr0.i screenerDisclaimersProvider) {
        Intrinsics.checkNotNullParameter(screenerInstrumentProvider, "screenerInstrumentProvider");
        Intrinsics.checkNotNullParameter(performanceProvider, "performanceProvider");
        Intrinsics.checkNotNullParameter(searchProvider, "searchProvider");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(groupProvider, "groupProvider");
        Intrinsics.checkNotNullParameter(screenerDisclaimersProvider, "screenerDisclaimersProvider");
        this.f282157l = screenerInstrumentProvider;
        this.f282158m = performanceProvider;
        this.f282159n = searchProvider;
        this.o = etpProductAvailabilityInteractor;
        this.f282160p = groupProvider;
        this.f282161q = screenerDisclaimersProvider;
        vki.a aVarA = pyd.c.a(this, new z(null, 1023));
        this.f282162r = aVarA;
        this.f282163s = new vii.b();
        this.f282164t = vkm.q.c(((z) ((j2) aVarA.f22677a).getValue()).f282183a);
        this.u = vkm.q.c(null);
        this.v = vkm.q.c(null);
    }

    @Override // yji.n
    public final void D2() {
        yji.n.j2(this, this.o.a(), null, new rf9.h(this, (Continuation) null, 11), 3);
    }

    @Override // yji.n
    public final void H2() {
        Continuation continuation = null;
        j0 j0Var = new j0(2, continuation, this);
        j2 j2Var = this.f282164t;
        yji.n.l2(this, j2Var, null, j0Var, 3);
        yji.n.l2(this, vkm.q.Q(vkm.q.q(yh5.b.e(new t0(j2Var, 1), this.u, this.f282163s)), new h0(1, continuation, this)), null, new j0(3, continuation, this), 3);
        upc.b bVar = new upc.b(20);
        vki.a aVar = this.f282162r;
        yji.n.l2(this, rd0.e.n(boh.f.e(new t0(aVar.B(bVar), 1), new f0(this, 0)), zhm.h0.f322473a), null, new j0(4, continuation, this), 3);
        yji.n.l2(this, new tse.c(yh5.b.d(new t0(aVar.B(new upc.b(21)), 1), this.v), this, 24), null, new j0(5, continuation, this), 3);
        t1 t1Var = this.f282160p;
        yji.n.l2(this, nim.a.v(((aoh.a) t1Var.f185240b).a(), new ml3.y(t1Var, 29)), null, new j0(1, continuation, this), 3);
        int i = 0;
        yji.n.l2(this, vkm.q.Q(vkm.q.q(new t0(new tnb.k(j2Var, 11), 1)), new h0(i, continuation, this)), null, new j0(i, continuation, this), 3);
    }

    @Override // uqh.u
    public final void Z2(boolean z) {
        this.f282165w = z;
    }

    @Override // uqh.u
    public final void b3(ScreenerSelectedSorting sorting) {
        Intrinsics.checkNotNullParameter(sorting, "sorting");
        this.f282166x = true;
        e3(sorting);
    }

    @Override // uqh.u
    public final void c3(int i, List filters, zel.f instrumentGroup) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        t tVar = new t(i, filters, instrumentGroup);
        j2 j2Var = this.f282164t;
        j2Var.getClass();
        j2Var.g(null, tVar);
    }

    @Override // uqh.u
    public final void e3(ScreenerSelectedSorting screenerSelectedSorting) {
        if (screenerSelectedSorting != null) {
            j2 j2Var = this.u;
            j2Var.getClass();
            j2Var.g(null, screenerSelectedSorting);
            X2(this.f282162r, new um7.d(screenerSelectedSorting, 20));
        }
    }

    public final void f3() {
        t tVar = ((z) ((j2) this.f282162r.f22677a).getValue()).f282183a;
        if (tVar == null) {
            return;
        }
        N2(new ScreenerAllFiltersFlow(new ScreenerAllFiltersFlowContract$InputData(tVar.f282175a, tVar.f282176b, this.f282165w ? xoh.k.WITH_TABS : xoh.k.NO_TABS)), ModalDestination.Style.POPUP.f98311a, new uif.d(tVar, this, 16));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f282162r;
    }
}
