package com.revolut.feature.store.impl.ui.search;

import cli.g;
import cli.n;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import g2e.b;
import g2e.l;
import g2e.r;
import hx7.e;
import java.util.List;
import jwb.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import qij.s;
import r3e.k;
import r3e.m;
import skm.a2;
import vkm.j2;
import vkm.q;
import wli.x;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements k {
    public final l2e.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f88735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f88736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wn.a f88737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2 f88738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f88739t;
    public List u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f88740w;

    public a(n stateMapper, l2e.a storeBrandsInteractor, b filtersStateRepository, x deeplinkHandler, wn.a adsTrackingControllerModelExtension, svb.a revPointsGiftcardsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(storeBrandsInteractor, "storeBrandsInteractor");
        Intrinsics.checkNotNullParameter(filtersStateRepository, "filtersStateRepository");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsFeatureInteractor, "revPointsGiftcardsFeatureInteractor");
        this.o = storeBrandsInteractor;
        this.f88735p = filtersStateRepository;
        this.f88736q = deeplinkHandler;
        this.f88737r = adsTrackingControllerModelExtension;
        this.f88738s = q.c("");
        this.u = f0.f322471a;
        this.v = d.b(this, new r3e.h(((c) revPointsGiftcardsFeatureInteractor).a(), 3), stateMapper, null, false, 12);
        this.f88740w = e.a(this, new qm2.c(this, 25));
    }

    public final void I2(String str, w4l.k loadingStrategy) {
        a2 a2Var = this.f88739t;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        Integer num = str != null ? 5 : null;
        t1e.f0 params = new t1e.f0(num, str);
        l2e.a aVar = this.o;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVar = aVar.f191789a;
        l params2 = new l(1, str, num);
        rVar.getClass();
        Intrinsics.checkNotNullParameter(params2, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        this.f88739t = yji.l.b1(this, rVar.i.b(new l(rVar.e.z(), params2.f140006b, params2.f140007c), loadingStrategy), null, new m(this, continuation, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f88740w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.q(new s(t1.d(this.f88738s, 300L), 2)), null, new m(this, continuation, 1), 3);
        yji.l.b1(this, this.o.b(w4l.h.f294642c), null, new m(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
