package oph;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page.ScreenerCollectionsPageContract$InputData;
import d9.e1;
import k50.b2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends oki.h implements dli.b {
    public final ugl.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final toh.c f227672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x8h.m f227673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qr0.i f227674r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f227675s;

    public m(ScreenerCollectionsPageContract$InputData inputData, o stateMapper, ugl.c screenerInteractor, toh.c collectionAvatarRefsProvider, x8h.m etpProductAvailabilityInteractor, qr0.i screenerDisclaimersProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        Intrinsics.checkNotNullParameter(collectionAvatarRefsProvider, "collectionAvatarRefsProvider");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(screenerDisclaimersProvider, "screenerDisclaimersProvider");
        this.o = screenerInteractor;
        this.f227672p = collectionAvatarRefsProvider;
        this.f227673q = etpProductAvailabilityInteractor;
        this.f227674r = screenerDisclaimersProvider;
        this.f227675s = mra.d.b(this, new a(inputData.f96205a, new Data(null, null, true, 3, null), true, null, new Data(r0.g(), null, false, 6, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, nim.a.v(((z0h.d) this.f227674r.f248595b).w0(), new tlf.n(22)), null, null, new l(this, continuation, 0), 3);
        yji.l.a1(this, this.f227673q.a(), null, null, new jkh.g(this, continuation, 21), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        v1 v1VarN = e1.N(new b2(2, this, m.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 18), ((yhl.f) this.o).c(w4l.h.f294642c));
        Continuation continuation = null;
        yji.l.b1(this, v1VarN, null, new l(this, continuation, 1), 3);
        yji.l.b1(this, boh.f.e(v1VarN, new ok7.c(this, 28)), null, new l(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f227675s;
    }
}
