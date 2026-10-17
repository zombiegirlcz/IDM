package com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kxk.o;
import l80.e;
import mra.d;
import oki.h;
import r10.f;
import tp8.l;
import u37.g;
import u37.k;
import u37.r;
import u37.v;
import vkm.q;
import w37.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements k {
    public final a61.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f74345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zjh.f f74346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f74347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f74348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v f74349t;
    public final e u;
    public final TaxHubCreateProfileScreenContract$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f74350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f74351x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f74352y;

    public a(a61.a taxConfigInteractor, f taxProfileInteractor, zjh.f taxAuthorityInteractor, ang.f userInteractor, b taxPeriodClauseFactory, v profileItemsFactory, e dateProvider, TaxHubCreateProfileScreenContract$InputData inputData, o stateMapper) {
        Intrinsics.checkNotNullParameter(taxConfigInteractor, "taxConfigInteractor");
        Intrinsics.checkNotNullParameter(taxProfileInteractor, "taxProfileInteractor");
        Intrinsics.checkNotNullParameter(taxAuthorityInteractor, "taxAuthorityInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(taxPeriodClauseFactory, "taxPeriodClauseFactory");
        Intrinsics.checkNotNullParameter(profileItemsFactory, "profileItemsFactory");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = taxConfigInteractor;
        this.f74345p = taxProfileInteractor;
        this.f74346q = taxAuthorityInteractor;
        this.f74347r = userInteractor;
        this.f74348s = taxPeriodClauseFactory;
        this.f74349t = profileItemsFactory;
        this.u = dateProvider;
        this.v = inputData;
        this.f74350w = new vii.b();
        this.f74351x = d.b(this, new g(0), stateMapper, null, false, 12);
        this.f74352y = hx7.e.a(this, new l(this, 25));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f74350w, new tik.b(continuation, this, 20)), null, null, new r(this, continuation, 0), 3);
        yji.l.a1(this, nim.a.v(this.f74346q.x(this.v.f74340c, w4l.h.f294642c), new u21.b(19)), null, null, new r(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f74352y;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f74351x;
    }
}
