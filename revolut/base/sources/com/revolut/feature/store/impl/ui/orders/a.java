package com.revolut.feature.store.impl.ui.orders;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import jwb.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kye.e;
import l0c.v;
import l3e.f;
import l3e.m;
import l3e.n;
import l3e.o;
import mra.d;
import oki.h;
import vii.b;
import vkm.q;
import wkm.l;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements f {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jwb.e f88709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final svb.a f88710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l80.e f88711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f88712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f88713t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(o stateMapper, e storeExclusivesInteractor, jwb.e revPointsGiftcardsInteractor, svb.a revPointsGiftcardsFeatureInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(storeExclusivesInteractor, "storeExclusivesInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsFeatureInteractor, "revPointsGiftcardsFeatureInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = storeExclusivesInteractor;
        this.f88709p = revPointsGiftcardsInteractor;
        this.f88710q = revPointsGiftcardsFeatureInteractor;
        this.f88711r = dateProvider;
        w4l.h hVar = w4l.h.f294642c;
        this.f88712s = new b(hVar);
        this.f88713t = new b(hVar);
        this.u = d.b(this, new l3e.a(((c) revPointsGiftcardsFeatureInteractor).a() ? new Data(null, null, true, 3, null) : null, 5), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new v(this, 4));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l lVarQ = q.Q(this.f88712s, new m(1, this, continuation));
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(lVarQ, h0Var), null, null, new n(1, this, continuation), 3);
        if (((c) this.f88710q).a()) {
            yji.l.a1(this, rd0.e.n(q.Q(this.f88713t, new m(0, this, continuation)), h0Var), null, null, new n(0, this, continuation), 3);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        this.f88712s.a();
        if (((c) this.f88710q).a()) {
            this.f88713t.a();
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
