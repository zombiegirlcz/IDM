package com.revolut.feature.rev_points.impl.ui.points_expiry.home;

import a82.n;
import cli.y;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.kompot.common.R$string;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m1c.t1;
import mra.d;
import nii.y0;
import nii.z;
import nyb.k;
import nyb.m0;
import oki.h;
import wyc.p;
import wyg.s;
import wzb.f;
import wzb.g;
import wzb.i;
import yi5.b;
import yji.l;
import zhm.h0;
import zi0.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements g {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m0 f83832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wub.a f83833q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f83834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f83835s;

    public a(wzb.k stateMapper, k revPointsInteractor, m0 revPointsTransactionsInteractor, wub.a revPointsBuyingFeatureInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(revPointsBuyingFeatureInteractor, "revPointsBuyingFeatureInteractor");
        this.o = revPointsInteractor;
        this.f83832p = revPointsTransactionsInteractor;
        this.f83833q = revPointsBuyingFeatureInteractor;
        this.f83834r = d.b(this, new f(0), stateMapper, null, false, 12);
        this.f83835s = e.a(this, new s(4));
    }

    public static final void I2(a aVar) {
        l.a1(aVar, aVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, new wkg.e(aVar, null, 27), 3);
    }

    @Override // yji.l
    public final void I1() {
        wub.a aVar = this.f83833q;
        H2(this.f83834r, new n(aVar.a(), aVar.b(), 14));
        k kVar = this.o;
        kVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jxb.l lVar = (jxb.l) kVar.f220804a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        l.a1(this, nim.a.v(rd0.e.b(c.J(lVar.f179131m.e(Boolean.FALSE, loadingStrategy))), new p(12)), new i(this, continuation, 1), null, new i(this, continuation, 2), 2);
        l2(new wr1.s(this, continuation, 14), new b(26));
        l.a1(this, rd0.e.d(rd0.e.b(m70.a.g(this.f83832p.c(new RevPointsTransactionPageParams(1, null, null, null, null, null, t1.EXPIRATION, null, null, OnfidoActivity.RESULT_EXIT_TOKEN_EXPIRED)), null, new s(3), 1)), h0.f322473a), null, null, new i(this, continuation, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f83835s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f83834r;
    }
}
