package com.revolut.feature.card_management.impl.cardagreements.screens.overview;

import ang.f;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import ez2.d;
import hx7.e;
import hy2.b;
import hz2.a0;
import hz2.j;
import hz2.k;
import hz2.o;
import hz2.w;
import hz2.x;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pre.c;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements o {
    public final CardIssuanceAgreementsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f64817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mre.c f64818q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f64819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f64820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f64821t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(n stateMapper, CardIssuanceAgreementsScreenContract$InputData inputData, c termsInteractor, mre.c termsNavigationFactory, f userInteractor, d agreementState) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(agreementState, "agreementState");
        this.o = inputData;
        this.f64817p = termsInteractor;
        this.f64818q = termsNavigationFactory;
        this.f64819r = userInteractor;
        this.f64820s = agreementState;
        this.f64821t = mra.d.b(this, new k(new Data(null, null, true, 3, null), 2), stateMapper, null, false, 12);
        this.u = e.a(this, new b(10));
    }

    @Override // yji.l
    public final void I1() {
        I2();
        l.a1(this, this.f64819r.j(w4l.h.f294642c), null, null, new x(this, null, 1), 3);
    }

    public final void I2() {
        List list;
        wi0.b bVar = this.o.f64814a;
        wi0.b.Companion.getClass();
        if (Intrinsics.f(bVar, wi0.b.M0)) {
            w.Companion.getClass();
            list = j.f156995b;
        } else {
            list = f0.f322471a;
        }
        l.a1(this, rd0.e.b(c.l(this.f64817p, bVar, null, list, 10)), null, null, new x(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        d dVar = this.f64820s;
        if (dVar.f130882a) {
            dVar.f130882a = false;
            n2(new a0(this, null, 0), new whi.b(6));
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f64821t;
    }
}
