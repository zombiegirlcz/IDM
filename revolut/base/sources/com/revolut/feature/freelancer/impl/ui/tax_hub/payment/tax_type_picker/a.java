package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker;

import ang.f;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import q7b.j;
import r37.e;
import r37.g;
import r37.l;
import t37.c;
import vii.b;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements g {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a61.a f74333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f74334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f74335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f74336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f74337t;

    public a(c dialogFactory, a61.a taxHubConfigurationInteractor, f userInteractor, l stateMapper) {
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(taxHubConfigurationInteractor, "taxHubConfigurationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = dialogFactory;
        this.f74333p = taxHubConfigurationInteractor;
        this.f74334q = userInteractor;
        this.f74335r = new b();
        this.f74336s = d.b(this, new e(0), stateMapper, null, false, 12);
        this.f74337t = hx7.e.a(this, new qm2.c(this, 23));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f74335r, new j(continuation, this, 29)), null, null, new qp7.g(this, continuation, 24), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f74337t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f74336s;
    }
}
