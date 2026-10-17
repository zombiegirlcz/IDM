package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites;

import cli.g;
import cli.y;
import efm.r;
import i9g.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m2f.b0;
import ma1.v;
import mcg.f;
import mcg.k;
import mcg.m;
import oki.h;
import rd0.e;
import rp0.g1;
import rp0.k1;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends h implements mcg.h {
    public final u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f93923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dyb.a f93924q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a29.b f93925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f93926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f93927t;

    public d(m stateMapper, u travelHotelsFavoritesInteractor, g1 shotDialogDisplayer, dyb.a revPointsKycCheckExtension, a29.b lifestyleBorderlessFooterFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(travelHotelsFavoritesInteractor, "travelHotelsFavoritesInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(revPointsKycCheckExtension, "revPointsKycCheckExtension");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooterFactory, "lifestyleBorderlessFooterFactory");
        this.o = travelHotelsFavoritesInteractor;
        this.f93923p = shotDialogDisplayer;
        this.f93924q = revPointsKycCheckExtension;
        this.f93925r = lifestyleBorderlessFooterFactory;
        this.f93926s = mra.d.b(this, new f(0), stateMapper, null, false, 12);
        this.f93927t = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f93927t, new li2.f(continuation, this, 26)), null, null, new k(this, null, 0), 3);
        r rVarFilter = ((k1) this.f93923p).d.filter(new v(19, new m9l.d(27)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        l.a1(this, e.b(rVarFilter), null, null, new b0(this, continuation, 16), 3);
        l.a1(this, ((x29.b) this.f93925r).a(), null, null, new k(this, null, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f93926s;
    }
}
